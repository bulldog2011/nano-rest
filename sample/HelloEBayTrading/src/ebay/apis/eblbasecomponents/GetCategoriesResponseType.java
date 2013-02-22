// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package ebay.apis.eblbasecomponents;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;
import java.util.Date;

/**
 * 
 * Contains the category data for the eBay site specified as input. The category
 * data is contained in a CategoryArrayType object, within which are zero, one, or
 * multiple CategoryType objects. Each CategoryType object contains the detail data
 * for one category. Other fields tell how many categories are returned in a call,
 * when the category hierarchy was last updated, and the version of the category
 * hierarchy (all three of which can differ from one eBay site to the next).
 * 
 */
@RootElement(name = "GetCategoriesResponse", namespace = "urn:ebay:apis:eBLBaseComponents")
public class GetCategoriesResponseType extends AbstractResponseType implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element(name = "CategoryArray")
	private CategoryArrayType categoryArray;
	
	@Element(name = "CategoryCount")
	private Integer categoryCount;
	
	@Element(name = "UpdateTime")
	private Date updateTime;
	
	@Element(name = "CategoryVersion")
	private String categoryVersion;
	
	@Element(name = "ReservePriceAllowed")
	private Boolean reservePriceAllowed;
	
	@Element(name = "MinimumReservePrice")
	private Double minimumReservePrice;
	
	@Element(name = "ReduceReserveAllowed")
	private Boolean reduceReserveAllowed;
	
    
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
	/**
     * public getter
     *
     * 
     * If true, ReservePriceAllowed indicates that all categories on the
     * site allow the seller to specify a reserve price for an item.
     * If false, this field is not returned in the response and all categories on the site do not normally allow sellers to specify reserve prices.
     * The Category.ORPA (override reserve price allowed) field can override (or toggle)
     * the reserve price allowed setting for a given category.
     * For example, if ReservePriceAllowed is false and Category.ORPA is true,
     * the category overrides the site setting and supports reserve prices.
     * If ReservePriceAllowed is true and Category.ORPA is true, the category
     * overrides the site setting and does does not support reserve prices.
     * 
     *
     * @returns java.lang.Boolean
	 */
	public Boolean getReservePriceAllowed() {
	    return this.reservePriceAllowed;
	}
	
	/**
	 * public setter
	 *
     * 
     * If true, ReservePriceAllowed indicates that all categories on the
     * site allow the seller to specify a reserve price for an item.
     * If false, this field is not returned in the response and all categories on the site do not normally allow sellers to specify reserve prices.
     * The Category.ORPA (override reserve price allowed) field can override (or toggle)
     * the reserve price allowed setting for a given category.
     * For example, if ReservePriceAllowed is false and Category.ORPA is true,
     * the category overrides the site setting and supports reserve prices.
     * If ReservePriceAllowed is true and Category.ORPA is true, the category
     * overrides the site setting and does does not support reserve prices.
     * 
     *
     * @param java.lang.Boolean
	 */
	public void setReservePriceAllowed(Boolean reservePriceAllowed) {
	    this.reservePriceAllowed = reservePriceAllowed;
	}
	/**
     * public getter
     *
     * 
     *     Indicates the lowest possible reserve price allowed for any item
     *     listed in any category on the site. You can use the fields returned by GetCategoryFeatures to determine if a different Minimum Reserve Price is defined for the category you want to use.
     * 
     *
     * @returns java.lang.Double
	 */
	public Double getMinimumReservePrice() {
	    return this.minimumReservePrice;
	}
	
	/**
	 * public setter
	 *
     * 
     *     Indicates the lowest possible reserve price allowed for any item
     *     listed in any category on the site. You can use the fields returned by GetCategoryFeatures to determine if a different Minimum Reserve Price is defined for the category you want to use.
     * 
     *
     * @param java.lang.Double
	 */
	public void setMinimumReservePrice(Double minimumReservePrice) {
	    this.minimumReservePrice = minimumReservePrice;
	}
	/**
     * public getter
     *
     * 
     * If true, ReduceReserveAllowed indicates that all categories on the
     * site allow the seller to reduce an item's reserve price.
     * If false, this field is not returned in the response and all categories on the site do not normally allow sellers to reduce an
     * item's reserve price.
     * The Category.ORRA (override reduce reserve price) field can override (or toggle)
     * the reserve price reduction setting for a given category.
     * For example, if ReduceReserveAllowed is false and Category.ORRA is true,
     * the category overrides the site setting and supports reducing reserve prices.
     * If ReduceReserveAllowed is true and Category.ORRA is true, the category
     * overrides the site setting and does does not support reducing reserve prices.
     * 
     *
     * @returns java.lang.Boolean
	 */
	public Boolean getReduceReserveAllowed() {
	    return this.reduceReserveAllowed;
	}
	
	/**
	 * public setter
	 *
     * 
     * If true, ReduceReserveAllowed indicates that all categories on the
     * site allow the seller to reduce an item's reserve price.
     * If false, this field is not returned in the response and all categories on the site do not normally allow sellers to reduce an
     * item's reserve price.
     * The Category.ORRA (override reduce reserve price) field can override (or toggle)
     * the reserve price reduction setting for a given category.
     * For example, if ReduceReserveAllowed is false and Category.ORRA is true,
     * the category overrides the site setting and supports reducing reserve prices.
     * If ReduceReserveAllowed is true and Category.ORRA is true, the category
     * overrides the site setting and does does not support reducing reserve prices.
     * 
     *
     * @param java.lang.Boolean
	 */
	public void setReduceReserveAllowed(Boolean reduceReserveAllowed) {
	    this.reduceReserveAllowed = reduceReserveAllowed;
	}

}