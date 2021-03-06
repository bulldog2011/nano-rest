// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.ebay.marketplace.search.v1.services;

import com.leansoft.nano.annotation.*;

/**
 * 
 * Response container for the findItemsByImage call.
 * 
 */
@RootElement(name = "findItemsByImageResponse", namespace = "http://www.ebay.com/marketplace/search/v1/services")
public class FindItemsByImageResponse extends BaseFindingServiceResponse  {

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
     * returned if there are no matching items or if the search is
     * restricted to a single leaf category.
     * <br><br>
     * <span class="tablenote"><strong>Note:</strong>
     *  The category IDs returned for items in search results are for the
     *  leaf categories in which the items are listed. If you use these
     *  category IDs as input, the response will not return a category
     *  histogram.
     * </span>
     * <br><br>
     * <span class="tablenote"><strong>Note:</strong>
     *  When searching the eBay Motors site, category histograms may not be
     *  available for some parent categories. In these cases, aspect
     *  histograms should be used to refine search results. This behavior is
     *  consistent with eBay Motors site search behavior.
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
     * returned if there are no matching items or if the search is
     * restricted to a single leaf category.
     * <br><br>
     * <span class="tablenote"><strong>Note:</strong>
     *  The category IDs returned for items in search results are for the
     *  leaf categories in which the items are listed. If you use these
     *  category IDs as input, the response will not return a category
     *  histogram.
     * </span>
     * <br><br>
     * <span class="tablenote"><strong>Note:</strong>
     *  When searching the eBay Motors site, category histograms may not be
     *  available for some parent categories. In these cases, aspect
     *  histograms should be used to refine search results. This behavior is
     *  consistent with eBay Motors site search behavior.
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
     * Response container for condition histograms.
     * These can be returned for any category (parent or leaf).
     * <br>
     * <br>
     * Not returned when Condition is specified in itemFilter.
     * That is, only returned when you have not yet narrowed
     * your search based on specific conditions.<br>
     * <br>
     * Only returned when you search the eBay US site (as of
     * February 2011). International items in US search results
     * are included in the histogram counts.
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
     * Response container for condition histograms.
     * These can be returned for any category (parent or leaf).
     * <br>
     * <br>
     * Not returned when Condition is specified in itemFilter.
     * That is, only returned when you have not yet narrowed
     * your search based on specific conditions.<br>
     * <br>
     * Only returned when you search the eBay US site (as of
     * February 2011). International items in US search results
     * are included in the histogram counts.
     * 
     *
     * @param com.ebay.marketplace.search.v1.services.ConditionHistogramContainer
	 */
	public void setConditionHistogramContainer(ConditionHistogramContainer conditionHistogramContainer) {
	    this.conditionHistogramContainer = conditionHistogramContainer;
	}

}