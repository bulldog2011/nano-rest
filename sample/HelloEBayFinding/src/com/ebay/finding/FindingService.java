package com.ebay.finding;

import com.ebay.finding.request.FindItemsByKeywordsHttpRequestImpl;
import com.ebay.marketplace.search.v1.services.FindItemsByKeywordsRequest;
import com.ebay.marketplace.search.v1.services.FindItemsByKeywordsResponse;
import com.leansoft.nanorest.HttpRequest;
import com.leansoft.nanorest.callback.HttpCallback;

public class FindingService {
	
	public static final String TAG = FindingService.class.getSimpleName();
	
	public static HttpRequest getFindItemsByKeywordsHttpRequest( 
			FindItemsByKeywordsRequest requestObject, 
			HttpCallback<FindItemsByKeywordsResponse> callback) {
		return new FindItemsByKeywordsHttpRequestImpl(requestObject, callback);
	}

}
