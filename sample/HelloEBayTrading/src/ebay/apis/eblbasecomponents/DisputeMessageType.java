// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package ebay.apis.eblbasecomponents;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;
import java.util.Date;

/**
 * 
 * Contains a message posted to a dispute. The message can be posted
 * by the buyer, the seller, or an eBay representative.
 * 
 */
public class DisputeMessageType implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element(name = "MessageID")
	private Integer messageID;
	
	@Element(name = "MessageSource")
	private DisputeMessageSourceCodeType messageSource;
	
	@Element(name = "MessageCreationTime")
	private Date messageCreationTime;
	
	@Element(name = "MessageText")
	private String messageText;
	
    
	/**
     * public getter
     *
     * 
     * An ID that uniquely identifies the message.
     * 
     *
     * @returns java.lang.Integer
	 */
	public Integer getMessageID() {
	    return this.messageID;
	}
	
	/**
	 * public setter
	 *
     * 
     * An ID that uniquely identifies the message.
     * 
     *
     * @param java.lang.Integer
	 */
	public void setMessageID(Integer messageID) {
	    this.messageID = messageID;
	}
	/**
     * public getter
     *
     * 
     * The party who posted the message: the buyer, the seller,
     * or an eBay representative.
     * 
     *
     * @returns ebay.apis.eblbasecomponents.DisputeMessageSourceCodeType
	 */
	public DisputeMessageSourceCodeType getMessageSource() {
	    return this.messageSource;
	}
	
	/**
	 * public setter
	 *
     * 
     * The party who posted the message: the buyer, the seller,
     * or an eBay representative.
     * 
     *
     * @param ebay.apis.eblbasecomponents.DisputeMessageSourceCodeType
	 */
	public void setMessageSource(DisputeMessageSourceCodeType messageSource) {
	    this.messageSource = messageSource;
	}
	/**
     * public getter
     *
     * 
     * The date and time the message was created, in GMT.
     * 
     *
     * @returns java.util.Date
	 */
	public Date getMessageCreationTime() {
	    return this.messageCreationTime;
	}
	
	/**
	 * public setter
	 *
     * 
     * The date and time the message was created, in GMT.
     * 
     *
     * @param java.util.Date
	 */
	public void setMessageCreationTime(Date messageCreationTime) {
	    this.messageCreationTime = messageCreationTime;
	}
	/**
     * public getter
     *
     * 
     * The text of the message.
     * 
     *
     * @returns java.lang.String
	 */
	public String getMessageText() {
	    return this.messageText;
	}
	
	/**
	 * public setter
	 *
     * 
     * The text of the message.
     * 
     *
     * @param java.lang.String
	 */
	public void setMessageText(String messageText) {
	    this.messageText = messageText;
	}

}