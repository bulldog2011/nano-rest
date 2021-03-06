// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package ebay.apis.eblbasecomponents;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;

/**
 * 
 * Tax-related details for a region or jurisdiction.
 * 
 */
public class TaxJurisdictionType implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element(name = "JurisdictionID")
	private String jurisdictionID;
	
	@Element(name = "SalesTaxPercent")
	private Float salesTaxPercent;
	
	@Element(name = "ShippingIncludedInTax")
	private Boolean shippingIncludedInTax;
	
    
	/**
     * public getter
     *
     * 
     * Representative identifier for the jurisdiction. Typically an
     * abbreviation (e.g. CA for California).
     * 
     *
     * @returns java.lang.String
	 */
	public String getJurisdictionID() {
	    return this.jurisdictionID;
	}
	
	/**
	 * public setter
	 *
     * 
     * Representative identifier for the jurisdiction. Typically an
     * abbreviation (e.g. CA for California).
     * 
     *
     * @param java.lang.String
	 */
	public void setJurisdictionID(String jurisdictionID) {
	    this.jurisdictionID = jurisdictionID;
	}
	/**
     * public getter
     *
     * 
     * The tax percent to apply for a listing shipped to this
     * jurisdiction. The value passed in is stored with a precision of
     * 3 digits after the decimal point (##.###).
     * GetTaxTable: this tag has no value if the user's tax table has not been set.
     * 
     *
     * @returns java.lang.Float
	 */
	public Float getSalesTaxPercent() {
	    return this.salesTaxPercent;
	}
	
	/**
	 * public setter
	 *
     * 
     * The tax percent to apply for a listing shipped to this
     * jurisdiction. The value passed in is stored with a precision of
     * 3 digits after the decimal point (##.###).
     * GetTaxTable: this tag has no value if the user's tax table has not been set.
     * 
     *
     * @param java.lang.Float
	 */
	public void setSalesTaxPercent(Float salesTaxPercent) {
	    this.salesTaxPercent = salesTaxPercent;
	}
	/**
     * public getter
     *
     * 
     * Whether shipping costs are to be part of the base amount that is taxed.
     * GetTaxTable: This tag is empty if the user did not previously provide information.
     * 
     *
     * @returns java.lang.Boolean
	 */
	public Boolean getShippingIncludedInTax() {
	    return this.shippingIncludedInTax;
	}
	
	/**
	 * public setter
	 *
     * 
     * Whether shipping costs are to be part of the base amount that is taxed.
     * GetTaxTable: This tag is empty if the user did not previously provide information.
     * 
     *
     * @param java.lang.Boolean
	 */
	public void setShippingIncludedInTax(Boolean shippingIncludedInTax) {
	    this.shippingIncludedInTax = shippingIncludedInTax;
	}

}