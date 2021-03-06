// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package ebay.apis.eblbasecomponents;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;

/**
 * 
 * Enables users to add, replace, and delete My eBay notes for
 * items that are being tracked in the My eBay All Selling and
 * All Buying areas.
 * 
 */
@RootElement(name = "SetUserNotesRequest", namespace = "urn:ebay:apis:eBLBaseComponents")
public class SetUserNotesRequestType extends AbstractRequestType implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element(name = "ItemID")
	private String itemID;
	
	@Element(name = "Action")
	private SetUserNotesActionCodeType action;
	
	@Element(name = "NoteText")
	private String noteText;
	
	@Element(name = "TransactionID")
	private String transactionID;
	
	@Element(name = "VariationSpecifics")
	private NameValueListArrayType variationSpecifics;
	
	@Element(name = "SKU")
	private String sku;
	
	@Element(name = "OrderLineItemID")
	private String orderLineItemID;
	
    
	/**
     * public getter
     *
     * 
     * ID of the item to which the My eBay note will be
     * attached. Notes can only be added to items that are
     * currently being tracked in My eBay.
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
     * ID of the item to which the My eBay note will be
     * attached. Notes can only be added to items that are
     * currently being tracked in My eBay.
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
     * The seller must include this field and set it to 'AddOrUpdate' to add a new 
     * user note or update an existing user note, or set it to 'Delete' to delete a 
     * an existing user note.
     * 
     *
     * @returns ebay.apis.eblbasecomponents.SetUserNotesActionCodeType
	 */
	public SetUserNotesActionCodeType getAction() {
	    return this.action;
	}
	
	/**
	 * public setter
	 *
     * 
     * The seller must include this field and set it to 'AddOrUpdate' to add a new 
     * user note or update an existing user note, or set it to 'Delete' to delete a 
     * an existing user note.
     * 
     *
     * @param ebay.apis.eblbasecomponents.SetUserNotesActionCodeType
	 */
	public void setAction(SetUserNotesActionCodeType action) {
	    this.action = action;
	}
	/**
     * public getter
     *
     * 
     * Text of the note. Maximum 250 characters. Required only
     * if the Action is <b>AddOrUpdate</b>. This note text will
     * completely replace any existing My eBay note for the
     * specified item.
     * 
     *
     * @returns java.lang.String
	 */
	public String getNoteText() {
	    return this.noteText;
	}
	
	/**
	 * public setter
	 *
     * 
     * Text of the note. Maximum 250 characters. Required only
     * if the Action is <b>AddOrUpdate</b>. This note text will
     * completely replace any existing My eBay note for the
     * specified item.
     * 
     *
     * @param java.lang.String
	 */
	public void setNoteText(String noteText) {
	    this.noteText = noteText;
	}
	/**
     * public getter
     *
     * 
     * Unique identifier for the order line item (transaction) to which the My
     * eBay note will be attached. Notes can only be added to order line items
     * that are currently being tracked in My eBay. Buyers can
     * view user notes made on order line items in the
     * <b>PrivateNotes</b> field of the <b>WonList</b> container in <b>GetMyeBayBuying</b>, and
     * sellers can view user notes made on order line items in
     * the <b>PrivateNotes</b> field of the <b>SoldList</b> and <b>DeletedFromSoldList</b>
     * containers in <b>GetMyeBaySellinging</b>.
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
     * Unique identifier for the order line item (transaction) to which the My
     * eBay note will be attached. Notes can only be added to order line items
     * that are currently being tracked in My eBay. Buyers can
     * view user notes made on order line items in the
     * <b>PrivateNotes</b> field of the <b>WonList</b> container in <b>GetMyeBayBuying</b>, and
     * sellers can view user notes made on order line items in
     * the <b>PrivateNotes</b> field of the <b>SoldList</b> and <b>DeletedFromSoldList</b>
     * containers in <b>GetMyeBaySellinging</b>.
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
     * Container consisting of name-value pairs that identify (match) one
     * variation within a fixed-price, multi-variation listing. The specified
     * name-value pair(s) must exist in the listing specified by either the
     * <b>ItemID</b> or <b>SKU</b> values specified in the request. If a specific order line
     * item is targeted in the request with an
     * <b>ItemID</b>/<b>TransactionID</b> pair or an <b>OrderLineItemID</b> value, any specified
     * <b>VariationSpecifics</b> container is ignored by the call.
     * 
     *
     * @returns ebay.apis.eblbasecomponents.NameValueListArrayType
	 */
	public NameValueListArrayType getVariationSpecifics() {
	    return this.variationSpecifics;
	}
	
	/**
	 * public setter
	 *
     * 
     * Container consisting of name-value pairs that identify (match) one
     * variation within a fixed-price, multi-variation listing. The specified
     * name-value pair(s) must exist in the listing specified by either the
     * <b>ItemID</b> or <b>SKU</b> values specified in the request. If a specific order line
     * item is targeted in the request with an
     * <b>ItemID</b>/<b>TransactionID</b> pair or an <b>OrderLineItemID</b> value, any specified
     * <b>VariationSpecifics</b> container is ignored by the call.
     * 
     *
     * @param ebay.apis.eblbasecomponents.NameValueListArrayType
	 */
	public void setVariationSpecifics(NameValueListArrayType variationSpecifics) {
	    this.variationSpecifics = variationSpecifics;
	}
	/**
     * public getter
     *
     * 
     * SKU value of the item variation to which the My eBay note will be
     * attached. Notes can only be added to items that are currently being
     * tracked in My eBay. A SKU (stock keeping unit) value is defined by and
     * used by the seller to identify a variation within a fixed-price, multi-
     * variation listing. The SKU value is assigned to a variation of an item
     * through the <b>Variations.Variation.SKU</b> element.
     * <br>
     * <br>
     * This field can only be used if the <b>Item.InventoryTrackingMethod</b> field
     * (set with the <b>AddFixedPriceItem</b> or <b>RelistFixedPriceItem</b> calls) is set to
     * SKU.
     * <br>
     * <br>
     * If a specific order line item is targeted in the request
     * with an <b>ItemID</b>/<b>TransactionID</b> pair or an <b>OrderLineItemID</b> value, any
     * specified <b>SKU</b> is ignored by the call.
     * 
     *
     * @returns java.lang.String
	 */
	public String getSku() {
	    return this.sku;
	}
	
	/**
	 * public setter
	 *
     * 
     * SKU value of the item variation to which the My eBay note will be
     * attached. Notes can only be added to items that are currently being
     * tracked in My eBay. A SKU (stock keeping unit) value is defined by and
     * used by the seller to identify a variation within a fixed-price, multi-
     * variation listing. The SKU value is assigned to a variation of an item
     * through the <b>Variations.Variation.SKU</b> element.
     * <br>
     * <br>
     * This field can only be used if the <b>Item.InventoryTrackingMethod</b> field
     * (set with the <b>AddFixedPriceItem</b> or <b>RelistFixedPriceItem</b> calls) is set to
     * SKU.
     * <br>
     * <br>
     * If a specific order line item is targeted in the request
     * with an <b>ItemID</b>/<b>TransactionID</b> pair or an <b>OrderLineItemID</b> value, any
     * specified <b>SKU</b> is ignored by the call.
     * 
     *
     * @param java.lang.String
	 */
	public void setSku(String sku) {
	    this.sku = sku;
	}
	/**
     * public getter
     *
     * 
     * A unique identifier for an eBay order line item. This field is created as
     * soon as there is a commitment to buy from the seller, and its value is
     * based upon the concatenation of <b>ItemID</b> and <b>TransactionID</b>, with a hyphen in
     * between these two IDs. <b>OrderLineItemID</b> can be used in the input instead of
     * an <b>ItemID</b>/<b>TransactionID</b> pair to identify an order line item. 
     * <br>
     * <br>
     * Notes can only be added to order line items that are currently being
     * tracked in My eBay. Buyers can view user notes made on order line items in
     * the <b>PrivateNotes</b> field of the <b>WonList</b> container in <b>GetMyeBayBuying</b>, and
     * sellers can view user notes made on order line items in the <b>PrivateNotes</b>
     * field of the <b>SoldList</b> and <b>DeletedFromSoldList</b> containers in
     * <b>GetMyeBaySellinging</b>.
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
     * between these two IDs. <b>OrderLineItemID</b> can be used in the input instead of
     * an <b>ItemID</b>/<b>TransactionID</b> pair to identify an order line item. 
     * <br>
     * <br>
     * Notes can only be added to order line items that are currently being
     * tracked in My eBay. Buyers can view user notes made on order line items in
     * the <b>PrivateNotes</b> field of the <b>WonList</b> container in <b>GetMyeBayBuying</b>, and
     * sellers can view user notes made on order line items in the <b>PrivateNotes</b>
     * field of the <b>SoldList</b> and <b>DeletedFromSoldList</b> containers in
     * <b>GetMyeBaySellinging</b>.
     * 
     *
     * @param java.lang.String
	 */
	public void setOrderLineItemID(String orderLineItemID) {
	    this.orderLineItemID = orderLineItemID;
	}

}