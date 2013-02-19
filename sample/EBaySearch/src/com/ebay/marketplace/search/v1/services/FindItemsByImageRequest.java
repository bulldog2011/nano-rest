// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.ebay.marketplace.search.v1.services;

import com.leansoft.nano.annotation.*;
import java.util.List;

/**
 * 
 * Find items based on the image similarity to the specified item.
 * 
 */
@RootElement(name = "findItemsByImageRequest", namespace = "http://www.ebay.com/marketplace/search/v1/services")
public class FindItemsByImageRequest extends BestMatchFindingServiceRequest  {

	@Element
	private String itemId;
    
	@Element
	private List<String> categoryId;
    
	@Element
	private List<ItemFilter> itemFilter;
    
	@Element
	private List<AspectFilter> aspectFilter;
    
	@Element
	private List<DomainFilter> domainFilter;
    
	@Element
	private List<OutputSelectorType> outputSelector;
    
    
	/**
     * public getter
     *
     * 
     * Specifies the item that the customer wants to use for retrieving
     * more listings with similar images. The item must active and it must
     * be listed in a Clothing, Shoes & Accessories category (parent
     * category ID 11450 on the eBay US site). In addition, the item ID you
     * specify must exist on either the US, UK, or DE the sites.
     * 
     *
     * @returns java.lang.String
	 */
	public String getItemId() {
	    return this.itemId;
	}
	
	/**
	 * public setter
	 *
     * 
     * Specifies the item that the customer wants to use for retrieving
     * more listings with similar images. The item must active and it must
     * be listed in a Clothing, Shoes & Accessories category (parent
     * category ID 11450 on the eBay US site). In addition, the item ID you
     * specify must exist on either the US, UK, or DE the sites.
     * 
     *
     * @param java.lang.String
	 */
	public void setItemId(String itemId) {
	    this.itemId = itemId;
	}
	/**
     * public getter
     *
     * 
     * Specifies the leaf category from which you want to retrieve item
     * listings with similar images. If no category is specified, search
     * results can come from any Clothing, Shoes & Accessories leaf
     * category. This field can be repeated (up to 3 times) to include
     * multiple categories.
     * <br><br>
     * Image similarity searches are only supported in Clothing, Shoes &
     * Accessories leaf categories on the eBay US, UK, and Germany sites.
     * <br><br>
     * If a specified category ID doesn't match an existing category for the
     * site, eBay returns an invalid-category error message. To determine
     * valid leaf categories, use the Shopping API <b
     * class="con">GetCategoryInfo</b> call.
     * 
     *
     * @returns java.util.List<java.lang.String>
	 */
	public List<String> getCategoryId() {
	    return this.categoryId;
	}
	
	/**
	 * public setter
	 *
     * 
     * Specifies the leaf category from which you want to retrieve item
     * listings with similar images. If no category is specified, search
     * results can come from any Clothing, Shoes & Accessories leaf
     * category. This field can be repeated (up to 3 times) to include
     * multiple categories.
     * <br><br>
     * Image similarity searches are only supported in Clothing, Shoes &
     * Accessories leaf categories on the eBay US, UK, and Germany sites.
     * <br><br>
     * If a specified category ID doesn't match an existing category for the
     * site, eBay returns an invalid-category error message. To determine
     * valid leaf categories, use the Shopping API <b
     * class="con">GetCategoryInfo</b> call.
     * 
     *
     * @param java.util.List<java.lang.String>
	 */
	public void setCategoryId(List<String> categoryId) {
	    this.categoryId = categoryId;
	}
	/**
     * public getter
     *
     * 
     * Reduce the number of items returned by a find request using item
     * filters. Use <b class="con">itemFilter</b> to specify
     * name/value pairs. You can include multiple item filters in a single
     * request.
     * 
     *
     * @returns java.util.List<com.ebay.marketplace.search.v1.services.ItemFilter>
	 */
	public List<ItemFilter> getItemFilter() {
	    return this.itemFilter;
	}
	
