// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package ebay.apis.eblbasecomponents;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;
import java.util.List;

/**
 * 
 * This type is deprecated as the call is no longer available.
 * 
 * 
 */
@RootElement(name = "GetCategory2CSResponse", namespace = "urn:ebay:apis:eBLBaseComponents")
public class GetCategory2CSResponseType extends AbstractResponseType implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element(name = "MappedCategoryArray")
	private CategoryArrayType mappedCategoryArray;
	
	@Element(name = "UnmappedCategoryArray")
	private CategoryArrayType unmappedCategoryArray;
	
	@Element(name = "AttributeSystemVersion")
	private String attributeSystemVersion;
	
	@Element(name = "SiteWideCharacteristicSets")
	private List<SiteWideCharacteristicsType> siteWideCharacteristicSets;
	
    
	/**
     * public getter
     *
     * 
     * 
     * Contains data about categories that are mapped to characteristics sets.
     * Use this data to determine:<br>
     * - The names and IDs of the characteristics sets<br>
     * - The availability of the Pre-filled Item Information feature for listings in that category
     * (i.e., whether the category is catalog-enabled)<br>
     * - For catalog-enabled categories, the available product search methods<br>
     * - The current version information for the complete mapping<br>
     * - The version information for each characteristics set
     * 
     *
     * @returns ebay.apis.eblbasecomponents.CategoryArrayType
	 */
	public CategoryArrayType getMappedCategoryArray() {
	    return this.mappedCategoryArray;
	}
	
	/**
	 * public setter
	 *
     * 
     * 
     * Contains data about categories that are mapped to characteristics sets.
     * Use this data to determine:<br>
     * - The names and IDs of the characteristics sets<br>
     * - The availability of the Pre-filled Item Information feature for listings in that category
     * (i.e., whether the category is catalog-enabled)<br>
     * - For catalog-enabled categories, the available product search methods<br>
     * - The current version information for the complete mapping<br>
     * - The version information for each characteristics set
     * 
     *
     * @param ebay.apis.eblbasecomponents.CategoryArrayType
	 */
	public void setMappedCategoryArray(CategoryArrayType mappedCategoryArray) {
	    this.mappedCategoryArray = mappedCategoryArray;
	}
	/**
     * public getter
     *
     * 
     * 
     * Contains data about categories (if any) whose characteristics set mappings have changed
     * since the version specified in the request. When a characteristics set mapping
     * changes, the data appears in both the UnmappedCategoryArray object
     * (to indicate that the change occurred) and the MappedCategoryArray object.
     * 
     *
     * @returns ebay.apis.eblbasecomponents.CategoryArrayType
	 */
	public CategoryArrayType getUnmappedCategoryArray() {
	    return this.unmappedCategoryArray;
	}
	
	/**
	 * public setter
	 *
     * 
     * 
     * Contains data about categories (if any) whose characteristics set mappings have changed
     * since the version specified in the request. When a characteristics set mapping
     * changes, the data appears in both the UnmappedCategoryArray object
     * (to indicate that the change occurred) and the MappedCategoryArray object.
     * 
     *
     * @param ebay.apis.eblbasecomponents.CategoryArrayType
	 */
	public void setUnmappedCategoryArray(CategoryArrayType unmappedCategoryArray) {
	    this.unmappedCategoryArray = unmappedCategoryArray;
	}
	/**
     * public getter
     *
     * 
     * 
     * Current version of the mappings for the site.
     * This value changes each time changes are made to the mappings.
     * The current version value is not necessarily greater than the previous
     * value. Therefore, when comparing versions, only compare whether the
     * value has changed.
     * 
     *
     * @returns java.lang.String
	 */
	public String getAttributeSystemVersion() {
	    return this.attributeSystemVersion;
	}
	
	/**
	 * public setter
	 *
     * 
     * 
     * Current version of the mappings for the site.
     * This value changes each time changes are made to the mappings.
     * The current version value is not necessarily greater than the previous
     * value. Therefore, when comparing versions, only compare whether the
     * value has changed.
     * 
     *
     * @param java.lang.String
	 */
	public void setAttributeSystemVersion(String attributeSystemVersion) {
	    this.attributeSystemVersion = attributeSystemVersion;
	}
	/**
     * public getter
     *
     * 
     * 
     * A list of one or more characteristics sets mapped to the category, if any. Use this
     * information when working with Item Specifics (Attributes) and Pre-filled Item
     * Information (Catalogs) functionality.
     * 
     *
     * @returns java.util.List<ebay.apis.eblbasecomponents.SiteWideCharacteristicsType>
	 */
	public List<SiteWideCharacteristicsType> getSiteWideCharacteristicSets() {
	    return this.siteWideCharacteristicSets;
	}
	
	/**
	 * public setter
	 *
     * 
     * 
     * A list of one or more characteristics sets mapped to the category, if any. Use this
     * information when working with Item Specifics (Attributes) and Pre-filled Item
     * Information (Catalogs) functionality.
     * 
     *
     * @param java.util.List<ebay.apis.eblbasecomponents.SiteWideCharacteristicsType>
	 */
	public void setSiteWideCharacteristicSets(List<SiteWideCharacteristicsType> siteWideCharacteristicSets) {
	    this.siteWideCharacteristicSets = siteWideCharacteristicSets;
	}

}