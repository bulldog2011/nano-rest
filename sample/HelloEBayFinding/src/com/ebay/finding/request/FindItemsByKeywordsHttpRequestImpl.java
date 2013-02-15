package com.ebay.finding.request;

import com.ebay.finding.FindingConstants;
import com.ebay.finding.auth.AppNameAuthenticationProvider;
import com.ebay.marketplace.search.v1.services.FindItemsByKeywordsRequest;
import com.ebay.marketplace.search.v1.services.FindItemsByKeywordsResponse;
import com.leansoft.nanorest.callback.HttpCallback;
import com.leansoft.nanorest.client.Rest;
import com.leansoft.nanorest.request.NanoXmlHttpRequestImpl;

public class FindItemsByKeywordsHttpRequestImpl extends NanoXmlHttpRequestImpl<FindItemsByKeywordsResponse> {

	public FindItemsByKeywordsHttpRequestImpl(FindItemsByKeywordsRequest requestObject,
			HttpCallback<FindItemsByKeywordsResponse> callback) {
		
		super(requestObject,
			  FindItemsByKeywordsResponse.class, 
		      callback);
		
		
		Rest client = getClient();
		client.setUrl(FindingConstants.PRODUCTION_ENDPOINT);
		client.setAuthentication(new AppNameAuthenticationProvider());
	}

	@Override
	protected void prepareParams() {
		addHeader(FindingConstants.X_EBAY_SOA_OPERATION_NAME, "findItemsByKeywords");
	}

}
