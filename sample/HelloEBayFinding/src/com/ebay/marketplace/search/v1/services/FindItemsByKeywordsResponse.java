// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.ebay.marketplace.search.v1.services;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;

/**
 * 
 * Response container for the findItemsByKeywords call.
 * 
 */
@RootElement(name = "findItemsByKeywordsResponse", namespace = "http://www.ebay.com/marketplace/search/v1/services")
public class FindItemsByKeywordsResponse extends BaseFindingServiceResponse implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element
	private CategoryHistogramContainer categoryHistogramContainer;
	
	@Element
	private AspectHistogramContainer aspectHistogramContainer;
	
	@Element
	private ConditionHistogramContainer conditionHistogramContainer;
	
    
	/**
     * public getter
     *
     * 
     * Response container for category histograms. Only returned when one or
     * more category histograms are returned. A category histogram is not
     * returned if the search query returns no matching items.
     * <br><br>
     * <span class="tablenote"><strong>Note:</strong>
     * When searching the eBay Motors site, category histograms may not be
     * available for some parent categories. In these cases, aspect
     * histograms should be used to refine search results. This behavior
     * is consistent with eBay Motors site search behavior.
     * </span>
     * 
     *
     * @returns com.ebay.marketplace.search.v1.services.CategoryHistogramContainer
	 */
	public CategoryHistogramContainer getCategoryHistogramContainer() {
	    return this.categoryHistogramContainer;
	}
	
	/**
	 * public setter
	 *
     * 
     * Response container for category histograms. Only returned when one or
     * more category histograms are returned. A category histogram is not
     * returned if the search query returns no matching items.
     * <br><br>
     * <span class="tablenote"><strong>Note:</strong>
     * When searching the eBay Motors site, category histograms may not be
     * available for some parent categories. In these cases, aspect
     * histograms should be used to refine search results. This behavior
     * is consistent with eBay Motors site search behavior.
     * </span>
     * 
     *
     * @param com.ebay.marketplace.search.v1.services.CategoryHistogramContainer
	 */
	public void setCategoryHistogramContainer(CategoryHistogramContainer categoryHistogramContainer) {
	    this.categoryHistogramContainer = categoryHistogramContainer;
	}
	/**
     * public getter
     *
     * 
     * Response container for aspect histograms. Aspect histograms are
     * returned for categories that have been mapped to domains only. In
     * most cases, just leaf categories are mapped to domains, but there are
     * exceptions.
     * 
     *
     * @returns com.ebay.marketplace.search.v1.services.AspectHistogramContainer
	 */
	public AspectHistogramContainer getAspectHistogramContainer() {
	    return this.aspectHistogramContainer;
	}
	
	/**
	 * public setter
	 *
     * 
     * Response container for aspect histograms. Aspect histograms are
     * returned for categories that have been mapped to domains only. In
     * most cases, just leaf categories are mapped to domains, but there are
     * exceptions.
     * 
     *
     * @param com.ebay.marketplace.search.v1.services.AspectHistogramContainer
	 */
	public void setAspectHistogramContainer(AspectHistogramContainer aspectHistogramContainer) {
	    this.aspectHistogramContainer = aspectHistogramContainer;
	}
	/**
     * public getter
     *
     * 
     * Response container for condition histograms.<br>
     * <br>
     * Not returned when Condition is specified in itemFilter.
     * That is, only returned when you have not yet narrowed
     * your search based on specific conditions.<br>
     * <br>
     * Supported for all eBay sites except US eBay Motors,
     * India (IN), Malaysia (MY) and Philippines (PH).
     * International items that appear in search results
     * are included in a site's histogram counts.
     * 
     *
     * @returns com.ebay.marketplace.search.v1.services.ConditionHistogramContainer
	 */
	public ConditionHistogramContainer getConditionHistogramContainer() {
	    return this.conditionHistogramContainer;
	}
	
	/**
	 * public setter
	 *
     * 
     * Response container for condition histograms.<br>
     * <br>
     * Not returned when Condition is specified in itemFilter.
     * That is, only returned when you have not yet narrowed
     * your search based on specific conditions.<br>
     * <br>
     * Supported for all eBay sites except US eBay Motors,
     * India (IN), Malaysia (MY) and Philippines (PH).
     * International items that appear in search results
     * are included in a site's histogram counts.
     * 
     *
     * @param com.ebay.marketplace.search.v1.services.ConditionHistogramContainer
	 */
	public void setConditionHistogramContainer(ConditionHistogramContainer conditionHistogramContainer) {
	    this.conditionHistogramContainer = conditionHistogramContainer;
	}

}