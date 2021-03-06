// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package ebay.apis.eblbasecomponents;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;

/**
 * 
 * This type is deprecated as the eBay Express is no longer available.
 * 
 * 
 */
public class ExpressItemRequirementsType implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element(name = "SellerExpressEligible")
	private Boolean sellerExpressEligible;
	
	@Element(name = "ExpressOptOut")
	private Boolean expressOptOut;
	
	@Element(name = "ExpressApproved")
	private Boolean expressApproved;
	
	@Element(name = "ExpressEligibleListingType")
	private Boolean expressEligibleListingType;
	
	@Element(name = "ExpressEnabledCategory")
	private Boolean expressEnabledCategory;
	
	@Element(name = "EligiblePayPalAccount")
	private Boolean eligiblePayPalAccount;
	
	@Element(name = "DomesticShippingCost")
	private Boolean domesticShippingCost;
	
	@Element(name = "EligibleReturnPolicy")
	private Boolean eligibleReturnPolicy;
	
	@Element(name = "Picture")
	private Boolean picture;
	
	@Element(name = "EligibleItemCondition")
	private Boolean eligibleItemCondition;
	
	@Element(name = "PriceAboveMinimum")
	private Boolean priceAboveMinimum;
	
	@Element(name = "PriceBelowMaximum")
	private Boolean priceBelowMaximum;
	
	@Element(name = "EligibleCheckout")
	private Boolean eligibleCheckout;
	
	@Element(name = "NoPreapprovedBidderList")
	private Boolean noPreapprovedBidderList;
	
	@Element(name = "NoCharity")
	private Boolean noCharity;
	
	@Element(name = "CombinedShippingDiscount")
	private Boolean combinedShippingDiscount;
	
	@Element(name = "ShipFromEligibleCountry")
	private Boolean shipFromEligibleCountry;
	
	@Element(name = "PayPalAccountAcceptsUnconfirmedAddress")
	private Boolean payPalAccountAcceptsUnconfirmedAddress;
	
    
	/**
     * public getter
     *
     * 
     * 
     * If false, indicates that an item is not Express-eligible because
     * the seller is not Express-eligible. Only returned if false,
     * and no other settings are returned in this case.
     * 
     *
     * @returns java.lang.Boolean
	 */
	public Boolean getSellerExpressEligible() {
	    return this.sellerExpressEligible;
	}
	
	/**
	 * public setter
	 *
     * 
     * 
     * If false, indicates that an item is not Express-eligible because
     * the seller is not Express-eligible. Only returned if false,
     * and no other settings are returned in this case.
     * 
     *
     * @param java.lang.Boolean
	 */
	public void setSellerExpressEligible(Boolean sellerExpressEligible) {
	    this.sellerExpressEligible = sellerExpressEligible;
	}
	/**
     * public getter
     *
     * 
     * 
     * If true, this field indicates the item was opted out of Express;
     * that is, ExpressOptOut was true in the listing request.
     * Only returned if true, and no other settings are returned in this case.
     * 
     *
     * @returns java.lang.Boolean
	 */
	public Boolean getExpressOptOut() {
	    return this.expressOptOut;
	}
	
	/**
	 * public setter
	 *
     * 
     * 
     * If true, this field indicates the item was opted out of Express;
     * that is, ExpressOptOut was true in the listing request.
     * Only returned if true, and no other settings are returned in this case.
     * 
     *
     * @param java.lang.Boolean
	 */
	public void setExpressOptOut(Boolean expressOptOut) {
	    this.expressOptOut = expressOptOut;
	}
	/**
     * public getter
     *
     * 
     * 
     * If true, indicates eBay has marked the item as eligible for
     * eBay Express based on direct evaluation. Only returned if true,
     * and no other settings are returned in this case.
     * 
     *
     * @returns java.lang.Boolean
	 */
	public Boolean getExpressApproved() {
	    return this.expressApproved;
	}
	
	/**
	 * public setter
	 *
     * 
     * 
     * If true, indicates eBay has marked the item as eligible for
     * eBay Express based on direct evaluation. Only returned if true,
     * and no other settings are returned in this case.
     * 
     *
     * @param java.lang.Boolean
	 */
	public void setExpressApproved(Boolean expressApproved) {
	    this.expressApproved = expressApproved;
	}
	/**
     * public getter
     *
     * 
     * 
     * If true, indicates the item listing format is eligible for Express.
     * If false, the listing format is ineligible (and the item is therefore
     * ineligible).
     * 
     *
     * @returns java.lang.Boolean
	 */
	public Boolean getExpressEligibleListingType() {
	    return this.expressEligibleListingType;
	}
	
	/**
	 * public setter
	 *
     * 
     * 
     * If true, indicates the item listing format is eligible for Express.
     * If false, the listing format is ineligible (and the item is therefore
     * ineligible).
     * 
     *
     * @param java.lang.Boolean
	 */
	public void setExpressEligibleListingType(Boolean expressEligibleListingType) {
	    this.expressEligibleListingType = expressEligibleListingType;
	}
	/**
     * public getter
     *
     * 
     * 
     * If true, the item's primary category is enabled for Express.
     * If false, the primary category is not enabled for Express
     * (and the item is therefore ineligible).
     * 
     *
     * @returns java.lang.Boolean
	 */
	public Boolean getExpressEnabledCategory() {
	    return this.expressEnabledCategory;
	}
	
	/**
	 * public setter
	 *
     * 
     * 
     * If true, the item's primary category is enabled for Express.
     * If false, the primary category is not enabled for Express
     * (and the item is therefore ineligible).
     * 
     *
     * @param java.lang.Boolean
	 */
	public void setExpressEnabledCategory(Boolean expressEnabledCategory) {
	    this.expressEnabledCategory = expressEnabledCategory;
	}
	/**
     * public getter
     *
     * 
     * 
     * If true, the seller has an Express-eligible PayPal account.
     * 
     *
     * @returns java.lang.Boolean
	 */
	public Boolean getEligiblePayPalAccount() {
	    return this.eligiblePayPalAccount;
	}
	
	/**
	 * public setter
	 *
     * 
     * 
     * If true, the seller has an Express-eligible PayPal account.
     * 
     *
     * @param java.lang.Boolean
	 */
	public void setEligiblePayPalAccount(Boolean eligiblePayPalAccount) {
	    this.eligiblePayPalAccount = eligiblePayPalAccount;
	}
	/**
     * public getter
     *
     * 
     * 
     * If true, domestic shipping costs are specified for the item.
     * If false, they aren't specified (and the item is therefore ineligible).
     * 
     *
     * @returns java.lang.Boolean
	 */
	public Boolean getDomesticShippingCost() {
	    return this.domesticShippingCost;
	}
	
	/**
	 * public setter
	 *
     * 
     * 
     * If true, domestic shipping costs are specified for the item.
     * If false, they aren't specified (and the item is therefore ineligible).
     * 
     *
     * @param java.lang.Boolean
	 */
	public void setDomesticShippingCost(Boolean domesticShippingCost) {
	    this.domesticShippingCost = domesticShippingCost;
	}
	/**
     * public getter
     *
     * 
     * 
     * If true, the item is covered by a return policy that meets
     * the site's requirements for Express.
     * Only returned for Express Germany. (A return policy is optional for
     * Express US.)
     * 
     *
     * @returns java.lang.Boolean
	 */
	public Boolean getEligibleReturnPolicy() {
	    return this.eligibleReturnPolicy;
	}
	
	/**
	 * public setter
	 *
     * 
     * 
     * If true, the item is covered by a return policy that meets
     * the site's requirements for Express.
     * Only returned for Express Germany. (A return policy is optional for
     * Express US.)
     * 
     *
     * @param java.lang.Boolean
	 */
	public void setEligibleReturnPolicy(Boolean eligibleReturnPolicy) {
	    this.eligibleReturnPolicy = eligibleReturnPolicy;
	}
	/**
     * public getter
     *
     * 
     * 
     * If true, the item includes a picture.
     * If false, the item doesn't include a picture.
     * Only returned if the category requires a picture for Express.
     * Some categories waive the picture requirement.
     * 
     *
     * @returns java.lang.Boolean
	 */
	public Boolean getPicture() {
	    return this.picture;
	}
	
	/**
	 * public setter
	 *
     * 
     * 
     * If true, the item includes a picture.
     * If false, the item doesn't include a picture.
     * Only returned if the category requires a picture for Express.
     * Some categories waive the picture requirement.
     * 
     *
     * @param java.lang.Boolean
	 */
	public void setPicture(Boolean picture) {
	    this.picture = picture;
	}
	/**
     * public getter
     *
     * 
     * 
     * If true, the item specifies an eligible item condition.
     * If false, the item doesn't specify an eligible item condition.
     * Only returned if the category requires an item condition for Express.
     * Some categories waive the item condition requirement.
     * 
     *
     * @returns java.lang.Boolean
	 */
	public Boolean getEligibleItemCondition() {
	    return this.eligibleItemCondition;
	}
	
	/**
	 * public setter
	 *
     * 
     * 
     * If true, the item specifies an eligible item condition.
     * If false, the item doesn't specify an eligible item condition.
     * Only returned if the category requires an item condition for Express.
     * Some categories waive the item condition requirement.
     * 
     *
     * @param java.lang.Boolean
	 */
	public void setEligibleItemCondition(Boolean eligibleItemCondition) {
	    this.eligibleItemCondition = eligibleItemCondition;
	}
	/**
     * public getter
     *
     * 
     * 
     * If true, the price of the item is above the minimum price allowed on
     * Express. That is, the StartPrice, BuyItNowPrice,
     * or CurrentPrice is above the minimum.)
     * 
     *
     * @returns java.lang.Boolean
	 */
	public Boolean getPriceAboveMinimum() {
	    return this.priceAboveMinimum;
	}
	
	/**
	 * public setter
	 *
     * 
     * 
     * If true, the price of the item is above the minimum price allowed on
     * Express. That is, the StartPrice, BuyItNowPrice,
     * or CurrentPrice is above the minimum.)
     * 
     *
     * @param java.lang.Boolean
	 */
	public void setPriceAboveMinimum(Boolean priceAboveMinimum) {
	    this.priceAboveMinimum = priceAboveMinimum;
	}
	/**
     * public getter
     *
     * 
     * 
     * If true, the price of the item is below the maximum price
     * allowed on Express. (That is, the StartPrice, BuyItNowPrice,
     * or CurrentPrice is below the maximum.)
     * 
     *
     * @returns java.lang.Boolean
	 */
	public Boolean getPriceBelowMaximum() {
	    return this.priceBelowMaximum;
	}
	
	/**
	 * public setter
	 *
     * 
     * 
     * If true, the price of the item is below the maximum price
     * allowed on Express. (That is, the StartPrice, BuyItNowPrice,
     * or CurrentPrice is below the maximum.)
     * 
     *
     * @param java.lang.Boolean
	 */
	public void setPriceBelowMaximum(Boolean priceBelowMaximum) {
	    this.priceBelowMaximum = priceBelowMaximum;
	}
	/**
     * public getter
     *
     * 
     * 
     * If true, indicates the item meets the site's eBay Express
     * requirements for checkout. (A common case when this could be false
     * would be when ThirdPartyCheckout is true but
     * ThirdPartyCheckoutIntegration is false.)
     * 
     *
     * @returns java.lang.Boolean
	 */
	public Boolean getEligibleCheckout() {
	    return this.eligibleCheckout;
	}
	
	/**
	 * public setter
	 *
     * 
     * 
     * If true, indicates the item meets the site's eBay Express
     * requirements for checkout. (A common case when this could be false
     * would be when ThirdPartyCheckout is true but
     * ThirdPartyCheckoutIntegration is false.)
     * 
     *
     * @param java.lang.Boolean
	 */
	public void setEligibleCheckout(Boolean eligibleCheckout) {
	    this.eligibleCheckout = eligibleCheckout;
	}
	/**
     * public getter
     *
     * 
     * 
     * If true, the item has no pre-approved bidder list.
     * 
     *
     * @returns java.lang.Boolean
	 */
	public Boolean getNoPreapprovedBidderList() {
	    return this.noPreapprovedBidderList;
	}
	
	/**
	 * public setter
	 *
     * 
     * 
     * If true, the item has no pre-approved bidder list.
     * 
     *
     * @param java.lang.Boolean
	 */
	public void setNoPreapprovedBidderList(Boolean noPreapprovedBidderList) {
	    this.noPreapprovedBidderList = noPreapprovedBidderList;
	}
	/**
     * public getter
     *
     * 
     * 
     * If true, the item is not an eBay Giving Works item.
     * Only returned if the site does not allow charity listings on Express.
     * (In other words, if the site excludes charity listings from Express,
     * then NoCharity=true means the item meets the eligibility requirement.)
     * 
     *
     * @returns java.lang.Boolean
	 */
	public Boolean getNoCharity() {
	    return this.noCharity;
	}
	
	/**
	 * public setter
	 *
     * 
     * 
     * If true, the item is not an eBay Giving Works item.
     * Only returned if the site does not allow charity listings on Express.
     * (In other words, if the site excludes charity listings from Express,
     * then NoCharity=true means the item meets the eligibility requirement.)
     * 
     *
     * @param java.lang.Boolean
	 */
	public void setNoCharity(Boolean noCharity) {
	    this.noCharity = noCharity;
	}
	/**
     * public getter
     *
     * 
     * 
     * If true, the item offers a combined shipping discount.
     * Only returned if the Express site has an item-level
     * combined shipping discount requirement.
     * (Some Express sites only require you to accept combined payments
     * at the seller level, in your My eBay preferences.)
     * 
     *
     * @returns java.lang.Boolean
	 */
	public Boolean getCombinedShippingDiscount() {
	    return this.combinedShippingDiscount;
	}
	
	/**
	 * public setter
	 *
     * 
     * 
     * If true, the item offers a combined shipping discount.
     * Only returned if the Express site has an item-level
     * combined shipping discount requirement.
     * (Some Express sites only require you to accept combined payments
     * at the seller level, in your My eBay preferences.)
     * 
     *
     * @param java.lang.Boolean
	 */
	public void setCombinedShippingDiscount(Boolean combinedShippingDiscount) {
	    this.combinedShippingDiscount = combinedShippingDiscount;
	}
	/**
     * public getter
     *
     * 
     * 
     * If true, the country you specified for the item meets the
     * specified site's shipping origin requirements for Express.
     * 
     *
     * @returns java.lang.Boolean
	 */
	public Boolean getShipFromEligibleCountry() {
	    return this.shipFromEligibleCountry;
	}
	
	/**
	 * public setter
	 *
     * 
     * 
     * If true, the country you specified for the item meets the
     * specified site's shipping origin requirements for Express.
     * 
     *
     * @param java.lang.Boolean
	 */
	public void setShipFromEligibleCountry(Boolean shipFromEligibleCountry) {
	    this.shipFromEligibleCountry = shipFromEligibleCountry;
	}
	/**
     * public getter
     *
     * 
     * 
     * If true, the PayPal account for the item accepts payments
     * from a buyer with an unconfirmed address. If false, the
     * account blocks unconfirmed addresses (and the item is therefore
     * ineligible).
     * 
     *
     * @returns java.lang.Boolean
	 */
	public Boolean getPayPalAccountAcceptsUnconfirmedAddress() {
	    return this.payPalAccountAcceptsUnconfirmedAddress;
	}
	
	/**
	 * public setter
	 *
     * 
     * 
     * If true, the PayPal account for the item accepts payments
     * from a buyer with an unconfirmed address. If false, the
     * account blocks unconfirmed addresses (and the item is therefore
     * ineligible).
     * 
     *
     * @param java.lang.Boolean
	 */
	public void setPayPalAccountAcceptsUnconfirmedAddress(Boolean payPalAccountAcceptsUnconfirmedAddress) {
	    this.payPalAccountAcceptsUnconfirmedAddress = payPalAccountAcceptsUnconfirmedAddress;
	}

}