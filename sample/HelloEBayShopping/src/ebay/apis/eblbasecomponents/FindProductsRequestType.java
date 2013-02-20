// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package ebay.apis.eblbasecomponents;

import com.leansoft.nano.annotation.*;
import java.util.List;

/**
 * 
 * Searches for stock product information.
 * 
 */
@RootElement(name = "FindProductsRequest", namespace = "urn:ebay:apis:eBLBaseComponents")
public class FindProductsRequestType extends AbstractRequestType  {

	@Element(name = "IncludeSelector")
	private String includeSelector;
    
	@Element(name = "AvailableItemsOnly")
	private Boolean availableItemsOnly;
    
	@Element(name = "DomainName")
	private List<String> domainName;
    
	@Element(name = "ProductID")
	private ProductIDType productID;
    
	@Element(name = "QueryKeywords")
	private String queryKeywords;
    
	@Element(name = "ProductSort")
	private ProductSortCodeType productSort;
    
	@Element(name = "SortOrder")
	private SortOrderCodeType sortOrder;
    
	@Element(name = "MaxEntries")
	private Integer maxEntries;
    
	@Element(name = "PageNumber")
	private Integer pageNumber;
    
	@Element(name = "CategoryID")
	private String categoryID;
    
	@Element(name = "HideDuplicateItems")
	private Boolean hideDuplicateItems;
    
    
	/**
     * public getter
     *
     * 
     * Defines standard subsets of fields to return within the
     * response.<br>
     * <br>
     * If you don't specify this field, the call returns a default
     * set of fields, focusing on product details only
     * (see the "Detail Controls" link below). If you specify this
     * field, the additional fields you retrieve can affect the call's
     * response time (performance).<br>
     * <br>
     * <b>Applicable values</b>:
     * <p class="ename">&bull;&nbsp;&nbsp; Details</p>
     * <p class="edef">Include all available item fields
     * in the response. Only applicable when you are searching by
     * ProductID. Not applicable with QueryKeywords.</p>
     * <p class="ename">&bull;&nbsp;&nbsp; DomainHistogram</p>
     * <p class="edef">Include the DomainHistogram in
     * the response. The histogram lists the number of matching
     * products found and the domains in which they were found.
     * (A domain is like a high-level category.)
     * When many matching products are found, you may see
     * significantly slower response times when you include
     * the histogram.</p>
     * <p class="ename">&bull;&nbsp;&nbsp; Items</p>
     * <p class="edef">Include a brief set of item fields
     * in the response.
     * Only applicable when you are searching by ProductID.
     * Not applicable with QueryKeywords.</p>
     * <br>
     * <br>
     * Use a comma to specify multiple values. (In this case,
     * the results are cumulative.) See "FindProducts Samples"
     * for an example of how to use this field.<br>
     * <br>
     * See "Detail Controls" for a complete list of
     * fields that can be returned for each selector.
     * 
     *
     * @returns java.lang.String
	 */
	public String getIncludeSelector() {
	    return this.includeSelector;
	}
	
