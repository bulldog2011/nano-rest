// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package ebay.apis.eblbasecomponents;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;

/**
 *  
 * Applicable to sites that support the Detailed Seller Ratings feature.
 * The ItemRatingDetailsType contains detailed seller ratings for an order line item in one area. When buyers leave an overall Feedback rating (positive, neutral, or negative) for a seller, they also can leave ratings in four areas: item as described, communication, shipping time, and charges for shipping and handling. Users retrieve detailed ratings as averages of the ratings left by buyers. 
 * 
 */
public class ItemRatingDetailsType implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element(name = "RatingDetail")
	private FeedbackRatingDetailCodeType ratingDetail;
	
	@Element(name = "Rating")
	private Integer rating;
	
    
	/**
     * public getter
     *
     * 
     * The area of a specific detailed seller rating for an order line item.
     * When buyers leave an overall Feedback rating (positive, neutral, or negative)
     * for a seller, they also can leave ratings in four areas: item as described,
     * communication, shipping time, and charges for shipping and handling. 
     * 
     *
     * @returns ebay.apis.eblbasecomponents.FeedbackRatingDetailCodeType
	 */
	public FeedbackRatingDetailCodeType getRatingDetail() {
	    return this.ratingDetail;
	}
	
	/**
	 * public setter
	 *
     * 
     * The area of a specific detailed seller rating for an order line item.
     * When buyers leave an overall Feedback rating (positive, neutral, or negative)
     * for a seller, they also can leave ratings in four areas: item as described,
     * communication, shipping time, and charges for shipping and handling. 
     * 
     *
     * @param ebay.apis.eblbasecomponents.FeedbackRatingDetailCodeType
	 */
	public void setRatingDetail(FeedbackRatingDetailCodeType ratingDetail) {
	    this.ratingDetail = ratingDetail;
	}
	/**
     * public getter
     *
     *  
     * A detailed seller rating for an order line item applied to the area
     * in the corresponding RatingDetail field. Valid input values are
     * numerical integers 1 though 5.
     * 
     *
     * @returns java.lang.Integer
	 */
	public Integer getRating() {
	    return this.rating;
	}
	
	/**
	 * public setter
	 *
     *  
     * A detailed seller rating for an order line item applied to the area
     * in the corresponding RatingDetail field. Valid input values are
     * numerical integers 1 though 5.
     * 
     *
     * @param java.lang.Integer
	 */
	public void setRating(Integer rating) {
	    this.rating = rating;
	}

}