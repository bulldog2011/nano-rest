// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package ebay.apis.eblbasecomponents;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;

/**
 * 
 * Returns items from the Buying section of the user's My eBay
 * account, including items that the user is watching, bidding on, has
 * won, has not won, and has made Best Offers on.
 * 
 */
@RootElement(name = "GetMyeBayBuyingRequest", namespace = "urn:ebay:apis:eBLBaseComponents")
public class GetMyeBayBuyingRequestType extends AbstractRequestType implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element(name = "WatchList")
	private ItemListCustomizationType watchList;
	
	@Element(name = "BidList")
	private ItemListCustomizationType bidList;
	
	@Element(name = "BestOfferList")
	private ItemListCustomizationType bestOfferList;
	
	@Element(name = "WonList")
	private ItemListCustomizationType wonList;
	
	@Element(name = "LostList")
	private ItemListCustomizationType lostList;
	
	@Element(name = "FavoriteSearches")
	private MyeBaySelectionType favoriteSearches;
	
	@Element(name = "FavoriteSellers")
	private MyeBaySelectionType favoriteSellers;
	
	@Element(name = "SecondChanceOffer")
	private MyeBaySelectionType secondChanceOffer;
	
	@Element(name = "BidAssistantList")
	private BidAssistantListType bidAssistantList;
	
	@Element(name = "DeletedFromWonList")
	private ItemListCustomizationType deletedFromWonList;
	
	@Element(name = "DeletedFromLostList")
	private ItemListCustomizationType deletedFromLostList;
	
	@Element(name = "BuyingSummary")
	private ItemListCustomizationType buyingSummary;
	
	@Element(name = "UserDefinedLists")
	private MyeBaySelectionType userDefinedLists;
	
	@Element(name = "HideVariations")
	private Boolean hideVariations;
	
    
	/**
     * public getter
     *
     * 
     * Returns the list of items being watched by the user.
     * <br><br>
     * Set Include to true to return the default response set.
     * 
     *
     * @returns ebay.apis.eblbasecomponents.ItemListCustomizationType
	 */
	public ItemListCustomizationType getWatchList() {
	    return this.watchList;
	}
	
	/**
	 * public setter
	 *
     * 
     * Returns the list of items being watched by the user.
     * <br><br>
     * Set Include to true to return the default response set.
     * 
     *
     * @param ebay.apis.eblbasecomponents.ItemListCustomizationType
	 */
	public void setWatchList(ItemListCustomizationType watchList) {
	    this.watchList = watchList;
	}
	/**
     * public getter
     *
     * 
     * Returns the list of items on which the user has bid.
     * <br><br>
     * Set Include to true to return the default response set.
     * 
     *
     * @returns ebay.apis.eblbasecomponents.ItemListCustomizationType
	 */
	public ItemListCustomizationType getBidList() {
	    return this.bidList;
	}
	
	/**
	 * public setter
	 *
     * 
     * Returns the list of items on which the user has bid.
     * <br><br>
     * Set Include to true to return the default response set.
     * 
     *
     * @param ebay.apis.eblbasecomponents.ItemListCustomizationType
	 */
	public void setBidList(ItemListCustomizationType bidList) {
	    this.bidList = bidList;
	}
	/**
     * public getter
     *
     * 
     * Returns the list of items on which the user has placed Best Offers.
     * <br><br>
     * Set Include to true to return the default response set.
     * 
     *
     * @returns ebay.apis.eblbasecomponents.ItemListCustomizationType
	 */
	public ItemListCustomizationType getBestOfferList() {
	    return this.bestOfferList;
	}
	
	/**
	 * public setter
	 *
     * 
     * Returns the list of items on which the user has placed Best Offers.
     * <br><br>
     * Set Include to true to return the default response set.
     * 
     *
     * @param ebay.apis.eblbasecomponents.ItemListCustomizationType
	 */
	public void setBestOfferList(ItemListCustomizationType bestOfferList) {
	    this.bestOfferList = bestOfferList;
	}
	/**
     * public getter
     *
     * 
     * Returns the list of items on which the use has bid.
     * <br><br>
     * Set Include to true to return the default response set.
     * 
     *
     * @returns ebay.apis.eblbasecomponents.ItemListCustomizationType
	 */
	public ItemListCustomizationType getWonList() {
	    return this.wonList;
	}
	
	/**
	 * public setter
	 *
     * 
     * Returns the list of items on which the use has bid.
     * <br><br>
     * Set Include to true to return the default response set.
     * 
     *
     * @param ebay.apis.eblbasecomponents.ItemListCustomizationType
	 */
	public void setWonList(ItemListCustomizationType wonList) {
	    this.wonList = wonList;
	}
	/**
     * public getter
     *
     * 
     * Returns the list of items on which the user has bid on and lost.
     * <br><br>
     * Set Include to true to return the default response set.
     * 
     *
     * @returns ebay.apis.eblbasecomponents.ItemListCustomizationType
	 */
	public ItemListCustomizationType getLostList() {
	    return this.lostList;
	}
	
	/**
	 * public setter
	 *
     * 
     * Returns the list of items on which the user has bid on and lost.
     * <br><br>
     * Set Include to true to return the default response set.
     * 
     *
     * @param ebay.apis.eblbasecomponents.ItemListCustomizationType
	 */
	public void setLostList(ItemListCustomizationType lostList) {
	    this.lostList = lostList;
	}
	/**
     * public getter
     *
     * 
     * Returns the list of searches that the user has saved in My eBay. Returned
     * only if the user has saved searches.
     * <br><br>
     * Set Include to true to return the default response set.
     * 
     *
     * @returns ebay.apis.eblbasecomponents.MyeBaySelectionType
	 */
	public MyeBaySelectionType getFavoriteSearches() {
	    return this.favoriteSearches;
	}
	
	/**
	 * public setter
	 *
     * 
     * Returns the list of searches that the user has saved in My eBay. Returned
     * only if the user has saved searches.
     * <br><br>
     * Set Include to true to return the default response set.
     * 
     *
     * @param ebay.apis.eblbasecomponents.MyeBaySelectionType
	 */
	public void setFavoriteSearches(MyeBaySelectionType favoriteSearches) {
	    this.favoriteSearches = favoriteSearches;
	}
	/**
     * public getter
     *
     * 
     * Returns the list of favorite sellers that the user has saved in My eBay.
     * Returned only if the user has saved a list of favorite sellers.
     * <br><br>
     * Set Include to true to return the default response set.
     * 
     *
     * @returns ebay.apis.eblbasecomponents.MyeBaySelectionType
	 */
	public MyeBaySelectionType getFavoriteSellers() {
	    return this.favoriteSellers;
	}
	
	/**
	 * public setter
	 *
     * 
     * Returns the list of favorite sellers that the user has saved in My eBay.
     * Returned only if the user has saved a list of favorite sellers.
     * <br><br>
     * Set Include to true to return the default response set.
     * 
     *
     * @param ebay.apis.eblbasecomponents.MyeBaySelectionType
	 */
	public void setFavoriteSellers(MyeBaySelectionType favoriteSellers) {
	    this.favoriteSellers = favoriteSellers;
	}
	/**
     * public getter
     *
     * 
     * Returns the list of second chance offers made by the user. Returned only
     * if the user has made second chance offers.
     * <br><br>
     * Set Include to true to return the default response set.
     * 
     *
     * @returns ebay.apis.eblbasecomponents.MyeBaySelectionType
	 */
	public MyeBaySelectionType getSecondChanceOffer() {
	    return this.secondChanceOffer;
	}
	
	/**
	 * public setter
	 *
     * 
     * Returns the list of second chance offers made by the user. Returned only
     * if the user has made second chance offers.
     * <br><br>
     * Set Include to true to return the default response set.
     * 
     *
     * @param ebay.apis.eblbasecomponents.MyeBaySelectionType
	 */
	public void setSecondChanceOffer(MyeBaySelectionType secondChanceOffer) {
	    this.secondChanceOffer = secondChanceOffer;
	}
	/**
     * public getter
     *
     * 
     *           
     * Indicates whether or not the Bid Assistant feature is being used. 
     * 
     *
     * @returns ebay.apis.eblbasecomponents.BidAssistantListType
	 */
	public BidAssistantListType getBidAssistantList() {
	    return this.bidAssistantList;
	}
	
	/**
	 * public setter
	 *
     * 
     *           
     * Indicates whether or not the Bid Assistant feature is being used. 
     * 
     *
     * @param ebay.apis.eblbasecomponents.BidAssistantListType
	 */
	public void setBidAssistantList(BidAssistantListType bidAssistantList) {
	    this.bidAssistantList = bidAssistantList;
	}
	/**
     * public getter
     *
     * 
     * Returns the list of items the user has won, and subsequently deleted from
     * their My eBay page.
     * <br><br>
     * Set Include to true to return the default response set.
     * 
     *
     * @returns ebay.apis.eblbasecomponents.ItemListCustomizationType
	 */
	public ItemListCustomizationType getDeletedFromWonList() {
	    return this.deletedFromWonList;
	}
	
	/**
	 * public setter
	 *
     * 
     * Returns the list of items the user has won, and subsequently deleted from
     * their My eBay page.
     * <br><br>
     * Set Include to true to return the default response set.
     * 
     *
     * @param ebay.apis.eblbasecomponents.ItemListCustomizationType
	 */
	public void setDeletedFromWonList(ItemListCustomizationType deletedFromWonList) {
	    this.deletedFromWonList = deletedFromWonList;
	}
	/**
     * public getter
     *
     * 
     * Returns the list of items (auctions) the user did not win and were
     * subsequently deleted from their My eBay page.
     * <br><br>
     * Set Include to true to return the default response set.
     * 
     *
     * @returns ebay.apis.eblbasecomponents.ItemListCustomizationType
	 */
	public ItemListCustomizationType getDeletedFromLostList() {
	    return this.deletedFromLostList;
	}
	
	/**
	 * public setter
	 *
     * 
     * Returns the list of items (auctions) the user did not win and were
     * subsequently deleted from their My eBay page.
     * <br><br>
     * Set Include to true to return the default response set.
     * 
     *
     * @param ebay.apis.eblbasecomponents.ItemListCustomizationType
	 */
	public void setDeletedFromLostList(ItemListCustomizationType deletedFromLostList) {
	    this.deletedFromLostList = deletedFromLostList;
	}
	/**
     * public getter
     *
     * 
     * Returns a summary of the user's buying activity.
     * <br><br>
     * With a request version of 605 or higher, the buying summary container is
     * not included in the response by default. Add a BuyingSummary element in
     * the request with an Include field set to true to receive a BuyingSummary
     * container in your response.
     * <br><br>
     * With a request version lower than 605, the BuyingSummary is always
     * returned by default. Add a BuyingSummary element with an Include field
     * set to false to exclude the BuyingSummary from your response.
     * 
     *
     * @returns ebay.apis.eblbasecomponents.ItemListCustomizationType
	 */
	public ItemListCustomizationType getBuyingSummary() {
	    return this.buyingSummary;
	}
	
	/**
	 * public setter
	 *
     * 
     * Returns a summary of the user's buying activity.
     * <br><br>
     * With a request version of 605 or higher, the buying summary container is
     * not included in the response by default. Add a BuyingSummary element in
     * the request with an Include field set to true to receive a BuyingSummary
     * container in your response.
     * <br><br>
     * With a request version lower than 605, the BuyingSummary is always
     * returned by default. Add a BuyingSummary element with an Include field
     * set to false to exclude the BuyingSummary from your response.
     * 
     *
     * @param ebay.apis.eblbasecomponents.ItemListCustomizationType
	 */
	public void setBuyingSummary(ItemListCustomizationType buyingSummary) {
	    this.buyingSummary = buyingSummary;
	}
	/**
     * public getter
     *
     * 
     * Returns the user defined lists, which are lists created by the user in the eBay
     * UI and filled with items, or sellers, or searches using the 
     * "Add to List" feature.
     * <br><br>
     * Set Include to true to return the default response set.
     * 
     *
     * @returns ebay.apis.eblbasecomponents.MyeBaySelectionType
	 */
	public MyeBaySelectionType getUserDefinedLists() {
	    return this.userDefinedLists;
	}
	
	/**
	 * public setter
	 *
     * 
     * Returns the user defined lists, which are lists created by the user in the eBay
     * UI and filled with items, or sellers, or searches using the 
     * "Add to List" feature.
     * <br><br>
     * Set Include to true to return the default response set.
     * 
     *
     * @param ebay.apis.eblbasecomponents.MyeBaySelectionType
	 */
	public void setUserDefinedLists(MyeBaySelectionType userDefinedLists) {
	    this.userDefinedLists = userDefinedLists;
	}
	/**
     * public getter
     *
     * 
     * If true, the Variations node is omitted for all multi-variation
     * listings in the response.
     * If false, the Variations node is returned for all
     * multi-variation listings in the response. <br>
     * <br>
     * Please note that if the seller includes a large number of
     * variations in many listings, retrieving variations (setting this
     * flag to false) may degrade the call's performance. Therefore,
     * when this is false, you may need to reduce the total
     * number of items you're requesting at once (by using other input
     * fields, such as Pagination).
     * 
     *
     * @returns java.lang.Boolean
	 */
	public Boolean getHideVariations() {
	    return this.hideVariations;
	}
	
	/**
	 * public setter
	 *
     * 
     * If true, the Variations node is omitted for all multi-variation
     * listings in the response.
     * If false, the Variations node is returned for all
     * multi-variation listings in the response. <br>
     * <br>
     * Please note that if the seller includes a large number of
     * variations in many listings, retrieving variations (setting this
     * flag to false) may degrade the call's performance. Therefore,
     * when this is false, you may need to reduce the total
     * number of items you're requesting at once (by using other input
     * fields, such as Pagination).
     * 
     *
     * @param java.lang.Boolean
	 */
	public void setHideVariations(Boolean hideVariations) {
	    this.hideVariations = hideVariations;
	}

}