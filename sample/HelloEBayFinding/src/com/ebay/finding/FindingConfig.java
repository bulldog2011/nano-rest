package com.ebay.finding;

public class FindingConfig {
	
	// developer application ID
	private String appName;
	
	// Finding API server url
	private String serverUrl = FindingConstants.PRODUCTION_ENDPOINT;
	
	// eBay Global ID
	private String globalId = FindingConstants.DEFAULT_GLOBAL_ID;
	
	// Finding service version
	private String serviceVersion = FindingConstants.DEFAULT_SERVICE_VERSION;

	public String getAppName() {
		return appName;
	}

	/**
	 * Set eBay developer application Id
	 * 
	 * @param appName
	 */
	public void setAppName(String appName) {
		this.appName = appName;
	}

	public String getServerUrl() {
		return serverUrl;
	}

	/**
	 * Set Finding API server url, either production or sandbox
	 * 
	 * @param serverUrl
	 */
	public void setServerUrl(String serverUrl) {
		this.serverUrl = serverUrl;
	}

	/**
	 * Set eBay Global Id,
	 * find id here : http://developer.ebay.com/DevZone/finding/Concepts/SiteIDToGlobalID.html
	 * 
	 * @return
	 */
	public String getGlobalId() {
		return globalId;
	}

	/**
	 * Set eBay Global Id
	 * 
	 * @param globalId
	 */
	public void setGlobalId(String globalId) {
		this.globalId = globalId;
	}

	public String getServiceVersion() {
		return serviceVersion;
	}

	/**
	 * Set Finding service version to call
	 * 
	 * @param serviceVersion
	 */
	public void setServiceVersion(String serviceVersion) {
		this.serviceVersion = serviceVersion;
	}
}
