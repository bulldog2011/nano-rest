// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.ebay.marketplace.search.v1.services;

import com.leansoft.nano.annotation.*;

/**
 * 
 * Reserved for future use.
 * 
 */
@RootElement(name = "findItemsForFavoriteSearchResponse", namespace = "http://www.ebay.com/marketplace/search/v1/services")
public class FindItemsForFavoriteSearchResponse extends BaseFindingServiceResponse  {

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
     * Reserved for future use.
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
     * Reserved for future use.
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
     * Reserved for future use.
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
     * Reserved for future use.
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
     * Reserved for future use.
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
     * Reserved for future use.
     * 
     *
     * @param com.ebay.marketplace.search.v1.services.ConditionHistogramContainer
	 */
	public void setConditionHistogramContainer(ConditionHistogramContainer conditionHistogramContainer) {
	    this.conditionHistogramContainer = conditionHistogramContainer;
	}

}