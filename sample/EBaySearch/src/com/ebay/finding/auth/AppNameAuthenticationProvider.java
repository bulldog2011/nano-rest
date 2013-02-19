package com.ebay.finding.auth;

import com.ebay.finding.FindingConstants;
import com.leansoft.nanorest.auth.AuthenticationProvider;
import com.leansoft.nanorest.client.BaseRestClient;

public class AppNameAuthenticationProvider implements AuthenticationProvider {

	@Override
	public void authenticateRequest(BaseRestClient client) {
		client.addHeader(FindingConstants.X_EBAY_SOA_SECURITY_APPNAME, "YOUR_APPNAME_HERE");
	}

}
