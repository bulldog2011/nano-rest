// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package ebay.apis.eblbasecomponents;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;
import java.util.List;

/**
 * 
 * Specifies all feedback summary information (except Score). Contains
 * objects that each convey feedback counts for
 * positive, negative, neutral, and total feedback counts - for various
 * time periods each. Also conveys counts of bid retractions for the
 * predefined time periods.
 * 
 */
public class FeedbackHistoryType implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element(name = "BidRetractionFeedbackPeriods")
	private List<FeedbackPeriodType> bidRetractionFeedbackPeriods;
	
	@Element(name = "NegativeFeedbackPeriods")
	private List<FeedbackPeriodType> negativeFeedbackPeriods;
	
	@Element(name = "NeutralFeedbackPeriods")
	private List<FeedbackPeriodType> neutralFeedbackPeriods;
	
	@Element(name = "PositiveFeedbackPeriods")
	private List<FeedbackPeriodType> positiveFeedbackPeriods;
	
	@Element(name = "TotalFeedbackPeriods")
	private List<FeedbackPeriodType> totalFeedbackPeriods;
	
	@Element(name = "UniqueNegativeFeedbackCount")
	private Long uniqueNegativeFeedbackCount;
	
	@Element(name = "UniquePositiveFeedbackCount")
	private Long uniquePositiveFeedbackCount;
	
	@Element(name = "AverageRatingDetails")
	private List<AverageRatingDetailsType> averageRatingDetails;
	
	@Element(name = "NeutralCommentCountFromSuspendedUsers")
	private Long neutralCommentCountFromSuspendedUsers;
	
	@Element(name = "UniqueNeutralFeedbackCount")
	private Long uniqueNeutralFeedbackCount;
	
    
	/**
     * public getter
     *
     * 
     * Bid retractions count, for multiple predefined time periods preceding
     * the call. 
     * 
     *
     * @returns java.util.List<ebay.apis.eblbasecomponents.FeedbackPeriodType>
	 */
	public List<FeedbackPeriodType> getBidRetractionFeedbackPeriods() {
	    return this.bidRetractionFeedbackPeriods;
	}
	
	/**
	 * public setter
	 *
     * 
     * Bid retractions count, for multiple predefined time periods preceding
     * the call. 
     * 
     *
     * @param java.util.List<ebay.apis.eblbasecomponents.FeedbackPeriodType>
	 */
	public void setBidRetractionFeedbackPeriods(List<FeedbackPeriodType> bidRetractionFeedbackPeriods) {
	    this.bidRetractionFeedbackPeriods = bidRetractionFeedbackPeriods;
	}
	/**
     * public getter
     *
     * 
     * Negative feedback entries count, for multiple predefined time periods preceding
     * the call. 
     * 
     *
     * @returns java.util.List<ebay.apis.eblbasecomponents.FeedbackPeriodType>
	 */
	public List<FeedbackPeriodType> getNegativeFeedbackPeriods() {
	    return this.negativeFeedbackPeriods;
	}
	
	/**
	 * public setter
	 *
     * 
     * Negative feedback entries count, for multiple predefined time periods preceding
     * the call. 
     * 
     *
     * @param java.util.List<ebay.apis.eblbasecomponents.FeedbackPeriodType>
	 */
	public void setNegativeFeedbackPeriods(List<FeedbackPeriodType> negativeFeedbackPeriods) {
	    this.negativeFeedbackPeriods = negativeFeedbackPeriods;
	}
	/**
     * public getter
     *
     * 
     * Neutral feedback entries count, for multiple predefined time periods preceding
     * the call. 
     * 
     *
     * @returns java.util.List<ebay.apis.eblbasecomponents.FeedbackPeriodType>
	 */
	public List<FeedbackPeriodType> getNeutralFeedbackPeriods() {
	    return this.neutralFeedbackPeriods;
	}
	
	/**
	 * public setter
	 *
     * 
     * Neutral feedback entries count, for multiple predefined time periods preceding
     * the call. 
     * 
     *
     * @param java.util.List<ebay.apis.eblbasecomponents.FeedbackPeriodType>
	 */
	public void setNeutralFeedbackPeriods(List<FeedbackPeriodType> neutralFeedbackPeriods) {
	    this.neutralFeedbackPeriods = neutralFeedbackPeriods;
	}
	/**
     * public getter
     *
     * 
     * Positive feedback entries count, for multiple predefined time periods
     * preceding the call. 
     * 
     *
     * @returns java.util.List<ebay.apis.eblbasecomponents.FeedbackPeriodType>
	 */
	public List<FeedbackPeriodType> getPositiveFeedbackPeriods() {
	    return this.positiveFeedbackPeriods;
	}
	
	/**
	 * public setter
	 *
     * 
     * Positive feedback entries count, for multiple predefined time periods
     * preceding the call. 
     * 
     *
     * @param java.util.List<ebay.apis.eblbasecomponents.FeedbackPeriodType>
	 */
	public void setPositiveFeedbackPeriods(List<FeedbackPeriodType> positiveFeedbackPeriods) {
	    this.positiveFeedbackPeriods = positiveFeedbackPeriods;
	}
	/**
     * public getter
     *
     * 
     * Total feedback score, for multiple predefined time periods preceding the
     * call. 
     * 
     *
     * @returns java.util.List<ebay.apis.eblbasecomponents.FeedbackPeriodType>
	 */
	public List<FeedbackPeriodType> getTotalFeedbackPeriods() {
	    return this.totalFeedbackPeriods;
	}
	
	/**
	 * public setter
	 *
     * 
     * Total feedback score, for multiple predefined time periods preceding the
     * call. 
     * 
     *
     * @param java.util.List<ebay.apis.eblbasecomponents.FeedbackPeriodType>
	 */
	public void setTotalFeedbackPeriods(List<FeedbackPeriodType> totalFeedbackPeriods) {
	    this.totalFeedbackPeriods = totalFeedbackPeriods;
	}
	/**
     * public getter
     *
     * 
     * Total number of negative Feedback comments received by the user, including weekly repeats.
     * 
     *
     * @returns java.lang.Long
	 */
	public Long getUniqueNegativeFeedbackCount() {
	    return this.uniqueNegativeFeedbackCount;
	}
	
	/**
	 * public setter
	 *
     * 
     * Total number of negative Feedback comments received by the user, including weekly repeats.
     * 
     *
     * @param java.lang.Long
	 */
	public void setUniqueNegativeFeedbackCount(Long uniqueNegativeFeedbackCount) {
	    this.uniqueNegativeFeedbackCount = uniqueNegativeFeedbackCount;
	}
	/**
     * public getter
     *
     * 
     * Total number of positive Feedback comments received by the user, including weekly repeats.
     * 
     *
     * @returns java.lang.Long
	 */
	public Long getUniquePositiveFeedbackCount() {
	    return this.uniquePositiveFeedbackCount;
	}
	
	/**
	 * public setter
	 *
     * 
     * Total number of positive Feedback comments received by the user, including weekly repeats.
     * 
     *
     * @param java.lang.Long
	 */
	public void setUniquePositiveFeedbackCount(Long uniquePositiveFeedbackCount) {
	    this.uniquePositiveFeedbackCount = uniquePositiveFeedbackCount;
	}
	/**
     * public getter
     *
     * 
     * Container for information about detailed seller ratings (DSRs)
     * that buyers have left for a seller.
     * Sellers have access to the number of ratings they've received, as well as
     * to the averages of DSRs they've received in each
     * DSR area (i.e., to the average of ratings in the item-description area, etc.).  
     * 
     *
     * @returns java.util.List<ebay.apis.eblbasecomponents.AverageRatingDetailsType>
	 */
	public List<AverageRatingDetailsType> getAverageRatingDetails() {
	    return this.averageRatingDetails;
	}
	
	/**
	 * public setter
	 *
     * 
     * Container for information about detailed seller ratings (DSRs)
     * that buyers have left for a seller.
     * Sellers have access to the number of ratings they've received, as well as
     * to the averages of DSRs they've received in each
     * DSR area (i.e., to the average of ratings in the item-description area, etc.).  
     * 
     *
     * @param java.util.List<ebay.apis.eblbasecomponents.AverageRatingDetailsType>
	 */
	public void setAverageRatingDetails(List<AverageRatingDetailsType> averageRatingDetails) {
	    this.averageRatingDetails = averageRatingDetails;
	}
	/**
     * public getter
     *
     * 
     * Number of neutral comments received from suspended users.
     * 
     *
     * @returns java.lang.Long
	 */
	public Long getNeutralCommentCountFromSuspendedUsers() {
	    return this.neutralCommentCountFromSuspendedUsers;
	}
	
	/**
	 * public setter
	 *
     * 
     * Number of neutral comments received from suspended users.
     * 
     *
     * @param java.lang.Long
	 */
	public void setNeutralCommentCountFromSuspendedUsers(Long neutralCommentCountFromSuspendedUsers) {
	    this.neutralCommentCountFromSuspendedUsers = neutralCommentCountFromSuspendedUsers;
	}
	/**
     * public getter
     *
     * 
     * Total number of neutral Feedback comments received by the user, including weekly repeats. 
     * 
     *
     * @returns java.lang.Long
	 */
	public Long getUniqueNeutralFeedbackCount() {
	    return this.uniqueNeutralFeedbackCount;
	}
	
	/**
	 * public setter
	 *
     * 
     * Total number of neutral Feedback comments received by the user, including weekly repeats. 
     * 
     *
     * @param java.lang.Long
	 */
	public void setUniqueNeutralFeedbackCount(Long uniqueNeutralFeedbackCount) {
	    this.uniqueNeutralFeedbackCount = uniqueNeutralFeedbackCount;
	}

}