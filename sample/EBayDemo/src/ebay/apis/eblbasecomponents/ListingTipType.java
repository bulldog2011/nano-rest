// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package ebay.apis.eblbasecomponents;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;

/**
 * 
 * A tip on improving a listing's details. Tips are returned from the Listing Analyzer engine.
 * 
 */
public class ListingTipType implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element(name = "ListingTipID")
	private String listingTipID;
	
	@Element(name = "Priority")
	private Integer priority;
	
	@Element(name = "Message")
	private ListingTipMessageType message;
	
	@Element(name = "Field")
	private ListingTipFieldType field;
	
    
	/**
     * public getter
     *
     * 
     * Identifier for the tip. Primarily for internal use. This value may change over time.
     * 
     *
     * @returns java.lang.String
	 */
	public String getListingTipID() {
	    return this.listingTipID;
	}
	
	/**
	 * public setter
	 *
     * 
     * Identifier for the tip. Primarily for internal use. This value may change over time.
     * 
     *
     * @param java.lang.String
	 */
	public void setListingTipID(String listingTipID) {
	    this.listingTipID = listingTipID;
	}
	/**
     * public getter
     *
     * 
     * The rank of the tip. All tips are ranked by importance. Ranking varies for each site.
     * The rank is always greater than 0.
     * 
     *
     * @returns java.lang.Integer
	 */
	public Integer getPriority() {
	    return this.priority;
	}
	
	/**
	 * public setter
	 *
     * 
     * The rank of the tip. All tips are ranked by importance. Ranking varies for each site.
     * The rank is always greater than 0.
     * 
     *
     * @param java.lang.Integer
	 */
	public void setPriority(Integer priority) {
	    this.priority = priority;
	}
	/**
     * public getter
     *
     * 
     * The tip's message content.
     * 
     *
     * @returns ebay.apis.eblbasecomponents.ListingTipMessageType
	 */
	public ListingTipMessageType getMessage() {
	    return this.message;
	}
	
	/**
	 * public setter
	 *
     * 
     * The tip's message content.
     * 
     *
     * @param ebay.apis.eblbasecomponents.ListingTipMessageType
	 */
	public void setMessage(ListingTipMessageType message) {
	    this.message = message;
	}
	/**
     * public getter
     *
     * 
     * The item field that is associated with the tip.
     * 
     *
     * @returns ebay.apis.eblbasecomponents.ListingTipFieldType
	 */
	public ListingTipFieldType getField() {
	    return this.field;
	}
	
	/**
	 * public setter
	 *
     * 
     * The item field that is associated with the tip.
     * 
     *
     * @param ebay.apis.eblbasecomponents.ListingTipFieldType
	 */
	public void setField(ListingTipFieldType field) {
	    this.field = field;
	}

}