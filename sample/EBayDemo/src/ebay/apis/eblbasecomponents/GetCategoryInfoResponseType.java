// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package ebay.apis.eblbasecomponents;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;
import java.util.Date;

/**
 * 
 * Contains the category data for the eBay site specified as input. The category
 * data is returned as a CategoryArrayType object, that contains zero, one, or
 * multiple CategoryType objects. Each CategoryType object contains the detail data
 * for one category. Other fields indicate how many categories are returned in a call, when the category hierarchy was last updated, and the version of the category hierarchy (all three of which can differ from one eBay site to the next).
 * 
 */
@RootElement(name = "GetCategoryInfoResponse", namespace = "urn:ebay:apis:eBLBaseComponents")
public class GetCategoryInfoResponseType extends AbstractResponseType implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element(name = "CategoryArray")
	private CategoryArrayType categoryArray;
	
	@Element(name = "CategoryCount")
	private Integer categoryCount;
	
	@Element(name = "UpdateTime")
	private Date updateTime;
	
	@Element(name = "CategoryVersion")
	private String categoryVersion;
	
    
	/**
     * public getter
     *
     * 
     * List of the returned categories. The category array contains one CategoryType
     * object for each returned category. Returns empty if no detail level is specified.
     * 
     *
     * @returns ebay.apis.eblbasecomponents.CategoryArrayType
	 */
	public CategoryArrayType getCategoryArray() {
	    return this.categoryArray;
	}
	
	/**
	 * public setter
	 *
     * 
     * List of the returned categories. The category array contains one CategoryType
     * object for each returned category. Returns empty if no detail level is specified.
     * 
     *
     * @param ebay.apis.eblbasecomponents.CategoryArrayType
	 */
	public void setCategoryArray(CategoryArrayType categoryArray) {
	    this.categoryArray = categoryArray;
	}
	/**
     * public getter
     *
     * 
     * Indicates the number of categories returned (i.e., the number of CategoryType
     * objects in CategoryArray).
     * 
     *
     * @returns java.lang.Integer
	 */
	public Integer getCategoryCount() {
	    return this.categoryCount;
	}
	
	/**
	 * public setter
	 *
     * 
     * Indicates the number of categories returned (i.e., the number of CategoryType
     * objects in CategoryArray).
     * 
     *
     * @param java.lang.Integer
	 */
	public void setCategoryCount(Integer categoryCount) {
	    this.categoryCount = categoryCount;
	}
	/**
     * public getter
     *
     * 
     * Indicates the last date and time that eBay modified the category hierarchy for the
     * specified eBay site.
     * 
     *
     * @returns java.util.Date
	 */
	public Date getUpdateTime() {
	    return this.updateTime;
	}
	
	/**
	 * public setter
	 *
     * 
     * Indicates the last date and time that eBay modified the category hierarchy for the
     * specified eBay site.
     * 
     *
     * @param java.util.Date
	 */
	public void setUpdateTime(Date updateTime) {
	    this.updateTime = updateTime;
	}
	/**
     * public getter
     *
     * 
     * Indicates the version of the category hierarchy on the
     * specified eBay site.
     * 
     *
     * @returns java.lang.String
	 */
	public String getCategoryVersion() {
	    return this.categoryVersion;
	}
	
	/**
	 * public setter
	 *
     * 
     * Indicates the version of the category hierarchy on the
     * specified eBay site.
     * 
     *
     * @param java.lang.String
	 */
	public void setCategoryVersion(String categoryVersion) {
	    this.categoryVersion = categoryVersion;
	}

}