// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package ebay.apis.eblbasecomponents;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;
import java.util.List;
import java.util.Date;

/**
 * 
 * Contains information about a sale record.
 * 
 */
public class SellingManagerSoldOrderType implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element(name = "SellingManagerSoldTransaction")
	private List<SellingManagerSoldTransactionType> sellingManagerSoldTransaction;
	
	@Element(name = "ShippingAddress")
	private AddressType shippingAddress;
	
	@Element(name = "ShippingDetails")
	private ShippingDetailsType shippingDetails;
	
	@Element(name = "CashOnDeliveryCost")
	private AmountType cashOnDeliveryCost;
	
	@Element(name = "TotalAmount")
	private AmountType totalAmount;
	
	@Element(name = "TotalQuantity")
	private Integer totalQuantity;
	
	@Element(name = "ItemCost")
	private AmountType itemCost;
	
	@Element(name = "VATRate")
	private List<VATRateType> vatRate;
	
	@Element(name = "NetInsuranceFee")
	private AmountType netInsuranceFee;
	
	@Element(name = "VATInsuranceFee")
	private AmountType vatInsuranceFee;
	
	@Element(name = "VATShippingFee")
	private AmountType vatShippingFee;
	
	@Element(name = "NetShippingFee")
	private AmountType netShippingFee;
	
	@Element(name = "NetTotalAmount")
	private AmountType netTotalAmount;
	
	@Element(name = "VATTotalAmount")
	private AmountType vatTotalAmount;
	
	@Element(name = "ActualShippingCost")
	private AmountType actualShippingCost;
	
	@Element(name = "AdjustmentAmount")
	private AmountType adjustmentAmount;
	
	@Element(name = "NotesToBuyer")
	private String notesToBuyer;
	
	@Element(name = "NotesFromBuyer")
	private String notesFromBuyer;
	
	@Element(name = "NotesToSeller")
	private String notesToSeller;
	
	@Element(name = "OrderStatus")
	private SellingManagerOrderStatusType orderStatus;
	
	@Element(name = "UnpaidItemStatus")
	private UnpaidItemStatusTypeCodeType unpaidItemStatus;
	
	@Element(name = "SalePrice")
	private AmountType salePrice;
	
	@Element(name = "EmailsSent")
	private Integer emailsSent;
	
	@Element(name = "DaysSinceSale")
	private Integer daysSinceSale;
	
	@Element(name = "BuyerID")
	private String buyerID;
	
	@Element(name = "BuyerEmail")
	private String buyerEmail;
	
	@Element(name = "SaleRecordID")
	private Long saleRecordID;
	
	@Element(name = "CreationTime")
	private Date creationTime;
	
	@Element(name = "RefundAmount")
	private AmountType refundAmount;
	
	@Element(name = "RefundStatus")
	private String refundStatus;
	
    
	/**
     * public getter
     *
     * 
     * Information about one line item in the order.
     * 
     *
     * @returns java.util.List<ebay.apis.eblbasecomponents.SellingManagerSoldTransactionType>
	 */
	public List<SellingManagerSoldTransactionType> getSellingManagerSoldTransaction() {
	    return this.sellingManagerSoldTransaction;
	}
	
	/**
	 * public setter
	 *
     * 
     * Information about one line item in the order.
     * 
     *
     * @param java.util.List<ebay.apis.eblbasecomponents.SellingManagerSoldTransactionType>
	 */
	public void setSellingManagerSoldTransaction(List<SellingManagerSoldTransactionType> sellingManagerSoldTransaction) {
	    this.sellingManagerSoldTransaction = sellingManagerSoldTransaction;
	}
	/**
     * public getter
     *
     * 
     * Shipping address of a buyer.
     * 
     *
     * @returns ebay.apis.eblbasecomponents.AddressType
	 */
	public AddressType getShippingAddress() {
	    return this.shippingAddress;
	}
	
	/**
	 * public setter
	 *
     * 
     * Shipping address of a buyer.
     * 
     *
     * @param ebay.apis.eblbasecomponents.AddressType
	 */
	public void setShippingAddress(AddressType shippingAddress) {
	    this.shippingAddress = shippingAddress;
	}
	/**
     * public getter
     *
     * 
     * The shipping-related details for an order,
     * including flat and calculated shipping costs and shipping insurance costs.
     * 
     *
     * @returns ebay.apis.eblbasecomponents.ShippingDetailsType
	 */
	public ShippingDetailsType getShippingDetails() {
	    return this.shippingDetails;
	}
	
	/**
	 * public setter
	 *
     * 
     * The shipping-related details for an order,
     * including flat and calculated shipping costs and shipping insurance costs.
     * 
     *
     * @param ebay.apis.eblbasecomponents.ShippingDetailsType
	 */
	public void setShippingDetails(ShippingDetailsType shippingDetails) {
	    this.shippingDetails = shippingDetails;
	}
	/**
     * public getter
     *
     * 
     * The cost of cash-on-delivery.
     * 
     *
     * @returns ebay.apis.eblbasecomponents.AmountType
	 */
	public AmountType getCashOnDeliveryCost() {
	    return this.cashOnDeliveryCost;
	}
	
	/**
	 * public setter
	 *
     * 
     * The cost of cash-on-delivery.
     * 
     *
     * @param ebay.apis.eblbasecomponents.AmountType
	 */
	public void setCashOnDeliveryCost(AmountType cashOnDeliveryCost) {
	    this.cashOnDeliveryCost = cashOnDeliveryCost;
	}
	/**
     * public getter
     *
     * 
     * Total cost in the order.
     * 
     *
     * @returns ebay.apis.eblbasecomponents.AmountType
	 */
	public AmountType getTotalAmount() {
	    return this.totalAmount;
	}
	
	/**
	 * public setter
	 *
     * 
     * Total cost in the order.
     * 
     *
     * @param ebay.apis.eblbasecomponents.AmountType
	 */
	public void setTotalAmount(AmountType totalAmount) {
	    this.totalAmount = totalAmount;
	}
	/**
     * public getter
     *
     * 
     * Total item quantity.
     * 
     *
     * @returns java.lang.Integer
	 */
	public Integer getTotalQuantity() {
	    return this.totalQuantity;
	}
	
	/**
	 * public setter
	 *
     * 
     * Total item quantity.
     * 
     *
     * @param java.lang.Integer
	 */
	public void setTotalQuantity(Integer totalQuantity) {
	    this.totalQuantity = totalQuantity;
	}
	/**
     * public getter
     *
     * 
     * A SMPro seller can record the cost of the item, as calculated by the seller, in
     * this field.
     * 
     *
     * @returns ebay.apis.eblbasecomponents.AmountType
	 */
	public AmountType getItemCost() {
	    return this.itemCost;
	}
	
	/**
	 * public setter
	 *
     * 
     * A SMPro seller can record the cost of the item, as calculated by the seller, in
     * this field.
     * 
     *
     * @param ebay.apis.eblbasecomponents.AmountType
	 */
	public void setItemCost(AmountType itemCost) {
	    this.itemCost = itemCost;
	}
	/**
     * public getter
     *
     * 
     * Rate of applicable value added tax.
     * 
     *
     * @returns java.util.List<ebay.apis.eblbasecomponents.VATRateType>
	 */
	public List<VATRateType> getVatRate() {
	    return this.vatRate;
	}
	
	/**
	 * public setter
	 *
     * 
     * Rate of applicable value added tax.
     * 
     *
     * @param java.util.List<ebay.apis.eblbasecomponents.VATRateType>
	 */
	public void setVatRate(List<VATRateType> vatRate) {
	    this.vatRate = vatRate;
	}
	/**
     * public getter
     *
     * 
     * Total cost of shipping insurance.
     * 
     *
     * @returns ebay.apis.eblbasecomponents.AmountType
	 */
	public AmountType getNetInsuranceFee() {
	    return this.netInsuranceFee;
	}
	
	/**
	 * public setter
	 *
     * 
     * Total cost of shipping insurance.
     * 
     *
     * @param ebay.apis.eblbasecomponents.AmountType
	 */
	public void setNetInsuranceFee(AmountType netInsuranceFee) {
	    this.netInsuranceFee = netInsuranceFee;
	}
	/**
     * public getter
     *
     * 
     * Amount of applicable value added tax insurance fee.
     * 
     *
     * @returns ebay.apis.eblbasecomponents.AmountType
	 */
	public AmountType getVatInsuranceFee() {
	    return this.vatInsuranceFee;
	}
	
	/**
	 * public setter
	 *
     * 
     * Amount of applicable value added tax insurance fee.
     * 
     *
     * @param ebay.apis.eblbasecomponents.AmountType
	 */
	public void setVatInsuranceFee(AmountType vatInsuranceFee) {
	    this.vatInsuranceFee = vatInsuranceFee;
	}
	/**
     * public getter
     *
     * 
     * VAT shipping fee.
     * 
     *
     * @returns ebay.apis.eblbasecomponents.AmountType
	 */
	public AmountType getVatShippingFee() {
	    return this.vatShippingFee;
	}
	
	/**
	 * public setter
	 *
     * 
     * VAT shipping fee.
     * 
     *
     * @param ebay.apis.eblbasecomponents.AmountType
	 */
	public void setVatShippingFee(AmountType vatShippingFee) {
	    this.vatShippingFee = vatShippingFee;
	}
	/**
     * public getter
     *
     * 
     * Total shipping fee.
     * 
     *
     * @returns ebay.apis.eblbasecomponents.AmountType
	 */
	public AmountType getNetShippingFee() {
	    return this.netShippingFee;
	}
	
	/**
	 * public setter
	 *
     * 
     * Total shipping fee.
     * 
     *
     * @param ebay.apis.eblbasecomponents.AmountType
	 */
	public void setNetShippingFee(AmountType netShippingFee) {
	    this.netShippingFee = netShippingFee;
	}
	/**
     * public getter
     *
     * 
     * The seller records in this field a net total amount obtained according to the
     * seller's method of calculation. This field is returned for VAT transactions
     * only.
     * 
     *
     * @returns ebay.apis.eblbasecomponents.AmountType
	 */
	public AmountType getNetTotalAmount() {
	    return this.netTotalAmount;
	}
	
	/**
	 * public setter
	 *
     * 
     * The seller records in this field a net total amount obtained according to the
     * seller's method of calculation. This field is returned for VAT transactions
     * only.
     * 
     *
     * @param ebay.apis.eblbasecomponents.AmountType
	 */
	public void setNetTotalAmount(AmountType netTotalAmount) {
	    this.netTotalAmount = netTotalAmount;
	}
	/**
     * public getter
     *
     * 
     * VAT total amount.
     * 
     *
     * @returns ebay.apis.eblbasecomponents.AmountType
	 */
	public AmountType getVatTotalAmount() {
	    return this.vatTotalAmount;
	}
	
	/**
	 * public setter
	 *
     * 
     * VAT total amount.
     * 
     *
     * @param ebay.apis.eblbasecomponents.AmountType
	 */
	public void setVatTotalAmount(AmountType vatTotalAmount) {
	    this.vatTotalAmount = vatTotalAmount;
	}
	/**
     * public getter
     *
     * 
     * The shipping cost paid by the seller to ship the order line item. 
     *                   <br/><br/>
     * For multiple line item orders, it is possible that one order line item will have the shipping cost and the value for the other order line item will be 0.00.
     * <br/><br/>
     * <span class="tablenote">
     *                   <strong>Note:</strong> This is different from the field of the same name returned by GetOrders and its related calls, which contains the shipping cost paid by the buyer.
     *                   </span>
     * 
     *
     * @returns ebay.apis.eblbasecomponents.AmountType
	 */
	public AmountType getActualShippingCost() {
	    return this.actualShippingCost;
	}
	
	/**
	 * public setter
	 *
     * 
     * The shipping cost paid by the seller to ship the order line item. 
     *                   <br/><br/>
     * For multiple line item orders, it is possible that one order line item will have the shipping cost and the value for the other order line item will be 0.00.
     * <br/><br/>
     * <span class="tablenote">
     *                   <strong>Note:</strong> This is different from the field of the same name returned by GetOrders and its related calls, which contains the shipping cost paid by the buyer.
     *                   </span>
     * 
     *
     * @param ebay.apis.eblbasecomponents.AmountType
	 */
	public void setActualShippingCost(AmountType actualShippingCost) {
	    this.actualShippingCost = actualShippingCost;
	}
	/**
     * public getter
     *
     * 
     * Discount, or charge, to which the buyer and seller have agreed.
     * If this value is a positive value,
     * the amount is the extra money that the buyer pays the seller.
     * If this value is a negative value,
     * the amount is a discount the seller gives the buyer.
     * 
     *
     * @returns ebay.apis.eblbasecomponents.AmountType
	 */
	public AmountType getAdjustmentAmount() {
	    return this.adjustmentAmount;
	}
	
	/**
	 * public setter
	 *
     * 
     * Discount, or charge, to which the buyer and seller have agreed.
     * If this value is a positive value,
     * the amount is the extra money that the buyer pays the seller.
     * If this value is a negative value,
     * the amount is a discount the seller gives the buyer.
     * 
     *
     * @param ebay.apis.eblbasecomponents.AmountType
	 */
	public void setAdjustmentAmount(AmountType adjustmentAmount) {
	    this.adjustmentAmount = adjustmentAmount;
	}
	/**
     * public getter
     *
     * 
     * Notes from the seller to the buyer.
     * 
     *
     * @returns java.lang.String
	 */
	public String getNotesToBuyer() {
	    return this.notesToBuyer;
	}
	
	/**
	 * public setter
	 *
     * 
     * Notes from the seller to the buyer.
     * 
     *
     * @param java.lang.String
	 */
	public void setNotesToBuyer(String notesToBuyer) {
	    this.notesToBuyer = notesToBuyer;
	}
	/**
     * public getter
     *
     * 
     * Notes from the buyer to the seller.
     * 
     *
     * @returns java.lang.String
	 */
	public String getNotesFromBuyer() {
	    return this.notesFromBuyer;
	}
	
	/**
	 * public setter
	 *
     * 
     * Notes from the buyer to the seller.
     * 
     *
     * @param java.lang.String
	 */
	public void setNotesFromBuyer(String notesFromBuyer) {
	    this.notesFromBuyer = notesFromBuyer;
	}
	/**
     * public getter
     *
     * 
     * Notes to self from seller.
     * 
     *
     * @returns java.lang.String
	 */
	public String getNotesToSeller() {
	    return this.notesToSeller;
	}
	
	/**
	 * public setter
	 *
     * 
     * Notes to self from seller.
     * 
     *
     * @param java.lang.String
	 */
	public void setNotesToSeller(String notesToSeller) {
	    this.notesToSeller = notesToSeller;
	}
	/**
     * public getter
     *
     * 
     * Status of the order regarding payment, shipping, feedback, and other
     * communications.
     * 
     *
     * @returns ebay.apis.eblbasecomponents.SellingManagerOrderStatusType
	 */
	public SellingManagerOrderStatusType getOrderStatus() {
	    return this.orderStatus;
	}
	
	/**
	 * public setter
	 *
     * 
     * Status of the order regarding payment, shipping, feedback, and other
     * communications.
     * 
     *
     * @param ebay.apis.eblbasecomponents.SellingManagerOrderStatusType
	 */
	public void setOrderStatus(SellingManagerOrderStatusType orderStatus) {
	    this.orderStatus = orderStatus;
	}
	/**
     * public getter
     *
     * 
     * The status of an unpaid item regarding final value, state of communications
     * between buyer and seller, and the filing of an Unpaid Item.
     * 
     *
     * @returns ebay.apis.eblbasecomponents.UnpaidItemStatusTypeCodeType
	 */
	public UnpaidItemStatusTypeCodeType getUnpaidItemStatus() {
	    return this.unpaidItemStatus;
	}
	
	/**
	 * public setter
	 *
     * 
     * The status of an unpaid item regarding final value, state of communications
     * between buyer and seller, and the filing of an Unpaid Item.
     * 
     *
     * @param ebay.apis.eblbasecomponents.UnpaidItemStatusTypeCodeType
	 */
	public void setUnpaidItemStatus(UnpaidItemStatusTypeCodeType unpaidItemStatus) {
	    this.unpaidItemStatus = unpaidItemStatus;
	}
	/**
     * public getter
     *
     * 
     * Amount of the accepted offer for the listing.
     * 
     *
     * @returns ebay.apis.eblbasecomponents.AmountType
	 */
	public AmountType getSalePrice() {
	    return this.salePrice;
	}
	
	/**
	 * public setter
	 *
     * 
     * Amount of the accepted offer for the listing.
     * 
     *
     * @param ebay.apis.eblbasecomponents.AmountType
	 */
	public void setSalePrice(AmountType salePrice) {
	    this.salePrice = salePrice;
	}
	/**
     * public getter
     *
     * 
     * Number of emails sent regarding this order.
     * 
     *
     * @returns java.lang.Integer
	 */
	public Integer getEmailsSent() {
	    return this.emailsSent;
	}
	
	/**
	 * public setter
	 *
     * 
     * Number of emails sent regarding this order.
     * 
     *
     * @param java.lang.Integer
	 */
	public void setEmailsSent(Integer emailsSent) {
	    this.emailsSent = emailsSent;
	}
	/**
     * public getter
     *
     * 
     * Number of days since the sale.
     * 
     *
     * @returns java.lang.Integer
	 */
	public Integer getDaysSinceSale() {
	    return this.daysSinceSale;
	}
	
	/**
	 * public setter
	 *
     * 
     * Number of days since the sale.
     * 
     *
     * @param java.lang.Integer
	 */
	public void setDaysSinceSale(Integer daysSinceSale) {
	    this.daysSinceSale = daysSinceSale;
	}
	/**
     * public getter
     *
     * 
     * The user ID of the buyer.
     * 
     *
     * @returns java.lang.String
	 */
	public String getBuyerID() {
	    return this.buyerID;
	}
	
	/**
	 * public setter
	 *
     * 
     * The user ID of the buyer.
     * 
     *
     * @param java.lang.String
	 */
	public void setBuyerID(String buyerID) {
	    this.buyerID = buyerID;
	}
	/**
     * public getter
     *
     * 
     * The email of the buyer.
     * 
     *
     * @returns java.lang.String
	 */
	public String getBuyerEmail() {
	    return this.buyerEmail;
	}
	
	/**
	 * public setter
	 *
     * 
     * The email of the buyer.
     * 
     *
     * @param java.lang.String
	 */
	public void setBuyerEmail(String buyerEmail) {
	    this.buyerEmail = buyerEmail;
	}
	/**
     * public getter
     *
     * 
     * The sale record ID. Applicable to Selling Manager users.
     * When an item is sold, Selling Manager generates a sale record.
     * A sale record contains buyer information, shipping, and other information.
     * A sale record is displayed in the Sold view in Selling Manager.
     * Each sale record has a sale record ID. In the following calls,
     * the value for the sale record ID is in the SellingManagerSalesRecordNumber field:
     * GetItemTransactions, GetSellerTransactions, GetOrders, GetOrderTransactions.
     * In the Selling Manager calls, the value for the sale record ID is in the
     * SaleRecordID field. The sale record ID can be for single or multiple line item orders.
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
     * The sale record ID. Applicable to Selling Manager users.
     * When an item is sold, Selling Manager generates a sale record.
     * A sale record contains buyer information, shipping, and other information.
     * A sale record is displayed in the Sold view in Selling Manager.
     * Each sale record has a sale record ID. In the following calls,
     * the value for the sale record ID is in the SellingManagerSalesRecordNumber field:
     * GetItemTransactions, GetSellerTransactions, GetOrders, GetOrderTransactions.
     * In the Selling Manager calls, the value for the sale record ID is in the
     * SaleRecordID field. The sale record ID can be for single or multiple line item orders.
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
     * The sale date.
     * 
     *
     * @returns java.util.Date
	 */
	public Date getCreationTime() {
	    return this.creationTime;
	}
	
	/**
	 * public setter
	 *
     * 
     * The sale date.
     * 
     *
     * @param java.util.Date
	 */
	public void setCreationTime(Date creationTime) {
	    this.creationTime = creationTime;
	}
	/**
     * public getter
     *
     * 
     * Amount of the refund issued to the buyer. This field is only returned for a
     * DE/AT order subject to the new eBay payment process, and if a refund was
     * issued to the buyer.
     * 
     *
     * @returns ebay.apis.eblbasecomponents.AmountType
	 */
	public AmountType getRefundAmount() {
	    return this.refundAmount;
	}
	
	/**
	 * public setter
	 *
     * 
     * Amount of the refund issued to the buyer. This field is only returned for a
     * DE/AT order subject to the new eBay payment process, and if a refund was
     * issued to the buyer.
     * 
     *
     * @param ebay.apis.eblbasecomponents.AmountType
	 */
	public void setRefundAmount(AmountType refundAmount) {
	    this.refundAmount = refundAmount;
	}
	/**
     * public getter
     *
     * 
     * String value indicating the result of a refund (Success, Failure, Pending)
     * to the buyer for an DE/AT order subject to the new eBay payment process.
     * 
     *
     * @returns java.lang.String
	 */
	public String getRefundStatus() {
	    return this.refundStatus;
	}
	
	/**
	 * public setter
	 *
     * 
     * String value indicating the result of a refund (Success, Failure, Pending)
     * to the buyer for an DE/AT order subject to the new eBay payment process.
     * 
     *
     * @param java.lang.String
	 */
	public void setRefundStatus(String refundStatus) {
	    this.refundStatus = refundStatus;
	}

}