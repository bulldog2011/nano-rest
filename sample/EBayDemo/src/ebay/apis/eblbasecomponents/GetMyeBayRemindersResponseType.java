// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package ebay.apis.eblbasecomponents;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;

/**
 * 
 * Returns totals of various reminder types from the user's My eBay account.
 * 
 */
@RootElement(name = "GetMyeBayRemindersResponse", namespace = "urn:ebay:apis:eBLBaseComponents")
public class GetMyeBayRemindersResponseType extends AbstractResponseType implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element(name = "BuyingReminders")
	private RemindersType buyingReminders;
	
	@Element(name = "SellingReminders")
	private RemindersType sellingReminders;
	
    
	/**
     * public getter
     *
     * 
     * Contains the buying reminders in the user's My eBay account that match
     * the request criteria.
     * 
     *
     * @returns ebay.apis.eblbasecomponents.RemindersType
	 */
	public RemindersType getBuyingReminders() {
	    return this.buyingReminders;
	}
	
	/**
	 * public setter
	 *
     * 
     * Contains the buying reminders in the user's My eBay account that match
     * the request criteria.
     * 
     *
     * @param ebay.apis.eblbasecomponents.RemindersType
	 */
	public void setBuyingReminders(RemindersType buyingReminders) {
	    this.buyingReminders = buyingReminders;
	}
	/**
     * public getter
     *
     * 
     * Contains the selling reminders in the user's My eBay account that match
     * the request criteria.
     * 
     *
     * @returns ebay.apis.eblbasecomponents.RemindersType
	 */
	public RemindersType getSellingReminders() {
	    return this.sellingReminders;
	}
	
	/**
	 * public setter
	 *
     * 
     * Contains the selling reminders in the user's My eBay account that match
     * the request criteria.
     * 
     *
     * @param ebay.apis.eblbasecomponents.RemindersType
	 */
	public void setSellingReminders(RemindersType sellingReminders) {
	    this.sellingReminders = sellingReminders;
	}

}