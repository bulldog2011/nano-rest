// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package ebay.apis.eblbasecomponents;

import com.leansoft.nano.annotation.*;
import java.util.List;

/**
 * 
 * Contains the data for one user address. This is the base type for a
 * number of user addresses, including seller payment address, buyer
 * shipping address and buyer and seller registration address.
 * 
 */
public class AddressType   {

	@Element(name = "Name")
	private String name;
    
	@Element(name = "Street")
	private String street;
    
	@Element(name = "Street1")
	private String street1;
    
	@Element(name = "Street2")
	private String street2;
    
	@Element(name = "CityName")
	private String cityName;
    
	@Element(name = "County")
	private String county;
    
	@Element(name = "StateOrProvince")
	private String stateOrProvince;
    
	@Element(name = "CountryName")
	private String countryName;
    
	@Element(name = "Phone")
	private String phone;
    
	@Element(name = "PhoneCountryPrefix")
	private String phoneCountryPrefix;
    
	@Element(name = "PhoneAreaOrCityCode")
	private String phoneAreaOrCityCode;
    
	@Element(name = "PhoneLocalNumber")
	private String phoneLocalNumber;
    
	@Element(name = "Phone2CountryPrefix")
	private String phone2CountryPrefix;
    
	@Element(name = "Phone2AreaOrCityCode")
	private String phone2AreaOrCityCode;
    
	@Element(name = "Phone2LocalNumber")
	private String phone2LocalNumber;
    
	@Element(name = "PostalCode")
	private String postalCode;
    
	@Element(name = "AddressID")
	private String addressID;
    
	@Element(name = "ExternalAddressID")
	private String externalAddressID;
    
	@Element(name = "InternationalName")
	private String internationalName;
    
	@Element(name = "InternationalStateAndCity")
	private String internationalStateAndCity;
    
	@Element(name = "InternationalStreet")
	private String internationalStreet;
    
	@Element(name = "CompanyName")
	private String companyName;
    
	@Element(name = "FirstName")
	private String firstName;
    
	@Element(name = "LastName")
	private String lastName;
    
	private List<Object> any;
    
    
	/**
     * public getter
     *
     * 
     * User's name for the address.
     * Also applicable to Half.com (for GetOrders).
     * 
     *
     * @returns java.lang.String
	 */
	public String getName() {
	    return this.name;
	}
	
	/**
	 * public setter
	 *
     * 
     * User's name for the address.
     * Also applicable to Half.com (for GetOrders).
     * 
     *
     * @param java.lang.String
	 */
	public void setName(String name) {
	    this.name = name;
	}
	/**
     * public getter
     *
     * 
     * A concatenation of Street1 and Street2, primarily for RegistrationAddress.
     * Not applicable to Half.com.
     * 
     *
     * @returns java.lang.String
	 */
	public String getStreet() {
	    return this.street;
	}
	
	/**
	 * public setter
	 *
     * 
     * A concatenation of Street1 and Street2, primarily for RegistrationAddress.
     * Not applicable to Half.com.
     * 
     *
     * @param java.lang.String
	 */
	public void setStreet(String street) {
	    this.street = street;
	}
	/**
     * public getter
     *
     * 
     * Line 1 of the user's street address.
     * Also applicable to Half.com (for GetOrders).
     * 
     *
     * @returns java.lang.String
	 */
	public String getStreet1() {
	    return this.street1;
	}
	
	/**
	 * public setter
	 *
     * 
     * Line 1 of the user's street address.
     * Also applicable to Half.com (for GetOrders).
     * 
     *
     * @param java.lang.String
	 */
	public void setStreet1(String street1) {
	    this.street1 = street1;
	}
	/**
     * public getter
     *
     * 
     * Line 2 of the user's address (such as an apartment number).
     * Returned if the user specified a second street value for their address.
     * Also applicable to Half.com (for GetOrders).<br>
     * In case of Item.SellerContactDetails, Street2 can be used to provide City, Address, State, and Zip code (if applicable).
     * 
     *
     * @returns java.lang.String
	 */
	public String getStreet2() {
	    return this.street2;
	}
	
	/**
	 * public setter
	 *
     * 
     * Line 2 of the user's address (such as an apartment number).
     * Returned if the user specified a second street value for their address.
     * Also applicable to Half.com (for GetOrders).<br>
     * In case of Item.SellerContactDetails, Street2 can be used to provide City, Address, State, and Zip code (if applicable).
     * 
     *
     * @param java.lang.String
	 */
	public void setStreet2(String street2) {
	    this.street2 = street2;
	}
	/**
     * public getter
     *
     * 
     * The name of the user's city.
     * Also applicable to Half.com (for GetOrders).
     * 
     *
     * @returns java.lang.String
	 */
	public String getCityName() {
	    return this.cityName;
	}
	
