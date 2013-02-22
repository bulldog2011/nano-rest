package com.leansoft.nanorest.sample;

import com.ebay.shopping.ShoppingConfig;
import com.ebay.shopping.ShoppingService;
import com.leansoft.nanorest.RequestProcessor;
import com.leansoft.nanorest.callback.HttpCallback;
import com.leansoft.nanorest.domain.ResponseStatus;

import ebay.apis.eblbasecomponents.AckCodeType;
import ebay.apis.eblbasecomponents.FindPopularItemsRequestType;
import ebay.apis.eblbasecomponents.FindPopularItemsResponseType;

import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;
import android.widget.EditText;
import android.app.Activity;


public class MainActivity extends Activity {
	
	private Button btn;
	
	private ShoppingConfig config = new ShoppingConfig();

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		config.setAppId("YOUR_APPID_HERE");
			
        btn = (Button) this.findViewById(R.id.btn);
        btn.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				String keywords = ((EditText) findViewById(R.id.edit_input)).getText().toString();	
				FindPopularItemsRequestType request = new FindPopularItemsRequestType();
				request.setQueryKeywords(keywords);
				request.setMaxEntries(1);
		        
				RequestProcessor requestProcessor = ShoppingService.getFindPopularItemsHttpRequest(
						request, 
						new FindPopularItemsCallback(),
						config
						);
				requestProcessor.invokeAsync(MainActivity.this.getApplicationContext());
			}
        	
        });
	}

	private final class FindPopularItemsCallback implements HttpCallback<FindPopularItemsResponseType> {

		@Override
		public void onSuccess(FindPopularItemsResponseType responseData) {
			
			if (responseData.getAck() == AckCodeType.SUCCESS) {
	            Toast.makeText(getApplicationContext(),
	            		responseData.getItemArray().getItem().get(0).getTitle(),
	                    Toast.LENGTH_LONG).show();
			} else {
	            Toast.makeText(getApplicationContext(),
	            		responseData.getErrors().get(0).getLongMessage(),
	                    Toast.LENGTH_LONG).show();
			}
		}

		@Override
		public void onHttpError(ResponseStatus responseCode) {
            Toast.makeText(getApplicationContext(),
                    responseCode.getStatusCode() + " " + responseCode.getStatusMessage(),
                    Toast.LENGTH_LONG).show();
			
		}
		
	}

}
