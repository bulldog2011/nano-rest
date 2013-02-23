// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package ebay.apis.eblbasecomponents;

/**
 * 
 *  A code indicating the status of the refund request.
 * 
 */
public enum RefundStatusCodeType {

    /**
     * 
   *  The refund request was successful.<br/><br/>
   *  <span class="tablenote">
   *  <strong>Note:</strong> The RefundStatus value is returned 
   *  (for GetOrders and other order retrieval calls) for DE/AT orders subject to the 
   *  new eBay payment process.
   *  </span>
   * 
     */
    SUCCESSFUL("Successful"),
  

    /**
     * 
   *  The refund request is being processed.<br/><br/>
   *  <span class="tablenote">
   *  <strong>Note:</strong> The RefundStatus value is returned 
   *  (for GetOrders and other order retrieval calls) for DE/AT orders subject to the 
   *  new eBay payment process.
   *  </span>
   * 
     */
    PENDING("Pending"),
  

    /**
     * 
   *  The refund request was rejected.<br/><br/>
   *  <span class="tablenote">
   *  <strong>Note:</strong> The RefundStatus value is returned 
   *  (for GetOrders and other order retrieval calls) for DE/AT orders subject to the 
   *  new eBay payment process.
   *  </span>
   * 
     */
    FAILED("Failed"),
  

    /**
     * 
   * (out) Reserved for internal or future use.
   * 
     */
    CUSTOM_CODE("CustomCode");
  
  
    private final String value;
  
    RefundStatusCodeType(String v) {
        value = v;
    }
    
    public String value() {
        return value;
    }
    
    public static RefundStatusCodeType fromValue(String v) {
        if (v != null) {
            for (RefundStatusCodeType c: RefundStatusCodeType.values()) {
                if (c.value.equals(v)) {
                    return c;
                }
            }
        }
        throw new IllegalArgumentException(v);
    }
}