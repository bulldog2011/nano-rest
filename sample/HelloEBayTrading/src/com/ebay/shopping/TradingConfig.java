package com.ebay.shopping;

public class TradingConfig {
	
	// eBay Trading API auth token
	private String eBayToken;
	
	// eBay site Id, find site id in SiteCodeType
	private String siteId = TradingConstants.DEFAULT_SITE_ID;
	
	// eBay Trading API version
	private String apiVersion = TradingConstants.DEFAULT_API_VERSION;
	
	// sandbox or production url
	private String serverUrl = TradingConstants.SANDBOX_ENDPOINT;

	public String geteBayToken() {
		return eBayToken;
	}

	/**
	 * Set eBay Trading API auth token
	 * 
	 * @param eBayToken eBay auth token
	 */
	public void seteBayToken(String eBayToken) {
		this.eBayToken = eBayToken;
	}

	public String getSiteId() {
		return siteId;
	}

	/**
	 * Set eBay Site Id, 
	 * find id here : http://developer.ebay.com/DevZone/shopping/docs/CallRef/types/SiteCodeType.html
	 * 
	 * @param siteId target site Id
	 */
	public void setSiteId(String siteId) {
		this.siteId = siteId;
	}

	public String getApiVersion() {
		return apiVersion;
	}

	/**
	 * Set eBay Trading API version to call
	 * 
	 * @param apiVersion API version to call
	 */
	public void setApiVersion(String apiVersion) {
		this.apiVersion = apiVersion;
	}

	public String getServerUrl() {
		return serverUrl;
	}

	/**
	 * Set eBay Trading API production or sandbox url
	 * 
	 * @param serverUrl url to be set
	 */
	public void setServerUrl(String serverUrl) {
		this.serverUrl = serverUrl;
	}
}
