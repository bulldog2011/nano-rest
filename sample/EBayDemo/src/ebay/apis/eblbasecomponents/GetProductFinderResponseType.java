// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package ebay.apis.eblbasecomponents;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;

/**
 * 
 * This type is deprecated as the call is no longer available.
 * 
 * 
 */
@RootElement(name = "GetProductFinderResponse", namespace = "urn:ebay:apis:eBLBaseComponents")
public class GetProductFinderResponseType extends AbstractResponseType implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element(name = "AttributeSystemVersion")
	private String attributeSystemVersion;
	
	@Element(name = "ProductFinderData")
	private String productFinderData;
	
    
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
     * A string containing a list of search attributes that can be used in a
     * "Product Finder" style query, along with related meta-data. The meta-data
     * specifies possible values of each attribute, the logic for presenting
     * attributes to a user, and rules for validating the user's selections. For
     * backward compatibility, this data is in the same XML format that was used
     * in the Legacy XML API so that you can apply the same Product Finder XSL
     * stylesheet to it. That is, individual elements are not described using the
     * new eBay XML schema format. For information about each element in the
     * ProductFinderData string, see the product finder model documentation in
     * the eBay Web Services guide (see links below).<br>
     * <br>
     * Because this is returned as a string, the XML markup is escaped with
     * character entity references (e.g., &amp;lt;eBay&amp;gt;&amp;lt;ProductFinders&amp;gt;...).
     * See the appendices in the eBay Web Services guide for general information about
     * string data types.
     * 
     *
     * @returns java.lang.String
	 */
	public String getProductFinderData() {
	    return this.productFinderData;
	}
	
	/**
	 * public setter
	 *
     * 
     * 
     * A string containing a list of search attributes that can be used in a
     * "Product Finder" style query, along with related meta-data. The meta-data
     * specifies possible values of each attribute, the logic for presenting
     * attributes to a user, and rules for validating the user's selections. For
     * backward compatibility, this data is in the same XML format that was used
     * in the Legacy XML API so that you can apply the same Product Finder XSL
     * stylesheet to it. That is, individual elements are not described using the
     * new eBay XML schema format. For information about each element in the
     * ProductFinderData string, see the product finder model documentation in
     * the eBay Web Services guide (see links below).<br>
     * <br>
     * Because this is returned as a string, the XML markup is escaped with
     * character entity references (e.g., &amp;lt;eBay&amp;gt;&amp;lt;ProductFinders&amp;gt;...).
     * See the appendices in the eBay Web Services guide for general information about
     * string data types.
     * 
     *
     * @param java.lang.String
	 */
	public void setProductFinderData(String productFinderData) {
	    this.productFinderData = productFinderData;
	}

}