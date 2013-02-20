// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package ebay.apis.eblbasecomponents;

import com.leansoft.nano.annotation.*;
import java.util.List;

/**
 * 
 * Sales tax details for zero or more jurisdictions (states,
 * provinces, etc).
 * 
 */
public class TaxTableType   {

	@Element(name = "TaxJurisdiction")
	private List<TaxJurisdictionType> taxJurisdiction;
    
    
	/**
     * public getter
     *
     * 
     * Sales tax details for zero or more jurisdictions (states, provinces, etc).
     * Information is only returned for the jurisdictions for which the user provided
     * tax information. ShippingIncludedInTax and SalesTaxPercent are returned but
     * are empty.
     * 
     *
     * @returns java.util.List<ebay.apis.eblbasecomponents.TaxJurisdictionType>
	 */
	public List<TaxJurisdictionType> getTaxJurisdiction() {
	    return this.taxJurisdiction;
	}
	
	/**
	 * public setter
	 *
     * 
     * Sales tax details for zero or more jurisdictions (states, provinces, etc).
     * Information is only returned for the jurisdictions for which the user provided
     * tax information. ShippingIncludedInTax and SalesTaxPercent are returned but
     * are empty.
     * 
     *
     * @param java.util.List<ebay.apis.eblbasecomponents.TaxJurisdictionType>
	 */
	public void setTaxJurisdiction(List<TaxJurisdictionType> taxJurisdiction) {
	    this.taxJurisdiction = taxJurisdiction;
	}

}