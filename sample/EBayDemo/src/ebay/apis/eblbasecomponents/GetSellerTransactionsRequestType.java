// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package ebay.apis.eblbasecomponents;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;
import java.util.Date;

/**
 * 
 * Retrieves order line item (transaction) information for the user for which the
 * call is made, and not for any other user.&nbsp;<b>Also for
 * Half.com</b>. (To retrieve order line items for another seller's listings, use
 * GetItemTransactions.)
 * 
 */
@RootElement(name = "GetSellerTransactionsRequest", namespace = "urn:ebay:apis:eBLBaseComponents")
public class GetSellerTransactionsRequestType extends AbstractRequestType implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element(name = "ModTimeFrom")
	private Date modTimeFrom;
	
	@Element(name = "ModTimeTo")
	private Date modTimeTo;
	
	@Element(name = "Pagination")
	private PaginationType pagination;
	
	@Element(name = "IncludeFinalValueFee")
	private Boolean includeFinalValueFee;
	
	@Element(name = "IncludeContainingOrder")
	private Boolean includeContainingOrder;
	
	@Element(name = "SKUArray")
	private SKUArrayType skuArray;
	
	@Element(name = "Platform")
	private TransactionPlatformCodeType platform;
	
	@Element(name = "NumberOfDays")
	private Integer numberOfDays;
	
	@Element(name = "InventoryTrackingMethod")
	private InventoryTrackingMethodCodeType inventoryTrackingMethod;
	
	@Element(name = "IncludeCodiceFiscale")
	private Boolean includeCodiceFiscale;
	
    
	/**
     * public getter
     *
     * 
     * The ModTimeFrom and ModTimeTo fields specify a date range for retrieving
     * order line items associated with the seller. The ModTimeFrom
     * field is the starting date range. All of the seller's order line items that were
     * last modified within this date range are returned in the output. The
     * maximum date range that may be specified is 30 days. This field is not
     * applicable if the NumberOfDays date filter is used.
     * <br><br>
     * If you don't specify a ModTimeFrom/ModTimeTo filter, the NumberOfDays
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
     * The ModTimeFrom and ModTimeTo fields specify a date range for retrieving
     * order line items associated with the seller. The ModTimeFrom
     * field is the starting date range. All of the seller's order line items that were
     * last modified within this date range are returned in the output. The
     * maximum date range that may be specified is 30 days. This field is not
     * applicable if the NumberOfDays date filter is used.
     * <br><br>
     * If you don't specify a ModTimeFrom/ModTimeTo filter, the NumberOfDays
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
     * The ModTimeFrom and ModTimeTo fields specify a date range for retrieving
     * order line items associated with the seller. The ModTimeTo
     * field is the ending date range. All of the seller's order line items that were last
     * modified within this date range are returned in the output. The maximum
     * date range that may be specified is 30 days. If the ModTimeFrom field is
     * used and the ModTimeTo field is omitted, the ModTimeTo value defaults to
     * the present time or to 30 days past the ModTimeFrom value (if
     * ModTimeFrom value is more than 30 days in the past). This field is not
     * applicable if the NumberOfDays date filter is used.
     * <br><br>
     * If you don't specify a ModTimeFrom/ModTimeTo filter, the NumberOfDays
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
     * The ModTimeFrom and ModTimeTo fields specify a date range for retrieving
     * order line items associated with the seller. The ModTimeTo
     * field is the ending date range. All of the seller's order line items that were last
     * modified within this date range are returned in the output. The maximum
     * date range that may be specified is 30 days. If the ModTimeFrom field is
     * used and the ModTimeTo field is omitted, the ModTimeTo value defaults to
     * the present time or to 30 days past the ModTimeFrom value (if
     * ModTimeFrom value is more than 30 days in the past). This field is not
     * applicable if the NumberOfDays date filter is used.
     * <br><br>
     * If you don't specify a ModTimeFrom/ModTimeTo filter, the NumberOfDays
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
     * Child elements control pagination of the output. Use EntriesPerPage property to
     * control the number of transactions to return per call and PageNumber property to
     * specify the page of data to return.
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
     * Child elements control pagination of the output. Use EntriesPerPage property to
     * control the number of transactions to return per call and PageNumber property to
     * specify the page of data to return.
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
     * Indicates whether to include Final Value Fee (FVF) in the response. For most
     * listing types, the Final Value Fee is returned in Transaction.FinalValueFee.
     * The Final Value Fee is returned for each order line item.
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
     * Indicates whether to include Final Value Fee (FVF) in the response. For most
     * listing types, the Final Value Fee is returned in Transaction.FinalValueFee.
     * The Final Value Fee is returned for each order line item.
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
     * Include this field and set it to True if you want the ContainingOrder
     * container to be returned in the response under each Transaction node.
     * For single line item orders, the ContainingOrder.OrderID value takes the
     * value of the OrderLineItemID value for the order line item. For Combined
     * Payment orders, the ContainingOrder.OrderID value will be shared by at
     * least two order line items (transactions) that are part of the same
     * order.
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
     * Include this field and set it to True if you want the ContainingOrder
     * container to be returned in the response under each Transaction node.
     * For single line item orders, the ContainingOrder.OrderID value takes the
     * value of the OrderLineItemID value for the order line item. For Combined
     * Payment orders, the ContainingOrder.OrderID value will be shared by at
     * least two order line items (transactions) that are part of the same
     * order.
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
     * Container for a set of SKUs.
     * Filters (reduces) the response to only include order line items
     * for listings that include any of the specified SKUs.
     * If multiple listings include the same SKU, order line items for
     * all of them are returned (assuming they also match the other
     * criteria in the GetSellerTransactions request).<br>
     * <br>
     * You can combine SKUArray with InventoryTrackingMethod.
     * For example, if you also pass in InventoryTrackingMethod=SKU,
     * the response only includes order line items for listings that
     * include InventoryTrackingMethod=SKU and one of the
     * requested SKUs.
     * 
     *
     * @returns ebay.apis.eblbasecomponents.SKUArrayType
	 */
	public SKUArrayType getSkuArray() {
	    return this.skuArray;
	}
	
	/**
	 * public setter
	 *
     * 
     * Container for a set of SKUs.
     * Filters (reduces) the response to only include order line items
     * for listings that include any of the specified SKUs.
     * If multiple listings include the same SKU, order line items for
     * all of them are returned (assuming they also match the other
     * criteria in the GetSellerTransactions request).<br>
     * <br>
     * You can combine SKUArray with InventoryTrackingMethod.
     * For example, if you also pass in InventoryTrackingMethod=SKU,
     * the response only includes order line items for listings that
     * include InventoryTrackingMethod=SKU and one of the
     * requested SKUs.
     * 
     *
     * @param ebay.apis.eblbasecomponents.SKUArrayType
	 */
	public void setSkuArray(SKUArrayType skuArray) {
	    this.skuArray = skuArray;
	}
	/**
     * public getter
     *
     * 
     * Name of the eBay co-branded site upon which the order line item was made.
     * This will serve as a filter for the order line items to get emitted in the response.
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
     * Name of the eBay co-branded site upon which the order line item was made.
     * This will serve as a filter for the order line items to get emitted in the response.
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
     * NumberOfDays enables you to specify the number of days' worth of new and modified
     * order line items that you want to retrieve. The call response contains the
     * order line items whose status was modified within the specified number of days since
     * the API call was made. NumberOfDays is often preferable to using the ModTimeFrom
     * and ModTimeTo filters because you only need to specify one value. If you use
     * NumberOfDays, then ModTimeFrom and ModTimeTo are ignored. For this field, one day
     * is defined as 24 hours.
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
     * NumberOfDays enables you to specify the number of days' worth of new and modified
     * order line items that you want to retrieve. The call response contains the
     * order line items whose status was modified within the specified number of days since
     * the API call was made. NumberOfDays is often preferable to using the ModTimeFrom
     * and ModTimeTo filters because you only need to specify one value. If you use
     * NumberOfDays, then ModTimeFrom and ModTimeTo are ignored. For this field, one day
     * is defined as 24 hours.
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
     * Filters the response to only include order line items for listings
     * that match this InventoryTrackingMethod setting. <br>
     * <br>
     * To track items by seller-defined SKU values instead of by Item IDs, the 
     * <b>InventoryTrackingMethod</b> must be included and set to 'SKU' 
     * in the <b>AddFixedPriceItem</b> (or <b>ReviseFixedPriceItem</b> 
     * or <b>RelistFixedPriceItem</b>) call.
     * <br>
     * <br>
     * You can combine SKUArray with InventoryTrackingMethod.
     * For example, if you set this to SKU and you also pass in
     * SKUArray, the response only includes order line items for listings
     * that include InventoryTrackingMethod=SKU and one of the
     * requested SKUs.
     * 
     *
     * @returns ebay.apis.eblbasecomponents.InventoryTrackingMethodCodeType
	 */
	public InventoryTrackingMethodCodeType getInventoryTrackingMethod() {
	    return this.inventoryTrackingMethod;
	}
	
	/**
	 * public setter
	 *
     * 
     * Filters the response to only include order line items for listings
     * that match this InventoryTrackingMethod setting. <br>
     * <br>
     * To track items by seller-defined SKU values instead of by Item IDs, the 
     * <b>InventoryTrackingMethod</b> must be included and set to 'SKU' 
     * in the <b>AddFixedPriceItem</b> (or <b>ReviseFixedPriceItem</b> 
     * or <b>RelistFixedPriceItem</b>) call.
     * <br>
     * <br>
     * You can combine SKUArray with InventoryTrackingMethod.
     * For example, if you set this to SKU and you also pass in
     * SKUArray, the response only includes order line items for listings
     * that include InventoryTrackingMethod=SKU and one of the
     * requested SKUs.
     * 
     *
     * @param ebay.apis.eblbasecomponents.InventoryTrackingMethodCodeType
	 */
	public void setInventoryTrackingMethod(InventoryTrackingMethodCodeType inventoryTrackingMethod) {
	    this.inventoryTrackingMethod = inventoryTrackingMethod;
	}
	/**
     * public getter
     *
     * 
     * If this flag is included in the request and set to 'true', the buyer's Codice Fiscale 
     * number is returned in the response (if provided by the buyer).
     * <br/><br/>
     * This field is only applicable to Italian sellers. The Codice Fiscale number is unique 
     * for each Italian citizen and is used for tax purposes.
     * 
     *
     * @returns java.lang.Boolean
	 */
	public Boolean getIncludeCodiceFiscale() {
	    return this.includeCodiceFiscale;
	}
	
	/**
	 * public setter
	 *
     * 
     * If this flag is included in the request and set to 'true', the buyer's Codice Fiscale 
     * number is returned in the response (if provided by the buyer).
     * <br/><br/>
     * This field is only applicable to Italian sellers. The Codice Fiscale number is unique 
     * for each Italian citizen and is used for tax purposes.
     * 
     *
     * @param java.lang.Boolean
	 */
	public void setIncludeCodiceFiscale(Boolean includeCodiceFiscale) {
	    this.includeCodiceFiscale = includeCodiceFiscale;
	}

}