// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package ebay.apis.eblbasecomponents;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;

/**
 * 
 * Gets shipping costs for an item. This is one of the ways a buyer or seller
 * can obtain shipping cost information for an existing item (for which the caller is
 * either the buyer or seller) at any point in the life of of the listing, before or
 * after a buyer has committed to purchasing the item(s). This call works for
 * both flat rate shipping and calculated shipping. Flat rate shipping costs are
 * established by the seller before bidding occurs. Calculated shipping costs
 * are calculated by eBay with its shipping partners based on postal code, but note
 * that insurance cost can only be determined once the final item price is known
 * when the listing ends. To determine whether a listing has ended, use GetSingleItem.
 * It is best to call GetShippingCosts only after determining via GetSingleItem
 * or findItemsAdvanced (<a 
 * href="http://www.developer.ebay.com/DevZone/finding/CallRef/index.html" 
 * >Finding API</a>) that the item actually has shipping cost information.
 * 
 */
@RootElement(name = "GetShippingCostsRequest", namespace = "urn:ebay:apis:eBLBaseComponents")
public class GetShippingCostsRequestType extends AbstractRequestType implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element(name = "ItemID")
	private String itemID;
	
	@Element(name = "QuantitySold")
	private Integer quantitySold;
	
	@Element(name = "DestinationPostalCode")
	private String destinationPostalCode;
	
	@Element(name = "DestinationCountryCode")
	private CountryCodeType destinationCountryCode;
	
	@Element(name = "IncludeDetails")
	private Boolean includeDetails;
	
    
	/**
     * public getter
     *
     * 
     * The item ID that uniquely identifies the item listing for which to retrieve the data.
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
     * The item ID that uniquely identifies the item listing for which to retrieve the data.
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
     * Number of items sold to a single buyer and to be shipped together.
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
     * Number of items sold to a single buyer and to be shipped together.
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
     * Destination country postal code (or zipcode, for US). Ignored if no
     * country code is provided. Optional tag for some countries. More likely to
     * be required for large countries. Ignored for flat rate shipping.
     * 
     *
     * @returns java.lang.String
	 */
	public String getDestinationPostalCode() {
	    return this.destinationPostalCode;
	}
	
	/**
	 * public setter
	 *
     * 
     * Destination country postal code (or zipcode, for US). Ignored if no
     * country code is provided. Optional tag for some countries. More likely to
     * be required for large countries. Ignored for flat rate shipping.
     * 
     *
     * @param java.lang.String
	 */
	public void setDestinationPostalCode(String destinationPostalCode) {
	    this.destinationPostalCode = destinationPostalCode;
	}
	/**
     * public getter
     *
     * 
     * Destination country code. If DestinationCountryCode is US,
     * postal code is required and represents US zip code.
     * 
     *
     * @returns ebay.apis.eblbasecomponents.CountryCodeType
	 */
	public CountryCodeType getDestinationCountryCode() {
	    return this.destinationCountryCode;
	}
	
	/**
	 * public setter
	 *
     * 
     * Destination country code. If DestinationCountryCode is US,
     * postal code is required and represents US zip code.
     * 
     *
     * @param ebay.apis.eblbasecomponents.CountryCodeType
	 */
	public void setDestinationCountryCode(CountryCodeType destinationCountryCode) {
	    this.destinationCountryCode = destinationCountryCode;
	}
	/**
     * public getter
     *
     * 
     * Indicates whether to return the ShippingDetails container in the response.
     * 
     *
     * @returns java.lang.Boolean
	 */
	public Boolean getIncludeDetails() {
	    return this.includeDetails;
	}
	
	/**
	 * public setter
	 *
     * 
     * Indicates whether to return the ShippingDetails container in the response.
     * 
     *
     * @param java.lang.Boolean
	 */
	public void setIncludeDetails(Boolean includeDetails) {
	    this.includeDetails = includeDetails;
	}

}