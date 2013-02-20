// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package ebay.apis.eblbasecomponents;

import com.leansoft.nano.annotation.*;
import java.util.List;

/**
 * 
 * Contains search word information, as it is related to a category.
 * 
 */
public class PopularSearchesType   {

	@Element(name = "CategoryID")
	private String categoryID;
    
	@Element(name = "CategoryParentID")
	private String categoryParentID;
    
	@Element(name = "QueryKeywords")
	private String queryKeywords;
    
	@Element(name = "AlternativeSearches")
	private String alternativeSearches;
    
	@Element(name = "RelatedSearches")
	private String relatedSearches;
    
	@Element(name = "CategoryName")
	private String categoryName;
    
	@Element(name = "CategoryParentName")
	private String categoryParentName;
    
	private List<Object> any;
    
    
	/**
     * public getter
     *
     * 
     * Numeric ID of a category on eBay.
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
     * Numeric ID of a category on eBay.
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
     * Category ID identifying a category that is the parent category
     * of the category indicated in the request.
     * 
     *
     * @returns java.lang.String
	 */
	public String getCategoryParentID() {
	    return this.categoryParentID;
	}
	
	/**
	 * public setter
	 *
     * 
     * Category ID identifying a category that is the parent category
     * of the category indicated in the request.
     * 
     *
     * @param java.lang.String
	 */
	public void setCategoryParentID(String categoryParentID) {
	    this.categoryParentID = categoryParentID;
	}
	/**
     * public getter
     *
     * 
     * Specifies which QueryKeywords corresponds to this PopularSearchResult.
     * Query Keywords are returned in the output to clarify which result set corresponds to
     * which QueryKeyword inputs (as there can be more than one set of keywords in the input).
     * 
     *
     * @returns java.lang.String
	 */
	public String getQueryKeywords() {
	    return this.queryKeywords;
	}
	
	/**
	 * public setter
	 *
     * 
     * Specifies which QueryKeywords corresponds to this PopularSearchResult.
     * Query Keywords are returned in the output to clarify which result set corresponds to
     * which QueryKeyword inputs (as there can be more than one set of keywords in the input).
     * 
     *
     * @param java.lang.String
	 */
	public void setQueryKeywords(String queryKeywords) {
	    this.queryKeywords = queryKeywords;
	}
	/**
     * public getter
     *
     * 
     * Alternative search keywords for the query keywords, separated by semicolons.
     * You can use this to find other search terms buyers and sellers may be interested in.
     * For example, if a seller lists an item with "wedding" in the title, they may also be
     * interested in adding "bridal" to the title because bridal is an alternative search
     * keyword which buyers have used.
     * 
     *
     * @returns java.lang.String
	 */
	public String getAlternativeSearches() {
	    return this.alternativeSearches;
	}
	
	/**
	 * public setter
	 *
     * 
     * Alternative search keywords for the query keywords, separated by semicolons.
     * You can use this to find other search terms buyers and sellers may be interested in.
     * For example, if a seller lists an item with "wedding" in the title, they may also be
     * interested in adding "bridal" to the title because bridal is an alternative search
     * keyword which buyers have used.
     * 
     *
     * @param java.lang.String
	 */
	public void setAlternativeSearches(String alternativeSearches) {
	    this.alternativeSearches = alternativeSearches;
	}
	/**
     * public getter
     *
     * 
     * Keywords related to the query keywords, separated by semicolons.
     * You can use this to find more detailed related keywords.  For example,
     * the query keyword "wedding" is related to searches for
     * "wedding decorations;wedding favors;wedding supplies;wedding dresses..." which helps
     * the seller and buyer specify their query with more detail and precision.
     * 
     *
     * @returns java.lang.String
	 */
	public String getRelatedSearches() {
	    return this.relatedSearches;
	}
	
	/**
	 * public setter
	 *
     * 
     * Keywords related to the query keywords, separated by semicolons.
     * You can use this to find more detailed related keywords.  For example,
     * the query keyword "wedding" is related to searches for
     * "wedding decorations;wedding favors;wedding supplies;wedding dresses..." which helps
     * the seller and buyer specify their query with more detail and precision.
     * 
     *
     * @param java.lang.String
	 */
	public void setRelatedSearches(String relatedSearches) {
	    this.relatedSearches = relatedSearches;
	}
	/**
     * public getter
     *
     * 
     * Category Name identifying the name of current CategoryID.
     * 
     *
     * @returns java.lang.String
	 */
	public String getCategoryName() {
	    return this.categoryName;
	}
	
	/**
	 * public setter
	 *
     * 
     * Category Name identifying the name of current CategoryID.
     * 
     *
     * @param java.lang.String
	 */
	public void setCategoryName(String categoryName) {
	    this.categoryName = categoryName;
	}
	/**
     * public getter
     *
     * 
     * The name of category which is a parent category to the CategoryID
     * specified in the request.
     * 
     *
     * @returns java.lang.String
	 */
	public String getCategoryParentName() {
	    return this.categoryParentName;
	}
	
	/**
	 * public setter
	 *
     * 
     * The name of category which is a parent category to the CategoryID
     * specified in the request.
     * 
     *
     * @param java.lang.String
	 */
	public void setCategoryParentName(String categoryParentName) {
	    this.categoryParentName = categoryParentName;
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