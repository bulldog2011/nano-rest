// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package ebay.apis.eblbasecomponents;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;
import java.util.List;

/**
 * 
 * Enables a seller to change the properties of a currently active listing.&nbsp;<b>Also for Half.com</b>.
 * <br>
 * <br>
 * After one item in a multi-quantity fixed-price listing has been sold, you can not
 * the values in the Title, Primary Category, Secondary Category, Listing Duration,
 * and Listing Type fields for that listing. However, all other fields in the
 * multi-quantity, fixed-price listing are editable.
 * <br>
 * <br>
 * Inputs are the Item ID of the listing you are revising, and the field or fields
 * that you are updating.
 * 
 */
@RootElement(name = "ReviseItemRequest", namespace = "urn:ebay:apis:eBLBaseComponents")
public class ReviseItemRequestType extends AbstractRequestType implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element(name = "Item")
	private ItemType item;
	
	@Element(name = "DeletedField")
	private List<String> deletedField;
	
	@Element(name = "VerifyOnly")
	private Boolean verifyOnly;
	
    
	/**
     * public getter
     *
     * 
     * Child elements hold the values for properties that are changing. The
     * Item.ItemID property must always be set to the ID of the item listing being
     * changed. Set values in the Item object only for those properties that are
     * changing. Use DeletedField to remove a property.
     * <br><br>
     * Applicable to Half.com.
     * 
     *
     * @returns ebay.apis.eblbasecomponents.ItemType
	 */
	public ItemType getItem() {
	    return this.item;
	}
	
	/**
	 * public setter
	 *
     * 
     * Child elements hold the values for properties that are changing. The
     * Item.ItemID property must always be set to the ID of the item listing being
     * changed. Set values in the Item object only for those properties that are
     * changing. Use DeletedField to remove a property.
     * <br><br>
     * Applicable to Half.com.
     * 
     *
     * @param ebay.apis.eblbasecomponents.ItemType
	 */
	public void setItem(ItemType item) {
	    this.item = item;
	}
	/**
     * public getter
     *
     * 
     * Specifies the name of a field to delete from a listing. See the eBay
     * Trading API guide for rules on deleting values when revising items. Also
     * see the relevant field descriptions to determine when to use DeletedField
     * (and potential consequences). The request can contain zero, one, or many
     * instances of DeletedField (one for each field to be deleted).
     * <br><br>
     * You cannot delete required fields from a listing.
     * <br><br>
     * Some fields are optional when you first list an item (e.g.,
     * SecondaryCategory), but once they are set they cannot be deleted when you
     * revise an item. Some optional fields cannot be deleted from auction
     * listings if the item has bids and/or ends within 12 hours. Some optional
     * fields cannot be deleted if other fields depend on them.
     * <br><br>
     * Some data (such as Variation nodes within Variations) can't be deleted by
     * using DeletedFields. See the relevant field descriptions for how to delete
     * such data. See the eBay Web Services guide for rules on removing values
     * when revising items. Also see the relevant field descriptions for details
     * on when to use DeletedField (and potential consequences).
     * <br><br>
     * DeletedField accepts the following path names, which delete the
     * corresponding nodes:
     * <br><br>
     * Item.ApplicationData<br>
     * Item.AttributeSetArray<br>
     * Item.BuyItNowPrice<br>
     * Item.ConditionID<br>
     * Item.ExtendedSellerContactDetails<br>
     * Item.ClassifiedAdContactByEmailEnabled<br>
     * Item.ItemSpecifics<br>
     * Item.ListingCheckoutRedirectPreference.ProStoresStoreName<br>
     * Item.ListingCheckoutRedirectPreference.SellerThirdPartyUsername<br>
     * Item.ListingDesigner.LayoutID<br>
     * Item.ListingDesigner.ThemeID<br>
     * Item.ListingDetails.MinimumBestOfferMessage<br>
     * Item.ListingDetails.MinimumBestOfferPrice<br>
     * Item.ListingEnhancement[Value]<br>
     * Item.PayPalEmailAddress<br>
     * Item.PictureDetails.GalleryURL<br>
     * Item.PictureDetails.PictureURL<br>
     * Item.PostalCode<br>
     * Item.ProductListingDetails<br>
     * Item.SellerContactDetails<br>
     * Item.SellerContactDetails.CompanyName<br>
     * Item.SellerContactDetails.County<br>
     * Item.SellerContactDetails.InternationalStreet<br>
     * Item.SellerContactDetails.Phone2AreaOrCityCode<br>
     * Item.SellerContactDetails.Phone2CountryCode<br>
     * Item.SellerContactDetails.Phone2CountryPrefix<br>
     * Item.SellerContactDetails.Phone2LocalNumber<br>
     * Item.SellerContactDetails.PhoneAreaOrCityCode<br>
     * Item.SellerContactDetails.PhoneCountryCode<br>
     * Item.SellerContactDetails.PhoneCountryPrefix<br>
     * Item.SellerContactDetails.PhoneLocalNumber<br>
     * Item.SellerContactDetails.Street<br>
     * Item.SellerContactDetails.Street2<br>
     * Item.ShippingDetails.PaymentInstructions<br>
     * Item.SKU (unless InventoryTrackingMethod is SKU)<br>
     * Item.SubTitle
     * <br><br>
     * These values are case-sensitive. Use values that match the case of the
     * schema element names (Item.PictureDetails.GalleryURL) or make the initial
     * letter of each field name lowercase (item.pictureDetails.galleryURL).
     * However, do not change the case of letters in the middle of a field name.
     * For example, item.picturedetails.galleryUrl is not allowed.
     * <br><br>
     * To delete a listing enhancement like BoldTitle, specify the value you are
     * deleting in square brackets ("[ ]"); for example,
     * Item.ListingEnhancement[BoldTitle].
     * 
     *
     * @returns java.util.List<java.lang.String>
	 */
	public List<String> getDeletedField() {
	    return this.deletedField;
	}
	
	/**
	 * public setter
	 *
     * 
     * Specifies the name of a field to delete from a listing. See the eBay
     * Trading API guide for rules on deleting values when revising items. Also
     * see the relevant field descriptions to determine when to use DeletedField
     * (and potential consequences). The request can contain zero, one, or many
     * instances of DeletedField (one for each field to be deleted).
     * <br><br>
     * You cannot delete required fields from a listing.
     * <br><br>
     * Some fields are optional when you first list an item (e.g.,
     * SecondaryCategory), but once they are set they cannot be deleted when you
     * revise an item. Some optional fields cannot be deleted from auction
     * listings if the item has bids and/or ends within 12 hours. Some optional
     * fields cannot be deleted if other fields depend on them.
     * <br><br>
     * Some data (such as Variation nodes within Variations) can't be deleted by
     * using DeletedFields. See the relevant field descriptions for how to delete
     * such data. See the eBay Web Services guide for rules on removing values
     * when revising items. Also see the relevant field descriptions for details
     * on when to use DeletedField (and potential consequences).
     * <br><br>
     * DeletedField accepts the following path names, which delete the
     * corresponding nodes:
     * <br><br>
     * Item.ApplicationData<br>
     * Item.AttributeSetArray<br>
     * Item.BuyItNowPrice<br>
     * Item.ConditionID<br>
     * Item.ExtendedSellerContactDetails<br>
     * Item.ClassifiedAdContactByEmailEnabled<br>
     * Item.ItemSpecifics<br>
     * Item.ListingCheckoutRedirectPreference.ProStoresStoreName<br>
     * Item.ListingCheckoutRedirectPreference.SellerThirdPartyUsername<br>
     * Item.ListingDesigner.LayoutID<br>
     * Item.ListingDesigner.ThemeID<br>
     * Item.ListingDetails.MinimumBestOfferMessage<br>
     * Item.ListingDetails.MinimumBestOfferPrice<br>
     * Item.ListingEnhancement[Value]<br>
     * Item.PayPalEmailAddress<br>
     * Item.PictureDetails.GalleryURL<br>
     * Item.PictureDetails.PictureURL<br>
     * Item.PostalCode<br>
     * Item.ProductListingDetails<br>
     * Item.SellerContactDetails<br>
     * Item.SellerContactDetails.CompanyName<br>
     * Item.SellerContactDetails.County<br>
     * Item.SellerContactDetails.InternationalStreet<br>
     * Item.SellerContactDetails.Phone2AreaOrCityCode<br>
     * Item.SellerContactDetails.Phone2CountryCode<br>
     * Item.SellerContactDetails.Phone2CountryPrefix<br>
     * Item.SellerContactDetails.Phone2LocalNumber<br>
     * Item.SellerContactDetails.PhoneAreaOrCityCode<br>
     * Item.SellerContactDetails.PhoneCountryCode<br>
     * Item.SellerContactDetails.PhoneCountryPrefix<br>
     * Item.SellerContactDetails.PhoneLocalNumber<br>
     * Item.SellerContactDetails.Street<br>
     * Item.SellerContactDetails.Street2<br>
     * Item.ShippingDetails.PaymentInstructions<br>
     * Item.SKU (unless InventoryTrackingMethod is SKU)<br>
     * Item.SubTitle
     * <br><br>
     * These values are case-sensitive. Use values that match the case of the
     * schema element names (Item.PictureDetails.GalleryURL) or make the initial
     * letter of each field name lowercase (item.pictureDetails.galleryURL).
     * However, do not change the case of letters in the middle of a field name.
     * For example, item.picturedetails.galleryUrl is not allowed.
     * <br><br>
     * To delete a listing enhancement like BoldTitle, specify the value you are
     * deleting in square brackets ("[ ]"); for example,
     * Item.ListingEnhancement[BoldTitle].
     * 
     *
     * @param java.util.List<java.lang.String>
	 */
	public void setDeletedField(List<String> deletedField) {
	    this.deletedField = deletedField;
	}
	/**
     * public getter
     *
     * 
     *           
     * When the VerifyOnly boolean tag value is supplied as 'true', the response will include the calculated
     * listing price change if there is an increase in the BIN/Start price, but does not persist the values in DB.
     * This call is similar to VerifyAddItem in revise mode.
     * 
     *
     * @returns java.lang.Boolean
	 */
	public Boolean getVerifyOnly() {
	    return this.verifyOnly;
	}
	
	/**
	 * public setter
	 *
     * 
     *           
     * When the VerifyOnly boolean tag value is supplied as 'true', the response will include the calculated
     * listing price change if there is an increase in the BIN/Start price, but does not persist the values in DB.
     * This call is similar to VerifyAddItem in revise mode.
     * 
     *
     * @param java.lang.Boolean
	 */
	public void setVerifyOnly(Boolean verifyOnly) {
	    this.verifyOnly = verifyOnly;
	}

}