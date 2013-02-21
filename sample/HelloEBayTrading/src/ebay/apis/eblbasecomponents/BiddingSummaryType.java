// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package ebay.apis.eblbasecomponents;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;
import java.util.List;

/**
 * 
 * Contains bidding summary information for the bidder of an item.
 * 
 */
public class BiddingSummaryType implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element(name = "SummaryDays")
	private Integer summaryDays;
	
	@Element(name = "TotalBids")
	private Integer totalBids;
	
	@Element(name = "BidActivityWithSeller")
	private Integer bidActivityWithSeller;
	
	@Element(name = "BidsToUniqueSellers")
	private Integer bidsToUniqueSellers;
	
	@Element(name = "BidsToUniqueCategories")
	private Integer bidsToUniqueCategories;
	
	@Element(name = "BidRetractions")
	private Integer bidRetractions;
	
	@Element(name = "ItemBidDetails")
	private List<ItemBidDetailsType> itemBidDetails;
	
    
	/**
     * public getter
     *
     * 
     * The number of days included in the summary. Currently always
     * set to 30 days.
     * 
     *
     * @returns java.lang.Integer
	 */
	public Integer getSummaryDays() {
	    return this.summaryDays;
	}
	
	/**
	 * public setter
	 *
     * 
     * The number of days included in the summary. Currently always
     * set to 30 days.
     * 
     *
     * @param java.lang.Integer
	 */
	public void setSummaryDays(Integer summaryDays) {
	    this.summaryDays = summaryDays;
	}
	/**
     * public getter
     *
     * 
     * The total number of bids that the bidder has placed.
     * 
     *
     * @returns java.lang.Integer
	 */
	public Integer getTotalBids() {
	    return this.totalBids;
	}
	
	/**
	 * public setter
	 *
     * 
     * The total number of bids that the bidder has placed.
     * 
     *
     * @param java.lang.Integer
	 */
	public void setTotalBids(Integer totalBids) {
	    this.totalBids = totalBids;
	}
	/**
     * public getter
     *
     * 
     * Percentage of the bidder's total bids that the bidder
     * placed on items that the seller is offering.
     * 
     *
     * @returns java.lang.Integer
	 */
	public Integer getBidActivityWithSeller() {
	    return this.bidActivityWithSeller;
	}
	
	/**
	 * public setter
	 *
     * 
     * Percentage of the bidder's total bids that the bidder
     * placed on items that the seller is offering.
     * 
     *
     * @param java.lang.Integer
	 */
	public void setBidActivityWithSeller(Integer bidActivityWithSeller) {
	    this.bidActivityWithSeller = bidActivityWithSeller;
	}
	/**
     * public getter
     *
     * 
     * Number of unique sellers whose items the bidder has placed
     * bids on.
     * 
     *
     * @returns java.lang.Integer
	 */
	public Integer getBidsToUniqueSellers() {
	    return this.bidsToUniqueSellers;
	}
	
	/**
	 * public setter
	 *
     * 
     * Number of unique sellers whose items the bidder has placed
     * bids on.
     * 
     *
     * @param java.lang.Integer
	 */
	public void setBidsToUniqueSellers(Integer bidsToUniqueSellers) {
	    this.bidsToUniqueSellers = bidsToUniqueSellers;
	}
	/**
     * public getter
     *
     * 
     * For items that the bidder has bid on, the number of unique
     * categories that they belong to.
     * 
     *
     * @returns java.lang.Integer
	 */
	public Integer getBidsToUniqueCategories() {
	    return this.bidsToUniqueCategories;
	}
	
	/**
	 * public setter
	 *
     * 
     * For items that the bidder has bid on, the number of unique
     * categories that they belong to.
     * 
     *
     * @param java.lang.Integer
	 */
	public void setBidsToUniqueCategories(Integer bidsToUniqueCategories) {
	    this.bidsToUniqueCategories = bidsToUniqueCategories;
	}
	/**
     * public getter
     *
     * 
     * The total number of bids that the bidder has retracted.
     * 
     *
     * @returns java.lang.Integer
	 */
	public Integer getBidRetractions() {
	    return this.bidRetractions;
	}
	
	/**
	 * public setter
	 *
     * 
     * The total number of bids that the bidder has retracted.
     * 
     *
     * @param java.lang.Integer
	 */
	public void setBidRetractions(Integer bidRetractions) {
	    this.bidRetractions = bidRetractions;
	}
	/**
     * public getter
     *
     * 
     * Detail bidding information on the items that the bidder has
     * bid on.
     * 
     *
     * @returns java.util.List<ebay.apis.eblbasecomponents.ItemBidDetailsType>
	 */
	public List<ItemBidDetailsType> getItemBidDetails() {
	    return this.itemBidDetails;
	}
	
	/**
	 * public setter
	 *
     * 
     * Detail bidding information on the items that the bidder has
     * bid on.
     * 
     *
     * @param java.util.List<ebay.apis.eblbasecomponents.ItemBidDetailsType>
	 */
	public void setItemBidDetails(List<ItemBidDetailsType> itemBidDetails) {
	    this.itemBidDetails = itemBidDetails;
	}

}