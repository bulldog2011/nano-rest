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
 *      
 */
public class CharacteristicsSetType implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element(name = "Name")
	private String name;
	
	@Element(name = "AttributeSetID")
	private Integer attributeSetID;
	
	@Element(name = "AttributeSetVersion")
	private String attributeSetVersion;
	
	@Element(name = "Characteristics")
	private List<CharacteristicType> characteristics;
	
    
	/**
     * public getter
     *
     * 
     *         
     * The well-known name of the characteristic set (e.g., "Tickets" or "Books").
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
     * The well-known name of the characteristic set (e.g., "Tickets" or "Books").
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
     * 
     *         
     * Numeric value that identifies the characteristic set in a language-independent
     * way. Identifies the characteristic set that is mapped to a catalog-enabled
     * category associated with the product. Unique across all eBay sites.
     * 
     *
     * @returns java.lang.Integer
	 */
	public Integer getAttributeSetID() {
	    return this.attributeSetID;
	}
	
	/**
	 * public setter
	 *
     * 
     *         
     * Numeric value that identifies the characteristic set in a language-independent
     * way. Identifies the characteristic set that is mapped to a catalog-enabled
     * category associated with the product. Unique across all eBay sites.
     * 
     *
     * @param java.lang.Integer
	 */
	public void setAttributeSetID(Integer attributeSetID) {
	    this.attributeSetID = attributeSetID;
	}
	/**
     * public getter
     *
     * 
     *         
     * Version of the characteristics set. Not to be confused with
     * AttributeSystemVersion, which can be used to retrieve changes to attribute
     * meta-data. In item-listing requests, if you specify the version of the
     * attribute set that you have stored locally, eBay will compare it to the
     * current version on the site and return a warning if the versions do not match.
     * If an error occurs due to invalid attribute data, this warning can be useful
     * to help determine if you might be sending outdated data. The current value of
     * version is not necessarily "greater than" the previous value.
     * 
     *
     * @returns java.lang.String
	 */
	public String getAttributeSetVersion() {
	    return this.attributeSetVersion;
	}
	
	/**
	 * public setter
	 *
     * 
     *         
     * Version of the characteristics set. Not to be confused with
     * AttributeSystemVersion, which can be used to retrieve changes to attribute
     * meta-data. In item-listing requests, if you specify the version of the
     * attribute set that you have stored locally, eBay will compare it to the
     * current version on the site and return a warning if the versions do not match.
     * If an error occurs due to invalid attribute data, this warning can be useful
     * to help determine if you might be sending outdated data. The current value of
     * version is not necessarily "greater than" the previous value.
     * 
     *
     * @param java.lang.String
	 */
	public void setAttributeSetVersion(String attributeSetVersion) {
	    this.attributeSetVersion = attributeSetVersion;
	}
	/**
     * public getter
     *
     * 
     *         
     * A salient aspect or feature of an item. Used to describe an item in a standard
     * way so that buyers can find it more easily. An individual, standardized
     * characteristic that is common to all items within the specified characteristic
     * set. In the context of GetProductSearchPage, each characteristic identifies a
     * single searchable attribute. A searchable attribute is a product aspect or
     * feature that can be used as a criterion in a search for catalog content. For
     * example, "Title" might be a criterion for searching the book catalog for Pre-
     * filled Item Information related to books. See the eBay Web Services guide for
     * more information.
     * 
     *
     * @returns java.util.List<ebay.apis.eblbasecomponents.CharacteristicType>
	 */
	public List<CharacteristicType> getCharacteristics() {
	    return this.characteristics;
	}
	
	/**
	 * public setter
	 *
     * 
     *         
     * A salient aspect or feature of an item. Used to describe an item in a standard
     * way so that buyers can find it more easily. An individual, standardized
     * characteristic that is common to all items within the specified characteristic
     * set. In the context of GetProductSearchPage, each characteristic identifies a
     * single searchable attribute. A searchable attribute is a product aspect or
     * feature that can be used as a criterion in a search for catalog content. For
     * example, "Title" might be a criterion for searching the book catalog for Pre-
     * filled Item Information related to books. See the eBay Web Services guide for
     * more information.
     * 
     *
     * @param java.util.List<ebay.apis.eblbasecomponents.CharacteristicType>
	 */
	public void setCharacteristics(List<CharacteristicType> characteristics) {
	    this.characteristics = characteristics;
	}

}