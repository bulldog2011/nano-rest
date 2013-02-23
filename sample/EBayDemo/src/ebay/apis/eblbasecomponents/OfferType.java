// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package ebay.apis.eblbasecomponents;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;
import java.util.Date;

/**
 * 
 * Contains information pertaining to an offer made on an item listing and
 * the current bidding or purchase state of the listing.
 * 
 */
public class OfferType implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element(name = "Action")
	private BidActionCodeType action;
	
	@Element(name = "Currency")
	private CurrencyCodeType currency;
	
	@Element(name = "ItemID")
	private String itemID;
	
	@Element(name = "MaxBid")
	private AmountType maxBid;
	
	@Element(name = "Quantity")
	private Integer quantity;
	
	@Element(name = "SecondChanceEnabled")
	private Boolean secondChanceEnabled;
	
	@Element(name = "SiteCurrency")
	private CurrencyCodeType siteCurrency;
	
	@Element(name = "TimeBid")
	private Date timeBid;
	
	@Element(name = "HighestBid")
	private AmountType highestBid;
	
	@Element(name = "ConvertedPrice")
	private AmountType convertedPrice;
	
	@Element(name = "TransactionID")
	private String transactionID;
	
	@Element(name = "User")
	private UserType user;
	
	@Element(name = "UserConsent")
	private Boolean userConsent;
	
	@Element(name = "BidCount")
	private Integer bidCount;
	
	@Element(name = "Message")
	private String message;
	
	@Element(name = "BestOfferID")
	private String bestOfferID;
	
	@Element(name = "MyMaxBid")
	private AmountType myMaxBid;
	
    
	/**
     * public getter
     *
     * 
     * Indicates the type of offer being made on the specified listing.
     * If the item is Best Offer enabled and the buyer
     * makes a Best Offer (or a counter offer), then after
     * the <b>PlaceOffer</b> call,
     * the buyer can get the status of the Best Offer
     * (and of a possible seller-counter-offer, etc.)
     * using the <b>GetBestOffers</b> call. See the
     * Trading Web Services Guide for information
     * about best-offer enabled items and
     * about <b>GetBestOffers</b>.
     * 
     *
     * @returns ebay.apis.eblbasecomponents.BidActionCodeType
	 */
	public BidActionCodeType getAction() {
	    return this.action;
	}
	
	/**
	 * public setter
	 *
     * 
     * Indicates the type of offer being made on the specified listing.
     * If the item is Best Offer enabled and the buyer
     * makes a Best Offer (or a counter offer), then after
     * the <b>PlaceOffer</b> call,
     * the buyer can get the status of the Best Offer
     * (and of a possible seller-counter-offer, etc.)
     * using the <b>GetBestOffers</b> call. See the
     * Trading Web Services Guide for information
     * about best-offer enabled items and
     * about <b>GetBestOffers</b>.
     * 
     *
     * @param ebay.apis.eblbasecomponents.BidActionCodeType
	 */
	public void setAction(BidActionCodeType action) {
	    this.action = action;
	}
	/**
     * public getter
     *
     * 
     * Three-digit currency code for the currency used for the auction. Valid values can
     * be viewed in the <b>CurrencyCodeType</b> code list.
     * 
     *
     * @returns ebay.apis.eblbasecomponents.CurrencyCodeType
	 */
	public CurrencyCodeType getCurrency() {
	    return this.currency;
	}
	
	/**
	 * public setter
	 *
     * 
     * Three-digit currency code for the currency used for the auction. Valid values can
     * be viewed in the <b>CurrencyCodeType</b> code list.
     * 
     *
     * @param ebay.apis.eblbasecomponents.CurrencyCodeType
	 */
	public void setCurrency(CurrencyCodeType currency) {
	    this.currency = currency;
	}
	/**
     * public getter
     *
     * 
     * The unique identifier of an item listed on the eBay site.
     * Returned by eBay when the item is created.
     * 
     *
     * @returns java.lang.String
	 */
	public String getItemID() {
	    return this.itemID;
	}
	
	/**
	 * public setter
	 *
     * 
     * The unique identifier of an item listed on the eBay site.
     * Returned by eBay when the item is created.
     * 
     *
     * @param java.lang.String
	 */
	public void setItemID(String itemID) {
	    this.itemID = itemID;
	}
	/**
     * public getter
     *
     * 
     * Amount of the offer placed. For auction listings, the amount
     * bid on the item (subject to outbid by other buyers). For fixed-price
     * listings, the fixed sale price at which the item is purchased. For
     * auction listings with an active Buy It Now option, this amount
     * will be either the Buy It Now price for purchase or the amount of a bid,
     * depending on the offer type (as specified in <b>Action</b>). For <b>PlaceOffer</b>,
     * the <b>CurrencyID</b> attribute is ignored if provided. Regarding Value-Added Tax (VAT):
     * Even if VAT applies, you do not need to add VAT to the <b>MaxBid</b> value.
     * If VAT applies to the listing, the seller can specify a VAT percent value
     * when they list the item.
     * 
     *
     * @returns ebay.apis.eblbasecomponents.AmountType
	 */
	public AmountType getMaxBid() {
	    return this.maxBid;
	}
	
	/**
	 * public setter
	 *
     * 
     * Amount of the offer placed. For auction listings, the amount
     * bid on the item (subject to outbid by other buyers). For fixed-price
     * listings, the fixed sale price at which the item is purchased. For
     * auction listings with an active Buy It Now option, this amount
     * will be either the Buy It Now price for purchase or the amount of a bid,
     * depending on the offer type (as specified in <b>Action</b>). For <b>PlaceOffer</b>,
     * the <b>CurrencyID</b> attribute is ignored if provided. Regarding Value-Added Tax (VAT):
     * Even if VAT applies, you do not need to add VAT to the <b>MaxBid</b> value.
     * If VAT applies to the listing, the seller can specify a VAT percent value
     * when they list the item.
     * 
     *
     * @param ebay.apis.eblbasecomponents.AmountType
	 */
	public void setMaxBid(AmountType maxBid) {
	    this.maxBid = maxBid;
	}
	/**
     * public getter
     *
     * 
     * Specifies the number of items from the specified listing the user
     * tendering the offer intends to purchase, bid on, or make a Best Offer on.
     * For auctions, the value may not
     * exceed one. For multi-item listings, must be greater than zero and not
     * exceeding the number of items offered for sale in the listing.
     * 
     *
     * @returns java.lang.Integer
	 */
	public Integer getQuantity() {
	    return this.quantity;
	}
	
	/**
	 * public setter
	 *
     * 
     * Specifies the number of items from the specified listing the user
     * tendering the offer intends to purchase, bid on, or make a Best Offer on.
     * For auctions, the value may not
     * exceed one. For multi-item listings, must be greater than zero and not
     * exceeding the number of items offered for sale in the listing.
     * 
     *
     * @param java.lang.Integer
	 */
	public void setQuantity(Integer quantity) {
	    this.quantity = quantity;
	}
	/**
     * public getter
     *
     * 
     * Indicates the user's preference to accept second chance offers. If true,
     * the user is willing to be the recipient of second chance offers.
     * 
     *
     * @returns java.lang.Boolean
	 */
	public Boolean getSecondChanceEnabled() {
	    return this.secondChanceEnabled;
	}
	
	/**
	 * public setter
	 *
     * 
     * Indicates the user's preference to accept second chance offers. If true,
     * the user is willing to be the recipient of second chance offers.
     * 
     *
     * @param java.lang.Boolean
	 */
	public void setSecondChanceEnabled(Boolean secondChanceEnabled) {
	    this.secondChanceEnabled = secondChanceEnabled;
	}
	/**
     * public getter
     *
     * 
     * Unique ID identifying the currency in which the localized offer amounts are
     * expressed.
     * 
     *
     * @returns ebay.apis.eblbasecomponents.CurrencyCodeType
	 */
	public CurrencyCodeType getSiteCurrency() {
	    return this.siteCurrency;
	}
	
	/**
	 * public setter
	 *
     * 
     * Unique ID identifying the currency in which the localized offer amounts are
     * expressed.
     * 
     *
     * @param ebay.apis.eblbasecomponents.CurrencyCodeType
	 */
	public void setSiteCurrency(CurrencyCodeType siteCurrency) {
	    this.siteCurrency = siteCurrency;
	}
	/**
     * public getter
     *
     * 
     * Date and time the offer or bid was placed.
     * 
     *
     * @returns java.util.Date
	 */
	public Date getTimeBid() {
	    return this.timeBid;
	}
	
	/**
	 * public setter
	 *
     * 
     * Date and time the offer or bid was placed.
     * 
     *
     * @param java.util.Date
	 */
	public void setTimeBid(Date timeBid) {
	    this.timeBid = timeBid;
	}
	/**
     * public getter
     *
     * 
     * Amount the highest bidder has bid on the item. Applicable to only
     * auction listings where there is progressive bidding
     * and winning bidders are determined based on the highest bid.
     * 
     *
     * @returns ebay.apis.eblbasecomponents.AmountType
	 */
	public AmountType getHighestBid() {
	    return this.highestBid;
	}
	
	/**
	 * public setter
	 *
     * 
     * Amount the highest bidder has bid on the item. Applicable to only
     * auction listings where there is progressive bidding
     * and winning bidders are determined based on the highest bid.
     * 
     *
     * @param ebay.apis.eblbasecomponents.AmountType
	 */
	public void setHighestBid(AmountType highestBid) {
	    this.highestBid = highestBid;
	}
	/**
     * public getter
     *
     * 
     * Localized amount for the item's current price.
     * 
     *
     * @returns ebay.apis.eblbasecomponents.AmountType
	 */
	public AmountType getConvertedPrice() {
	    return this.convertedPrice;
	}
	
	/**
	 * public setter
	 *
     * 
     * Localized amount for the item's current price.
     * 
     *
     * @param ebay.apis.eblbasecomponents.AmountType
	 */
	public void setConvertedPrice(AmountType convertedPrice) {
	    this.convertedPrice = convertedPrice;
	}
	/**
     * public getter
     *
     * 
     * The unique identifier of the order line item (transaction). An order line item
     * is created when a winning bidder commits to purchasing an
     * item.
     * 
     *
     * @returns java.lang.String
	 */
	public String getTransactionID() {
	    return this.transactionID;
	}
	
	/**
	 * public setter
	 *
     * 
     * The unique identifier of the order line item (transaction). An order line item
     * is created when a winning bidder commits to purchasing an
     * item.
     * 
     *
     * @param java.lang.String
	 */
	public void setTransactionID(String transactionID) {
	    this.transactionID = transactionID;
	}
	/**
     * public getter
     *
     * 
     * Bidder information. See the schema documentation for <b>UserType</b> for details
     * on its properties and their meanings.
     * 
     *
     * @returns ebay.apis.eblbasecomponents.UserType
	 */
	public UserType getUser() {
	    return this.user;
	}
	
	/**
	 * public setter
	 *
     * 
     * Bidder information. See the schema documentation for <b>UserType</b> for details
     * on its properties and their meanings.
     * 
     *
     * @param ebay.apis.eblbasecomponents.UserType
	 */
	public void setUser(UserType user) {
	    this.user = user;
	}
	/**
     * public getter
     *
     * 
     * If true, confirms that the bidder read and agrees to eBay's
     * privacy policy. Applies if the subject item is in a category
     * that requires user consent. If user consent (that is,
     * confirmation that a bidder read and agrees to eBay's privacy
     * policy) is required for a category that the subject item is in,
     * this value must be true for a bid to occur.
     * 
     *
     * @returns java.lang.Boolean
	 */
	public Boolean getUserConsent() {
	    return this.userConsent;
	}
	
	/**
	 * public setter
	 *
     * 
     * If true, confirms that the bidder read and agrees to eBay's
     * privacy policy. Applies if the subject item is in a category
     * that requires user consent. If user consent (that is,
     * confirmation that a bidder read and agrees to eBay's privacy
     * policy) is required for a category that the subject item is in,
     * this value must be true for a bid to occur.
     * 
     *
     * @param java.lang.Boolean
	 */
	public void setUserConsent(Boolean userConsent) {
	    this.userConsent = userConsent;
	}
	/**
     * public getter
     *
     * 
     * Total number of offers the user has made on the item.
     * 
     *
     * @returns java.lang.Integer
	 */
	public Integer getBidCount() {
	    return this.bidCount;
	}
	
	/**
	 * public setter
	 *
     * 
     * Total number of offers the user has made on the item.
     * 
     *
     * @param java.lang.Integer
	 */
	public void setBidCount(Integer bidCount) {
	    this.bidCount = bidCount;
	}
	/**
     * public getter
     *
     * 
     * A message from the buyer to the seller. Applies if the buyer
     * is using <b>PlaceOffer</b> to perform a best-offer-related
     * action (Best Offer, counter offer, etc.).
     * 
     *
     * @returns java.lang.String
	 */
	public String getMessage() {
	    return this.message;
	}
	
	/**
	 * public setter
	 *
     * 
     * A message from the buyer to the seller. Applies if the buyer
     * is using <b>PlaceOffer</b> to perform a best-offer-related
     * action (Best Offer, counter offer, etc.).
     * 
     *
     * @param java.lang.String
	 */
	public void setMessage(String message) {
	    this.message = message;
	}
	/**
     * public getter
     *
     * 
     * The ID of a Best Offer on an item. Must be specified as input to <b>PlaceOffer</b> only if a
     * buyer is accepting or declining a seller's counter offer (and is not required for a
     * buyer's offer or counter offer).
     * 
     *
     * @returns java.lang.String
	 */
	public String getBestOfferID() {
	    return this.bestOfferID;
	}
	
	/**
	 * public setter
	 *
     * 
     * The ID of a Best Offer on an item. Must be specified as input to <b>PlaceOffer</b> only if a
     * buyer is accepting or declining a seller's counter offer (and is not required for a
     * buyer's offer or counter offer).
     * 
     *
     * @param java.lang.String
	 */
	public void setBestOfferID(String bestOfferID) {
	    this.bestOfferID = bestOfferID;
	}
	/**
     * public getter
     *
     * 
     * Maximum bid placed by the user making the call.
     * 
     *
     * @returns ebay.apis.eblbasecomponents.AmountType
	 */
	public AmountType getMyMaxBid() {
	    return this.myMaxBid;
	}
	
	/**
	 * public setter
	 *
     * 
     * Maximum bid placed by the user making the call.
     * 
     *
     * @param ebay.apis.eblbasecomponents.AmountType
	 */
	public void setMyMaxBid(AmountType myMaxBid) {
	    this.myMaxBid = myMaxBid;
	}

}