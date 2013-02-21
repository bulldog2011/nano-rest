// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.ebay.marketplace.search.v1.services;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;

/**
 * 
 * eBay uses specified details to build a View Item URL and Product URL string
 * in the response. These URLs include correctly formatted affiliate tracking
 * information. When a user clicks through one of these URLs to eBay, the
 * respective affiliate might get a commission, based on the tasks performed by
 * the user.
 * 
 */
public class Affiliate implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element
	private String trackingId;
	
	@Element
	private String networkId;
	
	@Element
	private String customId;
	
	@Element
	private Boolean geoTargeting;
	
	@Element
	private String delimiter;
	
    
	/**
     * public getter
     *
     * 
     * Specify the affiliate value obtained from your tracking partner. For the
     * eBay Partner Network, the tracking ID is the provided Campaign ID
     * ("campid"). A Campaign ID is a unique 10-digit number used for
     * associating traffic and is valid across all programs to which you have
     * been accepted. Another example of this value is the Affiliate ID given to
     * you by TradeDoubler.
     * 
     *
     * @returns java.lang.String
	 */
	public String getTrackingId() {
	    return this.trackingId;
	}
	
	/**
	 * public setter
	 *
     * 
     * Specify the affiliate value obtained from your tracking partner. For the
     * eBay Partner Network, the tracking ID is the provided Campaign ID
     * ("campid"). A Campaign ID is a unique 10-digit number used for
     * associating traffic and is valid across all programs to which you have
     * been accepted. Another example of this value is the Affiliate ID given to
     * you by TradeDoubler.
     * 
     *
     * @param java.lang.String
	 */
	public void setTrackingId(String trackingId) {
	    this.trackingId = trackingId;
	}
	/**
     * public getter
     *
     * 
     * Specifies your tracking partner for affiliate commissions. Affiliates
     * earn money from eBay for driving traffic to eBay. This field is required
     * if you specify a tracking ID. Depending on your tracking partner, specify
     * one of the following values. Not all partners are valid for all sites.
     * For PlaceOffer, only the eBay Partner Network and Mediaplex are valid:
     * <br>
     * <br>2 = Be Free
     * <br>3 = Affilinet
     * <br>4 = TradeDoubler
     * <br>5 = Mediaplex
     * <br>6 = DoubleClick
     * <br>7 = Allyes
     * <br>8 = BJMT
     * <br>9 = eBay Partner Network
     * 
     *
     * @returns java.lang.String
	 */
	public String getNetworkId() {
	    return this.networkId;
	}
	
	/**
	 * public setter
	 *
     * 
     * Specifies your tracking partner for affiliate commissions. Affiliates
     * earn money from eBay for driving traffic to eBay. This field is required
     * if you specify a tracking ID. Depending on your tracking partner, specify
     * one of the following values. Not all partners are valid for all sites.
     * For PlaceOffer, only the eBay Partner Network and Mediaplex are valid:
     * <br>
     * <br>2 = Be Free
     * <br>3 = Affilinet
     * <br>4 = TradeDoubler
     * <br>5 = Mediaplex
     * <br>6 = DoubleClick
     * <br>7 = Allyes
     * <br>8 = BJMT
     * <br>9 = eBay Partner Network
     * 
     *
     * @param java.lang.String
	 */
	public void setNetworkId(String networkId) {
	    this.networkId = networkId;
	}
	/**
     * public getter
     *
     * 
     * You can define an affiliate customId if you want an ID to monitor your
     * marketing efforts. Chose an ID up to up to 256 characters in length. If
     * you are using the eBay Partner Network, and you provide a customId, the
     * tracking URL returned by the eBay Partner Network will contain your
     * customId value.
     * 
     *
     * @returns java.lang.String
	 */
	public String getCustomId() {
	    return this.customId;
	}
	
	/**
	 * public setter
	 *
     * 
     * You can define an affiliate customId if you want an ID to monitor your
     * marketing efforts. Chose an ID up to up to 256 characters in length. If
     * you are using the eBay Partner Network, and you provide a customId, the
     * tracking URL returned by the eBay Partner Network will contain your
     * customId value.
     * 
     *
     * @param java.lang.String
	 */
	public void setCustomId(String customId) {
	    this.customId = customId;
	}
	/**
     * public getter
     *
     * 
     * The geoTargeting parameter will be used for geographical targeting your
     * affiliate programs. The geo-targeting feature works for English speaking
     * countries (US, UK, CA, AU, and IE) only.
     * 
     *
     * @returns java.lang.Boolean
	 */
	public Boolean getGeoTargeting() {
	    return this.geoTargeting;
	}
	
	/**
	 * public setter
	 *
     * 
     * The geoTargeting parameter will be used for geographical targeting your
     * affiliate programs. The geo-targeting feature works for English speaking
     * countries (US, UK, CA, AU, and IE) only.
     * 
     *
     * @param java.lang.Boolean
	 */
	public void setGeoTargeting(Boolean geoTargeting) {
	    this.geoTargeting = geoTargeting;
	}
	/**
	 * public getter
	 *
     * @returns java.lang.String
	 */
	public String getDelimiter() {
	    return this.delimiter;
	}
	
	/**
	 * public setter
	 *
     * @param java.lang.String
	 */
	public void setDelimiter(String delimiter) {
	    this.delimiter = delimiter;
	}

}