	/**
	 * public setter
	 *
     * 
     * Defines standard subsets of fields to return within the
     * response.<br>
     * <br>
     * If you don't specify this field, the call returns a default
     * set of fields, focusing on product details only
     * (see the "Detail Controls" link below). If you specify this
     * field, the additional fields you retrieve can affect the call's
     * response time (performance).<br>
     * <br>
     * <b>Applicable values</b>:
     * <p class="ename">&bull;&nbsp;&nbsp; Details</p>
     * <p class="edef">Include all available item fields
     * in the response. Only applicable when you are searching by
     * ProductID. Not applicable with QueryKeywords.</p>
     * <p class="ename">&bull;&nbsp;&nbsp; DomainHistogram</p>
     * <p class="edef">Include the DomainHistogram in
     * the response. The histogram lists the number of matching
     * products found and the domains in which they were found.
     * (A domain is like a high-level category.)
     * When many matching products are found, you may see
     * significantly slower response times when you include
     * the histogram.</p>
     * <p class="ename">&bull;&nbsp;&nbsp; Items</p>
     * <p class="edef">Include a brief set of item fields
     * in the response.
     * Only applicable when you are searching by ProductID.
     * Not applicable with QueryKeywords.</p>
     * <br>
     * <br>
     * Use a comma to specify multiple values. (In this case,
     * the results are cumulative.) See "FindProducts Samples"
     * for an example of how to use this field.<br>
     * <br>
     * See "Detail Controls" for a complete list of
     * fields that can be returned for each selector.
     * 
     *
     * @param java.lang.String
	 */
	public void setIncludeSelector(String includeSelector) {
	    this.includeSelector = includeSelector;
	}
	/**
     * public getter
     *
     * 
     * If true, only retrieve data for products that have been used to
     * pre-fill active listings on the specified eBay site.
     * If false, retrieve all products that match the query.
     * This is useful when you use QueryKeywords and you only want to
     * find products that have associated items (that is, where ItemArray
     * would not beempty).<br>
     * <br>
     * This does not retrieve ItemArray; this only controls which
     * products are returned (or counted). To retrieve ItemArray,
     * pass Items in IncludeSelector.
     * 
     *
     * @returns java.lang.Boolean
	 */
	public Boolean getAvailableItemsOnly() {
	    return this.availableItemsOnly;
	}
	
	/**
	 * public setter
	 *
     * 
     * If true, only retrieve data for products that have been used to
     * pre-fill active listings on the specified eBay site.
     * If false, retrieve all products that match the query.
     * This is useful when you use QueryKeywords and you only want to
     * find products that have associated items (that is, where ItemArray
     * would not beempty).<br>
     * <br>
     * This does not retrieve ItemArray; this only controls which
     * products are returned (or counted). To retrieve ItemArray,
     * pass Items in IncludeSelector.
     * 
     *
     * @param java.lang.Boolean
	 */
	public void setAvailableItemsOnly(Boolean availableItemsOnly) {
	    this.availableItemsOnly = availableItemsOnly;
	}
	/**
     * public getter
     *
     * 
     * A domain to search in. This is like searching a section of
     * a catalog. If not specified, the product search is conducted
     * across all domains.
     * DomainName is an unbounded field. If you are using a URL, and you want
     * to specify multiple values, use an index value (not a comma).
     * For example, to specify DomainName=Textbooks,Education,
     * specify DomainName(0)=Textbooks,%20Education.
     * To determine valid domain names,
     * first use this call with QueryKeywords. Domain names are returned
     * for each product (and summarized in the domain histogram, if you
     * specify DomainHistogram in IncludeSelector).<br>
     * <br>
     * A domain is a named grouping of categories whose items share
     * common product characteristics. For example, all bound books
     * have a binding or format (e.g., Hardcover), but audiobooks don't.
     * So audiobooks would have their own domain.
     * To limit your search to audiobooks, you would specify Audiobooks
     * as the domain.<br>
     * <br>
     * Only useful when QueryKeywords is specified. If you use this with
     * ProductID, AND logic is applied. In this case, if you specify an
     * ID that doesn't match the domain (as eBay has defined it),
     * no matching product will be found. Therefore, we recommend that you only use DomainName with QueryKeywords.
     * 
     *
     * @returns java.util.List<java.lang.String>
	 */
	public List<String> getDomainName() {
	    return this.domainName;
	}
	
