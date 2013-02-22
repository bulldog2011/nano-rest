// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package ebay.apis.eblbasecomponents;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;
import java.util.List;

/**
 * 
 * This type is deprecated as <b>GetProduct*</b> calls were deprecated.
 * 
 * 
 */
public class SearchAttributesType implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element(name = "AttributeID")
	private int attributeID;
	
	@Element(name = "DateSpecifier")
	private DateSpecifierCodeType dateSpecifier;
	
	@Element(name = "RangeSpecifier")
	private RangeCodeType rangeSpecifier;
	
	@Element(name = "ValueList")
	private List<ValType> valueList;
	
    
	/**
     * public getter
     *
     * 
     * 
     * Unique identifier for the attribute within the characteristic set.
     * Required if SearchAttributes is specified.
     * 
     *
     * @returns .int
	 */
	public int getAttributeID() {
	    return this.attributeID;
	}
	
	/**
	 * public setter
	 *
     * 
     * 
     * Unique identifier for the attribute within the characteristic set.
     * Required if SearchAttributes is specified.
     * 
     *
     * @param .int
	 */
	public void setAttributeID(int attributeID) {
	    this.attributeID = attributeID;
	}
	/**
     * public getter
     *
     * 
     * 
     * Specifies the date sub-component that the attribute represents.
     * This only applies to date attributes.
     * Required when searching by date attributes.
     * Allows for separate text fields or drop-down lists to be rendered for
     * each sub-component. For example, the day, month, and year can be
     * rendered as separate drop-down lists.
     * 
     *
     * @returns ebay.apis.eblbasecomponents.DateSpecifierCodeType
	 */
	public DateSpecifierCodeType getDateSpecifier() {
	    return this.dateSpecifier;
	}
	
	/**
	 * public setter
	 *
     * 
     * 
     * Specifies the date sub-component that the attribute represents.
     * This only applies to date attributes.
     * Required when searching by date attributes.
     * Allows for separate text fields or drop-down lists to be rendered for
     * each sub-component. For example, the day, month, and year can be
     * rendered as separate drop-down lists.
     * 
     *
     * @param ebay.apis.eblbasecomponents.DateSpecifierCodeType
	 */
	public void setDateSpecifier(DateSpecifierCodeType dateSpecifier) {
	    this.dateSpecifier = dateSpecifier;
	}
	/**
     * public getter
     *
     * 
     * 
     * Indicates that the attribute represents the high or low end in a range,
     * such as a date range or a price range.
     * Required when searching on ranges.
     * 
     *
     * @returns ebay.apis.eblbasecomponents.RangeCodeType
	 */
	public RangeCodeType getRangeSpecifier() {
	    return this.rangeSpecifier;
	}
	
	/**
	 * public setter
	 *
     * 
     * 
     * Indicates that the attribute represents the high or low end in a range,
     * such as a date range or a price range.
     * Required when searching on ranges.
     * 
     *
     * @param ebay.apis.eblbasecomponents.RangeCodeType
	 */
	public void setRangeSpecifier(RangeCodeType rangeSpecifier) {
	    this.rangeSpecifier = rangeSpecifier;
	}
	/**
     * public getter
     *
     * 
     * 
     * Container for the list of one or more valid values that the
     * user has selected for
     * the searchable attribute. If multiple values are specified,
     * the search engine
     * applies "OR" logic to the query (i.e., at least one of the
     * specified values must match).
     * Required if SearchAttributes is specified.
     * 
     *
     * @returns java.util.List<ebay.apis.eblbasecomponents.ValType>
	 */
	public List<ValType> getValueList() {
	    return this.valueList;
	}
	
	/**
	 * public setter
	 *
     * 
     * 
     * Container for the list of one or more valid values that the
     * user has selected for
     * the searchable attribute. If multiple values are specified,
     * the search engine
     * applies "OR" logic to the query (i.e., at least one of the
     * specified values must match).
     * Required if SearchAttributes is specified.
     * 
     *
     * @param java.util.List<ebay.apis.eblbasecomponents.ValType>
	 */
	public void setValueList(List<ValType> valueList) {
	    this.valueList = valueList;
	}

}