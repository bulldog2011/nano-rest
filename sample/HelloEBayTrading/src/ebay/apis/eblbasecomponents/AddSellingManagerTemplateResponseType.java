// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package ebay.apis.eblbasecomponents;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;

/**
 * 
 * Contains values indicating template information for a newly-exported item.
 * 
 */
@RootElement(name = "AddSellingManagerTemplateResponse", namespace = "urn:ebay:apis:eBLBaseComponents")
public class AddSellingManagerTemplateResponseType extends AbstractResponseType implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element(name = "CategoryID")
	private Long categoryID;
	
	@Element(name = "Category2ID")
	private Long category2ID;
	
	@Element(name = "SaleTemplateID")
	private Long saleTemplateID;
	
	@Element(name = "SaleTemplateGroupID")
	private Long saleTemplateGroupID;
	
	@Element(name = "SaleTemplateName")
	private String saleTemplateName;
	
	@Element(name = "SellingManagerProductDetails")
	private SellingManagerProductDetailsType sellingManagerProductDetails;
	
	@Element(name = "Fees")
	private FeesType fees;
	
    
	/**
     * public getter
     *
     * 
     * ID of the primary category in which the item would be listed.
     * 
     *
     * @returns java.lang.Long
	 */
	public Long getCategoryID() {
	    return this.categoryID;
	}
	
	/**
	 * public setter
	 *
     * 
     * ID of the primary category in which the item would be listed.
     * 
     *
     * @param java.lang.Long
	 */
	public void setCategoryID(Long categoryID) {
	    this.categoryID = categoryID;
	}
	/**
     * public getter
     *
     * 
     * ID of the secondary category (if any) in which the item would be listed.
     * 
     *
     * @returns java.lang.Long
	 */
	public Long getCategory2ID() {
	    return this.category2ID;
	}
	
	/**
	 * public setter
	 *
     * 
     * ID of the secondary category (if any) in which the item would be listed.
     * 
     *
     * @param java.lang.Long
	 */
	public void setCategory2ID(Long category2ID) {
	    this.category2ID = category2ID;
	}
	/**
     * public getter
     *
     * 
     * The ID of the Selling Manager template. Store this value, for use in 
     * other Selling Manager calls.
     * 
     *
     * @returns java.lang.Long
	 */
	public Long getSaleTemplateID() {
	    return this.saleTemplateID;
	}
	
	/**
	 * public setter
	 *
     * 
     * The ID of the Selling Manager template. Store this value, for use in 
     * other Selling Manager calls.
     * 
     *
     * @param java.lang.Long
	 */
	public void setSaleTemplateID(Long saleTemplateID) {
	    this.saleTemplateID = saleTemplateID;
	}
	/**
     * public getter
     *
     * 
     * Ignore this value. For the output value that indicates the 
     * ID of the product associated with the template, 
     * use SellingManagerProductDetails.ProductID.
     * 
     *
     * @returns java.lang.Long
	 */
	public Long getSaleTemplateGroupID() {
	    return this.saleTemplateGroupID;
	}
	
	/**
	 * public setter
	 *
     * 
     * Ignore this value. For the output value that indicates the 
     * ID of the product associated with the template, 
     * use SellingManagerProductDetails.ProductID.
     * 
     *
     * @param java.lang.Long
	 */
	public void setSaleTemplateGroupID(Long saleTemplateGroupID) {
	    this.saleTemplateGroupID = saleTemplateGroupID;
	}
	/**
     * public getter
     *
     * 
     * The name of the template, as it will appear in Selling Manager Pro. 
     * This name is the input value you provided in the SaleTemplateName field. 
     * If you didn't specify a value for
     * SaleTemplateName, then Item.Title is used as the name.
     * 
     *
     * @returns java.lang.String
	 */
	public String getSaleTemplateName() {
	    return this.saleTemplateName;
	}
	
	/**
	 * public setter
	 *
     * 
     * The name of the template, as it will appear in Selling Manager Pro. 
     * This name is the input value you provided in the SaleTemplateName field. 
     * If you didn't specify a value for
     * SaleTemplateName, then Item.Title is used as the name.
     * 
     *
     * @param java.lang.String
	 */
	public void setSaleTemplateName(String saleTemplateName) {
	    this.saleTemplateName = saleTemplateName;
	}
	/**
     * public getter
     *
     * 
     * The details of the product with which the template is associated.
     * 
     *
     * @returns ebay.apis.eblbasecomponents.SellingManagerProductDetailsType
	 */
	public SellingManagerProductDetailsType getSellingManagerProductDetails() {
	    return this.sellingManagerProductDetails;
	}
	
	/**
	 * public setter
	 *
     * 
     * The details of the product with which the template is associated.
     * 
     *
     * @param ebay.apis.eblbasecomponents.SellingManagerProductDetailsType
	 */
	public void setSellingManagerProductDetails(SellingManagerProductDetailsType sellingManagerProductDetails) {
	    this.sellingManagerProductDetails = sellingManagerProductDetails;
	}
	/**
     * public getter
     *
     * 
     * Child elements contain the estimated listing fees for the new listing template.
     * Note that the fee will only be charged when an item is created from the template.
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
     * Child elements contain the estimated listing fees for the new listing template.
     * Note that the fee will only be charged when an item is created from the template.
     * The fees do not include the Final Value Fee (FVF), which cannot be determined
     * until an item is sold.
     * 
     *
     * @param ebay.apis.eblbasecomponents.FeesType
	 */
	public void setFees(FeesType fees) {
	    this.fees = fees;
	}

}