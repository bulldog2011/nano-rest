// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package ebay.apis.eblbasecomponents;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;

/**
 * 
 * This type defines the <b>Storefront</b> container, which can be used 
 * by eBay Stores sellers in Add/Revise/Relist calls to list an item under a custom 
 * eBay Stores category. The <b>Storefront</b> container is also returned 
 * in <b>GetItem</b> and other Trading calls that retrieve Item data.
 *  
 */
public class StorefrontType implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element(name = "StoreCategoryID")
	private long storeCategoryID;
	
	@Element(name = "StoreCategory2ID")
	private long storeCategory2ID;
	
	@Element(name = "StoreURL")
	private String storeURL;
	
	@Element(name = "StoreName")
	private String storeName;
	
    
	/**
     * public getter
     *
     * 
     * Unique identifier for a custom category that the seller created in
     * their eBay Store. The value in this field indicates the primary category.
     * eBay Stores sellers can create up to three levels of custom
     * categories for their stores.
     * Items can only be listed in root categories, or categories
     * that have no child categories (subcategories).
     * If you attempt to list an item in a category that has subcategories,
     * the call response contains a warning,
     * and the item is listed in the Other store category.
     * 
     *
     * @returns .long
	 */
	public long getStoreCategoryID() {
	    return this.storeCategoryID;
	}
	
	/**
	 * public setter
	 *
     * 
     * Unique identifier for a custom category that the seller created in
     * their eBay Store. The value in this field indicates the primary category.
     * eBay Stores sellers can create up to three levels of custom
     * categories for their stores.
     * Items can only be listed in root categories, or categories
     * that have no child categories (subcategories).
     * If you attempt to list an item in a category that has subcategories,
     * the call response contains a warning,
     * and the item is listed in the Other store category.
     * 
     *
     * @param .long
	 */
	public void setStoreCategoryID(long storeCategoryID) {
	    this.storeCategoryID = storeCategoryID;
	}
	/**
     * public getter
     *
     * 
     * Unique identifier for a second custom
     * category that the seller created in their eBay Store. eBay Stores sellers can
     * create up to 300 custom categories for their stores. (One additional Store
     * category cannot be customized and retains the value of "Other"). <br>
     * If you specify an invalid value, the values are the same for both the primary
     * and secondary store categories, or if the secondary store category is
     * specified but the primary is left blank (or other),  the system resets the
     * value to 0 (None). In short, the primary store category must be set to
     * something meaningful and different from the second store category
     * in order to set the secondary store category to a value other than 0.
     * 
     *
     * @returns .long
	 */
	public long getStoreCategory2ID() {
	    return this.storeCategory2ID;
	}
	
	/**
	 * public setter
	 *
     * 
     * Unique identifier for a second custom
     * category that the seller created in their eBay Store. eBay Stores sellers can
     * create up to 300 custom categories for their stores. (One additional Store
     * category cannot be customized and retains the value of "Other"). <br>
     * If you specify an invalid value, the values are the same for both the primary
     * and secondary store categories, or if the secondary store category is
     * specified but the primary is left blank (or other),  the system resets the
     * value to 0 (None). In short, the primary store category must be set to
     * something meaningful and different from the second store category
     * in order to set the secondary store category to a value other than 0.
     * 
     *
     * @param .long
	 */
	public void setStoreCategory2ID(long storeCategory2ID) {
	    this.storeCategory2ID = storeCategory2ID;
	}
	/**
     * public getter
     *
     * 
     * The URL of the seller's eBay Stores page.
     * 
     *
     * @returns java.lang.String
	 */
	public String getStoreURL() {
	    return this.storeURL;
	}
	
	/**
	 * public setter
	 *
     * 
     * The URL of the seller's eBay Stores page.
     * 
     *
     * @param java.lang.String
	 */
	public void setStoreURL(String storeURL) {
	    this.storeURL = storeURL;
	}
	/**
     * public getter
     *
     * 
     * The name of the seller's eBay Store.
     * 
     *
     * @returns java.lang.String
	 */
	public String getStoreName() {
	    return this.storeName;
	}
	
	/**
	 * public setter
	 *
     * 
     * The name of the seller's eBay Store.
     * 
     *
     * @param java.lang.String
	 */
	public void setStoreName(String storeName) {
	    this.storeName = storeName;
	}

}