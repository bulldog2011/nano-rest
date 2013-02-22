// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package ebay.apis.eblbasecomponents;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;

/**
 * 
 * Changes the category structure of an eBay store.
 * 
 */
@RootElement(name = "SetStoreCategoriesRequest", namespace = "urn:ebay:apis:eBLBaseComponents")
public class SetStoreCategoriesRequestType extends AbstractRequestType implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element(name = "Action")
	private StoreCategoryUpdateActionCodeType action;
	
	@Element(name = "ItemDestinationCategoryID")
	private Long itemDestinationCategoryID;
	
	@Element(name = "DestinationParentCategoryID")
	private Long destinationParentCategoryID;
	
	@Element(name = "StoreCategories")
	private StoreCustomCategoryArrayType storeCategories;
	
    
	/**
     * public getter
     *
     * 
     * Specifies the type of action (Add, Move, Delete, or Rename) to carry out
     * for the specified categories.
     * 
     *
     * @returns ebay.apis.eblbasecomponents.StoreCategoryUpdateActionCodeType
	 */
	public StoreCategoryUpdateActionCodeType getAction() {
	    return this.action;
	}
	
	/**
	 * public setter
	 *
     * 
     * Specifies the type of action (Add, Move, Delete, or Rename) to carry out
     * for the specified categories.
     * 
     *
     * @param ebay.apis.eblbasecomponents.StoreCategoryUpdateActionCodeType
	 */
	public void setAction(StoreCategoryUpdateActionCodeType action) {
	    this.action = action;
	}
	/**
     * public getter
     *
     * 
     * Items can only be contained within child categories. A parent category
     * cannot contain items. If adding, moving, or deleting categories displaces
     * items, you must specify a destination child category under which the
     * displaced items will be moved. The destination category must have no
     * child categories.
     * 
     *
     * @returns java.lang.Long
	 */
	public Long getItemDestinationCategoryID() {
	    return this.itemDestinationCategoryID;
	}
	
	/**
	 * public setter
	 *
     * 
     * Items can only be contained within child categories. A parent category
     * cannot contain items. If adding, moving, or deleting categories displaces
     * items, you must specify a destination child category under which the
     * displaced items will be moved. The destination category must have no
     * child categories.
     * 
     *
     * @param java.lang.Long
	 */
	public void setItemDestinationCategoryID(Long itemDestinationCategoryID) {
	    this.itemDestinationCategoryID = itemDestinationCategoryID;
	}
	/**
     * public getter
     *
     * 
     * When adding or moving store categories, specifies the category under
     * which the listed categories will be located. To add or move categories to
     * the top level, set the value to -999.
     * 
     *
     * @returns java.lang.Long
	 */
	public Long getDestinationParentCategoryID() {
	    return this.destinationParentCategoryID;
	}
	
	/**
	 * public setter
	 *
     * 
     * When adding or moving store categories, specifies the category under
     * which the listed categories will be located. To add or move categories to
     * the top level, set the value to -999.
     * 
     *
     * @param java.lang.Long
	 */
	public void setDestinationParentCategoryID(Long destinationParentCategoryID) {
	    this.destinationParentCategoryID = destinationParentCategoryID;
	}
	/**
     * public getter
     *
     * 
     * Specifies the store categories on which to act.
     * 
     *
     * @returns ebay.apis.eblbasecomponents.StoreCustomCategoryArrayType
	 */
	public StoreCustomCategoryArrayType getStoreCategories() {
	    return this.storeCategories;
	}
	
	/**
	 * public setter
	 *
     * 
     * Specifies the store categories on which to act.
     * 
     *
     * @param ebay.apis.eblbasecomponents.StoreCustomCategoryArrayType
	 */
	public void setStoreCategories(StoreCustomCategoryArrayType storeCategories) {
	    this.storeCategories = storeCategories;
	}

}