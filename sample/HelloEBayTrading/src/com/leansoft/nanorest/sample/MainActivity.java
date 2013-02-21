package com.leansoft.nanorest.sample;

import com.ebay.shopping.TradingConfig;
import com.ebay.shopping.TradingService;
import com.leansoft.nanorest.RequestProcessor;
import com.leansoft.nanorest.callback.HttpCallback;
import com.leansoft.nanorest.domain.ResponseStatus;

import ebay.apis.eblbasecomponents.AckCodeType;
import ebay.apis.eblbasecomponents.GeteBayOfficialTimeRequestType;
import ebay.apis.eblbasecomponents.GeteBayOfficialTimeResponseType;

import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;
import android.app.Activity;


public class MainActivity extends Activity {
	
	private Button btn;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
			
        btn = (Button) this.findViewById(R.id.btn);
        btn.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				
				TradingConfig config = new TradingConfig();
				config.seteBayToken("YOUR_TOKEN_HERE");
				
				GeteBayOfficialTimeRequestType request = new GeteBayOfficialTimeRequestType();
		        
				RequestProcessor requestProcessor = TradingService.geteBayOfficialTimeHttpRequest(
						request, 
						new GeteBayOfficialTimeCallback(),
						config
						);
				requestProcessor.invokeAsync(MainActivity.this.getApplicationContext());
			}
        	
        });
	}

	private final class GeteBayOfficialTimeCallback implements HttpCallback<GeteBayOfficialTimeResponseType> {

		@Override
		public void onSuccess(GeteBayOfficialTimeResponseType responseData) {
			
			if (responseData.getAck() == AckCodeType.SUCCESS) {
	            Toast.makeText(getApplicationContext(),
	            		"eBay official time - " + responseData.getTimestamp(),
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
