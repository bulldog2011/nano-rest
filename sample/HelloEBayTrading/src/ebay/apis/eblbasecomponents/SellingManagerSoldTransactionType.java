// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package ebay.apis.eblbasecomponents;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;
import java.util.List;

/**
 * 
 * Contains information about a single line item (transaction) in an order created
 * through Selling Manager.
 * 
 */
public class SellingManagerSoldTransactionType implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element(name = "InvoiceNumber")
	private String invoiceNumber;
	
	@Element(name = "TransactionID")
	private Long transactionID;
	
	@Element(name = "SaleRecordID")
	private Long saleRecordID;
	
	@Element(name = "ItemID")
	private String itemID;
	
	@Element(name = "QuantitySold")
	private Integer quantitySold;
	
	@Element(name = "ItemPrice")
	private AmountType itemPrice;
	
	@Element(name = "SubtotalAmount")
	private AmountType subtotalAmount;
	
	@Element(name = "ItemTitle")
	private String itemTitle;
	
	@Element(name = "ListingType")
	private ListingTypeCodeType listingType;
	
	@Element(name = "Relisted")
	private Boolean relisted;
	
	@Element(name = "WatchCount")
	private Integer watchCount;
	
	@Element(name = "StartPrice")
	private AmountType startPrice;
	
	@Element(name = "ReservePrice")
	private AmountType reservePrice;
	
	@Element(name = "SecondChanceOfferSent")
	private Boolean secondChanceOfferSent;
	
	@Element(name = "CustomLabel")
	private String customLabel;
	
	@Element(name = "SoldOn")
	private TransactionPlatformCodeType soldOn;
	
	@Element(name = "ListedOn")
	private List<TransactionPlatformCodeType> listedOn;
	
	@Element(name = "Shipment")
	private ShipmentType shipment;
	
	@Element(name = "CharityListing")
	private Boolean charityListing;
	
	@Element(name = "Variation")
	private VariationType variation;
	
	@Element(name = "OrderLineItemID")
	private String orderLineItemID;
	
    
	/**
     * public getter
     *
     * 
     * Seller's customized invoice number.
     * 
     *
     * @returns java.lang.String
	 */
	public String getInvoiceNumber() {
	    return this.invoiceNumber;
	}
	
	/**
	 * public setter
	 *
     * 
     * Seller's customized invoice number.
     * 
     *
     * @param java.lang.String
	 */
	public void setInvoiceNumber(String invoiceNumber) {
	    this.invoiceNumber = invoiceNumber;
	}
	/**
     * public getter
     *
     * 
     * Unique identifier for an eBay order line item (transaction). An order line
     * item is created once there is a commitment from a buyer to
     * purchase an item. Since an auction listing can only have one order line
     * item during the duration of the listing, the <b>TransactionID</b>
     * for auction listings is always 0. Along with its corresponding <b>ItemID</b>, a
     * <b>TransactionID</b> is used and referenced during an order checkout flow and
     * after checkout has been completed.
     * 
     *
     * @returns java.lang.Long
	 */
	public Long getTransactionID() {
	    return this.transactionID;
	}
	
	/**
	 * public setter
	 *
     * 
     * Unique identifier for an eBay order line item (transaction). An order line
     * item is created once there is a commitment from a buyer to
     * purchase an item. Since an auction listing can only have one order line
     * item during the duration of the listing, the <b>TransactionID</b>
     * for auction listings is always 0. Along with its corresponding <b>ItemID</b>, a
     * <b>TransactionID</b> is used and referenced during an order checkout flow and
     * after checkout has been completed.
     * 
     *
     * @param java.lang.Long
	 */
	public void setTransactionID(Long transactionID) {
	    this.transactionID = transactionID;
	}
	/**
     * public getter
     *
     * 
     * Unique identifier for a Selling Manager sale record. This field is created
     * at the same time as the order line item (transaction). A sale record is
     * displayed in the Sold view in Selling Manager and contains information on
     * the buyer and shipping. In the <b>GetItemTransactions</b>, <b>GetSellerTransactions</b>,
     * <b>GetOrders</b>, and <b>GetOrderTransactions</b> calls, the <b>SaleRecordID</b> value is
     * reflected in the <b>ShippingDetails.SellingManagerSalesRecordNumber</b> field.
     * <br/><br/>
     * For orders that occurred within the last 30 days, passing only the SaleRecordID into the GetSellingManagerSoldListings
     * request will return the sale record. However, for sales that occurred more than 30 days ago, the SaleDateRange container
     * must also be used, passing in a date range that includes the date on which the specific sale occurred.
     * 
     *
     * @returns java.lang.Long
	 */
	public Long getSaleRecordID() {
	    return this.saleRecordID;
	}
	
	/**
	 * public setter
	 *
     * 
     * Unique identifier for a Selling Manager sale record. This field is created
     * at the same time as the order line item (transaction). A sale record is
     * displayed in the Sold view in Selling Manager and contains information on
     * the buyer and shipping. In the <b>GetItemTransactions</b>, <b>GetSellerTransactions</b>,
     * <b>GetOrders</b>, and <b>GetOrderTransactions</b> calls, the <b>SaleRecordID</b> value is
     * reflected in the <b>ShippingDetails.SellingManagerSalesRecordNumber</b> field.
     * <br/><br/>
     * For orders that occurred within the last 30 days, passing only the SaleRecordID into the GetSellingManagerSoldListings
     * request will return the sale record. However, for sales that occurred more than 30 days ago, the SaleDateRange container
     * must also be used, passing in a date range that includes the date on which the specific sale occurred.
     * 
     *
     * @param java.lang.Long
	 */
	public void setSaleRecordID(Long saleRecordID) {
	    this.saleRecordID = saleRecordID;
	}
	/**
     * public getter
     *
     * 
     * Unique identifier for an eBay item listing.
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
     * Unique identifier for an eBay item listing.
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
     * Total number of identical items sold in the order line item.
     * 
     *
     * @returns java.lang.Integer
	 */
	public Integer getQuantitySold() {
	    return this.quantitySold;
	}
	
	/**
	 * public setter
	 *
     * 
     * Total number of identical items sold in the order line item.
     * 
     *
     * @param java.lang.Integer
	 */
	public void setQuantitySold(Integer quantitySold) {
	    this.quantitySold = quantitySold;
	}
	/**
     * public getter
     *
     * 
     * Price per item.
     * 
     *
     * @returns ebay.apis.eblbasecomponents.AmountType
	 */
	public AmountType getItemPrice() {
	    return this.itemPrice;
	}
	
	/**
	 * public setter
	 *
     * 
     * Price per item.
     * 
     *
     * @param ebay.apis.eblbasecomponents.AmountType
	 */
	public void setItemPrice(AmountType itemPrice) {
	    this.itemPrice = itemPrice;
	}
	/**
     * public getter
     *
     * 
     * This value is calculated by multplying the <b>ItemPrice</b> value by the
     * <b>QuantitySold</b> value.
     * 
     *
     * @returns ebay.apis.eblbasecomponents.AmountType
	 */
	public AmountType getSubtotalAmount() {
	    return this.subtotalAmount;
	}
	
	/**
	 * public setter
	 *
     * 
     * This value is calculated by multplying the <b>ItemPrice</b> value by the
     * <b>QuantitySold</b> value.
     * 
     *
     * @param ebay.apis.eblbasecomponents.AmountType
	 */
	public void setSubtotalAmount(AmountType subtotalAmount) {
	    this.subtotalAmount = subtotalAmount;
	}
	/**
     * public getter
     *
     * 
     * The title of the item listing.
     * <br><br>
     * <span class="tablenote"><b>Note:</b>
     * The maximum length of an eBay Item Title is increasing to 80 characters in
     * Version 735.
     * </span>
     * 
     *
     * @returns java.lang.String
	 */
	public String getItemTitle() {
	    return this.itemTitle;
	}
	
	/**
	 * public setter
	 *
     * 
     * The title of the item listing.
     * <br><br>
     * <span class="tablenote"><b>Note:</b>
     * The maximum length of an eBay Item Title is increasing to 80 characters in
     * Version 735.
     * </span>
     * 
     *
     * @param java.lang.String
	 */
	public void setItemTitle(String itemTitle) {
	    this.itemTitle = itemTitle;
	}
	/**
     * public getter
     *
     * 
     * The item listing type.
     * 
     *
     * @returns ebay.apis.eblbasecomponents.ListingTypeCodeType
	 */
	public ListingTypeCodeType getListingType() {
	    return this.listingType;
	}
	
	/**
	 * public setter
	 *
     * 
     * The item listing type.
     * 
     *
     * @param ebay.apis.eblbasecomponents.ListingTypeCodeType
	 */
	public void setListingType(ListingTypeCodeType listingType) {
	    this.listingType = listingType;
	}
	/**
     * public getter
     *
     * 
     * Boolean value indicating whether the item is a relisted item.
     * 
     *
     * @returns java.lang.Boolean
	 */
	public Boolean getRelisted() {
	    return this.relisted;
	}
	
	/**
	 * public setter
	 *
     * 
     * Boolean value indicating whether the item is a relisted item.
     * 
     *
     * @param java.lang.Boolean
	 */
	public void setRelisted(Boolean relisted) {
	    this.relisted = relisted;
	}
	/**
     * public getter
     *
     * 
     * Number of users watching the item.
     * 
     *
     * @returns java.lang.Integer
	 */
	public Integer getWatchCount() {
	    return this.watchCount;
	}
	
	/**
	 * public setter
	 *
     * 
     * Number of users watching the item.
     * 
     *
     * @param java.lang.Integer
	 */
	public void setWatchCount(Integer watchCount) {
	    this.watchCount = watchCount;
	}
	/**
     * public getter
     *
     * 
     * Start price of the item.
     * 
     *
     * @returns ebay.apis.eblbasecomponents.AmountType
	 */
	public AmountType getStartPrice() {
	    return this.startPrice;
	}
	
	/**
	 * public setter
	 *
     * 
     * Start price of the item.
     * 
     *
     * @param ebay.apis.eblbasecomponents.AmountType
	 */
	public void setStartPrice(AmountType startPrice) {
	    this.startPrice = startPrice;
	}
	/**
     * public getter
     *
     * 
     * Reserve Price of the item (if a Reserve Price was set for the item).
     * 
     *
     * @returns ebay.apis.eblbasecomponents.AmountType
	 */
	public AmountType getReservePrice() {
	    return this.reservePrice;
	}
	
	/**
	 * public setter
	 *
     * 
     * Reserve Price of the item (if a Reserve Price was set for the item).
     * 
     *
     * @param ebay.apis.eblbasecomponents.AmountType
	 */
	public void setReservePrice(AmountType reservePrice) {
	    this.reservePrice = reservePrice;
	}
	/**
     * public getter
     *
     * 
     * Boolean value indicating whether or not a Second Chance offer was sent by
     * the seller to an eligible bidder.
     * 
     *
     * @returns java.lang.Boolean
	 */
	public Boolean getSecondChanceOfferSent() {
	    return this.secondChanceOfferSent;
	}
	
	/**
	 * public setter
	 *
     * 
     * Boolean value indicating whether or not a Second Chance offer was sent by
     * the seller to an eligible bidder.
     * 
     *
     * @param java.lang.Boolean
	 */
	public void setSecondChanceOfferSent(Boolean secondChanceOfferSent) {
	    this.secondChanceOfferSent = secondChanceOfferSent;
	}
	/**
     * public getter
     *
     * 
     * Custom label associated with this order line item.
     * 
     *
     * @returns java.lang.String
	 */
	public String getCustomLabel() {
	    return this.customLabel;
	}
	
	/**
	 * public setter
	 *
     * 
     * Custom label associated with this order line item.
     * 
     *
     * @param java.lang.String
	 */
	public void setCustomLabel(String customLabel) {
	    this.customLabel = customLabel;
	}
	/**
     * public getter
     *
     * 
     * The platform on which the item was sold.
     * 
     *
     * @returns ebay.apis.eblbasecomponents.TransactionPlatformCodeType
	 */
	public TransactionPlatformCodeType getSoldOn() {
	    return this.soldOn;
	}
	
	/**
	 * public setter
	 *
     * 
     * The platform on which the item was sold.
     * 
     *
     * @param ebay.apis.eblbasecomponents.TransactionPlatformCodeType
	 */
	public void setSoldOn(TransactionPlatformCodeType soldOn) {
	    this.soldOn = soldOn;
	}
	/**
     * public getter
     *
     * 
     * The platform on which the item was listed.
     * 
     *
     * @returns java.util.List<ebay.apis.eblbasecomponents.TransactionPlatformCodeType>
	 */
	public List<TransactionPlatformCodeType> getListedOn() {
	    return this.listedOn;
	}
	
	/**
	 * public setter
	 *
     * 
     * The platform on which the item was listed.
     * 
     *
     * @param java.util.List<ebay.apis.eblbasecomponents.TransactionPlatformCodeType>
	 */
	public void setListedOn(List<TransactionPlatformCodeType> listedOn) {
	    this.listedOn = listedOn;
	}
	/**
     * public getter
     *
     * 
     * Container consisting of tracking information for the shipment.
     * 
     *
     * @returns ebay.apis.eblbasecomponents.ShipmentType
	 */
	public ShipmentType getShipment() {
	    return this.shipment;
	}
	
	/**
	 * public setter
	 *
     * 
     * Container consisting of tracking information for the shipment.
     * 
     *
     * @param ebay.apis.eblbasecomponents.ShipmentType
	 */
	public void setShipment(ShipmentType shipment) {
	    this.shipment = shipment;
	}
	/**
     * public getter
     *
     * 
     * This field is returned as True if the item is listed as a charity item.
     * 
     *
     * @returns java.lang.Boolean
	 */
	public Boolean getCharityListing() {
	    return this.charityListing;
	}
	
	/**
	 * public setter
	 *
     * 
     * This field is returned as True if the item is listed as a charity item.
     * 
     *
     * @param java.lang.Boolean
	 */
	public void setCharityListing(Boolean charityListing) {
	    this.charityListing = charityListing;
	}
	/**
     * public getter
     *
     * 
     *  In a fixed-priced listing, a seller can offer variations of the same item.
     *  For example, the seller could create a fixed-priced listing for a t-shirt
     *  design and offer the shirt in different colors and sizes. In this case, each
     *  color and size combination is a separate variation. Each variation can have
     *  a different quantity and price. Due to the possible price differentiation,
     *  buyers can buy multiple items from this listing at the same time, but all of
     *  the items must be of the same variation. One order line item is created
     *  whether one or multiple items of the same variation are purchased.
     *  <br><br>
     *  The <b>Variation</b> node contains information about which variation was purchased.
     *  Therefore, applications that process order line items should always check to see
     *  if this node is present.
     * 
     *
     * @returns ebay.apis.eblbasecomponents.VariationType
	 */
	public VariationType getVariation() {
	    return this.variation;
	}
	
	/**
	 * public setter
	 *
     * 
     *  In a fixed-priced listing, a seller can offer variations of the same item.
     *  For example, the seller could create a fixed-priced listing for a t-shirt
     *  design and offer the shirt in different colors and sizes. In this case, each
     *  color and size combination is a separate variation. Each variation can have
     *  a different quantity and price. Due to the possible price differentiation,
     *  buyers can buy multiple items from this listing at the same time, but all of
     *  the items must be of the same variation. One order line item is created
     *  whether one or multiple items of the same variation are purchased.
     *  <br><br>
     *  The <b>Variation</b> node contains information about which variation was purchased.
     *  Therefore, applications that process order line items should always check to see
     *  if this node is present.
     * 
     *
     * @param ebay.apis.eblbasecomponents.VariationType
	 */
	public void setVariation(VariationType variation) {
	    this.variation = variation;
	}
	/**
     * public getter
     *
     * 
     * A unique identifier for an eBay order line item. This field is created as
     * soon as there is a commitment to buy from the seller, and its value is
     * based upon the concatenation of <b>ItemID</b> and <b>TransactionID</b>, with a hyphen in
     * between these two IDs.
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
     * A unique identifier for an eBay order line item. This field is created as
     * soon as there is a commitment to buy from the seller, and its value is
     * based upon the concatenation of <b>ItemID</b> and <b>TransactionID</b>, with a hyphen in
     * between these two IDs.
     * 
     *
     * @param java.lang.String
	 */
	public void setOrderLineItemID(String orderLineItemID) {
	    this.orderLineItemID = orderLineItemID;
	}

}