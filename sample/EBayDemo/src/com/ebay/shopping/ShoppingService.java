package com.ebay.shopping;

import com.ebay.shopping.request.BaseShoppingRequestProcessor;
import com.leansoft.nanorest.RequestProcessor;
import com.leansoft.nanorest.callback.HttpCallback;

import ebay.apis.eblbasecomponents.GetSingleItemRequestType;
import ebay.apis.eblbasecomponents.GetSingleItemResponseType;

public class ShoppingService {
	
	public static final String TAG = ShoppingService.class.getSimpleName();
	
	public static RequestProcessor getSingleItemHttpRequest( 
			GetSingleItemRequestType requestObject, 
			HttpCallback<GetSingleItemResponseType> callback,
			ShoppingConfig config) {
		return new BaseShoppingRequestProcessor<GetSingleItemResponseType>(requestObject, 
				"GetSingleItem", 
				GetSingleItemResponseType.class, 
				callback, 
				config);
	}

}
