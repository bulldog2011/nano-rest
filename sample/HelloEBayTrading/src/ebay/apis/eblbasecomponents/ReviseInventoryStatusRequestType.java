// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package ebay.apis.eblbasecomponents;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;
import java.util.List;

/**
 * 
 * Enables a seller to change the price and quantity of a currently-
 * active, fixed-price listing. Using ReviseInventoryStatus to modify
 * data qualifies as revising the listing.
 * <br>
 * <br>
 * Inputs are the item IDs or SKUs of the listings being revised,
 * and the price and quantity that are
 * being changed for each revision. Only applicable to fixed-price listings.<br>
 * <br>
 * Changing the price or quantity of a currently-
 * active, fixed-price listing does not reset the Best Match performance score.
 * For Best Match information related to multi-variation listings, see the Best
 * Match information at the following topic:
 * <a href="http://pages.ebay.com/sell/variation/">Multi-quantity Fixed Price
 * listings with variations</a>.<br>
 * <br>
 * As with all listing calls, the site you specify in the request URL
 * (for SOAP) or the X-EBAY-API-SITEID HTTP header (for XML)
 * should match the original listing's <b>Item.Site</b> value.
 * In particular, this is a best practice when you submit new and
 * revised listings.<br>
 * <br>
 * <b>For Large Merchant Services users:</b> When you use ReviseInventoryStatus within a Merchant Data file,
 * it must be enclosed within two BulkDataExchangeRequest tags.
 * After release 637, a namespace is returned in the BulkDataExchangeResponseType
 * (top level) of the response. The BulkDataExchange tags are not shown in the call input/output descriptions.
 * 
 */
@RootElement(name = "ReviseInventoryStatusRequest", namespace = "urn:ebay:apis:eBLBaseComponents")
public class ReviseInventoryStatusRequestType extends AbstractRequestType implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element(name = "InventoryStatus")
	private List<InventoryStatusType> inventoryStatus;
	
    
	/**
     * public getter
     *
     * 
     * Contains the updated quantity and/or price of a listing
     * being revised. You should not modify the same listing twice
     * (by using a duplicate ItemID or SKU) in the same request;
     * otherwise, you may get an error or unexpected results.
     * (For example, you should not use one InventoryStatus node to
     * update the quantity and another InventoryStatus node to update
     * the price of the same item.) You can pass up to 4 InventoryStatus nodes in a single request.
     * 
     *
     * @returns java.util.List<ebay.apis.eblbasecomponents.InventoryStatusType>
	 */
	public List<InventoryStatusType> getInventoryStatus() {
	    return this.inventoryStatus;
	}
	
	/**
	 * public setter
	 *
     * 
     * Contains the updated quantity and/or price of a listing
     * being revised. You should not modify the same listing twice
     * (by using a duplicate ItemID or SKU) in the same request;
     * otherwise, you may get an error or unexpected results.
     * (For example, you should not use one InventoryStatus node to
     * update the quantity and another InventoryStatus node to update
     * the price of the same item.) You can pass up to 4 InventoryStatus nodes in a single request.
     * 
     *
     * @param java.util.List<ebay.apis.eblbasecomponents.InventoryStatusType>
	 */
	public void setInventoryStatus(List<InventoryStatusType> inventoryStatus) {
	    this.inventoryStatus = inventoryStatus;
	}

}