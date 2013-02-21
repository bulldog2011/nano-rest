// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package ebay.apis.eblbasecomponents;

/**
 * 
 * Enumeration type that contains the payout methods available to DE and AT sellers for orders going through the
 * new eBay payment process flow. Once a DE or AT seller has accepted the supplemental user agreement for the new
 * eBay payment process, that seller must set the default payout account in My eBay preferences. eBay will
 * distribute seller payouts to this account.
 * 
 */
public enum PayoutMethodType {

    /**
     * 
   * This value indicates that the seller wants eBay to distribute payouts to their PayPal account.
   * 
     */
    PAYPAL("PAYPAL"),
  

    /**
     * 
   * This value indicates that the seller wants eBay to distribute payouts to their bank account via EFT 
   * (Electronic Funds Transfer).
   * 
     */
    EFT("EFT"),
  

    /**
     * 
   * This value indicates that the seller wants eBay to distribute payouts to their Moneybookers (Skrill)
   * account.
   * 
     */
    MONEYBOOKERS("MONEYBOOKERS");
  
  
    private final String value;
  
    PayoutMethodType(String v) {
        value = v;
    }
    
    public String value() {
        return value;
    }
    
    public static PayoutMethodType fromValue(String v) {
        if (v != null) {
            for (PayoutMethodType c: PayoutMethodType.values()) {
                if (c.value.equals(v)) {
                    return c;
                }
            }
        }
        throw new IllegalArgumentException(v);
    }
}