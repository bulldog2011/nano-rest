// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package ebay.apis.eblbasecomponents;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;

/**
 * 
 * Returns an array of order line item (transaction) data for the item specified in the request.
 * The results can be used to create a report of data that is commonly
 * necessary for order processing.
 * Zero, one, or many <b>Transaction</b> objects can be returned in the <b>TransactionArray</b>.
 * The set of order line items returned is limited to those that were modified between
 * the times specified in the request's <b>ModTimeFrom</b> and <b>ModTime</b> filters.
 * Also returns the <b>Item</b> object that spawned the order line items.
 * If pagination filters were specified in the request, returns meta-data describing
 * the effects of those filters on the current response and the estimated effects if
 * the same filters are used in subsequent calls.
 * <br><br>
 * Data from the <b>TransactionArray</b> may be used to trigger the following Platform
 * Notifications: EndOfAuction, AuctionCheckoutComplete, FixedPriceEndOfTransaction,
 * CheckoutBuyerRequestTotal, FixedPriceTransaction, Checkout,
 * FixedPriceTransactionForSeller, FixedPriceTransactionForBuyer, ItemMarkedAsShipped,
 * and ItemMarkedAsPaid. Each notification will be based on the state of the item
 * (a 'snapshot' of the item) at the time the order line item was created.
 * 
 */
