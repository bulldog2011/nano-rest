// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package ebay.apis.eblbasecomponents;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;
import java.util.Date;

/**
 * 
 * Type defining the <b>ListingStartPriceDetails</b> container returned in
 * <b>GeteBayDetails</b>. The <b>ListingStartPriceDetails</b> 
 * container lists the minimum start price for auction listings, the minimum sale price 
 * for fixed-price listings, and the minimum percentage value that a Buy It Now price for 
 * an auction listing must be above the minimum start price for that same listing.
 * <br><br>
 * The <b>ListingStartPriceDetails</b> container is returned if
 * <b>ListingStartPriceDetails</b> is included as a <b>DetailName</b> 
 * filter in the request, or if no lt;b>DetailName</b> filters are used in the request.
 * 
 */
public class ListingStartPriceDetailsType implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element(name = "Description")
	private String description;
	
	@Element(name = "ListingType")
	private ListingTypeCodeType listingType;
	
	@Element(name = "StartPrice")
	private AmountType startPrice;
	
	@Element(name = "DetailVersion")
	private String detailVersion;
	
	@Element(name = "UpdateTime")
	private Date updateTime;
	
	@Element(name = "MinBuyItNowPricePercent")
	private Float minBuyItNowPricePercent;
	
    
	/**
     * public getter
     *
     * 
     * This value is a string description of the listing type for which the pricing data 
     * is intended, such as "Pricing for the auction-like listings".
     * 
     *
     * @returns java.lang.String
	 */
	public String getDescription() {
	    return this.description;
	}
	
	/**
	 * public setter
	 *
     * 
     * This value is a string description of the listing type for which the pricing data 
     * is intended, such as "Pricing for the auction-like listings".
     * 
     *
     * @param java.lang.String
	 */
	public void setDescription(String description) {
	    this.description = description;
	}
	/**
     * public getter
     *
     * 
     * This value indicates the listing type of the listing, and is a value defined in 
     * <b>ListingTypeCodeType</b> enumerated type. The only possible values for 
     * this field are 'Chinese' (auction listing) and 'FixedPriceItem'.
     * 
     *
     * @returns ebay.apis.eblbasecomponents.ListingTypeCodeType
	 */
	public ListingTypeCodeType getListingType() {
	    return this.listingType;
	}
	
	/**
	 * public setter
	 *
     * 
     * This value indicates the listing type of the listing, and is a value defined in 
     * <b>ListingTypeCodeType</b> enumerated type. The only possible values for 
     * this field are 'Chinese' (auction listing) and 'FixedPriceItem'.
     * 
     *
     * @param ebay.apis.eblbasecomponents.ListingTypeCodeType
	 */
	public void setListingType(ListingTypeCodeType listingType) {
	    this.listingType = listingType;
	}
	/**
     * public getter
     *
     * 
     * For auction listings, the <b>StartPrice</b> indicates the lowest dollar
     * value that can be set for the item's Starting bid. 
     * <br><br>
     * For fixed-price listings, the <b>StartPrice</b> indicates the lowest
     * dollar value that can be set for the item's sale price.
     * 
     *
     * @returns ebay.apis.eblbasecomponents.AmountType
	 */
	public AmountType getStartPrice() {
	    return this.startPrice;
	}
	
	/**
	 * public setter
	 *
     * 
     * For auction listings, the <b>StartPrice</b> indicates the lowest dollar
     * value that can be set for the item's Starting bid. 
     * <br><br>
     * For fixed-price listings, the <b>StartPrice</b> indicates the lowest
     * dollar value that can be set for the item's sale price.
     * 
     *
     * @param ebay.apis.eblbasecomponents.AmountType
	 */
	public void setStartPrice(AmountType startPrice) {
	    this.startPrice = startPrice;
	}
	/**
     * public getter
     *
     * 
     * Returns the latest version number for this field. The version can be used to
     * determine if and when to refresh cached client data.
     * 
     *
     * @returns java.lang.String
	 */
	public String getDetailVersion() {
	    return this.detailVersion;
	}
	
	/**
	 * public setter
	 *
     * 
     * Returns the latest version number for this field. The version can be used to
     * determine if and when to refresh cached client data.
     * 
     *
     * @param java.lang.String
	 */
	public void setDetailVersion(String detailVersion) {
	    this.detailVersion = detailVersion;
	}
	/**
     * public getter
     *
     * 
     * Gives the time in GMT that the feature flags for the
     * details were last updated. This timestamp can be used to determine
     * if and when to refresh cached client data.
     * 
     *
     * @returns java.util.Date
	 */
	public Date getUpdateTime() {
	    return this.updateTime;
	}
	
	/**
	 * public setter
	 *
     * 
     * Gives the time in GMT that the feature flags for the
     * details were last updated. This timestamp can be used to determine
     * if and when to refresh cached client data.
     * 
     *
     * @param java.util.Date
	 */
	public void setUpdateTime(Date updateTime) {
	    this.updateTime = updateTime;
	}
	/**
     * public getter
     *
     * 
     * This field is only returned and applicable for auction listings.
     * <br><br>
     * This float value indicates the minimum percentage value that a Buy It Now price for
     * an auction listing must be above the Starting bid price for that same listing. 
     * <br><br>
     * On the US eBay Motors site (Site ID 100), this field only applies to the Parts and
     * Accessories categories.
     * 
     *
     * @returns java.lang.Float
	 */
	public Float getMinBuyItNowPricePercent() {
	    return this.minBuyItNowPricePercent;
	}
	
	/**
	 * public setter
	 *
     * 
     * This field is only returned and applicable for auction listings.
     * <br><br>
     * This float value indicates the minimum percentage value that a Buy It Now price for
     * an auction listing must be above the Starting bid price for that same listing. 
     * <br><br>
     * On the US eBay Motors site (Site ID 100), this field only applies to the Parts and
     * Accessories categories.
     * 
     *
     * @param java.lang.Float
	 */
	public void setMinBuyItNowPricePercent(Float minBuyItNowPricePercent) {
	    this.minBuyItNowPricePercent = minBuyItNowPricePercent;
	}

}