	/**
	 * public setter
	 *
     * 
     * The name of the user's city.
     * Also applicable to Half.com (for GetOrders).
     * 
     *
     * @param java.lang.String
	 */
	public void setCityName(String cityName) {
	    this.cityName = cityName;
	}
	/**
     * public getter
     *
     * 
     * County information for the user.
     * This field applies to Classified Ad format listings and to the UK only.
     * Not applicable to Half.com.
     * 
     *
     * @returns java.lang.String
	 */
	public String getCounty() {
	    return this.county;
	}
	
	/**
	 * public setter
	 *
     * 
     * County information for the user.
     * This field applies to Classified Ad format listings and to the UK only.
     * Not applicable to Half.com.
     * 
     *
     * @param java.lang.String
	 */
	public void setCounty(String county) {
	    this.county = county;
	}
	/**
     * public getter
     *
     * 
     * The region of the user's address.
     * Also applicable to Half.com (for GetOrders).
     * 
     *
     * @returns java.lang.String
	 */
	public String getStateOrProvince() {
	    return this.stateOrProvince;
	}
	
	/**
	 * public setter
	 *
     * 
     * The region of the user's address.
     * Also applicable to Half.com (for GetOrders).
     * 
     *
     * @param java.lang.String
	 */
	public void setStateOrProvince(String stateOrProvince) {
	    this.stateOrProvince = stateOrProvince;
	}
	/**
     * public getter
     *
     * 
     * The name of the user's country.
     * Also applicable to Half.com (for GetOrders).
     * 
     *
     * @returns java.lang.String
	 */
	public String getCountryName() {
	    return this.countryName;
	}
	
	/**
	 * public setter
	 *
     * 
     * The name of the user's country.
     * Also applicable to Half.com (for GetOrders).
     * 
     *
     * @param java.lang.String
	 */
	public void setCountryName(String countryName) {
	    this.countryName = countryName;
	}
	/**
     * public getter
     *
     * 
     * User's primary phone number. This may return a value of
     * "Invalid Request" if you are not authorized to see the
     * user's phone number.
     * Also applicable to Half.com (for GetOrders).
     * 
     *
     * @returns java.lang.String
	 */
	public String getPhone() {
	    return this.phone;
	}
	
	/**
	 * public setter
	 *
     * 
     * User's primary phone number. This may return a value of
     * "Invalid Request" if you are not authorized to see the
     * user's phone number.
     * Also applicable to Half.com (for GetOrders).
     * 
     *
     * @param java.lang.String
	 */
	public void setPhone(String phone) {
	    this.phone = phone;
	}
	/**
     * public getter
     *
     * 
     * Country Prefix of the secondary phone number. This value is derived from
     * inputs supplied for PhoneCountryCode.
     * This field applies to Classified Ad format listings only.
     * 
     *
     * @returns java.lang.String
	 */
	public String getPhoneCountryPrefix() {
	    return this.phoneCountryPrefix;
	}
	
	/**
	 * public setter
	 *
     * 
     * Country Prefix of the secondary phone number. This value is derived from
     * inputs supplied for PhoneCountryCode.
     * This field applies to Classified Ad format listings only.
     * 
     *
     * @param java.lang.String
	 */
	public void setPhoneCountryPrefix(String phoneCountryPrefix) {
	    this.phoneCountryPrefix = phoneCountryPrefix;
	}
	/**
     * public getter
     *
     * 
     * Area or City Code of a user's primary phone number.
     * This field applies to Classified Ad format listings only.
     * 
     *
     * @returns java.lang.String
	 */
	public String getPhoneAreaOrCityCode() {
	    return this.phoneAreaOrCityCode;
	}
	
	/**
	 * public setter
	 *
     * 
     * Area or City Code of a user's primary phone number.
     * This field applies to Classified Ad format listings only.
     * 
     *
     * @param java.lang.String
	 */
	public void setPhoneAreaOrCityCode(String phoneAreaOrCityCode) {
	    this.phoneAreaOrCityCode = phoneAreaOrCityCode;
	}
	/**
     * public getter
     *
     * 
     * The local number portion of the user's primary phone number.
     * This field applies to Classified Ad format listings only.
     * <br>
     * <b>Note:</b> The full primary phone number is constructed by
     * combining PhoneLocalNumber with PhoneAreaOrCityCode and PhoneCountryPrefix.
     * Starting with API release 497, the full phone number can be entered in
     * PhoneLocalNumber. Refer to the release notes for additional information.
     * 
     *
     * @returns java.lang.String
	 */
	public String getPhoneLocalNumber() {
	    return this.phoneLocalNumber;
	}
	
