// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package ebay.apis.eblbasecomponents;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;

/**
 * 
 * Retrieves the set of Selling Manager automation rules
 * associated with an item.
 * This call is subject to change without notice; the
 * deprecation process is inapplicable to this call.
 * 
 */
@RootElement(name = "GetSellingManagerItemAutomationRuleRequest", namespace = "urn:ebay:apis:eBLBaseComponents")
public class GetSellingManagerItemAutomationRuleRequestType extends AbstractRequestType implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element(name = "ItemID")
	private String itemID;
	
    
	/**
     * public getter
     *
     * 
     * The ID of the item whose Selling Manager automation rules
     * you want to retrieve.
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
     * The ID of the item whose Selling Manager automation rules
     * you want to retrieve.
     * 
     *
     * @param java.lang.String
	 */
	public void setItemID(String itemID) {
	    this.itemID = itemID;
	}

}