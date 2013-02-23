// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package ebay.apis.eblbasecomponents;

/**
 * 
 * The status of the best offer.
 * 
 */
public enum BestOfferStatusCodeType {

    /**
     * 
   * The best offer is awaiting seller response or will naturally expire after 48 hours.
   * 
     */
    PENDING("Pending"),
  

    /**
     * 
   * The best offer was accepted by the seller.
   * 
     */
    ACCEPTED("Accepted"),
  

    /**
     * 
   * The best offer was rejected by the seller.
   * 
     */
    DECLINED("Declined"),
  

    /**
     * 
   * The best offer expired after 48 hours due to no action by the seller.
   * 
     */
    EXPIRED("Expired"),
  

    /**
     * 
   * The best offer was retracted by the buyer.
   * 
     */
    RETRACTED("Retracted"),
  

    /**
     * 
   * The best offer was ended by an administrator.
   * 
     */
    ADMIN_ENDED("AdminEnded"),
  

    /**
     * 
   * Retrieve active best offers only.
   * 
     */
    ACTIVE("Active"),
  

    /**
     * 
   * Retrieve all counter best offers.
   * 
     */
    COUNTERED("Countered"),
  

    /**
     * 
   * Retrieve all best offers (including declined offers, etc.).
   * 
     */
    ALL("All"),
  

    /**
     * 
   * (out) Reserved for internal or future use.
   * 
     */
    CUSTOM_CODE("CustomCode");
  
  
    private final String value;
  
    BestOfferStatusCodeType(String v) {
        value = v;
    }
    
    public String value() {
        return value;
    }
    
    public static BestOfferStatusCodeType fromValue(String v) {
        if (v != null) {
            for (BestOfferStatusCodeType c: BestOfferStatusCodeType.values()) {
                if (c.value.equals(v)) {
                    return c;
                }
            }
        }
        throw new IllegalArgumentException(v);
    }
}