package com.leansoft.nanorest.sample;

import com.ebay.finding.FindingService;
import com.ebay.marketplace.search.v1.services.AckValue;
import com.ebay.marketplace.search.v1.services.FindItemsByKeywordsRequest;
import com.ebay.marketplace.search.v1.services.FindItemsByKeywordsResponse;
import com.ebay.marketplace.search.v1.services.PaginationInput;
import com.leansoft.nanorest.HttpRequest;
import com.leansoft.nanorest.callback.HttpCallback;
import com.leansoft.nanorest.domain.ResponseStatus;

import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;
import android.widget.EditText;
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
				String keywords = ((EditText) findViewById(R.id.edit_input)).getText().toString();	
				FindItemsByKeywordsRequest request = new FindItemsByKeywordsRequest();
				request.setKeywords(keywords);
				PaginationInput pi = new PaginationInput();
		        pi.setPageNumber(1);
		        pi.setEntriesPerPage(1);
		        request.setPaginationInput(pi);
		        
				HttpRequest httpRequest = FindingService.getFindItemsByKeywordsHttpRequest(
						request, 
						new FindItemsByKeywordsCallback()
						);
				httpRequest.executeAsync(MainActivity.this.getApplicationContext());
			}
        	
        });
	}

	private final class FindItemsByKeywordsCallback implements HttpCallback<FindItemsByKeywordsResponse> {

		@Override
		public void onSuccess(FindItemsByKeywordsResponse responseData) {
			
			if (responseData.getAck() == AckValue.SUCCESS) {
	            Toast.makeText(getApplicationContext(),
	            		responseData.getSearchResult().getItem().get(0).getTitle(),
	                    Toast.LENGTH_LONG).show();
			} else {
	            Toast.makeText(getApplicationContext(),
	            		responseData.getErrorMessage().getError().get(0).getMessage(),
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
