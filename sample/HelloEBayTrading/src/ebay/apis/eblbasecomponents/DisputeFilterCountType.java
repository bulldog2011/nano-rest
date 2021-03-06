// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package ebay.apis.eblbasecomponents;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;

/**
 * 
 * The number of disputes that match a given filter.
 * 
 */
public class DisputeFilterCountType implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element(name = "DisputeFilterType")
	private DisputeFilterTypeCodeType disputeFilterType;
	
	@Element(name = "TotalAvailable")
	private Integer totalAvailable;
	
    
	/**
     * public getter
     *
     * 
     * A filter used to reduce the number of disputes returned. The filter uses criteria
     * such as whether the dispute is awaiting a response, is closed, or is eligible for
     * credit. Both Unpaid Item and Item Not Received disputes can be returned for the
     * same filter value.
     * 
     *
     * @returns ebay.apis.eblbasecomponents.DisputeFilterTypeCodeType
	 */
	public DisputeFilterTypeCodeType getDisputeFilterType() {
	    return this.disputeFilterType;
	}
	
	/**
	 * public setter
	 *
     * 
     * A filter used to reduce the number of disputes returned. The filter uses criteria
     * such as whether the dispute is awaiting a response, is closed, or is eligible for
     * credit. Both Unpaid Item and Item Not Received disputes can be returned for the
     * same filter value.
     * 
     *
     * @param ebay.apis.eblbasecomponents.DisputeFilterTypeCodeType
	 */
	public void setDisputeFilterType(DisputeFilterTypeCodeType disputeFilterType) {
	    this.disputeFilterType = disputeFilterType;
	}
	/**
     * public getter
     *
     * 
     * The number of disputes that match the filter.
     * In the GetUserDisputes response, not returned for the filter type
     * that was used in the request.
     * 
     *
     * @returns java.lang.Integer
	 */
	public Integer getTotalAvailable() {
	    return this.totalAvailable;
	}
	
	/**
	 * public setter
	 *
     * 
     * The number of disputes that match the filter.
     * In the GetUserDisputes response, not returned for the filter type
     * that was used in the request.
     * 
     *
     * @param java.lang.Integer
	 */
	public void setTotalAvailable(Integer totalAvailable) {
	    this.totalAvailable = totalAvailable;
	}

}