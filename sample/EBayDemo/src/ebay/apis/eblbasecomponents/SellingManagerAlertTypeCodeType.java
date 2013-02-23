// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package ebay.apis.eblbasecomponents;

/**
 * 
 * Container for various alert types.
 * 
 */
public enum SellingManagerAlertTypeCodeType {

    /**
     * 
   * Indicates that an alert related to a sold listing has been issued.
   * 
     */
    SOLD("Sold"),
  

    /**
     * 
   * Indicates that an alert related to inventory has been issued.
   * 
     */
    INVENTORY("Inventory"),
  

    /**
     * 
   * Indicates that an automation alert has been sent because a listing did
   * not conform to listing automation rules.
   * 
     */
    AUTOMATION("Automation"),
  

    /**
     * 
   * Indicates that an alert related to PaisaPay, a payment method used for eBay
   * India, has been issued.
   * 
     */
    PAISA_PAY("PaisaPay"),
  

    /**
     * 
   * Indicates that an alert has been issued for negative feedback received, bad
   * email, or an unpaid item dispute.
   * 
     */
    GENERAL("General"),
  

    /**
     * 
   * (out) Reserved for internal or future use.
   * 
     */
    CUSTOM_CODE("CustomCode");
  
  
    private final String value;
  
    SellingManagerAlertTypeCodeType(String v) {
        value = v;
    }
    
    public String value() {
        return value;
    }
    
    public static SellingManagerAlertTypeCodeType fromValue(String v) {
        if (v != null) {
            for (SellingManagerAlertTypeCodeType c: SellingManagerAlertTypeCodeType.values()) {
                if (c.value.equals(v)) {
                    return c;
                }
            }
        }
        throw new IllegalArgumentException(v);
    }
}