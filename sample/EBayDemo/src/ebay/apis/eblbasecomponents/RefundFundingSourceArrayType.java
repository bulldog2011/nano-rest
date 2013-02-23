// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package ebay.apis.eblbasecomponents;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;
import java.util.List;

/**
 * 
 *  Container consisting of one or more RefundFundingSource containers.
 * 
 */
public class RefundFundingSourceArrayType implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element(name = "RefundFundingSource")
	private List<RefundFundingSourceType> refundFundingSource;
	
    
	/**
     * public getter
     *
     * 
     *    The funding sources for the refund.<br/><br/>
     *    <span class="tablenote">
     *    <strong>Note:</strong> RefundFundingSource containers are returned (for
     *  GetOrders and other order retrieval calls) for DE/AT orders subject to the new eBay 
     *  payment process.
     *    </span>
     * 
     *
     * @returns java.util.List<ebay.apis.eblbasecomponents.RefundFundingSourceType>
	 */
	public List<RefundFundingSourceType> getRefundFundingSource() {
	    return this.refundFundingSource;
	}
	
	/**
	 * public setter
	 *
     * 
     *    The funding sources for the refund.<br/><br/>
     *    <span class="tablenote">
     *    <strong>Note:</strong> RefundFundingSource containers are returned (for
     *  GetOrders and other order retrieval calls) for DE/AT orders subject to the new eBay 
     *  payment process.
     *    </span>
     * 
     *
     * @param java.util.List<ebay.apis.eblbasecomponents.RefundFundingSourceType>
	 */
	public void setRefundFundingSource(List<RefundFundingSourceType> refundFundingSource) {
	    this.refundFundingSource = refundFundingSource;
	}

}