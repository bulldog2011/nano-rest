package com.ebay.shopping.auth;

import com.ebay.shopping.ShoppingConstants;
import com.leansoft.nanorest.auth.AuthenticationProvider;
import com.leansoft.nanorest.client.BaseRestClient;

public class AppNameAuthenticationProvider implements AuthenticationProvider {
	
	private final String appId;
	
	public AppNameAuthenticationProvider(String appId) {
		this.appId = appId;
	}

	@Override
	public void authenticateRequest(BaseRestClient client) {
		client.addHeader(ShoppingConstants.X_EBAY_API_APP_ID_HEADER, this.appId);
	}

}
