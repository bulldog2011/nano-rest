// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package ebay.apis.eblbasecomponents;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;

/**
 * 
 * <b>No longer recommended.</b> The eBay Store Cross Promotions are no longer
 * supported in the Trading API. Retrieves a list of upsell or cross-sell items associated
 * with the specified Item ID.
 * 
 */
@RootElement(name = "GetCrossPromotionsRequest", namespace = "urn:ebay:apis:eBLBaseComponents")
public class GetCrossPromotionsRequestType extends AbstractRequestType implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element(name = "ItemID")
	private String itemID;
	
	@Element(name = "PromotionMethod")
	private PromotionMethodCodeType promotionMethod;
	
	@Element(name = "PromotionViewMode")
	private TradingRoleCodeType promotionViewMode;
	
    
	/**
     * public getter
     *
     * 
     * The unique ID of the referring item. The cross-promoted
     * items will supplement this item.
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
     * The unique ID of the referring item. The cross-promoted
     * items will supplement this item.
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
     * The cross-promotion method you want to use for the
     * returned list, either UpSell or CrossSell.
     * 
     *
     * @returns ebay.apis.eblbasecomponents.PromotionMethodCodeType
	 */
	public PromotionMethodCodeType getPromotionMethod() {
	    return this.promotionMethod;
	}
	
	/**
	 * public setter
	 *
     * 
     * The cross-promotion method you want to use for the
     * returned list, either UpSell or CrossSell.
     * 
     *
     * @param ebay.apis.eblbasecomponents.PromotionMethodCodeType
	 */
	public void setPromotionMethod(PromotionMethodCodeType promotionMethod) {
	    this.promotionMethod = promotionMethod;
	}
	/**
     * public getter
     *
     * 
     * The role of the person requesting to view the cross-promoted
     * items, either seller or buyer. Default is buyer.
     * 
     *
     * @returns ebay.apis.eblbasecomponents.TradingRoleCodeType
	 */
	public TradingRoleCodeType getPromotionViewMode() {
	    return this.promotionViewMode;
	}
	
	/**
	 * public setter
	 *
     * 
     * The role of the person requesting to view the cross-promoted
     * items, either seller or buyer. Default is buyer.
     * 
     *
     * @param ebay.apis.eblbasecomponents.TradingRoleCodeType
	 */
	public void setPromotionViewMode(TradingRoleCodeType promotionViewMode) {
	    this.promotionViewMode = promotionViewMode;
	}

}