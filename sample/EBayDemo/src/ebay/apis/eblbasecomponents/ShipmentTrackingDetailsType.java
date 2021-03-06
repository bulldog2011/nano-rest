// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package ebay.apis.eblbasecomponents;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;

/**
 * 
 * This type details the shipping carrier and shipment tracking number associated with a
 * package shipment. It also contains information about the line items shipped through the Global Shipping program.
 * 
 */
public class ShipmentTrackingDetailsType implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element(name = "ShippingCarrierUsed")
	private String shippingCarrierUsed;
	
	@Element(name = "ShipmentTrackingNumber")
	private String shipmentTrackingNumber;
	
	@Element(name = "ShipmentLineItem")
	private ShipmentLineItemType shipmentLineItem;
	
    
	/**
     * public getter
     *
     * 
     * Required if <b>ShipmentTrackingNumber</b> is supplied.
     * Name of the shipping carrier used to ship the item. Although this value
     * can be any value, since it is not checked by eBay, commonly used shipping
     * carriers can be found by calling <b>GeteBayDetails</b> 
     * with <b>DetailName</b> set to <b>ShippingCarrierDetails</b> and examining the
     * returned ShippingCarrierCodeTypes.
     * <br><br>
     * For those using UPS Mail Innovations, supply the value UPS-MI for UPS Mail Innnovations.
     * Buyers will subsequently be sent to the UPS Mail Innovations website for tracking.
     * <br><br>
     * For those using FedEx SmartPost in a CompleteSale callsupply the value FedEx.
     * Buyers will subsequently be sent to the appropriate web site for tracking status.
     * (The buyer is sent to the UPS Mail Innovations website if UPS-MI is specified, or to
     * the FedEx website if FedEx is specified.)
     * Returned only if set.
     * Returned for Half.com as well.
     * 
     *
     * @returns java.lang.String
	 */
	public String getShippingCarrierUsed() {
	    return this.shippingCarrierUsed;
	}
	
	/**
	 * public setter
	 *
     * 
     * Required if <b>ShipmentTrackingNumber</b> is supplied.
     * Name of the shipping carrier used to ship the item. Although this value
     * can be any value, since it is not checked by eBay, commonly used shipping
     * carriers can be found by calling <b>GeteBayDetails</b> 
     * with <b>DetailName</b> set to <b>ShippingCarrierDetails</b> and examining the
     * returned ShippingCarrierCodeTypes.
     * <br><br>
     * For those using UPS Mail Innovations, supply the value UPS-MI for UPS Mail Innnovations.
     * Buyers will subsequently be sent to the UPS Mail Innovations website for tracking.
     * <br><br>
     * For those using FedEx SmartPost in a CompleteSale callsupply the value FedEx.
     * Buyers will subsequently be sent to the appropriate web site for tracking status.
     * (The buyer is sent to the UPS Mail Innovations website if UPS-MI is specified, or to
     * the FedEx website if FedEx is specified.)
     * Returned only if set.
     * Returned for Half.com as well.
     * 
     *
     * @param java.lang.String
	 */
	public void setShippingCarrierUsed(String shippingCarrierUsed) {
	    this.shippingCarrierUsed = shippingCarrierUsed;
	}
	/**
     * public getter
     *
     * 
     * Required if <b>ShippingCarrierUsed</b> is supplied.
     * The tracking number assigned by the shipping carrier to the item shipment. The
     * format of the tracking number must be consistent with the format used by the
     * specified shipping carrier (ShippingCarrierUsed). Typically, you should avoid
     * spaces and hyphens.
     * Returned only if set.
     * Returned for Half.com as well.
     * 
     *
     * @returns java.lang.String
	 */
	public String getShipmentTrackingNumber() {
	    return this.shipmentTrackingNumber;
	}
	
	/**
	 * public setter
	 *
     * 
     * Required if <b>ShippingCarrierUsed</b> is supplied.
     * The tracking number assigned by the shipping carrier to the item shipment. The
     * format of the tracking number must be consistent with the format used by the
     * specified shipping carrier (ShippingCarrierUsed). Typically, you should avoid
     * spaces and hyphens.
     * Returned only if set.
     * Returned for Half.com as well.
     * 
     *
     * @param java.lang.String
	 */
	public void setShipmentTrackingNumber(String shipmentTrackingNumber) {
	    this.shipmentTrackingNumber = shipmentTrackingNumber;
	}
	/**
     * public getter
     *
     * 
     *    Contains information about one or more order line items in a Global Shipping Program package. Required or returned if the value of <strong>ShippingCarrierUsed</strong> is <code>GlobalShipping_MultiCarrier</code>.
     * 
     *
     * @returns ebay.apis.eblbasecomponents.ShipmentLineItemType
	 */
	public ShipmentLineItemType getShipmentLineItem() {
	    return this.shipmentLineItem;
	}
	
	/**
	 * public setter
	 *
     * 
     *    Contains information about one or more order line items in a Global Shipping Program package. Required or returned if the value of <strong>ShippingCarrierUsed</strong> is <code>GlobalShipping_MultiCarrier</code>.
     * 
     *
     * @param ebay.apis.eblbasecomponents.ShipmentLineItemType
	 */
	public void setShipmentLineItem(ShipmentLineItemType shipmentLineItem) {
	    this.shipmentLineItem = shipmentLineItem;
	}

}