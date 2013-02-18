// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.ebay.marketplace.search.v1.services;

import com.leansoft.nano.annotation.*;
import java.util.List;

/**
 * 
 * Container for condition histograms.
 * 
 */
public class ConditionHistogramContainer   {

	@Element
	private List<ConditionHistogram> conditionHistogram;
    
	@Element
	private String delimiter;
    
	private List<Object> any;
    
    
	/**
     * public getter
     *
     * 
     * Statistical (item count) information on the condition of items
     * that match the search criteria (or specified category).
     * For example, the number of brand new items that match the query.
     * <br>
     * <br>
     * Each conditionHistogram specifies one condition and the
     * number of matching items found. The list of all
     * conditionHistogram containers returned represents the union of
     * all conditions that were found in the item results.
     * For example, if items were found in different categories,
     * and if those categories support different sets of
     * item conditions, then all those conditions are
     * returned in the list, regardless of category.<br>
     * <br>
     * If multiple items use the same condition ID, but some items
     * use different display names for that condition, the histogram
     * shows the site's default display name for that condition.
     * This means that the condition name in a histogram may not
     * always exactly match the condition names on the counted items.
     * 
     *
     * @returns java.util.List<com.ebay.marketplace.search.v1.services.ConditionHistogram>
	 */
	public List<ConditionHistogram> getConditionHistogram() {
	    return this.conditionHistogram;
	}
	
	/**
	 * public setter
	 *
     * 
     * Statistical (item count) information on the condition of items
     * that match the search criteria (or specified category).
     * For example, the number of brand new items that match the query.
     * <br>
     * <br>
     * Each conditionHistogram specifies one condition and the
     * number of matching items found. The list of all
     * conditionHistogram containers returned represents the union of
     * all conditions that were found in the item results.
     * For example, if items were found in different categories,
     * and if those categories support different sets of
     * item conditions, then all those conditions are
     * returned in the list, regardless of category.<br>
     * <br>
     * If multiple items use the same condition ID, but some items
     * use different display names for that condition, the histogram
     * shows the site's default display name for that condition.
     * This means that the condition name in a histogram may not
     * always exactly match the condition names on the counted items.
     * 
     *
     * @param java.util.List<com.ebay.marketplace.search.v1.services.ConditionHistogram>
	 */
	public void setConditionHistogram(List<ConditionHistogram> conditionHistogram) {
	    this.conditionHistogram = conditionHistogram;
	}
	/**
	 * public getter
	 *
     * @returns java.lang.String
	 */
	public String getDelimiter() {
	    return this.delimiter;
	}
	
	/**
	 * public setter
	 *
     * @param java.lang.String
	 */
	public void setDelimiter(String delimiter) {
	    this.delimiter = delimiter;
	}
	/**
	 * public getter
	 *
     * @returns java.util.List<java.lang.Object>
	 */
	public List<Object> getAny() {
	    return this.any;
	}
	
	/**
	 * public setter
	 *
     * @param java.util.List<java.lang.Object>
	 */
	public void setAny(List<Object> any) {
	    this.any = any;
	}

}