// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package ebay.apis.eblbasecomponents;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;

/**
 * 
 * Contains the templates requested on input. 
 * Each SellingManagerTemplateType object in the response contains the data for one
 * Selling Manager template.
 * 
 */
@RootElement(name = "GetSellingManagerTemplatesResponse", namespace = "urn:ebay:apis:eBLBaseComponents")
public class GetSellingManagerTemplatesResponseType extends AbstractResponseType implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element(name = "SellingManagerTemplateDetailsArray")
	private SellingManagerTemplateDetailsArrayType sellingManagerTemplateDetailsArray;
	
    
	/**
     * public getter
     *
     * 
     * Contains the data of the templates requested on input. 
     * A Selling Manager template contains the data needed to list an item.
     * Empty if no items are available that match the request.
     * 
     *
     * @returns ebay.apis.eblbasecomponents.SellingManagerTemplateDetailsArrayType
	 */
	public SellingManagerTemplateDetailsArrayType getSellingManagerTemplateDetailsArray() {
	    return this.sellingManagerTemplateDetailsArray;
	}
	
	/**
	 * public setter
	 *
     * 
     * Contains the data of the templates requested on input. 
     * A Selling Manager template contains the data needed to list an item.
     * Empty if no items are available that match the request.
     * 
     *
     * @param ebay.apis.eblbasecomponents.SellingManagerTemplateDetailsArrayType
	 */
	public void setSellingManagerTemplateDetailsArray(SellingManagerTemplateDetailsArrayType sellingManagerTemplateDetailsArray) {
	    this.sellingManagerTemplateDetailsArray = sellingManagerTemplateDetailsArray;
	}

}