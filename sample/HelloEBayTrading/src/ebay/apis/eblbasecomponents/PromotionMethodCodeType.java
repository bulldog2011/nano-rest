// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package ebay.apis.eblbasecomponents;

/**
 * 
 *   This type is deprecated as Cross Promotions are no longer supported in the APIs.
 * 
 * 
 */
public enum PromotionMethodCodeType {

    /**
     * 
   * 
   * Promote/present items that are related to or can be used with the
   * specified item.
   * 
     */
    CROSS_SELL("CrossSell"),
  

    /**
     * 
   * 
   * Promote/present items that of higher quality or more expensive
   * than the specified item.
   * 
     */
    UP_SELL("UpSell"),
  

    /**
     * 
   * 
   * Reserved for internal or future use.
   * 
     */
    CUSTOM_CODE("CustomCode");
  
  
    private final String value;
  
    PromotionMethodCodeType(String v) {
        value = v;
    }
    
    public String value() {
        return value;
    }
    
    public static PromotionMethodCodeType fromValue(String v) {
        if (v != null) {
            for (PromotionMethodCodeType c: PromotionMethodCodeType.values()) {
                if (c.value.equals(v)) {
                    return c;
                }
            }
        }
        throw new IllegalArgumentException(v);
    }
}