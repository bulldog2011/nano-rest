// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package ebay.apis.eblbasecomponents;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;

/**
 * 
 * Contains detailed information about a bid.
 * 
 */
public class BiddingDetailsType implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element(name = "ConvertedMaxBid")
	private AmountType convertedMaxBid;
	
	@Element(name = "MaxBid")
	private AmountType maxBid;
	
	@Element(name = "QuantityBid")
	private Integer quantityBid;
	
	@Element(name = "QuantityWon")
	private Integer quantityWon;
	
	@Element(name = "Winning")
	private Boolean winning;
	
	@Element(name = "BidAssistant")
	private Boolean bidAssistant;
	
    
	/**
     * public getter
     *
     * 
     * Converted value of the amount in MaxBidAmount, in the currency
     * indicated by SiteCurrency.
     * For active items, refresh the listing's data every 24 hours to
     * pick up the current conversion rates. Under conditions where this
     * value would be inapplicable on the eBay site, this element is not returned
     * at all.
     * 
     *
     * @returns ebay.apis.eblbasecomponents.AmountType
	 */
	public AmountType getConvertedMaxBid() {
	    return this.convertedMaxBid;
	}
	
	/**
	 * public setter
	 *
     * 
     * Converted value of the amount in MaxBidAmount, in the currency
     * indicated by SiteCurrency.
     * For active items, refresh the listing's data every 24 hours to
     * pick up the current conversion rates. Under conditions where this
     * value would be inapplicable on the eBay site, this element is not returned
     * at all.
     * 
     *
     * @param ebay.apis.eblbasecomponents.AmountType
	 */
	public void setConvertedMaxBid(AmountType convertedMaxBid) {
	    this.convertedMaxBid = convertedMaxBid;
	}
	/**
     * public getter
     *
     * 
     * Indicates the maximum amount the user has agreed to pay for the item when the
     * user last submitted a bid. Under conditions where this value would be
     * N/A on the eBay site, this element is not returned at all.
     * 
     *
     * @returns ebay.apis.eblbasecomponents.AmountType
	 */
	public AmountType getMaxBid() {
	    return this.maxBid;
	}
	
	/**
	 * public setter
	 *
     * 
     * Indicates the maximum amount the user has agreed to pay for the item when the
     * user last submitted a bid. Under conditions where this value would be
     * N/A on the eBay site, this element is not returned at all.
     * 
     *
     * @param ebay.apis.eblbasecomponents.AmountType
	 */
	public void setMaxBid(AmountType maxBid) {
	    this.maxBid = maxBid;
	}
	/**
     * public getter
     *
     * 
     * Number of items from the listing the user agreed to purchase with a bid. For
     * single-item listings, always 1. For multi-item (Dutch) listings, the value will be
     * between 1 and the number of items offered in the auction, indicating the
     * number of items purchased so far.
     * <br><br>
     * <span class="tablenote"><strong>Note:</strong>
     * As of version 619, Dutch-style (multi-item) competitive-bid auctions are deprecated.
     * eBay throws an error if you submit a Dutch item listing with AddItem
     * or VerifyAddItem. If you use RelistItem to update a Dutch auction listing,
     * eBay generates a warning and resets the Quantity value to 1.
     * </span>
     * <br>
     * 
     *
     * @returns java.lang.Integer
	 */
	public Integer getQuantityBid() {
	    return this.quantityBid;
	}
	
	/**
	 * public setter
	 *
     * 
     * Number of items from the listing the user agreed to purchase with a bid. For
     * single-item listings, always 1. For multi-item (Dutch) listings, the value will be
     * between 1 and the number of items offered in the auction, indicating the
     * number of items purchased so far.
     * <br><br>
     * <span class="tablenote"><strong>Note:</strong>
     * As of version 619, Dutch-style (multi-item) competitive-bid auctions are deprecated.
     * eBay throws an error if you submit a Dutch item listing with AddItem
     * or VerifyAddItem. If you use RelistItem to update a Dutch auction listing,
     * eBay generates a warning and resets the Quantity value to 1.
     * </span>
     * <br>
     * 
     *
     * @param java.lang.Integer
	 */
	public void setQuantityBid(Integer quantityBid) {
	    this.quantityBid = quantityBid;
	}
	/**
     * public getter
     *
     * 
     * Used mainly for multi-item auctions (Dutch). For an active listing, indicates the
     * number of items the user stands to win if their bid wins. For a listing that has
     * ended, indicates the number of items the user actually won. In both cases, the number
     * may be less than that returned in QuantityBid, the user with the lowest winning bid in
     * a Dutch auction might not win all the items on which they bid.
     * <br><br>
     * <span class="tablenote"><strong>Note:</strong>
     * As of version 619, Dutch-style (multi-item) competitive-bid auctions are deprecated.
     * eBay throws an error if you submit a Dutch item listing with AddItem
     * or VerifyAddItem. If you use RelistItem to update a Dutch auction listing,
     * eBay generates a warning and resets the Quantity value to 1.
     * </span>
     * <br>
     * 
     *
     * @returns java.lang.Integer
	 */
	public Integer getQuantityWon() {
	    return this.quantityWon;
	}
	
	/**
	 * public setter
	 *
     * 
     * Used mainly for multi-item auctions (Dutch). For an active listing, indicates the
     * number of items the user stands to win if their bid wins. For a listing that has
     * ended, indicates the number of items the user actually won. In both cases, the number
     * may be less than that returned in QuantityBid, the user with the lowest winning bid in
     * a Dutch auction might not win all the items on which they bid.
     * <br><br>
     * <span class="tablenote"><strong>Note:</strong>
     * As of version 619, Dutch-style (multi-item) competitive-bid auctions are deprecated.
     * eBay throws an error if you submit a Dutch item listing with AddItem
     * or VerifyAddItem. If you use RelistItem to update a Dutch auction listing,
     * eBay generates a warning and resets the Quantity value to 1.
     * </span>
     * <br>
     * 
     *
     * @param java.lang.Integer
	 */
	public void setQuantityWon(Integer quantityWon) {
	    this.quantityWon = quantityWon;
	}
	/**
     * public getter
     *
     * 
     * (GetMyeBay only) Indicates whether the user is the current
     * high bidder in a currently active listing.
     * 
     *
     * @returns java.lang.Boolean
	 */
	public Boolean getWinning() {
	    return this.winning;
	}
	
	/**
	 * public setter
	 *
     * 
     * (GetMyeBay only) Indicates whether the user is the current
     * high bidder in a currently active listing.
     * 
     *
     * @param java.lang.Boolean
	 */
	public void setWinning(Boolean winning) {
	    this.winning = winning;
	}
	/**
     * public getter
     *
     * 
     * Indicates whether the current bid was placed by BidAssistant.
     * Only returns if true.
     * 
     *
     * @returns java.lang.Boolean
	 */
	public Boolean getBidAssistant() {
	    return this.bidAssistant;
	}
	
	/**
	 * public setter
	 *
     * 
     * Indicates whether the current bid was placed by BidAssistant.
     * Only returns if true.
     * 
     *
     * @param java.lang.Boolean
	 */
	public void setBidAssistant(Boolean bidAssistant) {
	    this.bidAssistant = bidAssistant;
	}

}