@RootElement(name = "GetItemTransactionsResponse", namespace = "urn:ebay:apis:eBLBaseComponents")
public class GetItemTransactionsResponseType extends AbstractResponseType implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element(name = "PaginationResult")
	private PaginationResultType paginationResult;
	
	@Element(name = "HasMoreTransactions")
	private Boolean hasMoreTransactions;
	
	@Element(name = "TransactionsPerPage")
	private Integer transactionsPerPage;
	
	@Element(name = "PageNumber")
	private Integer pageNumber;
	
	@Element(name = "ReturnedTransactionCountActual")
	private Integer returnedTransactionCountActual;
	
	@Element(name = "Item")
	private ItemType item;
	
	@Element(name = "TransactionArray")
	private TransactionArrayType transactionArray;
	
	@Element(name = "PayPalPreferred")
	private Boolean payPalPreferred;
	
    
	/**
     * public getter
     *
     * 
     * Contains the total number of pages (<b>TotalNumberOfPages</b>) and the total number
     * of entries (<b>TotalNumberOfEntries</b>) that could be returned given repeated calls
     * that use the same selection criteria as the call that returned this response.
     * 
     *
     * @returns ebay.apis.eblbasecomponents.PaginationResultType
	 */
	public PaginationResultType getPaginationResult() {
	    return this.paginationResult;
	}
	
	/**
	 * public setter
	 *
     * 
     * Contains the total number of pages (<b>TotalNumberOfPages</b>) and the total number
     * of entries (<b>TotalNumberOfEntries</b>) that could be returned given repeated calls
     * that use the same selection criteria as the call that returned this response.
     * 
     *
     * @param ebay.apis.eblbasecomponents.PaginationResultType
	 */
	public void setPaginationResult(PaginationResultType paginationResult) {
	    this.paginationResult = paginationResult;
	}
	/**
     * public getter
     *
     * 
     * Indicates whether there are additional order line items (transactions) to retrieve.
     * That is, indicates whether more pages of data are available to be
     * returned, given the filters that were specified in the request.
     * Returns false for the last page of data.
     * 
     *
     * @returns java.lang.Boolean
	 */
	public Boolean getHasMoreTransactions() {
	    return this.hasMoreTransactions;
	}
	
	/**
	 * public setter
	 *
     * 
     * Indicates whether there are additional order line items (transactions) to retrieve.
     * That is, indicates whether more pages of data are available to be
     * returned, given the filters that were specified in the request.
     * Returns false for the last page of data.
     * 
     *
     * @param java.lang.Boolean
	 */
	public void setHasMoreTransactions(Boolean hasMoreTransactions) {
	    this.hasMoreTransactions = hasMoreTransactions;
	}
	/**
     * public getter
     *
     * 
     * Number of order line items (transactions) returned per page (per call). May be a higher value
     * than <b>ReturnedTransactionCountActual</b> if the page returned is the last page
     * and more than one page of data exists.
     * 
     *
     * @returns java.lang.Integer
	 */
	public Integer getTransactionsPerPage() {
	    return this.transactionsPerPage;
	}
	
	/**
	 * public setter
	 *
     * 
     * Number of order line items (transactions) returned per page (per call). May be a higher value
     * than <b>ReturnedTransactionCountActual</b> if the page returned is the last page
     * and more than one page of data exists.
     * 
     *
     * @param java.lang.Integer
	 */
	public void setTransactionsPerPage(Integer transactionsPerPage) {
	    this.transactionsPerPage = transactionsPerPage;
	}
	/**
     * public getter
     *
     * 
     * Page number for the page of order line items the response returned.
     * 
     *
     * @returns java.lang.Integer
	 */
	public Integer getPageNumber() {
	    return this.pageNumber;
	}
	
	/**
	 * public setter
	 *
     * 
     * Page number for the page of order line items the response returned.
     * 
     *
     * @param java.lang.Integer
	 */
	public void setPageNumber(Integer pageNumber) {
	    this.pageNumber = pageNumber;
	}
	/**
     * public getter
     *
     * 
     * Number of order line items retrieved in the current page of results just returned.
     * May be a lower value than <b>TransactionsPerPage</b> if the page returned is the last
     * page and more than one page of data exists.
     * 
     *
     * @returns java.lang.Integer
	 */
	public Integer getReturnedTransactionCountActual() {
	    return this.returnedTransactionCountActual;
	}
	
	/**
	 * public setter
	 *
     * 
     * Number of order line items retrieved in the current page of results just returned.
     * May be a lower value than <b>TransactionsPerPage</b> if the page returned is the last
     * page and more than one page of data exists.
     * 
     *
     * @param java.lang.Integer
	 */
	public void setReturnedTransactionCountActual(Integer returnedTransactionCountActual) {
	    this.returnedTransactionCountActual = returnedTransactionCountActual;
	}
	/**
     * public getter
     *
     * 
     * <b>Item</b> object that spawned the order line item. It is a purchase from this item's listing
     * that the order line item represents.
     * 
     *
     * @returns ebay.apis.eblbasecomponents.ItemType
	 */
	public ItemType getItem() {
	    return this.item;
	}
	
	/**
	 * public setter
	 *
     * 
     * <b>Item</b> object that spawned the order line item. It is a purchase from this item's listing
     * that the order line item represents.
     * 
     *
     * @param ebay.apis.eblbasecomponents.ItemType
	 */
	public void setItem(ItemType item) {
	    this.item = item;
	}
	/**
     * public getter
     *
     * 
     * List of <b>Transaction</b> objects representing the order line items resulting
     * from the listing. Each <b>Transaction</b> object contains the data for one purchase
     * (of one or more items in the same listing). The <b>Transaction.Item</b> field is not
     * returned because the <b>Item</b> object is returned at the root level of the response.
     * See the reference guide for more information about the fields that are returned.
     * 
     *
     * @returns ebay.apis.eblbasecomponents.TransactionArrayType
	 */
	public TransactionArrayType getTransactionArray() {
	    return this.transactionArray;
	}
	
	/**
	 * public setter
	 *
     * 
     * List of <b>Transaction</b> objects representing the order line items resulting
     * from the listing. Each <b>Transaction</b> object contains the data for one purchase
     * (of one or more items in the same listing). The <b>Transaction.Item</b> field is not
     * returned because the <b>Item</b> object is returned at the root level of the response.
     * See the reference guide for more information about the fields that are returned.
     * 
     *
     * @param ebay.apis.eblbasecomponents.TransactionArrayType
	 */
	public void setTransactionArray(TransactionArrayType transactionArray) {
	    this.transactionArray = transactionArray;
	}
	/**
     * public getter
     *
     * 
     * Indicates whether the item's seller has the preference enabled that shows
     * that the seller prefers PayPal as the method of payment for an item. This
     * preference is indicated on an item's View Item page and is intended to
     * influence a buyer to use PayPal
     * to pay for the item.
     * 
     *
     * @returns java.lang.Boolean
	 */
	public Boolean getPayPalPreferred() {
	    return this.payPalPreferred;
	}
	
	/**
	 * public setter
	 *
     * 
     * Indicates whether the item's seller has the preference enabled that shows
     * that the seller prefers PayPal as the method of payment for an item. This
     * preference is indicated on an item's View Item page and is intended to
     * influence a buyer to use PayPal
     * to pay for the item.
     * 
     *
     * @param java.lang.Boolean
	 */
	public void setPayPalPreferred(Boolean payPalPreferred) {
	    this.payPalPreferred = payPalPreferred;
	}

}