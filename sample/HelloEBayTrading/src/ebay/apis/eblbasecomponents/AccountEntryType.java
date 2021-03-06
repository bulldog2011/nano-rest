// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package ebay.apis.eblbasecomponents;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 
 * Contains the data for a single account detail entry. Each detail entry is a
 * transaction posted to the account and may be: a credit, a debit, or an
 * administrative action (such as an update putting a credit card on file for
 * the account). You can uniquely identify
 * the entries that the <b>GetAccount</b> call returns within the <b>AccountEntries</b> tag.
 * Specifically, the following fields, returned within the <b>AccountEntries</b> tag,
 * can be used in combination as a unique key: AccountEntry.Date, AccountEntry.AccountDetailsEntryType,
 * AccountEntry.ItemID, and AccountEntry.RefNumber.
 * 
 */
public class AccountEntryType implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element(name = "AccountDetailsEntryType")
	private AccountDetailEntryCodeType accountDetailsEntryType;
	
	@Element(name = "Description")
	private String description;
	
	@Element(name = "Balance")
	private AmountType balance;
	
	@Element(name = "Date")
	private Date date;
	
	@Element(name = "GrossDetailAmount")
	private AmountType grossDetailAmount;
	
	@Element(name = "ItemID")
	private String itemID;
	
	@Element(name = "Memo")
	private String memo;
	
	@Element(name = "ConversionRate")
	private AmountType conversionRate;
	
	@Element(name = "NetDetailAmount")
	private AmountType netDetailAmount;
	
	@Element(name = "RefNumber")
	private String refNumber;
	
	@Element(name = "VATPercent")
	private BigDecimal vatPercent;
	
	@Element(name = "Title")
	private String title;
	
	@Element(name = "OrderLineItemID")
	private String orderLineItemID;
	
	@Element(name = "TransactionID")
	private String transactionID;
	
	@Element(name = "ReceivedTopRatedDiscount")
	private Boolean receivedTopRatedDiscount;
	
    
	/**
     * public getter
     *
     * 
     * Indicates the type of transaction or reason for the transaction. For example,
     * a value of <b>FeeGallery</b> indicates a debit for listing an item in the Gallery.
     * Possible values are enumerated in the <b>AccountDetailEntryCodeType</b> code list.
     * 
     *
     * @returns ebay.apis.eblbasecomponents.AccountDetailEntryCodeType
	 */
	public AccountDetailEntryCodeType getAccountDetailsEntryType() {
	    return this.accountDetailsEntryType;
	}
	
	/**
	 * public setter
	 *
     * 
     * Indicates the type of transaction or reason for the transaction. For example,
     * a value of <b>FeeGallery</b> indicates a debit for listing an item in the Gallery.
     * Possible values are enumerated in the <b>AccountDetailEntryCodeType</b> code list.
     * 
     *
     * @param ebay.apis.eblbasecomponents.AccountDetailEntryCodeType
	 */
	public void setAccountDetailsEntryType(AccountDetailEntryCodeType accountDetailsEntryType) {
	    this.accountDetailsEntryType = accountDetailsEntryType;
	}
	/**
     * public getter
     *
     * 
     * A description of the monetary transaction or administrative action applied
     * to an eBay account.
     * 
     *
     * @returns java.lang.String
	 */
	public String getDescription() {
	    return this.description;
	}
	
	/**
	 * public setter
	 *
     * 
     * A description of the monetary transaction or administrative action applied
     * to an eBay account.
     * 
     *
     * @param java.lang.String
	 */
	public void setDescription(String description) {
	    this.description = description;
	}
	/**
     * public getter
     *
     * 
     * Balance after the account entry's credit or debit amount has been applied.
     * Can be 0.00. The value is positive for debits
     * and negative for credits.
     * 
     *
     * @returns ebay.apis.eblbasecomponents.AmountType
	 */
	public AmountType getBalance() {
	    return this.balance;
	}
	
	/**
	 * public setter
	 *
     * 
     * Balance after the account entry's credit or debit amount has been applied.
     * Can be 0.00. The value is positive for debits
     * and negative for credits.
     * 
     *
     * @param ebay.apis.eblbasecomponents.AmountType
	 */
	public void setBalance(AmountType balance) {
	    this.balance = balance;
	}
	/**
     * public getter
     *
     * 
     * Timestamp indicating the date and time that the entry was posted to the account, in
     * GMT.
     * 
     *
     * @returns java.util.Date
	 */
	public Date getDate() {
	    return this.date;
	}
	
	/**
	 * public setter
	 *
     * 
     * Timestamp indicating the date and time that the entry was posted to the account, in
     * GMT.
     * 
     *
     * @param java.util.Date
	 */
	public void setDate(Date date) {
	    this.date = date;
	}
	/**
     * public getter
     *
     * 
     * Gross fees that are assessed by eBay (net fees plus VAT, if any).
     * Returned even if VAT does not apply.
     * The value is positive for debits and negative for credits.
     * 
     *
     * @returns ebay.apis.eblbasecomponents.AmountType
	 */
	public AmountType getGrossDetailAmount() {
	    return this.grossDetailAmount;
	}
	
	/**
	 * public setter
	 *
     * 
     * Gross fees that are assessed by eBay (net fees plus VAT, if any).
     * Returned even if VAT does not apply.
     * The value is positive for debits and negative for credits.
     * 
     *
     * @param ebay.apis.eblbasecomponents.AmountType
	 */
	public void setGrossDetailAmount(AmountType grossDetailAmount) {
	    this.grossDetailAmount = grossDetailAmount;
	}
	/**
     * public getter
     *
     * 
     * If the account detail entry is associated with an item listing, this field
     * shows the eBay <b>ItemID</b> value. Otherwise, 0 is returned in this field.
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
     * If the account detail entry is associated with an item listing, this field
     * shows the eBay <b>ItemID</b> value. Otherwise, 0 is returned in this field.
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
     * Memo line for the account entry. It can be an empty string.
     * 
     *
     * @returns java.lang.String
	 */
	public String getMemo() {
	    return this.memo;
	}
	
	/**
	 * public setter
	 *
     * 
     * Memo line for the account entry. It can be an empty string.
     * 
     *
     * @param java.lang.String
	 */
	public void setMemo(String memo) {
	    this.memo = memo;
	}
	/**
     * public getter
     *
     * 
     * The rate used for the currency conversion for a transaction.
     *  
     *
     * @returns ebay.apis.eblbasecomponents.AmountType
	 */
	public AmountType getConversionRate() {
	    return this.conversionRate;
	}
	
	/**
	 * public setter
	 *
     * 
     * The rate used for the currency conversion for a transaction.
     *  
     *
     * @param ebay.apis.eblbasecomponents.AmountType
	 */
	public void setConversionRate(AmountType conversionRate) {
	    this.conversionRate = conversionRate;
	}
	/**
     * public getter
     *
     * 
     * Net fees that are assessed by eBay, excluding additional surchargesand VAT
     * (if any). Returned even if VAT does not apply. The value is positive for
     * debits (user pays eBay) and negative for credits (eBay pays user).
     *  
     *
     * @returns ebay.apis.eblbasecomponents.AmountType
	 */
	public AmountType getNetDetailAmount() {
	    return this.netDetailAmount;
	}
	
	/**
	 * public setter
	 *
     * 
     * Net fees that are assessed by eBay, excluding additional surchargesand VAT
     * (if any). Returned even if VAT does not apply. The value is positive for
     * debits (user pays eBay) and negative for credits (eBay pays user).
     *  
     *
     * @param ebay.apis.eblbasecomponents.AmountType
	 */
	public void setNetDetailAmount(AmountType netDetailAmount) {
	    this.netDetailAmount = netDetailAmount;
	}
	/**
     * public getter
     *
     * 
     * eBay reference number for the account entry. May return no value for some
     * account transactions, such as an administrative action like placing the
     * user's credit card on file.  You can uniquely identify
     * the entries that the <b>GetAccount</b> call returns within the <b>AccountEntries</b> tag.
     * Specifically, the following fields, returned within the <b>AccountEntries</b> tag,
     * can be used in combination as a unique key: AccountEntry.Date, AccountEntry.AccountDetailsEntryType,
     * AccountEntry.ItemID, and AccountEntry.RefNumber.
     * 
     *
     * @returns java.lang.String
	 */
	public String getRefNumber() {
	    return this.refNumber;
	}
	
	/**
	 * public setter
	 *
     * 
     * eBay reference number for the account entry. May return no value for some
     * account transactions, such as an administrative action like placing the
     * user's credit card on file.  You can uniquely identify
     * the entries that the <b>GetAccount</b> call returns within the <b>AccountEntries</b> tag.
     * Specifically, the following fields, returned within the <b>AccountEntries</b> tag,
     * can be used in combination as a unique key: AccountEntry.Date, AccountEntry.AccountDetailsEntryType,
     * AccountEntry.ItemID, and AccountEntry.RefNumber.
     * 
     *
     * @param java.lang.String
	 */
	public void setRefNumber(String refNumber) {
	    this.refNumber = refNumber;
	}
	/**
     * public getter
     *
     * 
     * VAT rate for the item. When the VATPercent is specified, the
     * item's VAT information appears on the item's listing page. In
     * addition, the seller can choose to print an invoice that
     * includes the item's net price, VAT percent, VAT amount, and
     * total price. Since VAT rates vary
     * depending on the item and on the user's country of residence, a
     * seller is responsible for entering the correct VAT rate; it is
     * not calculated by eBay. To specify a <b>VATPercent</b>, a seller must
     * have a VAT-ID registered with eBay and must be listing the item
     * on a VAT-enabled site. Max precision 3
     * decimal places. Max length 5 characters. Note: The View Item
     * page displays the precision to 2 decimal places with no
     * trailing zeros. However, the full value you send in is stored.
     * Returned for all users, not just VAT users, with GetAccountResponse.
     * 
     *
     * @returns java.math.BigDecimal
	 */
	public BigDecimal getVatPercent() {
	    return this.vatPercent;
	}
	
	/**
	 * public setter
	 *
     * 
     * VAT rate for the item. When the VATPercent is specified, the
     * item's VAT information appears on the item's listing page. In
     * addition, the seller can choose to print an invoice that
     * includes the item's net price, VAT percent, VAT amount, and
     * total price. Since VAT rates vary
     * depending on the item and on the user's country of residence, a
     * seller is responsible for entering the correct VAT rate; it is
     * not calculated by eBay. To specify a <b>VATPercent</b>, a seller must
     * have a VAT-ID registered with eBay and must be listing the item
     * on a VAT-enabled site. Max precision 3
     * decimal places. Max length 5 characters. Note: The View Item
     * page displays the precision to 2 decimal places with no
     * trailing zeros. However, the full value you send in is stored.
     * Returned for all users, not just VAT users, with GetAccountResponse.
     * 
     *
     * @param java.math.BigDecimal
	 */
	public void setVatPercent(BigDecimal vatPercent) {
	    this.vatPercent = vatPercent;
	}
	/**
     * public getter
     *
     * 
     * Title of the entry, or explanation of why the debit or credit was
     * applied.
     * 
     *
     * @returns java.lang.String
	 */
	public String getTitle() {
	    return this.title;
	}
	
	/**
	 * public setter
	 *
     * 
     * Title of the entry, or explanation of why the debit or credit was
     * applied.
     * 
     *
     * @param java.lang.String
	 */
	public void setTitle(String title) {
	    this.title = title;
	}
	/**
     * public getter
     *
     * 
     * <b>OrderLineItemID</b> is a unique identifier for an eBay order line item and is
     * based upon the concatenation of <b>ItemID</b> and <b>TransactionID</b>, with a hyphen in
     * between these two IDs. If the account detail entry is associated with an
     * order line item, this field shows the <b>OrderLineItemID</b> value. Otherwise, 0 is
     * returned in this field.
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
     * <b>OrderLineItemID</b> is a unique identifier for an eBay order line item and is
     * based upon the concatenation of <b>ItemID</b> and <b>TransactionID</b>, with a hyphen in
     * between these two IDs. If the account detail entry is associated with an
     * order line item, this field shows the <b>OrderLineItemID</b> value. Otherwise, 0 is
     * returned in this field.
     * 
     *
     * @param java.lang.String
	 */
	public void setOrderLineItemID(String orderLineItemID) {
	    this.orderLineItemID = orderLineItemID;
	}
	/**
     * public getter
     *
     * 
     * The unique identifier of an order line item (transaction). If the account
     * detail entry is associated with an order line item, this field shows the
     * eBay <b>TransactionID</b> value. Otherwise, 0 is returned in this field.
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
     * The unique identifier of an order line item (transaction). If the account
     * detail entry is associated with an order line item, this field shows the
     * eBay <b>TransactionID</b> value. Otherwise, 0 is returned in this field.
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
     * This boolean is returned as 'true' if the seller received a top-rated seller
     * 20 percent discount on the final value fee for the order line item.
     * 
     *
     * @returns java.lang.Boolean
	 */
	public Boolean getReceivedTopRatedDiscount() {
	    return this.receivedTopRatedDiscount;
	}
	
	/**
	 * public setter
	 *
     * 
     * This boolean is returned as 'true' if the seller received a top-rated seller
     * 20 percent discount on the final value fee for the order line item.
     * 
     *
     * @param java.lang.Boolean
	 */
	public void setReceivedTopRatedDiscount(Boolean receivedTopRatedDiscount) {
	    this.receivedTopRatedDiscount = receivedTopRatedDiscount;
	}

}