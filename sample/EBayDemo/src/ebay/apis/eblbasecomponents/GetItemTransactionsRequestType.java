// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package ebay.apis.eblbasecomponents;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;
import java.util.Date;

/**
 * 
 * Retrieves order line item (transaction) information for a specified <b>ItemID</b>. &
 * nbsp;<b>Also for Half.com</b>. The call returns zero, one, or
 * multiple order line items, depending on the number of items sold from the listing.
 * <br><br>
 * You can retrieve order line item data for a specific time range or
 * number of days. If you don't specify a range or number of days, order line item
 * data will be returned for the past 30 days.
 * 
 */
@RootElement(name = "GetItemTransactionsRequest", namespace = "urn:ebay:apis:eBLBaseComponents")
public class GetItemTransactionsRequestType extends AbstractRequestType implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element(name = "ItemID")
	private String itemID;
	
	@Element(name = "ModTimeFrom")
	private Date modTimeFrom;
	
	@Element(name = "ModTimeTo")
	private Date modTimeTo;
	
	@Element(name = "TransactionID")
	private String transactionID;
	
	@Element(name = "Pagination")
	private PaginationType pagination;
	
	@Element(name = "IncludeFinalValueFee")
	private Boolean includeFinalValueFee;
	
	@Element(name = "IncludeContainingOrder")
	private Boolean includeContainingOrder;
	
	@Element(name = "Platform")
	private TransactionPlatformCodeType platform;
	
	@Element(name = "NumberOfDays")
	private Integer numberOfDays;
	
	@Element(name = "IncludeVariations")
	private Boolean includeVariations;
	
	@Element(name = "OrderLineItemID")
	private String orderLineItemID;
	
    
	/**
     * public getter
     *
     * 
     * Unique identifier for an eBay item listing. A listing can have multiple
     * order line items (transactions), but only one <b>ItemID</b>. When you use
     * <b>ItemID</b> alone, eBay returns all order line items that are associated with
     * the <b>ItemID</b> (listing). If you pair <b>ItemID</b> with a specific <b>TransactionID</b>,
     * data on a specific order line item is returned. If <b>OrderLineItemID</b> is
     * specified in the request, any <b>ItemID</b>/<b>TransactionID</b> pair specified in the
     * same request will be ignored.
     * <br>
     * <br>
     * <span class="tablenote"><b>Note:</b>
     * <b>GetItemTransactions</b> doesn't support SKU as an input because this
     * call requires an identifier that is unique across your active
     * and ended listings. Even when <b>InventoryTrackingMethod</b> is set to
     * <b>SKU</b> in a listing, the SKU is only unique across your active
     * listings (not your ended listings). To retrieve order line items
     * by SKU, use <b>GetSellerTransactions</b> or <b>GetOrderTransactions</b> instead.
     * </span>
     * 
     *
     * @returns java.lang.String
	 */
	public String getItemID() {
	    return this.itemID;
	}
	
	/**
	 * public setter
	 *
     * 
     * Unique identifier for an eBay item listing. A listing can have multiple
     * order line items (transactions), but only one <b>ItemID</b>. When you use
     * <b>ItemID</b> alone, eBay returns all order line items that are associated with
     * the <b>ItemID</b> (listing). If you pair <b>ItemID</b> with a specific <b>TransactionID</b>,
     * data on a specific order line item is returned. If <b>OrderLineItemID</b> is
     * specified in the request, any <b>ItemID</b>/<b>TransactionID</b> pair specified in the
     * same request will be ignored.
     * <br>
     * <br>
     * <span class="tablenote"><b>Note:</b>
     * <b>GetItemTransactions</b> doesn't support SKU as an input because this
     * call requires an identifier that is unique across your active
     * and ended listings. Even when <b>InventoryTrackingMethod</b> is set to
     * <b>SKU</b> in a listing, the SKU is only unique across your active
     * listings (not your ended listings). To retrieve order line items
     * by SKU, use <b>GetSellerTransactions</b> or <b>GetOrderTransactions</b> instead.
     * </span>
     * 
     *
     * @param java.lang.String
	 */
	public void setItemID(String itemID) {
	    this.itemID = itemID;
	}
	/**
     * public getter
     *
     * 
     * The <b>ModTimeFrom</b> and <b>ModTimeTo</b> fields specify a date range for retrieving
     * order line items associated with the specified <b>ItemID</b>. The <b>ModTimeFrom</b>
     * field is the starting date range. All eBay order line items that were
     * last modified within this date range are returned in the output. The
     * maximum date range that may be specified is 30 days. This field is not
     * applicable if a specific <b>TransactionID</b> or <b>OrderLineItemID</b> is included in
     * the request or if the <b>NumberOfDays</b> date filter is used.
     * <br><br>
     * If you don't specify a <b>ModTimeFrom</b>/<b>ModTimeTo</b> filter, the <b>NumberOfDays</b>
     * time filter is used and it defaults to 30 (days). 
     * 
     *
     * @returns java.util.Date
	 */
	public Date getModTimeFrom() {
	    return this.modTimeFrom;
	}
	
	/**
	 * public setter
	 *
     * 
     * The <b>ModTimeFrom</b> and <b>ModTimeTo</b> fields specify a date range for retrieving
     * order line items associated with the specified <b>ItemID</b>. The <b>ModTimeFrom</b>
     * field is the starting date range. All eBay order line items that were
     * last modified within this date range are returned in the output. The
     * maximum date range that may be specified is 30 days. This field is not
     * applicable if a specific <b>TransactionID</b> or <b>OrderLineItemID</b> is included in
     * the request or if the <b>NumberOfDays</b> date filter is used.
     * <br><br>
     * If you don't specify a <b>ModTimeFrom</b>/<b>ModTimeTo</b> filter, the <b>NumberOfDays</b>
     * time filter is used and it defaults to 30 (days). 
     * 
     *
     * @param java.util.Date
	 */
	public void setModTimeFrom(Date modTimeFrom) {
	    this.modTimeFrom = modTimeFrom;
	}
	/**
     * public getter
     *
     * 
     * The <b>ModTimeFrom</b> and <b>ModTimeTo</b> fields specify a date range for retrieving
     * order line items associated with the specified <b>ItemID</b>. The <b>ModTimeTo</b>
     * field is the ending date range. All eBay order line items that were last
     * modified within this date range are returned in the output. The maximum
     * date range that may be specified is 30 days. If the <b>ModTimeFrom</b> field is
     * used and the <b>ModTimeTo</b> field is omitted, the <b>ModTimeTo</b> value defaults to
     * the present time or to 30 days past the <b>ModTimeFrom</b> value (if
     * <b>ModTimeFrom</b> value is more than 30 days in the past). This field is not
     * applicable if a specific <b>TransactionID</b> or <b>OrderLineItemID</b> is included in
     * the request or if the <b>NumberOfDays</b> date filter is used.
     * <br><br>
     * If you don't specify a <b>ModTimeFrom</b>/<b>ModTimeTo</b> filter, the <b>NumberOfDays</b>
     * time filter is used and it defaults to 30 (days).
     * 
     *
     * @returns java.util.Date
	 */
	public Date getModTimeTo() {
	    return this.modTimeTo;
	}
	
	/**
	 * public setter
	 *
     * 
     * The <b>ModTimeFrom</b> and <b>ModTimeTo</b> fields specify a date range for retrieving
     * order line items associated with the specified <b>ItemID</b>. The <b>ModTimeTo</b>
     * field is the ending date range. All eBay order line items that were last
     * modified within this date range are returned in the output. The maximum
     * date range that may be specified is 30 days. If the <b>ModTimeFrom</b> field is
     * used and the <b>ModTimeTo</b> field is omitted, the <b>ModTimeTo</b> value defaults to
     * the present time or to 30 days past the <b>ModTimeFrom</b> value (if
     * <b>ModTimeFrom</b> value is more than 30 days in the past). This field is not
     * applicable if a specific <b>TransactionID</b> or <b>OrderLineItemID</b> is included in
     * the request or if the <b>NumberOfDays</b> date filter is used.
     * <br><br>
     * If you don't specify a <b>ModTimeFrom</b>/<b>ModTimeTo</b> filter, the <b>NumberOfDays</b>
     * time filter is used and it defaults to 30 (days).
     * 
     *
     * @param java.util.Date
	 */
	public void setModTimeTo(Date modTimeTo) {
	    this.modTimeTo = modTimeTo;
	}
	/**
     * public getter
     *
     * 
     * Include a <b>TransactionID</b> field in the request if you want to retrieve the
     * data for a specific order line item (transaction). If a <b>TransactionID</b> is
     * provided, any specified time filter is ignored. 
     * 
     *
     * @returns java.lang.String
	 */
	public String getTransactionID() {
	    return this.transactionID;
	}
	
	/**
	 * public setter
	 *
     * 
     * Include a <b>TransactionID</b> field in the request if you want to retrieve the
     * data for a specific order line item (transaction). If a <b>TransactionID</b> is
     * provided, any specified time filter is ignored. 
     * 
     *
     * @param java.lang.String
	 */
	public void setTransactionID(String transactionID) {
	    this.transactionID = transactionID;
	}
	/**
     * public getter
     *
     * 
     * Child elements control pagination of the output. Use the <b>EntriesPerPage</b>
     * property to control the number of order line items to
     * return per call and the <b>PageNumber</b> property to specify the specific page
     * of data to return. If multiple pages of order line items are returned
     * based on input criteria and Pagination properties, <b>GetItemTransactions</b>
     * will need to be called multiple times (with the <b>PageNumber</b> value being
     * increased by 1 each time) to scroll through all results.
     * 
     *
     * @returns ebay.apis.eblbasecomponents.PaginationType
	 */
	public PaginationType getPagination() {
	    return this.pagination;
	}
	
	/**
	 * public setter
	 *
     * 
     * Child elements control pagination of the output. Use the <b>EntriesPerPage</b>
     * property to control the number of order line items to
     * return per call and the <b>PageNumber</b> property to specify the specific page
     * of data to return. If multiple pages of order line items are returned
     * based on input criteria and Pagination properties, <b>GetItemTransactions</b>
     * will need to be called multiple times (with the <b>PageNumber</b> value being
     * increased by 1 each time) to scroll through all results.
     * 
     *
     * @param ebay.apis.eblbasecomponents.PaginationType
	 */
	public void setPagination(PaginationType pagination) {
	    this.pagination = pagination;
	}
	/**
     * public getter
     *
     * 
     * Indicates whether to include the Final Value Fee (FVF) for all order
     * line items in the response. The Final Value Fee is
     * returned in the <b>Transaction.FinalValueFee</b> field. The Final Value Fee is
     * assessed right after the creation of an order line item.
     * 
     * <br>
     * 
     *
     * @returns java.lang.Boolean
	 */
	public Boolean getIncludeFinalValueFee() {
	    return this.includeFinalValueFee;
	}
	
	/**
	 * public setter
	 *
     * 
     * Indicates whether to include the Final Value Fee (FVF) for all order
     * line items in the response. The Final Value Fee is
     * returned in the <b>Transaction.FinalValueFee</b> field. The Final Value Fee is
     * assessed right after the creation of an order line item.
     * 
     * <br>
     * 
     *
     * @param java.lang.Boolean
	 */
	public void setIncludeFinalValueFee(Boolean includeFinalValueFee) {
	    this.includeFinalValueFee = includeFinalValueFee;
	}
	/**
     * public getter
     *
     * 
     * Include this field and set it to True if you want the <b>ContainingOrder</b>
     * container to be returned in the response under each <b>Transaction</b> node.
     * For single line item orders, the <b>ContainingOrder.OrderID</b> value takes the
     * value of the <b>OrderLineItemID</b> value for the order line item. For Combined
     * Payment orders, the <b>ContainingOrder.OrderID</b> value will be shared by at
     * least two order line items (transactions) that are part of the same order.
     * 
     *
     * @returns java.lang.Boolean
	 */
	public Boolean getIncludeContainingOrder() {
	    return this.includeContainingOrder;
	}
	
	/**
	 * public setter
	 *
     * 
     * Include this field and set it to True if you want the <b>ContainingOrder</b>
     * container to be returned in the response under each <b>Transaction</b> node.
     * For single line item orders, the <b>ContainingOrder.OrderID</b> value takes the
     * value of the <b>OrderLineItemID</b> value for the order line item. For Combined
     * Payment orders, the <b>ContainingOrder.OrderID</b> value will be shared by at
     * least two order line items (transactions) that are part of the same order.
     * 
     *
     * @param java.lang.Boolean
	 */
	public void setIncludeContainingOrder(Boolean includeContainingOrder) {
	    this.includeContainingOrder = includeContainingOrder;
	}
	/**
     * public getter
     *
     * 
     * Name of the eBay co-branded site upon which the order line item
     * was created. This filter can be used to limit the number
     * of results that are returned.
     * 
     *
     * @returns ebay.apis.eblbasecomponents.TransactionPlatformCodeType
	 */
	public TransactionPlatformCodeType getPlatform() {
	    return this.platform;
	}
	
	/**
	 * public setter
	 *
     * 
     * Name of the eBay co-branded site upon which the order line item
     * was created. This filter can be used to limit the number
     * of results that are returned.
     * 
     *
     * @param ebay.apis.eblbasecomponents.TransactionPlatformCodeType
	 */
	public void setPlatform(TransactionPlatformCodeType platform) {
	    this.platform = platform;
	}
	/**
     * public getter
     *
     * 
     * This time filter specifies the number of days (24-hour periods) in the
     * past to search for order line items. All eBay order line items that were
     * either created or modified within this period are returned in the
     * response. If specified, <b>NumberOfDays</b> will override any date range
     * specified with the <b>ModTimeFrom</b>/<b>ModTimeTo</b> time filters. This field is not
     * applicable if a specific <b>TransactionID</b> or <b>OrderLineItemID</b> is included in
     * the request.
     * 
     *
     * @returns java.lang.Integer
	 */
	public Integer getNumberOfDays() {
	    return this.numberOfDays;
	}
	
	/**
	 * public setter
	 *
     * 
     * This time filter specifies the number of days (24-hour periods) in the
     * past to search for order line items. All eBay order line items that were
     * either created or modified within this period are returned in the
     * response. If specified, <b>NumberOfDays</b> will override any date range
     * specified with the <b>ModTimeFrom</b>/<b>ModTimeTo</b> time filters. This field is not
     * applicable if a specific <b>TransactionID</b> or <b>OrderLineItemID</b> is included in
     * the request.
     * 
     *
     * @param java.lang.Integer
	 */
	public void setNumberOfDays(Integer numberOfDays) {
	    this.numberOfDays = numberOfDays;
	}
	/**
     * public getter
     *
     * 
     * If included in the request and set to True, all variations defined for
     * the item are returned at the root level, including variations
     * that have no sales. If not included in the request or set to false, the
     * variations with sales are still returned in separate <b>Transaction</b> nodes. This information is intended to help sellers to reconcile their
     * local inventory with eBay's records, while processing order line items
     * (without requiring a separate call to <b>GetItem</b>).
     * 
     *
     * @returns java.lang.Boolean
	 */
	public Boolean getIncludeVariations() {
	    return this.includeVariations;
	}
	
	/**
	 * public setter
	 *
     * 
     * If included in the request and set to True, all variations defined for
     * the item are returned at the root level, including variations
     * that have no sales. If not included in the request or set to false, the
     * variations with sales are still returned in separate <b>Transaction</b> nodes. This information is intended to help sellers to reconcile their
     * local inventory with eBay's records, while processing order line items
     * (without requiring a separate call to <b>GetItem</b>).
     * 
     *
     * @param java.lang.Boolean
	 */
	public void setIncludeVariations(Boolean includeVariations) {
	    this.includeVariations = includeVariations;
	}
	/**
     * public getter
     *
     * 
     * A unique identifier for an eBay order line item. This field is created
     * as soon as there is a commitment to buy from the seller, and its value
     * is based upon the concatenation of <b>ItemID</b> and <b>TransactionID</b>, with a
     * hyphen in between these two IDs. If you want to retrieve data on a
     * specific order line item, you can use an <b>OrderLineItemID</b> value in the
     * request instead of the <b>ItemID</b>/<b>TransactionID</b> pair. If an <b>OrderLineItemID</b> is
     * provided, any specified time filter is ignored. 
     * 
     *
     * @returns java.lang.String
	 */
	public String getOrderLineItemID() {
	    return this.orderLineItemID;
	}
	
	/**
	 * public setter
	 *
     * 
     * A unique identifier for an eBay order line item. This field is created
     * as soon as there is a commitment to buy from the seller, and its value
     * is based upon the concatenation of <b>ItemID</b> and <b>TransactionID</b>, with a
     * hyphen in between these two IDs. If you want to retrieve data on a
     * specific order line item, you can use an <b>OrderLineItemID</b> value in the
     * request instead of the <b>ItemID</b>/<b>TransactionID</b> pair. If an <b>OrderLineItemID</b> is
     * provided, any specified time filter is ignored. 
     * 
     *
     * @param java.lang.String
	 */
	public void setOrderLineItemID(String orderLineItemID) {
	    this.orderLineItemID = orderLineItemID;
	}

}