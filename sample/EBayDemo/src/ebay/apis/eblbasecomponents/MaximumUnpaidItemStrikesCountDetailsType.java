// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package ebay.apis.eblbasecomponents;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;
import java.util.List;

/**
 * 
 * Type defining the <b>MaximumUnpaidItemStrikesCount</b> container that is returned 
 * in the <b>GeteBayDetails</b> response. The <b>MaximumUnpaidItemStrikesCount</b> 
 * container consists of multiple <b>Count</b> fields with values that can be 
 * used in the <b>BuyerRequirementDetails.MaximumUnpaidItemStrikesInfo.Count</b> 
 * field when using the Trading API to add, revise, or relist an item.
 * <br><br>
 * The <b>Item.MaximumUnpaidItemStrikesInfo</b> container in Add/Revise/Relist 
 * API calls is used to block buyers with unpaid item strikes equal to or exceeding
 * the specified <b>Count</b> value during the specified <b>Period</b> 
 * value from buying/bidding on the item.
 * 
 */
public class MaximumUnpaidItemStrikesCountDetailsType implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element(name = "Count")
	private List<Integer> count;
	
    
	/**
     * public getter
     *
     * 
     * Each value returned in each <b>MaximumUnpaidItemStrikesCount.Count</b> field
     * can be used in the <b>BuyerRequirementDetails.MaximumUnpaidItemStrikesInfo.Count</b> 
     * field when using the Trading API to add, revise, or relist an item. 
     * 
     *
     * @returns java.util.List<java.lang.Integer>
	 */
	public List<Integer> getCount() {
	    return this.count;
	}
	
	/**
	 * public setter
	 *
     * 
     * Each value returned in each <b>MaximumUnpaidItemStrikesCount.Count</b> field
     * can be used in the <b>BuyerRequirementDetails.MaximumUnpaidItemStrikesInfo.Count</b> 
     * field when using the Trading API to add, revise, or relist an item. 
     * 
     *
     * @param java.util.List<java.lang.Integer>
	 */
	public void setCount(List<Integer> count) {
	    this.count = count;
	}

}