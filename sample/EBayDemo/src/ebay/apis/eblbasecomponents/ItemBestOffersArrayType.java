// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package ebay.apis.eblbasecomponents;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;
import java.util.List;

/**
 * 
 * A collection of details about the best offers received for a specific item. Empty if there are no best offers. Includes the buyer and seller messages only if
 * the ReturnAll detail level is used.
 * 
 */
public class ItemBestOffersArrayType implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element(name = "ItemBestOffers")
	private List<ItemBestOffersType> itemBestOffers;
	
    
	/**
     * public getter
     *
     * 
     * A collection of details about the best offers received for a specific item. Empty if
     * there are no best offers. Includes the buyer and seller messages only if the ReturnAll
     * detail level is used.
     * 
     *
     * @returns java.util.List<ebay.apis.eblbasecomponents.ItemBestOffersType>
	 */
	public List<ItemBestOffersType> getItemBestOffers() {
	    return this.itemBestOffers;
	}
	
	/**
	 * public setter
	 *
     * 
     * A collection of details about the best offers received for a specific item. Empty if
     * there are no best offers. Includes the buyer and seller messages only if the ReturnAll
     * detail level is used.
     * 
     *
     * @param java.util.List<ebay.apis.eblbasecomponents.ItemBestOffersType>
	 */
	public void setItemBestOffers(List<ItemBestOffersType> itemBestOffers) {
	    this.itemBestOffers = itemBestOffers;
	}

}