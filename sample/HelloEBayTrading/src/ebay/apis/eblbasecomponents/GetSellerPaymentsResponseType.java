// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package ebay.apis.eblbasecomponents;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;
import java.util.List;

/**
 * 
 * Returns a summary of pending or paid payments that Half.com created for the seller
 * identified by the authentication token in the request. Only returns payments that
 * occurred within a particular pay period. Each payment is for one transaction for
 * one item in one order. An order can contain transactions for multiple items from
 * multiple sellers, but this call only retrieves payments that are relevant to one
 * seller. Payments are only issued for items and transactions that the seller has
 * confirmed (see the Half.com online help for details). The financial value of a
 * payment is typically based on an amount that a buyer paid to Half.com for a
 * transaction, plus the shipping cost the buyer paid to Half.com for the item, minus
 * Half.com's commission. For most sellers, each month contains two pay periods: One
 * from the 1st to the 15th of the month, and one from the 16th to the last day of
 * the month. Payments are submitted to the seller's financial institution a certain
 * number of days after the current pay period ends (see the Half.com online help for
 * details).
 * 
 */
@RootElement(name = "GetSellerPaymentsResponse", namespace = "urn:ebay:apis:eBLBaseComponents")
public class GetSellerPaymentsResponseType extends AbstractResponseType implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element(name = "PaginationResult")
	private PaginationResultType paginationResult;
	
	@Element(name = "HasMorePayments")
	private Boolean hasMorePayments;
	
	@Element(name = "SellerPayment")
	private List<SellerPaymentType> sellerPayment;
	
	@Element(name = "PaymentsPerPage")
	private Integer paymentsPerPage;
	
	@Element(name = "PageNumber")
	private Integer pageNumber;
	
	@Element(name = "ReturnedPaymentCountActual")
	private Integer returnedPaymentCountActual;
	
    
	/**
     * public getter
     *
     * 
     * Contains information regarding the pagination of data (if pagination is used),
     * including total number of pages and total number of entries.
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
     * Contains information regarding the pagination of data (if pagination is used),
     * including total number of pages and total number of entries.
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
     * If true, there are more payments yet to be retrieved. Additional
     * GetSellerPayments calls with higher page numbers or more entries per page
     * must be made to retrieve these payments. If false, no more payments are
     * available or no payments match the request (based on the payment status
     * and time filter).
     * 
     *
     * @returns java.lang.Boolean
	 */
	public Boolean getHasMorePayments() {
	    return this.hasMorePayments;
	}
	
	/**
	 * public setter
	 *
     * 
     * If true, there are more payments yet to be retrieved. Additional
     * GetSellerPayments calls with higher page numbers or more entries per page
     * must be made to retrieve these payments. If false, no more payments are
     * available or no payments match the request (based on the payment status
     * and time filter).
     * 
     *
     * @param java.lang.Boolean
	 */
	public void setHasMorePayments(Boolean hasMorePayments) {
	    this.hasMorePayments = hasMorePayments;
	}
	/**
     * public getter
     *
     * 
     * Information about a single payment that matches the criteria in the
     * request. A payment is between Half.com and a seller. Each payment is for
     * one transaction for one item in one order. An order can contain
     * transactions for multiple items from multiple sellers, but this call only
     * retrieves payments that are relevant to one seller. The financial value of
     * a payment is typically based on an amount that a buyer paid to Half.com
     * for a transaction, plus the shipping cost the buyer paid for the item,
     * minus Half.com's commission. Payments can also describe refunds that the
     * seller has issued. Multiple SellerPayment entries can be returned per page
     * of results. Typically, they are returned in reverse chronological order
     * (most recent PaidTime first). Only returned if payments exist that match
     * the request.
     * 
     *
     * @returns java.util.List<ebay.apis.eblbasecomponents.SellerPaymentType>
	 */
	public List<SellerPaymentType> getSellerPayment() {
	    return this.sellerPayment;
	}
	
	/**
	 * public setter
	 *
     * 
     * Information about a single payment that matches the criteria in the
     * request. A payment is between Half.com and a seller. Each payment is for
     * one transaction for one item in one order. An order can contain
     * transactions for multiple items from multiple sellers, but this call only
     * retrieves payments that are relevant to one seller. The financial value of
     * a payment is typically based on an amount that a buyer paid to Half.com
     * for a transaction, plus the shipping cost the buyer paid for the item,
     * minus Half.com's commission. Payments can also describe refunds that the
     * seller has issued. Multiple SellerPayment entries can be returned per page
     * of results. Typically, they are returned in reverse chronological order
     * (most recent PaidTime first). Only returned if payments exist that match
     * the request.
     * 
     *
     * @param java.util.List<ebay.apis.eblbasecomponents.SellerPaymentType>
	 */
	public void setSellerPayment(List<SellerPaymentType> sellerPayment) {
	    this.sellerPayment = sellerPayment;
	}
	/**
     * public getter
     *
     * 
     * Indicates the number of payments that can be returned per page of data
     * (i.e., per call). This is the same as the value specified in the
     * Pagination.EntriesPerPage input (or the default value, if EntriesPerPage
     * was not specified). This is not necessarily the actual number of payments
     * returned per page (see ReturnedPaymentCountActual).
     * 
     *
     * @returns java.lang.Integer
	 */
	public Integer getPaymentsPerPage() {
	    return this.paymentsPerPage;
	}
	
	/**
	 * public setter
	 *
     * 
     * Indicates the number of payments that can be returned per page of data
     * (i.e., per call). This is the same as the value specified in the
     * Pagination.EntriesPerPage input (or the default value, if EntriesPerPage
     * was not specified). This is not necessarily the actual number of payments
     * returned per page (see ReturnedPaymentCountActual).
     * 
     *
     * @param java.lang.Integer
	 */
	public void setPaymentsPerPage(Integer paymentsPerPage) {
	    this.paymentsPerPage = paymentsPerPage;
	}
	/**
     * public getter
     *
     * 
     * Indicates which page of data holds the current result set. Will be the
     * same as the value specified in the Pagination.PageNumber input. (If the
     * input is higher than the total number of pages, the call fails with an
     * error.) If no payments are returned, the value is 0. If payments are
     * returned, the first page number is 1.
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
     * Indicates which page of data holds the current result set. Will be the
     * same as the value specified in the Pagination.PageNumber input. (If the
     * input is higher than the total number of pages, the call fails with an
     * error.) If no payments are returned, the value is 0. If payments are
     * returned, the first page number is 1.
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
     * Indicates the total number of payments returned (i.e., the number of
     * SellerPayment entries returned.
     * 
     *
     * @returns java.lang.Integer
	 */
	public Integer getReturnedPaymentCountActual() {
	    return this.returnedPaymentCountActual;
	}
	
	/**
	 * public setter
	 *
     * 
     * Indicates the total number of payments returned (i.e., the number of
     * SellerPayment entries returned.
     * 
     *
     * @param java.lang.Integer
	 */
	public void setReturnedPaymentCountActual(Integer returnedPaymentCountActual) {
	    this.returnedPaymentCountActual = returnedPaymentCountActual;
	}

}