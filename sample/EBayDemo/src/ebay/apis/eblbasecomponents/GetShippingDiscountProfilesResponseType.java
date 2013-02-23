// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package ebay.apis.eblbasecomponents;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;

/**
 * 
 * Response to call of GetShippingDiscountProfiles.
 * 
 */
@RootElement(name = "GetShippingDiscountProfilesResponse", namespace = "urn:ebay:apis:eBLBaseComponents")
public class GetShippingDiscountProfilesResponseType extends AbstractResponseType implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element(name = "CurrencyID")
	private CurrencyCodeType currencyID;
	
	@Element(name = "FlatShippingDiscount")
	private FlatShippingDiscountType flatShippingDiscount;
	
	@Element(name = "CalculatedShippingDiscount")
	private CalculatedShippingDiscountType calculatedShippingDiscount;
	
	@Element(name = "PromotionalShippingDiscount")
	private Boolean promotionalShippingDiscount;
	
	@Element(name = "CalculatedHandlingDiscount")
	private CalculatedHandlingDiscountType calculatedHandlingDiscount;
	
	@Element(name = "PromotionalShippingDiscountDetails")
	private PromotionalShippingDiscountDetailsType promotionalShippingDiscountDetails;
	
	@Element(name = "ShippingInsurance")
	private ShippingInsuranceType shippingInsurance;
	
	@Element(name = "InternationalShippingInsurance")
	private ShippingInsuranceType internationalShippingInsurance;
	
	@Element(name = "CombinedDuration")
	private CombinedPaymentPeriodCodeType combinedDuration;
	
    
	/**
     * public getter
     *
     * 
     * The three-digit code of the currency to be used for shipping cost discounts and
     * insurance for combined payment orders. A discount profile can only be associated
     * with a listing if the <b>CurrencyID</b> value of the profile matches the 
     * <b>Item.Currency</b> value specified in a listing.
     * 
     *
     * @returns ebay.apis.eblbasecomponents.CurrencyCodeType
	 */
	public CurrencyCodeType getCurrencyID() {
	    return this.currencyID;
	}
	
	/**
	 * public setter
	 *
     * 
     * The three-digit code of the currency to be used for shipping cost discounts and
     * insurance for combined payment orders. A discount profile can only be associated
     * with a listing if the <b>CurrencyID</b> value of the profile matches the 
     * <b>Item.Currency</b> value specified in a listing.
     * 
     *
     * @param ebay.apis.eblbasecomponents.CurrencyCodeType
	 */
	public void setCurrencyID(CurrencyCodeType currencyID) {
	    this.currencyID = currencyID;
	}
	/**
     * public getter
     *
     * 
     * Details of an individual discount profile defined by the
     * user for flat rate shipping--one for each profile defined by the user.
     * Empty if no shipping discount profiles were defined.
     * 
     *
     * @returns ebay.apis.eblbasecomponents.FlatShippingDiscountType
	 */
	public FlatShippingDiscountType getFlatShippingDiscount() {
	    return this.flatShippingDiscount;
	}
	
	/**
	 * public setter
	 *
     * 
     * Details of an individual discount profile defined by the
     * user for flat rate shipping--one for each profile defined by the user.
     * Empty if no shipping discount profiles were defined.
     * 
     *
     * @param ebay.apis.eblbasecomponents.FlatShippingDiscountType
	 */
	public void setFlatShippingDiscount(FlatShippingDiscountType flatShippingDiscount) {
	    this.flatShippingDiscount = flatShippingDiscount;
	}
	/**
     * public getter
     *
     * 
     * Details of an individual discount profile defined by the
     * user for calculated shipping--one for each profile defined by the user.
     * Empty if no shipping discount profiles were defined.
     * 
     *
     * @returns ebay.apis.eblbasecomponents.CalculatedShippingDiscountType
	 */
	public CalculatedShippingDiscountType getCalculatedShippingDiscount() {
	    return this.calculatedShippingDiscount;
	}
	
	/**
	 * public setter
	 *
     * 
     * Details of an individual discount profile defined by the
     * user for calculated shipping--one for each profile defined by the user.
     * Empty if no shipping discount profiles were defined.
     * 
     *
     * @param ebay.apis.eblbasecomponents.CalculatedShippingDiscountType
	 */
	public void setCalculatedShippingDiscount(CalculatedShippingDiscountType calculatedShippingDiscount) {
	    this.calculatedShippingDiscount = calculatedShippingDiscount;
	}
	/**
     * public getter
     *
     * 
     * Indicates whether the user defined a promotional discount (the discount is active
     * as soon as it exists).
     * 
     *
     * @returns java.lang.Boolean
	 */
	public Boolean getPromotionalShippingDiscount() {
	    return this.promotionalShippingDiscount;
	}
	
	/**
	 * public setter
	 *
     * 
     * Indicates whether the user defined a promotional discount (the discount is active
     * as soon as it exists).
     * 
     *
     * @param java.lang.Boolean
	 */
	public void setPromotionalShippingDiscount(Boolean promotionalShippingDiscount) {
	    this.promotionalShippingDiscount = promotionalShippingDiscount;
	}
	/**
     * public getter
     *
     * 
     * This container is used by the seller to specify/modify packaging and handling discounts that are applied 
     * for combined payment orders. This container is only returned if it is set for the Shipping Discount Profile.
     * 
     *
     * @returns ebay.apis.eblbasecomponents.CalculatedHandlingDiscountType
	 */
	public CalculatedHandlingDiscountType getCalculatedHandlingDiscount() {
	    return this.calculatedHandlingDiscount;
	}
	
	/**
	 * public setter
	 *
     * 
     * This container is used by the seller to specify/modify packaging and handling discounts that are applied 
     * for combined payment orders. This container is only returned if it is set for the Shipping Discount Profile.
     * 
     *
     * @param ebay.apis.eblbasecomponents.CalculatedHandlingDiscountType
	 */
	public void setCalculatedHandlingDiscount(CalculatedHandlingDiscountType calculatedHandlingDiscount) {
	    this.calculatedHandlingDiscount = calculatedHandlingDiscount;
	}
	/**
     * public getter
     *
     * 
     * The data for the specific promotional shipping discount.
     * Returned only if it has been defined.
     * 
     *
     * @returns ebay.apis.eblbasecomponents.PromotionalShippingDiscountDetailsType
	 */
	public PromotionalShippingDiscountDetailsType getPromotionalShippingDiscountDetails() {
	    return this.promotionalShippingDiscountDetails;
	}
	
	/**
	 * public setter
	 *
     * 
     * The data for the specific promotional shipping discount.
     * Returned only if it has been defined.
     * 
     *
     * @param ebay.apis.eblbasecomponents.PromotionalShippingDiscountDetailsType
	 */
	public void setPromotionalShippingDiscountDetails(PromotionalShippingDiscountDetailsType promotionalShippingDiscountDetails) {
	    this.promotionalShippingDiscountDetails = promotionalShippingDiscountDetails;
	}
	/**
     * public getter
     *
     * 
     * The data for the domestic insurance for combined payment.
     * Returned only if it has been defined.
     * 
     *
     * @returns ebay.apis.eblbasecomponents.ShippingInsuranceType
	 */
	public ShippingInsuranceType getShippingInsurance() {
	    return this.shippingInsurance;
	}
	
	/**
	 * public setter
	 *
     * 
     * The data for the domestic insurance for combined payment.
     * Returned only if it has been defined.
     * 
     *
     * @param ebay.apis.eblbasecomponents.ShippingInsuranceType
	 */
	public void setShippingInsurance(ShippingInsuranceType shippingInsurance) {
	    this.shippingInsurance = shippingInsurance;
	}
	/**
     * public getter
     *
     * 
     * The data for the international insurance for combined payment.
     * Returned only if it has been defined.
     * 
     *
     * @returns ebay.apis.eblbasecomponents.ShippingInsuranceType
	 */
	public ShippingInsuranceType getInternationalShippingInsurance() {
	    return this.internationalShippingInsurance;
	}
	
	/**
	 * public setter
	 *
     * 
     * The data for the international insurance for combined payment.
     * Returned only if it has been defined.
     * 
     *
     * @param ebay.apis.eblbasecomponents.ShippingInsuranceType
	 */
	public void setInternationalShippingInsurance(ShippingInsuranceType internationalShippingInsurance) {
	    this.internationalShippingInsurance = internationalShippingInsurance;
	}
	/**
     * public getter
     *
     * 
     * This field indicates the number of days after the sale of an
     * item in which the buyer or seller can combine multiple and mutual order
     * line items into one Combined Payment order. In a Combined Payment order,
     * the buyer makes one payment for all order line items, hence only unpaid
     * order line items can be combined into a Combined Payment order.
     * 
     *
     * @returns ebay.apis.eblbasecomponents.CombinedPaymentPeriodCodeType
	 */
	public CombinedPaymentPeriodCodeType getCombinedDuration() {
	    return this.combinedDuration;
	}
	
	/**
	 * public setter
	 *
     * 
     * This field indicates the number of days after the sale of an
     * item in which the buyer or seller can combine multiple and mutual order
     * line items into one Combined Payment order. In a Combined Payment order,
     * the buyer makes one payment for all order line items, hence only unpaid
     * order line items can be combined into a Combined Payment order.
     * 
     *
     * @param ebay.apis.eblbasecomponents.CombinedPaymentPeriodCodeType
	 */
	public void setCombinedDuration(CombinedPaymentPeriodCodeType combinedDuration) {
	    this.combinedDuration = combinedDuration;
	}

}