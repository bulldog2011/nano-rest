// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package ebay.apis.eblbasecomponents;

/**
 * 
 * Type that defines the TaxDescription field. The TaxDescription field allows the
 * seller to provide a description of the sales tax type.
 * 
 */
public enum TaxDescriptionCodeType {

    /**
     * 
   * A standard sales tax charge.
   * 
     */
    SALES_TAX("SalesTax"),
  

    /**
     * 
   * A charge for an electronic waste recycling fee.
   * 
     */
    ELECTRONIC_WASTE_RECYCLING_FEE("ElectronicWasteRecyclingFee"),
  

    /**
     * 
   * A charge for a tire recycling fee.
   * 
     */
    TIRE_RECYCLING_FEE("TireRecyclingFee"),
  

    /**
     * 
   * Reserved for internal or future use.
   * 
     */
    CUSTOM_CODE("CustomCode");
  
  
    private final String value;
  
    TaxDescriptionCodeType(String v) {
        value = v;
    }
    
    public String value() {
        return value;
    }
    
    public static TaxDescriptionCodeType fromValue(String v) {
        if (v != null) {
            for (TaxDescriptionCodeType c: TaxDescriptionCodeType.values()) {
                if (c.value.equals(v)) {
                    return c;
                }
            }
        }
        throw new IllegalArgumentException(v);
    }
}