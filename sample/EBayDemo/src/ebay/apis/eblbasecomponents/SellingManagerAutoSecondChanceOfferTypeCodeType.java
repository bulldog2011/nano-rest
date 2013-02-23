// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package ebay.apis.eblbasecomponents;

/**
 * 
 * SellingManagerAutoSecondChanceOfferTypeCodeType - Specifies the type of second chance offer automation rule that will be added to an item.
 * 
 */
public enum SellingManagerAutoSecondChanceOfferTypeCodeType {

    /**
     * 
   * Sends a second chance offer to all bidders who bid more than a specific amount.
   * 
     */
    BIDS_GREATER_THAN_AMOUNT("BidsGreaterThanAmount"),
  

    /**
     * 
   * Sends a second chance offer to all bidders who bid more than the cost plus a specific amount.
   * 
     */
    BIDS_GREATER_THAN_COST_PLUS_AMOUNT("BidsGreaterThanCostPlusAmount"),
  

    /**
     * 
   * Sends a second chance offer to all bidders who bid more than the cost plus a specific percentage.
   * 
     */
    BIDS_GREATER_THAN_COST_PLUS_PERCENTAGE("BidsGreaterThanCostPlusPercentage"),
  

    /**
     * 
   * (out) Reserved for internal or future use.
   * 
     */
    CUSTOM_CODE("CustomCode");
  
  
    private final String value;
  
    SellingManagerAutoSecondChanceOfferTypeCodeType(String v) {
        value = v;
    }
    
    public String value() {
        return value;
    }
    
    public static SellingManagerAutoSecondChanceOfferTypeCodeType fromValue(String v) {
        if (v != null) {
            for (SellingManagerAutoSecondChanceOfferTypeCodeType c: SellingManagerAutoSecondChanceOfferTypeCodeType.values()) {
                if (c.value.equals(v)) {
                    return c;
                }
            }
        }
        throw new IllegalArgumentException(v);
    }
}