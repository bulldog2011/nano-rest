// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package ebay.apis.eblbasecomponents;

/**
 * 
 * Used to indicate whether custom Item Specifics are enabled for a category.
 * 
 */
public enum ItemSpecificsEnabledCodeType {

    /**
     * 
   * The custom Item Specifics feature is disabled for the category.
   * 
     */
    DISABLED("Disabled"),
  

    /**
     * 
   * The custom Item Specifics feature is enabled for the category.
   * 
     */
    ENABLED("Enabled"),
  

    /**
     * 
   * (out) Reserved for internal or future use.
   * 
     */
    CUSTOM_CODE("CustomCode");
  
  
    private final String value;
  
    ItemSpecificsEnabledCodeType(String v) {
        value = v;
    }
    
    public String value() {
        return value;
    }
    
    public static ItemSpecificsEnabledCodeType fromValue(String v) {
        if (v != null) {
            for (ItemSpecificsEnabledCodeType c: ItemSpecificsEnabledCodeType.values()) {
                if (c.value.equals(v)) {
                    return c;
                }
            }
        }
        throw new IllegalArgumentException(v);
    }
}