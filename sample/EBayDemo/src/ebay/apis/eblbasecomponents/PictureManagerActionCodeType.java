// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package ebay.apis.eblbasecomponents;

/**
 * 
 * This type is deprecated as Pictures Manager was retired.
 * 
 * Manager account.
 * 
 */
public enum PictureManagerActionCodeType {

    /**
     * 
   * 
   * (in) Adds a folder or setting  to the account.
   * 
     */
    ADD("Add"),
  

    /**
     * 
   * 
   * (in) Deletes a folder or setting from the account.
   * 
     */
    DELETE("Delete"),
  

    /**
     * 
   * 
   * (in) Renames a folder or picture.
   * 
     */
    RENAME("Rename"),
  

    /**
     * 
   * 
   * (in) Moves a picture to the user's default folder in the 
   * default album. If the picture is already there, 
   * then no action occurs.
   * 
     */
    MOVE("Move"),
  

    /**
     * 
   * 
   * (in) Changes a subscription level.
   * 
     */
    CHANGE("Change"),
  

    /**
     * 
   * 
   * (out) Reserved for internal or future use
   * 
     */
    CUSTOM_CODE("CustomCode");
  
  
    private final String value;
  
    PictureManagerActionCodeType(String v) {
        value = v;
    }
    
    public String value() {
        return value;
    }
    
    public static PictureManagerActionCodeType fromValue(String v) {
        if (v != null) {
            for (PictureManagerActionCodeType c: PictureManagerActionCodeType.values()) {
                if (c.value.equals(v)) {
                    return c;
                }
            }
        }
        throw new IllegalArgumentException(v);
    }
}