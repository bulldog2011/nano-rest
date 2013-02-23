package com.ebay.shopping.request;

import android.text.TextUtils;

import com.ebay.shopping.ShoppingConfig;
import com.ebay.shopping.ShoppingConstants;
import com.ebay.shopping.auth.AppNameAuthenticationProvider;
import com.leansoft.nanorest.callback.HttpCallback;
import com.leansoft.nanorest.client.RestClient;
import com.leansoft.nanorest.request.NanoXmlRequestProcessor;

public class BaseShoppingRequestProcessor<T> extends NanoXmlRequestProcessor<T> {

	public BaseShoppingRequestProcessor(Object requestObject, String callName, Class<T> responseType, 
			HttpCallback<T> callback, ShoppingConfig config) {
		
		super(requestObject,
			  responseType,
		      callback);
		
		validateConfig(config);
		
		RestClient client = getRestClient();
		client.setUrl(config.getServerUrl());
		client.setAuthentication(new AppNameAuthenticationProvider(config.getAppId()));
		
		client.addHeader(ShoppingConstants.X_EBAY_API_CALL_NAME_HEADER,  callName);
		client.addHeader(ShoppingConstants.X_EBAY_API_VERSION_HEADER, config.getApiVersion());
		if (!TextUtils.isEmpty(config.getSiteId())) {
			client.addHeader(ShoppingConstants.X_EBAY_API_VERSION_HEADER, config.getApiVersion());
		}
		client.addHeader(ShoppingConstants.X_EBAY_API_REQUEST_ENCODING_HEADER, ShoppingConstants.REQUEST_ENCODING_XML);
	}
	
	private void validateConfig(ShoppingConfig config) {
		if (TextUtils.isEmpty(config.getAppId())) {
			throw new IllegalArgumentException("App Id is missing in config");
		}
		if (TextUtils.isEmpty(config.getServerUrl())) {
			throw new IllegalArgumentException("Server url is missing in config");
		}
		if (TextUtils.isEmpty(config.getApiVersion())) {
			throw new IllegalArgumentException("Api version is missing in config");
		}
	}
}
