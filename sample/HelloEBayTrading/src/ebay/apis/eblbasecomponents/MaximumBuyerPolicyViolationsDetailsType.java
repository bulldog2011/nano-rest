// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package ebay.apis.eblbasecomponents;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;
import java.util.List;

/**
 * The maximum number of policy violations and the durations that can be designated by sellers at this site. This is applicable only to sellers.
 */
public class MaximumBuyerPolicyViolationsDetailsType implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element(name = "NumberOfPolicyViolations")
	private NumberOfPolicyViolationsDetailsType numberOfPolicyViolations;
	
	@Element(name = "PolicyViolationDuration")
	private List<PolicyViolationDurationDetailsType> policyViolationDuration;
	
    
	/**
     * public getter
     *
     * The number of policy violation that can be used to limit buyers at the site. This is applicable only to sellers.
     *
     * @returns ebay.apis.eblbasecomponents.NumberOfPolicyViolationsDetailsType
	 */
	public NumberOfPolicyViolationsDetailsType getNumberOfPolicyViolations() {
	    return this.numberOfPolicyViolations;
	}
	
	/**
	 * public setter
	 *
     * The number of policy violation that can be used to limit buyers at the site. This is applicable only to sellers.
     *
     * @param ebay.apis.eblbasecomponents.NumberOfPolicyViolationsDetailsType
	 */
	public void setNumberOfPolicyViolations(NumberOfPolicyViolationsDetailsType numberOfPolicyViolations) {
	    this.numberOfPolicyViolations = numberOfPolicyViolations;
	}
	/**
     * public getter
     *
     * The policy violation duration(s) supported by the site. This is applicable only to sellers.
     *
     * @returns java.util.List<ebay.apis.eblbasecomponents.PolicyViolationDurationDetailsType>
	 */
	public List<PolicyViolationDurationDetailsType> getPolicyViolationDuration() {
	    return this.policyViolationDuration;
	}
	
	/**
	 * public setter
	 *
     * The policy violation duration(s) supported by the site. This is applicable only to sellers.
     *
     * @param java.util.List<ebay.apis.eblbasecomponents.PolicyViolationDurationDetailsType>
	 */
	public void setPolicyViolationDuration(List<PolicyViolationDurationDetailsType> policyViolationDuration) {
	    this.policyViolationDuration = policyViolationDuration;
	}

}