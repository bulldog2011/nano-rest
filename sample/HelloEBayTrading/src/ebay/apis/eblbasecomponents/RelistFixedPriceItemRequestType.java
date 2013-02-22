// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package ebay.apis.eblbasecomponents;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;
import java.util.List;

/**
 * 
 * Enables a seller to take a single fixed-price item (or a single multi-item
 * listing) that has ended and re-list it on a specified eBay site.
 * 
 */
@RootElement(name = "RelistFixedPriceItemRequest", namespace = "urn:ebay:apis:eBLBaseComponents")
public class RelistFixedPriceItemRequestType extends AbstractRequestType implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element(name = "Item")
	private ItemType item;
	
	@Element(name = "DeletedField")
	private List<String> deletedField;
	
    
	/**
     * public getter
     *
     * 
     * Child elements hold the values for item properties that change for the
     * relisted item. Item is a required input. At a minimum, the Item.ItemID
     * property must be set to the ID of the original listing (a
     * listing that ended in the past 90 days). By default, the new listing's
     * Item object properties are the same as those of the original (ended)
     * listing. By setting a new value in the Item object, the new listing
     * uses the new value rather than the original value from the old
     * listing.
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
     * Child elements hold the values for item properties that change for the
     * relisted item. Item is a required input. At a minimum, the Item.ItemID
     * property must be set to the ID of the original listing (a
     * listing that ended in the past 90 days). By default, the new listing's
     * Item object properties are the same as those of the original (ended)
     * listing. By setting a new value in the Item object, the new listing
     * uses the new value rather than the original value from the old
     * listing.
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
     * Specifies the name of the field to delete from a listing.
     * See the eBay Trading API guide for rules on deleting values when relisting items.
     * Also see the relevant field descriptions to determine when to use DeletedField (and potential consequences).
     * The request can contain zero, one, or many instances of DeletedField (one for each field to be deleted).
     * DeletedField accepts the following path names, which delete the corresponding nodes:<br>
     * <br>
     * Some data (such as Variation nodes within Variations)
     * can't be deleted by using DeletedFields. See the relevant field
     * descriptions for how to delete such data.<br>
     * <br>
     * Item.ApplicationData<br>
     * Item.AttributeSetArray<br>
     * Item.Charity<br>
     * Item.ConditionID<br>
     * Item.ItemSpecifics<br>
     * Item.ListingCheckoutRedirectPreference.ProStoresStoreName<br>
     * Item.ListingCheckoutRedirectPreference.SellerThirdPartyUsername<br>
     * Item.ListingDesigner.LayoutID<br>
     * Item.ListingDesigner.ThemeID<br>
     * Item.ListingDetails.LocalListingDistance<br>
     * Item.ListingDetails.MinimumBestOfferMessage<br>
     * Item.ListingDetails.MinimumBestOfferPrice<br>
     * Item.ListingEnhancement[Value]<br>
     * Item.PayPalEmailAddress<br>
     * Item.PictureDetails.GalleryURL<br>
     * Item.PictureDetails.PictureURL<br>
     * Item.PostalCode<br>
     * Item.ProductListingDetails<br>
     * Item.SecondaryCategory<br>
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
     * Item.SKU<br>
     * Item.SubTitle<br>
     * These values are case-sensitive. Use values that match the case of the schema element names
     * (Item.PictureDetails.GalleryURL) or make the initial letter of each field name lowercase (item.pictureDetails.galleryURL).
     * However, do not change the case of letters in the middle of a field name.
     * For example, item.picturedetails.galleryUrl is not allowed.<br><br>
     * To delete a listing enhancement like Featured, specify the value you are deleting;
     * for example, Item.ListingEnhancement[Featured].
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
     * Specifies the name of the field to delete from a listing.
     * See the eBay Trading API guide for rules on deleting values when relisting items.
     * Also see the relevant field descriptions to determine when to use DeletedField (and potential consequences).
     * The request can contain zero, one, or many instances of DeletedField (one for each field to be deleted).
     * DeletedField accepts the following path names, which delete the corresponding nodes:<br>
     * <br>
     * Some data (such as Variation nodes within Variations)
     * can't be deleted by using DeletedFields. See the relevant field
     * descriptions for how to delete such data.<br>
     * <br>
     * Item.ApplicationData<br>
     * Item.AttributeSetArray<br>
     * Item.Charity<br>
     * Item.ConditionID<br>
     * Item.ItemSpecifics<br>
     * Item.ListingCheckoutRedirectPreference.ProStoresStoreName<br>
     * Item.ListingCheckoutRedirectPreference.SellerThirdPartyUsername<br>
     * Item.ListingDesigner.LayoutID<br>
     * Item.ListingDesigner.ThemeID<br>
     * Item.ListingDetails.LocalListingDistance<br>
     * Item.ListingDetails.MinimumBestOfferMessage<br>
     * Item.ListingDetails.MinimumBestOfferPrice<br>
     * Item.ListingEnhancement[Value]<br>
     * Item.PayPalEmailAddress<br>
     * Item.PictureDetails.GalleryURL<br>
     * Item.PictureDetails.PictureURL<br>
     * Item.PostalCode<br>
     * Item.ProductListingDetails<br>
     * Item.SecondaryCategory<br>
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
     * Item.SKU<br>
     * Item.SubTitle<br>
     * These values are case-sensitive. Use values that match the case of the schema element names
     * (Item.PictureDetails.GalleryURL) or make the initial letter of each field name lowercase (item.pictureDetails.galleryURL).
     * However, do not change the case of letters in the middle of a field name.
     * For example, item.picturedetails.galleryUrl is not allowed.<br><br>
     * To delete a listing enhancement like Featured, specify the value you are deleting;
     * for example, Item.ListingEnhancement[Featured].
     * 
     *
     * @param java.util.List<java.lang.String>
	 */
	public void setDeletedField(List<String> deletedField) {
	    this.deletedField = deletedField;
	}

}