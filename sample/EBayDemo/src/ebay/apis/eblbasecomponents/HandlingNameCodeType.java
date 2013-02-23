// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package ebay.apis.eblbasecomponents;

/**
 * 
 * How packaging/handling cost is to be determined for combined payment.
 * 
 */
public enum HandlingNameCodeType {

    /**
     * 
   * After eBay assigns the highest packaging/handling cost to the first item, the
   * packaging/handling cost for each additional item is $n.
   * 
     */
    EACH_ADDITIONAL_AMOUNT("EachAdditionalAmount"),
  

    /**
     * 
   * After eBay assigns the highest packaging/handling cost to the first item, the
   * packaging/handling cost for each additional item is to be reduced by amount N.
   * 
     */
    EACH_ADDITIONAL_AMOUNT_OFF("EachAdditionalAmountOff"),
  

    /**
     * 
   * After eBay assigns the highest packaging/handling cost to the first item, the
   * packaging/handling cost for each additional item is to be reduced by N percent.
   * 
     */
    EACH_ADDITIONAL_PERCENT_OFF("EachAdditionalPercentOff"),
  

    /**
     * 
   * The total packaging/handling cost is to be the sum of the
   * packaging/handling costs of the individual items.
   * 
     */
    INDIVIDUAL_HANDLING_FEE("IndividualHandlingFee"),
  

    /**
     * 
   * The packaging/handling cost is to be N for the entire order.
   * 
     */
    COMBINED_HANDLING_FEE("CombinedHandlingFee"),
  

    /**
     * 
   * Reserved for internal or future use.
   * 
     */
    CUSTOM_CODE("CustomCode");
  
  
    private final String value;
  
    HandlingNameCodeType(String v) {
        value = v;
    }
    
    public String value() {
        return value;
    }
    
    public static HandlingNameCodeType fromValue(String v) {
        if (v != null) {
            for (HandlingNameCodeType c: HandlingNameCodeType.values()) {
                if (c.value.equals(v)) {
                    return c;
                }
            }
        }
        throw new IllegalArgumentException(v);
    }
}