// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package ebay.apis.eblbasecomponents;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;

/**
 * 
 * Details about items involved in the summary for the specified time period.
 * 
 */
public class ItemTotalsType implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element(name = "TotalQuantity")
	private Long totalQuantity;
	
	@Element(name = "TotalValue")
	private AmountType totalValue;
	
    
	/**
     * public getter
     *
     * 
     * Number of items involved in the summary.
     * 
     *
     * @returns java.lang.Long
	 */
	public Long getTotalQuantity() {
	    return this.totalQuantity;
	}
	
	/**
	 * public setter
	 *
     * 
     * Number of items involved in the summary.
     * 
     *
     * @param java.lang.Long
	 */
	public void setTotalQuantity(Long totalQuantity) {
	    this.totalQuantity = totalQuantity;
	}
	/**
     * public getter
     *
     * 
     * Total value associated with the items in this summary.
     * 
     *
     * @returns ebay.apis.eblbasecomponents.AmountType
	 */
	public AmountType getTotalValue() {
	    return this.totalValue;
	}
	
	/**
	 * public setter
	 *
     * 
     * Total value associated with the items in this summary.
     * 
     *
     * @param ebay.apis.eblbasecomponents.AmountType
	 */
	public void setTotalValue(AmountType totalValue) {
	    this.totalValue = totalValue;
	}

}