// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.ebay.marketplace.search.v1.services;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;
import java.util.List;

/**
 * 
 * Base response container for all Finding Service operations.
 * 
 */
public abstract class BaseFindingServiceResponse extends BaseServiceResponse implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element
	private SearchResult searchResult;
	
	@Element
	private PaginationOutput paginationOutput;
	
	@Element
	private String itemSearchURL;
	
	@Element
	private List<ExtensionType> extension;
	
    
	/**
     * public getter
     *
     * 
     * Container for the item listings that matched the search criteria.
     * The data for each item is returned in individual containers, if
     * any matches were found.
     * 
     *
     * @returns com.ebay.marketplace.search.v1.services.SearchResult
	 */
	public SearchResult getSearchResult() {
	    return this.searchResult;
	}
	
	/**
	 * public setter
	 *
     * 
     * Container for the item listings that matched the search criteria.
     * The data for each item is returned in individual containers, if
     * any matches were found.
     * 
     *
     * @param com.ebay.marketplace.search.v1.services.SearchResult
	 */
	public void setSearchResult(SearchResult searchResult) {
	    this.searchResult = searchResult;
	}
	/**
     * public getter
     *
     * 
     * Indicates the pagination of the result set. Child elements indicate
     * the page number that is returned, the maximum number of item listings
     * to return per page, total number of pages that can be returned, and
     * the total number of listings that match the search criteria.
     * 
     *
     * @returns com.ebay.marketplace.search.v1.services.PaginationOutput
	 */
	public PaginationOutput getPaginationOutput() {
	    return this.paginationOutput;
	}
	
	/**
	 * public setter
	 *
     * 
     * Indicates the pagination of the result set. Child elements indicate
     * the page number that is returned, the maximum number of item listings
     * to return per page, total number of pages that can be returned, and
     * the total number of listings that match the search criteria.
     * 
     *
     * @param com.ebay.marketplace.search.v1.services.PaginationOutput
	 */
	public void setPaginationOutput(PaginationOutput paginationOutput) {
	    this.paginationOutput = paginationOutput;
	}
	/**
     * public getter
     *
     * 
     * A URL to view the search results on the eBay web site. The search
     * results on the web site will use the same pagination as the API
     * search results.
     * <br><br>
     * <span class="tablenote"><strong>Note:</strong>
     * eBay URLs returned in fields, such as <b
     * class="con">viewItemURL</b>, are subject to syntax and other
     * changes without notice. To avoid problems in your application when
     * eBay alters the URL format, we advise you to avoid parsing eBay URLs
     * programmatically. We strive to ensure that other fields in the
     * response contain all the information that is encoded in the URL, and
     * more.
     * </span>
     * 
     *
     * @returns java.lang.String
	 */
	public String getItemSearchURL() {
	    return this.itemSearchURL;
	}
	
	/**
	 * public setter
	 *
     * 
     * A URL to view the search results on the eBay web site. The search
     * results on the web site will use the same pagination as the API
     * search results.
     * <br><br>
     * <span class="tablenote"><strong>Note:</strong>
     * eBay URLs returned in fields, such as <b
     * class="con">viewItemURL</b>, are subject to syntax and other
     * changes without notice. To avoid problems in your application when
     * eBay alters the URL format, we advise you to avoid parsing eBay URLs
     * programmatically. We strive to ensure that other fields in the
     * response contain all the information that is encoded in the URL, and
     * more.
     * </span>
     * 
     *
     * @param java.lang.String
	 */
	public void setItemSearchURL(String itemSearchURL) {
	    this.itemSearchURL = itemSearchURL;
	}
	/**
     * public getter
     *
     * 
     * Reserved for future use.
     * 
     *
     * @returns java.util.List<com.ebay.marketplace.search.v1.services.ExtensionType>
	 */
	public List<ExtensionType> getExtension() {
	    return this.extension;
	}
	
	/**
	 * public setter
	 *
     * 
     * Reserved for future use.
     * 
     *
     * @param java.util.List<com.ebay.marketplace.search.v1.services.ExtensionType>
	 */
	public void setExtension(List<ExtensionType> extension) {
	    this.extension = extension;
	}

}