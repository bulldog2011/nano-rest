package com.ebay.shopping;

import com.ebay.shopping.request.BaseShoppingRequestProcessor;
import com.leansoft.nanorest.RequestProcessor;
import com.leansoft.nanorest.callback.HttpCallback;

import ebay.apis.eblbasecomponents.FindPopularItemsRequestType;
import ebay.apis.eblbasecomponents.FindPopularItemsResponseType;

public class ShoppingService {
	
	public static final String TAG = ShoppingService.class.getSimpleName();
	
	public static RequestProcessor getFindPopularItemsHttpRequest( 
			FindPopularItemsRequestType requestObject, 
			HttpCallback<FindPopularItemsResponseType> callback,
			ShoppingConfig config) {
		return new BaseShoppingRequestProcessor<FindPopularItemsResponseType>(requestObject, 
				"FindPopularItems", 
				FindPopularItemsResponseType.class, 
				callback, 
				config);
	}

}
