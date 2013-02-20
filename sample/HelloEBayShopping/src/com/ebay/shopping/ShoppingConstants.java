package com.ebay.shopping;

public interface ShoppingConstants {
	
	public static String PRODUCTION_ENDPOINT = "http://open.api.ebay.com/shopping?";
	
	public static String SANDBOX_ENDPOINT = "http://open.api.sandbox.ebay.com/shopping?";
	
	// update this accordingly if you resync the proxy with a new shopping wsdl
	public static String API_VERSION = "809";
	
	public static String REQUEST_ENCODING_XML = "XML";
	
	// for HTTP headers
	public static String X_EBAY_API_CALL_NAME_HEADER = "X-EBAY-API-CALL-NAME";
	
	public static String X_EBAY_API_APP_ID_HEADER = "X-EBAY-API-APP-ID";
	
	public static String X_EBAY_API_VERSION_HEADER = "X-EBAY-API-VERSION";
	
	public static String X_EBAY_API_REQUEST_ENCODING_HEADER = "X-EBAY-API-REQUEST-ENCODING";

}
