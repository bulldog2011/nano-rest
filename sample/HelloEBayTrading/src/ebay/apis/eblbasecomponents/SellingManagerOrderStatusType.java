// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package ebay.apis.eblbasecomponents;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;
import java.util.Date;

/**
 * 
 * Status of a Selling manager order.
 * 
 */
public class SellingManagerOrderStatusType implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element(name = "CheckoutStatus")
	private CheckoutStatusCodeType checkoutStatus;
	
	@Element(name = "PaidStatus")
	private SellingManagerPaidStatusCodeType paidStatus;
	
	@Element(name = "ShippedStatus")
	private SellingManagerShippedStatusCodeType shippedStatus;
	
	@Element
	private PaymentStatusCodeType eBayPaymentStatus;
	
	@Element(name = "PayPalTransactionID")
	private String payPalTransactionID;
	
	@Element(name = "PaymentMethodUsed")
	private BuyerPaymentMethodCodeType paymentMethodUsed;
	
	@Element(name = "FeedbackReceived")
	private CommentTypeCodeType feedbackReceived;
	
	@Element(name = "FeedbackSent")
	private Boolean feedbackSent;
	
	@Element(name = "TotalEmailsSent")
	private Integer totalEmailsSent;
	
	@Element(name = "PaymentHoldStatus")
	private PaymentHoldStatusCodeType paymentHoldStatus;
	
	@Element(name = "SellerInvoiceNumber")
	private String sellerInvoiceNumber;
	
	@Element(name = "ShippedTime")
	private Date shippedTime;
	
	@Element(name = "PaidTime")
	private Date paidTime;
	
	@Element(name = "LastEmailSentTime")
	private Date lastEmailSentTime;
	
	@Element(name = "SellerInvoiceTime")
	private Date sellerInvoiceTime;
	
	@Element(name = "IntegratedMerchantCreditCardEnabled")
	private Boolean integratedMerchantCreditCardEnabled;
	
    
	/**
     * public getter
     *
     * 
     * Indicates the current status of the checkout flow for the order. 
     * 
     *
     * @returns ebay.apis.eblbasecomponents.CheckoutStatusCodeType
	 */
	public CheckoutStatusCodeType getCheckoutStatus() {
	    return this.checkoutStatus;
	}
	
	/**
	 * public setter
	 *
     * 
     * Indicates the current status of the checkout flow for the order. 
     * 
     *
     * @param ebay.apis.eblbasecomponents.CheckoutStatusCodeType
	 */
	public void setCheckoutStatus(CheckoutStatusCodeType checkoutStatus) {
	    this.checkoutStatus = checkoutStatus;
	}
	/**
     * public getter
     *
     * 
     * The paid status of the order.
     * 
     *
     * @returns ebay.apis.eblbasecomponents.SellingManagerPaidStatusCodeType
	 */
	public SellingManagerPaidStatusCodeType getPaidStatus() {
	    return this.paidStatus;
	}
	
	/**
	 * public setter
	 *
     * 
     * The paid status of the order.
     * 
     *
     * @param ebay.apis.eblbasecomponents.SellingManagerPaidStatusCodeType
	 */
	public void setPaidStatus(SellingManagerPaidStatusCodeType paidStatus) {
	    this.paidStatus = paidStatus;
	}
	/**
     * public getter
     *
     * 
     * The shipped status of the order.
     * 
     *
     * @returns ebay.apis.eblbasecomponents.SellingManagerShippedStatusCodeType
	 */
	public SellingManagerShippedStatusCodeType getShippedStatus() {
	    return this.shippedStatus;
	}
	
	/**
	 * public setter
	 *
     * 
     * The shipped status of the order.
     * 
     *
     * @param ebay.apis.eblbasecomponents.SellingManagerShippedStatusCodeType
	 */
	public void setShippedStatus(SellingManagerShippedStatusCodeType shippedStatus) {
	    this.shippedStatus = shippedStatus;
	}
	/**
     * public getter
     *
     * 
     * The success or failure of a buyer's online payment.
     * 
     *
     * @returns ebay.apis.eblbasecomponents.PaymentStatusCodeType
	 */
	public PaymentStatusCodeType getEBayPaymentStatus() {
	    return this.eBayPaymentStatus;
	}
	
	/**
	 * public setter
	 *
     * 
     * The success or failure of a buyer's online payment.
     * 
     *
     * @param ebay.apis.eblbasecomponents.PaymentStatusCodeType
	 */
	public void setEBayPaymentStatus(PaymentStatusCodeType eBayPaymentStatus) {
	    this.eBayPaymentStatus = eBayPaymentStatus;
	}
	/**
     * public getter
     *
     * 
     * The PayPal transaction ID. This value is not returned to new DE and AT sellers
     * who are subject to the new payment process.
     * <br>
     * <br>
     * <span class="tablenote"><b>Note:</b>
     * The introduction of the new eBay payment process for the entire German and
     * Austrian eBay marketplace has been delayed until further notice.<br>
     * 
     *
     * @returns java.lang.String
	 */
	public String getPayPalTransactionID() {
	    return this.payPalTransactionID;
	}
	
	/**
	 * public setter
	 *
     * 
     * The PayPal transaction ID. This value is not returned to new DE and AT sellers
     * who are subject to the new payment process.
     * <br>
     * <br>
     * <span class="tablenote"><b>Note:</b>
     * The introduction of the new eBay payment process for the entire German and
     * Austrian eBay marketplace has been delayed until further notice.<br>
     * 
     *
     * @param java.lang.String
	 */
	public void setPayPalTransactionID(String payPalTransactionID) {
	    this.payPalTransactionID = payPalTransactionID;
	}
	/**
     * public getter
     *
     * 
     * The payment method the buyer selected for paying the seller
     * for the order. If checkout is incomplete,
     * PaymentMethodUsed is set to whatever the buyer selected as his
     * or her preference on the Review Your Purchase page.
     * 
     *
     * @returns ebay.apis.eblbasecomponents.BuyerPaymentMethodCodeType
	 */
	public BuyerPaymentMethodCodeType getPaymentMethodUsed() {
	    return this.paymentMethodUsed;
	}
	
	/**
	 * public setter
	 *
     * 
     * The payment method the buyer selected for paying the seller
     * for the order. If checkout is incomplete,
     * PaymentMethodUsed is set to whatever the buyer selected as his
     * or her preference on the Review Your Purchase page.
     * 
     *
     * @param ebay.apis.eblbasecomponents.BuyerPaymentMethodCodeType
	 */
	public void setPaymentMethodUsed(BuyerPaymentMethodCodeType paymentMethodUsed) {
	    this.paymentMethodUsed = paymentMethodUsed;
	}
	/**
     * public getter
     *
     * 
     * The type of feedback received (if feedback was received).
     * 
     *
     * @returns ebay.apis.eblbasecomponents.CommentTypeCodeType
	 */
	public CommentTypeCodeType getFeedbackReceived() {
	    return this.feedbackReceived;
	}
	
	/**
	 * public setter
	 *
     * 
     * The type of feedback received (if feedback was received).
     * 
     *
     * @param ebay.apis.eblbasecomponents.CommentTypeCodeType
	 */
	public void setFeedbackReceived(CommentTypeCodeType feedbackReceived) {
	    this.feedbackReceived = feedbackReceived;
	}
	/**
     * public getter
     *
     * 
     * Whether the seller has left feedback.
     * 
     *
     * @returns java.lang.Boolean
	 */
	public Boolean getFeedbackSent() {
	    return this.feedbackSent;
	}
	
	/**
	 * public setter
	 *
     * 
     * Whether the seller has left feedback.
     * 
     *
     * @param java.lang.Boolean
	 */
	public void setFeedbackSent(Boolean feedbackSent) {
	    this.feedbackSent = feedbackSent;
	}
	/**
     * public getter
     *
     * 
     * The total emails sent.
     * 
     *
     * @returns java.lang.Integer
	 */
	public Integer getTotalEmailsSent() {
	    return this.totalEmailsSent;
	}
	
	/**
	 * public setter
	 *
     * 
     * The total emails sent.
     * 
     *
     * @param java.lang.Integer
	 */
	public void setTotalEmailsSent(Integer totalEmailsSent) {
	    this.totalEmailsSent = totalEmailsSent;
	}
	/**
     * public getter
     *
     * 
     * Contains the current status of a hold on a PayPal payment.
     * The payment hold that is referred to as a "payment review" hold
     * results from a possible issue with a buyer.
     * The payment hold referred to as
     * a "merchant hold" results from a possible issue with a seller.
     * For more information, please see the link below.
     * 
     *
     * @returns ebay.apis.eblbasecomponents.PaymentHoldStatusCodeType
	 */
	public PaymentHoldStatusCodeType getPaymentHoldStatus() {
	    return this.paymentHoldStatus;
	}
	
	/**
	 * public setter
	 *
     * 
     * Contains the current status of a hold on a PayPal payment.
     * The payment hold that is referred to as a "payment review" hold
     * results from a possible issue with a buyer.
     * The payment hold referred to as
     * a "merchant hold" results from a possible issue with a seller.
     * For more information, please see the link below.
     * 
     *
     * @param ebay.apis.eblbasecomponents.PaymentHoldStatusCodeType
	 */
	public void setPaymentHoldStatus(PaymentHoldStatusCodeType paymentHoldStatus) {
	    this.paymentHoldStatus = paymentHoldStatus;
	}
	/**
     * public getter
     *
     * 
     * The custom invoice number.
     * 
     *
     * @returns java.lang.String
	 */
	public String getSellerInvoiceNumber() {
	    return this.sellerInvoiceNumber;
	}
	
	/**
	 * public setter
	 *
     * 
     * The custom invoice number.
     * 
     *
     * @param java.lang.String
	 */
	public void setSellerInvoiceNumber(String sellerInvoiceNumber) {
	    this.sellerInvoiceNumber = sellerInvoiceNumber;
	}
	/**
     * public getter
     *
     * 
     * The date on which the seller marks the item as shipped, either set by default as
     * the date date the item was marked shipped or set explicitly by the seller using
     * the Edit Sales Record page. Note that sellers have the ability to set this value
     * up to 3 calendar days in the future.
     * 
     *
     * @returns java.util.Date
	 */
	public Date getShippedTime() {
	    return this.shippedTime;
	}
	
	/**
	 * public setter
	 *
     * 
     * The date on which the seller marks the item as shipped, either set by default as
     * the date date the item was marked shipped or set explicitly by the seller using
     * the Edit Sales Record page. Note that sellers have the ability to set this value
     * up to 3 calendar days in the future.
     * 
     *
     * @param java.util.Date
	 */
	public void setShippedTime(Date shippedTime) {
	    this.shippedTime = shippedTime;
	}
	/**
     * public getter
     *
     * 
     * Date on which the order was paid.
     * 
     *
     * @returns java.util.Date
	 */
	public Date getPaidTime() {
	    return this.paidTime;
	}
	
	/**
	 * public setter
	 *
     * 
     * Date on which the order was paid.
     * 
     *
     * @param java.util.Date
	 */
	public void setPaidTime(Date paidTime) {
	    this.paidTime = paidTime;
	}
	/**
     * public getter
     *
     * 
     * The time that the last email was sent.
     * 
     *
     * @returns java.util.Date
	 */
	public Date getLastEmailSentTime() {
	    return this.lastEmailSentTime;
	}
	
	/**
	 * public setter
	 *
     * 
     * The time that the last email was sent.
     * 
     *
     * @param java.util.Date
	 */
	public void setLastEmailSentTime(Date lastEmailSentTime) {
	    this.lastEmailSentTime = lastEmailSentTime;
	}
	/**
     * public getter
     *
     * 
     * The time the invoice was sent. This is a seller-entered value for VAT-enabled
     * sites. It is returned only for business sellers in VAT-enabled sites.
     * 
     *
     * @returns java.util.Date
	 */
	public Date getSellerInvoiceTime() {
	    return this.sellerInvoiceTime;
	}
	
	/**
	 * public setter
	 *
     * 
     * The time the invoice was sent. This is a seller-entered value for VAT-enabled
     * sites. It is returned only for business sellers in VAT-enabled sites.
     * 
     *
     * @param java.util.Date
	 */
	public void setSellerInvoiceTime(Date sellerInvoiceTime) {
	    this.sellerInvoiceTime = sellerInvoiceTime;
	}
	/**
     * public getter
     *
     * 
     * Indicates whether the item can be paid for through a payment gateway (Payflow) account.
     * If IntegratedMerchantCreditCardEnabled is true, then integrated merchant credit card (IMCC) is
     * enabled for credit cards because the seller has a payment gateway account.
     * Therefore, if IntegratedMerchantCreditCardEnabled is true, and AmEx, Discover, or
     * VisaMC is returned for an item, then on checkout, an online credit-card payment
     * is processed through a payment gateway account.
     * A payment gateway account is used by sellers to accept online
     * credit cards (Visa, MasterCard, American Express, and Discover).
     * 
     *
     * @returns java.lang.Boolean
	 */
	public Boolean getIntegratedMerchantCreditCardEnabled() {
	    return this.integratedMerchantCreditCardEnabled;
	}
	
	/**
	 * public setter
	 *
     * 
     * Indicates whether the item can be paid for through a payment gateway (Payflow) account.
     * If IntegratedMerchantCreditCardEnabled is true, then integrated merchant credit card (IMCC) is
     * enabled for credit cards because the seller has a payment gateway account.
     * Therefore, if IntegratedMerchantCreditCardEnabled is true, and AmEx, Discover, or
     * VisaMC is returned for an item, then on checkout, an online credit-card payment
     * is processed through a payment gateway account.
     * A payment gateway account is used by sellers to accept online
     * credit cards (Visa, MasterCard, American Express, and Discover).
     * 
     *
     * @param java.lang.Boolean
	 */
	public void setIntegratedMerchantCreditCardEnabled(Boolean integratedMerchantCreditCardEnabled) {
	    this.integratedMerchantCreditCardEnabled = integratedMerchantCreditCardEnabled;
	}

}