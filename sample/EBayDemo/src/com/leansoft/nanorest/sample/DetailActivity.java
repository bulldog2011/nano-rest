package com.leansoft.nanorest.sample;

import java.util.ArrayList;

import com.ebay.shopping.ShoppingService;
import com.ebay.trading.TradingService;
import com.ebay.util.eBayUtil;
import com.github.droidfu.widgets.WebImageView;
import com.leansoft.nano.custom.types.Duration;
import com.leansoft.nanorest.RequestProcessor;
import com.leansoft.nanorest.callback.HttpCallback;
import com.leansoft.nanorest.domain.ResponseStatus;
import com.leansoft.nanorest.logger.ALog;

import ebay.apis.eblbasecomponents.AckCodeType;
import ebay.apis.eblbasecomponents.AddToWatchListRequestType;
import ebay.apis.eblbasecomponents.AddToWatchListResponseType;
import ebay.apis.eblbasecomponents.BuyerPaymentMethodCodeType;
import ebay.apis.eblbasecomponents.GetSingleItemRequestType;
import ebay.apis.eblbasecomponents.GetSingleItemResponseType;
import ebay.apis.eblbasecomponents.ListingTypeCodeType;
import ebay.apis.eblbasecomponents.SimpleItemType;
import android.net.Uri;
import android.os.Bundle;
import android.text.Html;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Intent;
import android.graphics.Color;
import android.view.View;
import android.view.View.OnClickListener;

public class DetailActivity extends Activity {
	
	private static final String TAG = DetailActivity.class
			.getSimpleName();
	