	/**
	 * public setter
	 *
     * 
     * The local number portion of the user's primary phone number.
     * This field applies to Classified Ad format listings only.
     * <br>
     * <b>Note:</b> The full primary phone number is constructed by
     * combining PhoneLocalNumber with PhoneAreaOrCityCode and PhoneCountryPrefix.
     * Starting with API release 497, the full phone number can be entered in
     * PhoneLocalNumber. Refer to the release notes for additional information.
     * 
     *
     * @param java.lang.String
	 */
	public void setPhoneLocalNumber(String phoneLocalNumber) {
	    this.phoneLocalNumber = phoneLocalNumber;
	}
	/**
     * public getter
     *
     * 
     * Country prefix of a user's secondary phone number. This value is derived from
     * inputs supplied for Phone2CountryCode.
     * This field applies to Classified Ad format listings only.
     * 
     *
     * @returns java.lang.String
	 */
	public String getPhone2CountryPrefix() {
	    return this.phone2CountryPrefix;
	}
	
	/**
	 * public setter
	 *
     * 
     * Country prefix of a user's secondary phone number. This value is derived from
     * inputs supplied for Phone2CountryCode.
     * This field applies to Classified Ad format listings only.
     * 
     *
     * @param java.lang.String
	 */
	public void setPhone2CountryPrefix(String phone2CountryPrefix) {
	    this.phone2CountryPrefix = phone2CountryPrefix;
	}
	/**
     * public getter
     *
     * 
     * Area or City Code of a user's secondary phone number.
     * This field applies to Classified Ad format listings only.
     * 
     *
     * @returns java.lang.String
	 */
	public String getPhone2AreaOrCityCode() {
	    return this.phone2AreaOrCityCode;
	}
	
	/**
	 * public setter
	 *
     * 
     * Area or City Code of a user's secondary phone number.
     * This field applies to Classified Ad format listings only.
     * 
     *
     * @param java.lang.String
	 */
	public void setPhone2AreaOrCityCode(String phone2AreaOrCityCode) {
	    this.phone2AreaOrCityCode = phone2AreaOrCityCode;
	}
	/**
     * public getter
     *
     * 
     * The local number portion of the user's secondary phone number.
     * This field applies to Classified Ad format listings only.
     * <br>
     * <b>Note:</b> The full secondary phone number is constructed by
     * combining Phone2LocalNumber with Phone2AreaOrCityCode and Phone2CountryPrefix.
     * Starting with API release 497, the full phone number can be entered in
     * Phone2LocalNumber. Refer to the release notes for additional information.
     * 
     *
     * @returns java.lang.String
	 */
	public String getPhone2LocalNumber() {
	    return this.phone2LocalNumber;
	}
	
	/**
	 * public setter
	 *
     * 
     * The local number portion of the user's secondary phone number.
     * This field applies to Classified Ad format listings only.
     * <br>
     * <b>Note:</b> The full secondary phone number is constructed by
     * combining Phone2LocalNumber with Phone2AreaOrCityCode and Phone2CountryPrefix.
     * Starting with API release 497, the full phone number can be entered in
     * Phone2LocalNumber. Refer to the release notes for additional information.
     * 
     *
     * @param java.lang.String
	 */
	public void setPhone2LocalNumber(String phone2LocalNumber) {
	    this.phone2LocalNumber = phone2LocalNumber;
	}
	/**
     * public getter
     *
     * 
     * User's postal code.
     * <br>
     * <br>
     * If not provided as input for GetCart or SetCart, eBay uses the country associated
     * with the SiteID in effect when the call is made.
     * <br>
     * <br>
     * Also applicable to Half.com (for GetOrders).
     * 
     *
     * @returns java.lang.String
	 */
	public String getPostalCode() {
	    return this.postalCode;
	}
	
	/**
	 * public setter
	 *
     * 
     * User's postal code.
     * <br>
     * <br>
     * If not provided as input for GetCart or SetCart, eBay uses the country associated
     * with the SiteID in effect when the call is made.
     * <br>
     * <br>
     * Also applicable to Half.com (for GetOrders).
     * 
     *
     * @param java.lang.String
	 */
	public void setPostalCode(String postalCode) {
	    this.postalCode = postalCode;
	}
	/**
     * public getter
     *
     * 
     * ID assigned to the address in the eBay database.
     * For GetOrders, applies only to Half.com.
     * 
     *
     * @returns java.lang.String
	 */
	public String getAddressID() {
	    return this.addressID;
	}
	
	/**
	 * public setter
	 *
     * 
     * ID assigned to the address in the eBay database.
     * For GetOrders, applies only to Half.com.
     * 
     *
     * @param java.lang.String
	 */
	public void setAddressID(String addressID) {
	    this.addressID = addressID;
	}
	/**
     * public getter
     *
     * 
     * ID assigned to the address by the owner of the address (fitting
     * only if the address is owned by PayPal; see AddressOwner).
     * Also applicable to Half.com (for GetOrders).
     * 
     *
     * @returns java.lang.String
	 */
	public String getExternalAddressID() {
	    return this.externalAddressID;
	}
	
