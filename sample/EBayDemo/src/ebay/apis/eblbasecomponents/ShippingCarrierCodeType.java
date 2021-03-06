// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package ebay.apis.eblbasecomponents;

/**
 * 
 *          Identifies a shipping carrier.
 * 
 */
public enum ShippingCarrierCodeType {

    /**
     * 
   * United Parcel Service.
   * <br><br>
   * For UPS Mail Innovations (for CompleteSale call requests only),
   * specify the value UPS-MI.
   * 
     */
    UPS("UPS"),
  

    /**
     * 
   * U.S. Postal Service.
   * 
     */
    USPS("USPS"),
  

    /**
     * 
   * Fedex
   * For FedEx SmartPost (for CompleteSale call requests only),
   * specify the value FedEx.
   * 
     */
    FED_EX("FedEx"),
  

    /**
     * 
   * Deutsche Post.
   * 
     */
    DEUTSCHE_POST("DeutschePost"),
  

    /**
     * 
   * DHL service
   * 
     */
    DHL("DHL"),
  

    /**
     * 
   * Hermes
   * 
     */
    HERMES("Hermes"),
  

    /**
     * 
   * iLoxx
   * 
     */
    I_LOXX("iLoxx"),
  

    /**
     * 
   * Other postal service
   * 
     */
    OTHER("Other"),
  

    /**
     * 
   * Coliposte Domestic
   * 
     */
    COLIPOSTE_DOMESTIC("ColiposteDomestic"),
  

    /**
     * 
   * Coliposte International
   * 
     */
    COLIPOSTE_INTERNATIONAL("ColiposteInternational"),
  

    /**
     * 
   * Chronopost
   * 
     */
    CHRONOPOST("Chronopost"),
  

    /**
     * 
   * Correos
   * 
     */
    CORREOS("Correos"),
  

    /**
     * 
   * Seur (reserved for future use)
   * 
     */
    SEUR("Seur"),
  

    /**
     * 
   * Nacex
   * 
     */
    NACEX("Nacex"),
  

    /**
     * 
   * The Global Shipping Program's international shipping provider.
   * 
     */
    GLOBAL_SHIPPING_MULTI_CARRIER("GlobalShipping_MultiCarrier"),
  

    /**
     * 
   * Reserved for internal or future use
   * 
     */
    CUSTOM_CODE("CustomCode");
  
  
    private final String value;
  
    ShippingCarrierCodeType(String v) {
        value = v;
    }
    
    public String value() {
        return value;
    }
    
    public static ShippingCarrierCodeType fromValue(String v) {
        if (v != null) {
            for (ShippingCarrierCodeType c: ShippingCarrierCodeType.values()) {
                if (c.value.equals(v)) {
                    return c;
                }
            }
        }
        throw new IllegalArgumentException(v);
    }
}