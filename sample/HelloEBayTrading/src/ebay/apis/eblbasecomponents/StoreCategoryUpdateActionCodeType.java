// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package ebay.apis.eblbasecomponents;

/**
 * 
 * Specifies the type of action to carry out with SetStoreCategories.
 * 
 */
public enum StoreCategoryUpdateActionCodeType {

    /**
     * 
   * (in) Add the listed categories to the store.
   * 
     */
    ADD("Add"),
  

    /**
     * 
   * (in) Delete the listed categories from the store.
   * 
     */
    DELETE("Delete"),
  

    /**
     * 
   * (in) Move the listed categories from one place in the store category
   * structure to another.
   * 
     */
    MOVE("Move"),
  

    /**
     * 
   * (in) Rename the listed store categories to the names provided.
   * 
     */
    RENAME("Rename"),
  

    /**
     * 
   * (out) Reserved for internal or future use.
   * 
     */
    CUSTOM_CODE("CustomCode");
  
  
    private final String value;
  
    StoreCategoryUpdateActionCodeType(String v) {
        value = v;
    }
    
    public String value() {
        return value;
    }
    
    public static StoreCategoryUpdateActionCodeType fromValue(String v) {
        if (v != null) {
            for (StoreCategoryUpdateActionCodeType c: StoreCategoryUpdateActionCodeType.values()) {
                if (c.value.equals(v)) {
                    return c;
                }
            }
        }
        throw new IllegalArgumentException(v);
    }
}