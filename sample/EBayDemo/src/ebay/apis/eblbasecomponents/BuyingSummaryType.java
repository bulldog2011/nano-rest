// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package ebay.apis.eblbasecomponents;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;

/**
 * 
 * Type defining the <b>BuyingSummary</b> container returned in 
 * <b>GetMyeBayBuying<b>. The <b>BuyingSummary</b> container 
 * consists of data that summarizes the buyer's recent buying activity, including the 
 * number of items bid on, the number of items buyer is winning, and the number of items 
 * the buyer has won. The <b>BuyingSummary</b> container is only returned if
 * the <b>BuyingSummary.Include</b> field is included in the GetMyeBayBuying request and set to 
 * 'true'. 
 * 
 */
public class BuyingSummaryType implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element(name = "BiddingCount")
	private Integer biddingCount;
	
	@Element(name = "WinningCount")
	private Integer winningCount;
	
	@Element(name = "TotalWinningCost")
	private AmountType totalWinningCost;
	
	@Element(name = "WonCount")
	private Integer wonCount;
	
	@Element(name = "TotalWonCost")
	private AmountType totalWonCost;
	
	@Element(name = "WonDurationInDays")
	private Integer wonDurationInDays;
	
	@Element(name = "BestOfferCount")
	private Integer bestOfferCount;
	
    
	/**
     * public getter
     *
     * 
     *      The number of auction items the user has bid on.
     * 
     *
     * @returns java.lang.Integer
	 */
	public Integer getBiddingCount() {
	    return this.biddingCount;
	}
	
	/**
	 * public setter
	 *
     * 
     *      The number of auction items the user has bid on.
     * 
     *
     * @param java.lang.Integer
	 */
	public void setBiddingCount(Integer biddingCount) {
	    this.biddingCount = biddingCount;
	}
	/**
     * public getter
     *
     * 
     *  The number of auction items the user has bid on and is winning, but auctions have not yet ended.
     * 
     *
     * @returns java.lang.Integer
	 */
	public Integer getWinningCount() {
	    return this.winningCount;
	}
	
	/**
	 * public setter
	 *
     * 
     *  The number of auction items the user has bid on and is winning, but auctions have not yet ended.
     * 
     *
     * @param java.lang.Integer
	 */
	public void setWinningCount(Integer winningCount) {
	    this.winningCount = winningCount;
	}
	/**
     * public getter
     *
     * 
     *      The total cost of items the user is presently winning.
     * 
     *
     * @returns ebay.apis.eblbasecomponents.AmountType
	 */
	public AmountType getTotalWinningCost() {
	    return this.totalWinningCost;
	}
	
	/**
	 * public setter
	 *
     * 
     *      The total cost of items the user is presently winning.
     * 
     *
     * @param ebay.apis.eblbasecomponents.AmountType
	 */
	public void setTotalWinningCost(AmountType totalWinningCost) {
	    this.totalWinningCost = totalWinningCost;
	}
	/**
     * public getter
     *
     * 
     * The number of items the user has bid on and won.
     * 
     *
     * @returns java.lang.Integer
	 */
	public Integer getWonCount() {
	    return this.wonCount;
	}
	
	/**
	 * public setter
	 *
     * 
     * The number of items the user has bid on and won.
     * 
     *
     * @param java.lang.Integer
	 */
	public void setWonCount(Integer wonCount) {
	    this.wonCount = wonCount;
	}
	/**
     * public getter
     *
     * 
     *  The total cost of items the user has bid on and won.
     * 
     *
     * @returns ebay.apis.eblbasecomponents.AmountType
	 */
	public AmountType getTotalWonCost() {
	    return this.totalWonCost;
	}
	
	/**
	 * public setter
	 *
     * 
     *  The total cost of items the user has bid on and won.
     * 
     *
     * @param ebay.apis.eblbasecomponents.AmountType
	 */
	public void setTotalWonCost(AmountType totalWonCost) {
	    this.totalWonCost = totalWonCost;
	}
	/**
     * public getter
     *
     * 
     * The time period for which won items are displayed. Default is 31 days.
     * 
     *
     * @returns java.lang.Integer
	 */
	public Integer getWonDurationInDays() {
	    return this.wonDurationInDays;
	}
	
	/**
	 * public setter
	 *
     * 
     * The time period for which won items are displayed. Default is 31 days.
     * 
     *
     * @param java.lang.Integer
	 */
	public void setWonDurationInDays(Integer wonDurationInDays) {
	    this.wonDurationInDays = wonDurationInDays;
	}
	/**
     * public getter
     *
     * 
     *     The number of items the user has made Best Offers on.
     *     
     *
     * @returns java.lang.Integer
	 */
	public Integer getBestOfferCount() {
	    return this.bestOfferCount;
	}
	
	/**
	 * public setter
	 *
     * 
     *     The number of items the user has made Best Offers on.
     *     
     *
     * @param java.lang.Integer
	 */
	public void setBestOfferCount(Integer bestOfferCount) {
	    this.bestOfferCount = bestOfferCount;
	}

}