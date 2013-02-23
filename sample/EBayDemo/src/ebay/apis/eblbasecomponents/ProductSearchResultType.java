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
public class ProductSearchResultType implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element(name = "ID")
	private String id;
	
	@Element(name = "NumProducts")
	private String numProducts;
	
	@Element(name = "AttributeSet")
	private List<ResponseAttributeSetType> attributeSet;
	
	@Element(name = "DisplayStockPhotos")
	private Boolean displayStockPhotos;
	
    
	/**
     * public getter
     *
     * 
     * 
     * Key you specified in ProductSearchID in the search request to
     * distinguish between query results. Primarily useful when conducting
     * multiple searches in the same call. If no ProductSearchID value was
     * specified in the request, returns the array index of the search result
     * (beginning with 0). Not applicable to GetProductFamilyMembers.
     * 
     *
     * @returns java.lang.String
	 */
	public String getId() {
	    return this.id;
	}
	
	/**
	 * public setter
	 *
     * 
     * 
     * Key you specified in ProductSearchID in the search request to
     * distinguish between query results. Primarily useful when conducting
     * multiple searches in the same call. If no ProductSearchID value was
     * specified in the request, returns the array index of the search result
     * (beginning with 0). Not applicable to GetProductFamilyMembers.
     * 
     *
     * @param java.lang.String
	 */
	public void setId(String id) {
	    this.id = id;
	}
	/**
     * public getter
     *
     * 
     * 
     * Total quantity of products that match the search request
     * (across all characteristic sets). This value can exceed the actual
     * quantity of products returned in the current virtual page.
     * Not applicable to GetProductFamilyMembers.
     * 
     *
     * @returns java.lang.String
	 */
	public String getNumProducts() {
	    return this.numProducts;
	}
	
	/**
	 * public setter
	 *
     * 
     * 
     * Total quantity of products that match the search request
     * (across all characteristic sets). This value can exceed the actual
     * quantity of products returned in the current virtual page.
     * Not applicable to GetProductFamilyMembers.
     * 
     *
     * @param java.lang.String
	 */
	public void setNumProducts(String numProducts) {
	    this.numProducts = numProducts;
	}
	/**
     * public getter
     *
     * 
     * 
     * A result containing a set of one or more product families.
     * For GetProductSearchResults, if QueryKeywords and multiple characteristic set IDs were
     * specified in the request, multiple AttributeSet objects can be returned.
     * Each AttributeSet corresponds to a characteristic set ID specified
     * in the request. See the eBay Web Services guide for more information
     * about working with this data.
     * For GetProductSearchResults, only returned with request version 387 and higher.
     * For GetProductFamilyMembers, only returned with request version 415 and higher.
     * 
     *
     * @returns java.util.List<ebay.apis.eblbasecomponents.ResponseAttributeSetType>
	 */
	public List<ResponseAttributeSetType> getAttributeSet() {
	    return this.attributeSet;
	}
	
	/**
	 * public setter
	 *
     * 
     * 
     * A result containing a set of one or more product families.
     * For GetProductSearchResults, if QueryKeywords and multiple characteristic set IDs were
     * specified in the request, multiple AttributeSet objects can be returned.
     * Each AttributeSet corresponds to a characteristic set ID specified
     * in the request. See the eBay Web Services guide for more information
     * about working with this data.
     * For GetProductSearchResults, only returned with request version 387 and higher.
     * For GetProductFamilyMembers, only returned with request version 415 and higher.
     * 
     *
     * @param java.util.List<ebay.apis.eblbasecomponents.ResponseAttributeSetType>
	 */
	public void setAttributeSet(List<ResponseAttributeSetType> attributeSet) {
	    this.attributeSet = attributeSet;
	}
	/**
     * public getter
     *
     * 
     * 
     * If true, your application should attempt to display stock photos that
     * are returned. If false, your application should not attempt to display any
     * stock photos that are returned. This recommendation is useful for catalog data
     * related to products like coins, where stock photos are not applicable. An
     * application with a graphical user interface can use this flag to determine
     * when to hide stock photo widgets for a set of search results.
     * 
     *
     * @returns java.lang.Boolean
	 */
	public Boolean getDisplayStockPhotos() {
	    return this.displayStockPhotos;
	}
	
	/**
	 * public setter
	 *
     * 
     * 
     * If true, your application should attempt to display stock photos that
     * are returned. If false, your application should not attempt to display any
     * stock photos that are returned. This recommendation is useful for catalog data
     * related to products like coins, where stock photos are not applicable. An
     * application with a graphical user interface can use this flag to determine
     * when to hide stock photo widgets for a set of search results.
     * 
     *
     * @param java.lang.Boolean
	 */
	public void setDisplayStockPhotos(Boolean displayStockPhotos) {
	    this.displayStockPhotos = displayStockPhotos;
	}

}