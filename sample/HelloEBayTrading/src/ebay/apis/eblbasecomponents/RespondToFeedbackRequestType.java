// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package ebay.apis.eblbasecomponents;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;

/**
 * 
 * Used to reply to feedback that has been left for a user, or to post a
 * follow-up comment to a feedback comment the user has left for someone else.
 * 
 */
@RootElement(name = "RespondToFeedbackRequest", namespace = "urn:ebay:apis:eBLBaseComponents")
public class RespondToFeedbackRequestType extends AbstractRequestType implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element(name = "FeedbackID")
	private String feedbackID;
	
	@Element(name = "ItemID")
	private String itemID;
	
	@Element(name = "TransactionID")
	private String transactionID;
	
	@Element(name = "TargetUserID")
	private String targetUserID;
	
	@Element(name = "ResponseType")
	private FeedbackResponseCodeType responseType;
	
	@Element(name = "ResponseText")
	private String responseText;
	
	@Element(name = "OrderLineItemID")
	private String orderLineItemID;
	
    
	/**
     * public getter
     *
     * 
     * A unique identifier for a Feedback record. Buying and selling partners
     * leave feedback for one another after the completion of an order.
     * Feedback is left at the order line item (transaction) level, so a
     * Feedback comment for each line item in a Combined Payment order is
     * expected from the buyer and seller. A unique <b>FeedbackID</b> is created
     * whenever a buyer leaves feedback for a seller, and vice versa. A
     * <b>FeedbackID</b> is created by eBay when feedback is left through the eBay
     * site, or through the <b>LeaveFeedback</b> call. <b>FeedbackIDs</b> can be retrieved
     * with the <b>GetFeedback</b> call. In the <b>RespondToFeedback</b> call, <b>FeedbackID</b> can
     * be used as an input filter to respond to a specific Feedback comment.
     * Since Feedback is always linked to a unique order line item, an
     * <b>ItemID</b>/<b>TransactionID</b> pair or an <b>OrderLineItemID</b> can also be used to
     * respond to a Feedback comment.
     * 
     *
     * @returns java.lang.String
	 */
	public String getFeedbackID() {
	    return this.feedbackID;
	}
	
	/**
	 * public setter
	 *
     * 
     * A unique identifier for a Feedback record. Buying and selling partners
     * leave feedback for one another after the completion of an order.
     * Feedback is left at the order line item (transaction) level, so a
     * Feedback comment for each line item in a Combined Payment order is
     * expected from the buyer and seller. A unique <b>FeedbackID</b> is created
     * whenever a buyer leaves feedback for a seller, and vice versa. A
     * <b>FeedbackID</b> is created by eBay when feedback is left through the eBay
     * site, or through the <b>LeaveFeedback</b> call. <b>FeedbackIDs</b> can be retrieved
     * with the <b>GetFeedback</b> call. In the <b>RespondToFeedback</b> call, <b>FeedbackID</b> can
     * be used as an input filter to respond to a specific Feedback comment.
     * Since Feedback is always linked to a unique order line item, an
     * <b>ItemID</b>/<b>TransactionID</b> pair or an <b>OrderLineItemID</b> can also be used to
     * respond to a Feedback comment.
     * 
     *
     * @param java.lang.String
	 */
	public void setFeedbackID(String feedbackID) {
	    this.feedbackID = feedbackID;
	}
	/**
     * public getter
     *
     * 
     * Unique identifier for an eBay item listing. A listing can have multiple
     * order line items (transactions), but only one <b>ItemID</b>. An <b>ItemID</b> can be
     * paired up with a corresponding <b>TransactionID</b> and used as an input filter
     * to respond to a Feedback comment in the <b>RespondToFeedback</b> call. Unless
     * the specific Feedback record is identified by a <b>FeedbackID</b> or an
     * <b>OrderLineItemID</b> in the request, an <b>ItemID</b>/<b>TransactionID</b> pair is
     * required.
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
     * Unique identifier for an eBay item listing. A listing can have multiple
     * order line items (transactions), but only one <b>ItemID</b>. An <b>ItemID</b> can be
     * paired up with a corresponding <b>TransactionID</b> and used as an input filter
     * to respond to a Feedback comment in the <b>RespondToFeedback</b> call. Unless
     * the specific Feedback record is identified by a <b>FeedbackID</b> or an
     * <b>OrderLineItemID</b> in the request, an <b>ItemID</b>/<b>TransactionID</b> pair is
     * required.
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
     * Unique identifier for an eBay order line item (transaction). A
     * <b>TransactionID</b> can be paired up with its corresponding <b>ItemID</b> and used as
     * an input filter to respond to a Feedback comment in the
     * <b>RespondToFeedback</b> call. Unless the specific Feedback record is
     * identified by a <b>FeedbackID</b> or an <b>OrderLineItemID</b> in the request, an
     * <b>ItemID</b>/<b>TransactionID</b> pair is required.
     * 
     *
     * @returns java.lang.String
	 */
	public String getTransactionID() {
	    return this.transactionID;
	}
	
	/**
	 * public setter
	 *
     * 
     * Unique identifier for an eBay order line item (transaction). A
     * <b>TransactionID</b> can be paired up with its corresponding <b>ItemID</b> and used as
     * an input filter to respond to a Feedback comment in the
     * <b>RespondToFeedback</b> call. Unless the specific Feedback record is
     * identified by a <b>FeedbackID</b> or an <b>OrderLineItemID</b> in the request, an
     * <b>ItemID</b>/<b>TransactionID</b> pair is required.
     * 
     *
     * @param java.lang.String
	 */
	public void setTransactionID(String transactionID) {
	    this.transactionID = transactionID;
	}
	/**
     * public getter
     *
     * 
     * The eBay user ID of the caller's order partner. The caller is either
     * replyting to or following up on this user's Feedback comment.
     * 
     *
     * @returns java.lang.String
	 */
	public String getTargetUserID() {
	    return this.targetUserID;
	}
	
	/**
	 * public setter
	 *
     * 
     * The eBay user ID of the caller's order partner. The caller is either
     * replyting to or following up on this user's Feedback comment.
     * 
     *
     * @param java.lang.String
	 */
	public void setTargetUserID(String targetUserID) {
	    this.targetUserID = targetUserID;
	}
	/**
     * public getter
     *
     * 
     * Specifies whether the response is a reply or a follow-up to a Feedback
     * comment left by the user identified in the <b>TargetUserID</b> field.
     * 
     *
     * @returns ebay.apis.eblbasecomponents.FeedbackResponseCodeType
	 */
	public FeedbackResponseCodeType getResponseType() {
	    return this.responseType;
	}
	
	/**
	 * public setter
	 *
     * 
     * Specifies whether the response is a reply or a follow-up to a Feedback
     * comment left by the user identified in the <b>TargetUserID</b> field.
     * 
     *
     * @param ebay.apis.eblbasecomponents.FeedbackResponseCodeType
	 */
	public void setResponseType(FeedbackResponseCodeType responseType) {
	    this.responseType = responseType;
	}
	/**
     * public getter
     *
     * 
     * Textual comment that the user who is subject of feedback may leave in
     * response or rebuttal to the Feedback comment. Alternatively, when the
     * <b>ResponseType</b> is <b>FollowUp</b>, this value contains the text of the follow-up
     * comment.
     * 
     *
     * @returns java.lang.String
	 */
	public String getResponseText() {
	    return this.responseText;
	}
	
	/**
	 * public setter
	 *
     * 
     * Textual comment that the user who is subject of feedback may leave in
     * response or rebuttal to the Feedback comment. Alternatively, when the
     * <b>ResponseType</b> is <b>FollowUp</b>, this value contains the text of the follow-up
     * comment.
     * 
     *
     * @param java.lang.String
	 */
	public void setResponseText(String responseText) {
	    this.responseText = responseText;
	}
	/**
     * public getter
     *
     * 
     * <b>OrderLineItemID</b> is a unique identifier for an eBay order line item and
     * is based upon the concatenation of <b>ItemID</b> and <b>TransactionID</b>, with a
     * hyphen in between these two IDs. Since Feedback is always linked to a
     * unique order line item, an <b>OrderLineItemID</b> can be used to respond
     * to a Feedback comment.
     * <br><br>
     * Unless an <b>ItemID</b>/<b>TransactionID</b> pair or a <b>FeedbackID</b> is used to identify
     * a Feedback record, the <b>OrderLineItemID</b> must be specified.
     * <br>
     * 
     *
     * @returns java.lang.String
	 */
	public String getOrderLineItemID() {
	    return this.orderLineItemID;
	}
	
	/**
	 * public setter
	 *
     * 
     * <b>OrderLineItemID</b> is a unique identifier for an eBay order line item and
     * is based upon the concatenation of <b>ItemID</b> and <b>TransactionID</b>, with a
     * hyphen in between these two IDs. Since Feedback is always linked to a
     * unique order line item, an <b>OrderLineItemID</b> can be used to respond
     * to a Feedback comment.
     * <br><br>
     * Unless an <b>ItemID</b>/<b>TransactionID</b> pair or a <b>FeedbackID</b> is used to identify
     * a Feedback record, the <b>OrderLineItemID</b> must be specified.
     * <br>
     * 
     *
     * @param java.lang.String
	 */
	public void setOrderLineItemID(String orderLineItemID) {
	    this.orderLineItemID = orderLineItemID;
	}

}