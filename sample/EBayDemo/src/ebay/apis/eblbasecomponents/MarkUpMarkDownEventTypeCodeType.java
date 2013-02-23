// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package ebay.apis.eblbasecomponents;

/**
 * 
 * Valid application status codes, either MarkUp (application was marked up,
 * communication is restored) or MarkDown (application was marked down, no
 * communication).
 * 
 */
public enum MarkUpMarkDownEventTypeCodeType {

    /**
     * 
   * (out) Status indicating the application was or is marked up.
   * 
     */
    MARK_UP("MarkUp"),
  

    /**
     * 
   * (out) Status indicating the application was marked down.
   * 
     */
    MARK_DOWN("MarkDown"),
  

    /**
     * 
   * (out) Reserved for future internal or external use.
   * 
     */
    CUSTOM_CODE("CustomCode");
  
  
    private final String value;
  
    MarkUpMarkDownEventTypeCodeType(String v) {
        value = v;
    }
    
    public String value() {
        return value;
    }
    
    public static MarkUpMarkDownEventTypeCodeType fromValue(String v) {
        if (v != null) {
            for (MarkUpMarkDownEventTypeCodeType c: MarkUpMarkDownEventTypeCodeType.values()) {
                if (c.value.equals(v)) {
                    return c;
                }
            }
        }
        throw new IllegalArgumentException(v);
    }
}