package com.ebay.shopping;

public class ShoppingConfig {
	
	private String appId;
	
	private String serverUrl = ShoppingConstants.PRODUCTION_ENDPOINT;
	
	private String apiVersion = ShoppingConstants.DEFAULT_API_VERSION;
	
	private String siteId = ShoppingConstants.DEFAULT_SITE_ID;

	public String getAppId() {
		return appId;
	}

	/**
	 * Set eBay developer application Id
	 * 
	 * @param appId
	 */
	public void setAppId(String appId) {
		this.appId = appId;
	}

	public String getServerUrl() {
		return serverUrl;
	}

	/**
	 * Set Shopping API server url, either production or sandbox
	 * 
	 * @param serverUrl
	 */
	public void setServerUrl(String serverUrl) {
		this.serverUrl = serverUrl;
	}

	public String getApiVersion() {
		return apiVersion;
	}

	/**
	 * Set Shopping API version to call
	 * 
	 * @param apiVersion
	 */
	public void setApiVersion(String apiVersion) {
		this.apiVersion = apiVersion;
	}

	public String getSiteId() {
		return siteId;
	}

	/**
	 * Set target site id,
	 * find site id here : http://developer.ebay.com/DevZone/shopping/docs/CallRef/types/SiteCodeType.html
	 * 
	 * @param siteId
	 */
	public void setSiteId(String siteId) {
		this.siteId = siteId;
	}

}
