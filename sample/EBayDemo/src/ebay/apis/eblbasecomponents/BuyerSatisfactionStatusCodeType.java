// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package ebay.apis.eblbasecomponents;

/**
 * 
 * Buyer satisfaction status.
 * 
 */
public enum BuyerSatisfactionStatusCodeType {

    /**
     * 
   * You are doing an excellent job as an eBay seller.
   * Be sure to continue providing members with a positive buying experience.
   * A buyer satisfaction rating of Excellent ensures that you are eligible
   * for eBay incentives.
   * 
     */
    EXCELLENT("Excellent"),
  

    /**
     * 
   * You are doing a good job as an eBay seller.
   * Buyers have been satisfied with your customer service. Be sure to continue
   * providing members with a positive buying experience. A buyer satisfaction
   * rating of Good ensures that you are eligible for eBay incentives.
   * 
     */
    GOOD("Good"),
  

    NEEDS_WORK("NeedsWork"),
  

    /**
     * 
   * You are not doing a good job as an eBay seller.
   * Some of your buyers have not been satisfied with your service.
   * Improve your customer service to earn a higher buyer satisfaction rating.
   * If your customer service continues to receive poor responses from customers,
   * your buyer satisfaction rating can drop and could put your eBay seller's
   * account at risk.
   * 
     */
    POOR("Poor"),
  

    /**
     * 
   * You are doing a very poor job as an eBay seller.
   * You need to improve your selling practices immediately. Too many of your
   * customers have not been satisfied with your customer service and you are
   * at risk of losing your eBay account.
   * 
     */
    VERY_POOR("VeryPoor"),
  

    /**
     * 
   * You are doing an unacceptable job as an eBay seller.
   * Improve your selling practices immediately. Your account may be suspended
   * because of your unacceptable customer service.
   * 
     */
    UNACCEPTABLE("Unacceptable"),
  

    /**
     * 
   * Reserved for internal or future use.
   * 
     */
    CUSTOM_CODE("CustomCode");
  
  
    private final String value;
  
    BuyerSatisfactionStatusCodeType(String v) {
        value = v;
    }
    
    public String value() {
        return value;
    }
    
    public static BuyerSatisfactionStatusCodeType fromValue(String v) {
        if (v != null) {
            for (BuyerSatisfactionStatusCodeType c: BuyerSatisfactionStatusCodeType.values()) {
                if (c.value.equals(v)) {
                    return c;
                }
            }
        }
        throw new IllegalArgumentException(v);
    }
}