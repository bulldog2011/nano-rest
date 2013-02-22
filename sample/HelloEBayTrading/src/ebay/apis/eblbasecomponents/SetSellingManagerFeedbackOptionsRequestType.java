// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package ebay.apis.eblbasecomponents;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;

/**
 * 
 * Enables Selling Manager subscribers to store standard feedback comments that can
 * be left for their buyers. Selling Manager Pro subscribers can also specify what
 * events, if any, will trigger an automated feedback to buyers.
 * 
 */
@RootElement(name = "SetSellingManagerFeedbackOptionsRequest", namespace = "urn:ebay:apis:eBLBaseComponents")
public class SetSellingManagerFeedbackOptionsRequestType extends AbstractRequestType implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element(name = "AutomatedLeaveFeedbackEvent")
	private AutomatedLeaveFeedbackEventCodeType automatedLeaveFeedbackEvent;
	
	@Element(name = "StoredComments")
	private FeedbackCommentArrayType storedComments;
	
    
	/**
     * public getter
     *
     * 
     * Specifies the event that will trigger automated feedback to the buyer.
     * Applies to Selling Manager Pro subscribers only.
     * 
     *
     * @returns ebay.apis.eblbasecomponents.AutomatedLeaveFeedbackEventCodeType
	 */
	public AutomatedLeaveFeedbackEventCodeType getAutomatedLeaveFeedbackEvent() {
	    return this.automatedLeaveFeedbackEvent;
	}
	
	/**
	 * public setter
	 *
     * 
     * Specifies the event that will trigger automated feedback to the buyer.
     * Applies to Selling Manager Pro subscribers only.
     * 
     *
     * @param ebay.apis.eblbasecomponents.AutomatedLeaveFeedbackEventCodeType
	 */
	public void setAutomatedLeaveFeedbackEvent(AutomatedLeaveFeedbackEventCodeType automatedLeaveFeedbackEvent) {
	    this.automatedLeaveFeedbackEvent = automatedLeaveFeedbackEvent;
	}
	/**
     * public getter
     *
     * 
     * Contains a set of comments from which one can be selected to leave
     * feedback for a buyer. If automated feedback is used, a comment is
     * selected from the set randomly. Automated feedback applies to Selling
     * Manager Pro subscribers only. Stored comments cannot be replaced or
     * edited individually. Submitting a stored comments array replaces all
     * existing stored comments.
     * <br>
     * 
     *
     * @returns ebay.apis.eblbasecomponents.FeedbackCommentArrayType
	 */
	public FeedbackCommentArrayType getStoredComments() {
	    return this.storedComments;
	}
	
	/**
	 * public setter
	 *
     * 
     * Contains a set of comments from which one can be selected to leave
     * feedback for a buyer. If automated feedback is used, a comment is
     * selected from the set randomly. Automated feedback applies to Selling
     * Manager Pro subscribers only. Stored comments cannot be replaced or
     * edited individually. Submitting a stored comments array replaces all
     * existing stored comments.
     * <br>
     * 
     *
     * @param ebay.apis.eblbasecomponents.FeedbackCommentArrayType
	 */
	public void setStoredComments(FeedbackCommentArrayType storedComments) {
	    this.storedComments = storedComments;
	}

}