	/**
	 * public setter
	 *
     * 
     * A domain to search in. This is like searching a section of
     * a catalog. If not specified, the product search is conducted
     * across all domains.
     * DomainName is an unbounded field. If you are using a URL, and you want
     * to specify multiple values, use an index value (not a comma).
     * For example, to specify DomainName=Textbooks,Education,
     * specify DomainName(0)=Textbooks,%20Education.
     * To determine valid domain names,
     * first use this call with QueryKeywords. Domain names are returned
     * for each product (and summarized in the domain histogram, if you
     * specify DomainHistogram in IncludeSelector).<br>
     * <br>
     * A domain is a named grouping of categories whose items share
     * common product characteristics. For example, all bound books
     * have a binding or format (e.g., Hardcover), but audiobooks don't.
     * So audiobooks would have their own domain.
     * To limit your search to audiobooks, you would specify Audiobooks
     * as the domain.<br>
     * <br>
     * Only useful when QueryKeywords is specified. If you use this with
     * ProductID, AND logic is applied. In this case, if you specify an
     * ID that doesn't match the domain (as eBay has defined it),
     * no matching product will be found. Therefore, we recommend that you only use DomainName with QueryKeywords.
     * 
     *
     * @param java.util.List<java.lang.String>
	 */
	public void setDomainName(List<String> domainName) {
	    this.domainName = domainName;
	}
	/**
     * public getter
     *
     * 
     * Use this to retrieve product details for one specific product.
     * Specify the ID as a string, and use the type attribute to
     * indicate the nature of the ID you are specifying.
     * <br>
     * <br>
     * The request requires a single one of these three elements: QueryKeywords,
     * ProductID, or CategoryID, and can only include one of the three.
     * 
     *
     * @returns ebay.apis.eblbasecomponents.ProductIDType
	 */
	public ProductIDType getProductID() {
	    return this.productID;
	}
	
	/**
	 * public setter
	 *
     * 
     * Use this to retrieve product details for one specific product.
     * Specify the ID as a string, and use the type attribute to
     * indicate the nature of the ID you are specifying.
     * <br>
     * <br>
     * The request requires a single one of these three elements: QueryKeywords,
     * ProductID, or CategoryID, and can only include one of the three.
     * 
     *
     * @param ebay.apis.eblbasecomponents.ProductIDType
	 */
	public void setProductID(ProductIDType productID) {
	    this.productID = productID;
	}
	/**
     * public getter
     *
     * 
     * One or more keywords to search for. When you use a keyword search,
     * eBay searches the product catalogs  for matching words in the
     * product title, description, and/or Item Specifics, and it returns
     * a list of matching products, with no items. To retrieve
     * items, use ProductID instead. (If you don't already have a
     * product ID, you can get product IDs from the
     * response after conducting a keyword search.)<br>
     * <br>
     * If specified, you must pass in at least 3 alphanumeric characters.<br>
     * <br>
     * The words "and" and "or" are treated like any other word.
     * Only use "and", "or", or "the" if you are searching for products
     * containing these words.
     * To use AND or OR logic, use eBay's standard search string
     * modifiers. Wildcards (+, -, or *) are also supported.
     * Be careful when using spaces before or after modifiers and
     * wildcards.<br>
     * <br>
     * Some keyword queries can result in response times of 30 seconds or
     * longer. If more than 2000 matches are found, the call fails with
     * an error. If this kind of error occurs, refine the search by
     * passing in more keywords and/or by using DomainName to restrict
     * the search to certain domains (such as DVDs).
     * If you are searching for a particular book, DVD, CD, or video game
     * and you already know its ISBN or EAN (for a book) or UPC,
     * consider using ProductID instead to retrieve more
     * precise results. <br>
     * <br>
     * The request requires a single one of these three elements: QueryKeywords,
     * ProductID, or CategoryID, and can only include one of the three.
     * 
     *
     * @returns java.lang.String
	 */
	public String getQueryKeywords() {
	    return this.queryKeywords;
	}
	
