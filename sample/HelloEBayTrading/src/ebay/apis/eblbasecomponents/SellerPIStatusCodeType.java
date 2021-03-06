// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package ebay.apis.eblbasecomponents;

/**
 * 
 * Enumerated type that indicates whether or not a new DE or AT seller has accepted the
 * user agreement related to the new payment process. The new payment process for the DE
 * and AT sites is scheduled to be implemented in late August 2011.
 * 
 */
public enum SellerPIStatusCodeType {

    /**
     * 
   * This value indicates that the new DE or AT seller has accepted the user agreement
   * related to the new payment process, but the new payment process has yet to be
   * fully implemented on the seller's account. The new payment process for the DE and
   * AT sites is scheduled to be implemented in late August 2011. 
   * 
     */
    ACCEPTED_UA("AcceptedUA"),
  

    /**
     * 
   * This value indicates that the new DE or AT seller has yet to accept the user
   * agreement related to the new payment process. This new seller will be blocked
   * from listing on the DE and AT sites until he accepts the user agreement.  The new
   * payment process for the DE and AT sites is scheduled to be implemented in late
   * August 2011.
   * 
     */
    MUST_ACCEPT_UA("MustAcceptUA"),
  

    /**
     * 
   * This value indicates that the new DE or AT seller has accepted the user
   * agreement related to the new payment process and the new payment process is
   * fully implemented on the seller's account. The new payment process for the DE
   * and AT sites is scheduled to be implemented in late August 2011.
   * 
     */
    PI_ENABLED("PIEnabled"),
  

    /**
     * 
   * Reserved for internal or future use
   * 
     */
    CUSTOM_CODE("CustomCode");
  
  
    private final String value;
  
    SellerPIStatusCodeType(String v) {
        value = v;
    }
    
    public String value() {
        return value;
    }
    
    public static SellerPIStatusCodeType fromValue(String v) {
        if (v != null) {
            for (SellerPIStatusCodeType c: SellerPIStatusCodeType.values()) {
                if (c.value.equals(v)) {
                    return c;
                }
            }
        }
        throw new IllegalArgumentException(v);
    }
}