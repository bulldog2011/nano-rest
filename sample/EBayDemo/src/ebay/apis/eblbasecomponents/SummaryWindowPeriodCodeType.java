// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package ebay.apis.eblbasecomponents;

/**
 * 
 * The period of time for which to create a summary.
 * 
 */
public enum SummaryWindowPeriodCodeType {

    /**
     * 
   * The last 24 hours.
   * 
     */
    LAST_24_HOURS("Last24Hours"),
  

    /**
     * 
   * The last 7 days.
   * 
     */
    LAST_7_DAYS("Last7Days"),
  

    /**
     * 
   * The last 31 days.
   * 
     */
    LAST_31_DAYS("Last31Days"),
  

    /**
     * 
   * The current week.
   * 
     */
    CURRENT_WEEK("CurrentWeek"),
  

    /**
     * 
   * The prior week.
   * 
     */
    LAST_WEEK("LastWeek"),
  

    /**
     * 
   * The current month.
   * 
     */
    CURRENT_MONTH("CurrentMonth"),
  

    /**
     * 
   * The prior month.
   * 
     */
    LAST_MONTH("LastMonth"),
  

    /**
     * 
   * The last 60 days.
   * 
     */
    LAST_60_DAYS("Last60Days"),
  

    CUSTOM_CODE("CustomCode");
  
  
    private final String value;
  
    SummaryWindowPeriodCodeType(String v) {
        value = v;
    }
    
    public String value() {
        return value;
    }
    
    public static SummaryWindowPeriodCodeType fromValue(String v) {
        if (v != null) {
            for (SummaryWindowPeriodCodeType c: SummaryWindowPeriodCodeType.values()) {
                if (c.value.equals(v)) {
                    return c;
                }
            }
        }
        throw new IllegalArgumentException(v);
    }
}