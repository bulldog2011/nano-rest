// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package ebay.apis.eblbasecomponents;

/**
 * 
 * Defines the current state of the dispute, which determines the values
 * that are valid for DisputeActivity. DisputeState is an internal value
 * returned in the response. A value can apply to an Unpaid Item or Item
 * Not Received dispute. A dispute filed when an item is significantly not
 * as described in the product listing is a variation of an Item Not
 * Received dispute.
 * 
 */
public enum DisputeStateCodeType {

    /**
     * 
   * The dispute is locked and cannot be updated. For any type of
   * dispute. No values of DisputeActivity are valid.
   * 
     */
    LOCKED("Locked"),
  

    /**
     * 
   * The dispute is closed. In some cases, it can be reversed with
   * SellerReverseDispute. For any type of dispute. No values of
   * DisputeActivity are valid.
   * 
     */
    CLOSED("Closed"),
  

    /**
     * 
   * eBay sent the buyer an Unpaid Item Reminder with a Pay Now
   * option. Waiting for the buyer's first response. It is within the 7-day
   * grace period. For Unpaid Item Disputes. DisputeActivity can be
   * SellerAddInformation or SellerCompletedTransaction.
   * 
     */
    BUYER_FIRST_RESPONSE_PAY_OPTION("BuyerFirstResponsePayOption"),
  

    /**
     * 
   * eBay sent the buyer an Unpaid Item Reminder with no Pay Now
   * option. Waiting for the buyer's first response. It is within the 7-day
   * grace period. For Unpaid Item Disputes. DisputeActivity can be
   * SellerAddInformation or SellerCompletedTransaction.
   * 
     */
    BUYER_FIRST_RESPONSE_NO_PAY_OPTION("BuyerFirstResponseNoPayOption"),
  

    /**
     * 
   * eBay sent the buyer an Unpaid Item Reminder with a Pay Now
   * option. Waiting for the buyer's first response. The 7-day grace
   * period has expired. For Unpaid Item Disputes. DisputeActivity can be
   * SellerAddInformation, SellerCompletedTransaction, or
   * SellerEndCommunication.
   * 
     */
    BUYER_FIRST_RESPONSE_PAY_OPTION_LATE_RESPONSE("BuyerFirstResponsePayOptionLateResponse"),
  

    /**
     * 
   * eBay sent the buyer an Unpaid Item Reminder with no Pay Now
   * option. Waiting for the buyer's first response. The 7-day grace
   * period has expired. For Unpaid Item Disputes. DisputeActivity can be
   * SellerAddInformation, SellerCompletedTransaction, or
   * SellerEndCommunication.
   * 
     */
    BUYER_FIRST_RESPONSE_NO_PAY_OPTION_LATE_RESPONSE("BuyerFirstResponseNoPayOptionLateResponse"),
  

    /**
     * 
   * The buyer and seller have communicated, and eBay offered the buyer
   * a Pay Now option. For Unpaid Item Disputes. DisputeActivity
   * can be SellerAddInformation, SellerCompletedTransaction,
   * SellerEndCommunication, or CameToAgreementNeedFVFCredit.
   * 
     */
    MUTUAL_COMMUNICATION_PAY_OPTION("MutualCommunicationPayOption"),
  

    /**
     * 
   *     The buyer and seller have communicated. eBay did not offer
   *     the buyer a Pay Now option. For Unpaid Item Disputes. DisputeActivity can
   * be SellerAddInformation, SellerCompletedTransaction,
   * SellerEndCommunication, or CameToAgreementNeedFVFCredit.
   * 
     */
    MUTUAL_COMMUNICATION_NO_PAY_OPTION("MutualCommunicationNoPayOption"),
  

    /**
     * 
   * The dispute is pending resolution. A dispute cannot be closed
   * when it is in this state. For Unpaid Item Disputes.
   * No values of DisputeActivity are valid.
   * 
     */
    PENDING_RESOLVE("PendingResolve"),
  

    /**
     * 
   * The buyer and seller have agreed within the grace period not
   * to complete the transaction. For Unpaid Item Disputes.
   * DisputeActivity can be SellerAddInformation.
   * 
     */
    MUTUAL_WITHDRAWAL_AGREEMENT("MutualWithdrawalAgreement"),
  

    /**
     * 
   * The buyer and seller have agreed not to complete the
   * transaction, after the grace period. For Unpaid Item Disputes.
   * DisputeActivity can be SellerAddInformation,
   * SellerCompletedTransaction, or SellerEndCommunication.
   * 
     */
    MUTUAL_WITHDRAWAL_AGREEMENT_LATE("MutualWithdrawalAgreementLate"),
  

