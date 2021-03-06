// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package ebay.apis.eblbasecomponents;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;

/**
 * 
 * Enables a seller to test the definition of a new fixed-price listing by
 * submitting the definition to eBay without creating a actual listing.
 * 
 */
@RootElement(name = "VerifyAddFixedPriceItemRequest", namespace = "urn:ebay:apis:eBLBaseComponents")
public class VerifyAddFixedPriceItemRequestType extends AbstractRequestType implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element(name = "Item")
	private ItemType item;
	
    
	/**
     * public getter
     *
     * 
     * Root container holding all values that define a new
     * fixed-price listing.
     * 
     *
     * @returns ebay.apis.eblbasecomponents.ItemType
	 */
	public ItemType getItem() {
	    return this.item;
	}
	
	/**
	 * public setter
	 *
     * 
     * Root container holding all values that define a new
     * fixed-price listing.
     * 
     *
     * @param ebay.apis.eblbasecomponents.ItemType
	 */
	public void setItem(ItemType item) {
	    this.item = item;
	}

}