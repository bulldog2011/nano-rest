// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package ebay.apis.eblbasecomponents;

/**
 * 
 * State of an account of an eBay user.
 * 
 */
public enum AccountStateCodeType {

    /**
     * 
   * (out) The account is active.
   * 
     */
    ACTIVE("Active"),
  

    /**
     * 
   * (out) The account has been created but is not yet active,
   * pending additional information or processing by eBay.
   * 
     */
    PENDING("Pending"),
  

    /**
     * 
   * (out) The account is inactive. No new seller account entries
   * would be posted by eBay to the account.
   * 
     */
    INACTIVE("Inactive"),
  

    /**
     * 
   * (out) Reserved for internal or future use.
   * 
     */
    CUSTOM_CODE("CustomCode");
  
  
    private final String value;
  
    AccountStateCodeType(String v) {
        value = v;
    }
    
    public String value() {
        return value;
    }
    
    public static AccountStateCodeType fromValue(String v) {
        if (v != null) {
            for (AccountStateCodeType c: AccountStateCodeType.values()) {
                if (c.value.equals(v)) {
                    return c;
                }
            }
        }
        throw new IllegalArgumentException(v);
    }
}