    /**
     * 
   * The buyer filed an Item Not Received dispute, and the seller
   * has not responded. For Item Not Received disputes. DisputeActivity
   * can be SellerOffersRefund, SellerShippedItem, or SellerComment.
   * 
     */
    NOT_RECEIVED_NO_SELLER_RESPONSE("NotReceivedNoSellerResponse"),
  

    /**
     * 
   * The buyer filed an Item Not Received dispute for an item
   * significantly not as described, and the seller has not responded.
   * DisputeActivity can be SellerOffersRefund or SellerComment.
   * 
     */
    NOT_AS_DESCRIBED_NO_SELLER_RESPONSE("NotAsDescribedNoSellerResponse"),
  

    /**
     * 
   * The buyer filed an Item Not Received dispute and is
   * communicating with the seller. DisputeActivity can be
   * SellerOffersRefund, SellerShippedItem, or SellerComment.
   * 
     */
    NOT_RECEIVED_MUTUAL_COMMUNICATION("NotReceivedMutualCommunication"),
  

    /**
     * 
   * The buyer filed an Item Not Received dispute for an item
   * significantly not as described and is communicating with the seller.
   * DisputeActivity can be SellerOffersRefund.
   * 
     */
    NOT_AS_DESCRIBED_MUTUAL_COMMUNICATION("NotAsDescribedMutualCommunication"),
  

    /**
     * 
   * The seller says mutual agreement has been reached and is
   * waiting for the buyer to confirm, or the buyer is returning the item
   * to the seller. DisputeActivity can be SellerAddInformation.
   * For Unpaid Item Disputes.
   * 
     */
    MUTUAL_AGREEMENT_OR_BUYER_RETURNING_ITEM("MutualAgreementOrBuyerReturningItem"),
  

    /**
     * 
   * The claim was assigned to an adjuster.
   * 
     */
    CLAIM_OPENED("ClaimOpened"),
  

    /**
     * 
   * The buyer was contacted by eBay and asked to submit paperwork to
   * support the claim.
   * 
     */
    NO_DOCUMENTATION("NoDocumentation"),
  

    /**
     * 
   * The buyer did not respond to verification or was missing paperwork.
   * 
     */
    CLAIM_CLOSED("ClaimClosed"),
  

    /**
     * 
   * The buyer is not eligible for reimbursement.
   * 
     */
    CLAIM_DENIED("ClaimDenied"),
  

    /**
     * 
   * Paperwork was received from the buyer and the claim is being investigated.
   * 
     */
    CLAIM_PENDING("ClaimPending"),
  

    /**
     * 
   * The buyer's claim was approved for reimbursement and was
   * sent to accounts payable for payment.
   * 
     */
    CLAIM_PAYMENT_PENDING("ClaimPaymentPending"),
  

    /**
     * 
   * The buyer was reimbursed.
   * 
     */
    CLAIM_PAID("ClaimPaid"),
  

    /**
     * 
   * The issue has been resolved: the seller sent the item or a refund.
   * 
     */
    CLAIM_RESOLVED("ClaimResolved"),
  

    /**
     * 
   * A claim was submitted (via Web).
   * 
     */
    CLAIM_SUBMITTED("ClaimSubmitted"),
  

    /**
     * 
   * The unpaid item dispute is open.
   * 
     */
    UNPAID_ITEM_OPEN("UnpaidItemOpen"),
  

    /**
     * 
   * An unpaid item dispute filed by the Unpaid Item Assistance mechanism was
   * disabled by eBay (for example, eBay detected that payment was initiated
   * and the seller needs to manually handle this dispute).
   * 
     */
    UPI_ASSISTANCE_DISABLED_BYE_BAY("UPIAssistanceDisabledByeBay"),
  

    /**
     * 
   * An unpaid item dispute filed by the Unpaid Item Assistance mechanism was
   * disabled by the seller (e.g. the buyer and seller have communicated
   * about payment and the seller wishes to extend the time for payment
   * and not let the automatic process close the dispute 4 days after the
   * dispute was automatically opened).
   * 
     */
    UPI_ASSISTANCE_DISABLED_BY_SELLER("UPIAssistanceDisabledBySeller"),
  

    /**
     * 
   * Reserved for internal or future use.
   * 
     */
    CUSTOM_CODE("CustomCode");
  
  
    private final String value;
  
    DisputeStateCodeType(String v) {
        value = v;
    }
    
    public String value() {
        return value;
    }
    
    public static DisputeStateCodeType fromValue(String v) {
        if (v != null) {
            for (DisputeStateCodeType c: DisputeStateCodeType.values()) {
                if (c.value.equals(v)) {
                    return c;
                }
            }
        }
        throw new IllegalArgumentException(v);
    }
}