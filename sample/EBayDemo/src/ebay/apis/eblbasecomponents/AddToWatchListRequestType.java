// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package ebay.apis.eblbasecomponents;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;
import java.util.List;

/**
 * 
 * Adds one or more items to the user's My eBay watch list.
 * 
 */
@RootElement(name = "AddToWatchListRequest", namespace = "urn:ebay:apis:eBLBaseComponents")
public class AddToWatchListRequestType extends AbstractRequestType implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element(name = "ItemID")
	private List<String> itemID;
	
	@Element(name = "VariationKey")
	private List<VariationKeyType> variationKey;
	
    
	/**
     * public getter
     *
     * 
     * The ItemID of the item that is to be added to the watch list.
     * The item must be a currently active item, and the total number
     * of items in the
     * watchlist (after the items in the request have been added) cannot exceed
     * the maximum allowed number of watch list items. One or more ItemID fields can be specified. A separate error node will be
     * returned for each item that fails.<br>
     * <br>
     * Either ItemID or VariationKey is required
     * (but do not pass in both).
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
     * The ItemID of the item that is to be added to the watch list.
     * The item must be a currently active item, and the total number
     * of items in the
     * watchlist (after the items in the request have been added) cannot exceed
     * the maximum allowed number of watch list items. One or more ItemID fields can be specified. A separate error node will be
     * returned for each item that fails.<br>
     * <br>
     * Either ItemID or VariationKey is required
     * (but do not pass in both).
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
     * A variation (or set of variations) that you want to watch.
     * Use this to watch a particular variation (not the entire item).
     * Either the top-level ItemID or VariationKey is required
     * (but do not pass in both).
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
     * A variation (or set of variations) that you want to watch.
     * Use this to watch a particular variation (not the entire item).
     * Either the top-level ItemID or VariationKey is required
     * (but do not pass in both).
     * 
     *
     * @param java.util.List<ebay.apis.eblbasecomponents.VariationKeyType>
	 */
	public void setVariationKey(List<VariationKeyType> variationKey) {
	    this.variationKey = variationKey;
	}

}