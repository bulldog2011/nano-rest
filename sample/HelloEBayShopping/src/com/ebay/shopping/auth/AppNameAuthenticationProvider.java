package com.ebay.shopping.auth;

import com.ebay.shopping.ShoppingConstants;
import com.leansoft.nanorest.auth.AuthenticationProvider;
import com.leansoft.nanorest.client.BaseRestClient;

public class AppNameAuthenticationProvider implements AuthenticationProvider {

	@Override
	public void authenticateRequest(BaseRestClient client) {
		client.addHeader(ShoppingConstants.X_EBAY_API_APP_ID_HEADER, "YOUR_APPID_HERE");
	}

}
