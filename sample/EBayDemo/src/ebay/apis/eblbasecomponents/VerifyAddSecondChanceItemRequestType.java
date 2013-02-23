// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package ebay.apis.eblbasecomponents;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;

/**
 * 
 * Simulates the creation of a new Second Chance Offer
 * listing of an item without actually creating a listing.
 * 
 */
@RootElement(name = "VerifyAddSecondChanceItemRequest", namespace = "urn:ebay:apis:eBLBaseComponents")
public class VerifyAddSecondChanceItemRequestType extends AbstractRequestType implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element(name = "RecipientBidderUserID")
	private String recipientBidderUserID;
	
	@Element(name = "BuyItNowPrice")
	private AmountType buyItNowPrice;
	
	@Element(name = "Duration")
	private SecondChanceOfferDurationCodeType duration;
	
	@Element(name = "ItemID")
	private String itemID;
	
	@Element(name = "SellerMessage")
	private String sellerMessage;
	
    
	/**
     * public getter
     *
     * 
     * Specifies the bidder from the original, ended listing to whom the seller
     * is extending the second chance offer. Specify only one
     * RecipientBidderUserID per call. If multiple users are specified (each in a
     * RecipientBidderUserID node), only the last one specified receives the
     * offer.
     * 
     *
     * @returns java.lang.String
	 */
	public String getRecipientBidderUserID() {
	    return this.recipientBidderUserID;
	}
	
	/**
	 * public setter
	 *
     * 
     * Specifies the bidder from the original, ended listing to whom the seller
     * is extending the second chance offer. Specify only one
     * RecipientBidderUserID per call. If multiple users are specified (each in a
     * RecipientBidderUserID node), only the last one specified receives the
     * offer.
     * 
     *
     * @param java.lang.String
	 */
	public void setRecipientBidderUserID(String recipientBidderUserID) {
	    this.recipientBidderUserID = recipientBidderUserID;
	}
	/**
     * public getter
     *
     * 
     * Specifies the amount the offer recipient must pay to purchase the item
     * from the second chance offer listing. Use only when the original item was
     * an eBay Motors (or in some categories on U.S. and international sites for
     * high-priced items, such as items in many U.S. and Canada Business and
     * Industrial categories) and it ended unsold because the reserve price was
     * not met. Call fails with an error for any other item conditions.
     * 
     *
     * @returns ebay.apis.eblbasecomponents.AmountType
	 */
	public AmountType getBuyItNowPrice() {
	    return this.buyItNowPrice;
	}
	
	/**
	 * public setter
	 *
     * 
     * Specifies the amount the offer recipient must pay to purchase the item
     * from the second chance offer listing. Use only when the original item was
     * an eBay Motors (or in some categories on U.S. and international sites for
     * high-priced items, such as items in many U.S. and Canada Business and
     * Industrial categories) and it ended unsold because the reserve price was
     * not met. Call fails with an error for any other item conditions.
     * 
     *
     * @param ebay.apis.eblbasecomponents.AmountType
	 */
	public void setBuyItNowPrice(AmountType buyItNowPrice) {
	    this.buyItNowPrice = buyItNowPrice;
	}
	/**
     * public getter
     *
     * 
     * Specifies the length of time the second chance offer listing will be
     * active. The recipient bidder has that much time to purchase the item or
     * the listing expires.
     * 
     *
     * @returns ebay.apis.eblbasecomponents.SecondChanceOfferDurationCodeType
	 */
	public SecondChanceOfferDurationCodeType getDuration() {
	    return this.duration;
	}
	
	/**
	 * public setter
	 *
     * 
     * Specifies the length of time the second chance offer listing will be
     * active. The recipient bidder has that much time to purchase the item or
     * the listing expires.
     * 
     *
     * @param ebay.apis.eblbasecomponents.SecondChanceOfferDurationCodeType
	 */
	public void setDuration(SecondChanceOfferDurationCodeType duration) {
	    this.duration = duration;
	}
	/**
     * public getter
     *
     * 
     * Specifies the item ID for the original, ended listing from which the
     * second chance offer item comes. A new ItemID is returned for the second
     * chance offer item.
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
     * Specifies the item ID for the original, ended listing from which the
     * second chance offer item comes. A new ItemID is returned for the second
     * chance offer item.
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
     * Message content. Cannot contain HTML, asterisks, or quotes. This content
     * is included in the second chance offer email sent to the recipient, which
     * can be retrieved with GetMyMessages.
     * 
     *
     * @returns java.lang.String
	 */
	public String getSellerMessage() {
	    return this.sellerMessage;
	}
	
	/**
	 * public setter
	 *
     * 
     * Message content. Cannot contain HTML, asterisks, or quotes. This content
     * is included in the second chance offer email sent to the recipient, which
     * can be retrieved with GetMyMessages.
     * 
     *
     * @param java.lang.String
	 */
	public void setSellerMessage(String sellerMessage) {
	    this.sellerMessage = sellerMessage;
	}

}