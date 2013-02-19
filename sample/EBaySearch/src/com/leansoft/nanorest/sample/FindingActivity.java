package com.leansoft.nanorest.sample;

import java.util.ArrayList;
import java.util.List;

import com.ebay.finding.FindingService;
import com.ebay.finding.FindingUtil;
import com.ebay.marketplace.search.v1.services.AckValue;
import com.ebay.marketplace.search.v1.services.Amount;
import com.ebay.marketplace.search.v1.services.FindItemsByKeywordsRequest;
import com.ebay.marketplace.search.v1.services.FindItemsByKeywordsResponse;
import com.ebay.marketplace.search.v1.services.ItemFilter;
import com.ebay.marketplace.search.v1.services.ItemFilterType;
import com.ebay.marketplace.search.v1.services.PaginationInput;
import com.ebay.marketplace.search.v1.services.SearchItem;
import com.ebay.marketplace.search.v1.services.SearchResult;
import com.github.droidfu.widgets.WebImageView;
import com.leansoft.nano.custom.types.Duration;
import com.leansoft.nanorest.RequestProcessor;
import com.leansoft.nanorest.callback.HttpCallback;
import com.leansoft.nanorest.domain.ResponseStatus;
import com.leansoft.nanorest.logger.ALog;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.AbsListView.OnScrollListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import android.app.ListActivity;
import android.app.ProgressDialog;
import android.content.Context;
import android.graphics.Color;

public class FindingActivity extends ListActivity implements OnScrollListener {
	
	private static final String TAG = FindingActivity.class
			.getSimpleName();

	
	static final int DEFAULT_ENTRIES_PER_PAGE = 7;
	
	private int lastItem = 0;
	private int totalItemCount = 0;
	
	private String searchKeywords;
	
	private ProgressDialog progressDialog;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		this.getListView().setOnScrollListener(this);
		
		Button searchButton = (Button) findViewById(R.id.btn_search);
		searchButton.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				String keywords = ((EditText) findViewById(R.id.edit_input))
						.getText().toString();
				// validation
				if (keywords == null | keywords.length() == 0) {
		            Toast.makeText(getApplicationContext(),
		                    "please enter keyword first!",
		                    Toast.LENGTH_LONG).show();
		            return;
				}
				
				searchKeywords = keywords;
				
