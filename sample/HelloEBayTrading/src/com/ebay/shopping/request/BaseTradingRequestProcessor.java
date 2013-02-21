package com.ebay.shopping.request;

import android.text.TextUtils;

import com.ebay.shopping.TradingConfig;
import com.ebay.shopping.TradingConstants;
import com.leansoft.nanorest.callback.HttpCallback;
import com.leansoft.nanorest.client.RestClient;
import com.leansoft.nanorest.request.NanoXmlRequestProcessor;

import ebay.apis.eblbasecomponents.AbstractRequestType;
import ebay.apis.eblbasecomponents.CustomSecurityHeaderType;

public class BaseTradingRequestProcessor<T> extends NanoXmlRequestProcessor<T> {

	public BaseTradingRequestProcessor(Object requestObject, String callName, Class<T> responseType, 
			HttpCallback<T> callback, TradingConfig config) {
		
		super(requestObject,
			  responseType,
		      callback);
		
		
		validateConfig(config);
		
		RestClient client = getRestClient();
		client.setUrl(config.getServerUrl());
		
		// added eBay auth token on the request
		CustomSecurityHeaderType securityHeader = new CustomSecurityHeaderType();
		securityHeader.setEBayAuthToken(config.geteBayToken());
		((AbstractRequestType)requestObject).setRequesterCredentials(securityHeader);
		
		client.addHeader(TradingConstants.X_EBAY_API_CALL_NAME_HEADER,  callName);
		client.addHeader(TradingConstants.X_EBAY_API_COMPATIBILITY_LEVEL_HEADER, config.getApiVersion());
		client.addHeader(TradingConstants.X_EBAY_API_SITEID_HEADER, config.getSiteId());
	}
	
	private void validateConfig(TradingConfig config) {
		if (TextUtils.isEmpty(config.getApiVersion())) {
			throw new IllegalArgumentException("API version is missing in config");
		}
		if (TextUtils.isEmpty(config.geteBayToken())) {
			throw new IllegalArgumentException("eBay auth token is missing in config");
		}
		if (TextUtils.isEmpty(config.getSiteId())) {
			throw new IllegalArgumentException("eBay site Id is missing in config");
		}
		if (TextUtils.isEmpty(config.getServerUrl())) {
			throw new IllegalArgumentException("eBay server url is missing in config");
		}
	}
}
