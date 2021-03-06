// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package ebay.apis.eblbasecomponents;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;

/**
 * 
 * Creates a Selling Manager listing template that is similar to an item.
 * This call is subject to change without notice; the
 * deprecation process is inapplicable to this call.
 * 
 */
@RootElement(name = "SaveItemToSellingManagerTemplateRequest", namespace = "urn:ebay:apis:eBLBaseComponents")
public class SaveItemToSellingManagerTemplateRequestType extends AbstractRequestType implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element(name = "ItemID")
	private String itemID;
	
	@Element(name = "ProductID")
	private Long productID;
	
	@Element(name = "TemplateName")
	private String templateName;
	
    
	/**
     * public getter
     *
     * 
     * ItemID which should be created as a template and saved to inventory.
     *  
     *
     * @returns java.lang.String
	 */
	public String getItemID() {
	    return this.itemID;
	}
	
	/**
	 * public setter
	 *
     * 
     * ItemID which should be created as a template and saved to inventory.
     *  
     *
     * @param java.lang.String
	 */
	public void setItemID(String itemID) {
	    this.itemID = itemID;
	}
	/**
     * public getter
     *
     * 
     * Associates the new template with a product.
     *  
     *
     * @returns java.lang.Long
	 */
	public Long getProductID() {
	    return this.productID;
	}
	
	/**
	 * public setter
	 *
     * 
     * Associates the new template with a product.
     *  
     *
     * @param java.lang.Long
	 */
	public void setProductID(Long productID) {
	    this.productID = productID;
	}
	/**
     * public getter
     *
     * 
     * Name associated with the template. If no name is submitted, the template will be named automatically.
     *  
     *
     * @returns java.lang.String
	 */
	public String getTemplateName() {
	    return this.templateName;
	}
	
	/**
	 * public setter
	 *
     * 
     * Name associated with the template. If no name is submitted, the template will be named automatically.
     *  
     *
     * @param java.lang.String
	 */
	public void setTemplateName(String templateName) {
	    this.templateName = templateName;
	}

}