				// make a search
				findItemsByKeywords(1, DEFAULT_ENTRIES_PER_PAGE, true);
			}
		});
		
	}


	// asynchronously trigger findItemsByKeywords call
	private void findItemsByKeywords(int pageNum, int entriesPerPage, boolean newSearch) {
		
    	progressDialog = ProgressDialog.show(FindingActivity.this,
        		"Please wait...", "Retrieving data...", true, true);
		
		if (newSearch) {
			// reset
			lastItem = 0;
			totalItemCount = 0;
		}
		
		// build a request object
		FindItemsByKeywordsRequest request = new FindItemsByKeywordsRequest();
		request.setKeywords(searchKeywords);
		PaginationInput pi = new PaginationInput();
        pi.setPageNumber(pageNum);
        pi.setEntriesPerPage(entriesPerPage);
        request.setPaginationInput(pi);
        
		// show fixed price and auction item only
		ItemFilter itemFilter = new ItemFilter();
		itemFilter.setName(ItemFilterType.LISTING_TYPE);
		itemFilter.setValue(new ArrayList<String>());
		itemFilter.getValue().add("FixedPrice");
		itemFilter.getValue().add("Auction");
		request.setItemFilter(new ArrayList<ItemFilter>());
		request.getItemFilter().add(itemFilter);
		
		// build a request processor
		RequestProcessor findItemsByKeywordsRequestProcessor = 
				FindingService.getFindItemsByKeywordsHttpRequest(request, new FindItemsByKeywordsCallback(newSearch));
		// invoke request asynchronously
		findItemsByKeywordsRequestProcessor.invokeAsync(this.getApplicationContext());
	}
	
	// findItemsByKeywords response handler
	private final class FindItemsByKeywordsCallback implements HttpCallback<FindItemsByKeywordsResponse> {
		
		private boolean newSearch;
		
		public FindItemsByKeywordsCallback(boolean newSearch) {
			this.newSearch = newSearch;
		}

		@Override
		public void onSuccess(FindItemsByKeywordsResponse responseData) {
			
    		if (progressDialog != null) {
    			progressDialog.dismiss();
    			progressDialog = null;
    		}
			
			if (responseData.getAck() == AckValue.SUCCESS) { // handle App response
	            SearchResult searchResult = responseData.getSearchResult();
	            if (newSearch) {
		            List<SearchItem> items = (searchResult.getItem() != null) ? searchResult.getItem() : new ArrayList<SearchItem>();
					ItemAdapter itemAdapter = new ItemAdapter(FindingActivity.this, R.layout.row, items);
		            FindingActivity.this.setListAdapter(itemAdapter);
	            } else {
	            	if (searchResult.getItem() != null) {
	            		ItemAdapter itemAdapter = (ItemAdapter) FindingActivity.this.getListAdapter();
	            		itemAdapter.items.addAll(searchResult.getItem());
	            		itemAdapter.notifyDataSetChanged();
	            	}
	            }
	            
			} else { // handle App error
				String errorMessage = responseData.getErrorMessage().getError().get(0).getMessage();
				ALog.e(TAG, errorMessage);
	            Toast.makeText(getApplicationContext(),
	            		errorMessage,
	                    Toast.LENGTH_LONG).show();
			}
		}

		@Override
		public void onHttpError(ResponseStatus responseCode) {
			
    		if (progressDialog != null) {
    			progressDialog.dismiss();
    			progressDialog = null;
    		}
			
			// handle HTTP error
			String errorMessage = responseCode.getStatusCode() + " " + responseCode.getStatusMessage();
			ALog.e(TAG, errorMessage);
			
            Toast.makeText(getApplicationContext(),
                    errorMessage,
                    Toast.LENGTH_LONG).show();
		}
		
	}
	
	private class ItemAdapter extends ArrayAdapter<SearchItem> {

		private List<SearchItem> items;

		public ItemAdapter(Context context, int textViewResourceId,
				List<SearchItem> items) {
			super(context, textViewResourceId, items);
			this.items = items;
		}

		@Override
		public View getView(int position, View convertView, ViewGroup parent) {
			View v = convertView;
			if (v == null) {
				LayoutInflater vi = (LayoutInflater) getSystemService(Context.LAYOUT_INFLATER_SERVICE);
				v = vi.inflate(R.layout.row, null);
			}

			final SearchItem item = items.get(position);
			if (item != null) {
				TextView title = (TextView) v.findViewById(R.id.title);
				TextView price = (TextView) v.findViewById(R.id.price);
				TextView bidType = (TextView) v.findViewById(R.id.bids);
				TextView timeleft = (TextView) v.findViewById(R.id.timeleft);

				if (title != null) {
					title.setText(item.getTitle());
				}

				Amount convertedCurrentPrice = item.getSellingStatus().getConvertedCurrentPrice();
				price.setText(FindingUtil.formatCurrencyToString(
						convertedCurrentPrice.getValue(),
						convertedCurrentPrice.getCurrencyId()));

				
				String listingType = item.getListingInfo().getListingType();
				if (listingType.equalsIgnoreCase("FixedPrice")
						|| listingType.equalsIgnoreCase("StoreInventory")) {
					bidType.setBackgroundResource(R.drawable.bin_clear);
					bidType.setText("");
				} else {
					bidType.setBackgroundResource(R.drawable.light_blue_pixel);
					bidType.setText(item.getSellingStatus().getBidCount() + " bids");
				}

				Duration duration = item.getSellingStatus().getTimeLeft();
				if (duration.getDays() == 0 && duration.getHours() == 0
						&& duration.getMinutes() < 10) {
					timeleft.setTextColor(Color.RED);
				} else {
					timeleft.setTextColor(Color.BLACK);
				}

				timeleft.setText(FindingUtil.formatDuration(duration));

				WebImageView image = (WebImageView) v
						.findViewById(R.id.gallery_icon);
				if (image != null) {
					if (item.getGalleryURL() != null) {
						image.setImageUrl(item.getGalleryURL());
						image.loadImage();
					} else {
						image.setNoImageDrawable(R.drawable.placeholder);
					}
				}
			}

			return v;
		}
	}
	
	// for dynamic pagination
	@Override
	public void onScroll(AbsListView view, int firstVisible, int visibleCount,
			int totalCount) {

		lastItem = firstVisible + visibleCount;
		totalItemCount = totalCount;
	}

	// for dynamic pagination
	@Override
	public void onScrollStateChanged(AbsListView arg0, int scrollState) {
		if (scrollState == OnScrollListener.SCROLL_STATE_IDLE) {
			
			boolean loadMore = lastItem >= totalItemCount;
			
			if (loadMore) {
				int nextPage = totalItemCount / DEFAULT_ENTRIES_PER_PAGE + 1;
				findItemsByKeywords(nextPage, DEFAULT_ENTRIES_PER_PAGE, false);
				Toast.makeText(this, "Loading more ...",
						Toast.LENGTH_SHORT).show();
			}
			
		}
		
	}

}
