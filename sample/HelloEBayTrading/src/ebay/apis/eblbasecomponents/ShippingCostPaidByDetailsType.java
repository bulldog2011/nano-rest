// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package ebay.apis.eblbasecomponents;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;

public class ShippingCostPaidByDetailsType implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element(name = "ShippingCostPaidByOption")
	private String shippingCostPaidByOption;
	
	@Element(name = "Description")
	private String description;
	
    
	/**
     * public getter
     *
     * 
     * The party who pays the shipping cost for a returned item.
     * This value can be passed in the AddItem family of calls.
     * 
     *
     * @returns java.lang.String
	 */
	public String getShippingCostPaidByOption() {
	    return this.shippingCostPaidByOption;
	}
	
	/**
	 * public setter
	 *
     * 
     * The party who pays the shipping cost for a returned item.
     * This value can be passed in the AddItem family of calls.
     * 
     *
     * @param java.lang.String
	 */
	public void setShippingCostPaidByOption(String shippingCostPaidByOption) {
	    this.shippingCostPaidByOption = shippingCostPaidByOption;
	}
	/**
     * public getter
     *
     * 
     * Display string that applications can use to present ShippingCostPaidByOption in
     * a more user-friendly format (such as in a drop-down list).
     * Not applicable as input to the AddItem family of calls. (Use ShippingCostPaidByOption instead.)
     * 
     *
     * @returns java.lang.String
	 */
	public String getDescription() {
	    return this.description;
	}
	
	/**
	 * public setter
	 *
     * 
     * Display string that applications can use to present ShippingCostPaidByOption in
     * a more user-friendly format (such as in a drop-down list).
     * Not applicable as input to the AddItem family of calls. (Use ShippingCostPaidByOption instead.)
     * 
     *
     * @param java.lang.String
	 */
	public void setDescription(String description) {
	    this.description = description;
	}

}