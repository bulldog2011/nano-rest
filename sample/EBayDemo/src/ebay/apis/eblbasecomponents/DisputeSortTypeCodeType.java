// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package ebay.apis.eblbasecomponents;

/**
 * 
 * Specifies how a list of returned disputes should be sorted.
 * 
 */
public enum DisputeSortTypeCodeType {

    /**
     * 
   * (in) Sort by the time the dispute was created, in descending order.
   * 
     */
    NONE("None"),
  

    /**
     * 
   * (in) Sort by the time the dispute was created, in ascending order.
   * 
     */
    DISPUTE_CREATED_TIME_ASCENDING("DisputeCreatedTimeAscending"),
  

    /**
     * 
   * (in) Sort by the time the dispute was created, in descending order.
   * 
     */
    DISPUTE_CREATED_TIME_DESCENDING("DisputeCreatedTimeDescending"),
  

    /**
     * 
   * (in) Sort by the dispute status, in ascending order.
   * 
     */
    DISPUTE_STATUS_ASCENDING("DisputeStatusAscending"),
  

    /**
     * 
   * (in) Sort by the dispute status, in descending order.
   * 
     */
    DISPUTE_STATUS_DESCENDING("DisputeStatusDescending"),
  

    /**
     * 
   * (in) Sort by whether the dispute is eligible for
   * Final Value Fee credit, in ascending
   * order. Ineligible disputes are listed before eligible disputes.
   * 
     */
    DISPUTE_CREDIT_ELIGIBILITY_ASCENDING("DisputeCreditEligibilityAscending"),
  

    /**
     * 
   * (in) Sort by whether the dispute is eleigible for
   * Final Value Fee credit, in descending
   * order. Eligible disputes are listed before i(ineligible disputes.
   * 
     */
    DISPUTE_CREDIT_ELIGIBILITY_DESCENDING("DisputeCreditEligibilityDescending"),
  

    /**
     * 
   * (out) Reserved for internal or future use.
   * 
     */
    CUSTOM_CODE("CustomCode");
  
  
    private final String value;
  
    DisputeSortTypeCodeType(String v) {
        value = v;
    }
    
    public String value() {
        return value;
    }
    
    public static DisputeSortTypeCodeType fromValue(String v) {
        if (v != null) {
            for (DisputeSortTypeCodeType c: DisputeSortTypeCodeType.values()) {
                if (c.value.equals(v)) {
                    return c;
                }
            }
        }
        throw new IllegalArgumentException(v);
    }
}