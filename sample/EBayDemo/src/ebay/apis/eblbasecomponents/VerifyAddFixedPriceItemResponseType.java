// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package ebay.apis.eblbasecomponents;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;
import java.util.List;

/**
 * 
 * Returns the estimated fees that would be applicable for a new listing
 * (were the item actually listed to eBay with AddItem).
 * 
 */
@RootElement(name = "VerifyAddFixedPriceItemResponse", namespace = "urn:ebay:apis:eBLBaseComponents")
public class VerifyAddFixedPriceItemResponseType extends AbstractResponseType implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element(name = "ItemID")
	private String itemID;
	
	@Element(name = "SKU")
	private String sku;
	
	@Element(name = "Fees")
	private FeesType fees;
	
	@Element(name = "ExpressListing")
	private Boolean expressListing;
	
	@Element(name = "ExpressItemRequirements")
	private ExpressItemRequirementsType expressItemRequirements;
	
	@Element(name = "CategoryID")
	private String categoryID;
	
	@Element(name = "Category2ID")
	private String category2ID;
	
	@Element(name = "DiscountReason")
	private List<DiscountReasonCodeType> discountReason;
	
    
	/**
     * public getter
     *
     * 
     * Represents the item ID for the new fixed-price listing. VerifyAddFixedPriceItem does not
     * actually list an item, so 0 is returned instead of a normal item ID.
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
     * Represents the item ID for the new fixed-price listing. VerifyAddFixedPriceItem does not
     * actually list an item, so 0 is returned instead of a normal item ID.
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
     * Item-level SKU for the new listing, if the seller specified
     * tem.SKU in the request. Variation SKUs are not returned
     * (see GetItem instead).
     * 
     *
     * @returns java.lang.String
	 */
	public String getSku() {
	    return this.sku;
	}
	
	/**
	 * public setter
	 *
     * 
     * Item-level SKU for the new listing, if the seller specified
     * tem.SKU in the request. Variation SKUs are not returned
     * (see GetItem instead).
     * 
     *
     * @param java.lang.String
	 */
	public void setSku(String sku) {
	    this.sku = sku;
	}
	/**
     * public getter
     *
     * 
     * Child elements contain the estimated listing fees for the new item listing.
     * The fees do not include the Final Value Fee (FVF), which cannot be determined
     * until an item is sold.
     * 
     *
     * @returns ebay.apis.eblbasecomponents.FeesType
	 */
	public FeesType getFees() {
	    return this.fees;
	}
	
	/**
	 * public setter
	 *
     * 
     * Child elements contain the estimated listing fees for the new item listing.
     * The fees do not include the Final Value Fee (FVF), which cannot be determined
     * until an item is sold.
     * 
     *
     * @param ebay.apis.eblbasecomponents.FeesType
	 */
	public void setFees(FeesType fees) {
	    this.fees = fees;
	}
	/**
     * public getter
     *
     * 
     * Indicates whether the item would be listed on eBay Express.
     * See ExpressItemRequirements for hints about why this
     * value is true or false for a given item.
     * 
     *
     * @returns java.lang.Boolean
	 */
	public Boolean getExpressListing() {
	    return this.expressListing;
	}
	
	/**
	 * public setter
	 *
     * 
     * Indicates whether the item would be listed on eBay Express.
     * See ExpressItemRequirements for hints about why this
     * value is true or false for a given item.
     * 
     *
     * @param java.lang.Boolean
	 */
	public void setExpressListing(Boolean expressListing) {
	    this.expressListing = expressListing;
	}
	/**
     * public getter
     *
     * 
     * Contains details about why an item does or doesn't
     * qualify as an eBay Express listing. Only returned when
     * IncludeExpressRequirements is true the request.<br>
     * <br>
     * The item requirements are assessed in this order:<br>
     * - SellerExpressEligible<br>
     * - ExpressOptOut<br>
     * - ExpressApproved<br>
     * - All other settings
     * 
     *
     * @returns ebay.apis.eblbasecomponents.ExpressItemRequirementsType
	 */
	public ExpressItemRequirementsType getExpressItemRequirements() {
	    return this.expressItemRequirements;
	}
	
	/**
	 * public setter
	 *
     * 
     * Contains details about why an item does or doesn't
     * qualify as an eBay Express listing. Only returned when
     * IncludeExpressRequirements is true the request.<br>
     * <br>
     * The item requirements are assessed in this order:<br>
     * - SellerExpressEligible<br>
     * - ExpressOptOut<br>
     * - ExpressApproved<br>
     * - All other settings
     * 
     *
     * @param ebay.apis.eblbasecomponents.ExpressItemRequirementsType
	 */
	public void setExpressItemRequirements(ExpressItemRequirementsType expressItemRequirements) {
	    this.expressItemRequirements = expressItemRequirements;
	}
	/**
     * public getter
     *
     * 
     * ID of the primary category in which the item would be listed.
     * Only returned if you set Item.CategoryMappingAllowed to true in the request
     * and the ID you passed in PrimaryCategory was mapped to a new ID by eBay.
     * If the primary category has not changed or it has expired with no replacement,
     * CategoryID does not return a value.
     * 
     *
     * @returns java.lang.String
	 */
	public String getCategoryID() {
	    return this.categoryID;
	}
	
	/**
	 * public setter
	 *
     * 
     * ID of the primary category in which the item would be listed.
     * Only returned if you set Item.CategoryMappingAllowed to true in the request
     * and the ID you passed in PrimaryCategory was mapped to a new ID by eBay.
     * If the primary category has not changed or it has expired with no replacement,
     * CategoryID does not return a value.
     * 
     *
     * @param java.lang.String
	 */
	public void setCategoryID(String categoryID) {
	    this.categoryID = categoryID;
	}
	/**
     * public getter
     *
     * 
     * ID of the secondary category in which the item would be listed.
     * Only returned if you set Item.CategoryMappingAllowed to true in the request
     * and the ID you passed in SecondaryCategory was mapped to a new ID by eBay.
     * If the secondary category has not changed or it has expired with no replacement,
     * Category2ID does not return a value.
     * 
     *
     * @returns java.lang.String
	 */
	public String getCategory2ID() {
	    return this.category2ID;
	}
	
	/**
	 * public setter
	 *
     * 
     * ID of the secondary category in which the item would be listed.
     * Only returned if you set Item.CategoryMappingAllowed to true in the request
     * and the ID you passed in SecondaryCategory was mapped to a new ID by eBay.
     * If the secondary category has not changed or it has expired with no replacement,
     * Category2ID does not return a value.
     * 
     *
     * @param java.lang.String
	 */
	public void setCategory2ID(String category2ID) {
	    this.category2ID = category2ID;
	}
	/**
     * public getter
     *
     * 
     * The nature of the discount, if a discount would have applied
     * had this actually been listed at this time.
     * 
     *
     * @returns java.util.List<ebay.apis.eblbasecomponents.DiscountReasonCodeType>
	 */
	public List<DiscountReasonCodeType> getDiscountReason() {
	    return this.discountReason;
	}
	
	/**
	 * public setter
	 *
     * 
     * The nature of the discount, if a discount would have applied
     * had this actually been listed at this time.
     * 
     *
     * @param java.util.List<ebay.apis.eblbasecomponents.DiscountReasonCodeType>
	 */
	public void setDiscountReason(List<DiscountReasonCodeType> discountReason) {
	    this.discountReason = discountReason;
	}

}