package com.ebay.finding.auth;

import com.ebay.finding.FindingConstants;
import com.leansoft.nanorest.auth.AuthenticationProvider;
import com.leansoft.nanorest.client.BaseRestClient;

public class AppNameAuthenticationProvider implements AuthenticationProvider {
	
	private final String appName;
	
	public AppNameAuthenticationProvider(String appName) {
		this.appName = appName;
	}

	@Override
	public void authenticateRequest(BaseRestClient client) {
		client.addHeader(FindingConstants.X_EBAY_SOA_SECURITY_APPNAME_HEADER, appName);
	}

}
