// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package ebay.apis.eblbasecomponents;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;

/**
 * 
 * The <b>PlaceOffer</b> response notifies you about the success and result
 * of the call.
 * 
 */
@RootElement(name = "PlaceOfferResponse", namespace = "urn:ebay:apis:eBLBaseComponents")
public class PlaceOfferResponseType extends AbstractResponseType implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element(name = "SellingStatus")
	private SellingStatusType sellingStatus;
	
	@Element(name = "TransactionID")
	private String transactionID;
	
	@Element(name = "BestOffer")
	private BestOfferType bestOffer;
	
	@Element(name = "OrderLineItemID")
	private String orderLineItemID;
	
    
	/**
     * public getter
     *
     * 
     * Indicates the current bidding/purchase state of the item listing regarding
     * the offer extended using <b>PlaceOffer</b>. See the schema documentation for
     * the <b>SellingStatus</b> object, the properties of which contain such
     * post-offer information as the current high bidder, the current price for
     * the item, and the bid increment.
     * 
     *
     * @returns ebay.apis.eblbasecomponents.SellingStatusType
	 */
	public SellingStatusType getSellingStatus() {
	    return this.sellingStatus;
	}
	
	/**
	 * public setter
	 *
     * 
     * Indicates the current bidding/purchase state of the item listing regarding
     * the offer extended using <b>PlaceOffer</b>. See the schema documentation for
     * the <b>SellingStatus</b> object, the properties of which contain such
     * post-offer information as the current high bidder, the current price for
     * the item, and the bid increment.
     * 
     *
     * @param ebay.apis.eblbasecomponents.SellingStatusType
	 */
	public void setSellingStatus(SellingStatusType sellingStatus) {
	    this.sellingStatus = sellingStatus;
	}
	/**
     * public getter
     *
     * 
     * Unique identifier for an eBay order line item (transaction). The
     * <b>TransactionID</b> field is only returned if the <b>Offer.Action</b> field was set
     * to <b>Purchase</b> in the input and the purchase was successful. A Purchase
     * action in <b>PlaceOffer</b> can be used for a fixed-price listing, or for an
     * auction listing where the Buy It Now option is available.
     * 
     *
     * @returns java.lang.String
	 */
	public String getTransactionID() {
	    return this.transactionID;
	}
	
	/**
	 * public setter
	 *
     * 
     * Unique identifier for an eBay order line item (transaction). The
     * <b>TransactionID</b> field is only returned if the <b>Offer.Action</b> field was set
     * to <b>Purchase</b> in the input and the purchase was successful. A Purchase
     * action in <b>PlaceOffer</b> can be used for a fixed-price listing, or for an
     * auction listing where the Buy It Now option is available.
     * 
     *
     * @param java.lang.String
	 */
	public void setTransactionID(String transactionID) {
	    this.transactionID = transactionID;
	}
	/**
     * public getter
     *
     * 
     * Container consisting of the status for a Best Offer. This container is
     * only returned if applicable based on the listing and the value set for
     * <b>Offer.Action</b> field in the request. 
     * 
     *
     * @returns ebay.apis.eblbasecomponents.BestOfferType
	 */
	public BestOfferType getBestOffer() {
	    return this.bestOffer;
	}
	
	/**
	 * public setter
	 *
     * 
     * Container consisting of the status for a Best Offer. This container is
     * only returned if applicable based on the listing and the value set for
     * <b>Offer.Action</b> field in the request. 
     * 
     *
     * @param ebay.apis.eblbasecomponents.BestOfferType
	 */
	public void setBestOffer(BestOfferType bestOffer) {
	    this.bestOffer = bestOffer;
	}
	/**
     * public getter
     *
     * 
     * <b>OrderLineItemID</b> is a unique identifier for an eBay order line item and
     * is based upon the concatenation of <b>ItemID</b> and <b>TransactionID</b>, with a
     * hyphen in between these two IDs. The <b>OrderLineItemID</b> field is only
     * returned if the <b>Offer.Action</b> field is set to <b>Purchase</b> in the input and
     * the purchase is successful. A Purchase action in <b>PlaceOffer</b> can be used
     * for a fixed-price listing, or for an auction listing where the Buy It
     * Now option is available.
     * <br>
     * 
     *
     * @returns java.lang.String
	 */
	public String getOrderLineItemID() {
	    return this.orderLineItemID;
	}
	
	/**
	 * public setter
	 *
     * 
     * <b>OrderLineItemID</b> is a unique identifier for an eBay order line item and
     * is based upon the concatenation of <b>ItemID</b> and <b>TransactionID</b>, with a
     * hyphen in between these two IDs. The <b>OrderLineItemID</b> field is only
     * returned if the <b>Offer.Action</b> field is set to <b>Purchase</b> in the input and
     * the purchase is successful. A Purchase action in <b>PlaceOffer</b> can be used
     * for a fixed-price listing, or for an auction listing where the Buy It
     * Now option is available.
     * <br>
     * 
     *
     * @param java.lang.String
	 */
	public void setOrderLineItemID(String orderLineItemID) {
	    this.orderLineItemID = orderLineItemID;
	}

}