	/**
	 * public setter
	 *
     * 
     * One or more keywords to search for. When you use a keyword search,
     * eBay searches the product catalogs  for matching words in the
     * product title, description, and/or Item Specifics, and it returns
     * a list of matching products, with no items. To retrieve
     * items, use ProductID instead. (If you don't already have a
     * product ID, you can get product IDs from the
     * response after conducting a keyword search.)<br>
     * <br>
     * If specified, you must pass in at least 3 alphanumeric characters.<br>
     * <br>
     * The words "and" and "or" are treated like any other word.
     * Only use "and", "or", or "the" if you are searching for products
     * containing these words.
     * To use AND or OR logic, use eBay's standard search string
     * modifiers. Wildcards (+, -, or *) are also supported.
     * Be careful when using spaces before or after modifiers and
     * wildcards.<br>
     * <br>
     * Some keyword queries can result in response times of 30 seconds or
     * longer. If more than 2000 matches are found, the call fails with
     * an error. If this kind of error occurs, refine the search by
     * passing in more keywords and/or by using DomainName to restrict
     * the search to certain domains (such as DVDs).
     * If you are searching for a particular book, DVD, CD, or video game
     * and you already know its ISBN or EAN (for a book) or UPC,
     * consider using ProductID instead to retrieve more
     * precise results. <br>
     * <br>
     * The request requires a single one of these three elements: QueryKeywords,
     * ProductID, or CategoryID, and can only include one of the three.
     * 
     *
     * @param java.lang.String
	 */
	public void setQueryKeywords(String queryKeywords) {
	    this.queryKeywords = queryKeywords;
	}
	/**
     * public getter
     *
     * 
     * Sorts the list of products returned. This is mostly only useful
     * with QueryKeywords. (When you use ProductID, eBay usually only
     * returns one product.)
     * Also see SortOrder. If ProductSort and SortOrder are not
     * specified, products are sorted by popularity in descending order.
     * 
     *
     * @returns ebay.apis.eblbasecomponents.ProductSortCodeType
	 */
	public ProductSortCodeType getProductSort() {
	    return this.productSort;
	}
	
	/**
	 * public setter
	 *
     * 
     * Sorts the list of products returned. This is mostly only useful
     * with QueryKeywords. (When you use ProductID, eBay usually only
     * returns one product.)
     * Also see SortOrder. If ProductSort and SortOrder are not
     * specified, products are sorted by popularity in descending order.
     * 
     *
     * @param ebay.apis.eblbasecomponents.ProductSortCodeType
	 */
	public void setProductSort(ProductSortCodeType productSort) {
	    this.productSort = productSort;
	}
	/**
     * public getter
     *
     * 
     * Sorts search results in ascending or descending order.
     * Only applicable with ProductSort. If you specify ProductSort
     * without SortOrder, the order defaults to Descending for
     * all criteria except Title (which defaults to Ascending).
     * 
     *
     * @returns ebay.apis.eblbasecomponents.SortOrderCodeType
	 */
	public SortOrderCodeType getSortOrder() {
	    return this.sortOrder;
	}
	
	/**
	 * public setter
	 *
     * 
     * Sorts search results in ascending or descending order.
     * Only applicable with ProductSort. If you specify ProductSort
     * without SortOrder, the order defaults to Descending for
     * all criteria except Title (which defaults to Ascending).
     * 
     *
     * @param ebay.apis.eblbasecomponents.SortOrderCodeType
	 */
	public void setSortOrder(SortOrderCodeType sortOrder) {
	    this.sortOrder = sortOrder;
	}
	/**
     * public getter
     *
     * 
     * Specifies the maximum number of products to return per page
     * in a single call. This is mostly only useful
     * with QueryKeywords. (When you use ProductID, eBay usually only
     * returns one product, and up to 200 items for that product.)
     * 
     *
     * @returns java.lang.Integer
	 */
	public Integer getMaxEntries() {
	    return this.maxEntries;
	}
	
	/**
	 * public setter
	 *
     * 
     * Specifies the maximum number of products to return per page
     * in a single call. This is mostly only useful
     * with QueryKeywords. (When you use ProductID, eBay usually only
     * returns one product, and up to 200 items for that product.)
     * 
     *
     * @param java.lang.Integer
	 */
	public void setMaxEntries(Integer maxEntries) {
	    this.maxEntries = maxEntries;
	}
	/**
     * public getter
     *
     * 
     * Specifies which page of data to return in the current call.
     * Specify a positive value equal to or lower than the number of
     * pages available (which you determine by examining the results of
     * your initial request).
     * 
     *
     * @returns java.lang.Integer
	 */
	public Integer getPageNumber() {
	    return this.pageNumber;
	}
	
