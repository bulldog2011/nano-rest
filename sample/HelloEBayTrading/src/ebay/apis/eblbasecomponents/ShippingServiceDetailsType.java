// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package ebay.apis.eblbasecomponents;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;
import java.util.List;
import java.util.Date;

/**
 * 
 * Details about a specific shipping service.
 * 
 */
public class ShippingServiceDetailsType implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element(name = "Description")
	private String description;
	
	@Element(name = "ExpeditedService")
	private Boolean expeditedService;
	
	@Element(name = "InternationalService")
	private Boolean internationalService;
	
	@Element(name = "ShippingService")
	private String shippingService;
	
	@Element(name = "ShippingServiceID")
	private Integer shippingServiceID;
	
	@Element(name = "ShippingTimeMax")
	private Integer shippingTimeMax;
	
	@Element(name = "ShippingTimeMin")
	private Integer shippingTimeMin;
	
	@Element(name = "ShippingServiceCode")
	private ShippingServiceCodeType shippingServiceCode;
	
	@Element(name = "ServiceType")
	private List<ShippingTypeCodeType> serviceType;
	
	@Element(name = "ShippingPackage")
	private List<ShippingPackageCodeType> shippingPackage;
	
	@Element(name = "DimensionsRequired")
	private Boolean dimensionsRequired;
	
	@Element(name = "ValidForSellingFlow")
	private Boolean validForSellingFlow;
	
	@Element(name = "SurchargeApplicable")
	private Boolean surchargeApplicable;
	
	@Element(name = "ShippingCarrier")
	private List<ShippingCarrierCodeType> shippingCarrier;
	
	@Element(name = "CODService")
	private Boolean codService;
	
	@Element(name = "DeprecationDetails")
	private List<AnnouncementMessageType> deprecationDetails;
	
	@Element(name = "MappedToShippingServiceID")
	private Integer mappedToShippingServiceID;
	
	@Element(name = "CostGroupFlat")
	private String costGroupFlat;
	
	@Element(name = "ShippingServicePackageDetails")
	private List<ShippingServicePackageDetailsType> shippingServicePackageDetails;
	
	@Element(name = "WeightRequired")
	private Boolean weightRequired;
	
	@Element(name = "DetailVersion")
	private String detailVersion;
	
	@Element(name = "UpdateTime")
	private Date updateTime;
	
	@Element(name = "ShippingCategory")
	private String shippingCategory;
	
    
	/**
     * public getter
     *
     * 
     * Display string that applications can use to present a list of shipping service
     * options in a more user-friendly format (such as in a drop-down list).
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
     * Display string that applications can use to present a list of shipping service
     * options in a more user-friendly format (such as in a drop-down list).
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
     * Indicates whether the shipping service is an expedited shipping service.
     * See Enabling Get It Fast. Only returned for sites for which the Get It
     * Fast feature is enabled and only if true.
     * 
     *
     * @returns java.lang.Boolean
	 */
	public Boolean getExpeditedService() {
	    return this.expeditedService;
	}
	
	/**
	 * public setter
	 *
     * 
     * Indicates whether the shipping service is an expedited shipping service.
     * See Enabling Get It Fast. Only returned for sites for which the Get It
     * Fast feature is enabled and only if true.
     * 
     *
     * @param java.lang.Boolean
	 */
	public void setExpeditedService(Boolean expeditedService) {
	    this.expeditedService = expeditedService;
	}
	/**
     * public getter
     *
     * 
     * Indicates whether the shipping service is an international shipping service.
     * An international shipping service option is required if an item is being
     * shipped from one country (origin) to another (destination).
     * 
     *
     * @returns java.lang.Boolean
	 */
	public Boolean getInternationalService() {
	    return this.internationalService;
	}
	
	/**
	 * public setter
	 *
     * 
     * Indicates whether the shipping service is an international shipping service.
     * An international shipping service option is required if an item is being
     * shipped from one country (origin) to another (destination).
     * 
     *
     * @param java.lang.Boolean
	 */
	public void setInternationalService(Boolean internationalService) {
	    this.internationalService = internationalService;
	}
	/**
     * public getter
     *
     * 
     * The name of shipping service option. The
     * ShippingServiceDetails.ValidForSellingFlow flag must also be present. Otherwise,
     * that particular shipping service option is no longer valid and cannot be offered
     * to buyers through a listing.
     * 
     *
     * @returns java.lang.String
	 */
	public String getShippingService() {
	    return this.shippingService;
	}
	
	/**
	 * public setter
	 *
     * 
     * The name of shipping service option. The
     * ShippingServiceDetails.ValidForSellingFlow flag must also be present. Otherwise,
     * that particular shipping service option is no longer valid and cannot be offered
     * to buyers through a listing.
     * 
     *
     * @param java.lang.String
	 */
	public void setShippingService(String shippingService) {
	    this.shippingService = shippingService;
	}
	/**
     * public getter
     *
     * 
     * Numeric identifier. A value greater than 50000 represents an
     * international shipping service (confirmed by
     * InternationalShippingService being true). Some applications use this ID
     * to look up shipping services more efficiently.
     * Also useful for applications that have migrated from the legacy XML API.
     * 
     *
     * @returns java.lang.Integer
	 */
	public Integer getShippingServiceID() {
	    return this.shippingServiceID;
	}
	
	/**
	 * public setter
	 *
     * 
     * Numeric identifier. A value greater than 50000 represents an
     * international shipping service (confirmed by
     * InternationalShippingService being true). Some applications use this ID
     * to look up shipping services more efficiently.
     * Also useful for applications that have migrated from the legacy XML API.
     * 
     *
     * @param java.lang.Integer
	 */
	public void setShippingServiceID(Integer shippingServiceID) {
	    this.shippingServiceID = shippingServiceID;
	}
	/**
     * public getter
     *
     * 
     * The maximum guaranteed number of days the shipping carrier will
     * take to ship an item (not including the time it takes the
     * seller to deliver the item to the shipping carrier). Always
     * returned when ExpeditedService is true or if defined for a particular service.
     * See Enabling Get It Fast feature.
     * 
     *
     * @returns java.lang.Integer
	 */
	public Integer getShippingTimeMax() {
	    return this.shippingTimeMax;
	}
	
	/**
	 * public setter
	 *
     * 
     * The maximum guaranteed number of days the shipping carrier will
     * take to ship an item (not including the time it takes the
     * seller to deliver the item to the shipping carrier). Always
     * returned when ExpeditedService is true or if defined for a particular service.
     * See Enabling Get It Fast feature.
     * 
     *
     * @param java.lang.Integer
	 */
	public void setShippingTimeMax(Integer shippingTimeMax) {
	    this.shippingTimeMax = shippingTimeMax;
	}
	/**
     * public getter
     *
     * 
     * The minimum guaranteed number of days the shipping carrier will
     * take to ship an item (not including the time it takes the
     * seller to deliver the item to the shipping carrier). Always
     * returned when ExpeditedService is true or if defined for a
     * particular service.
     * See Enabling Get It Fast feature.
     * 
     *
     * @returns java.lang.Integer
	 */
	public Integer getShippingTimeMin() {
	    return this.shippingTimeMin;
	}
	
	/**
	 * public setter
	 *
     * 
     * The minimum guaranteed number of days the shipping carrier will
     * take to ship an item (not including the time it takes the
     * seller to deliver the item to the shipping carrier). Always
     * returned when ExpeditedService is true or if defined for a
     * particular service.
     * See Enabling Get It Fast feature.
     * 
     *
     * @param java.lang.Integer
	 */
	public void setShippingTimeMin(Integer shippingTimeMin) {
	    this.shippingTimeMin = shippingTimeMin;
	}
	/**
     * public getter
     *
     * 
     * For future use.
     * 
     *
     * @returns ebay.apis.eblbasecomponents.ShippingServiceCodeType
	 */
	public ShippingServiceCodeType getShippingServiceCode() {
	    return this.shippingServiceCode;
	}
	
	/**
	 * public setter
	 *
     * 
     * For future use.
     * 
     *
     * @param ebay.apis.eblbasecomponents.ShippingServiceCodeType
	 */
	public void setShippingServiceCode(ShippingServiceCodeType shippingServiceCode) {
	    this.shippingServiceCode = shippingServiceCode;
	}
	/**
     * public getter
     *
     * 
     * The types of shipping that this shipping service supports.
     * 
     *
     * @returns java.util.List<ebay.apis.eblbasecomponents.ShippingTypeCodeType>
	 */
	public List<ShippingTypeCodeType> getServiceType() {
	    return this.serviceType;
	}
	
	/**
	 * public setter
	 *
     * 
     * The types of shipping that this shipping service supports.
     * 
     *
     * @param java.util.List<ebay.apis.eblbasecomponents.ShippingTypeCodeType>
	 */
	public void setServiceType(List<ShippingTypeCodeType> serviceType) {
	    this.serviceType = serviceType;
	}
	/**
     * public getter
     *
     * 
     * The kinds of packages supported by this shipping service.
     * 
     *
     * @returns java.util.List<ebay.apis.eblbasecomponents.ShippingPackageCodeType>
	 */
	public List<ShippingPackageCodeType> getShippingPackage() {
	    return this.shippingPackage;
	}
	
	/**
	 * public setter
	 *
     * 
     * The kinds of packages supported by this shipping service.
     * 
     *
     * @param java.util.List<ebay.apis.eblbasecomponents.ShippingPackageCodeType>
	 */
	public void setShippingPackage(List<ShippingPackageCodeType> shippingPackage) {
	    this.shippingPackage = shippingPackage;
	}
	/**
     * public getter
     *
     * 
     * This field is only returned if the shipping service option requires that package 
     * dimensions are provided by the seller. If it is returned, it is always returned 
     * as 'true'.
     * 
     *
     * @returns java.lang.Boolean
	 */
	public Boolean getDimensionsRequired() {
	    return this.dimensionsRequired;
	}
	
	/**
	 * public setter
	 *
     * 
     * This field is only returned if the shipping service option requires that package 
     * dimensions are provided by the seller. If it is returned, it is always returned 
     * as 'true'.
     * 
     *
     * @param java.lang.Boolean
	 */
	public void setDimensionsRequired(Boolean dimensionsRequired) {
	    this.dimensionsRequired = dimensionsRequired;
	}
	/**
     * public getter
     *
     * 
     * If this field is returned as 'true', the shipping service option can be used in a
     * Add/Revise/Relist API call. If this field is returned as 'false', the shipping
     * service option is not currently supported and cannot be used in a
     * Add/Revise/Relist API call.
     * 
     *
     * @returns java.lang.Boolean
	 */
	public Boolean getValidForSellingFlow() {
	    return this.validForSellingFlow;
	}
	
	/**
	 * public setter
	 *
     * 
     * If this field is returned as 'true', the shipping service option can be used in a
     * Add/Revise/Relist API call. If this field is returned as 'false', the shipping
     * service option is not currently supported and cannot be used in a
     * Add/Revise/Relist API call.
     * 
     *
     * @param java.lang.Boolean
	 */
	public void setValidForSellingFlow(Boolean validForSellingFlow) {
	    this.validForSellingFlow = validForSellingFlow;
	}
	/**
     * public getter
     *
     * 
     * True if a surcharge applies for any region that this service ships to.
     * 
     *
     * @returns java.lang.Boolean
	 */
	public Boolean getSurchargeApplicable() {
	    return this.surchargeApplicable;
	}
	
	/**
	 * public setter
	 *
     * 
     * True if a surcharge applies for any region that this service ships to.
     * 
     *
     * @param java.lang.Boolean
	 */
	public void setSurchargeApplicable(Boolean surchargeApplicable) {
	    this.surchargeApplicable = surchargeApplicable;
	}
	/**
     * public getter
     *
     * 
     * The kinds of carrier supported by this shipping service.
     * 
     *
     * @returns java.util.List<ebay.apis.eblbasecomponents.ShippingCarrierCodeType>
	 */
	public List<ShippingCarrierCodeType> getShippingCarrier() {
	    return this.shippingCarrier;
	}
	
	/**
	 * public setter
	 *
     * 
     * The kinds of carrier supported by this shipping service.
     * 
     *
     * @param java.util.List<ebay.apis.eblbasecomponents.ShippingCarrierCodeType>
	 */
	public void setShippingCarrier(List<ShippingCarrierCodeType> shippingCarrier) {
	    this.shippingCarrier = shippingCarrier;
	}
	/**
     * public getter
     *
     * 
     * Applies to the Italy site (site ID 101) only. Indicates whether the shipping service
     * is a Cash On Delivery shipping service.
     * Returned only if true.
     * 
     *
     * @returns java.lang.Boolean
	 */
	public Boolean getCodService() {
	    return this.codService;
	}
	
	/**
	 * public setter
	 *
     * 
     * Applies to the Italy site (site ID 101) only. Indicates whether the shipping service
     * is a Cash On Delivery shipping service.
     * Returned only if true.
     * 
     *
     * @param java.lang.Boolean
	 */
	public void setCodService(Boolean codService) {
	    this.codService = codService;
	}
	/**
     * public getter
     *
     * 
     * A mechanism by which details about deprecation of a shipping service is
     * announced. See also MappedToShippingServiceID.
     * If this container is empty, it means that there is no mapping for this
     * shipping service and that the shipping service will be dropped from the
     * listing without an accompanying warning message from the eBay API.
     * 
     *
     * @returns java.util.List<ebay.apis.eblbasecomponents.AnnouncementMessageType>
	 */
	public List<AnnouncementMessageType> getDeprecationDetails() {
	    return this.deprecationDetails;
	}
	
	/**
	 * public setter
	 *
     * 
     * A mechanism by which details about deprecation of a shipping service is
     * announced. See also MappedToShippingServiceID.
     * If this container is empty, it means that there is no mapping for this
     * shipping service and that the shipping service will be dropped from the
     * listing without an accompanying warning message from the eBay API.
     * 
     *
     * @param java.util.List<ebay.apis.eblbasecomponents.AnnouncementMessageType>
	 */
	public void setDeprecationDetails(List<AnnouncementMessageType> deprecationDetails) {
	    this.deprecationDetails = deprecationDetails;
	}
	/**
     * public getter
     *
     * 
     * The ID of another shipping service that will be used when a
     * shipping service is deprecated. See also DeprecationDetails.
     * 
     *
     * @returns java.lang.Integer
	 */
	public Integer getMappedToShippingServiceID() {
	    return this.mappedToShippingServiceID;
	}
	
	/**
	 * public setter
	 *
     * 
     * The ID of another shipping service that will be used when a
     * shipping service is deprecated. See also DeprecationDetails.
     * 
     *
     * @param java.lang.Integer
	 */
	public void setMappedToShippingServiceID(Integer mappedToShippingServiceID) {
	    this.mappedToShippingServiceID = mappedToShippingServiceID;
	}
	/**
     * public getter
     *
     * 
     * If returned, this is the shipping service group to which the shipping service belongs.
     * Valid values are found in CostGroupFlatCodeType.
     * 
     *
     * @returns java.lang.String
	 */
	public String getCostGroupFlat() {
	    return this.costGroupFlat;
	}
	
	/**
	 * public setter
	 *
     * 
     * If returned, this is the shipping service group to which the shipping service belongs.
     * Valid values are found in CostGroupFlatCodeType.
     * 
     *
     * @param java.lang.String
	 */
	public void setCostGroupFlat(String costGroupFlat) {
	    this.costGroupFlat = costGroupFlat;
	}
	/**
     * public getter
     *
     * 
     * Shipping Package level details for the enclosing shipping service, this
     * complex type replaces the existing ShippingPackage type.
     * 
     *
     * @returns java.util.List<ebay.apis.eblbasecomponents.ShippingServicePackageDetailsType>
	 */
	public List<ShippingServicePackageDetailsType> getShippingServicePackageDetails() {
	    return this.shippingServicePackageDetails;
	}
	
	/**
	 * public setter
	 *
     * 
     * Shipping Package level details for the enclosing shipping service, this
     * complex type replaces the existing ShippingPackage type.
     * 
     *
     * @param java.util.List<ebay.apis.eblbasecomponents.ShippingServicePackageDetailsType>
	 */
	public void setShippingServicePackageDetails(List<ShippingServicePackageDetailsType> shippingServicePackageDetails) {
	    this.shippingServicePackageDetails = shippingServicePackageDetails;
	}
	/**
     * public getter
     *
     * 
     * If true, a seller who selects this package type for the listing and then offers
     * this shipping service must specify WeightMajor and WeightMinor in the item definition.
     * If not returned, WeightRequired is false.
     * 
     *
     * @returns java.lang.Boolean
	 */
	public Boolean getWeightRequired() {
	    return this.weightRequired;
	}
	
	/**
	 * public setter
	 *
     * 
     * If true, a seller who selects this package type for the listing and then offers
     * this shipping service must specify WeightMajor and WeightMinor in the item definition.
     * If not returned, WeightRequired is false.
     * 
     *
     * @param java.lang.Boolean
	 */
	public void setWeightRequired(Boolean weightRequired) {
	    this.weightRequired = weightRequired;
	}
	/**
     * public getter
     *
     * 
     * Returns the latest version number for this field. The version can be
     * used to determine if and when to refresh cached client data.
     * 
     *
     * @returns java.lang.String
	 */
	public String getDetailVersion() {
	    return this.detailVersion;
	}
	
	/**
	 * public setter
	 *
     * 
     * Returns the latest version number for this field. The version can be
     * used to determine if and when to refresh cached client data.
     * 
     *
     * @param java.lang.String
	 */
	public void setDetailVersion(String detailVersion) {
	    this.detailVersion = detailVersion;
	}
	/**
     * public getter
     *
     * 
     * Gives the time in GMT that the feature flags for the details were last
     * updated. This timestamp can be used to determine if and when to refresh
     * cached client data.
     * 
     *
     * @returns java.util.Date
	 */
	public Date getUpdateTime() {
	    return this.updateTime;
	}
	
	/**
	 * public setter
	 *
     * 
     * Gives the time in GMT that the feature flags for the details were last
     * updated. This timestamp can be used to determine if and when to refresh
     * cached client data.
     * 
     *
     * @param java.util.Date
	 */
	public void setUpdateTime(Date updateTime) {
	    this.updateTime = updateTime;
	}
	/**
     * public getter
     *
     * 
     * Indicates the shipping category. Shipping categories include the following:
     * ECONOMY, STANDARD, EXPEDITED, ONE_DAY, PICKUP, OTHER, and NONE. International
     * shipping services are generally grouped into the NONE category. For more
     * information on these shipping categories, see the
     * <a href="http://pages.ebay.com/sellerinformation/shipping/chooseservice.html">Shipping Basics</a> page on the eBay Shipping Center site.
     * 
     *
     * @returns java.lang.String
	 */
	public String getShippingCategory() {
	    return this.shippingCategory;
	}
	
	/**
	 * public setter
	 *
     * 
     * Indicates the shipping category. Shipping categories include the following:
     * ECONOMY, STANDARD, EXPEDITED, ONE_DAY, PICKUP, OTHER, and NONE. International
     * shipping services are generally grouped into the NONE category. For more
     * information on these shipping categories, see the
     * <a href="http://pages.ebay.com/sellerinformation/shipping/chooseservice.html">Shipping Basics</a> page on the eBay Shipping Center site.
     * 
     *
     * @param java.lang.String
	 */
	public void setShippingCategory(String shippingCategory) {
	    this.shippingCategory = shippingCategory;
	}

}