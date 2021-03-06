// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package ebay.apis.eblbasecomponents;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;
import java.util.List;

/**
 * 
 * Retrieves the latest eBay category hierarchy for a given eBay site.
 * Information returned for each category includes the category name
 * and the unique ID for the category (unique within the eBay site for which
 * categories are retrieved). A category ID is a required input when you list most items.
 * 
 */
@RootElement(name = "GetCategoriesRequest", namespace = "urn:ebay:apis:eBLBaseComponents")
public class GetCategoriesRequestType extends AbstractRequestType implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element(name = "CategorySiteID")
	private String categorySiteID;
	
	@Element(name = "CategoryParent")
	private List<String> categoryParent;
	
	@Element(name = "LevelLimit")
	private Integer levelLimit;
	
	@Element(name = "ViewAllNodes")
	private Boolean viewAllNodes;
	
    
	/**
     * public getter
     *
     * 
     * Specifies the eBay site for which to retrieve the category
     * hierarchy.
     * Use the numeric site code (e.g., 77 for eBay Germany).
     * Only necessary if you want to retrieve category data
     * for a site other than the site from which you are
     * submitting the request.
     * <br>
     * <br>
     * NOTE: If you are using the GetCategories call with eBay Motors, you
     * must set the Site ID in the Request Header to 0, and then set
     * the CategorySiteID to 100. These are both required fields when
     * using GetCategories with eBay Motors.
     * 
     *
     * @returns java.lang.String
	 */
	public String getCategorySiteID() {
	    return this.categorySiteID;
	}
	
	/**
	 * public setter
	 *
     * 
     * Specifies the eBay site for which to retrieve the category
     * hierarchy.
     * Use the numeric site code (e.g., 77 for eBay Germany).
     * Only necessary if you want to retrieve category data
     * for a site other than the site from which you are
     * submitting the request.
     * <br>
     * <br>
     * NOTE: If you are using the GetCategories call with eBay Motors, you
     * must set the Site ID in the Request Header to 0, and then set
     * the CategorySiteID to 100. These are both required fields when
     * using GetCategories with eBay Motors.
     * 
     *
     * @param java.lang.String
	 */
	public void setCategorySiteID(String categorySiteID) {
	    this.categorySiteID = categorySiteID;
	}
	/**
     * public getter
     *
     * 
     * Specifies the ID of the highest-level category to return,
     * along with its subcategories.
     * If no parent category is specified, all categories are
     * returned for the specified site. (Please do not pass a value of 0; zero (0) is an invalid value for CategoryParent.)
     * To determine available category IDs, call GetCategories with
     * no filters and use a DetailLevel value of ReturnAll.
     * If you specify multiple parent categories, the hierarchy for
     * each one is returned.
     * 
     *
     * @returns java.util.List<java.lang.String>
	 */
	public List<String> getCategoryParent() {
	    return this.categoryParent;
	}
	
	/**
	 * public setter
	 *
     * 
     * Specifies the ID of the highest-level category to return,
     * along with its subcategories.
     * If no parent category is specified, all categories are
     * returned for the specified site. (Please do not pass a value of 0; zero (0) is an invalid value for CategoryParent.)
     * To determine available category IDs, call GetCategories with
     * no filters and use a DetailLevel value of ReturnAll.
     * If you specify multiple parent categories, the hierarchy for
     * each one is returned.
     * 
     *
     * @param java.util.List<java.lang.String>
	 */
	public void setCategoryParent(List<String> categoryParent) {
	    this.categoryParent = categoryParent;
	}
	/**
     * public getter
     *
     * 
     * Specifies the maximum depth of the category hierarchy to retrieve,
     * where the top-level categories (meta-categories) are at level 1.
     * Retrieves all category nodes with a category level less than or
     * equal to this value.
     * If not specified, retrieves categories at all applicable levels.
     * As with all calls, the actual data returned will vary depending
     * on how you configure other fields in the request
     * (including DetailLevel).
     * 
     *
     * @returns java.lang.Integer
	 */
	public Integer getLevelLimit() {
	    return this.levelLimit;
	}
	
	/**
	 * public setter
	 *
     * 
     * Specifies the maximum depth of the category hierarchy to retrieve,
     * where the top-level categories (meta-categories) are at level 1.
     * Retrieves all category nodes with a category level less than or
     * equal to this value.
     * If not specified, retrieves categories at all applicable levels.
     * As with all calls, the actual data returned will vary depending
     * on how you configure other fields in the request
     * (including DetailLevel).
     * 
     *
     * @param java.lang.Integer
	 */
	public void setLevelLimit(Integer levelLimit) {
	    this.levelLimit = levelLimit;
	}
	/**
     * public getter
     *
     * 
     * This flag controls whether all eBay categories (that satisfy input filters) are
     * returned, or only leaf categories (you can only list items in leaf categories)
     * are returned. The default value is 'true', so if this field is omitted, all eBay
     * categories will be returned. If you only want to retrieve leaf categories,
     * include this flag and set it to 'false'. The actual data returned will vary
     * depending on how you configure other fields in the request.
     * 
     *
     * @returns java.lang.Boolean
	 */
	public Boolean getViewAllNodes() {
	    return this.viewAllNodes;
	}
	
	/**
	 * public setter
	 *
     * 
     * This flag controls whether all eBay categories (that satisfy input filters) are
     * returned, or only leaf categories (you can only list items in leaf categories)
     * are returned. The default value is 'true', so if this field is omitted, all eBay
     * categories will be returned. If you only want to retrieve leaf categories,
     * include this flag and set it to 'false'. The actual data returned will vary
     * depending on how you configure other fields in the request.
     * 
     *
     * @param java.lang.Boolean
	 */
	public void setViewAllNodes(Boolean viewAllNodes) {
	    this.viewAllNodes = viewAllNodes;
	}

}