// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package ebay.apis.eblbasecomponents;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;
import java.util.List;

/**
 * 
 * Find popular items
 * 
 */
@RootElement(name = "FindPopularItemsRequest", namespace = "urn:ebay:apis:eBLBaseComponents")
public class FindPopularItemsRequestType extends AbstractRequestType implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element(name = "CategoryID")
	private List<String> categoryID;
	
	@Element(name = "QueryKeywords")
	private String queryKeywords;
	
	@Element(name = "CategoryIDExclude")
	private List<String> categoryIDExclude;
	
	@Element(name = "MaxEntries")
	private Integer maxEntries;
	
    
	/**
     * public getter
     *
     * 
     * Specify CategoryID to restrict your query to a specific category.
     * Up to 10 categories may be specified.
     * If you are using a URL, and you want to specify
     * more than one CategoryID, separate the values with a comma.
     * For example, to specify Fiction Books and 
     * Children's Books, specify CategoryID=377,279.
     * <br>
     * <br>
     * If the specified category ID doesn't match an existing category
     * for the site, an invalid-category error message is returned.
     * To determine valid categories:<br>
     * Use <b>findItemsAdvanced</b> from the <a href="http://www.developer.ebay.com/DevZone/finding/CallRef/index.html">Finding API</a> with CategoryHistogram value in the OutputSelector field 
     * to retrieve matching categories. Then make another
     * <b>findItemsAdvanced</b> call with the ID of a matching category.
     * <br>
     * <br>
     * CategoryID can be used in combination with QueryKeywords and CategoryIDExclude.
     * To retrieve the most popular items across all categorys, do not submit a CategoryID.
     * 
     *
     * @returns java.util.List<java.lang.String>
	 */
	public List<String> getCategoryID() {
	    return this.categoryID;
	}
	
	/**
	 * public setter
	 *
     * 
     * Specify CategoryID to restrict your query to a specific category.
     * Up to 10 categories may be specified.
     * If you are using a URL, and you want to specify
     * more than one CategoryID, separate the values with a comma.
     * For example, to specify Fiction Books and 
     * Children's Books, specify CategoryID=377,279.
     * <br>
     * <br>
     * If the specified category ID doesn't match an existing category
     * for the site, an invalid-category error message is returned.
     * To determine valid categories:<br>
     * Use <b>findItemsAdvanced</b> from the <a href="http://www.developer.ebay.com/DevZone/finding/CallRef/index.html">Finding API</a> with CategoryHistogram value in the OutputSelector field 
     * to retrieve matching categories. Then make another
     * <b>findItemsAdvanced</b> call with the ID of a matching category.
     * <br>
     * <br>
     * CategoryID can be used in combination with QueryKeywords and CategoryIDExclude.
     * To retrieve the most popular items across all categorys, do not submit a CategoryID.
     * 
     *
     * @param java.util.List<java.lang.String>
	 */
	public void setCategoryID(List<String> categoryID) {
	    this.categoryID = categoryID;
	}
	/**
     * public getter
     *
     * 
     * A query that specifies a string for searching titles of items on eBay.
     * If you are using a URL, then to search for multiple words,
     * use "%20". For example, use Harry%20Potter to search for items
     * containing those words in any order.
     * You can incorporate wildcards into a multi-word search, as in the following: ap*%20ip*.
     * The words "and" and "or" are treated like any other word. Only use "and",
     * "or", or "the" if you are searching for listings containing these words.
     * QueryKeywords can be used in combination with CategoryID and CategoryIDExclude.
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
     * A query that specifies a string for searching titles of items on eBay.
     * If you are using a URL, then to search for multiple words,
     * use "%20". For example, use Harry%20Potter to search for items
     * containing those words in any order.
     * You can incorporate wildcards into a multi-word search, as in the following: ap*%20ip*.
     * The words "and" and "or" are treated like any other word. Only use "and",
     * "or", or "the" if you are searching for listings containing these words.
     * QueryKeywords can be used in combination with CategoryID and CategoryIDExclude.
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
     * Specify this value if you want search results to be filtered so that the popular 
     * items returned do not include items that belong to a specific category. 
     * <br>
     * <br>
     * CategoryIDExclude is an unbounded field.
     * If you are using a URL, you can separate multiple values with a comma.
     * For example, if you want to specify 
     * Records and SuperAudio CDs, specify 
     * CategoryIDExclude=306,46354.  
     * <br>
     * <br>
     * If you use CategoryIDExclude, it must be used in with QueryKeywords or CategoryID.
     * The CategoryIDExclude input field need not be used if you specified the 
     * CategoryID input field.
     * 
     *
     * @returns java.util.List<java.lang.String>
	 */
	public List<String> getCategoryIDExclude() {
	    return this.categoryIDExclude;
	}
	
	/**
	 * public setter
	 *
     * 
     * Specify this value if you want search results to be filtered so that the popular 
     * items returned do not include items that belong to a specific category. 
     * <br>
     * <br>
     * CategoryIDExclude is an unbounded field.
     * If you are using a URL, you can separate multiple values with a comma.
     * For example, if you want to specify 
     * Records and SuperAudio CDs, specify 
     * CategoryIDExclude=306,46354.  
     * <br>
     * <br>
     * If you use CategoryIDExclude, it must be used in with QueryKeywords or CategoryID.
     * The CategoryIDExclude input field need not be used if you specified the 
     * CategoryID input field.
     * 
     *
     * @param java.util.List<java.lang.String>
	 */
	public void setCategoryIDExclude(List<String> categoryIDExclude) {
	    this.categoryIDExclude = categoryIDExclude;
	}
	/**
     * public getter
     *
     *  
     *   Specifies the maximum number of entries to return in a single call.
     * 
     *
     * @returns java.lang.Integer
	 */
	public Integer getMaxEntries() {
	    return this.maxEntries;
	}
	
	/**
	 * public setter
	 *
     *  
     *   Specifies the maximum number of entries to return in a single call.
     * 
     *
     * @param java.lang.Integer
	 */
	public void setMaxEntries(Integer maxEntries) {
	    this.maxEntries = maxEntries;
	}

}