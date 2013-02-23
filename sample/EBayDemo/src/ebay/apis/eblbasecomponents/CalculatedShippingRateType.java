// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package ebay.apis.eblbasecomponents;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;

/**
 * 
 * Details pertinent to one or more items for which
 * calculated shipping (or flat rate shipping using shipping rate tables with 
 * weight surcharges) has been offered by the seller, such as package
 * dimension and weight and packaging/handling costs. Also returned
 * with the data for an item's transaction.
 * 
 */
public class CalculatedShippingRateType implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element(name = "OriginatingPostalCode")
	private String originatingPostalCode;
	
	@Element(name = "MeasurementUnit")
	private MeasurementSystemCodeType measurementUnit;
	
	@Element(name = "PackageDepth")
	private MeasureType packageDepth;
	
	@Element(name = "PackageLength")
	private MeasureType packageLength;
	
	@Element(name = "PackageWidth")
	private MeasureType packageWidth;
	
	@Element(name = "PackagingHandlingCosts")
	private AmountType packagingHandlingCosts;
	
	@Element(name = "ShippingIrregular")
	private Boolean shippingIrregular;
	
	@Element(name = "ShippingPackage")
	private ShippingPackageCodeType shippingPackage;
	
	@Element(name = "WeightMajor")
	private MeasureType weightMajor;
	
	@Element(name = "WeightMinor")
	private MeasureType weightMinor;
	
	@Element(name = "InternationalPackagingHandlingCosts")
	private AmountType internationalPackagingHandlingCosts;
	
    
	/**
     * public getter
     *
     * 
     * Postal code for the location from which the package will be shipped.
     * Required for calculated shipping. Use Item.PostalCode to specify the
     * location of the item used for searches by location.
     * 
     *
     * @returns java.lang.String
	 */
	public String getOriginatingPostalCode() {
	    return this.originatingPostalCode;
	}
	
	/**
	 * public setter
	 *
     * 
     * Postal code for the location from which the package will be shipped.
     * Required for calculated shipping. Use Item.PostalCode to specify the
     * location of the item used for searches by location.
     * 
     *
     * @param java.lang.String
	 */
	public void setOriginatingPostalCode(String originatingPostalCode) {
	    this.originatingPostalCode = originatingPostalCode;
	}
	/**
     * public getter
     *
     * 
     * Specifies the unit type of the weight and dimensions of a
     * shipping package.
     * If MeasurementUnit is used, it overrides the system specified by measurementSystem.
     * If MeasurementUnit and measurementSystem are not specified, the following defaults
     * will be used:
     * <br><br>
     * English: US<br>
     * Metric: CA, CAFR, AU
     * <br><br>
     * CA and CAFR supports both English and Metric, while other sites
     * only support the site's default.
     * <br><br>
     * Use MeasurementUnit with weight and package dimensions.  For example,
     * to represent a 5 lbs 2 oz package:
     * <br>
     * &lt;MeasurementUnit&gt;English&lt;/MeasurementUnit&gt;
     * <br>
     * &lt;WeightMajor&gt;5&lt;/WeightMajor&gt;
     * <br>
     * &lt;WeightMinor&gt;2&lt;/WeightMinor&gt;
     * 
     *
     * @returns ebay.apis.eblbasecomponents.MeasurementSystemCodeType
	 */
	public MeasurementSystemCodeType getMeasurementUnit() {
	    return this.measurementUnit;
	}
	
	/**
	 * public setter
	 *
     * 
     * Specifies the unit type of the weight and dimensions of a
     * shipping package.
     * If MeasurementUnit is used, it overrides the system specified by measurementSystem.
     * If MeasurementUnit and measurementSystem are not specified, the following defaults
     * will be used:
     * <br><br>
     * English: US<br>
     * Metric: CA, CAFR, AU
     * <br><br>
     * CA and CAFR supports both English and Metric, while other sites
     * only support the site's default.
     * <br><br>
     * Use MeasurementUnit with weight and package dimensions.  For example,
     * to represent a 5 lbs 2 oz package:
     * <br>
     * &lt;MeasurementUnit&gt;English&lt;/MeasurementUnit&gt;
     * <br>
     * &lt;WeightMajor&gt;5&lt;/WeightMajor&gt;
     * <br>
     * &lt;WeightMinor&gt;2&lt;/WeightMinor&gt;
     * 
     *
     * @param ebay.apis.eblbasecomponents.MeasurementSystemCodeType
	 */
	public void setMeasurementUnit(MeasurementSystemCodeType measurementUnit) {
	    this.measurementUnit = measurementUnit;
	}
	/**
     * public getter
     *
     * 
     * Depth of the package, in whole number of inches, needed to ship the item.
     * This is validated against the selected shipping service.
     * Upon mismatch, a message is returned, such as, "Package
     * dimensions exceeds maximum allowable limit for
     * service XXXXX," where XXXXX is the name of the shipping service.
     * For calculated shipping only. Only returned if the seller
     * specified the value for the item. (In many cases, the seller
     * only specifies the weight fields.)
     * <br><br>
     * Developer impact: UPS requires dimensions for any Ground packages that are 3
     * cubic feet or larger and for all air packages, if they are to provide correct
     * shipping cost. If package dimensions are not included for an item listed with
     * calculated shipping, the shipping cost returned will be an estimate based on
     * standard dimensions for the defined package type. eBay enforces a dimensions
     * requirement on listings so that buyers receive accurate calculated shipping
     * costs.
     * 
     *
     * @returns ebay.apis.eblbasecomponents.MeasureType
	 */
	public MeasureType getPackageDepth() {
	    return this.packageDepth;
	}
	
	/**
	 * public setter
	 *
     * 
     * Depth of the package, in whole number of inches, needed to ship the item.
     * This is validated against the selected shipping service.
     * Upon mismatch, a message is returned, such as, "Package
     * dimensions exceeds maximum allowable limit for
     * service XXXXX," where XXXXX is the name of the shipping service.
     * For calculated shipping only. Only returned if the seller
     * specified the value for the item. (In many cases, the seller
     * only specifies the weight fields.)
     * <br><br>
     * Developer impact: UPS requires dimensions for any Ground packages that are 3
     * cubic feet or larger and for all air packages, if they are to provide correct
     * shipping cost. If package dimensions are not included for an item listed with
     * calculated shipping, the shipping cost returned will be an estimate based on
     * standard dimensions for the defined package type. eBay enforces a dimensions
     * requirement on listings so that buyers receive accurate calculated shipping
     * costs.
     * 
     *
     * @param ebay.apis.eblbasecomponents.MeasureType
	 */
	public void setPackageDepth(MeasureType packageDepth) {
	    this.packageDepth = packageDepth;
	}
	/**
     * public getter
     *
     * 
     * Length of the package, in whole number of inches, needed to ship the item.
     * Upon mismatch, a message is returned, such as, "Package
     * dimensions exceeds maximum allowable limit for
     * service XXXXX," where XXXXX is the name of the shipping service.
     * For calculated shipping only. Only returned if the seller
     * specified the value for the item. (In many cases, the seller
     * only specifies the weight fields.)
     * 
     *
     * @returns ebay.apis.eblbasecomponents.MeasureType
	 */
	public MeasureType getPackageLength() {
	    return this.packageLength;
	}
	
	/**
	 * public setter
	 *
     * 
     * Length of the package, in whole number of inches, needed to ship the item.
     * Upon mismatch, a message is returned, such as, "Package
     * dimensions exceeds maximum allowable limit for
     * service XXXXX," where XXXXX is the name of the shipping service.
     * For calculated shipping only. Only returned if the seller
     * specified the value for the item. (In many cases, the seller
     * only specifies the weight fields.)
     * 
     *
     * @param ebay.apis.eblbasecomponents.MeasureType
	 */
	public void setPackageLength(MeasureType packageLength) {
	    this.packageLength = packageLength;
	}
	/**
     * public getter
     *
     * 
     * Width of the package, in whole number of inches, needed to ship the item.
     * Upon mismatch, a message is returned, such as, "Package
     * dimensions exceeds maximum allowable limit for
     * service XXXXX," where XXXXX is the name of the shipping service.
     * For calculated shipping only. Only returned if the seller
     * specified the value for the item. (In many cases, the seller
     * only specifies the weight fields.)
     * 
     *
     * @returns ebay.apis.eblbasecomponents.MeasureType
	 */
	public MeasureType getPackageWidth() {
	    return this.packageWidth;
	}
	
	/**
	 * public setter
	 *
     * 
     * Width of the package, in whole number of inches, needed to ship the item.
     * Upon mismatch, a message is returned, such as, "Package
     * dimensions exceeds maximum allowable limit for
     * service XXXXX," where XXXXX is the name of the shipping service.
     * For calculated shipping only. Only returned if the seller
     * specified the value for the item. (In many cases, the seller
     * only specifies the weight fields.)
     * 
     *
     * @param ebay.apis.eblbasecomponents.MeasureType
	 */
	public void setPackageWidth(MeasureType packageWidth) {
	    this.packageWidth = packageWidth;
	}
	/**
     * public getter
     *
     * 
     * Fees a seller might assess for the shipping of the item (in addition to
     * whatever the shipping service might charge).
     * Any packaging/handling cost specified on input is added to each shipping
     * service on output.
     * If domestic and international calculated shipping is offered for an item and
     * if packaging/handling cost is specified only for domestic shipping, that cost
     * will be applied by eBay as the international packaging/handling cost. (To
     * specify a international packaging/handling cost, you must always specify a
     * domestic packaging/handling cost, even if it is 0.) When UPS is one of the
     * shipping services offered by the seller, package dimensions are required on
     * list/relist/revise.
     * For calculated shipping only.
     * 
     *
     * @returns ebay.apis.eblbasecomponents.AmountType
	 */
	public AmountType getPackagingHandlingCosts() {
	    return this.packagingHandlingCosts;
	}
	
	/**
	 * public setter
	 *
     * 
     * Fees a seller might assess for the shipping of the item (in addition to
     * whatever the shipping service might charge).
     * Any packaging/handling cost specified on input is added to each shipping
     * service on output.
     * If domestic and international calculated shipping is offered for an item and
     * if packaging/handling cost is specified only for domestic shipping, that cost
     * will be applied by eBay as the international packaging/handling cost. (To
     * specify a international packaging/handling cost, you must always specify a
     * domestic packaging/handling cost, even if it is 0.) When UPS is one of the
     * shipping services offered by the seller, package dimensions are required on
     * list/relist/revise.
     * For calculated shipping only.
     * 
     *
     * @param ebay.apis.eblbasecomponents.AmountType
	 */
	public void setPackagingHandlingCosts(AmountType packagingHandlingCosts) {
	    this.packagingHandlingCosts = packagingHandlingCosts;
	}
	/**
     * public getter
     *
     * 
     * Whether a package is irregular and therefore cannot go
     * through the stamping machine at the shipping service office and
     * thus requires special or fragile handling. For calculated
     * shipping only.
     * 
     *
     * @returns java.lang.Boolean
	 */
	public Boolean getShippingIrregular() {
	    return this.shippingIrregular;
	}
	
	/**
	 * public setter
	 *
     * 
     * Whether a package is irregular and therefore cannot go
     * through the stamping machine at the shipping service office and
     * thus requires special or fragile handling. For calculated
     * shipping only.
     * 
     *
     * @param java.lang.Boolean
	 */
	public void setShippingIrregular(Boolean shippingIrregular) {
	    this.shippingIrregular = shippingIrregular;
	}
	/**
     * public getter
     *
     * 
     * The nature of the package used to ship the item(s).
     * This is required for calculated shipping only.
     * To get the applicable ShippingPackage values for your site, call 
     * <b>GeteBayDetails</b> with <b>DetailName</b> set to <b>ShippingPackageDetails</b>, 
     * and then look for the ShippingPackageDetails.ShippingPackage fields in the response.  
     * 
     *
     * @returns ebay.apis.eblbasecomponents.ShippingPackageCodeType
	 */
	public ShippingPackageCodeType getShippingPackage() {
	    return this.shippingPackage;
	}
	
	/**
	 * public setter
	 *
     * 
     * The nature of the package used to ship the item(s).
     * This is required for calculated shipping only.
     * To get the applicable ShippingPackage values for your site, call 
     * <b>GeteBayDetails</b> with <b>DetailName</b> set to <b>ShippingPackageDetails</b>, 
     * and then look for the ShippingPackageDetails.ShippingPackage fields in the response.  
     * 
     *
     * @param ebay.apis.eblbasecomponents.ShippingPackageCodeType
	 */
	public void setShippingPackage(ShippingPackageCodeType shippingPackage) {
	    this.shippingPackage = shippingPackage;
	}
	/**
     * public getter
     *
     * 
     * WeightMajor and WeightMinor are used to specify the weight of a
     * shipping package. Here is how you would represent a package
     * weight of 5 lbs 2 oz: &lt;WeightMajor unit="lbs"&gt;5&lt;/WeightMajor&gt;
     * &lt;WeightMinor unit="oz"&gt;2&lt;/WeightMinor&gt;
     * See http://www.ups.com for the maximum weight allowed by UPS.
     * Above this maximum, the shipping type becomes Freight, an option
     * that can only be selected via the eBay Web site and not via API.
     * The weight details are validated against the selected shipping service.
     * <br><br>
     * For calculated shipping or for flat rate shipping if shipping rate tables are 
     * specified and the shipping rate table uses weight surcharges. 
     * Required on input when calculated shipping is used.
     * 
     *
     * @returns ebay.apis.eblbasecomponents.MeasureType
	 */
	public MeasureType getWeightMajor() {
	    return this.weightMajor;
	}
	
	/**
	 * public setter
	 *
     * 
     * WeightMajor and WeightMinor are used to specify the weight of a
     * shipping package. Here is how you would represent a package
     * weight of 5 lbs 2 oz: &lt;WeightMajor unit="lbs"&gt;5&lt;/WeightMajor&gt;
     * &lt;WeightMinor unit="oz"&gt;2&lt;/WeightMinor&gt;
     * See http://www.ups.com for the maximum weight allowed by UPS.
     * Above this maximum, the shipping type becomes Freight, an option
     * that can only be selected via the eBay Web site and not via API.
     * The weight details are validated against the selected shipping service.
     * <br><br>
     * For calculated shipping or for flat rate shipping if shipping rate tables are 
     * specified and the shipping rate table uses weight surcharges. 
     * Required on input when calculated shipping is used.
     * 
     *
     * @param ebay.apis.eblbasecomponents.MeasureType
	 */
	public void setWeightMajor(MeasureType weightMajor) {
	    this.weightMajor = weightMajor;
	}
	/**
     * public getter
     *
     * 
     * See the definition of WeightMajor. For calculated shipping or for flat rate shipping
     * if shipping rate tables are specified and the shipping rate table uses weight surcharges. 
     * (When used with the shipping rate tables with weight surcharge, any WeightMinor value greater 
     * than zero results in WeightMajor getting rounded up in the shipping cost calculation 
     *  for example, 1 lb, 2 oz is rounded up to 2 lbs.)
     *  <br><br>
     * Required on input when calculated shipping is used.
     * 
     *
     * @returns ebay.apis.eblbasecomponents.MeasureType
	 */
	public MeasureType getWeightMinor() {
	    return this.weightMinor;
	}
	
	/**
	 * public setter
	 *
     * 
     * See the definition of WeightMajor. For calculated shipping or for flat rate shipping
     * if shipping rate tables are specified and the shipping rate table uses weight surcharges. 
     * (When used with the shipping rate tables with weight surcharge, any WeightMinor value greater 
     * than zero results in WeightMajor getting rounded up in the shipping cost calculation 
     *  for example, 1 lb, 2 oz is rounded up to 2 lbs.)
     *  <br><br>
     * Required on input when calculated shipping is used.
     * 
     *
     * @param ebay.apis.eblbasecomponents.MeasureType
	 */
	public void setWeightMinor(MeasureType weightMinor) {
	    this.weightMinor = weightMinor;
	}
	/**
     * public getter
     *
     * 
     * Fees a seller might assess for the shipping of the item (in addition to
     * whatever the shipping service might charge).
     * Any packaging/handling cost specified on input is added to each shipping
     * service on output.
     * If domestic and international calculated shipping is offered for an item and
     * if packaging/handling cost is specified only for domestic shipping, that cost
     * will be applied by eBay as the international packaging/handling cost. (To
     * specify a international packaging/handling cost, you must always specify a
     * domestic packaging/handling cost, even if it is 0.)
     * For international calculated shipping only.
     * 
     *
     * @returns ebay.apis.eblbasecomponents.AmountType
	 */
	public AmountType getInternationalPackagingHandlingCosts() {
	    return this.internationalPackagingHandlingCosts;
	}
	
	/**
	 * public setter
	 *
     * 
     * Fees a seller might assess for the shipping of the item (in addition to
     * whatever the shipping service might charge).
     * Any packaging/handling cost specified on input is added to each shipping
     * service on output.
     * If domestic and international calculated shipping is offered for an item and
     * if packaging/handling cost is specified only for domestic shipping, that cost
     * will be applied by eBay as the international packaging/handling cost. (To
     * specify a international packaging/handling cost, you must always specify a
     * domestic packaging/handling cost, even if it is 0.)
     * For international calculated shipping only.
     * 
     *
     * @param ebay.apis.eblbasecomponents.AmountType
	 */
	public void setInternationalPackagingHandlingCosts(AmountType internationalPackagingHandlingCosts) {
	    this.internationalPackagingHandlingCosts = internationalPackagingHandlingCosts;
	}

}