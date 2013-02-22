package com.ebay.finding;

import com.ebay.finding.request.BaseFindingRequestProcessor;
import com.ebay.marketplace.search.v1.services.FindItemsByKeywordsRequest;
import com.ebay.marketplace.search.v1.services.FindItemsByKeywordsResponse;
import com.leansoft.nanorest.RequestProcessor;
import com.leansoft.nanorest.callback.HttpCallback;

public class FindingService {
	
	public static final String TAG = FindingService.class.getSimpleName();
	
	public static RequestProcessor getFindItemsByKeywordsHttpRequest( 
			FindItemsByKeywordsRequest requestObject, 
			HttpCallback<FindItemsByKeywordsResponse> callback,
			FindingConfig config) {
		return new BaseFindingRequestProcessor<FindItemsByKeywordsResponse>(
				requestObject, 
				"findItemsByKeywords", 
				FindItemsByKeywordsResponse.class, 
				callback, 
				config);
	}

}
