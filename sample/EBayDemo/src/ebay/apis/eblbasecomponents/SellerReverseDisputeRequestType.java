// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package ebay.apis.eblbasecomponents;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;

/**
 * 
 * Enables a seller to "reverse" an Unpaid Item dispute that has been closed, for
 * example, if buyer and seller reach an agreement. The seller's Final Value Fee
 * credit and the buyer's strike are both reversed, if applicable.
 * The dispute might have resulted
 * in a strike to the buyer and a Final Value Fee credit to the seller. A buyer and
 * seller sometimes come to agreement after a dispute has been closed. In particular,
 * the seller might discover that the buyer actually paid, or the buyer might agree
 * to pay the seller's fees in exchange for having the strike removed.
 * <br><br>
 * A dispute can only be reversed if it was closed with DisputeActivity set to
 * SellerEndCommunication, CameToAgreementNeedFVFCredit, or
 * MutualAgreementOrNoBuyerResponse.
 * 
 */
@RootElement(name = "SellerReverseDisputeRequest", namespace = "urn:ebay:apis:eBLBaseComponents")
public class SellerReverseDisputeRequestType extends AbstractRequestType implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element(name = "DisputeID")
	private String disputeID;
	
	@Element(name = "DisputeResolutionReason")
	private DisputeResolutionReasonCodeType disputeResolutionReason;
	
    
	/**
     * public getter
     *
     * 
     * The unique identifier of the dispute that was returned when the dispute was created.
     * The dispute must be an Unpaid Item dispute that the seller opened.
     * 
     *
     * @returns java.lang.String
	 */
	public String getDisputeID() {
	    return this.disputeID;
	}
	
	/**
	 * public setter
	 *
     * 
     * The unique identifier of the dispute that was returned when the dispute was created.
     * The dispute must be an Unpaid Item dispute that the seller opened.
     * 
     *
     * @param java.lang.String
	 */
	public void setDisputeID(String disputeID) {
	    this.disputeID = disputeID;
	}
	/**
     * public getter
     *
     * 
     * The reason the dispute is being reversed.
     * 
     *
     * @returns ebay.apis.eblbasecomponents.DisputeResolutionReasonCodeType
	 */
	public DisputeResolutionReasonCodeType getDisputeResolutionReason() {
	    return this.disputeResolutionReason;
	}
	
	/**
	 * public setter
	 *
     * 
     * The reason the dispute is being reversed.
     * 
     *
     * @param ebay.apis.eblbasecomponents.DisputeResolutionReasonCodeType
	 */
	public void setDisputeResolutionReason(DisputeResolutionReasonCodeType disputeResolutionReason) {
	    this.disputeResolutionReason = disputeResolutionReason;
	}

}