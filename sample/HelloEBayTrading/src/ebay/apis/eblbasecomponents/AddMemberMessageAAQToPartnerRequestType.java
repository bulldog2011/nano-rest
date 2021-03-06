// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package ebay.apis.eblbasecomponents;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;

/**
 * 
 * Enables a buyer and seller in an order relationship to
 * send messages to each other's My Messages Inboxes.
 * 
 */
@RootElement(name = "AddMemberMessageAAQToPartnerRequest", namespace = "urn:ebay:apis:eBLBaseComponents")
public class AddMemberMessageAAQToPartnerRequestType extends AbstractRequestType implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element(name = "ItemID")
	private String itemID;
	
	@Element(name = "MemberMessage")
	private MemberMessageType memberMessage;
	
    
	/**
     * public getter
     *
     * 
     * The unique ID of the item about which the question was asked.
     * 
     *
     * @returns java.lang.String
	 */
	public String getItemID() {
	    return this.itemID;
	}
	
	/**
	 * public setter
	 *
     * 
     * The unique ID of the item about which the question was asked.
     * 
     *
     * @param java.lang.String
	 */
	public void setItemID(String itemID) {
	    this.itemID = itemID;
	}
	/**
     * public getter
     *
     * 
     * Container for the message. Includes the message body, plus other values
     * related to the message.
     * 
     *
     * @returns ebay.apis.eblbasecomponents.MemberMessageType
	 */
	public MemberMessageType getMemberMessage() {
	    return this.memberMessage;
	}
	
	/**
	 * public setter
	 *
     * 
     * Container for the message. Includes the message body, plus other values
     * related to the message.
     * 
     *
     * @param ebay.apis.eblbasecomponents.MemberMessageType
	 */
	public void setMemberMessage(MemberMessageType memberMessage) {
	    this.memberMessage = memberMessage;
	}

}