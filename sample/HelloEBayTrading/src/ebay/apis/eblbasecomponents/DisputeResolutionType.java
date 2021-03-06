// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package ebay.apis.eblbasecomponents;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;
import java.util.Date;

/**
 * 
 * Contains all information about a dispute resolution. A dispute
 * can have a resolution even if the seller does not receive payment.
 * The resolution can have various results, including a Final Value Fee credit to
 * the seller or a strike to the buyer.
 * 
 */
public class DisputeResolutionType implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element(name = "DisputeResolutionRecordType")
	private DisputeResolutionRecordTypeCodeType disputeResolutionRecordType;
	
	@Element(name = "DisputeResolutionReason")
	private DisputeResolutionReasonCodeType disputeResolutionReason;
	
	@Element(name = "ResolutionTime")
	private Date resolutionTime;
	
    
	/**
     * public getter
     *
     * 
     * The action resulting from the resolution, affecting either
     * the buyer or the seller.
     * 
     *
     * @returns ebay.apis.eblbasecomponents.DisputeResolutionRecordTypeCodeType
	 */
	public DisputeResolutionRecordTypeCodeType getDisputeResolutionRecordType() {
	    return this.disputeResolutionRecordType;
	}
	
	/**
	 * public setter
	 *
     * 
     * The action resulting from the resolution, affecting either
     * the buyer or the seller.
     * 
     *
     * @param ebay.apis.eblbasecomponents.DisputeResolutionRecordTypeCodeType
	 */
	public void setDisputeResolutionRecordType(DisputeResolutionRecordTypeCodeType disputeResolutionRecordType) {
	    this.disputeResolutionRecordType = disputeResolutionRecordType;
	}
	/**
     * public getter
     *
     * 
     * The reason for the resolution. The DisputeResolutionReason
     * results in the action described by the DisputeResolutionRecordType.
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
     * The reason for the resolution. The DisputeResolutionReason
     * results in the action described by the DisputeResolutionRecordType.
     * 
     *
     * @param ebay.apis.eblbasecomponents.DisputeResolutionReasonCodeType
	 */
	public void setDisputeResolutionReason(DisputeResolutionReasonCodeType disputeResolutionReason) {
	    this.disputeResolutionReason = disputeResolutionReason;
	}
	/**
     * public getter
     *
     * 
     * The date and time the dispute was resolved, in GMT.
     * 
     *
     * @returns java.util.Date
	 */
	public Date getResolutionTime() {
	    return this.resolutionTime;
	}
	
	/**
	 * public setter
	 *
     * 
     * The date and time the dispute was resolved, in GMT.
     * 
     *
     * @param java.util.Date
	 */
	public void setResolutionTime(Date resolutionTime) {
	    this.resolutionTime = resolutionTime;
	}

}