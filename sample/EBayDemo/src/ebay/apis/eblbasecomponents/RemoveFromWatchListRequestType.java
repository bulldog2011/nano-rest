// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package ebay.apis.eblbasecomponents;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;
import java.util.List;

/**
 * 
 * Enables a user to remove one or more items from their My eBay watch list.
 * 
 */
@RootElement(name = "RemoveFromWatchListRequest", namespace = "urn:ebay:apis:eBLBaseComponents")
public class RemoveFromWatchListRequestType extends AbstractRequestType implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element(name = "ItemID")
	private List<String> itemID;
	
	@Element(name = "RemoveAllItems")
	private Boolean removeAllItems;
	
	@Element(name = "VariationKey")
	private List<VariationKeyType> variationKey;
	
    
	/**
     * public getter
     *
     * 
     * The ID of the item to be removed from the
     * watch list. Either ItemID, RemoveAllItems, or VariationKey must
     * be specified, but NOT more than one of these.
     * Multiple ItemID fields can be specified in the same request.
     * 
     *
     * @returns java.util.List<java.lang.String>
	 */
	public List<String> getItemID() {
	    return this.itemID;
	}
	
	/**
	 * public setter
	 *
     * 
     * The ID of the item to be removed from the
     * watch list. Either ItemID, RemoveAllItems, or VariationKey must
     * be specified, but NOT more than one of these.
     * Multiple ItemID fields can be specified in the same request.
     * 
     *
     * @param java.util.List<java.lang.String>
	 */
	public void setItemID(List<String> itemID) {
	    this.itemID = itemID;
	}
	/**
     * public getter
     *
     * 
     * If true, then all the items in the user's
     * watch list are removed. Either ItemID, RemoveAllItems, or VariationKey must be specified, but NOT more than one of these.
     * 
     *
     * @returns java.lang.Boolean
	 */
	public Boolean getRemoveAllItems() {
	    return this.removeAllItems;
	}
	
	/**
	 * public setter
	 *
     * 
     * If true, then all the items in the user's
     * watch list are removed. Either ItemID, RemoveAllItems, or VariationKey must be specified, but NOT more than one of these.
     * 
     *
     * @param java.lang.Boolean
	 */
	public void setRemoveAllItems(Boolean removeAllItems) {
	    this.removeAllItems = removeAllItems;
	}
	/**
     * public getter
     *
     * 
     * A variation (or set of variations) that you want to remove
     * from the watch list. Either ItemID, RemoveAllItems, or VariationKey must be specified, but NOT more than one of these.
     * 
     *
     * @returns java.util.List<ebay.apis.eblbasecomponents.VariationKeyType>
	 */
	public List<VariationKeyType> getVariationKey() {
	    return this.variationKey;
	}
	
	/**
	 * public setter
	 *
     * 
     * A variation (or set of variations) that you want to remove
     * from the watch list. Either ItemID, RemoveAllItems, or VariationKey must be specified, but NOT more than one of these.
     * 
     *
     * @param java.util.List<ebay.apis.eblbasecomponents.VariationKeyType>
	 */
	public void setVariationKey(List<VariationKeyType> variationKey) {
	    this.variationKey = variationKey;
	}

}