	/**
	 * public setter
	 *
     * 
     * Specifies which page of data to return in the current call.
     * Specify a positive value equal to or lower than the number of
     * pages available (which you determine by examining the results of
     * your initial request).
     * 
     *
     * @param java.lang.Integer
	 */
	public void setPageNumber(Integer pageNumber) {
	    this.pageNumber = pageNumber;
	}
	/**
     * public getter
     *
     * 
     * Include a Category ID number in your request to restrict your
     * query to a specific category.
     * <br>
     * The request requires a single one of these three elements: QueryKeywords,
     * ProductID, or CategoryID, and can only include one of the three.
     * 
     *
     * @returns java.lang.String
	 */
	public String getCategoryID() {
	    return this.categoryID;
	}
	
	/**
	 * public setter
	 *
     * 
     * Include a Category ID number in your request to restrict your
     * query to a specific category.
     * <br>
     * The request requires a single one of these three elements: QueryKeywords,
     * ProductID, or CategoryID, and can only include one of the three.
     * 
     *
     * @param java.lang.String
	 */
	public void setCategoryID(String categoryID) {
	    this.categoryID = categoryID;
	}
	/**
     * public getter
     *
     * 
     * Specifies whether or not to remove duplicate items from search results.
     * When set to true, and there are duplicate items for an item in the
     * search results, the subsequent duplicates will not appear in the
     * results.
     * Item listings are considered duplicates in the following
     * conditions: <br>
     * <ul>
     * <li>Items are listed by the same seller</li>
     * <li>Items have exactly the same item title</li>
     * <li>Items have similar listing formats</li>
     * <ul>
     * <li>Auctions: Auction Items, Auction BIN items, Multi-Quantity
     * Auctions, and Multi-Quantity Auctions BIN items</li>
     * <li>Fixed Price: Fixed Price, Multi-quantity Fixed Price, Fixed
     * Price with Best Offer, and Store Inventory Format items</li>
     * <li>Classified Ads</li>
     * </ul>
     * </ul><br>
     * For Auctions, items must also have the same price and number of bids to
     * be considered duplicates.
     * <br>
     * Filtering of duplicate item listings is not supported on all sites.
     * For FindProducts, this filter only works when IncludeSelector is set to Items or Details.
     * 
     *
     * @returns java.lang.Boolean
	 */
	public Boolean getHideDuplicateItems() {
	    return this.hideDuplicateItems;
	}
	
	/**
	 * public setter
	 *
     * 
     * Specifies whether or not to remove duplicate items from search results.
     * When set to true, and there are duplicate items for an item in the
     * search results, the subsequent duplicates will not appear in the
     * results.
     * Item listings are considered duplicates in the following
     * conditions: <br>
     * <ul>
     * <li>Items are listed by the same seller</li>
     * <li>Items have exactly the same item title</li>
     * <li>Items have similar listing formats</li>
     * <ul>
     * <li>Auctions: Auction Items, Auction BIN items, Multi-Quantity
     * Auctions, and Multi-Quantity Auctions BIN items</li>
     * <li>Fixed Price: Fixed Price, Multi-quantity Fixed Price, Fixed
     * Price with Best Offer, and Store Inventory Format items</li>
     * <li>Classified Ads</li>
     * </ul>
     * </ul><br>
     * For Auctions, items must also have the same price and number of bids to
     * be considered duplicates.
     * <br>
     * Filtering of duplicate item listings is not supported on all sites.
     * For FindProducts, this filter only works when IncludeSelector is set to Items or Details.
     * 
     *
     * @param java.lang.Boolean
	 */
	public void setHideDuplicateItems(Boolean hideDuplicateItems) {
	    this.hideDuplicateItems = hideDuplicateItems;
	}

}