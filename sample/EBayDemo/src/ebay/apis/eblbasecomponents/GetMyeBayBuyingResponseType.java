// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package ebay.apis.eblbasecomponents;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;
import java.util.List;

/**
 * 
 * Returns items from All Buying or All Favorites in the user's My eBay account.
 * 
 */
@RootElement(name = "GetMyeBayBuyingResponse", namespace = "urn:ebay:apis:eBLBaseComponents")
public class GetMyeBayBuyingResponseType extends AbstractResponseType implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element(name = "BuyingSummary")
	private BuyingSummaryType buyingSummary;
	
	@Element(name = "WatchList")
	private PaginatedItemArrayType watchList;
	
	@Element(name = "BidList")
	private PaginatedItemArrayType bidList;
	
	@Element(name = "BestOfferList")
	private PaginatedItemArrayType bestOfferList;
	
	@Element(name = "WonList")
	private PaginatedOrderTransactionArrayType wonList;
	
	@Element(name = "LostList")
	private PaginatedItemArrayType lostList;
	
	@Element(name = "FavoriteSearches")
	private MyeBayFavoriteSearchListType favoriteSearches;
	
	@Element(name = "FavoriteSellers")
	private MyeBayFavoriteSellerListType favoriteSellers;
	
	@Element(name = "SecondChanceOffer")
	private List<ItemType> secondChanceOffer;
	
	@Element(name = "BidAssistantList")
	private BidGroupArrayType bidAssistantList;
	
	@Element(name = "DeletedFromWonList")
	private PaginatedOrderTransactionArrayType deletedFromWonList;
	
	@Element(name = "DeletedFromLostList")
	private PaginatedItemArrayType deletedFromLostList;
	
	@Element(name = "UserDefinedList")
	private List<UserDefinedListType> userDefinedList;
	
    
	/**
     * public getter
     *
     * 
     * Contains a summary of the items the user has bid on. Returned at all detail
     * levels.
     * 
     *
     * @returns ebay.apis.eblbasecomponents.BuyingSummaryType
	 */
	public BuyingSummaryType getBuyingSummary() {
	    return this.buyingSummary;
	}
	
	/**
	 * public setter
	 *
     * 
     * Contains a summary of the items the user has bid on. Returned at all detail
     * levels.
     * 
     *
     * @param ebay.apis.eblbasecomponents.BuyingSummaryType
	 */
	public void setBuyingSummary(BuyingSummaryType buyingSummary) {
	    this.buyingSummary = buyingSummary;
	}
	/**
     * public getter
     *
     * 
     * Contains the items the user is watching. Only returned if items exist that
     * meet the request criteria.
     * 
     *
     * @returns ebay.apis.eblbasecomponents.PaginatedItemArrayType
	 */
	public PaginatedItemArrayType getWatchList() {
	    return this.watchList;
	}
	
	/**
	 * public setter
	 *
     * 
     * Contains the items the user is watching. Only returned if items exist that
     * meet the request criteria.
     * 
     *
     * @param ebay.apis.eblbasecomponents.PaginatedItemArrayType
	 */
	public void setWatchList(PaginatedItemArrayType watchList) {
	    this.watchList = watchList;
	}
	/**
     * public getter
     *
     * 
     * Contains all the items the buyer has bid on.
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
     * Contains all the items the buyer has bid on.
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
     * Contains the items the user has placed Best Offers on. Only returned if
     * items exist that meet the request criteria.
     * 
     *
     * @returns ebay.apis.eblbasecomponents.PaginatedItemArrayType
	 */
	public PaginatedItemArrayType getBestOfferList() {
	    return this.bestOfferList;
	}
	
	/**
	 * public setter
	 *
     * 
     * Contains the items the user has placed Best Offers on. Only returned if
     * items exist that meet the request criteria.
     * 
     *
     * @param ebay.apis.eblbasecomponents.PaginatedItemArrayType
	 */
	public void setBestOfferList(PaginatedItemArrayType bestOfferList) {
	    this.bestOfferList = bestOfferList;
	}
	/**
     * public getter
     *
     * 
     * Contains the items the user has bid on and won. Only returned if items
     * exist that meet the request criteria.
     * 
     *
     * @returns ebay.apis.eblbasecomponents.PaginatedOrderTransactionArrayType
	 */
	public PaginatedOrderTransactionArrayType getWonList() {
	    return this.wonList;
	}
	
	/**
	 * public setter
	 *
     * 
     * Contains the items the user has bid on and won. Only returned if items
     * exist that meet the request criteria.
     * 
     *
     * @param ebay.apis.eblbasecomponents.PaginatedOrderTransactionArrayType
	 */
	public void setWonList(PaginatedOrderTransactionArrayType wonList) {
	    this.wonList = wonList;
	}
	/**
     * public getter
     *
     * 
     * Contains the items the user has bid on and lost. Only returned if items
     * exist that meet the request criteria.
     * 
     *
     * @returns ebay.apis.eblbasecomponents.PaginatedItemArrayType
	 */
	public PaginatedItemArrayType getLostList() {
	    return this.lostList;
	}
	
	/**
	 * public setter
	 *
     * 
     * Contains the items the user has bid on and lost. Only returned if items
     * exist that meet the request criteria.
     * 
     *
     * @param ebay.apis.eblbasecomponents.PaginatedItemArrayType
	 */
	public void setLostList(PaginatedItemArrayType lostList) {
	    this.lostList = lostList;
	}
	/**
     * public getter
     *
     * 
     * Contains a list of the user's favorite searches. Only returned if the
     * user has Favorite Searches. The search name, search query, and search
     * elements, such as QueryKeywords, SortOrder, and Condition are returned.
     * <br><br>
     * You can paste the Search Query response, that comes back as a URL, into a browser
     * to re-play the Favorite Search.
     * <br><br>
     * The search elements that are returned by this call can be used as input
     * for the Shopping Web Service FindItemsAdvanced request.
     * 
     *
     * @returns ebay.apis.eblbasecomponents.MyeBayFavoriteSearchListType
	 */
	public MyeBayFavoriteSearchListType getFavoriteSearches() {
	    return this.favoriteSearches;
	}
	
	/**
	 * public setter
	 *
     * 
     * Contains a list of the user's favorite searches. Only returned if the
     * user has Favorite Searches. The search name, search query, and search
     * elements, such as QueryKeywords, SortOrder, and Condition are returned.
     * <br><br>
     * You can paste the Search Query response, that comes back as a URL, into a browser
     * to re-play the Favorite Search.
     * <br><br>
     * The search elements that are returned by this call can be used as input
     * for the Shopping Web Service FindItemsAdvanced request.
     * 
     *
     * @param ebay.apis.eblbasecomponents.MyeBayFavoriteSearchListType
	 */
	public void setFavoriteSearches(MyeBayFavoriteSearchListType favoriteSearches) {
	    this.favoriteSearches = favoriteSearches;
	}
	/**
     * public getter
     *
     * 
     * Contains a list of the user's favorite sellers. Only returned if items
     * exist that meet the request criteria.
     * 
     *
     * @returns ebay.apis.eblbasecomponents.MyeBayFavoriteSellerListType
	 */
	public MyeBayFavoriteSellerListType getFavoriteSellers() {
	    return this.favoriteSellers;
	}
	
	/**
	 * public setter
	 *
     * 
     * Contains a list of the user's favorite sellers. Only returned if items
     * exist that meet the request criteria.
     * 
     *
     * @param ebay.apis.eblbasecomponents.MyeBayFavoriteSellerListType
	 */
	public void setFavoriteSellers(MyeBayFavoriteSellerListType favoriteSellers) {
	    this.favoriteSellers = favoriteSellers;
	}
	/**
     * public getter
     *
     * 
     * Contains the list of second chance offers the user has received. Only
     * returned if items exist that meet the request criteria.
     * 
     *
     * @returns java.util.List<ebay.apis.eblbasecomponents.ItemType>
	 */
	public List<ItemType> getSecondChanceOffer() {
	    return this.secondChanceOffer;
	}
	
	/**
	 * public setter
	 *
     * 
     * Contains the list of second chance offers the user has received. Only
     * returned if items exist that meet the request criteria.
     * 
     *
     * @param java.util.List<ebay.apis.eblbasecomponents.ItemType>
	 */
	public void setSecondChanceOffer(List<ItemType> secondChanceOffer) {
	    this.secondChanceOffer = secondChanceOffer;
	}
	/**
     * public getter
     *
     * 
     * 
     * Contains the items that were bid on using the Bid Assistant feature.
     * 
     *
     * @returns ebay.apis.eblbasecomponents.BidGroupArrayType
	 */
	public BidGroupArrayType getBidAssistantList() {
	    return this.bidAssistantList;
	}
	
	/**
	 * public setter
	 *
     * 
     * 
     * Contains the items that were bid on using the Bid Assistant feature.
     * 
     *
     * @param ebay.apis.eblbasecomponents.BidGroupArrayType
	 */
	public void setBidAssistantList(BidGroupArrayType bidAssistantList) {
	    this.bidAssistantList = bidAssistantList;
	}
	/**
     * public getter
     *
     * 
     * Contains the items the buyer has bid on, won, and deleted from My eBay.
     * Only returned if items exist that meet the request criteria.
     * 
     *
     * @returns ebay.apis.eblbasecomponents.PaginatedOrderTransactionArrayType
	 */
	public PaginatedOrderTransactionArrayType getDeletedFromWonList() {
	    return this.deletedFromWonList;
	}
	
	/**
	 * public setter
	 *
     * 
     * Contains the items the buyer has bid on, won, and deleted from My eBay.
     * Only returned if items exist that meet the request criteria.
     * 
     *
     * @param ebay.apis.eblbasecomponents.PaginatedOrderTransactionArrayType
	 */
	public void setDeletedFromWonList(PaginatedOrderTransactionArrayType deletedFromWonList) {
	    this.deletedFromWonList = deletedFromWonList;
	}
	/**
     * public getter
     *
     * 
     * Contains the items the buyer has bid on, lost, and deleted from My eBay.
     * Only returned if items exist that meet the request criteria.
     * 
     *
     * @returns ebay.apis.eblbasecomponents.PaginatedItemArrayType
	 */
	public PaginatedItemArrayType getDeletedFromLostList() {
	    return this.deletedFromLostList;
	}
	
	/**
	 * public setter
	 *
     * 
     * Contains the items the buyer has bid on, lost, and deleted from My eBay.
     * Only returned if items exist that meet the request criteria.
     * 
     *
     * @param ebay.apis.eblbasecomponents.PaginatedItemArrayType
	 */
	public void setDeletedFromLostList(PaginatedItemArrayType deletedFromLostList) {
	    this.deletedFromLostList = deletedFromLostList;
	}
	/**
     * public getter
     *
     * 
     * Contains the items, searches, or sellers that the user has saved to this 
     * list using the "Add to list" feature.  The name of the list is given by the 
     * "Name" element. Returned only if UserDefineLists is specified in the request.
     * 
     *
     * @returns java.util.List<ebay.apis.eblbasecomponents.UserDefinedListType>
	 */
	public List<UserDefinedListType> getUserDefinedList() {
	    return this.userDefinedList;
	}
	
	/**
	 * public setter
	 *
     * 
     * Contains the items, searches, or sellers that the user has saved to this 
     * list using the "Add to list" feature.  The name of the list is given by the 
     * "Name" element. Returned only if UserDefineLists is specified in the request.
     * 
     *
     * @param java.util.List<ebay.apis.eblbasecomponents.UserDefinedListType>
	 */
	public void setUserDefinedList(List<UserDefinedListType> userDefinedList) {
	    this.userDefinedList = userDefinedList;
	}

}