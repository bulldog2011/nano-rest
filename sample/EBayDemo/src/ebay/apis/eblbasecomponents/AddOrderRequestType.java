// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package ebay.apis.eblbasecomponents;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;

/**
 * 
 * Combines two or more order line items into a single order, enabling a buyer to pay for all of those order line items with a single payment (and, if so arranged, ship all of the items together).
 * 
 */
@RootElement(name = "AddOrderRequest", namespace = "urn:ebay:apis:eBLBaseComponents")
public class AddOrderRequestType extends AbstractRequestType implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element(name = "Order")
	private OrderType order;
	
    
	/**
     * public getter
     *
     * 
     * The order that is being created.
     * 
     *
     * @returns ebay.apis.eblbasecomponents.OrderType
	 */
	public OrderType getOrder() {
	    return this.order;
	}
	
	/**
	 * public setter
	 *
     * 
     * The order that is being created.
     * 
     *
     * @param ebay.apis.eblbasecomponents.OrderType
	 */
	public void setOrder(OrderType order) {
	    this.order = order;
	}

}