// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package ebay.apis.eblbasecomponents;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;

/**
 * 
 * Contains various details about the current status of a listing. These
 * values are computed by eBay and cannot be specified at listing time.
 * 
 */
public class SellingStatusType implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element(name = "ConvertedCurrentPrice")
	private AmountType convertedCurrentPrice;
	
	@Element(name = "CurrentPrice")
	private AmountType currentPrice;
	
	@Element(name = "QuantitySold")
	private Integer quantitySold;
	
    
	/**
     * public getter
     *
     * 
     * Not used. See Item.ConvertedCurrentPrice.
     * 
     *
     * @returns ebay.apis.eblbasecomponents.AmountType
	 */
	public AmountType getConvertedCurrentPrice() {
	    return this.convertedCurrentPrice;
	}
	
	/**
	 * public setter
	 *
     * 
     * Not used. See Item.ConvertedCurrentPrice.
     * 
     *
     * @param ebay.apis.eblbasecomponents.AmountType
	 */
	public void setConvertedCurrentPrice(AmountType convertedCurrentPrice) {
	    this.convertedCurrentPrice = convertedCurrentPrice;
	}
	/**
     * public getter
     *
     * 
     * Not used. See Item.CurrentPrice and Variation.StartPrice.
     * 
     *
     * @returns ebay.apis.eblbasecomponents.AmountType
	 */
	public AmountType getCurrentPrice() {
	    return this.currentPrice;
	}
	
	/**
	 * public setter
	 *
     * 
     * Not used. See Item.CurrentPrice and Variation.StartPrice.
     * 
     *
     * @param ebay.apis.eblbasecomponents.AmountType
	 */
	public void setCurrentPrice(AmountType currentPrice) {
	    this.currentPrice = currentPrice;
	}
	/**
     * public getter
     *
     * 
     * The number of items sold from this variation. Subtract from
     * Quantity to determine the number of items available.
     * 
     *
     * @returns java.lang.Integer
	 */
	public Integer getQuantitySold() {
	    return this.quantitySold;
	}
	
	/**
	 * public setter
	 *
     * 
     * The number of items sold from this variation. Subtract from
     * Quantity to determine the number of items available.
     * 
     *
     * @param java.lang.Integer
	 */
	public void setQuantitySold(Integer quantitySold) {
	    this.quantitySold = quantitySold;
	}

}