	/**
	 * public setter
	 *
     * 
     * ID assigned to the address by the owner of the address (fitting
     * only if the address is owned by PayPal; see AddressOwner).
     * Also applicable to Half.com (for GetOrders).
     * 
     *
     * @param java.lang.String
	 */
	public void setExternalAddressID(String externalAddressID) {
	    this.externalAddressID = externalAddressID;
	}
	/**
     * public getter
     *
     * 
     * Seller's international name that is associated with the payment address.
     * Only applicable to SellerPaymentAddress.
     * Not applicable to Half.com.
     * 
     *
     * @returns java.lang.String
	 */
	public String getInternationalName() {
	    return this.internationalName;
	}
	
	/**
	 * public setter
	 *
     * 
     * Seller's international name that is associated with the payment address.
     * Only applicable to SellerPaymentAddress.
     * Not applicable to Half.com.
     * 
     *
     * @param java.lang.String
	 */
	public void setInternationalName(String internationalName) {
	    this.internationalName = internationalName;
	}
	/**
     * public getter
     *
     * 
     * International state and city for the seller's payment address.
     * Only applicable to SellerPaymentAddress.
     * Not applicable to Half.com.
     * 
     *
     * @returns java.lang.String
	 */
	public String getInternationalStateAndCity() {
	    return this.internationalStateAndCity;
	}
	
	/**
	 * public setter
	 *
     * 
     * International state and city for the seller's payment address.
     * Only applicable to SellerPaymentAddress.
     * Not applicable to Half.com.
     * 
     *
     * @param java.lang.String
	 */
	public void setInternationalStateAndCity(String internationalStateAndCity) {
	    this.internationalStateAndCity = internationalStateAndCity;
	}
	/**
     * public getter
     *
     * 
     * Seller's international street address that is associated with the payment address.
     * Only applicable to SellerPaymentAddress.
     * Not applicable to Half.com.
     * 
     *
     * @returns java.lang.String
	 */
	public String getInternationalStreet() {
	    return this.internationalStreet;
	}
	
	/**
	 * public setter
	 *
     * 
     * Seller's international street address that is associated with the payment address.
     * Only applicable to SellerPaymentAddress.
     * Not applicable to Half.com.
     * 
     *
     * @param java.lang.String
	 */
	public void setInternationalStreet(String internationalStreet) {
	    this.internationalStreet = internationalStreet;
	}
	/**
     * public getter
     *
     * 
     * User's company name. Only returned if available.
     * Not applicable to Half.com.
     * 
     *
     * @returns java.lang.String
	 */
	public String getCompanyName() {
	    return this.companyName;
	}
	
	/**
	 * public setter
	 *
     * 
     * User's company name. Only returned if available.
     * Not applicable to Half.com.
     * 
     *
     * @param java.lang.String
	 */
	public void setCompanyName(String companyName) {
	    this.companyName = companyName;
	}
	/**
     * public getter
     *
     * 
     * Displays the first name of the seller (in a business
     * card format) if the seller's SellerBusinessCodeType
     * is set to 'Commercial'.
     * 
     *
     * @returns java.lang.String
	 */
	public String getFirstName() {
	    return this.firstName;
	}
	
	/**
	 * public setter
	 *
     * 
     * Displays the first name of the seller (in a business
     * card format) if the seller's SellerBusinessCodeType
     * is set to 'Commercial'.
     * 
     *
     * @param java.lang.String
	 */
	public void setFirstName(String firstName) {
	    this.firstName = firstName;
	}
	/**
     * public getter
     *
     * 
     * Displays the last name of the seller (in a business
     * card format) if the seller's SellerBusinessCodeType
     * is set to 'Commercial'.
     * 
     *
     * @returns java.lang.String
	 */
	public String getLastName() {
	    return this.lastName;
	}
	
	/**
	 * public setter
	 *
     * 
     * Displays the last name of the seller (in a business
     * card format) if the seller's SellerBusinessCodeType
     * is set to 'Commercial'.
     * 
     *
     * @param java.lang.String
	 */
	public void setLastName(String lastName) {
	    this.lastName = lastName;
	}
	/**
	 * public getter
	 *
     * @returns java.util.List<java.lang.Object>
	 */
	public List<Object> getAny() {
	    return this.any;
	}
	
	/**
	 * public setter
	 *
     * @param java.util.List<java.lang.Object>
	 */
	public void setAny(List<Object> any) {
	    this.any = any;
	}

}