package com.ebay.finding;

public interface FindingConstants {
	
	public static final String PRODUCTION_ENDPOINT = "http://svcs.ebay.com/services/search/FindingService/v1";
	
	public static final String SANDBOX_ENDPOINT = "http://svcs.sandbox.ebay.com/services/search/FindingService/v1";
	
	public static final String DEFAULT_SERVICE_VERSION = "1.0.0";
	
	// find global id here : http://developer.ebay.com/DevZone/finding/Concepts/SiteIDToGlobalID.html
	public static final String DEFAULT_GLOBAL_ID = "EBAY-US";
	
	
	// Finding service headers
	public static final String X_EBAY_SOA_OPERATION_NAME_HEADER = "X-EBAY-SOA-OPERATION-NAME";
	
	public static final String X_EBAY_SOA_SECURITY_APPNAME_HEADER = "X-EBAY-SOA-SECURITY-APPNAME";
	
	public static final String X_EBAY_SOA_GLOBAL_ID_HEADER = "X-EBAY-SOA-GLOBAL-ID";

	public static final String X_EBAY_SOA_SERVICE_VERSION_HEADER = "X-EBAY-SOA-SERVICE-VERSION ";
}
