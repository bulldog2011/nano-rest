// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package ebay.apis.eblbasecomponents;

/**
 * 
 * Unpaid item status.
 * 
 */
public enum UnpaidItemStatusTypeCodeType {

    /**
     * 
   * Final value fee denied.
   * 
     */
    FINAL_VALUE_FEE_DENIED("FinalValueFeeDenied"),
  

    /**
     * 
   * Final value fee credited.
   * 
     */
    FINAL_VALUE_FEE_CREDITED("FinalValueFeeCredited"),
  

    /**
     * 
   *  Eligible for final value fee.
   * 
     */
    FINAL_VALUE_FEE_ELIGIBLE("FinalValueFeeEligible"),
  

    /**
     * 
   *  Awaiting seller response.
   * 
     */
    AWAITING_SELLER_RESPONSE("AwaitingSellerResponse"),
  

    /**
     * 
   * Awaiting buyer response.
   * 
     */
    AWAITING_BUYER_RESPONSE("AwaitingBuyerResponse"),
  

    /**
     * 
   *  Unpaid item filed.
   * 
     */
    UNPAID_ITEM_FILED("UnpaidItemFiled"),
  

    /**
     * 
   * Eligible for unpaid item.
   * 
     */
    UNPAID_ITEM_ELIGIBLE("UnpaidItemEligible"),
  

    /**
     * 
   * (out) Reserved for internal or future use.
   * 
     */
    CUSTOM_CODE("CustomCode");
  
  
    private final String value;
  
    UnpaidItemStatusTypeCodeType(String v) {
        value = v;
    }
    
    public String value() {
        return value;
    }
    
    public static UnpaidItemStatusTypeCodeType fromValue(String v) {
        if (v != null) {
            for (UnpaidItemStatusTypeCodeType c: UnpaidItemStatusTypeCodeType.values()) {
                if (c.value.equals(v)) {
                    return c;
                }
            }
        }
        throw new IllegalArgumentException(v);
    }
}