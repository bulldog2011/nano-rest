// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package ebay.apis.eblbasecomponents;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;
import java.util.Date;

/**
 * 
 * Contains information about a single refund. A refund contains information about the
 * amount refunded for an order line item to a single buyer. 
 * <br/><br/> <span class="tablenote"><strong>Note:</strong> Three RefundType fields
 * (RefundFromSeller, RefundTime and TotalRefundToBuyer) are returned (for GetOrders)
 * only if a refund has been issued against a Half.com order line item.</span>
 * 
 */
public class RefundType implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element(name = "RefundFromSeller")
	private AmountType refundFromSeller;
	
	@Element(name = "TotalRefundToBuyer")
	private AmountType totalRefundToBuyer;
	
	@Element(name = "RefundTime")
	private Date refundTime;
	
	@Element(name = "RefundID")
	private String refundID;
	
	@Element(name = "RefundTransactionArray")
	private RefundTransactionArrayType refundTransactionArray;
	
	@Element(name = "RefundAmount")
	private AmountType refundAmount;
	
	@Element(name = "RefundStatus")
	private RefundStatusCodeType refundStatus;
	
	@Element(name = "RefundFailureReason")
	private RefundFailureReasonType refundFailureReason;
	
	@Element(name = "RefundFundingSourceArray")
	private RefundFundingSourceArrayType refundFundingSourceArray;
	
	@Element(name = "ExternalReferenceID")
	private String externalReferenceID;
	
	@Element(name = "RefundRequestedTime")
	private Date refundRequestedTime;
	
	@Element(name = "RefundCompletionTime")
	private Date refundCompletionTime;
	
	@Element(name = "EstimatedRefundCompletionTime")
	private Date estimatedRefundCompletionTime;
	
	@Element(name = "SellerNoteToBuyer")
	private String sellerNoteToBuyer;
	
    
	/**
     * public getter
     *
     * 
     * Total amount refunded by the seller for this order line item.<br/><br/>
     *             <span class="tablenote"><strong>Note:</strong> This field is 
     *             returned (for GetOrders) only if a refund has been issued against a Half.com
     * order line item.</span>
     * 
     *
     * @returns ebay.apis.eblbasecomponents.AmountType
	 */
	public AmountType getRefundFromSeller() {
	    return this.refundFromSeller;
	}
	
	/**
	 * public setter
	 *
     * 
     * Total amount refunded by the seller for this order line item.<br/><br/>
     *             <span class="tablenote"><strong>Note:</strong> This field is 
     *             returned (for GetOrders) only if a refund has been issued against a Half.com
     * order line item.</span>
     * 
     *
     * @param ebay.apis.eblbasecomponents.AmountType
	 */
	public void setRefundFromSeller(AmountType refundFromSeller) {
	    this.refundFromSeller = refundFromSeller;
	}
	/**
     * public getter
     *
     * 
     * Total amount refunded to the buyer for this order line item.<br/><br/>
     *             <span class="tablenote"><strong>Note:</strong> This field is 
     *             returned (for GetOrders) only if a refund has been issued against a Half.com
     * order line item.</span>
     * 
     *
     * @returns ebay.apis.eblbasecomponents.AmountType
	 */
	public AmountType getTotalRefundToBuyer() {
	    return this.totalRefundToBuyer;
	}
	
	/**
	 * public setter
	 *
     * 
     * Total amount refunded to the buyer for this order line item.<br/><br/>
     *             <span class="tablenote"><strong>Note:</strong> This field is 
     *             returned (for GetOrders) only if a refund has been issued against a Half.com
     * order line item.</span>
     * 
     *
     * @param ebay.apis.eblbasecomponents.AmountType
	 */
	public void setTotalRefundToBuyer(AmountType totalRefundToBuyer) {
	    this.totalRefundToBuyer = totalRefundToBuyer;
	}
	/**
     * public getter
     *
     * 
     * The date and time at which the refund was issued.<br/><br/>
     *             <span class="tablenote"><strong>Note:</strong> This field is 
     *             returned (for GetOrders) only if a refund has been issued against a Half.com
     * order line item.</span>
     * 
     *
     * @returns java.util.Date
	 */
	public Date getRefundTime() {
	    return this.refundTime;
	}
	
	/**
	 * public setter
	 *
     * 
     * The date and time at which the refund was issued.<br/><br/>
     *             <span class="tablenote"><strong>Note:</strong> This field is 
     *             returned (for GetOrders) only if a refund has been issued against a Half.com
     * order line item.</span>
     * 
     *
     * @param java.util.Date
	 */
	public void setRefundTime(Date refundTime) {
	    this.refundTime = refundTime;
	}
	/**
     * public getter
     *
     * 
     * The refund ID for this refund.<br>
     *             <br/><br/>
     *             <span class="tablenote"><strong>Note:</strong> For eBay orders, 
     *             Refund containers are only returned for DE/AT orders subject to the new eBay
     * payment process.</span>
     * 
     *
     * @returns java.lang.String
	 */
	public String getRefundID() {
	    return this.refundID;
	}
	
	/**
	 * public setter
	 *
     * 
     * The refund ID for this refund.<br>
     *             <br/><br/>
     *             <span class="tablenote"><strong>Note:</strong> For eBay orders, 
     *             Refund containers are only returned for DE/AT orders subject to the new eBay
     * payment process.</span>
     * 
     *
     * @param java.lang.String
	 */
	public void setRefundID(String refundID) {
	    this.refundID = refundID;
	}
	/**
     * public getter
     *
     * 
     * A container consisting of details about an order line item against which the seller issued a refund.<br/><br/>
     *             <span class="tablenote"><strong>Note:</strong> For eBay orders, 
     *             Refund containers are only returned for DE/AT orders subject to the new eBay
     * payment process.</span>
     * 
     *
     * @returns ebay.apis.eblbasecomponents.RefundTransactionArrayType
	 */
	public RefundTransactionArrayType getRefundTransactionArray() {
	    return this.refundTransactionArray;
	}
	
	/**
	 * public setter
	 *
     * 
     * A container consisting of details about an order line item against which the seller issued a refund.<br/><br/>
     *             <span class="tablenote"><strong>Note:</strong> For eBay orders, 
     *             Refund containers are only returned for DE/AT orders subject to the new eBay
     * payment process.</span>
     * 
     *
     * @param ebay.apis.eblbasecomponents.RefundTransactionArrayType
	 */
	public void setRefundTransactionArray(RefundTransactionArrayType refundTransactionArray) {
	    this.refundTransactionArray = refundTransactionArray;
	}
	/**
     * public getter
     *
     * 
     * The total amount of the refund requested.<br/><br/>
     *             <span class="tablenote"><strong>Note:</strong> For eBay orders, 
     *             Refund containers are only returned for DE/AT orders subject to the new eBay
     * payment process.</span>
     * 
     *
     * @returns ebay.apis.eblbasecomponents.AmountType
	 */
	public AmountType getRefundAmount() {
	    return this.refundAmount;
	}
	
	/**
	 * public setter
	 *
     * 
     * The total amount of the refund requested.<br/><br/>
     *             <span class="tablenote"><strong>Note:</strong> For eBay orders, 
     *             Refund containers are only returned for DE/AT orders subject to the new eBay
     * payment process.</span>
     * 
     *
     * @param ebay.apis.eblbasecomponents.AmountType
	 */
	public void setRefundAmount(AmountType refundAmount) {
	    this.refundAmount = refundAmount;
	}
	/**
     * public getter
     *
     * 
     * A code indicating the status of the refund request.<br/><br/>
     *             <span class="tablenote"><strong>Note:</strong> For eBay orders, 
     *             Refund containers are only returned for DE/AT orders subject to the new eBay
     * payment process.</span>
     * 
     *
     * @returns ebay.apis.eblbasecomponents.RefundStatusCodeType
	 */
	public RefundStatusCodeType getRefundStatus() {
	    return this.refundStatus;
	}
	
	/**
	 * public setter
	 *
     * 
     * A code indicating the status of the refund request.<br/><br/>
     *             <span class="tablenote"><strong>Note:</strong> For eBay orders, 
     *             Refund containers are only returned for DE/AT orders subject to the new eBay
     * payment process.</span>
     * 
     *
     * @param ebay.apis.eblbasecomponents.RefundStatusCodeType
	 */
	public void setRefundStatus(RefundStatusCodeType refundStatus) {
	    this.refundStatus = refundStatus;
	}
	/**
     * public getter
     *
     * 
     * This describes the reason why a refund was not issued by the seller.<br/><br/>
     *             <span class="tablenote"><strong>Note:</strong> For eBay orders, 
     *             Refund containers are only returned for DE/AT orders subject to the new eBay
     * payment process.</span>
     * 
     *
     * @returns ebay.apis.eblbasecomponents.RefundFailureReasonType
	 */
	public RefundFailureReasonType getRefundFailureReason() {
	    return this.refundFailureReason;
	}
	
	/**
	 * public setter
	 *
     * 
     * This describes the reason why a refund was not issued by the seller.<br/><br/>
     *             <span class="tablenote"><strong>Note:</strong> For eBay orders, 
     *             Refund containers are only returned for DE/AT orders subject to the new eBay
     * payment process.</span>
     * 
     *
     * @param ebay.apis.eblbasecomponents.RefundFailureReasonType
	 */
	public void setRefundFailureReason(RefundFailureReasonType refundFailureReason) {
	    this.refundFailureReason = refundFailureReason;
	}
	/**
     * public getter
     *
     * 
     * This container lists the funding sources for the refund.<br/><br/>
     *             <span class="tablenote"><strong>Note:</strong> For eBay orders, 
     *             Refund containers are only returned for DE/AT orders subject to the new eBay
     * payment process.</span>
     * 
     *
     * @returns ebay.apis.eblbasecomponents.RefundFundingSourceArrayType
	 */
	public RefundFundingSourceArrayType getRefundFundingSourceArray() {
	    return this.refundFundingSourceArray;
	}
	
	/**
	 * public setter
	 *
     * 
     * This container lists the funding sources for the refund.<br/><br/>
     *             <span class="tablenote"><strong>Note:</strong> For eBay orders, 
     *             Refund containers are only returned for DE/AT orders subject to the new eBay
     * payment process.</span>
     * 
     *
     * @param ebay.apis.eblbasecomponents.RefundFundingSourceArrayType
	 */
	public void setRefundFundingSourceArray(RefundFundingSourceArrayType refundFundingSourceArray) {
	    this.refundFundingSourceArray = refundFundingSourceArray;
	}
	/**
     * public getter
     *
     * 
     * The unique external reference ID that was passed by the seller when requesting the refund. This ID helps to prevent duplication of refund requests.<br/><br/>
     *             <span class="tablenote"><strong>Note:</strong> For eBay orders, 
     *             Refund containers are only returned for DE/AT orders subject to the new eBay
     * payment process.</span>
     * 
     *
     * @returns java.lang.String
	 */
	public String getExternalReferenceID() {
	    return this.externalReferenceID;
	}
	
	/**
	 * public setter
	 *
     * 
     * The unique external reference ID that was passed by the seller when requesting the refund. This ID helps to prevent duplication of refund requests.<br/><br/>
     *             <span class="tablenote"><strong>Note:</strong> For eBay orders, 
     *             Refund containers are only returned for DE/AT orders subject to the new eBay
     * payment process.</span>
     * 
     *
     * @param java.lang.String
	 */
	public void setExternalReferenceID(String externalReferenceID) {
	    this.externalReferenceID = externalReferenceID;
	}
	/**
     * public getter
     *
     * 
     * The date and time when the refund was requested.<br/><br/>
     *             <span class="tablenote"><strong>Note:</strong> For eBay orders, 
     *             Refund containers are only returned for DE/AT orders subject to the new eBay
     * payment process.</span>
     * 
     *
     * @returns java.util.Date
	 */
	public Date getRefundRequestedTime() {
	    return this.refundRequestedTime;
	}
	
	/**
	 * public setter
	 *
     * 
     * The date and time when the refund was requested.<br/><br/>
     *             <span class="tablenote"><strong>Note:</strong> For eBay orders, 
     *             Refund containers are only returned for DE/AT orders subject to the new eBay
     * payment process.</span>
     * 
     *
     * @param java.util.Date
	 */
	public void setRefundRequestedTime(Date refundRequestedTime) {
	    this.refundRequestedTime = refundRequestedTime;
	}
	/**
     * public getter
     *
     * 
     * The date and time that the refund was completed.<br/><br/>
     *             <span class="tablenote"><strong>Note:</strong> For eBay orders, 
     *             Refund containers are only returned for DE/AT orders subject to the new eBay
     * payment process.</span>
     * 
     *
     * @returns java.util.Date
	 */
	public Date getRefundCompletionTime() {
	    return this.refundCompletionTime;
	}
	
	/**
	 * public setter
	 *
     * 
     * The date and time that the refund was completed.<br/><br/>
     *             <span class="tablenote"><strong>Note:</strong> For eBay orders, 
     *             Refund containers are only returned for DE/AT orders subject to the new eBay
     * payment process.</span>
     * 
     *
     * @param java.util.Date
	 */
	public void setRefundCompletionTime(Date refundCompletionTime) {
	    this.refundCompletionTime = refundCompletionTime;
	}
	/**
     * public getter
     *
     * 
     * The estimated date and time that the refund is expected to be completed.<br/><br/>
     *             <span class="tablenote"><strong>Note:</strong> For eBay orders, 
     *             Refund containers are only returned for DE/AT orders subject to the new eBay
     * payment process.</span>
     * 
     *
     * @returns java.util.Date
	 */
	public Date getEstimatedRefundCompletionTime() {
	    return this.estimatedRefundCompletionTime;
	}
	
	/**
	 * public setter
	 *
     * 
     * The estimated date and time that the refund is expected to be completed.<br/><br/>
     *             <span class="tablenote"><strong>Note:</strong> For eBay orders, 
     *             Refund containers are only returned for DE/AT orders subject to the new eBay
     * payment process.</span>
     * 
     *
     * @param java.util.Date
	 */
	public void setEstimatedRefundCompletionTime(Date estimatedRefundCompletionTime) {
	    this.estimatedRefundCompletionTime = estimatedRefundCompletionTime;
	}
	/**
     * public getter
     *
     * 
     * Comments made by the the seller to the buyer.<br/><br/>
     *             <span class="tablenote"><strong>Note:</strong> For eBay orders, 
     *             Refund containers are only returned for DE/AT orders subject to the new eBay
     * payment process.</span>
     * 
     *
     * @returns java.lang.String
	 */
	public String getSellerNoteToBuyer() {
	    return this.sellerNoteToBuyer;
	}
	
	/**
	 * public setter
	 *
     * 
     * Comments made by the the seller to the buyer.<br/><br/>
     *             <span class="tablenote"><strong>Note:</strong> For eBay orders, 
     *             Refund containers are only returned for DE/AT orders subject to the new eBay
     * payment process.</span>
     * 
     *
     * @param java.lang.String
	 */
	public void setSellerNoteToBuyer(String sellerNoteToBuyer) {
	    this.sellerNoteToBuyer = sellerNoteToBuyer;
	}

}