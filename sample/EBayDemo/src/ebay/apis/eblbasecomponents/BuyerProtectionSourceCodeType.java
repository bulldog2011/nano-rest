// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package ebay.apis.eblbasecomponents;

/**
 * 
 * This enumeration type indicates the applicable buyer protection program that the item is
 * eligible to be covered under.
 * 
 */
public enum BuyerProtectionSourceCodeType {

    /**
     * 
   * This value indicates that the item is possibly eligible for buyer protection under 
   * the eBay Buyer Protection Program.
   * 
     */
    E_BAY("eBay"),
  

    /**
     * 
   * This value indicates that the item is possibly eligible for buyer protection under 
   * the PayPal Purchase Protection Program.
   * 
     */
    PAY_PAL("PayPal"),
  

    /**
     * 
   *  Reserved for internal or future use.
   * 
     */
    CUSTOM_CODE("CustomCode");
  
  
    private final String value;
  
    BuyerProtectionSourceCodeType(String v) {
        value = v;
    }
    
    public String value() {
        return value;
    }
    
    public static BuyerProtectionSourceCodeType fromValue(String v) {
        if (v != null) {
            for (BuyerProtectionSourceCodeType c: BuyerProtectionSourceCodeType.values()) {
                if (c.value.equals(v)) {
                    return c;
                }
            }
        }
        throw new IllegalArgumentException(v);
    }
}