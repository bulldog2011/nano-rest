// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package ebay.apis.eblbasecomponents;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;

/**
 * Describes a Selling Manager Template
 * 
 */
public class SellingManagerProductSpecificsType implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element(name = "PrimaryCategoryID")
	private String primaryCategoryID;
	
	@Element(name = "Variations")
	private VariationsType variations;
	
	@Element(name = "ItemSpecifics")
	private NameValueListArrayType itemSpecifics;
	
    
	/**
     * public getter
     *
     * 
     * Category ID for a product with variations.
     * Only applicable (and required on input)
     * when Variations and/or ItemSpecifics is specified in the request
     * or returned in a response.
     * 
     *
     * @returns java.lang.String
	 */
	public String getPrimaryCategoryID() {
	    return this.primaryCategoryID;
	}
	
	/**
	 * public setter
	 *
     * 
     * Category ID for a product with variations.
     * Only applicable (and required on input)
     * when Variations and/or ItemSpecifics is specified in the request
     * or returned in a response.
     * 
     *
     * @param java.lang.String
	 */
	public void setPrimaryCategoryID(String primaryCategoryID) {
	    this.primaryCategoryID = primaryCategoryID;
	}
	/**
     * public getter
     *
     * 
     * Variations are multiple similar (but not identical) versions of the 
     * same product. For example, two shirt variations could have the same 
     * brand and sleeve style, but could vary by color and size 
     * (like "Blue, Large" and "Black, Medium"). 
     * On eBay, a single fixed-price (or Store Inventory Format) listing 
     * can include multiple variations.
     * Each variation can have its own quantity and price.
     * To determine which categories support variations, use GetCategoryFeatures.
     * 
     *
     * @returns ebay.apis.eblbasecomponents.VariationsType
	 */
	public VariationsType getVariations() {
	    return this.variations;
	}
	
	/**
	 * public setter
	 *
     * 
     * Variations are multiple similar (but not identical) versions of the 
     * same product. For example, two shirt variations could have the same 
     * brand and sleeve style, but could vary by color and size 
     * (like "Blue, Large" and "Black, Medium"). 
     * On eBay, a single fixed-price (or Store Inventory Format) listing 
     * can include multiple variations.
     * Each variation can have its own quantity and price.
     * To determine which categories support variations, use GetCategoryFeatures.
     * 
     *
     * @param ebay.apis.eblbasecomponents.VariationsType
	 */
	public void setVariations(VariationsType variations) {
	    this.variations = variations;
	}
	/**
     * public getter
     *
     * 
     * A list of custom Item Specifics for the product. 
     * Custom Item Specifics give sellers a structured way to describe 
     * details of their items in a name-value format. 
     * For example, a book could have
     * Item Specifics like Author=J.K. Rowling and Format=Hardcover.
     * To determine which categories support
     * custom Item Specifics, use GetCategoryFeatures.
     * 
     *
     * @returns ebay.apis.eblbasecomponents.NameValueListArrayType
	 */
	public NameValueListArrayType getItemSpecifics() {
	    return this.itemSpecifics;
	}
	
	/**
	 * public setter
	 *
     * 
     * A list of custom Item Specifics for the product. 
     * Custom Item Specifics give sellers a structured way to describe 
     * details of their items in a name-value format. 
     * For example, a book could have
     * Item Specifics like Author=J.K. Rowling and Format=Hardcover.
     * To determine which categories support
     * custom Item Specifics, use GetCategoryFeatures.
     * 
     *
     * @param ebay.apis.eblbasecomponents.NameValueListArrayType
	 */
	public void setItemSpecifics(NameValueListArrayType itemSpecifics) {
	    this.itemSpecifics = itemSpecifics;
	}

}