// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package ebay.apis.eblbasecomponents;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;

/**
 * 
 * A seller can use this call to update the payment details, the shipping details,
 * and the status of an order.
 * 
 */
@RootElement(name = "ReviseCheckoutStatusRequest", namespace = "urn:ebay:apis:eBLBaseComponents")
public class ReviseCheckoutStatusRequestType extends AbstractRequestType implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element(name = "ItemID")
	private String itemID;
	
	@Element(name = "TransactionID")
	private String transactionID;
	
	@Element(name = "OrderID")
	private String orderID;
	
	@Element(name = "AmountPaid")
	private AmountType amountPaid;
	
	@Element(name = "PaymentMethodUsed")
	private BuyerPaymentMethodCodeType paymentMethodUsed;
	
	@Element(name = "CheckoutStatus")
	private CompleteStatusCodeType checkoutStatus;
	
	@Element(name = "ShippingService")
	private String shippingService;
	
	@Element(name = "ShippingIncludedInTax")
	private Boolean shippingIncludedInTax;
	
	@Element(name = "CheckoutMethod")
	private CheckoutMethodCodeType checkoutMethod;
	
	@Element(name = "InsuranceType")
	private InsuranceSelectedCodeType insuranceType;
	
	@Element(name = "PaymentStatus")
	private RCSPaymentStatusCodeType paymentStatus;
	
	@Element(name = "AdjustmentAmount")
	private AmountType adjustmentAmount;
	
	@Element(name = "ShippingAddress")
	private AddressType shippingAddress;
	
	@Element(name = "BuyerID")
	private String buyerID;
	
	@Element(name = "ShippingInsuranceCost")
	private AmountType shippingInsuranceCost;
	
	@Element(name = "SalesTax")
	private AmountType salesTax;
	
	@Element(name = "ShippingCost")
	private AmountType shippingCost;
	
	@Element(name = "EncryptedID")
	private String encryptedID;
	
	@Element(name = "ExternalTransaction")
	private ExternalTransactionType externalTransaction;
	
	@Element(name = "MultipleSellerPaymentID")
	private String multipleSellerPaymentID;
	
	@Element(name = "CODCost")
	private AmountType codCost;
	
	@Element(name = "OrderLineItemID")
	private String orderLineItemID;
	
    
	/**
     * public getter
     *
     * 
     * Unique identifier for an eBay item listing. A listing can have multiple
     * order line items (transactions), but only one <b>ItemID</b>. An <b>ItemID</b> can be
     * paired up with a corresponding <b>TransactionID</b> and used as an input filter
     * for <b>ReviseCheckoutStatus</b>.
     * <br><br>
     * Unless an <b>OrderLineItemID</b> is used to identify a single line item order,
     * or the <b>OrderID</b> is used to identify a single or multiple line item
     * (Combined Payment) order, the <b>ItemID</b>/<b>TransactionID</b> pair must be
     * specified. For a multiple line item (Combined Payment) order, <b>OrderID</b>
     * should be used. If <b>OrderID</b> or <b>OrderLineItemID</b> are specified, the
     * <b>ItemID</b>/<b>TransactionID</b> pair is ignored if present in the same request.
     * <br />
     * <br />
     * It is also possible to identify a single line item order with a
     * <b>ItemID</b>/<b>BuyerID</b> combination, but this is not the most ideal
     * approach since an error is returned if there are multiple
     * order line items for that combination.
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
     * for <b>ReviseCheckoutStatus</b>.
     * <br><br>
     * Unless an <b>OrderLineItemID</b> is used to identify a single line item order,
     * or the <b>OrderID</b> is used to identify a single or multiple line item
     * (Combined Payment) order, the <b>ItemID</b>/<b>TransactionID</b> pair must be
     * specified. For a multiple line item (Combined Payment) order, <b>OrderID</b>
     * should be used. If <b>OrderID</b> or <b>OrderLineItemID</b> are specified, the
     * <b>ItemID</b>/<b>TransactionID</b> pair is ignored if present in the same request.
     * <br />
     * <br />
     * It is also possible to identify a single line item order with a
     * <b>ItemID</b>/<b>BuyerID</b> combination, but this is not the most ideal
     * approach since an error is returned if there are multiple
     * order line items for that combination.
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
     * used as an input filter for <b>ReviseCheckoutStatus</b>.
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
     * used as an input filter for <b>ReviseCheckoutStatus</b>.
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
     * filter for <b>ReviseCheckoutStatus</b>.
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
     * filter for <b>ReviseCheckoutStatus</b>.
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
     * The total amount paid by the buyer. For a motor vehicle purchased on eBay Motors,
     * <b>AmountPaid</b> is the total amount paid by the buyer for the deposit.
     * <b>AmountPaid</b> is optional if <b>CheckoutStatus</b> is Incomplete and required if it
     * is Complete.
     * 
     *
     * @returns ebay.apis.eblbasecomponents.AmountType
	 */
	public AmountType getAmountPaid() {
	    return this.amountPaid;
	}
	
	/**
	 * public setter
	 *
     * 
     * The total amount paid by the buyer. For a motor vehicle purchased on eBay Motors,
     * <b>AmountPaid</b> is the total amount paid by the buyer for the deposit.
     * <b>AmountPaid</b> is optional if <b>CheckoutStatus</b> is Incomplete and required if it
     * is Complete.
     * 
     *
     * @param ebay.apis.eblbasecomponents.AmountType
	 */
	public void setAmountPaid(AmountType amountPaid) {
	    this.amountPaid = amountPaid;
	}
	/**
     * public getter
     *
     * 
     * Payment method used by the buyer. This field is required if <b>
     * CheckoutStatus</b> is Complete and the payment method is a trusted
     * payment method other than PayPal. See eBay's
     * <a href="http://pages.ebay.com/help/policies/accepted-payments-policy.html">Accepted Payments Policy</a>.
     * If the payment method is PayPal, this field should not be used since only PayPal can set this field's
     * value to "PayPal". ReviseCheckoutStatus cannot be used for a non-trusted
     * payment method.
     * <br>
     * <br>
     * <span class="tablenote"><b>Note:</b>
     * Required or allowed payment methods vary by site and category. Refer to
     * <a href="http://developer.ebay.com/DevZone/XML/docs/WebHelp/wwhelp/wwhimpl/js/html/wwhelp.htm?context=eBay_XML_API&topic=PaymentMethodDifferences">
     * Payment Method Differences (PaymentMethod)</a> in the eBay
     * Trading API Guide for information to help you determine which payment
     * methods you are required or allowed to specify.
     * </span>
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
     * Payment method used by the buyer. This field is required if <b>
     * CheckoutStatus</b> is Complete and the payment method is a trusted
     * payment method other than PayPal. See eBay's
     * <a href="http://pages.ebay.com/help/policies/accepted-payments-policy.html">Accepted Payments Policy</a>.
     * If the payment method is PayPal, this field should not be used since only PayPal can set this field's
     * value to "PayPal". ReviseCheckoutStatus cannot be used for a non-trusted
     * payment method.
     * <br>
     * <br>
     * <span class="tablenote"><b>Note:</b>
     * Required or allowed payment methods vary by site and category. Refer to
     * <a href="http://developer.ebay.com/DevZone/XML/docs/WebHelp/wwhelp/wwhimpl/js/html/wwhelp.htm?context=eBay_XML_API&topic=PaymentMethodDifferences">
     * Payment Method Differences (PaymentMethod)</a> in the eBay
     * Trading API Guide for information to help you determine which payment
     * methods you are required or allowed to specify.
     * </span>
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
     * The current checkout status of the order. Often, the seller or
     * application will mark this value as Complete if payment has been made. The <b>CheckoutStatus</b>
     * value cannot be updated by DE and AT sellers who are subject to the new payment
     * process, and an attempt to do so in a <b>ReviseCheckoutStatus</b> call
     * will result in a call error.
     * 
     *
     * @returns ebay.apis.eblbasecomponents.CompleteStatusCodeType
	 */
	public CompleteStatusCodeType getCheckoutStatus() {
	    return this.checkoutStatus;
	}
	
	/**
	 * public setter
	 *
     * 
     * The current checkout status of the order. Often, the seller or
     * application will mark this value as Complete if payment has been made. The <b>CheckoutStatus</b>
     * value cannot be updated by DE and AT sellers who are subject to the new payment
     * process, and an attempt to do so in a <b>ReviseCheckoutStatus</b> call
     * will result in a call error.
     * 
     *
     * @param ebay.apis.eblbasecomponents.CompleteStatusCodeType
	 */
	public void setCheckoutStatus(CompleteStatusCodeType checkoutStatus) {
	    this.checkoutStatus = checkoutStatus;
	}
	/**
     * public getter
     *
     * 
     * The shipping service selected by the buyer from among the shipping services
     * offered by the seller (such as UPS Ground). For a list of valid values, call
     * GeteBayDetails with DetailName set to ShippingServiceDetails. The
     * ShippingServiceDetails.ValidForSellingFlow flag must also be present.
     * Otherwise, that particular shipping service option is no longer valid and
     * cannot be offered to buyers through a listing.
     * <br/><br/>
     * <span class="tablenote">
     * <strong>Note:</strong> <strong>ReviseCheckoutStatus</strong> is not available for the Global Shipping program; specifying InternationalPriorityShipping as a value for this field will produce an error.
     * </span>
     * 
     *
     * @returns java.lang.String
	 */
	public String getShippingService() {
	    return this.shippingService;
	}
	
	/**
	 * public setter
	 *
     * 
     * The shipping service selected by the buyer from among the shipping services
     * offered by the seller (such as UPS Ground). For a list of valid values, call
     * GeteBayDetails with DetailName set to ShippingServiceDetails. The
     * ShippingServiceDetails.ValidForSellingFlow flag must also be present.
     * Otherwise, that particular shipping service option is no longer valid and
     * cannot be offered to buyers through a listing.
     * <br/><br/>
     * <span class="tablenote">
     * <strong>Note:</strong> <strong>ReviseCheckoutStatus</strong> is not available for the Global Shipping program; specifying InternationalPriorityShipping as a value for this field will produce an error.
     * </span>
     * 
     *
     * @param java.lang.String
	 */
	public void setShippingService(String shippingService) {
	    this.shippingService = shippingService;
	}
	/**
     * public getter
     *
     * 
     * An indicator of whether shipping costs were included in the
     * taxable amount. .
     * 
     *
     * @returns java.lang.Boolean
	 */
	public Boolean getShippingIncludedInTax() {
	    return this.shippingIncludedInTax;
	}
	
	/**
	 * public setter
	 *
     * 
     * An indicator of whether shipping costs were included in the
     * taxable amount. .
     * 
     *
     * @param java.lang.Boolean
	 */
	public void setShippingIncludedInTax(Boolean shippingIncludedInTax) {
	    this.shippingIncludedInTax = shippingIncludedInTax;
	}
	/**
     * public getter
     *
     * 
     * This field is no longer supported and will be ignored if included in the 
     * request.
     * 
     *
     * @returns ebay.apis.eblbasecomponents.CheckoutMethodCodeType
	 */
	public CheckoutMethodCodeType getCheckoutMethod() {
	    return this.checkoutMethod;
	}
	
	/**
	 * public setter
	 *
     * 
     * This field is no longer supported and will be ignored if included in the 
     * request.
     * 
     *
     * @param ebay.apis.eblbasecomponents.CheckoutMethodCodeType
	 */
	public void setCheckoutMethod(CheckoutMethodCodeType checkoutMethod) {
	    this.checkoutMethod = checkoutMethod;
	}
	/**
     * public getter
     *
     * 
     * Enumeration value that indicates whether shipping insurance was offered to and
     * selected by the buyer.
     * 
     *
     * @returns ebay.apis.eblbasecomponents.InsuranceSelectedCodeType
	 */
	public InsuranceSelectedCodeType getInsuranceType() {
	    return this.insuranceType;
	}
	
	/**
	 * public setter
	 *
     * 
     * Enumeration value that indicates whether shipping insurance was offered to and
     * selected by the buyer.
     * 
     *
     * @param ebay.apis.eblbasecomponents.InsuranceSelectedCodeType
	 */
	public void setInsuranceType(InsuranceSelectedCodeType insuranceType) {
	    this.insuranceType = insuranceType;
	}
	/**
     * public getter
     *
     * 
     * Marks the order as paid or awaiting payment in My eBay. If you specify
     * Paid, My eBay displays an icon for each item in the order to indicate
     * that the order status is Paid. If you specify Pending, this indicates
     * that the order is awaiting payment. (Some applications may use Pending
     * when the buyer has paid but the funds have not yet been sent to the
     * seller's financial institution.)
     * <br>
     * <br>
     * <b>ReviseCheckoutStatus</b> cannot be used to update payment and checkout
     * status for a non-trusted payment method. See eBay's <a href="
     * http://pages.ebay.com/help/policies/accepted-payments-policy.html">
     * Accepted Payments Policy</a> for more information on trusted
     * payment methods. If the payment method is PayPal, this field should not
     * be used since PayPal automatically set this field's value to "Paid" upon
     * receiving the buyer's payment.
     * <br>
     * <br>
     * The <b>PaymentStatus</b> value cannot be updated by DE and AT sellers
     * who are subject to the new eBay payment process, and an attempt to do so in a
     * <b>ReviseCheckoutStatus</b> call will result in a call error.
     * <br>
     * <br>
     * <span class="tablenote"><b>Note:</b>
     * The introduction of the new eBay payment process for the entire German and
     * Austrian eBay marketplace has been delayed until further notice.<br>
     * 
     *
     * @returns ebay.apis.eblbasecomponents.RCSPaymentStatusCodeType
	 */
	public RCSPaymentStatusCodeType getPaymentStatus() {
	    return this.paymentStatus;
	}
	
	/**
	 * public setter
	 *
     * 
     * Marks the order as paid or awaiting payment in My eBay. If you specify
     * Paid, My eBay displays an icon for each item in the order to indicate
     * that the order status is Paid. If you specify Pending, this indicates
     * that the order is awaiting payment. (Some applications may use Pending
     * when the buyer has paid but the funds have not yet been sent to the
     * seller's financial institution.)
     * <br>
     * <br>
     * <b>ReviseCheckoutStatus</b> cannot be used to update payment and checkout
     * status for a non-trusted payment method. See eBay's <a href="
     * http://pages.ebay.com/help/policies/accepted-payments-policy.html">
     * Accepted Payments Policy</a> for more information on trusted
     * payment methods. If the payment method is PayPal, this field should not
     * be used since PayPal automatically set this field's value to "Paid" upon
     * receiving the buyer's payment.
     * <br>
     * <br>
     * The <b>PaymentStatus</b> value cannot be updated by DE and AT sellers
     * who are subject to the new eBay payment process, and an attempt to do so in a
     * <b>ReviseCheckoutStatus</b> call will result in a call error.
     * <br>
     * <br>
     * <span class="tablenote"><b>Note:</b>
     * The introduction of the new eBay payment process for the entire German and
     * Austrian eBay marketplace has been delayed until further notice.<br>
     * 
     *
     * @param ebay.apis.eblbasecomponents.RCSPaymentStatusCodeType
	 */
	public void setPaymentStatus(RCSPaymentStatusCodeType paymentStatus) {
	    this.paymentStatus = paymentStatus;
	}
	/**
     * public getter
     *
     * 
     * Discount or charge agreed to by the buyer and seller. A positive value
     * indicates that the amount is an extra charge being paid to the seller by
     * the buyer. A negative value indicates that the amount is a discount given
     * to the buyer by the seller.
     * 
     *
     * @returns ebay.apis.eblbasecomponents.AmountType
	 */
	public AmountType getAdjustmentAmount() {
	    return this.adjustmentAmount;
	}
	
	/**
	 * public setter
	 *
     * 
     * Discount or charge agreed to by the buyer and seller. A positive value
     * indicates that the amount is an extra charge being paid to the seller by
     * the buyer. A negative value indicates that the amount is a discount given
     * to the buyer by the seller.
     * 
     *
     * @param ebay.apis.eblbasecomponents.AmountType
	 */
	public void setAdjustmentAmount(AmountType adjustmentAmount) {
	    this.adjustmentAmount = adjustmentAmount;
	}
	/**
     * public getter
     *
     * 
     *   For internal use.
     * 
     *
     * @returns ebay.apis.eblbasecomponents.AddressType
	 */
	public AddressType getShippingAddress() {
	    return this.shippingAddress;
	}
	
	/**
	 * public setter
	 *
     * 
     *   For internal use.
     * 
     *
     * @param ebay.apis.eblbasecomponents.AddressType
	 */
	public void setShippingAddress(AddressType shippingAddress) {
	    this.shippingAddress = shippingAddress;
	}
	/**
     * public getter
     *
     * 
     * eBay user ID for the order's buyer. A single line item order can
     * actually be identified by a <b>BuyerID</b>/<b>ItemID</b> pair, but this approach is
     * not recommended since an error is returned if there are multiple
     * order line items for that combination. <b>BuyerID</b> is ignored if any other valid
     * filter or filter combination is used in the same request.
     * 
     *
     * @returns java.lang.String
	 */
	public String getBuyerID() {
	    return this.buyerID;
	}
	
	/**
	 * public setter
	 *
     * 
     * eBay user ID for the order's buyer. A single line item order can
     * actually be identified by a <b>BuyerID</b>/<b>ItemID</b> pair, but this approach is
     * not recommended since an error is returned if there are multiple
     * order line items for that combination. <b>BuyerID</b> is ignored if any other valid
     * filter or filter combination is used in the same request.
     * 
     *
     * @param java.lang.String
	 */
	public void setBuyerID(String buyerID) {
	    this.buyerID = buyerID;
	}
	/**
     * public getter
     *
     * 
     * The amount of money paid for shipping insurance.
     * 
     *
     * @returns ebay.apis.eblbasecomponents.AmountType
	 */
	public AmountType getShippingInsuranceCost() {
	    return this.shippingInsuranceCost;
	}
	
	/**
	 * public setter
	 *
     * 
     * The amount of money paid for shipping insurance.
     * 
     *
     * @param ebay.apis.eblbasecomponents.AmountType
	 */
	public void setShippingInsuranceCost(AmountType shippingInsuranceCost) {
	    this.shippingInsuranceCost = shippingInsuranceCost;
	}
	/**
     * public getter
     *
     * 
     * The sales tax amount for the order. This field should be used if sales tax
     * was applied to the order.
     * 
     *
     * @returns ebay.apis.eblbasecomponents.AmountType
	 */
	public AmountType getSalesTax() {
	    return this.salesTax;
	}
	
	/**
	 * public setter
	 *
     * 
     * The sales tax amount for the order. This field should be used if sales tax
     * was applied to the order.
     * 
     *
     * @param ebay.apis.eblbasecomponents.AmountType
	 */
	public void setSalesTax(AmountType salesTax) {
	    this.salesTax = salesTax;
	}
	/**
     * public getter
     *
     * 
     * The amount of money paid for shipping.
     * 
     *
     * @returns ebay.apis.eblbasecomponents.AmountType
	 */
	public AmountType getShippingCost() {
	    return this.shippingCost;
	}
	
	/**
	 * public setter
	 *
     * 
     * The amount of money paid for shipping.
     * 
     *
     * @param ebay.apis.eblbasecomponents.AmountType
	 */
	public void setShippingCost(AmountType shippingCost) {
	    this.shippingCost = shippingCost;
	}
	/**
     * public getter
     *
     * 
     * Not supported.
     * 
     *
     * @returns java.lang.String
	 */
	public String getEncryptedID() {
	    return this.encryptedID;
	}
	
	/**
	 * public setter
	 *
     * 
     * Not supported.
     * 
     *
     * @param java.lang.String
	 */
	public void setEncryptedID(String encryptedID) {
	    this.encryptedID = encryptedID;
	}
	/**
     * public getter
     *
     * 
     * Container consisting of a unique identifier and timestamp for the electronic
     * payment of an order. An <b>ExternalTransactionID</b> is not exposed
     * to a new DE or AT seller who is subject to the new eBay payment process.
     * <br>
     * <br>
     * <span class="tablenote"><b>Note:</b>
     * The introduction of the new eBay payment process for the entire German and
     * Austrian eBay marketplace has been delayed until further notice.<br>
     * 
     *
     * @returns ebay.apis.eblbasecomponents.ExternalTransactionType
	 */
	public ExternalTransactionType getExternalTransaction() {
	    return this.externalTransaction;
	}
	
	/**
	 * public setter
	 *
     * 
     * Container consisting of a unique identifier and timestamp for the electronic
     * payment of an order. An <b>ExternalTransactionID</b> is not exposed
     * to a new DE or AT seller who is subject to the new eBay payment process.
     * <br>
     * <br>
     * <span class="tablenote"><b>Note:</b>
     * The introduction of the new eBay payment process for the entire German and
     * Austrian eBay marketplace has been delayed until further notice.<br>
     * 
     *
     * @param ebay.apis.eblbasecomponents.ExternalTransactionType
	 */
	public void setExternalTransaction(ExternalTransactionType externalTransaction) {
	    this.externalTransaction = externalTransaction;
	}
	/**
     * public getter
     *
     * 
     * Not supported.
     * 
     *
     * @returns java.lang.String
	 */
	public String getMultipleSellerPaymentID() {
	    return this.multipleSellerPaymentID;
	}
	
	/**
	 * public setter
	 *
     * 
     * Not supported.
     * 
     *
     * @param java.lang.String
	 */
	public void setMultipleSellerPaymentID(String multipleSellerPaymentID) {
	    this.multipleSellerPaymentID = multipleSellerPaymentID;
	}
	/**
     * public getter
     *
     * 
     * Italy site (site ID 101) only.
     * Enables you to specify the cash-on-delivery (COD) cost, for COD shipping.
     * 
     *
     * @returns ebay.apis.eblbasecomponents.AmountType
	 */
	public AmountType getCodCost() {
	    return this.codCost;
	}
	
	/**
	 * public setter
	 *
     * 
     * Italy site (site ID 101) only.
     * Enables you to specify the cash-on-delivery (COD) cost, for COD shipping.
     * 
     *
     * @param ebay.apis.eblbasecomponents.AmountType
	 */
	public void setCodCost(AmountType codCost) {
	    this.codCost = codCost;
	}
	/**
     * public getter
     *
     * 
     * <b>OrderLineItemID</b> is a unique identifier for an eBay order line item and
     * is based upon the concatenation of <b>ItemID</b> and <b>TransactionID</b>, with a
     * hyphen in between these two IDs. For a single line item order, the
     * <b>OrderLineItemID</b> value can be passed into the <b>OrderID</b> field to revise the
     * checkout status of the order.
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
     * checkout status of the order.
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