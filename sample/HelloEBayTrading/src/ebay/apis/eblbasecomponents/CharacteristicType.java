// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package ebay.apis.eblbasecomponents;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;
import java.util.List;

/**
 * 
 * This type is deprecated as the <b>GetProduct*</b> calls are no longer available.
 * 
 * 
 */
public class CharacteristicType implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element(name = "AttributeID")
	private int attributeID;
	
	@Element(name = "DateFormat")
	private String dateFormat;
	
	@Element(name = "DisplaySequence")
	private String displaySequence;
	
	@Element(name = "DisplayUOM")
	private String displayUOM;
	
	@Element(name = "Label")
	private LabelType label;
	
	@Element(name = "SortOrder")
	private SortOrderCodeType sortOrder;
	
	@Element(name = "ValueList")
	private List<ValType> valueList;
	
    
	/**
     * public getter
     *
     * 
     * 
     * Constant value that identifies the characteristic in a language-independent way.
     * Unique within the characteristic set.
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
     * Constant value that identifies the characteristic in a language-independent way.
     * Unique within the characteristic set.
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
     * Applicable when working with Pre-filled Item Information (Catalogs) functionality.
     * Returned if the characteristic is a Date data type. Specifies the pattern
     * to use when presenting the date to a user. Possible values:
     * Day/Month/Year, Month/Year, Year Only.
     * For example, the Year Only format would indicate that the date
     * should be a value like 1999.
     * Output only.
     * 
     *
     * @returns java.lang.String
	 */
	public String getDateFormat() {
	    return this.dateFormat;
	}
	
	/**
	 * public setter
	 *
     * 
     * 
     * Applicable when working with Pre-filled Item Information (Catalogs) functionality.
     * Returned if the characteristic is a Date data type. Specifies the pattern
     * to use when presenting the date to a user. Possible values:
     * Day/Month/Year, Month/Year, Year Only.
     * For example, the Year Only format would indicate that the date
     * should be a value like 1999.
     * Output only.
     * 
     *
     * @param java.lang.String
	 */
	public void setDateFormat(String dateFormat) {
	    this.dateFormat = dateFormat;
	}
	/**
     * public getter
     *
     * 
     * 
     * The suggested order in which the characteristic should be presented
     * to the user in a list. Indicates the relative position of the sort
     * key in the list of characteristics. The characteristic with the
     * lowest display sequence is considered the default sort key in calls
     * to GetProductSearchResults. Aside from that, usage of this display
     * sequence information is optional. For example, in an application
     * with a graphical user interface, a characteristic with a display
     * sequence of 2 could be presented before one with a display sequence
     * of 3 in a drop-down list. If multiple sort characteristics are
     * returned for a characteristic set, compare their display sequence
     * values to determine the lowest available value (usually 0) and the
     * overall sequence.
     * 
     *
     * @returns java.lang.String
	 */
	public String getDisplaySequence() {
	    return this.displaySequence;
	}
	
	/**
	 * public setter
	 *
     * 
     * 
     * The suggested order in which the characteristic should be presented
     * to the user in a list. Indicates the relative position of the sort
     * key in the list of characteristics. The characteristic with the
     * lowest display sequence is considered the default sort key in calls
     * to GetProductSearchResults. Aside from that, usage of this display
     * sequence information is optional. For example, in an application
     * with a graphical user interface, a characteristic with a display
     * sequence of 2 could be presented before one with a display sequence
     * of 3 in a drop-down list. If multiple sort characteristics are
     * returned for a characteristic set, compare their display sequence
     * values to determine the lowest available value (usually 0) and the
     * overall sequence.
     * 
     *
     * @param java.lang.String
	 */
	public void setDisplaySequence(String displaySequence) {
	    this.displaySequence = displaySequence;
	}
	/**
     * public getter
     *
     * 
     * 
     * Applicable when working with Pre-filled Item Information (Catalogs) functionality.
     * The unit of measure (e.g., Inch) to use when the characteristic is numeric indicates a measurement.
     * Not returned if not applicable.
     * Output only.
     * 
     *
     * @returns java.lang.String
	 */
	public String getDisplayUOM() {
	    return this.displayUOM;
	}
	
	/**
	 * public setter
	 *
     * 
     * 
     * Applicable when working with Pre-filled Item Information (Catalogs) functionality.
     * The unit of measure (e.g., Inch) to use when the characteristic is numeric indicates a measurement.
     * Not returned if not applicable.
     * Output only.
     * 
     *
     * @param java.lang.String
	 */
	public void setDisplayUOM(String displayUOM) {
	    this.displayUOM = displayUOM;
	}
	/**
     * public getter
     *
     * 
     * 
     * Applicable when working with Pre-filled Item Information (Catalogs) functionality.
     * The label to display when presenting the attribute to a user.
     * Not necessarily the same as the attribute's label as defined in the
     * characteristic set (i.e., the label could be overridden by the catalog).
     * 
     *
     * @returns ebay.apis.eblbasecomponents.LabelType
	 */
	public LabelType getLabel() {
	    return this.label;
	}
	
	/**
	 * public setter
	 *
     * 
     * 
     * Applicable when working with Pre-filled Item Information (Catalogs) functionality.
     * The label to display when presenting the attribute to a user.
     * Not necessarily the same as the attribute's label as defined in the
     * characteristic set (i.e., the label could be overridden by the catalog).
     * 
     *
     * @param ebay.apis.eblbasecomponents.LabelType
	 */
	public void setLabel(LabelType label) {
	    this.label = label;
	}
	/**
     * public getter
     *
     * 
     * 
     * Applicable when working with Pre-filled Item Information (Catalogs) functionality.
     * Indicates the order in which eBay's search engine will sort the results if you
     * pass this characteristic as a sort attribute in GetProductSearchResults.
     * You cannot change the sort order of a characteristic when you perform a search.
     * (Of course, you can change the sort order when you present results in your own application.)
     * In GetProductSearchPage, if SortOrder is not returned at all, it means the results will be returned
     * in the order in which they are stored on eBay (which can be useful for
     * international sites that use ideographic characters).
     * Output only.
     * 
     *
     * @returns ebay.apis.eblbasecomponents.SortOrderCodeType
	 */
	public SortOrderCodeType getSortOrder() {
	    return this.sortOrder;
	}
	
	/**
	 * public setter
	 *
     * 
     * 
     * Applicable when working with Pre-filled Item Information (Catalogs) functionality.
     * Indicates the order in which eBay's search engine will sort the results if you
     * pass this characteristic as a sort attribute in GetProductSearchResults.
     * You cannot change the sort order of a characteristic when you perform a search.
     * (Of course, you can change the sort order when you present results in your own application.)
     * In GetProductSearchPage, if SortOrder is not returned at all, it means the results will be returned
     * in the order in which they are stored on eBay (which can be useful for
     * international sites that use ideographic characters).
     * Output only.
     * 
     *
     * @param ebay.apis.eblbasecomponents.SortOrderCodeType
	 */
	public void setSortOrder(SortOrderCodeType sortOrder) {
	    this.sortOrder = sortOrder;
	}
	/**
     * public getter
     *
     * 
     * 
     * List of one or more valid values for the characteristic.
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
     * List of one or more valid values for the characteristic.
     * 
     *
     * @param java.util.List<ebay.apis.eblbasecomponents.ValType>
	 */
	public void setValueList(List<ValType> valueList) {
	    this.valueList = valueList;
	}

}