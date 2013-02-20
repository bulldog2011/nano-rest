// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package ebay.apis.eblbasecomponents;

import com.leansoft.nano.annotation.*;
import java.util.List;
import java.util.Date;

/**
 * 
 * Information that identifies a buying guide. A buying guide provides content about particular
 * product areas, categories, or subjects to help buyers decide which type of item
 * to purchase based on their particular interests.
 * Buying guides are useful to buyers who do not have a specific product in mind.
 * For example, a digital camera buying guide could help a buyer determine what kind of
 * digital camera is right for them.
 * 
 */
public class BuyingGuideType   {

	@Element(name = "Name")
	private String name;
    
	@Element(name = "URL")
	private String url;
    
	@Element(name = "CategoryID")
	private String categoryID;
    
	@Element(name = "Title")
	private String title;
    
	@Element(name = "Text")
	private String text;
    
	@Element(name = "CreationTime")
	private Date creationTime;
    
	@Element(name = "UserID")
	private String userID;
    
	private List<Object> any;
    
    
	/**
     * public getter
     *
     * 
     * Display name of the buying guide. <br>
     * <br>
     * FindReviewsAndGuides only returns 20 characters, followed by "..." if the name is
     * longer than 20 characters. For the full title, see BuyingGuide.Title
     * instead.
     * 
     *
     * @returns java.lang.String
	 */
	public String getName() {
	    return this.name;
	}
	
	/**
	 * public setter
	 *
     * 
     * Display name of the buying guide. <br>
     * <br>
     * FindReviewsAndGuides only returns 20 characters, followed by "..." if the name is
     * longer than 20 characters. For the full title, see BuyingGuide.Title
     * instead.
     * 
     *
     * @param java.lang.String
	 */
	public void setName(String name) {
	    this.name = name;
	}
	/**
     * public getter
     *
     * 
     * URL for the buying guide. Your application can
     * present this as a link. Use the value of Name or Title as the link's display name.
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
     * URL for the buying guide. Your application can
     * present this as a link. Use the value of Name or Title as the link's display name.
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
     * Identifies the category (if any) that is associated
     * with the buying guide. For FindReviewsAndGuides, this can be a category that is higher or lower in the hierarchy
     * than the category specified in the request. For a matching categories search,
     * you can use this information to determine the order that the buying guides are
     * returned in when multiple guides are found.
     * Optionally, you can use this information to determine where to present
     * the buying guide link in your application.
     * 
     *
     * @returns java.lang.String
	 */
	public String getCategoryID() {
	    return this.categoryID;
	}
	
	/**
	 * public setter
	 *
     * 
     * Identifies the category (if any) that is associated
     * with the buying guide. For FindReviewsAndGuides, this can be a category that is higher or lower in the hierarchy
     * than the category specified in the request. For a matching categories search,
     * you can use this information to determine the order that the buying guides are
     * returned in when multiple guides are found.
     * Optionally, you can use this information to determine where to present
     * the buying guide link in your application.
     * 
     *
     * @param java.lang.String
	 */
	public void setCategoryID(String categoryID) {
	    this.categoryID = categoryID;
	}
	/**
     * public getter
     *
     * 
     * The title of the buying guide.
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
     * The title of the buying guide.
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
     * The text of the guide. If the guide is longer than
     * 2000 characters, the text is cut off and it ends with "...".
     * See BuyingGuide.URL for a link to the full text of the review.
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
     * The text of the guide. If the guide is longer than
     * 2000 characters, the text is cut off and it ends with "...".
     * See BuyingGuide.URL for a link to the full text of the review.
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
     * The time and date when the guide was posted.
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
     * The time and date when the guide was posted.
     *    
     *
     * @param java.util.Date
	 */
	public void setCreationTime(Date creationTime) {
	    this.creationTime = creationTime;
	}
	/**
     * public getter
     *
     * 
     * The author's eBay user ID.
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
     * The author's eBay user ID.
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
     * @returns java.util.List<java.lang.Object>
	 */
	public List<Object> getAny() {
	    return this.any;
	}
	
	/**
	 * public setter
	 *
     * @param java.util.List<java.lang.Object>
	 */
	public void setAny(List<Object> any) {
	    this.any = any;
	}

}