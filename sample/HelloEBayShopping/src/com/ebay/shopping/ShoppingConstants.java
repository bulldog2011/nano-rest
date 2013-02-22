package com.ebay.shopping;

public interface ShoppingConstants {
	
	public static final String PRODUCTION_ENDPOINT = "http://open.api.ebay.com/shopping?";
	
	public static final String SANDBOX_ENDPOINT = "http://open.api.sandbox.ebay.com/shopping?";
	
	// update this accordingly if you resync the proxy with a new shopping wsdl
	public static final String DEFAULT_API_VERSION = "809";
	
	// find site id here : http://developer.ebay.com/DevZone/shopping/docs/CallRef/types/SiteCodeType.html
	public static final String DEFAULT_SITE_ID = "0"; // US
	
	public static final String REQUEST_ENCODING_XML = "XML";
	
	// for HTTP headers
	public static final String X_EBAY_API_CALL_NAME_HEADER = "X-EBAY-API-CALL-NAME";
	
	public static final String X_EBAY_API_APP_ID_HEADER = "X-EBAY-API-APP-ID";
	
	public static final String X_EBAY_API_VERSION_HEADER = "X-EBAY-API-VERSION";
	
	public static final String X_EBAY_API_SITE_ID_HEADER = "X-EBAY-API-SITE-ID";
	
	public static final String X_EBAY_API_REQUEST_ENCODING_HEADER = "X-EBAY-API-REQUEST-ENCODING";

}
