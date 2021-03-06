// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package ebay.apis.eblbasecomponents;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;
import java.util.List;

/**
 * 
 * Response to GetUserProfile request.
 * 
 */
@RootElement(name = "GetUserProfileResponse", namespace = "urn:ebay:apis:eBLBaseComponents")
public class GetUserProfileResponseType extends AbstractResponseType implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element(name = "User")
	private SimpleUserType user;
	
	@Element(name = "FeedbackHistory")
	private FeedbackHistoryType feedbackHistory;
	
	@Element(name = "FeedbackDetails")
	private List<FeedbackDetailType> feedbackDetails;
	
    
	/**
     * public getter
     *
     * 
     * Contains the returned user data for the specified eBay user.
     * 
     *
     * @returns ebay.apis.eblbasecomponents.SimpleUserType
	 */
	public SimpleUserType getUser() {
	    return this.user;
	}
	
	/**
	 * public setter
	 *
     * 
     * Contains the returned user data for the specified eBay user.
     * 
     *
     * @param ebay.apis.eblbasecomponents.SimpleUserType
	 */
	public void setUser(SimpleUserType user) {
	    this.user = user;
	}
	/**
     * public getter
     *
     * 
     * Summary feedback data for a user. Contains counts of positive, neutral,
     * and negative feedback for predefined time periods.
     * 
     *
     * @returns ebay.apis.eblbasecomponents.FeedbackHistoryType
	 */
	public FeedbackHistoryType getFeedbackHistory() {
	    return this.feedbackHistory;
	}
	
	/**
	 * public setter
	 *
     * 
     * Summary feedback data for a user. Contains counts of positive, neutral,
     * and negative feedback for predefined time periods.
     * 
     *
     * @param ebay.apis.eblbasecomponents.FeedbackHistoryType
	 */
	public void setFeedbackHistory(FeedbackHistoryType feedbackHistory) {
	    this.feedbackHistory = feedbackHistory;
	}
	/**
     * public getter
     *
     * 
     * The FeedbackDetails container has fields (ItemID, etc.) with information
     * about one feedback entry. When you call GetUserProfile, the 5 (maximum) most
     * recent feedback records are returned in FeedbackDetails containers.
     * 
     *
     * @returns java.util.List<ebay.apis.eblbasecomponents.FeedbackDetailType>
	 */
	public List<FeedbackDetailType> getFeedbackDetails() {
	    return this.feedbackDetails;
	}
	
	/**
	 * public setter
	 *
     * 
     * The FeedbackDetails container has fields (ItemID, etc.) with information
     * about one feedback entry. When you call GetUserProfile, the 5 (maximum) most
     * recent feedback records are returned in FeedbackDetails containers.
     * 
     *
     * @param java.util.List<ebay.apis.eblbasecomponents.FeedbackDetailType>
	 */
	public void setFeedbackDetails(List<FeedbackDetailType> feedbackDetails) {
	    this.feedbackDetails = feedbackDetails;
	}

}