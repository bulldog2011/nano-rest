// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package ebay.apis.eblbasecomponents;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;

/**
 * 
 * Information that a Live Auction seller selects when approving or denying
 * a user who wants to bid on items in the seller's Live Auctions catalog.
 * 
 */
public class BidApprovalType implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element(name = "UserID")
	private String userID;
	
	@Element(name = "ApprovedBiddingLimit")
	private AmountType approvedBiddingLimit;
	
	@Element(name = "DeclinedComment")
	private String declinedComment;
	
	@Element(name = "Status")
	private BidderStatusCodeType status;
	
    
	/**
     * public getter
     *
     * 
     * User ID for the bidder to be approved.
     * Only bidders who have requested approval can be approved.
     * That is, the seller cannot approve a bidder who has not
     * requested approval.
     * (Bidders request approval via the eBay Live Auctions
     * Web site UI.)
     * When you are approving bidders, if you pass in multiple
     * BidApproval entries with duplicate UserID values,
     * the last entry with that UserID takes precedence (and the earlier
     * duplicate UserID entries are ignored).
     * 
     *
     * @returns java.lang.String
	 */
	public String getUserID() {
	    return this.userID;
	}
	
	/**
	 * public setter
	 *
     * 
     * User ID for the bidder to be approved.
     * Only bidders who have requested approval can be approved.
     * That is, the seller cannot approve a bidder who has not
     * requested approval.
     * (Bidders request approval via the eBay Live Auctions
     * Web site UI.)
     * When you are approving bidders, if you pass in multiple
     * BidApproval entries with duplicate UserID values,
     * the last entry with that UserID takes precedence (and the earlier
     * duplicate UserID entries are ignored).
     * 
     *
     * @param java.lang.String
	 */
	public void setUserID(String userID) {
	    this.userID = userID;
	}
	/**
     * public getter
     *
     * 
     * Maximum amount that the seller will allow the specified user to bid.
     * This field is required if the auction house has requested that the
     * bidder enter an amount for the seller's approval. (The bidder requests
     * a maximum bidding limit, but the seller can specify a different maximum
     * bidding limit.)
     * 
     *
     * @returns ebay.apis.eblbasecomponents.AmountType
	 */
	public AmountType getApprovedBiddingLimit() {
	    return this.approvedBiddingLimit;
	}
	
	/**
	 * public setter
	 *
     * 
     * Maximum amount that the seller will allow the specified user to bid.
     * This field is required if the auction house has requested that the
     * bidder enter an amount for the seller's approval. (The bidder requests
     * a maximum bidding limit, but the seller can specify a different maximum
     * bidding limit.)
     * 
     *
     * @param ebay.apis.eblbasecomponents.AmountType
	 */
	public void setApprovedBiddingLimit(AmountType approvedBiddingLimit) {
	    this.approvedBiddingLimit = approvedBiddingLimit;
	}
	/**
     * public getter
     *
     * 
     * Comments entered by seller when an approval request is denied.
     * This is required if the seller sets Status to Denied.
     * 
     *
     * @returns java.lang.String
	 */
	public String getDeclinedComment() {
	    return this.declinedComment;
	}
	
	/**
	 * public setter
	 *
     * 
     * Comments entered by seller when an approval request is denied.
     * This is required if the seller sets Status to Denied.
     * 
     *
     * @param java.lang.String
	 */
	public void setDeclinedComment(String declinedComment) {
	    this.declinedComment = declinedComment;
	}
	/**
     * public getter
     *
     * 
     * Indicates whether the seller approves or denies the bidder's
     * approval request.
     * 
     *
     * @returns ebay.apis.eblbasecomponents.BidderStatusCodeType
	 */
	public BidderStatusCodeType getStatus() {
	    return this.status;
	}
	
	/**
	 * public setter
	 *
     * 
     * Indicates whether the seller approves or denies the bidder's
     * approval request.
     * 
     *
     * @param ebay.apis.eblbasecomponents.BidderStatusCodeType
	 */
	public void setStatus(BidderStatusCodeType status) {
	    this.status = status;
	}

}