	/**
	 * public setter
	 *
     * 
     * Reduce the number of items returned by a find request using item
     * filters. Use <b class="con">itemFilter</b> to specify
     * name/value pairs. You can include multiple item filters in a single
     * request.
     * 
     *
     * @param java.util.List<com.ebay.marketplace.search.v1.services.ItemFilter>
	 */
	public void setItemFilter(List<ItemFilter> itemFilter) {
	    this.itemFilter = itemFilter;
	}
	/**
     * public getter
     *
     * 
     * Aspect filters refine (limit) the number of items returned by a find
     * request. Obtain input values for aspectFilter fields from an
     * aspectHistogramContainer returned in the response of a previous
     * query.
     * <br><br>
     * By issuing a series of find queries, you can continually refine the
     * items returned in your responses. Do this by repeating a query using
     * the aspect values returned in one response as the input values to
     * your next query.
     * <br><br>
     * For example, the aspectHistogramContainer in a response on Men's
     * Shoes could contain an aspect of Size, along with "aspect values" for
     * the different sizes currently available in Men's Shoes. By populating
     * aspectFilter fields with the values returned in an
     * aspectHistogramContainer, you can refine the item results returned by
     * your new query.
     * <br/><br/>
     * <span class="tablenote">
     * <strong>Note:</strong> If a call that specifies an 
     * <strong>outputSelector</strong> value of 
     * <strong>AspectHistogram</strong> returns 
     * <strong>aspectHistogramContainer.domainName</strong>, this is a sign 
     * that aspect histogram data might not be returned if you also specify an 
     * <strong>aspectFilter</strong> in the next call. To ensure that 
     * aspect histogram data is returned for the next call, add a <strong>
     * domainFilter</strong> to the call as well.
     * </span>
     * 
     *
     * @returns java.util.List<com.ebay.marketplace.search.v1.services.AspectFilter>
	 */
	public List<AspectFilter> getAspectFilter() {
	    return this.aspectFilter;
	}
	
	/**
	 * public setter
	 *
     * 
     * Aspect filters refine (limit) the number of items returned by a find
     * request. Obtain input values for aspectFilter fields from an
     * aspectHistogramContainer returned in the response of a previous
     * query.
     * <br><br>
     * By issuing a series of find queries, you can continually refine the
     * items returned in your responses. Do this by repeating a query using
     * the aspect values returned in one response as the input values to
     * your next query.
     * <br><br>
     * For example, the aspectHistogramContainer in a response on Men's
     * Shoes could contain an aspect of Size, along with "aspect values" for
     * the different sizes currently available in Men's Shoes. By populating
     * aspectFilter fields with the values returned in an
     * aspectHistogramContainer, you can refine the item results returned by
     * your new query.
     * <br/><br/>
     * <span class="tablenote">
     * <strong>Note:</strong> If a call that specifies an 
     * <strong>outputSelector</strong> value of 
     * <strong>AspectHistogram</strong> returns 
     * <strong>aspectHistogramContainer.domainName</strong>, this is a sign 
     * that aspect histogram data might not be returned if you also specify an 
     * <strong>aspectFilter</strong> in the next call. To ensure that 
     * aspect histogram data is returned for the next call, add a <strong>
     * domainFilter</strong> to the call as well.
     * </span>
     * 
     *
     * @param java.util.List<com.ebay.marketplace.search.v1.services.AspectFilter>
	 */
	public void setAspectFilter(List<AspectFilter> aspectFilter) {
	    this.aspectFilter = aspectFilter;
	}
	/**
     * public getter
     *
     * 
     * Restricts results to items listed within the specified domain.
     * Domains are a buy-side grouping of items. such as shoes or digital
     * cameras. A domain can span multiple eBay categories.
     * 
     *
     * @returns java.util.List<com.ebay.marketplace.search.v1.services.DomainFilter>
	 */
	public List<DomainFilter> getDomainFilter() {
	    return this.domainFilter;
	}
	
	/**
	 * public setter
	 *
     * 
     * Restricts results to items listed within the specified domain.
     * Domains are a buy-side grouping of items. such as shoes or digital
     * cameras. A domain can span multiple eBay categories.
     * 
     *
     * @param java.util.List<com.ebay.marketplace.search.v1.services.DomainFilter>
	 */
	public void setDomainFilter(List<DomainFilter> domainFilter) {
	    this.domainFilter = domainFilter;
	}
	/**
     * public getter
     *
     * 
     * Defines what data to return, in addition to the default set of data,
     * in a response.
     * <br><br>
     * If you don't specify this field, eBay returns a default set of item
     * fields. Use outputSelector to include more information in the
     * response. The additional data is grouped into discrete nodes. You can
     * specify multiple nodes by including this field multiple times, as
     * needed, in the request.
     * <br><br>
     * If you specify this field, the additional fields returned can affect
     * the call's response time (performance), including in the case with
     * feedback data.
     * 
     *
     * @returns java.util.List<com.ebay.marketplace.search.v1.services.OutputSelectorType>
	 */
	public List<OutputSelectorType> getOutputSelector() {
	    return this.outputSelector;
	}
	
	/**
	 * public setter
	 *
     * 
     * Defines what data to return, in addition to the default set of data,
     * in a response.
     * <br><br>
     * If you don't specify this field, eBay returns a default set of item
     * fields. Use outputSelector to include more information in the
     * response. The additional data is grouped into discrete nodes. You can
     * specify multiple nodes by including this field multiple times, as
     * needed, in the request.
     * <br><br>
     * If you specify this field, the additional fields returned can affect
     * the call's response time (performance), including in the case with
     * feedback data.
     * 
     *
     * @param java.util.List<com.ebay.marketplace.search.v1.services.OutputSelectorType>
	 */
	public void setOutputSelector(List<OutputSelectorType> outputSelector) {
	    this.outputSelector = outputSelector;
	}

}