	private ProgressDialog progressDialog;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.item_detail);
		
		String itemId = getIntent().getStringExtra("ITEM_ID");
		this.getSingleItem(itemId);
	}
	
	// call Shopping GetSingleItem API
	private void getSingleItem(final String itemId) {
		
    	progressDialog = ProgressDialog.show(DetailActivity.this,
        		"Please wait...", "Retrieving data...", true, true);
		
		GetSingleItemRequestType request = new GetSingleItemRequestType();
		request.setItemID(itemId);
		request.setIncludeSelector("Details,ShippingCosts");
		
		RequestProcessor requestProcessor = ShoppingService.getSingleItemHttpRequest(
				request, 
				new GetSingleItemCallback(),
				ConfigFactory.getShoppingConfig());
		requestProcessor.invokeAsync(this.getApplicationContext());
	}
	
	private final class GetSingleItemCallback implements HttpCallback<GetSingleItemResponseType> {

		@Override
		public void onSuccess(GetSingleItemResponseType responseData) {
			
    		if (progressDialog != null) {
    			progressDialog.dismiss();
    			progressDialog = null;
    		}
			
    		// need more error handling logic in real app
			if (responseData.getAck() != AckCodeType.FAILURE) {
	            SimpleItemType item = responseData.getItem();
	            
	            DetailActivity.this.updateUI(item);
	            
			} else {
				String errorMessage = responseData.getErrors().get(0).getLongMessage();
				ALog.e(TAG, errorMessage);
	            Toast.makeText(getApplicationContext(),
	            		errorMessage,
	                    Toast.LENGTH_LONG).show();
			}
			
		}
		
		@Override
		public void onHttpError(ResponseStatus responseStatus) {
			
    		if (progressDialog != null) {
    			progressDialog.dismiss();
    			progressDialog = null;
    		}
			
			// handle HTTP error
			String errorMessage = responseStatus.getStatusCode() + " " + responseStatus.getStatusMessage();
			ALog.e(TAG, errorMessage);
			
            Toast.makeText(getApplicationContext(),
                    errorMessage,
                    Toast.LENGTH_LONG).show();
			
		}
		
	}
	
	// call Trading AddToWatchList API
	private void addToWatchList(final String itemId) {
    	progressDialog = ProgressDialog.show(DetailActivity.this,
        		"Please wait...", "Adding to watch...", true, true);
    	
    	AddToWatchListRequestType request = new AddToWatchListRequestType();
    	
    	request.setItemID(new ArrayList<String>());
    	request.getItemID().add(itemId);
    	
    	RequestProcessor requestProcessor = TradingService.addToWatchListHttpRequest(
    			request, 
    			new AddToWatchListCallback(itemId),
    			ConfigFactory.getTradingConfig());
    	requestProcessor.invokeAsync(this.getApplicationContext());
	}
	
	private final class AddToWatchListCallback implements HttpCallback<AddToWatchListResponseType> {
		
		private String itemId;
		
		public AddToWatchListCallback(String itemId) {
			this.itemId = itemId;
		}

		@Override
		public void onHttpError(ResponseStatus responseStatus) {
    		if (progressDialog != null) {
    			progressDialog.dismiss();
    			progressDialog = null;
    		}
			
			// handle HTTP error
			String errorMessage = responseStatus.getStatusCode() + " " + responseStatus.getStatusMessage();
			ALog.e(TAG, errorMessage);
			
            Toast.makeText(getApplicationContext(),
                    errorMessage,
                    Toast.LENGTH_LONG).show();
		}

		@Override
		public void onSuccess(AddToWatchListResponseType responseData) {
    		if (progressDialog != null) {
    			progressDialog.dismiss();
    			progressDialog = null;
    		}
			
    		// need more error handling logic in real app
			if (responseData.getAck() != AckCodeType.FAILURE) { 
	            Toast.makeText(getApplicationContext(),
	            		"Item " + itemId + " was added to watch list successfully",
	                    Toast.LENGTH_LONG).show();
			} else {
				String errorMessage = responseData.getErrors().get(0).getLongMessage();
				ALog.e(TAG, errorMessage);
	            Toast.makeText(getApplicationContext(),
	            		errorMessage,
	                    Toast.LENGTH_LONG).show();
			}
		}
		
	}
	
	private void updateUI(final SimpleItemType item) {
		
		// item title
		TextView titleView = (TextView) findViewById(R.id.detail_title);
		titleView.setText(item.getTitle());
		
		// item image
		WebImageView image = (WebImageView) findViewById(R.id.detail_image);
		if (item.getPictureURL() != null && item.getPictureURL().size() > 0) {
			image.setImageUrl(item.getPictureURL().get(0));
			image.loadImage();
		} else {
			image.setNoImageDrawable(R.drawable.placeholder);
		}
		image.setVisibility(View.VISIBLE);
		
		// item id
		TextView itemIdView = (TextView) findViewById(R.id.detail_itemid);
		itemIdView.setText(Html.fromHtml("<b>Item ID:</b>&nbsp;&nbsp;"
				+ item.getItemID()));
		
		// start time
		TextView startTimeView = (TextView) findViewById(R.id.detail_starttime);
		startTimeView.setText(Html.fromHtml("<b>Start Time:</b>&nbsp;&nbsp;"
				+ item.getStartTime().toLocaleString()));

		// end time
		TextView endTimeView = (TextView) findViewById(R.id.detail_endtime);
		endTimeView.setText(Html.fromHtml("<b>End Time:</b>&nbsp;&nbsp;"
				+ item.getEndTime().toLocaleString()));

		// condition
		TextView conditionView = (TextView) findViewById(R.id.detail_condition);
		String conditionDisplayName = "NA";
		if (item.getConditionDisplayName() != null) {
			conditionDisplayName = item.getConditionDisplayName();
		}
		conditionView.setText(Html.fromHtml("<b>Condition:</b>&nbsp;&nbsp;"
				+ conditionDisplayName));
		
		// item price
		TextView priceView = (TextView) findViewById(R.id.detail_price);
		String currencyStr = (item.getConvertedCurrentPrice().getCurrencyID() == null ? ""
				: item.getConvertedCurrentPrice().getCurrencyID().name());
		String Price = "";
		if (item.getListingType() == ListingTypeCodeType.FIXED_PRICE_ITEM
				|| item.getListingType() == ListingTypeCodeType.STORES_FIXED_PRICE) {
			Price = "Buy It Now";
		} else {
			Price = "Current Bid";
		}
		priceView.setText(Html.fromHtml("<b>"
				+ Price
				+ ":</b>&nbsp;&nbsp;"
				+ eBayUtil.formatCurrencyToString(
						item.getConvertedCurrentPrice().getValue(), currencyStr)));
		
		// shipping cost
		String shippingCost = "NA";
		if (item.getShippingCostSummary() != null
				&& item.getShippingCostSummary().getShippingServiceCost() != null) {
			currencyStr = (item.getShippingCostSummary().getShippingServiceCost().getCurrencyID() == null ? ""
					: item.getShippingCostSummary().getShippingServiceCost().getCurrencyID()
							.name());
			shippingCost = eBayUtil.formatCurrencyToString(
					item.getShippingCostSummary().getShippingServiceCost().getValue(),
					currencyStr);
		}
		TextView shippingCostView = (TextView) findViewById(R.id.detail_shipping);
		shippingCostView.setText(Html
				.fromHtml("<b>Shipping Cost:</b>&nbsp;&nbsp;" + shippingCost));

		// item location
		TextView locationView = (TextView) findViewById(R.id.detail_location);
		locationView.setText(Html.fromHtml("<b>Location</b>&nbsp;&nbsp;"
				+ item.getLocation()));

		// listing type
		TextView listingTypeView = (TextView) findViewById(R.id.detail_listingtype);
		listingTypeView
				.setText(Html.fromHtml("<b>Listing Type:</b>&nbsp;&nbsp;"
						+ item.getListingType()));
		
		// time left
		TextView timeLeftView = (TextView) findViewById(R.id.detail_timeleft);
		Duration duration = item.getTimeLeft();
		if (duration.getDays() == 0 && duration.getHours() == 0
				&& duration.getMinutes() < 10) {
			timeLeftView.setTextColor(Color.RED);
		} else {
			timeLeftView.setTextColor(Color.BLACK);
		}

		timeLeftView.setText(Html.fromHtml("<b>Time Left:</b>&nbsp;&nbsp;"
				+ eBayUtil.formatDuration(item.getTimeLeft())));
		
		// payment method
		TextView paymentView = (TextView) findViewById(R.id.detail_payment);
		String payments = "";
		for (BuyerPaymentMethodCodeType payment : item.getPaymentMethods()) {
			payments += "," + payment;
		}
		payments = payments.replaceFirst(",", "");
		paymentView.setText(Html.fromHtml("<b>Payment Method:</b>&nbsp;&nbsp;"
				+ payments));
		
		// view on eBay
		Button viewBtn = (Button) findViewById(R.id.btn_view);
		viewBtn.setOnClickListener(new ViewOneBayListener(
				item.getViewItemURLForNaturalSearch()));
		viewBtn.setVisibility(View.VISIBLE);
		
		// watch item
		final Button watchBtn = (Button) findViewById(R.id.btn_watch);
		watchBtn.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				addToWatchList(item.getItemID());
			}
			
		});
		watchBtn.setVisibility(View.VISIBLE);
	}

	// view item on eBay moile web
	private class ViewOneBayListener implements View.OnClickListener {
		
		private String itemUrl;
		
		public ViewOneBayListener(String itemUrl) {
			this.itemUrl = itemUrl;
		}
		
		@Override
		public void onClick(View arg0) {
			Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(itemUrl));
			startActivity(browserIntent);
		
		}
		
	}

}
