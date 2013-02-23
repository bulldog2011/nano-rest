// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package ebay.apis.eblbasecomponents;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;

/**
 * 
 * Specifies 1 year feedback metrics as buyer.
 * 
 */
public class BuyerRoleMetricsType implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element(name = "PositiveFeedbackLeftCount")
	private Integer positiveFeedbackLeftCount;
	
	@Element(name = "NegativeFeedbackLeftCount")
	private Integer negativeFeedbackLeftCount;
	
	@Element(name = "NeutralFeedbackLeftCount")
	private Integer neutralFeedbackLeftCount;
	
	@Element(name = "FeedbackLeftPercent")
	private Float feedbackLeftPercent;
	
    
	/**
     * public getter
     *
     * 
     * Count of positive feedback entries given as a buyer.
     * 
     *
     * @returns java.lang.Integer
	 */
	public Integer getPositiveFeedbackLeftCount() {
	    return this.positiveFeedbackLeftCount;
	}
	
	/**
	 * public setter
	 *
     * 
     * Count of positive feedback entries given as a buyer.
     * 
     *
     * @param java.lang.Integer
	 */
	public void setPositiveFeedbackLeftCount(Integer positiveFeedbackLeftCount) {
	    this.positiveFeedbackLeftCount = positiveFeedbackLeftCount;
	}
	/**
     * public getter
     *
     * 
     * Count of negative feedback entries given as a buyer.
     * 
     *
     * @returns java.lang.Integer
	 */
	public Integer getNegativeFeedbackLeftCount() {
	    return this.negativeFeedbackLeftCount;
	}
	
	/**
	 * public setter
	 *
     * 
     * Count of negative feedback entries given as a buyer.
     * 
     *
     * @param java.lang.Integer
	 */
	public void setNegativeFeedbackLeftCount(Integer negativeFeedbackLeftCount) {
	    this.negativeFeedbackLeftCount = negativeFeedbackLeftCount;
	}
	/**
     * public getter
     *
     * 
     * Count of neutral feedback entries given as a buyer.
     * 
     *
     * @returns java.lang.Integer
	 */
	public Integer getNeutralFeedbackLeftCount() {
	    return this.neutralFeedbackLeftCount;
	}
	
	/**
	 * public setter
	 *
     * 
     * Count of neutral feedback entries given as a buyer.
     * 
     *
     * @param java.lang.Integer
	 */
	public void setNeutralFeedbackLeftCount(Integer neutralFeedbackLeftCount) {
	    this.neutralFeedbackLeftCount = neutralFeedbackLeftCount;
	}
	/**
     * public getter
     *
     * 
     * Percentage of leaving feedback as a buyer.
     * 
     *
     * @returns java.lang.Float
	 */
	public Float getFeedbackLeftPercent() {
	    return this.feedbackLeftPercent;
	}
	
	/**
	 * public setter
	 *
     * 
     * Percentage of leaving feedback as a buyer.
     * 
     *
     * @param java.lang.Float
	 */
	public void setFeedbackLeftPercent(Float feedbackLeftPercent) {
	    this.feedbackLeftPercent = feedbackLeftPercent;
	}

}