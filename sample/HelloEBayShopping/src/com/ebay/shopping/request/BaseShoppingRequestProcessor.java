package com.ebay.shopping.request;

import com.ebay.shopping.ShoppingConstants;
import com.ebay.shopping.auth.AppNameAuthenticationProvider;
import com.leansoft.nanorest.callback.HttpCallback;
import com.leansoft.nanorest.client.RestClient;
import com.leansoft.nanorest.request.NanoXmlRequestProcessor;

public class BaseShoppingRequestProcessor<T> extends NanoXmlRequestProcessor<T> {

	public BaseShoppingRequestProcessor(Object requestObject, String callName, Class<T> responseType, 
			HttpCallback<T> callback) {
		
		super(requestObject,
			  responseType,
		      callback);
		
		RestClient client = getRestClient();
		client.setUrl(ShoppingConstants.PRODUCTION_ENDPOINT);
		client.setAuthentication(new AppNameAuthenticationProvider());
		
		client.addHeader(ShoppingConstants.X_EBAY_API_CALL_NAME_HEADER,  callName);
		client.addHeader(ShoppingConstants.X_EBAY_API_VERSION_HEADER, ShoppingConstants.API_VERSION);
		client.addHeader(ShoppingConstants.X_EBAY_API_REQUEST_ENCODING_HEADER, ShoppingConstants.REQUEST_ENCODING_XML);
	}
}
