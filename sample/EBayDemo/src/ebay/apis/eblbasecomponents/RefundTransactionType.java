// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package ebay.apis.eblbasecomponents;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;

/**
 * 
 *   A container consisting of details about the order line item against which the seller
 * issued a refund. If an order ID is present, it indicates that the refund was issued
 * against the entire order. If an item ID and transaction ID are present, that indicates
 * that the refund was issued against that particular order line item.
 * 
 */
public class RefundTransactionType implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element(name = "OrderID")
	private String orderID;
	
	@Element(name = "ItemID")
	private String itemID;
	
	@Element(name = "TransactionID")
	private String transactionID;
	
	@Element(name = "RefundLineArray")
	private RefundLineArrayType refundLineArray;
	
    
	/**
     * public getter
     *
     * 
     * The order against which the refund was issued. The presence of this value indicates that the refund was issued against the entire order.<br/><br/>
     * <span class="tablenote">
     * <strong>Note:</strong> RefundTransaction containers are returned 
     * (for GetOrders and other order retrieval calls) for DE/AT orders subject to the 
     * new eBay payment process.
     * </span>
     * 
     *
     * @returns java.lang.String
	 */
	public String getOrderID() {
	    return this.orderID;
	}
	
	/**
	 * public setter
	 *
     * 
     * The order against which the refund was issued. The presence of this value indicates that the refund was issued against the entire order.<br/><br/>
     * <span class="tablenote">
     * <strong>Note:</strong> RefundTransaction containers are returned 
     * (for GetOrders and other order retrieval calls) for DE/AT orders subject to the 
     * new eBay payment process.
     * </span>
     * 
     *
     * @param java.lang.String
	 */
	public void setOrderID(String orderID) {
	    this.orderID = orderID;
	}
	/**
     * public getter
     *
     * 
     * The item against which the refund was issued. This value must be accompanied by a TransactionID value.<br/><br/>
     * <span class="tablenote">
     * <strong>Note:</strong> RefundTransaction containers are returned 
     * (for GetOrders and other order retrieval calls) for DE/AT orders subject to the 
     * new eBay payment process.
     * </span>
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
     * The item against which the refund was issued. This value must be accompanied by a TransactionID value.<br/><br/>
     * <span class="tablenote">
     * <strong>Note:</strong> RefundTransaction containers are returned 
     * (for GetOrders and other order retrieval calls) for DE/AT orders subject to the 
     * new eBay payment process.
     * </span>
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
     * The transaction against which the refund was issued. This value must be accompanied by an ItemID value.<br/><br/>
     * <span class="tablenote">
     * <strong>Note:</strong> RefundTransaction containers are returned 
     * (for GetOrders and other order retrieval calls) for DE/AT orders subject to the 
     * new eBay payment process.
     * </span>
     * 
     *
     * @returns java.lang.String
	 */
	public String getTransactionID() {
	    return this.transactionID;
	}
	
	/**
	 * public setter
	 *
     * 
     * The transaction against which the refund was issued. This value must be accompanied by an ItemID value.<br/><br/>
     * <span class="tablenote">
     * <strong>Note:</strong> RefundTransaction containers are returned 
     * (for GetOrders and other order retrieval calls) for DE/AT orders subject to the 
     * new eBay payment process.
     * </span>
     * 
     *
     * @param java.lang.String
	 */
	public void setTransactionID(String transactionID) {
	    this.transactionID = transactionID;
	}
	/**
     * public getter
     *
     * 
     * An array of refund lines identifying the order line items against which the refund was issued.<br/><br/>
     * <span class="tablenote">
     * <strong>Note:</strong> RefundTransaction containers are returned 
     * (for GetOrders and other order retrieval calls) for DE/AT orders subject to the 
     * new eBay payment process.
     * </span>
     * 
     *
     * @returns ebay.apis.eblbasecomponents.RefundLineArrayType
	 */
	public RefundLineArrayType getRefundLineArray() {
	    return this.refundLineArray;
	}
	
	/**
	 * public setter
	 *
     * 
     * An array of refund lines identifying the order line items against which the refund was issued.<br/><br/>
     * <span class="tablenote">
     * <strong>Note:</strong> RefundTransaction containers are returned 
     * (for GetOrders and other order retrieval calls) for DE/AT orders subject to the 
     * new eBay payment process.
     * </span>
     * 
     *
     * @param ebay.apis.eblbasecomponents.RefundLineArrayType
	 */
	public void setRefundLineArray(RefundLineArrayType refundLineArray) {
	    this.refundLineArray = refundLineArray;
	}

}