// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package ebay.apis.eblbasecomponents;

/**
 * 
 * A compressed, representative title for the eBay URL.
 * 
 */
public enum URLTypeCodeType {

    /**
     * 
   * URL Prefix for viewing a particular listing. Just add an item id.
   * 
     */
    VIEW_ITEM_URL("ViewItemURL"),
  

    /**
     * 
   * URL Prefix for viewing the feedback for a particular userid. Just add a userid.
   * 
     */
    VIEW_USER_URL("ViewUserURL"),
  

    /**
     * 
   * Full URL for an eBay login page.
   * 
     */
    MYE_BAY_URL("MyeBayURL"),
  

    /**
     * 
   * Full URL for viewing the items on which the user is bidding.
   * 
     */
    MYE_BAY_BIDDING_URL("MyeBayBiddingURL"),
  

    /**
     * 
   * Full URL for viewing the items on which the user bid but did not win.
   * 
     */
    MYE_BAY_NOT_WON_URL("MyeBayNotWonURL"),
  

    /**
     * 
   * Full URL for viewing the items on which the user bid and also won.
   * 
     */
    MYE_BAY_WON_URL("MyeBayWonURL"),
  

    /**
     * 
   * Full URL for viewing the items the user is currently watching.
   * 
     */
    MYE_BAY_WATCHING_URL("MyeBayWatchingURL"),
  

    /**
     * 
   * Full URL for eBay Stores.
   * 
     */
    E_BAY_STORE_URL("eBayStoreURL"),
  

    /**
     * 
   * Full URL for the small version of the "An eBay Marketplace" logo.
   * 
     */
    SMALL_LOGO_URL("SmallLogoURL"),
  

    /**
     * 
   * Full URL for the medium version of the "An eBay Marketplace" logo.
   * 
     */
    MEDIUM_LOGO_URL("MediumLogoURL"),
  

    /**
     * 
   * Full URL for the large version of the "An eBay Marketplace" logo.
   * 
     */
    LARGE_LOGO_URL("LargeLogoURL"),
  

    /**
     * 
   * Reserved for future use.
   * 
     */
    CUSTOM_CODE("CustomCode");
  
  
    private final String value;
  
    URLTypeCodeType(String v) {
        value = v;
    }
    
    public String value() {
        return value;
    }
    
    public static URLTypeCodeType fromValue(String v) {
        if (v != null) {
            for (URLTypeCodeType c: URLTypeCodeType.values()) {
                if (c.value.equals(v)) {
                    return c;
                }
            }
        }
        throw new IllegalArgumentException(v);
    }
}