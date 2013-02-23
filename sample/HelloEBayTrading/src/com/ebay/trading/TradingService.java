package com.ebay.trading;

import com.ebay.trading.request.BaseTradingRequestProcessor;
import com.leansoft.nanorest.RequestProcessor;
import com.leansoft.nanorest.callback.HttpCallback;

import ebay.apis.eblbasecomponents.GeteBayOfficialTimeRequestType;
import ebay.apis.eblbasecomponents.GeteBayOfficialTimeResponseType;

public class TradingService {
	
	public static final String TAG = TradingService.class.getSimpleName();
	
	public static RequestProcessor geteBayOfficialTimeHttpRequest( 
			GeteBayOfficialTimeRequestType requestObject, 
			HttpCallback<GeteBayOfficialTimeResponseType> callback,
			TradingConfig config) {
		return new BaseTradingRequestProcessor<GeteBayOfficialTimeResponseType>(requestObject, 
				"GeteBayOfficialTime", 
				GeteBayOfficialTimeResponseType.class, 
				callback, config);
	}

}
