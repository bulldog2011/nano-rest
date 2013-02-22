// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package ebay.apis.eblbasecomponents;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;

/**
 * 
 * Holds the content of the request.
 * 
 */
public class AddMemberMessagesAAQToBidderRequestContainerType implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element(name = "CorrelationID")
	private String correlationID;
	
	@Element(name = "ItemID")
	private String itemID;
	
	@Element(name = "MemberMessage")
	private MemberMessageType memberMessage;
	
    
	/**
     * public getter
     *
     * 
     * A <b>CorrelationID</b> value is required for 
     * each <b>AddMemberMessagesAAQToBidderRequestContainer<b> container that is used in the request. The 
     * <b>CorrelationID</b> value returned under each 
     * <b>AddMemberMessagesAAQToBidderResponseContainer</b> container is used to correlate each 
     * member message container in the request with its corresponding member message container in the 
     * response. The same <b>CorrelationID</b> value that you pass into a request will 
     * be returned in the <b>CorrelationID</b> field in the response.
     * 
     *
     * @returns java.lang.String
	 */
	public String getCorrelationID() {
	    return this.correlationID;
	}
	
	/**
	 * public setter
	 *
     * 
     * A <b>CorrelationID</b> value is required for 
     * each <b>AddMemberMessagesAAQToBidderRequestContainer<b> container that is used in the request. The 
     * <b>CorrelationID</b> value returned under each 
     * <b>AddMemberMessagesAAQToBidderResponseContainer</b> container is used to correlate each 
     * member message container in the request with its corresponding member message container in the 
     * response. The same <b>CorrelationID</b> value that you pass into a request will 
     * be returned in the <b>CorrelationID</b> field in the response.
     * 
     *
     * @param java.lang.String
	 */
	public void setCorrelationID(String correlationID) {
	    this.correlationID = correlationID;
	}
	/**
     * public getter
     *
     * 
     * An eBay ID that uniquely identifies a given
     * item. Must be a currently active item.
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
     * An eBay ID that uniquely identifies a given
     * item. Must be a currently active item.
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
     * Holds the content of the message.
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
     * Holds the content of the message.
     * 
     *
     * @param ebay.apis.eblbasecomponents.MemberMessageType
	 */
	public void setMemberMessage(MemberMessageType memberMessage) {
	    this.memberMessage = memberMessage;
	}

}