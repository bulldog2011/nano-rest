// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package ebay.apis.eblbasecomponents;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;
import java.util.Date;

/**
 * 
 * A product review written by an eBay member.
 * 
 */
public class ReviewType implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element(name = "URL")
	private String url;
	
	@Element(name = "Title")
	private String title;
	
	@Element(name = "Rating")
	private Integer rating;
	
	@Element(name = "Text")
	private String text;
	
	@Element(name = "UserID")
	private String userID;
	
	@Element(name = "CreationTime")
	private Date creationTime;
	
    
	/**
     * public getter
     *
     * 
     * A link to the full review on the eBay Web site.
     * This URL optimized for natural search: "_W0QQ" is like "?"
     * (question mark), "QQ" is like "&" (ampersand),
     * and "Z" is like "=" (equals sign).<br>
     * <br>
     * <span class="tablenote"><b>Note:</b>
     * For a link to all reviews for the product, remove the upvr parameter
     * from this URL. See the eBay Web Services guide for an example.
     * </span>
     * 
     *
     * @returns java.lang.String
	 */
	public String getUrl() {
	    return this.url;
	}
	
	/**
	 * public setter
	 *
     * 
     * A link to the full review on the eBay Web site.
     * This URL optimized for natural search: "_W0QQ" is like "?"
     * (question mark), "QQ" is like "&" (ampersand),
     * and "Z" is like "=" (equals sign).<br>
     * <br>
     * <span class="tablenote"><b>Note:</b>
     * For a link to all reviews for the product, remove the upvr parameter
     * from this URL. See the eBay Web Services guide for an example.
     * </span>
     * 
     *
     * @param java.lang.String
	 */
	public void setUrl(String url) {
	    this.url = url;
	}
	/**
     * public getter
     *
     * 
     * The title of the review.
     * 
     *
     * @returns java.lang.String
	 */
	public String getTitle() {
	    return this.title;
	}
	
	/**
	 * public setter
	 *
     * 
     * The title of the review.
     * 
     *
     * @param java.lang.String
	 */
	public void setTitle(String title) {
	    this.title = title;
	}
	/**
     * public getter
     *
     * 
     * The eBay member's rating of the product.
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
     * The eBay member's rating of the product.
     * 
     *
     * @param java.lang.Integer
	 */
	public void setRating(Integer rating) {
	    this.rating = rating;
	}
	/**
     * public getter
     *
     * 
     * The text of the review. If the review is longer than
     * 2000 characters, the text is cut off and it ends with "...".
     * See Review.URL for a link to the full text of the review.
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
     * The text of the review. If the review is longer than
     * 2000 characters, the text is cut off and it ends with "...".
     * See Review.URL for a link to the full text of the review.
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
     * The reviewer's eBay user ID.
     * 
     *
     * @returns java.lang.String
	 */
	public String getUserID() {
	    return this.userID;
	}
	
	/**
	 * public setter
	 *
     * 
     * The reviewer's eBay user ID.
     * 
     *
     * @param java.lang.String
	 */
	public void setUserID(String userID) {
	    this.userID = userID;
	}
	/**
     * public getter
     *
     * 
     * The time and date when the reviewer posted the review.
     * 
     *
     * @returns java.util.Date
	 */
	public Date getCreationTime() {
	    return this.creationTime;
	}
	
	/**
	 * public setter
	 *
     * 
     * The time and date when the reviewer posted the review.
     * 
     *
     * @param java.util.Date
	 */
	public void setCreationTime(Date creationTime) {
	    this.creationTime = creationTime;
	}

}