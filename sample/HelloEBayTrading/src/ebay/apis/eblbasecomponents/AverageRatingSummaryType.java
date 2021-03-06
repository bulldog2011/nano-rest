// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package ebay.apis.eblbasecomponents;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;
import java.util.List;

/**
 *  
 * Container for average detailed seller ratings.
 * If a seller has detailed ratings, they are displayed
 * in the Feedback Profile of the seller.
 * 
 */
public class AverageRatingSummaryType implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element(name = "FeedbackSummaryPeriod")
	private FeedbackSummaryPeriodCodeType feedbackSummaryPeriod;
	
	@Element(name = "AverageRatingDetails")
	private List<AverageRatingDetailsType> averageRatingDetails;
	
    
	/**
     * public getter
     *
     * 
     * The summary period for which the detail ratings are calculated.
     * 
     *
     * @returns ebay.apis.eblbasecomponents.FeedbackSummaryPeriodCodeType
	 */
	public FeedbackSummaryPeriodCodeType getFeedbackSummaryPeriod() {
	    return this.feedbackSummaryPeriod;
	}
	
	/**
	 * public setter
	 *
     * 
     * The summary period for which the detail ratings are calculated.
     * 
     *
     * @param ebay.apis.eblbasecomponents.FeedbackSummaryPeriodCodeType
	 */
	public void setFeedbackSummaryPeriod(FeedbackSummaryPeriodCodeType feedbackSummaryPeriod) {
	    this.feedbackSummaryPeriod = feedbackSummaryPeriod;
	}
	/**
     * public getter
     *
     * 
     * Applicable to sites that support the Detailed Seller Ratings feature.
     * The AverageRatingDetails container has information about
     * average detailed seller ratings.
     * When buyers leave an overall Feedback rating (positive, neutral, or negative) for a seller, they also can leave ratings in four areas: item as described, communication, shipping time, and charges for shipping and handling. Users retrieve detailed ratings as averages of the ratings left by buyers. 
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
     * Applicable to sites that support the Detailed Seller Ratings feature.
     * The AverageRatingDetails container has information about
     * average detailed seller ratings.
     * When buyers leave an overall Feedback rating (positive, neutral, or negative) for a seller, they also can leave ratings in four areas: item as described, communication, shipping time, and charges for shipping and handling. Users retrieve detailed ratings as averages of the ratings left by buyers. 
     * 
     *
     * @param java.util.List<ebay.apis.eblbasecomponents.AverageRatingDetailsType>
	 */
	public void setAverageRatingDetails(List<AverageRatingDetailsType> averageRatingDetails) {
	    this.averageRatingDetails = averageRatingDetails;
	}

}