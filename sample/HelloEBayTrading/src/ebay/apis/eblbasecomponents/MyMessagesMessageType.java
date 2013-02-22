// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package ebay.apis.eblbasecomponents;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;
import java.util.Date;

/**
 * 
 * Contains the message information for each message specified in
 * MessageIDs. The amount and type of information returned varies based on
 * the requested detail level.
 * 
 */
public class MyMessagesMessageType implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element(name = "Sender")
	private String sender;
	
	@Element(name = "RecipientUserID")
	private String recipientUserID;
	
	@Element(name = "SendToName")
	private String sendToName;
	
	@Element(name = "Subject")
	private String subject;
	
	@Element(name = "MessageID")
	private String messageID;
	
	@Element(name = "ExternalMessageID")
	private String externalMessageID;
	
	@Element(name = "ContentType")
	private String contentType;
	
	@Element(name = "Text")
	private String text;
	
	@Element(name = "Flagged")
	private Boolean flagged;
	
	@Element(name = "Read")
	private Boolean read;
	
	@Element(name = "CreationDate")
	private Date creationDate;
	
	@Element(name = "ReceiveDate")
	private Date receiveDate;
	
	@Element(name = "ExpirationDate")
	private Date expirationDate;
	
	@Element(name = "ItemID")
	private String itemID;
	
	@Element(name = "ResponseDetails")
	private MyMessagesResponseDetailsType responseDetails;
	
	@Element(name = "ForwardDetails")
	private MyMessagesForwardDetailsType forwardDetails;
	
	@Element(name = "Folder")
	private MyMessagesFolderType folder;
	
	@Element(name = "Content")
	private String content;
	
	@Element(name = "MessageType")
	private MessageTypeCodeType messageType;
	
	@Element(name = "ListingStatus")
	private ListingStatusCodeType listingStatus;
	
	@Element(name = "QuestionType")
	private QuestionTypeCodeType questionType;
	
	@Element(name = "Replied")
	private Boolean replied;
	
	@Element(name = "HighPriority")
	private Boolean highPriority;
	
	@Element(name = "ItemEndTime")
	private Date itemEndTime;
	
	@Element(name = "ItemTitle")
	private String itemTitle;
	
    
	/**
     * public getter
     *
     * 
     * The display name of the eBay user that sent the message.
     * 
     *
     * @returns java.lang.String
	 */
	public String getSender() {
	    return this.sender;
	}
	
	/**
	 * public setter
	 *
     * 
     * The display name of the eBay user that sent the message.
     * 
     *
     * @param java.lang.String
	 */
	public void setSender(String sender) {
	    this.sender = sender;
	}
	/**
     * public getter
     *
     * 
     * The displayable user ID of the recipient.
     * 
     *
     * @returns java.lang.String
	 */
	public String getRecipientUserID() {
	    return this.recipientUserID;
	}
	
	/**
	 * public setter
	 *
     * 
     * The displayable user ID of the recipient.
     * 
     *
     * @param java.lang.String
	 */
	public void setRecipientUserID(String recipientUserID) {
	    this.recipientUserID = recipientUserID;
	}
	/**
     * public getter
     *
     * 
     * The displayable name of the user or eBay
     * application to which the message is sent. Only
     * returned for M2M, and if a value exists.
     * 
     *
     * @returns java.lang.String
	 */
	public String getSendToName() {
	    return this.sendToName;
	}
	
	/**
	 * public setter
	 *
     * 
     * The displayable name of the user or eBay
     * application to which the message is sent. Only
     * returned for M2M, and if a value exists.
     * 
     *
     * @param java.lang.String
	 */
	public void setSendToName(String sendToName) {
	    this.sendToName = sendToName;
	}
	/**
     * public getter
     *
     * 
     * The subject of the message.
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
     * The subject of the message.
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
     * An ID that uniquely identifies a message for a given user.
     * <br/>
     * <br/>
     * This value is not the same as the value used for the
     * GetMemberMessages MessageID. Use the GetMemberMessages value
     * (used as the GetMyMessages ExternalID) instead.
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
     * An ID that uniquely identifies a message for a given user.
     * <br/>
     * <br/>
     * This value is not the same as the value used for the
     * GetMemberMessages MessageID. Use the GetMemberMessages value
     * (used as the GetMyMessages ExternalID) instead.
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
     * An ID used by an external application to uniquely identify a
     * message. Returned only when specified by the external
     * application on message creation.
     * <br><br>
     * This value is equivalent to the value used for MessageID in
     * GetMemberMessages.
     * 
     *
     * @returns java.lang.String
	 */
	public String getExternalMessageID() {
	    return this.externalMessageID;
	}
	
	/**
	 * public setter
	 *
     * 
     * An ID used by an external application to uniquely identify a
     * message. Returned only when specified by the external
     * application on message creation.
     * <br><br>
     * This value is equivalent to the value used for MessageID in
     * GetMemberMessages.
     * 
     *
     * @param java.lang.String
	 */
	public void setExternalMessageID(String externalMessageID) {
	    this.externalMessageID = externalMessageID;
	}
	/**
     * public getter
     *
     * 
     * The content type of the body text. The three acceptable values
     * are "TEXT", "HTML",  and "XML" (case sensitive).
     * 
     *
     * @returns java.lang.String
	 */
	public String getContentType() {
	    return this.contentType;
	}
	
	/**
	 * public setter
	 *
     * 
     * The content type of the body text. The three acceptable values
     * are "TEXT", "HTML",  and "XML" (case sensitive).
     * 
     *
     * @param java.lang.String
	 */
	public void setContentType(String contentType) {
	    this.contentType = contentType;
	}
	/**
     * public getter
     *
     * 
     * This field contains message content, and
     * can contain a threaded message.
     * This field can contain plain text or HTML,
     * depending on the format of the original message.
     * The API does not check the email-format preferences
     * in My Messages on the eBay Web site.
     * 
     *
     * @returns java.lang.String
	 */
	public String getText() {
	    return this.text;
	}
	
	/**
	 * public setter
	 *
     * 
     * This field contains message content, and
     * can contain a threaded message.
     * This field can contain plain text or HTML,
     * depending on the format of the original message.
     * The API does not check the email-format preferences
     * in My Messages on the eBay Web site.
     * 
     *
     * @param java.lang.String
	 */
	public void setText(String text) {
	    this.text = text;
	}
	/**
     * public getter
     *
     * 
     * When the Flagged field is true,
     * it means the message is displayed with a flag in the seller's
     * My Messages mailbox on eBay.
     * It is strongly recommended that the seller act on the message by the
     * specified date (or within 60 days, if not specified).
     * 
     *
     * @returns java.lang.Boolean
	 */
	public Boolean getFlagged() {
	    return this.flagged;
	}
	
	/**
	 * public setter
	 *
     * 
     * When the Flagged field is true,
     * it means the message is displayed with a flag in the seller's
     * My Messages mailbox on eBay.
     * It is strongly recommended that the seller act on the message by the
     * specified date (or within 60 days, if not specified).
     * 
     *
     * @param java.lang.Boolean
	 */
	public void setFlagged(Boolean flagged) {
	    this.flagged = flagged;
	}
	/**
     * public getter
     *
     * 
     * Whether or not a message has been viewed by a given user. Note that retrieving
     * a message with the API does not mark it as read.
     * 
     *
     * @returns java.lang.Boolean
	 */
	public Boolean getRead() {
	    return this.read;
	}
	
	/**
	 * public setter
	 *
     * 
     * Whether or not a message has been viewed by a given user. Note that retrieving
     * a message with the API does not mark it as read.
     * 
     *
     * @param java.lang.Boolean
	 */
	public void setRead(Boolean read) {
	    this.read = read;
	}
	/**
     * public getter
     *
     * 
     * The date and time that a message was created by the sender.
     * 
     *
     * @returns java.util.Date
	 */
	public Date getCreationDate() {
	    return this.creationDate;
	}
	
	/**
	 * public setter
	 *
     * 
     * The date and time that a message was created by the sender.
     * 
     *
     * @param java.util.Date
	 */
	public void setCreationDate(Date creationDate) {
	    this.creationDate = creationDate;
	}
	/**
     * public getter
     *
     * 
     * The date and time that a message was received by My Messages and stored in a
     * database for the recipient.
     * 
     *
     * @returns java.util.Date
	 */
	public Date getReceiveDate() {
	    return this.receiveDate;
	}
	
	/**
	 * public setter
	 *
     * 
     * The date and time that a message was received by My Messages and stored in a
     * database for the recipient.
     * 
     *
     * @param java.util.Date
	 */
	public void setReceiveDate(Date receiveDate) {
	    this.receiveDate = receiveDate;
	}
	/**
     * public getter
     *
     * 
     * The date and time at which a message expires.
     * 
     *
     * @returns java.util.Date
	 */
	public Date getExpirationDate() {
	    return this.expirationDate;
	}
	
	/**
	 * public setter
	 *
     * 
     * The date and time at which a message expires.
     * 
     *
     * @param java.util.Date
	 */
	public void setExpirationDate(Date expirationDate) {
	    this.expirationDate = expirationDate;
	}
	/**
     * public getter
     *
     * 
     * The unique item ID. Not returned
     * for messages that haven't been associated with a specific item.
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
     * The unique item ID. Not returned
     * for messages that haven't been associated with a specific item.
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
     * Details relating to the response to a message.
     * 
     *
     * @returns ebay.apis.eblbasecomponents.MyMessagesResponseDetailsType
	 */
	public MyMessagesResponseDetailsType getResponseDetails() {
	    return this.responseDetails;
	}
	
	/**
	 * public setter
	 *
     * 
     * Details relating to the response to a message.
     * 
     *
     * @param ebay.apis.eblbasecomponents.MyMessagesResponseDetailsType
	 */
	public void setResponseDetails(MyMessagesResponseDetailsType responseDetails) {
	    this.responseDetails = responseDetails;
	}
	/**
     * public getter
     *
     * 
     * Details relating to the forwarding of a
     * message. Only returned if the message is
     * forwarded.
     * 
     *
     * @returns ebay.apis.eblbasecomponents.MyMessagesForwardDetailsType
	 */
	public MyMessagesForwardDetailsType getForwardDetails() {
	    return this.forwardDetails;
	}
	
	/**
	 * public setter
	 *
     * 
     * Details relating to the forwarding of a
     * message. Only returned if the message is
     * forwarded.
     * 
     *
     * @param ebay.apis.eblbasecomponents.MyMessagesForwardDetailsType
	 */
	public void setForwardDetails(MyMessagesForwardDetailsType forwardDetails) {
	    this.forwardDetails = forwardDetails;
	}
	/**
     * public getter
     *
     * 
     * Details relating to a My Messages folder.
     * 
     *
     * @returns ebay.apis.eblbasecomponents.MyMessagesFolderType
	 */
	public MyMessagesFolderType getFolder() {
	    return this.folder;
	}
	
	/**
	 * public setter
	 *
     * 
     * Details relating to a My Messages folder.
     * 
     *
     * @param ebay.apis.eblbasecomponents.MyMessagesFolderType
	 */
	public void setFolder(MyMessagesFolderType folder) {
	    this.folder = folder;
	}
	/**
     * public getter
     *
     * 
     * The message body in plain text format. The message body is displayed in plain text
     * even if the eBay user's Preferred Email Format preference on My eBay is set to HTML.
     * Graphics and text formatting are dropped if the eBay user's preference is set to
     * HTML.
     * 
     *
     * @returns java.lang.String
	 */
	public String getContent() {
	    return this.content;
	}
	
	/**
	 * public setter
	 *
     * 
     * The message body in plain text format. The message body is displayed in plain text
     * even if the eBay user's Preferred Email Format preference on My eBay is set to HTML.
     * Graphics and text formatting are dropped if the eBay user's preference is set to
     * HTML.
     * 
     *
     * @param java.lang.String
	 */
	public void setContent(String content) {
	    this.content = content;
	}
	/**
     * public getter
     *
     * 
     * Currently available on the US site. Specifies the type of message being retrieved
     * through GetMyMessages.
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
     * Currently available on the US site. Specifies the type of message being retrieved
     * through GetMyMessages.
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
     * Specifies an active or ended listing's status in eBay's processing workflow.
     * If a listing ends with a sale (or sales), eBay needs to update the sale
     * details (e.g., total price and buyer/high bidder) and the final value fee.
     * This processing can take several minutes. If you retrieve a sold item and no
     * details about the buyer/high bidder are returned or no final value fee is
     * available, use this listing status information to determine whether eBay has
     * finished processing the listing.
     * <br><br> <span class="tablenote"><b>Note:</b>
     * For GetMyMessages, the listing status reflects the status of the listing at the time
     * the question was created. The listing status for this call must not match the listing
     * status returned by other calls (such as GetItemTransactions). This is returned only if
     * Messages.Message.MessageType is AskSellerQuestion. This tag is no longer returned
     * in the Sandbox environment.
     * </span>
     * 
     *
     * @returns ebay.apis.eblbasecomponents.ListingStatusCodeType
	 */
	public ListingStatusCodeType getListingStatus() {
	    return this.listingStatus;
	}
	
	/**
	 * public setter
	 *
     * 
     * Specifies an active or ended listing's status in eBay's processing workflow.
     * If a listing ends with a sale (or sales), eBay needs to update the sale
     * details (e.g., total price and buyer/high bidder) and the final value fee.
     * This processing can take several minutes. If you retrieve a sold item and no
     * details about the buyer/high bidder are returned or no final value fee is
     * available, use this listing status information to determine whether eBay has
     * finished processing the listing.
     * <br><br> <span class="tablenote"><b>Note:</b>
     * For GetMyMessages, the listing status reflects the status of the listing at the time
     * the question was created. The listing status for this call must not match the listing
     * status returned by other calls (such as GetItemTransactions). This is returned only if
     * Messages.Message.MessageType is AskSellerQuestion. This tag is no longer returned
     * in the Sandbox environment.
     * </span>
     * 
     *
     * @param ebay.apis.eblbasecomponents.ListingStatusCodeType
	 */
	public void setListingStatus(ListingStatusCodeType listingStatus) {
	    this.listingStatus = listingStatus;
	}
	/**
     * public getter
     *
     * 
     * Currently available on the US site. Specifies the context of the question.
     * Corresponds to the message subject. Applies if Messages.Message.MessageType is
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
     * Currently available on the US site. Specifies the context of the question.
     * Corresponds to the message subject. Applies if Messages.Message.MessageType is
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
     * Whether or not a message has been replied.
     * 
     *
     * @returns java.lang.Boolean
	 */
	public Boolean getReplied() {
	    return this.replied;
	}
	
	/**
	 * public setter
	 *
     * 
     * Whether or not a message has been replied.
     * 
     *
     * @param java.lang.Boolean
	 */
	public void setReplied(Boolean replied) {
	    this.replied = replied;
	}
	/**
     * public getter
     *
     * 
     * Set this boolean to true to mark the message as a high-priority message.
     * 
     *
     * @returns java.lang.Boolean
	 */
	public Boolean getHighPriority() {
	    return this.highPriority;
	}
	
	/**
	 * public setter
	 *
     * 
     * Set this boolean to true to mark the message as a high-priority message.
     * 
     *
     * @param java.lang.Boolean
	 */
	public void setHighPriority(Boolean highPriority) {
	    this.highPriority = highPriority;
	}
	/**
     * public getter
     *
     * 
     * The  date and time for the ended item
     * 
     *
     * @returns java.util.Date
	 */
	public Date getItemEndTime() {
	    return this.itemEndTime;
	}
	
	/**
	 * public setter
	 *
     * 
     * The  date and time for the ended item
     * 
     *
     * @param java.util.Date
	 */
	public void setItemEndTime(Date itemEndTime) {
	    this.itemEndTime = itemEndTime;
	}
	/**
     * public getter
     *
     * 
     * The title of the item listing.
     * <br><br>
     * <span class="tablenote"><b>Note:</b>
     * The maximum length of an eBay Item Title is increasing to 80 characters in
     * Version 735.
     * </span>
     * 
     *
     * @returns java.lang.String
	 */
	public String getItemTitle() {
	    return this.itemTitle;
	}
	
	/**
	 * public setter
	 *
     * 
     * The title of the item listing.
     * <br><br>
     * <span class="tablenote"><b>Note:</b>
     * The maximum length of an eBay Item Title is increasing to 80 characters in
     * Version 735.
     * </span>
     * 
     *
     * @param java.lang.String
	 */
	public void setItemTitle(String itemTitle) {
	    this.itemTitle = itemTitle;
	}

}