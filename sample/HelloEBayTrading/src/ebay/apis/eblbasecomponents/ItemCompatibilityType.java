// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package ebay.apis.eblbasecomponents;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;
import java.util.List;

/**
 * 
 * All information corresponding to an individual compatibility by application.
 * 
 */
public class ItemCompatibilityType implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element(name = "Delete")
	private Boolean delete;
	
	@Element(name = "NameValueList")
	private List<NameValueListType> nameValueList;
	
	@Element(name = "CompatibilityNotes")
	private String compatibilityNotes;
	
    
	/**
     * public getter
     *
     * 
     * Removes individual parts compatibility nodes from the compatibility list. Set
     * to true within the compatibility to delete.
     * <br><br>
     * This field can only be used when revising an item or template.
     * <br>
     * If the listing has bids or ends within 12 hours, you cannot delete item
     * compatibilities.
     * 
     *
     * @returns java.lang.Boolean
	 */
	public Boolean getDelete() {
	    return this.delete;
	}
	
	/**
	 * public setter
	 *
     * 
     * Removes individual parts compatibility nodes from the compatibility list. Set
     * to true within the compatibility to delete.
     * <br><br>
     * This field can only be used when revising an item or template.
     * <br>
     * If the listing has bids or ends within 12 hours, you cannot delete item
     * compatibilities.
     * 
     *
     * @param java.lang.Boolean
	 */
	public void setDelete(Boolean delete) {
	    this.delete = delete;
	}
	/**
     * public getter
     *
     * 
     * A name-value pair describing a single compatible application. The
     * allowed names and values are specific to the primary category in which the
     * item is listed. For example, when listing in a Parts & Accessories
     * category, where the applications are vehicles, the allowed names might include
     * Year, Make, and Model, and the values would correspond to specific vehicles in
     * eBay's catalog.
     * <br><br>
     * The eBay Germany site supports the use of K type vehicle numbers to specify
     * parts compatibility. To use a K type number to specify item compatiblities,
     * set the Name field to "KType" and set the corresponding Value field to the 
     * K type number.
     * 
     *
     * @returns java.util.List<ebay.apis.eblbasecomponents.NameValueListType>
	 */
	public List<NameValueListType> getNameValueList() {
	    return this.nameValueList;
	}
	
	/**
	 * public setter
	 *
     * 
     * A name-value pair describing a single compatible application. The
     * allowed names and values are specific to the primary category in which the
     * item is listed. For example, when listing in a Parts & Accessories
     * category, where the applications are vehicles, the allowed names might include
     * Year, Make, and Model, and the values would correspond to specific vehicles in
     * eBay's catalog.
     * <br><br>
     * The eBay Germany site supports the use of K type vehicle numbers to specify
     * parts compatibility. To use a K type number to specify item compatiblities,
     * set the Name field to "KType" and set the corresponding Value field to the 
     * K type number.
     * 
     *
     * @param java.util.List<ebay.apis.eblbasecomponents.NameValueListType>
	 */
	public void setNameValueList(List<NameValueListType> nameValueList) {
	    this.nameValueList = nameValueList;
	}
	/**
     * public getter
     *
     * 
     * The seller may optionally enter any notes pertaining to the compatibility
     * being specified. Use this field to specify the placement of the part on a
     * vehicle or the type of vehicle a part fits.
     * 
     *
     * @returns java.lang.String
	 */
	public String getCompatibilityNotes() {
	    return this.compatibilityNotes;
	}
	
	/**
	 * public setter
	 *
     * 
     * The seller may optionally enter any notes pertaining to the compatibility
     * being specified. Use this field to specify the placement of the part on a
     * vehicle or the type of vehicle a part fits.
     * 
     *
     * @param java.lang.String
	 */
	public void setCompatibilityNotes(String compatibilityNotes) {
	    this.compatibilityNotes = compatibilityNotes;
	}

}