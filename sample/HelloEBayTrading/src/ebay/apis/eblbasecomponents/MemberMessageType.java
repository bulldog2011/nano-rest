// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package ebay.apis.eblbasecomponents;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;
import java.util.List;

/**
 * 
 * Container for individual message information.
 * 
 */
public class MemberMessageType implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element(name = "MessageType")
	private MessageTypeCodeType messageType;
	
	@Element(name = "QuestionType")
	private QuestionTypeCodeType questionType;
	
	@Element(name = "EmailCopyToSender")
	private Boolean emailCopyToSender;
	
	@Element(name = "HideSendersEmailAddress")
	private Boolean hideSendersEmailAddress;
	
	@Element(name = "DisplayToPublic")
	private Boolean displayToPublic;
	
	@Element(name = "SenderID")
	private String senderID;
	
	@Element(name = "SenderEmail")
	private String senderEmail;
	
	@Element(name = "RecipientID")
	private List<String> recipientID;
	
	@Element(name = "Subject")
	private String subject;
	
	@Element(name = "Body")
	private String body;
	
	@Element(name = "MessageID")
	private String messageID;
	
	@Element(name = "ParentMessageID")
	private String parentMessageID;
	
    
	/**
     * public getter
     *
     * 
     * The type of message being retrieved. Note that some message
     * types can only be created via the eBay Web site.
     * 
     *
     * @returns ebay.apis.eblbasecomponents.MessageTypeCodeType
	 */
	public MessageTypeCodeType getMessageType() {
	    return this.messageType;
	}
	
	/**
	 * public setter
	 *
     * 
     * The type of message being retrieved. Note that some message
     * types can only be created via the eBay Web site.
     * 
     *
     * @param ebay.apis.eblbasecomponents.MessageTypeCodeType
	 */
	public void setMessageType(MessageTypeCodeType messageType) {
	    this.messageType = messageType;
	}
	/**
     * public getter
     *
     * 
     * The context of the question (e.g. Shipping, General).
     * 
     *
     * @returns ebay.apis.eblbasecomponents.QuestionTypeCodeType
	 */
	public QuestionTypeCodeType getQuestionType() {
	    return this.questionType;
	}
	
	/**
	 * public setter
	 *
     * 
     * The context of the question (e.g. Shipping, General).
     * 
     *
     * @param ebay.apis.eblbasecomponents.QuestionTypeCodeType
	 */
	public void setQuestionType(QuestionTypeCodeType questionType) {
	    this.questionType = questionType;
	}
	/**
     * public getter
     *
     * 
     * Specifies whether or not to email a copy of the
     * message to the sender. If omitted, this defaults to whatever
     * the user set in preferences.
     * 
     *
     * @returns java.lang.Boolean
	 */
	public Boolean getEmailCopyToSender() {
	    return this.emailCopyToSender;
	}
	
	/**
	 * public setter
	 *
     * 
     * Specifies whether or not to email a copy of the
     * message to the sender. If omitted, this defaults to whatever
     * the user set in preferences.
     * 
     *
     * @param java.lang.Boolean
	 */
	public void setEmailCopyToSender(Boolean emailCopyToSender) {
	    this.emailCopyToSender = emailCopyToSender;
	}
	/**
     * public getter
     *
     * 
     * Specifies whether or not to hide sender's email address
     * from the recipient. If omitted, this defaults to whatever
     * the user set in preferences--or on site policy, which
     * determines whether or not this field is recognized.
     * <br><br> <span class="tablenote"><b>Note:</b>
     * This tag is no longer operational.
     * </span>
     * 
     *
     * @returns java.lang.Boolean
	 */
	public Boolean getHideSendersEmailAddress() {
	    return this.hideSendersEmailAddress;
	}
	
	/**
	 * public setter
	 *
     * 
     * Specifies whether or not to hide sender's email address
     * from the recipient. If omitted, this defaults to whatever
     * the user set in preferences--or on site policy, which
     * determines whether or not this field is recognized.
     * <br><br> <span class="tablenote"><b>Note:</b>
     * This tag is no longer operational.
     * </span>
     * 
     *
     * @param java.lang.Boolean
	 */
	public void setHideSendersEmailAddress(Boolean hideSendersEmailAddress) {
	    this.hideSendersEmailAddress = hideSendersEmailAddress;
	}
	/**
     * public getter
     *
     * 
     * If True, the member message is viewable in the item listing.
     * 
     *
     * @returns java.lang.Boolean
	 */
	public Boolean getDisplayToPublic() {
	    return this.displayToPublic;
	}
	
	/**
	 * public setter
	 *
     * 
     * If True, the member message is viewable in the item listing.
     * 
     *
     * @param java.lang.Boolean
	 */
	public void setDisplayToPublic(Boolean displayToPublic) {
	    this.displayToPublic = displayToPublic;
	}
	/**
     * public getter
     *
     * 
     * The eBay user ID of the person who asked the question or sent
     * the message.
     * 
     *
     * @returns java.lang.String
	 */
	public String getSenderID() {
	    return this.senderID;
	}
	
	/**
	 * public setter
	 *
     * 
     * The eBay user ID of the person who asked the question or sent
     * the message.
     * 
     *
     * @param java.lang.String
	 */
	public void setSenderID(String senderID) {
	    this.senderID = senderID;
	}
	/**
     * public getter
     *
     * 
     * SenderEmail contains the static email address of an eBay member,
     * used within the "reply to"
     * email address when the eBay member sends a message.
     * (Each eBay member is assigned a static alias. The alias is
     * used within a static email address.)
     * SenderEmail is returned if MessageType is AskSellerQuestion.
     * SenderEmail is also returned in the AskSellerQuestion notification.
     * The following functionality of this field has been deprecated:
     * return of a dynamic email address.
     * 
     *
     * @returns java.lang.String
	 */
	public String getSenderEmail() {
	    return this.senderEmail;
	}
	
	/**
	 * public setter
	 *
     * 
     * SenderEmail contains the static email address of an eBay member,
     * used within the "reply to"
     * email address when the eBay member sends a message.
     * (Each eBay member is assigned a static alias. The alias is
     * used within a static email address.)
     * SenderEmail is returned if MessageType is AskSellerQuestion.
     * SenderEmail is also returned in the AskSellerQuestion notification.
     * The following functionality of this field has been deprecated:
     * return of a dynamic email address.
     * 
     *
     * @param java.lang.String
	 */
	public void setSenderEmail(String senderEmail) {
	    this.senderEmail = senderEmail;
	}
	/**
     * public getter
     *
     * 
     * Recipient's eBay user ID. For
     * AddMemberMessagesAAQToBidder, it must be the seller of an
     * item, that item's bidder, or a user who has made an
     * offer on that item using Best Offer. Note: maxOccurs is a shared schema
     * element and needs to be unbounded for AddMemberMessagesAAQToBidder.
     * For AddMemberMessageRTQ, this field is mandatory if ItemID is not in the request.
     * For all other uses, there can only be one RecipientID.
     * 
     *
     * @returns java.util.List<java.lang.String>
	 */
	public List<String> getRecipientID() {
	    return this.recipientID;
	}
	
	/**
	 * public setter
	 *
     * 
     * Recipient's eBay user ID. For
     * AddMemberMessagesAAQToBidder, it must be the seller of an
     * item, that item's bidder, or a user who has made an
     * offer on that item using Best Offer. Note: maxOccurs is a shared schema
     * element and needs to be unbounded for AddMemberMessagesAAQToBidder.
     * For AddMemberMessageRTQ, this field is mandatory if ItemID is not in the request.
     * For all other uses, there can only be one RecipientID.
     * 
     *
     * @param java.util.List<java.lang.String>
	 */
	public void setRecipientID(List<String> recipientID) {
	    this.recipientID = recipientID;
	}
	/**
     * public getter
     *
     * 
     * Subject of this email message.
     * 
     *
     * @returns java.lang.String
	 */
	public String getSubject() {
	    return this.subject;
	}
	
	/**
	 * public setter
	 *
     * 
     * Subject of this email message.
     * 
     *
     * @param java.lang.String
	 */
	public void setSubject(String subject) {
	    this.subject = subject;
	}
	/**
     * public getter
     *
     * 
     * The content of the message is input into this string field. HTML formatting is not
     * allowed in the body of the message. If plain HTML is used, an error occurs and the 
     * message will not go through. If encoded HTML is used, the message may go through but 
     * the formatting will not be successful, and the recipient of the message will just 
     * see the HTML formatting tags.
     * 
     *
     * @returns java.lang.String
	 */
	public String getBody() {
	    return this.body;
	}
	
	/**
	 * public setter
	 *
     * 
     * The content of the message is input into this string field. HTML formatting is not
     * allowed in the body of the message. If plain HTML is used, an error occurs and the 
     * message will not go through. If encoded HTML is used, the message may go through but 
     * the formatting will not be successful, and the recipient of the message will just 
     * see the HTML formatting tags.
     * 
     *
     * @param java.lang.String
	 */
	public void setBody(String body) {
	    this.body = body;
	}
	/**
     * public getter
     *
     * 
     * An ID that uniquely identifies a message for a given
     * user.
     * <br><br>
     * This value is not the same as the value used for the
     * GetMyMessages MessageID. However, this MessageID value can be
     * used as the GetMyMessages ExternalID.
     * 
     *
     * @returns java.lang.String
	 */
	public String getMessageID() {
	    return this.messageID;
	}
	
	/**
	 * public setter
	 *
     * 
     * An ID that uniquely identifies a message for a given
     * user.
     * <br><br>
     * This value is not the same as the value used for the
     * GetMyMessages MessageID. However, this MessageID value can be
     * used as the GetMyMessages ExternalID.
     * 
     *
     * @param java.lang.String
	 */
	public void setMessageID(String messageID) {
	    this.messageID = messageID;
	}
	/**
     * public getter
     *
     * 
     * ID number of the question this message is responding to.
     * 
     *
     * @returns java.lang.String
	 */
	public String getParentMessageID() {
	    return this.parentMessageID;
	}
	
	/**
	 * public setter
	 *
     * 
     * ID number of the question this message is responding to.
     * 
     *
     * @param java.lang.String
	 */
	public void setParentMessageID(String parentMessageID) {
	    this.parentMessageID = parentMessageID;
	}

}