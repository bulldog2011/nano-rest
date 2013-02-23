// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package ebay.apis.eblbasecomponents;

/**
 * 
 * The status of a particular entry.
 * 
 */
public enum EnableCodeType {

    /**
     * 
   * The entry is enabled.
   * 
     */
    ENABLE("Enable"),
  

    /**
     * 
   * The entry is disabled.
   * 
     */
    DISABLE("Disable"),
  

    /**
     * 
   * Reserved for future use.
   * 
     */
    CUSTOM_CODE("CustomCode");
  
  
    private final String value;
  
    EnableCodeType(String v) {
        value = v;
    }
    
    public String value() {
        return value;
    }
    
    public static EnableCodeType fromValue(String v) {
        if (v != null) {
            for (EnableCodeType c: EnableCodeType.values()) {
                if (c.value.equals(v)) {
                    return c;
                }
            }
        }
        throw new IllegalArgumentException(v);
    }
}