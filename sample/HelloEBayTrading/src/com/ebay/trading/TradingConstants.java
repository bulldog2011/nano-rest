package com.ebay.trading;

public interface TradingConstants {
	
	public static final String PRODUCTION_ENDPOINT = "https://api.ebay.com/ws/api.dll";
	
	public static final String SANDBOX_ENDPOINT = "https://api.sandbox.ebay.com/ws/api.dll";
	
	// update this accordingly if you re-sync the proxy with a new trading wsdl
	public static final String DEFAULT_API_VERSION = "809";
	
	// find site id here http://developer.ebay.com/DevZone/shopping/docs/CallRef/types/SiteCodeType.html
	public static final String DEFAULT_SITE_ID = "0"; //US
	
	// for HTTP headers
	public static final String X_EBAY_API_CALL_NAME_HEADER = "X-EBAY-API-CALL-NAME";
	
	public static final String X_EBAY_API_SITEID_HEADER = "X-EBAY-API-SITEID";
	
	public static final String X_EBAY_API_COMPATIBILITY_LEVEL_HEADER = "X-EBAY-API-COMPATIBILITY-LEVEL";

}
