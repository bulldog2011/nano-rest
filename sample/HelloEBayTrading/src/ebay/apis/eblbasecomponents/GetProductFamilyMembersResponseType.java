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
@RootElement(name = "GetProductFamilyMembersResponse", namespace = "urn:ebay:apis:eBLBaseComponents")
public class GetProductFamilyMembersResponseType extends AbstractResponseType implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element(name = "DataElementSets")
	private List<DataElementSetType> dataElementSets;
	
	@Element(name = "ProductSearchResult")
	private List<ProductSearchResultType> productSearchResult;
	
    
	/**
     * public getter
     *
     * 
     * 
     * Container for one or more DataElement fields containing supplemental helpful data.
     * A DataElement field is an HTML snippet that specifies hints for the user, help links,
     * help graphics, and other supplemental information that varies per characteristics set.
     * Usage of this information is optional and may require developers to inspect the information
     * to determine how it can be applied in an application.
     * 
     *
     * @returns java.util.List<ebay.apis.eblbasecomponents.DataElementSetType>
	 */
	public List<DataElementSetType> getDataElementSets() {
	    return this.dataElementSets;
	}
	
	/**
	 * public setter
	 *
     * 
     * 
     * Container for one or more DataElement fields containing supplemental helpful data.
     * A DataElement field is an HTML snippet that specifies hints for the user, help links,
     * help graphics, and other supplemental information that varies per characteristics set.
     * Usage of this information is optional and may require developers to inspect the information
     * to determine how it can be applied in an application.
     * 
     *
     * @param java.util.List<ebay.apis.eblbasecomponents.DataElementSetType>
	 */
	public void setDataElementSets(List<DataElementSetType> dataElementSets) {
	    this.dataElementSets = dataElementSets;
	}
	/**
     * public getter
     *
     * 
     * 
     * Contains the attributes and summary product details for all products that match
     * the product ID (or IDs) passed in the request.
     * 
     *
     * @returns java.util.List<ebay.apis.eblbasecomponents.ProductSearchResultType>
	 */
	public List<ProductSearchResultType> getProductSearchResult() {
	    return this.productSearchResult;
	}
	
	/**
	 * public setter
	 *
     * 
     * 
     * Contains the attributes and summary product details for all products that match
     * the product ID (or IDs) passed in the request.
     * 
     *
     * @param java.util.List<ebay.apis.eblbasecomponents.ProductSearchResultType>
	 */
	public void setProductSearchResult(List<ProductSearchResultType> productSearchResult) {
	    this.productSearchResult = productSearchResult;
	}

}