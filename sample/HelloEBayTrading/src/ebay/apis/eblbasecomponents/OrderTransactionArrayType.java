// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package ebay.apis.eblbasecomponents;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;
import java.util.List;

/**
 * 
 * Contains a list of orders, transactions, or both, each of OrderTransactionType.
 * 
 */
public class OrderTransactionArrayType implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element(name = "OrderTransaction")
	private List<OrderTransactionType> orderTransaction;
	
    
	/**
     * public getter
     *
     * 
     * The individual order or transaction.
     * 
     *
     * @returns java.util.List<ebay.apis.eblbasecomponents.OrderTransactionType>
	 */
	public List<OrderTransactionType> getOrderTransaction() {
	    return this.orderTransaction;
	}
	
	/**
	 * public setter
	 *
     * 
     * The individual order or transaction.
     * 
     *
     * @param java.util.List<ebay.apis.eblbasecomponents.OrderTransactionType>
	 */
	public void setOrderTransaction(List<OrderTransactionType> orderTransaction) {
	    this.orderTransaction = orderTransaction;
	}

}