// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package ebay.apis.eblbasecomponents;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;

/**
 * 
 * Retrieves information about one or more orders based on OrderIDs, ItemIDs, or SKU values. &nbsp;<b>Also for Half.com</b>.
 * 
 */
@RootElement(name = "GetOrderTransactionsRequest", namespace = "urn:ebay:apis:eBLBaseComponents")
public class GetOrderTransactionsRequestType extends AbstractRequestType implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element(name = "ItemTransactionIDArray")
	private ItemTransactionIDArrayType itemTransactionIDArray;
	
	@Element(name = "OrderIDArray")
	private OrderIDArrayType orderIDArray;
	
	@Element(name = "Platform")
	private TransactionPlatformCodeType platform;
	
	@Element(name = "IncludeFinalValueFees")
	private Boolean includeFinalValueFees;
	
    
	/**
     * public getter
     *
     * 
     * An array of one or more <b>ItemTransactionID</b> containers. Each 
     * <b>ItemTransactionID</b> container identifies an order line item 
     * to retrieve in the response.
     * 
     *
     * @returns ebay.apis.eblbasecomponents.ItemTransactionIDArrayType
	 */
	public ItemTransactionIDArrayType getItemTransactionIDArray() {
	    return this.itemTransactionIDArray;
	}
	
	/**
	 * public setter
	 *
     * 
     * An array of one or more <b>ItemTransactionID</b> containers. Each 
     * <b>ItemTransactionID</b> container identifies an order line item 
     * to retrieve in the response.
     * 
     *
     * @param ebay.apis.eblbasecomponents.ItemTransactionIDArrayType
	 */
	public void setItemTransactionIDArray(ItemTransactionIDArrayType itemTransactionIDArray) {
	    this.itemTransactionIDArray = itemTransactionIDArray;
	}
	/**
     * public getter
     *
     * 
     * An array of one or more <b>OrderID</b> containers. Each 
     * <b>OrderID</b> container identifies an order to retrieve in the response.
     * Up to 20 orders (using 20 <b>OrderID</b> containers) can be 
     * retrieved with one <b>GetOrderTransactions</b> call.
     * 
     *
     * @returns ebay.apis.eblbasecomponents.OrderIDArrayType
	 */
	public OrderIDArrayType getOrderIDArray() {
	    return this.orderIDArray;
	}
	
	/**
	 * public setter
	 *
     * 
     * An array of one or more <b>OrderID</b> containers. Each 
     * <b>OrderID</b> container identifies an order to retrieve in the response.
     * Up to 20 orders (using 20 <b>OrderID</b> containers) can be 
     * retrieved with one <b>GetOrderTransactions</b> call.
     * 
     *
     * @param ebay.apis.eblbasecomponents.OrderIDArrayType
	 */
	public void setOrderIDArray(OrderIDArrayType orderIDArray) {
	    this.orderIDArray = orderIDArray;
	}
	/**
     * public getter
     *
     * 
     * Name of the eBay co-branded site upon which the order line item was created.
     * This will serve as a filter for the orders to get emitted in the response.
     * 
     *
     * @returns ebay.apis.eblbasecomponents.TransactionPlatformCodeType
	 */
	public TransactionPlatformCodeType getPlatform() {
	    return this.platform;
	}
	
	/**
	 * public setter
	 *
     * 
     * Name of the eBay co-branded site upon which the order line item was created.
     * This will serve as a filter for the orders to get emitted in the response.
     * 
     *
     * @param ebay.apis.eblbasecomponents.TransactionPlatformCodeType
	 */
	public void setPlatform(TransactionPlatformCodeType platform) {
	    this.platform = platform;
	}
	/**
     * public getter
     *
     * 
     * Indicates whether to include Final Value Fee (FVF) in the response. For most
     * listing types, the Final Value Fee is returned in Transaction.FinalValueFee.
     * The Final Value Fee is returned on a transaction-by-transaction basis for
     * FixedPriceItem and StoresFixedPrice listing types. For all other listing
     * types, the Final Value Fee is returned when the listing status is Completed.
     * This value is not returned if the auction ended with Buy It Now.
     * 
     *
     * @returns java.lang.Boolean
	 */
	public Boolean getIncludeFinalValueFees() {
	    return this.includeFinalValueFees;
	}
	
	/**
	 * public setter
	 *
     * 
     * Indicates whether to include Final Value Fee (FVF) in the response. For most
     * listing types, the Final Value Fee is returned in Transaction.FinalValueFee.
     * The Final Value Fee is returned on a transaction-by-transaction basis for
     * FixedPriceItem and StoresFixedPrice listing types. For all other listing
     * types, the Final Value Fee is returned when the listing status is Completed.
     * This value is not returned if the auction ended with Buy It Now.
     * 
     *
     * @param java.lang.Boolean
	 */
	public void setIncludeFinalValueFees(Boolean includeFinalValueFees) {
	    this.includeFinalValueFees = includeFinalValueFees;
	}

}