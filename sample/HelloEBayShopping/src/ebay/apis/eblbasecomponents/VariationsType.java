// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package ebay.apis.eblbasecomponents;

import com.leansoft.nano.annotation.*;
import java.util.List;

/**
 * 
 * Variations are multiple similar (but not identical) items in a 
 * single fixed-price (or Store Inventory Format) listing. 
 * For example, a single listing could contain multiple items of the 
 * same brand and model that vary by color and size (like "Blue, Large" and "Black, Medium"). Each variation can have its own quantity and 
 * price. For example, a listing could include 10 "Blue, Large" 
 * variations and 20 "Black, Medium" variations. 
 * 
 */
public class VariationsType   {

	@Element(name = "Variation")
	private List<VariationType> variation;
    
	@Element(name = "Pictures")
	private List<PicturesType> pictures;
    
	@Element(name = "VariationSpecificsSet")
	private NameValueListArrayType variationSpecificsSet;
    
	private List<Object> any;
    
    
	/**
     * public getter
     *
     * 
     * Contains data that distinguishes one variation from another.
     * For example, if the items vary by color and size, each Variation
     * node specifies a combination of one of those colors and 
     * sizes.
     * 
     *
     * @returns java.util.List<ebay.apis.eblbasecomponents.VariationType>
	 */
	public List<VariationType> getVariation() {
	    return this.variation;
	}
	
	/**
	 * public setter
	 *
     * 
     * Contains data that distinguishes one variation from another.
     * For example, if the items vary by color and size, each Variation
     * node specifies a combination of one of those colors and 
     * sizes.
     * 
     *
     * @param java.util.List<ebay.apis.eblbasecomponents.VariationType>
	 */
	public void setVariation(List<VariationType> variation) {
	    this.variation = variation;
	}
	/**
     * public getter
     *
     * 
     * Contains a set of pictures that correspond to one of the
     * variation specifics, such as Color. For example, if a listing
     * has blue and black color variations, a listing could specify the
     * name Color as an organizing mechanism for all the pictures, 
     * and then include a set of pictures for the blue variations and 
     * another set of pictures for the black variations.<br>
     * <br>
     * <span class="tablenote"><b>Note:</b> 
     * Only one Pictures node is currently returned for a listing.
     * However, the node has been defined as unbounded (repeatable) in 
     * the schema to allow for different use cases for some calls or sites 
     * in the future.</span>
     * 
     *
     * @returns java.util.List<ebay.apis.eblbasecomponents.PicturesType>
	 */
	public List<PicturesType> getPictures() {
	    return this.pictures;
	}
	
	/**
	 * public setter
	 *
     * 
     * Contains a set of pictures that correspond to one of the
     * variation specifics, such as Color. For example, if a listing
     * has blue and black color variations, a listing could specify the
     * name Color as an organizing mechanism for all the pictures, 
     * and then include a set of pictures for the blue variations and 
     * another set of pictures for the black variations.<br>
     * <br>
     * <span class="tablenote"><b>Note:</b> 
     * Only one Pictures node is currently returned for a listing.
     * However, the node has been defined as unbounded (repeatable) in 
     * the schema to allow for different use cases for some calls or sites 
     * in the future.</span>
     * 
     *
     * @param java.util.List<ebay.apis.eblbasecomponents.PicturesType>
	 */
	public void setPictures(List<PicturesType> pictures) {
	    this.pictures = pictures;
	}
	/**
     * public getter
     *
     * 
     * A list of all variation names and values that are defined on 
     * the item. This could include values that were previously
     * defined (but no longer for sale).<br>
     * <br>
     * eBay uses this list to configure variation selection widgets 
     * that appear on eBay's View Item page. 
     * For example, if Color and Size are names in the list, then
     * eBay's View Item page displays Color and Size drop-down lists 
     * to help a buyer choose a variation of interest.<br>
     * <br>
     * The order in which the names and values are returned
     * matches the order in which the selection widgets appear on
     * the View Item page.
     * For example, if the names "Color", then "Size", and then 
     * "Sleeve Style" are returned, the View Item page shows drop-down 
     * lists with those labels in that order. For "Size", if the values
     * returned are "S", "M", and then "L", the View Item page 
     * shows the values in that order in the Size drop-down list.
     * 
     *
     * @returns ebay.apis.eblbasecomponents.NameValueListArrayType
	 */
	public NameValueListArrayType getVariationSpecificsSet() {
	    return this.variationSpecificsSet;
	}
	
	/**
	 * public setter
	 *
     * 
     * A list of all variation names and values that are defined on 
     * the item. This could include values that were previously
     * defined (but no longer for sale).<br>
     * <br>
     * eBay uses this list to configure variation selection widgets 
     * that appear on eBay's View Item page. 
     * For example, if Color and Size are names in the list, then
     * eBay's View Item page displays Color and Size drop-down lists 
     * to help a buyer choose a variation of interest.<br>
     * <br>
     * The order in which the names and values are returned
     * matches the order in which the selection widgets appear on
     * the View Item page.
     * For example, if the names "Color", then "Size", and then 
     * "Sleeve Style" are returned, the View Item page shows drop-down 
     * lists with those labels in that order. For "Size", if the values
     * returned are "S", "M", and then "L", the View Item page 
     * shows the values in that order in the Size drop-down list.
     * 
     *
     * @param ebay.apis.eblbasecomponents.NameValueListArrayType
	 */
	public void setVariationSpecificsSet(NameValueListArrayType variationSpecificsSet) {
	    this.variationSpecificsSet = variationSpecificsSet;
	}
	/**
	 * public getter
	 *
     * @returns java.util.List<java.lang.Object>
	 */
	public List<Object> getAny() {
	    return this.any;
	}
	
	/**
	 * public setter
	 *
     * @param java.util.List<java.lang.Object>
	 */
	public void setAny(List<Object> any) {
	    this.any = any;
	}

}