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
@RootElement(name = "GetProductSearchPageResponse", namespace = "urn:ebay:apis:eBLBaseComponents")
public class GetProductSearchPageResponseType extends AbstractResponseType implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element(name = "AttributeSystemVersion")
	private String attributeSystemVersion;
	
	@Element(name = "ProductSearchPage")
	private List<ProductSearchPageType> productSearchPage;
	
    
	/**
     * public getter
     *
     * 
     * 
     * Current version of the product search page data for the site.
     * This value changes each time changes are made to the search page data.
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
     * Current version of the product search page data for the site.
     * This value changes each time changes are made to the search page data.
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
     * A list of catalog search criteria and sort keys associated with a catalog-enabled category,
     * plus supplemental information to help the seller understand how to make selections.
     * 
     *
     * @returns java.util.List<ebay.apis.eblbasecomponents.ProductSearchPageType>
	 */
	public List<ProductSearchPageType> getProductSearchPage() {
	    return this.productSearchPage;
	}
	
	/**
	 * public setter
	 *
     * 
     * 
     * A list of catalog search criteria and sort keys associated with a catalog-enabled category,
     * plus supplemental information to help the seller understand how to make selections.
     * 
     *
     * @param java.util.List<ebay.apis.eblbasecomponents.ProductSearchPageType>
	 */
	public void setProductSearchPage(List<ProductSearchPageType> productSearchPage) {
	    this.productSearchPage = productSearchPage;
	}

}