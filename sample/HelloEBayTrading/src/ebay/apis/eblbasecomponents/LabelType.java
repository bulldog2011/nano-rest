// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package ebay.apis.eblbasecomponents;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;

/**
 * 
 * This type is deprecated as the <b>GetProduct*</b> calls are no longer available.
 * 
 *       
 *      
 */
public class LabelType implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element(name = "Name")
	private String name;
	
	@Attribute  
	private Boolean visible;
	
    
	/**
     * public getter
     *
     * 
     *         
     * The label to display when presenting the attribute to a user
     * (e.g., "Title" or "Manufacturer"). <br>
     * <br>
     * The label is defined for the product, and is therefore not
     * necessarily the same as the label that is defined in the characteristic set
     * returned by another call like GetAttributesCS.<br>
     * <br>
     * <b>For GetProductSearchPage</b>: If the attribute's label is "Keyword",
     * it means you can enter the attribute's ID and a string value in the
     * SearchAttributes node of GetProductSearchResults,
     * and then eBay will search for the string against one or more attributes in the catalog.
     * For example, for strollers, GetProductSearchPage only returns a Keyword attribute
     * instead of separate Brand, Product Type, and Model attributes (for the US site).
     * So, you can use the single Keyword attribute to search against all of those attributes.<br>
     * <br>
     * 
     *
     * @returns java.lang.String
	 */
	public String getName() {
	    return this.name;
	}
	
	/**
	 * public setter
	 *
     * 
     *         
     * The label to display when presenting the attribute to a user
     * (e.g., "Title" or "Manufacturer"). <br>
     * <br>
     * The label is defined for the product, and is therefore not
     * necessarily the same as the label that is defined in the characteristic set
     * returned by another call like GetAttributesCS.<br>
     * <br>
     * <b>For GetProductSearchPage</b>: If the attribute's label is "Keyword",
     * it means you can enter the attribute's ID and a string value in the
     * SearchAttributes node of GetProductSearchResults,
     * and then eBay will search for the string against one or more attributes in the catalog.
     * For example, for strollers, GetProductSearchPage only returns a Keyword attribute
     * instead of separate Brand, Product Type, and Model attributes (for the US site).
     * So, you can use the single Keyword attribute to search against all of those attributes.<br>
     * <br>
     * 
     *
     * @param java.lang.String
	 */
	public void setName(String name) {
	    this.name = name;
	}
	/**
	 * public getter
	 *
     * @returns java.lang.Boolean
	 */
	public Boolean getVisible() {
	    return this.visible;
	}
	
	/**
	 * public setter
	 *
     * @param java.lang.Boolean
	 */
	public void setVisible(Boolean visible) {
	    this.visible = visible;
	}

}