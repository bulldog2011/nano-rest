// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package ebay.apis.eblbasecomponents;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;

/**
 * 
 *    This type specifies the shipping service and cost of the domestic leg of a Global Shipping Program shipment.
 * 
 */
public class MultiLegShippingServiceType implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element(name = "ShippingService")
	private String shippingService;
	
	@Element(name = "TotalShippingCost")
	private AmountType totalShippingCost;
	
    
	/**
     * public getter
     *
     * 
     * The shipping service specified for the domestic leg of a Global Shipping Program shipment. For the domestic leg, the value of this field can be any available shipping service that ships to the domestic address of the international shipping provider.
     * 
     *
     * @returns java.lang.String
	 */
	public String getShippingService() {
	    return this.shippingService;
	}
	
	/**
	 * public setter
	 *
     * 
     * The shipping service specified for the domestic leg of a Global Shipping Program shipment. For the domestic leg, the value of this field can be any available shipping service that ships to the domestic address of the international shipping provider.
     * 
     *
     * @param java.lang.String
	 */
	public void setShippingService(String shippingService) {
	    this.shippingService = shippingService;
	}
	/**
     * public getter
     *
     * 
     * The total shipping cost of the domestic leg of a Global Shipping Program shipment.
     * 
     *
     * @returns ebay.apis.eblbasecomponents.AmountType
	 */
	public AmountType getTotalShippingCost() {
	    return this.totalShippingCost;
	}
	
	/**
	 * public setter
	 *
     * 
     * The total shipping cost of the domestic leg of a Global Shipping Program shipment.
     * 
     *
     * @param ebay.apis.eblbasecomponents.AmountType
	 */
	public void setTotalShippingCost(AmountType totalShippingCost) {
	    this.totalShippingCost = totalShippingCost;
	}

}