// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package ebay.apis.eblbasecomponents;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;
import java.util.List;

/**
 * 
 * Returns a map of old category IDs and corresponding active category IDs defined
 * for the site to which the request was sent. Typically used to update an older item
 * definition with a new category ID prior to listing the item.
 * 
 */
@RootElement(name = "GetCategoryMappingsResponse", namespace = "urn:ebay:apis:eBLBaseComponents")
public class GetCategoryMappingsResponseType extends AbstractResponseType implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element(name = "CategoryMapping")
	private List<CategoryMappingType> categoryMapping;
	
	@Element(name = "CategoryVersion")
	private String categoryVersion;
	
    
	/**
     * public getter
     *
     * 
     * Mapping between an old category ID and an active category ID. Returned when
     * category mappings exist and the value of CategoryVersion is different from
     * the current version on the site.
     * 
     *
     * @returns java.util.List<ebay.apis.eblbasecomponents.CategoryMappingType>
	 */
	public List<CategoryMappingType> getCategoryMapping() {
	    return this.categoryMapping;
	}
	
	/**
	 * public setter
	 *
     * 
     * Mapping between an old category ID and an active category ID. Returned when
     * category mappings exist and the value of CategoryVersion is different from
     * the current version on the site.
     * 
     *
     * @param java.util.List<ebay.apis.eblbasecomponents.CategoryMappingType>
	 */
	public void setCategoryMapping(List<CategoryMappingType> categoryMapping) {
	    this.categoryMapping = categoryMapping;
	}
	/**
     * public getter
     *
     * 
     * Version value assigned to the current category mapping data for the site.
     * Compare this value to the version value the application stored with the mappings
     * the last time the application executed the call. If the versions are the same,
     * the data has not changed since the last time the data was retrieved and stored.
     * 
     *
     * @returns java.lang.String
	 */
	public String getCategoryVersion() {
	    return this.categoryVersion;
	}
	
	/**
	 * public setter
	 *
     * 
     * Version value assigned to the current category mapping data for the site.
     * Compare this value to the version value the application stored with the mappings
     * the last time the application executed the call. If the versions are the same,
     * the data has not changed since the last time the data was retrieved and stored.
     * 
     *
     * @param java.lang.String
	 */
	public void setCategoryVersion(String categoryVersion) {
	    this.categoryVersion = categoryVersion;
	}

}