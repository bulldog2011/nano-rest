// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package ebay.apis.eblbasecomponents;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;
import java.util.List;

/**
 * 
 * A salient aspect or feature of an item. On eBay.com, this information is used in the Item Specifics
 * section of a listing to describe an item
 * in a standard way so that buyers can find it more easily.
 * 
 */
public class AttributeType implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element(name = "Value")
	private List<ValType> value;
	
	@Attribute  
	private Integer attributeID;
	
	@Attribute  
	private String attributeLabel;
	
    
	/**
     * public getter
     *
     * 
     * A value the seller selected or entered for the attribute.
     * At least one value is required for each Attribute that you specify.
     * Some attributes can have multiple values.
     * See the eBay Web Services guide sections on
     * Item Specifics (Attributes) and Pre-filled Item Information (Catalogs)
     * for information about using GetAttributesCS to determine valid
     * attribute values.<br><br>
     * For eBay.com listings, use AttributeSetArray.AttributeSet.Attribute.Value.
     * For Half.com, use AttributeArray.Attribute.Value. That is, the parent elements
     * and usage for Half.com differs from
     * eBay's standard Item Specifics format (and there is no relationship to GetAttributesCS).
     * For Half.com, this does not use the same Attributes logic as eBay's Item Specifics.
     * For Half.com, AttributeArray.Attribute.Value is required when you use AddItem.
     * see the eBay Web Services Guide for valid values.
     * You can revise AttributeArray.Attribute.Value for Half.com listings.
     * 
     *
     * @returns java.util.List<ebay.apis.eblbasecomponents.ValType>
	 */
	public List<ValType> getValue() {
	    return this.value;
	}
	
	/**
	 * public setter
	 *
     * 
     * A value the seller selected or entered for the attribute.
     * At least one value is required for each Attribute that you specify.
     * Some attributes can have multiple values.
     * See the eBay Web Services guide sections on
     * Item Specifics (Attributes) and Pre-filled Item Information (Catalogs)
     * for information about using GetAttributesCS to determine valid
     * attribute values.<br><br>
     * For eBay.com listings, use AttributeSetArray.AttributeSet.Attribute.Value.
     * For Half.com, use AttributeArray.Attribute.Value. That is, the parent elements
     * and usage for Half.com differs from
     * eBay's standard Item Specifics format (and there is no relationship to GetAttributesCS).
     * For Half.com, this does not use the same Attributes logic as eBay's Item Specifics.
     * For Half.com, AttributeArray.Attribute.Value is required when you use AddItem.
     * see the eBay Web Services Guide for valid values.
     * You can revise AttributeArray.Attribute.Value for Half.com listings.
     * 
     *
     * @param java.util.List<ebay.apis.eblbasecomponents.ValType>
	 */
	public void setValue(List<ValType> value) {
	    this.value = value;
	}
	/**
	 * public getter
	 *
     * @returns java.lang.Integer
	 */
	public Integer getAttributeID() {
	    return this.attributeID;
	}
	
	/**
	 * public setter
	 *
     * @param java.lang.Integer
	 */
	public void setAttributeID(Integer attributeID) {
	    this.attributeID = attributeID;
	}
	/**
	 * public getter
	 *
     * @returns java.lang.String
	 */
	public String getAttributeLabel() {
	    return this.attributeLabel;
	}
	
	/**
	 * public setter
	 *
     * @param java.lang.String
	 */
	public void setAttributeLabel(String attributeLabel) {
	    this.attributeLabel = attributeLabel;
	}

}