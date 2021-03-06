// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package ebay.apis.eblbasecomponents;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;

/**
 * 
 * Returns summary and detail information about items the user is selling,
 * items scheduled to sell, currently listed, sold, and closed but not sold.
 * 
 */
@RootElement(name = "GetMyeBaySellingResponse", namespace = "urn:ebay:apis:eBLBaseComponents")
public class GetMyeBaySellingResponseType extends AbstractResponseType implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element(name = "SellingSummary")
	private SellingSummaryType sellingSummary;
	
	@Element(name = "ScheduledList")
	private PaginatedItemArrayType scheduledList;
	
	@Element(name = "ActiveList")
	private PaginatedItemArrayType activeList;
	
	@Element(name = "SoldList")
	private PaginatedOrderTransactionArrayType soldList;
	
	@Element(name = "UnsoldList")
	private PaginatedItemArrayType unsoldList;
	
	@Element(name = "Summary")
	private MyeBaySellingSummaryType summary;
	
	@Element(name = "BidList")
	private PaginatedItemArrayType bidList;
	
	@Element(name = "DeletedFromSoldList")
	private PaginatedOrderTransactionArrayType deletedFromSoldList;
	
	@Element(name = "DeletedFromUnsoldList")
	private PaginatedItemArrayType deletedFromUnsoldList;
	
    
	/**
     * public getter
     *
     * 
     * Contains summary information about the items the user is selling.
     * 
     *
     * @returns ebay.apis.eblbasecomponents.SellingSummaryType
	 */
	public SellingSummaryType getSellingSummary() {
	    return this.sellingSummary;
	}
	
	/**
	 * public setter
	 *
     * 
     * Contains summary information about the items the user is selling.
     * 
     *
     * @param ebay.apis.eblbasecomponents.SellingSummaryType
	 */
	public void setSellingSummary(SellingSummaryType sellingSummary) {
	    this.sellingSummary = sellingSummary;
	}
	/**
     * public getter
     *
     * 
     * Contains the items the user has scheduled for sale, but whose listings have
     * not yet started.
     * 
     *
     * @returns ebay.apis.eblbasecomponents.PaginatedItemArrayType
	 */
	public PaginatedItemArrayType getScheduledList() {
	    return this.scheduledList;
	}
	
	/**
	 * public setter
	 *
     * 
     * Contains the items the user has scheduled for sale, but whose listings have
     * not yet started.
     * 
     *
     * @param ebay.apis.eblbasecomponents.PaginatedItemArrayType
	 */
	public void setScheduledList(PaginatedItemArrayType scheduledList) {
	    this.scheduledList = scheduledList;
	}
	/**
     * public getter
     *
     * 
     * Contains the items the user is selling that have active listings.
     * 
     *
     * @returns ebay.apis.eblbasecomponents.PaginatedItemArrayType
	 */
	public PaginatedItemArrayType getActiveList() {
	    return this.activeList;
	}
	
	/**
	 * public setter
	 *
     * 
     * Contains the items the user is selling that have active listings.
     * 
     *
     * @param ebay.apis.eblbasecomponents.PaginatedItemArrayType
	 */
	public void setActiveList(PaginatedItemArrayType activeList) {
	    this.activeList = activeList;
	}
	/**
     * public getter
     *
     * 
     * Contains the items the user has sold.
     * 
     *
     * @returns ebay.apis.eblbasecomponents.PaginatedOrderTransactionArrayType
	 */
	public PaginatedOrderTransactionArrayType getSoldList() {
	    return this.soldList;
	}
	
	/**
	 * public setter
	 *
     * 
     * Contains the items the user has sold.
     * 
     *
     * @param ebay.apis.eblbasecomponents.PaginatedOrderTransactionArrayType
	 */
	public void setSoldList(PaginatedOrderTransactionArrayType soldList) {
	    this.soldList = soldList;
	}
	/**
     * public getter
     *
     * 
     * Contains the items whose listings have ended but that have not sold.
     * 
     *
     * @returns ebay.apis.eblbasecomponents.PaginatedItemArrayType
	 */
	public PaginatedItemArrayType getUnsoldList() {
	    return this.unsoldList;
	}
	
	/**
	 * public setter
	 *
     * 
     * Contains the items whose listings have ended but that have not sold.
     * 
     *
     * @param ebay.apis.eblbasecomponents.PaginatedItemArrayType
	 */
	public void setUnsoldList(PaginatedItemArrayType unsoldList) {
	    this.unsoldList = unsoldList;
	}
	/**
     * public getter
     *
     * 
     * Contains summary information about the items the user is selling.
     * 
     *
     * @returns ebay.apis.eblbasecomponents.MyeBaySellingSummaryType
	 */
	public MyeBaySellingSummaryType getSummary() {
	    return this.summary;
	}
	
	/**
	 * public setter
	 *
     * 
     * Contains summary information about the items the user is selling.
     * 
     *
     * @param ebay.apis.eblbasecomponents.MyeBaySellingSummaryType
	 */
	public void setSummary(MyeBaySellingSummaryType summary) {
	    this.summary = summary;
	}
	/**
     * public getter
     *
     * 
     * Contains the seller's active listings with bids.
     * Only returned if items exist that meet the request criteria.
     * 
     *
     * @returns ebay.apis.eblbasecomponents.PaginatedItemArrayType
	 */
	public PaginatedItemArrayType getBidList() {
	    return this.bidList;
	}
	
	/**
	 * public setter
	 *
     * 
     * Contains the seller's active listings with bids.
     * Only returned if items exist that meet the request criteria.
     * 
     *
     * @param ebay.apis.eblbasecomponents.PaginatedItemArrayType
	 */
	public void setBidList(PaginatedItemArrayType bidList) {
	    this.bidList = bidList;
	}
	/**
     * public getter
     *
     * 
     * Contains the items the seller has sold and deleted from My eBay.
     * 
     *
     * @returns ebay.apis.eblbasecomponents.PaginatedOrderTransactionArrayType
	 */
	public PaginatedOrderTransactionArrayType getDeletedFromSoldList() {
	    return this.deletedFromSoldList;
	}
	
	/**
	 * public setter
	 *
     * 
     * Contains the items the seller has sold and deleted from My eBay.
     * 
     *
     * @param ebay.apis.eblbasecomponents.PaginatedOrderTransactionArrayType
	 */
	public void setDeletedFromSoldList(PaginatedOrderTransactionArrayType deletedFromSoldList) {
	    this.deletedFromSoldList = deletedFromSoldList;
	}
	/**
     * public getter
     *
     * 
     * Contains the items with listings that were ended or did not sell and have been deleted from My eBay.
     * 
     *
     * @returns ebay.apis.eblbasecomponents.PaginatedItemArrayType
	 */
	public PaginatedItemArrayType getDeletedFromUnsoldList() {
	    return this.deletedFromUnsoldList;
	}
	
	/**
	 * public setter
	 *
     * 
     * Contains the items with listings that were ended or did not sell and have been deleted from My eBay.
     * 
     *
     * @param ebay.apis.eblbasecomponents.PaginatedItemArrayType
	 */
	public void setDeletedFromUnsoldList(PaginatedItemArrayType deletedFromUnsoldList) {
	    this.deletedFromUnsoldList = deletedFromUnsoldList;
	}

}