// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package ebay.apis.eblbasecomponents;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;
import java.util.List;

/**
 * 
 * Container of ItemTransactionIDs.
 * 
 */
public class ItemTransactionIDArrayType implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element(name = "ItemTransactionID")
	private List<ItemTransactionIDType> itemTransactionID;
	
    
	/**
     * public getter
     *
     * 
     * An ItemID-TransactionID container.
     * Note: OrderID is not returned when the GetOrderTransactions request includes
     * ItemTransactionID, even if the transaction is part of an order.
     * To get the OrderID for a transaction, call GetItemTransaction with
     * IncludeContainingOrder = true.
     * 
     *
     * @returns java.util.List<ebay.apis.eblbasecomponents.ItemTransactionIDType>
	 */
	public List<ItemTransactionIDType> getItemTransactionID() {
	    return this.itemTransactionID;
	}
	
	/**
	 * public setter
	 *
     * 
     * An ItemID-TransactionID container.
     * Note: OrderID is not returned when the GetOrderTransactions request includes
     * ItemTransactionID, even if the transaction is part of an order.
     * To get the OrderID for a transaction, call GetItemTransaction with
     * IncludeContainingOrder = true.
     * 
     *
     * @param java.util.List<ebay.apis.eblbasecomponents.ItemTransactionIDType>
	 */
	public void setItemTransactionID(List<ItemTransactionIDType> itemTransactionID) {
	    this.itemTransactionID = itemTransactionID;
	}

}