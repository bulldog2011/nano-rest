// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package ebay.apis.eblbasecomponents;

/**
 * 
 * USPS Rate Options
 * 
 */
public enum USPSRateOptionCodeType {

    /**
     * 
   * USPS Discounted
   * 
     */
    USPS_DISCOUNTED("USPSDiscounted"),
  

    /**
     * 
   * USPS Retail
   * 
     */
    USPS_RETAIL("USPSRetail"),
  

    /**
     * 
   *  Reserved for internal or future use
   * 
     */
    CUSTOM_CODE("CustomCode");
  
  
    private final String value;
  
    USPSRateOptionCodeType(String v) {
        value = v;
    }
    
    public String value() {
        return value;
    }
    
    public static USPSRateOptionCodeType fromValue(String v) {
        if (v != null) {
            for (USPSRateOptionCodeType c: USPSRateOptionCodeType.values()) {
                if (c.value.equals(v)) {
                    return c;
                }
            }
        }
        throw new IllegalArgumentException(v);
    }
}