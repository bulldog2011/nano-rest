// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package ebay.apis.eblbasecomponents;

/**
 * 
 * This type is deprecated because Coss Promotions are no longer supported in the APIs.
 * 
 * 
 */
public enum MerchandizingPrefCodeType {

    /**
     * 
   * 
   * Seller allows item cross-promotion.
   * 
     */
    OPT_IN("OptIn"),
  

    /**
     * 
   * 
   * Seller does not allow item cross-promotion.
   * 
     */
    OPT_OUT("OptOut"),
  

    /**
     * 
   * 
   * Reserved for internal or future use.
   * 
     */
    CUSTOM_CODE("CustomCode");
  
  
    private final String value;
  
    MerchandizingPrefCodeType(String v) {
        value = v;
    }
    
    public String value() {
        return value;
    }
    
    public static MerchandizingPrefCodeType fromValue(String v) {
        if (v != null) {
            for (MerchandizingPrefCodeType c: MerchandizingPrefCodeType.values()) {
                if (c.value.equals(v)) {
                    return c;
                }
            }
        }
        throw new IllegalArgumentException(v);
    }
}