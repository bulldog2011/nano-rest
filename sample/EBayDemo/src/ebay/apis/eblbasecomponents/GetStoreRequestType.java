// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package ebay.apis.eblbasecomponents;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;

/**
 * 
 * Retrieves configuration information for the eBay store owned by the specified
 * UserID, or by the caller.
 * 
 */
@RootElement(name = "GetStoreRequest", namespace = "urn:ebay:apis:eBLBaseComponents")
public class GetStoreRequestType extends AbstractRequestType implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element(name = "CategoryStructureOnly")
	private Boolean categoryStructureOnly;
	
	@Element(name = "RootCategoryID")
	private Long rootCategoryID;
	
	@Element(name = "LevelLimit")
	private Integer levelLimit;
	
	@Element(name = "UserID")
	private String userID;
	
    
	/**
     * public getter
     *
     * 
     *  If this is set to True, only the category structure of the store is
     *  returned. If this is not specified or set to False, the complete store
     *  configuration is returned.
     * 
     *
     * @returns java.lang.Boolean
	 */
	public Boolean getCategoryStructureOnly() {
	    return this.categoryStructureOnly;
	}
	
	/**
	 * public setter
	 *
     * 
     *  If this is set to True, only the category structure of the store is
     *  returned. If this is not specified or set to False, the complete store
     *  configuration is returned.
     * 
     *
     * @param java.lang.Boolean
	 */
	public void setCategoryStructureOnly(Boolean categoryStructureOnly) {
	    this.categoryStructureOnly = categoryStructureOnly;
	}
	/**
     * public getter
     *
     * 
     * Specifies the category ID for the topmost category to return (along with
     * the subcategories under it, the value of the LevelLimit property
     * determining how deep). This tag is optional. If RootCategoryID is not
     * specified, then the category tree starting at that root Category is
     * returned.
     * 
     *
     * @returns java.lang.Long
	 */
	public Long getRootCategoryID() {
	    return this.rootCategoryID;
	}
	
	/**
	 * public setter
	 *
     * 
     * Specifies the category ID for the topmost category to return (along with
     * the subcategories under it, the value of the LevelLimit property
     * determining how deep). This tag is optional. If RootCategoryID is not
     * specified, then the category tree starting at that root Category is
     * returned.
     * 
     *
     * @param java.lang.Long
	 */
	public void setRootCategoryID(Long rootCategoryID) {
	    this.rootCategoryID = rootCategoryID;
	}
	/**
     * public getter
     *
     * 
     *  Specifies the limit for the number of levels of the category hierarchy
     *  to return, where the given root category is level 1 and its children are
     *  level 2. Only categories at or above the level specified are returned.
     *  This tag is optional. If LevelLimit is not set, the complete category
     *  hierarchy is returned. Stores support category hierarchies up to 3
     *  levels only.
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
     *  Specifies the limit for the number of levels of the category hierarchy
     *  to return, where the given root category is level 1 and its children are
     *  level 2. Only categories at or above the level specified are returned.
     *  This tag is optional. If LevelLimit is not set, the complete category
     *  hierarchy is returned. Stores support category hierarchies up to 3
     *  levels only.
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
     * Specifies the user whose store data is to be returned. If not specified,
     * then the store returned is that for the requesting user.
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
     * Specifies the user whose store data is to be returned. If not specified,
     * then the store returned is that for the requesting user.
     * 
     *
     * @param java.lang.String
	 */
	public void setUserID(String userID) {
	    this.userID = userID;
	}

}