// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package ebay.apis.eblbasecomponents;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;

/**
 * 
 * Request type containing the input fields for the <b>ReviseSellingManagerSaleRecord</b>
 * call. The standard Trading API deprecation process is not applicable to this
 * call.
 * 
 */
@RootElement(name = "ReviseSellingManagerSaleRecordRequest", namespace = "urn:ebay:apis:eBLBaseComponents")
public class ReviseSellingManagerSaleRecordRequestType extends AbstractRequestType implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element(name = "ItemID")
	private String itemID;
	
	@Element(name = "TransactionID")
	private String transactionID;
	
	@Element(name = "OrderID")
	private String orderID;
	
	@Element(name = "SellingManagerSoldOrder")
	private SellingManagerSoldOrderType sellingManagerSoldOrder;
	
	@Element(name = "OrderLineItemID")
	private String orderLineItemID;
	
    
	/**
     * public getter
     *
     * 
     * Unique identifier for an eBay item listing. A listing can have multiple
     * order line items (transactions), but only one <b>ItemID</b>. An <b>ItemID</b> can be
     * paired up with a corresponding <b>TransactionID</b> and used as an input filter
     * for <b>ReviseSellingManagerSaleRecord</b>. The <b>ItemID</b>/<b>TransactionID</b> pair
     * corresponds to a Selling Manager <b>SaleRecordID</b>, which can be retrieved
     * with the <b>GetSellingManagerSaleRecord</b> call. 
     * <br><br>
     * Unless an <b>OrderLineItemID</b> is used to identify a single line item order,
     * or the <b>OrderID</b> is used to identify a single or multiple line item
     * (Combined Payment) order, the <b>ItemID</b>/<b>TransactionID</b> pair must be
     * specified. For a multiple line item (Combined Payment) order, <b>OrderID</b>
     * should be used. If <b>OrderID</b> or <b>OrderLineItemID</b> are specified, the
     * <b>ItemID</b>/<b>TransactionID</b> pair is ignored if present in the same request.
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
     * Unique identifier for an eBay item listing. A listing can have multiple
     * order line items (transactions), but only one <b>ItemID</b>. An <b>ItemID</b> can be
     * paired up with a corresponding <b>TransactionID</b> and used as an input filter
     * for <b>ReviseSellingManagerSaleRecord</b>. The <b>ItemID</b>/<b>TransactionID</b> pair
     * corresponds to a Selling Manager <b>SaleRecordID</b>, which can be retrieved
     * with the <b>GetSellingManagerSaleRecord</b> call. 
     * <br><br>
     * Unless an <b>OrderLineItemID</b> is used to identify a single line item order,
     * or the <b>OrderID</b> is used to identify a single or multiple line item
     * (Combined Payment) order, the <b>ItemID</b>/<b>TransactionID</b> pair must be
     * specified. For a multiple line item (Combined Payment) order, <b>OrderID</b>
     * should be used. If <b>OrderID</b> or <b>OrderLineItemID</b> are specified, the
     * <b>ItemID</b>/<b>TransactionID</b> pair is ignored if present in the same request.
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
     * Unique identifier for an eBay order line item (transaction). An order
     * line item is created once there is a commitment from a buyer to purchase
     * an item. Since an auction listing can only have one order line item
     * during the duration of the listing, the <b>TransactionID</b> for
     * auction listings is always 0. Along with its corresponding <b>ItemID</b>, a
     * <b>TransactionID</b> is used and referenced during an order checkout flow and
     * after checkout has been completed. The <b>ItemID</b>/<b>TransactionID</b> pair can be
     * used as an input filter for <b>ReviseSellingManagerSaleRecord</b>. The
     * <b>ItemID</b>/<b>TransactionID</b> pair corresponds to a Selling Manager <b>SaleRecordID</b>,
     * which can be retrieved with the <b>GetSellingManagerSaleRecord</b> call.
     * <br><br>
     * Unless an <b>OrderLineItemID</b> is used to identify a single line item order,
     * or the <b>OrderID</b> is used to identify a single or multiple line item
     * (Combined Payment) order, the <b>ItemID</b>/<b>TransactionID</b> pair must be
     * specified. For a multiple line item (Combined Payment) order, <b>OrderID</b>
     * must be used. If <b>OrderID</b> or <b>OrderLineItemID</b> are specified, the
     * <b>ItemID</b>/<b>TransactionID</b> pair is ignored if present in the same request.
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
     * Unique identifier for an eBay order line item (transaction). An order
     * line item is created once there is a commitment from a buyer to purchase
     * an item. Since an auction listing can only have one order line item
     * during the duration of the listing, the <b>TransactionID</b> for
     * auction listings is always 0. Along with its corresponding <b>ItemID</b>, a
     * <b>TransactionID</b> is used and referenced during an order checkout flow and
     * after checkout has been completed. The <b>ItemID</b>/<b>TransactionID</b> pair can be
     * used as an input filter for <b>ReviseSellingManagerSaleRecord</b>. The
     * <b>ItemID</b>/<b>TransactionID</b> pair corresponds to a Selling Manager <b>SaleRecordID</b>,
     * which can be retrieved with the <b>GetSellingManagerSaleRecord</b> call.
     * <br><br>
     * Unless an <b>OrderLineItemID</b> is used to identify a single line item order,
     * or the <b>OrderID</b> is used to identify a single or multiple line item
     * (Combined Payment) order, the <b>ItemID</b>/<b>TransactionID</b> pair must be
     * specified. For a multiple line item (Combined Payment) order, <b>OrderID</b>
     * must be used. If <b>OrderID</b> or <b>OrderLineItemID</b> are specified, the
     * <b>ItemID</b>/<b>TransactionID</b> pair is ignored if present in the same request.
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
     * A unique identifier that identifies a single line item or multiple line
     * item (Combined Payment) order. 
     * <br><br> 
     * For a single line item order, the <b>OrderID</b> value is identical to the
     * <b>OrderLineItemID</b> value that is generated upon creation of the order line
     * item. For a Combined Payment order, the <b>OrderID</b> value is created by eBay
     * when the buyer or seller (sharing multiple, common order line items)
     * combines multiple order line items into a Combined Payment order through
     * the eBay site. A Combined Payment order can also be created by the
     * seller through the <b>AddOrder</b> call. The <b>OrderID</b> can be used as an input
     * filter for <b>ReviseSellingManagerSaleRecord</b>. The <b>OrderID</b>
     * is linked to a Selling Manager <b>SaleRecordID</b>, and can be retrieved
     * with the <b>GetSellingManagerSaleRecord</b> call.
     * <br><br>
     * <b>OrderID</b> overrides an <b>OrderLineItemID</b> or <b>ItemID</b>/<b>TransactionID</b> pair if
     * these fields are also specified in the same request.
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
     * A unique identifier that identifies a single line item or multiple line
     * item (Combined Payment) order. 
     * <br><br> 
     * For a single line item order, the <b>OrderID</b> value is identical to the
     * <b>OrderLineItemID</b> value that is generated upon creation of the order line
     * item. For a Combined Payment order, the <b>OrderID</b> value is created by eBay
     * when the buyer or seller (sharing multiple, common order line items)
     * combines multiple order line items into a Combined Payment order through
     * the eBay site. A Combined Payment order can also be created by the
     * seller through the <b>AddOrder</b> call. The <b>OrderID</b> can be used as an input
     * filter for <b>ReviseSellingManagerSaleRecord</b>. The <b>OrderID</b>
     * is linked to a Selling Manager <b>SaleRecordID</b>, and can be retrieved
     * with the <b>GetSellingManagerSaleRecord</b> call.
     * <br><br>
     * <b>OrderID</b> overrides an <b>OrderLineItemID</b> or <b>ItemID</b>/<b>TransactionID</b> pair if
     * these fields are also specified in the same request.
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
     * Container consisting of order costs, shipping details, order status, and
     * other information. The changes made under this container will update the
     * order in Selling Manager.
     * 
     *
     * @returns ebay.apis.eblbasecomponents.SellingManagerSoldOrderType
	 */
	public SellingManagerSoldOrderType getSellingManagerSoldOrder() {
	    return this.sellingManagerSoldOrder;
	}
	
	/**
	 * public setter
	 *
     * 
     * Container consisting of order costs, shipping details, order status, and
     * other information. The changes made under this container will update the
     * order in Selling Manager.
     * 
     *
     * @param ebay.apis.eblbasecomponents.SellingManagerSoldOrderType
	 */
	public void setSellingManagerSoldOrder(SellingManagerSoldOrderType sellingManagerSoldOrder) {
	    this.sellingManagerSoldOrder = sellingManagerSoldOrder;
	}
	/**
     * public getter
     *
     * 
     * <b>OrderLineItemID</b> is a unique identifier for an eBay order line item and
     * is based upon the concatenation of <b>ItemID</b> and <b>TransactionID</b>, with a
     * hyphen in between these two IDs. For a single line item order, the
     * <b>OrderLineItemID</b> value can be passed into the <b>OrderID</b> field to revise the
     * order in Selling Manager. 
     * <br><br>
     * Unless an <b>ItemID</b>/<b>TransactionID</b> pair is used to identify a single line
     * item order, or the <b>OrderID</b> is used to identify a single or multiple line
     * item (Combined Payment) order, the <b>OrderLineItemID</b> must be specified.
     * For a multiple line item (Combined Payment) order, <b>OrderID</b> should be
     * used. If <b>OrderLineItemID</b> is specified, the <b>ItemID</b>/<b>TransactionID</b> pair are
     * ignored if present in the same request.
     * 
     *
     * @returns java.lang.String
	 */
	public String getOrderLineItemID() {
	    return this.orderLineItemID;
	}
	
	/**
	 * public setter
	 *
     * 
     * <b>OrderLineItemID</b> is a unique identifier for an eBay order line item and
     * is based upon the concatenation of <b>ItemID</b> and <b>TransactionID</b>, with a
     * hyphen in between these two IDs. For a single line item order, the
     * <b>OrderLineItemID</b> value can be passed into the <b>OrderID</b> field to revise the
     * order in Selling Manager. 
     * <br><br>
     * Unless an <b>ItemID</b>/<b>TransactionID</b> pair is used to identify a single line
     * item order, or the <b>OrderID</b> is used to identify a single or multiple line
     * item (Combined Payment) order, the <b>OrderLineItemID</b> must be specified.
     * For a multiple line item (Combined Payment) order, <b>OrderID</b> should be
     * used. If <b>OrderLineItemID</b> is specified, the <b>ItemID</b>/<b>TransactionID</b> pair are
     * ignored if present in the same request.
     * 
     *
     * @param java.lang.String
	 */
	public void setOrderLineItemID(String orderLineItemID) {
	    this.orderLineItemID = orderLineItemID;
	}

}