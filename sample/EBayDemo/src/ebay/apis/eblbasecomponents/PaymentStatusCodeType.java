// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package ebay.apis.eblbasecomponents;

/**
 * 
 * Type defining the values that can be returned in the <b>eBayPaymentStatus</b> 
 * field of order management calls. These values indicate the current status of the buyer's 
 * payment for an order.
 * 
 */
public enum PaymentStatusCodeType {

    /**
     * 
   * This value indicates that the buyer's payment for the order has cleared. A 
   * <b>CheckoutStatus.eBayPaymentStatus</b> value of 'NoPaymentFailure' 
   * and a <b>CheckoutStatus.Status</b> value of 'Complete' indicates that 
   * checkout is complete.
   * 
     */
    NO_PAYMENT_FAILURE("NoPaymentFailure"),
  

    /**
     * 
   * This value indicates that the buyer's eCheck bounced. This value is only applicable 
   * if the seller accepts eChecks as a form of payment.
   * 
     */
    BUYER_E_CHECK_BOUNCED("BuyerECheckBounced"),
  

    /**
     * 
   * This value indicates that the buyer's payment via a credit card failed. This value
   * is only applicable if the seller accepts credit cards as a form of payment.
   * 
     */
    BUYER_CREDIT_CARD_FAILED("BuyerCreditCardFailed"),
  

    /**
     * 
   * This value indicates that the seller reported the buyer's payment as failed.
   * 
     */
    BUYER_FAILED_PAYMENT_REPORTED_BY_SELLER("BuyerFailedPaymentReportedBySeller"),
  

    /**
     * 
   * This value indicates that the buyer's PayPal payment is in process. This value
   * is only applicable if the buyer has selected PayPal as the payment method.
   * 
     */
    PAY_PAL_PAYMENT_IN_PROCESS("PayPalPaymentInProcess"),
  

    /**
     * 
   * This value indicates that the buyer's non-PayPal payment is in process. This value
   * is only applicable if the buyer has selected a payment method other than PayPal.
   * 
     */
    PAYMENT_IN_PROCESS("PaymentInProcess"),
  

    /**
     * 
   * Reserved for internal or future use.
   * 
     */
    CUSTOM_CODE("CustomCode");
  
  
    private final String value;
  
    PaymentStatusCodeType(String v) {
        value = v;
    }
    
    public String value() {
        return value;
    }
    
    public static PaymentStatusCodeType fromValue(String v) {
        if (v != null) {
            for (PaymentStatusCodeType c: PaymentStatusCodeType.values()) {
                if (c.value.equals(v)) {
                    return c;
                }
            }
        }
        throw new IllegalArgumentException(v);
    }
}