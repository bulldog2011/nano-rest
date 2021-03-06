// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package ebay.apis.eblbasecomponents;

/**
 * 
 * Defines who added a message to a dispute. Used for both Unpaid Item
 * and Item Not Received disputes.
 * 
 */
public enum DisputeMessageSourceCodeType {

    /**
     * 
   * (out) The buyer of the item under dispute.
   * 
     */
    BUYER("Buyer"),
  

    /**
     * 
   * (out) The seller of the item under dispute.
   * 
     */
    SELLER("Seller"),
  

    /**
     * 
   * (out) eBay, either an administrator or the site itself.
   * 
     */
    E_BAY("eBay"),
  

    /**
     * 
   * (out) Reserved for internal or future use.
   * 
     */
    CUSTOM_CODE("CustomCode");
  
  
    private final String value;
  
    DisputeMessageSourceCodeType(String v) {
        value = v;
    }
    
    public String value() {
        return value;
    }
    
    public static DisputeMessageSourceCodeType fromValue(String v) {
        if (v != null) {
            for (DisputeMessageSourceCodeType c: DisputeMessageSourceCodeType.values()) {
                if (c.value.equals(v)) {
                    return c;
                }
            }
        }
        throw new IllegalArgumentException(v);
    }
}