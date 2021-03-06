// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package ebay.apis.eblbasecomponents;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;

/**
 * 
 * Indicates whether the seller making the request can list with certain features.
 * A seller's eligibility is determined by their feedback rating.
 * 
 */
public class FeatureEligibilityType implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element(name = "QualifiesForBuyItNow")
	private Boolean qualifiesForBuyItNow;
	
	@Element(name = "QualifiesForBuyItNowMultiple")
	private Boolean qualifiesForBuyItNowMultiple;
	
	@Element(name = "QualifiedForFixedPriceOneDayDuration")
	private Boolean qualifiedForFixedPriceOneDayDuration;
	
	@Element(name = "QualifiesForVariations")
	private Boolean qualifiesForVariations;
	
	@Element(name = "QualifiedForAuctionOneDayDuration")
	private Boolean qualifiedForAuctionOneDayDuration;
	
    
	/**
     * public getter
     *
     * 
     * Indicates whether the seller is eligible to list items with the 'BuyItNow' option.
     * A value of true means that the seller is eligible; a value of false indicates that
     * they are not eligible.
     * 
     *
     * @returns java.lang.Boolean
	 */
	public Boolean getQualifiesForBuyItNow() {
	    return this.qualifiesForBuyItNow;
	}
	
	/**
	 * public setter
	 *
     * 
     * Indicates whether the seller is eligible to list items with the 'BuyItNow' option.
     * A value of true means that the seller is eligible; a value of false indicates that
     * they are not eligible.
     * 
     *
     * @param java.lang.Boolean
	 */
	public void setQualifiesForBuyItNow(Boolean qualifiesForBuyItNow) {
	    this.qualifiesForBuyItNow = qualifiesForBuyItNow;
	}
	/**
     * public getter
     *
     * 
     * Indicates whether the seller is eligible to specify the 'BuyItNow' option for
     * multiple-item listings. A value of true means that the seller is eligible; a value
     * of false indicates that they are not eligible.
     * 
     *
     * @returns java.lang.Boolean
	 */
	public Boolean getQualifiesForBuyItNowMultiple() {
	    return this.qualifiesForBuyItNowMultiple;
	}
	
	/**
	 * public setter
	 *
     * 
     * Indicates whether the seller is eligible to specify the 'BuyItNow' option for
     * multiple-item listings. A value of true means that the seller is eligible; a value
     * of false indicates that they are not eligible.
     * 
     *
     * @param java.lang.Boolean
	 */
	public void setQualifiesForBuyItNowMultiple(Boolean qualifiesForBuyItNowMultiple) {
	    this.qualifiesForBuyItNowMultiple = qualifiesForBuyItNowMultiple;
	}
	/**
     * public getter
     *
     * 
     * Indicates whether the seller is eligible to list a fixed-price item with a one-day
     * listing duration. A value of true means that the seller is eligible; a value of false
     * indicates that the seller is not eligible. Note that this field only controls user
     * eligibility. The listing type and category must support this feature for this field to
     * be applicable.
     * 
     *
     * @returns java.lang.Boolean
	 */
	public Boolean getQualifiedForFixedPriceOneDayDuration() {
	    return this.qualifiedForFixedPriceOneDayDuration;
	}
	
	/**
	 * public setter
	 *
     * 
     * Indicates whether the seller is eligible to list a fixed-price item with a one-day
     * listing duration. A value of true means that the seller is eligible; a value of false
     * indicates that the seller is not eligible. Note that this field only controls user
     * eligibility. The listing type and category must support this feature for this field to
     * be applicable.
     * 
     *
     * @param java.lang.Boolean
	 */
	public void setQualifiedForFixedPriceOneDayDuration(Boolean qualifiedForFixedPriceOneDayDuration) {
	    this.qualifiedForFixedPriceOneDayDuration = qualifiedForFixedPriceOneDayDuration;
	}
	/**
     * public getter
     *
     * 
     * Indicates whether or not the seller is eligible to list
     * multi-variation items.
     * 
     *
     * @returns java.lang.Boolean
	 */
	public Boolean getQualifiesForVariations() {
	    return this.qualifiesForVariations;
	}
	
	/**
	 * public setter
	 *
     * 
     * Indicates whether or not the seller is eligible to list
     * multi-variation items.
     * 
     *
     * @param java.lang.Boolean
	 */
	public void setQualifiesForVariations(Boolean qualifiesForVariations) {
	    this.qualifiesForVariations = qualifiesForVariations;
	}
	/**
     * public getter
     *
     * 
     *                        Indicates whether the seller is eligible to list an auction item with a one day duration on this site.
     *                        Limitation: the Adult-Only and  Auto Vehicle categories do not support one day auctions, so the seller
     *                        cannot list items in these categories as one day auctions even if the seller has the eligibility.
     *                     
     *
     * @returns java.lang.Boolean
	 */
	public Boolean getQualifiedForAuctionOneDayDuration() {
	    return this.qualifiedForAuctionOneDayDuration;
	}
	
	/**
	 * public setter
	 *
     * 
     *                        Indicates whether the seller is eligible to list an auction item with a one day duration on this site.
     *                        Limitation: the Adult-Only and  Auto Vehicle categories do not support one day auctions, so the seller
     *                        cannot list items in these categories as one day auctions even if the seller has the eligibility.
     *                     
     *
     * @param java.lang.Boolean
	 */
	public void setQualifiedForAuctionOneDayDuration(Boolean qualifiedForAuctionOneDayDuration) {
	    this.qualifiedForAuctionOneDayDuration = qualifiedForAuctionOneDayDuration;
	}

}