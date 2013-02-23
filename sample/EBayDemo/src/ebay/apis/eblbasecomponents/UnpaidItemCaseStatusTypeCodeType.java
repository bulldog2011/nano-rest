// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package ebay.apis.eblbasecomponents;

/**
 * 
 *               Enumeration type that indicates the current status of an Unpaid Item case.
 *             
 */
public enum UnpaidItemCaseStatusTypeCodeType {

    /**
     * 
   *                       This value indicates that the Unpaid Item case is open.
   *                     
     */
    OPEN("Open"),
  

    /**
     * 
   *                      This value indicates that the Unpaid Item case is closed with payment
   *  received from the buyer.
   *                     
     */
    CLOSED_WITH_PAYMENT("ClosedWithPayment"),
  

    /**
     * 
   *                       This value indicates that the Unpaid Item case is closed with no payment
   *  received from the buyer.
   *                     
     */
    CLOSED_WITHOUT_PAYMENT("ClosedWithoutPayment"),
  

    /**
     * 
   *                       This value is reserved for future or internal use.
   *                     
     */
    CUSTOM_CODE("CustomCode");
  
  
    private final String value;
  
    UnpaidItemCaseStatusTypeCodeType(String v) {
        value = v;
    }
    
    public String value() {
        return value;
    }
    
    public static UnpaidItemCaseStatusTypeCodeType fromValue(String v) {
        if (v != null) {
            for (UnpaidItemCaseStatusTypeCodeType c: UnpaidItemCaseStatusTypeCodeType.values()) {
                if (c.value.equals(v)) {
                    return c;
                }
            }
        }
        throw new IllegalArgumentException(v);
    }
}