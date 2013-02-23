// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package ebay.apis.eblbasecomponents;

/**
 * 
 * Specifies whether a listing feature is available for the site specified in the request.
 * 
 */
public enum BoldTitleCodeType {

    /**
     * 
   * The listing feature is enabled for the site.
   * 
     */
    ENABLED("Enabled"),
  

    /**
     * 
   * The listing feature is disabled for the site.
   * 
     */
    DISABLED("Disabled"),
  

    /**
     * 
   * Reserved for future use.
   * 
     */
    CUSTOM_CODE("CustomCode");
  
  
    private final String value;
  
    BoldTitleCodeType(String v) {
        value = v;
    }
    
    public String value() {
        return value;
    }
    
    public static BoldTitleCodeType fromValue(String v) {
        if (v != null) {
            for (BoldTitleCodeType c: BoldTitleCodeType.values()) {
                if (c.value.equals(v)) {
                    return c;
                }
            }
        }
        throw new IllegalArgumentException(v);
    }
}