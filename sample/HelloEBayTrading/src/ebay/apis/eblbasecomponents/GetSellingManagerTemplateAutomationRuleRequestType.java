// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package ebay.apis.eblbasecomponents;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;

/**
 * 
 * Retrieves the set of Selling Manager automation rules associated
 * with a Selling Manager template.
 * This call is subject to change without notice; the
 * deprecation process is inapplicable to this call.
 * 
 */
@RootElement(name = "GetSellingManagerTemplateAutomationRuleRequest", namespace = "urn:ebay:apis:eBLBaseComponents")
public class GetSellingManagerTemplateAutomationRuleRequestType extends AbstractRequestType implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element(name = "SaleTemplateID")
	private Long saleTemplateID;
	
    
	/**
     * public getter
     *
     * 
     * The ID of the Selling Manager template whose Selling Manager
     * automation rules you want to retrieve.
     * You can obtain a SaleTemplateID by calling GetSellingManagerInventory.
     * 
     *
     * @returns java.lang.Long
	 */
	public Long getSaleTemplateID() {
	    return this.saleTemplateID;
	}
	
	/**
	 * public setter
	 *
     * 
     * The ID of the Selling Manager template whose Selling Manager
     * automation rules you want to retrieve.
     * You can obtain a SaleTemplateID by calling GetSellingManagerInventory.
     * 
     *
     * @param java.lang.Long
	 */
	public void setSaleTemplateID(Long saleTemplateID) {
	    this.saleTemplateID = saleTemplateID;
	}

}