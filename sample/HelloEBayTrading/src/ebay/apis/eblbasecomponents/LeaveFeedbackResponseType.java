// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package ebay.apis.eblbasecomponents;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;

/**
 * 
 *           LeaveFeedback response message includes an acknowledgement if the
 *           feedback was successfully left.
 * 
 */
@RootElement(name = "LeaveFeedbackResponse", namespace = "urn:ebay:apis:eBLBaseComponents")
public class LeaveFeedbackResponseType extends AbstractResponseType implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element(name = "FeedbackID")
	private String feedbackID;
	
    
	/**
     * public getter
     *
     * 
     * The ID of the feedback that has been left.
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
     * The ID of the feedback that has been left.
     * 
     *
     * @param java.lang.String
	 */
	public void setFeedbackID(String feedbackID) {
	    this.feedbackID = feedbackID;
	}

}