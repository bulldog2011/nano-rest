// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package ebay.apis.eblbasecomponents;

/**
 * 
 * Enumerated type that defines the possible reasons why an auction listing with zero bids
 * is being hidden from search on the eBay site. Currently, only auction listings that have
 * been determined to be duplicate listings with zero bids are hidden from search, but there
 * may be other reasons to hide auction listings from search in the future.
 * <br/><br/>
 * This type is associated with eBay Duplicate Listings Policy, which has taken 
 * effect on the US, CA, CA-FR, and eBay Motors (Parts and Accessories only) sites. 
 * Event Tickets, Real Estate, and Motor Vehicle categories are excluded from this 
 * policy. For more information, read 
 * <a href="http://pages.ebay.com/help/policies/listing-multi.html">eBay's Duplicate Listings Policy</a> help page.
 * 
 */
public enum ReasonHideFromSearchCodeType {

    /**
     * 
   * This value indicates that the auction listing is being hidden from search on the eBay
   * site because the listing has been determined by eBay to be a duplicate listing with 
   * zero bids.
   * 
     */
    DUPLICATE_LISTING("DuplicateListing");
  
  
    private final String value;
  
    ReasonHideFromSearchCodeType(String v) {
        value = v;
    }
    
    public String value() {
        return value;
    }
    
    public static ReasonHideFromSearchCodeType fromValue(String v) {
        if (v != null) {
            for (ReasonHideFromSearchCodeType c: ReasonHideFromSearchCodeType.values()) {
                if (c.value.equals(v)) {
                    return c;
                }
            }
        }
        throw new IllegalArgumentException(v);
    }
}