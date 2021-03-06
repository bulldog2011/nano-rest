// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package ebay.apis.eblbasecomponents;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;

/**
 * 
 * Lightweight type for updating basic inventory status details. 
 * Primarily intended for bulk use cases.
 * 
 */
public class InventoryStatusType implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element(name = "SKU")
	private String sku;
	
	@Element(name = "ItemID")
	private String itemID;
	
	@Element(name = "StartPrice")
	private AmountType startPrice;
	
	@Element(name = "Quantity")
	private Integer quantity;
	
    
	/**
     * public getter
     *
     * 
     * The unique SKU of the item being revised. 
     * A SKU (stock keeping unit) is an identifier defined by a seller. 
     * SKU can only be used to revise an item if you listed the item by 
     * using AddFixedPriceItem or RelistFixedPriceItem, and:<br>
     * 1) You set Item.InventoryTrackingMethod to SKU at 
     * the time the item was listed; or <br>
     * 2) You are modifying a multi-variation listing, and the SKU 
     * identifies one of the variations. (In this case, if InventoryTrackingMethod was set to ItemID, then you also need to specify ItemID in the request.)<br>
     * (These criteria are necessary to 
     * uniquely identify the listing or variation by a SKU.)<br>
     * <br>
     * In the ReviseInventoryStatus request, if the listing has 
     * InventoryTrackingMethod set to SKU, then either ItemID or SKU is 
     * required. If both are passed in and they don't refer to the 
     * same listing, eBay ignores SKU and considers only the ItemID.<br>
     * <br>
     * If the listing has variations and InventoryTrackingMethod is set 
     * to ItemID, then ItemID and SKU are both required.<br>
     * <br>
     * In the response, SKU may be returned as an empty element if
     * it was not defined on the listing.
     * 
     *
     * @returns java.lang.String
	 */
	public String getSku() {
	    return this.sku;
	}
	
	/**
	 * public setter
	 *
     * 
     * The unique SKU of the item being revised. 
     * A SKU (stock keeping unit) is an identifier defined by a seller. 
     * SKU can only be used to revise an item if you listed the item by 
     * using AddFixedPriceItem or RelistFixedPriceItem, and:<br>
     * 1) You set Item.InventoryTrackingMethod to SKU at 
     * the time the item was listed; or <br>
     * 2) You are modifying a multi-variation listing, and the SKU 
     * identifies one of the variations. (In this case, if InventoryTrackingMethod was set to ItemID, then you also need to specify ItemID in the request.)<br>
     * (These criteria are necessary to 
     * uniquely identify the listing or variation by a SKU.)<br>
     * <br>
     * In the ReviseInventoryStatus request, if the listing has 
     * InventoryTrackingMethod set to SKU, then either ItemID or SKU is 
     * required. If both are passed in and they don't refer to the 
     * same listing, eBay ignores SKU and considers only the ItemID.<br>
     * <br>
     * If the listing has variations and InventoryTrackingMethod is set 
     * to ItemID, then ItemID and SKU are both required.<br>
     * <br>
     * In the response, SKU may be returned as an empty element if
     * it was not defined on the listing.
     * 
     *
     * @param java.lang.String
	 */
	public void setSku(String sku) {
	    this.sku = sku;
	}
	/**
     * public getter
     *
     * 
     * The ItemID of a listing being changed. <br>
     * <br>
     * In the ReviseInventoryStatus request, either ItemID or SKU is 
     * required. If both are passed in and the SKU does not match, 
     * eBay ignores SKU and considers only the ItemID.<br>
     * <br>
     * Please note that the same ItemID can be returned
     * multiple times in the same response if you revise several
     * variations from the same multi-variation listing.
     * 
     *
     * @returns java.lang.String
	 */
	public String getItemID() {
	    return this.itemID;
	}
	
	/**
	 * public setter
	 *
     * 
     * The ItemID of a listing being changed. <br>
     * <br>
     * In the ReviseInventoryStatus request, either ItemID or SKU is 
     * required. If both are passed in and the SKU does not match, 
     * eBay ignores SKU and considers only the ItemID.<br>
     * <br>
     * Please note that the same ItemID can be returned
     * multiple times in the same response if you revise several
     * variations from the same multi-variation listing.
     * 
     *
     * @param java.lang.String
	 */
	public void setItemID(String itemID) {
	    this.itemID = itemID;
	}
	/**
     * public getter
     *
     * 
     * Specifies the revised fixed price of the listing (or of a 
     * variation within a multi-variation listing).
     * If you raise the price of a listing, the recent sales score of 
     * the listing is reset. (Best Match search ranking is based on 
     * buyer activity, and one of the factors affecting search ranking 
     * for fixed-price listings is the recent sales score.)<br>
     * <br>
     * Raising a listing's price may also affect the insertion fee 
     * (and therefore the overall listing fee).<br>
     * <br>
     * ReviseInventoryStatus requires either StartPrice or Quantity (or both) for each InventoryStatus node in the request. 
     * 
     *
     * @returns ebay.apis.eblbasecomponents.AmountType
	 */
	public AmountType getStartPrice() {
	    return this.startPrice;
	}
	
	/**
	 * public setter
	 *
     * 
     * Specifies the revised fixed price of the listing (or of a 
     * variation within a multi-variation listing).
     * If you raise the price of a listing, the recent sales score of 
     * the listing is reset. (Best Match search ranking is based on 
     * buyer activity, and one of the factors affecting search ranking 
     * for fixed-price listings is the recent sales score.)<br>
     * <br>
     * Raising a listing's price may also affect the insertion fee 
     * (and therefore the overall listing fee).<br>
     * <br>
     * ReviseInventoryStatus requires either StartPrice or Quantity (or both) for each InventoryStatus node in the request. 
     * 
     *
     * @param ebay.apis.eblbasecomponents.AmountType
	 */
	public void setStartPrice(AmountType startPrice) {
	    this.startPrice = startPrice;
	}
	/**
     * public getter
     *
     * 
     * Specifies the latest quantity of the listing (or of a variation
     * within a multi-variation listing).<br>
     * <br>
     * <b>For the ReviseInventoryStatus request:</b> 
     * Specify the entire quantity that is currently available for sale.
     * (Typically, you only pass this in when you need to update
     * the quantity.)<br>
     * <br>
     * ReviseInventoryStatus requires either StartPrice or Quantity 
     * (or you can specify both) for each InventoryStatus node in 
     * the request.<br>
     * <br>
     * <b>For the ReviseInventoryStatus response:</b> 
     * This returns a total of the quantity available for sale 
     * plus the quantity already sold. For example, suppose the 
     * listing originally had Quantity=10, and then 8 sold. Now you 
     * restock your inventory, and you pass Quantity=10 in the 
     * ReviseInventoryStatus request. In this case, 
     * ReviseInventoryStatus returns Quantity=18 
     * (10 available + 8 sold).
     * To determine the quantity available, use GetItem or GetSellerList, 
     * and subtract SellingStatus.QuantitySold from Quantity.
     * Or see QuantityAvailable in GetMyeBaySelling.<br>
     * <br>
     * It is a good idea to maintain an adequate quantity available for 
     * fixed-price GTC listings to prevent the search rankings from 
     * dropping. Best Match search ranking is based on buyer activity, 
     * and one of the factors affecting search ranking for fixed-price 
     * listings is the recent sales score. Fixed-price items that are 
     * selling the fastest are given a relative lift in search results. 
     * Recent Sales history is tracked with a moving window to ensure it 
     * reflects the most recent activity. Due to he moving window, it is 
     * advantageous to maintain item availability (Quantity-QuantitySold) 
     * for a GTC listing.
     * 
     *
     * @returns java.lang.Integer
	 */
	public Integer getQuantity() {
	    return this.quantity;
	}
	
	/**
	 * public setter
	 *
     * 
     * Specifies the latest quantity of the listing (or of a variation
     * within a multi-variation listing).<br>
     * <br>
     * <b>For the ReviseInventoryStatus request:</b> 
     * Specify the entire quantity that is currently available for sale.
     * (Typically, you only pass this in when you need to update
     * the quantity.)<br>
     * <br>
     * ReviseInventoryStatus requires either StartPrice or Quantity 
     * (or you can specify both) for each InventoryStatus node in 
     * the request.<br>
     * <br>
     * <b>For the ReviseInventoryStatus response:</b> 
     * This returns a total of the quantity available for sale 
     * plus the quantity already sold. For example, suppose the 
     * listing originally had Quantity=10, and then 8 sold. Now you 
     * restock your inventory, and you pass Quantity=10 in the 
     * ReviseInventoryStatus request. In this case, 
     * ReviseInventoryStatus returns Quantity=18 
     * (10 available + 8 sold).
     * To determine the quantity available, use GetItem or GetSellerList, 
     * and subtract SellingStatus.QuantitySold from Quantity.
     * Or see QuantityAvailable in GetMyeBaySelling.<br>
     * <br>
     * It is a good idea to maintain an adequate quantity available for 
     * fixed-price GTC listings to prevent the search rankings from 
     * dropping. Best Match search ranking is based on buyer activity, 
     * and one of the factors affecting search ranking for fixed-price 
     * listings is the recent sales score. Fixed-price items that are 
     * selling the fastest are given a relative lift in search results. 
     * Recent Sales history is tracked with a moving window to ensure it 
     * reflects the most recent activity. Due to he moving window, it is 
     * advantageous to maintain item availability (Quantity-QuantitySold) 
     * for a GTC listing.
     * 
     *
     * @param java.lang.Integer
	 */
	public void setQuantity(Integer quantity) {
	    this.quantity = quantity;
	}

}