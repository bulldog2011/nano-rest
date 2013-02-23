// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package ebay.apis.eblbasecomponents;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;
import java.util.List;

/**
 * 
 * Type defining the <b>Charity</b> container, which consists of all details
 * related to a nonprofit charity organization.
 * 
 */
public class CharityInfoType implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element(name = "Name")
	private String name;
	
	@Element(name = "Mission")
	private String mission;
	
	@Element(name = "LogoURL")
	private String logoURL;
	
	@Element(name = "Status")
	private CharityStatusCodeType status;
	
	@Element(name = "SearchableString")
	private String searchableString;
	
	@Element(name = "CharityRegion")
	private Integer charityRegion;
	
	@Element(name = "CharityDomain")
	private List<Integer> charityDomain;
	
	@Element(name = "CharityID")
	private String charityID;
	
	@Element(name = "LogoURLSelling")
	private String logoURLSelling;
	
	@Element(name = "DisplayLogoSelling")
	private Boolean displayLogoSelling;
	
	@Element(name = "DisplayNameInCheckout")
	private Boolean displayNameInCheckout;
	
	@Element(name = "Description")
	private String description;
	
	@Element(name = "ShowMultipleDonationAmountInCheckout")
	private Boolean showMultipleDonationAmountInCheckout;
	
	@Element(name = "ExternalID")
	private String externalID;
	
	@Element(name = "PopularityIndex")
	private Integer popularityIndex;
	
	@Element(name = "EIN")
	private String ein;
	
	@Element(name = "NonProfitSecondName")
	private String nonProfitSecondName;
	
	@Element(name = "NonProfitAddress")
	private List<NonProfitAddressType> nonProfitAddress;
	
	@Element(name = "NonProfitSocialAddress")
	private List<NonProfitSocialAddressType> nonProfitSocialAddress;
	
	@Attribute  
	private String id;
	
    
	/**
     * public getter
     *
     * 
     * The name of a non-profit charity organization. The <b>Name</b> field is
     * required if non-registered charity organization, since these companies will not have a
     * eBay Giving Works <b>CharityID</b>
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
     * The name of a non-profit charity organization. The <b>Name</b> field is
     * required if non-registered charity organization, since these companies will not have a
     * eBay Giving Works <b>CharityID</b>
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
     * The mission statement of a nonprofit charity organization registered with eBay Giving
     * Works. The mission statement is returned in <b>GetCharities</b> and is
     * displayed in item listings if the nonprofit charity organization is registered with
     * eBay Giving Works.
     * 
     *
     * @returns java.lang.String
	 */
	public String getMission() {
	    return this.mission;
	}
	
	/**
	 * public setter
	 *
     * 
     * The mission statement of a nonprofit charity organization registered with eBay Giving
     * Works. The mission statement is returned in <b>GetCharities</b> and is
     * displayed in item listings if the nonprofit charity organization is registered with
     * eBay Giving Works.
     * 
     *
     * @param java.lang.String
	 */
	public void setMission(String mission) {
	    this.mission = mission;
	}
	/**
     * public getter
     *
     * 
     * This URL indicates the location of the nonprofit charity organization's logo image. The
     * image file must be JPG or GIF format, and its size cannot exceed 50 KB. This logo is
     * displayed in item listings if the nonprofit charity organization is registered with
     * eBay Giving Works. A standard eBay Giving Works logo is used in place of the charity
     * organization's logo if the <b>LogoURL</b> or <b>LogoURLSelling</b>
     * values are not provided or these value point to bad URLs or to URLs containing no images
     * or images not meeting eBay logo size and format requirements. This value is returned if
     * set.
     * 
     *
     * @returns java.lang.String
	 */
	public String getLogoURL() {
	    return this.logoURL;
	}
	
	/**
	 * public setter
	 *
     * 
     * This URL indicates the location of the nonprofit charity organization's logo image. The
     * image file must be JPG or GIF format, and its size cannot exceed 50 KB. This logo is
     * displayed in item listings if the nonprofit charity organization is registered with
     * eBay Giving Works. A standard eBay Giving Works logo is used in place of the charity
     * organization's logo if the <b>LogoURL</b> or <b>LogoURLSelling</b>
     * values are not provided or these value point to bad URLs or to URLs containing no images
     * or images not meeting eBay logo size and format requirements. This value is returned if
     * set.
     * 
     *
     * @param java.lang.String
	 */
	public void setLogoURL(String logoURL) {
	    this.logoURL = logoURL;
	}
	/**
     * public getter
     *
     * 
     * Enumeration value that indicates whether or not the charity is a valid eBay Giving Works
     * nonprofit organization.
     * 
     *
     * @returns ebay.apis.eblbasecomponents.CharityStatusCodeType
	 */
	public CharityStatusCodeType getStatus() {
	    return this.status;
	}
	
	/**
	 * public setter
	 *
     * 
     * Enumeration value that indicates whether or not the charity is a valid eBay Giving Works
     * nonprofit organization.
     * 
     *
     * @param ebay.apis.eblbasecomponents.CharityStatusCodeType
	 */
	public void setStatus(CharityStatusCodeType status) {
	    this.status = status;
	}
	/**
     * public getter
     *
     * 
     * Keyword string to be used for search purposes.
     * 
     *
     * @returns java.lang.String
	 */
	public String getSearchableString() {
	    return this.searchableString;
	}
	
	/**
	 * public setter
	 *
     * 
     * Keyword string to be used for search purposes.
     * 
     *
     * @param java.lang.String
	 */
	public void setSearchableString(String searchableString) {
	    this.searchableString = searchableString;
	}
	/**
     * public getter
     *
     * 
     * Integer value that indicates the nonprofit charity organization's region. Each nonprofit
     * charity organization may be associated with only one region.
     * 
     *
     * @returns java.lang.Integer
	 */
	public Integer getCharityRegion() {
	    return this.charityRegion;
	}
	
	/**
	 * public setter
	 *
     * 
     * Integer value that indicates the nonprofit charity organization's region. Each nonprofit
     * charity organization may be associated with only one region.
     * 
     *
     * @param java.lang.Integer
	 */
	public void setCharityRegion(Integer charityRegion) {
	    this.charityRegion = charityRegion;
	}
	/**
     * public getter
     *
     * 
     * Integer value that indicates the domain (mission area) of the nonprofit charity
     * organization. A nonprofit charity organization does not have to specify a charity
     * domain, so it is possible that this field will not be returned in
     * <b>GetCharities</b>. Each nonprofit charity organization can belong to as
     * many as three charity domains.
     * 
     *
     * @returns java.util.List<java.lang.Integer>
	 */
	public List<Integer> getCharityDomain() {
	    return this.charityDomain;
	}
	
	/**
	 * public setter
	 *
     * 
     * Integer value that indicates the domain (mission area) of the nonprofit charity
     * organization. A nonprofit charity organization does not have to specify a charity
     * domain, so it is possible that this field will not be returned in
     * <b>GetCharities</b>. Each nonprofit charity organization can belong to as
     * many as three charity domains.
     * 
     *
     * @param java.util.List<java.lang.Integer>
	 */
	public void setCharityDomain(List<Integer> charityDomain) {
	    this.charityDomain = charityDomain;
	}
	/**
     * public getter
     *
     * 
     * A unique identifier created by eBay and assigned to registered nonprofit charity
     * organizations. This identifier can be used as a filter in the <b>GetCharities</b>
     * request, and it will always be returned if the nonprofity charity organization is
     * registered with eBay Giving Works.
     * 
     *
     * @returns java.lang.String
	 */
	public String getCharityID() {
	    return this.charityID;
	}
	
	/**
	 * public setter
	 *
     * 
     * A unique identifier created by eBay and assigned to registered nonprofit charity
     * organizations. This identifier can be used as a filter in the <b>GetCharities</b>
     * request, and it will always be returned if the nonprofity charity organization is
     * registered with eBay Giving Works.
     * 
     *
     * @param java.lang.String
	 */
	public void setCharityID(String charityID) {
	    this.charityID = charityID;
	}
	/**
     * public getter
     *
     * 
     * An alternative to the <b>LogoURL</b> value. This URL indicates the location
     * of the nonprofit charity organization's logo image. The image file must be JPG or GIF
     * format, and its size cannot exceed 50 KB. This URL will be used if the
     * <b>LogoURL</b> value points to a broken link or if that location either
     * contains no image or contains an image that does not meet the eBay requirements - GIF or
     * JPG file; maximum size of 50 KB. A nonprofit charity organization's logo is displayed in
     * item listings if the nonprofit charity organization is registered with eBay Giving
     * Works. A standard eBay Giving Works logo is used in place of the charity organization's
     * logo if the Logo URL is not provided. This value is returned if set.
     * 
     *
     * @returns java.lang.String
	 */
	public String getLogoURLSelling() {
	    return this.logoURLSelling;
	}
	
	/**
	 * public setter
	 *
     * 
     * An alternative to the <b>LogoURL</b> value. This URL indicates the location
     * of the nonprofit charity organization's logo image. The image file must be JPG or GIF
     * format, and its size cannot exceed 50 KB. This URL will be used if the
     * <b>LogoURL</b> value points to a broken link or if that location either
     * contains no image or contains an image that does not meet the eBay requirements - GIF or
     * JPG file; maximum size of 50 KB. A nonprofit charity organization's logo is displayed in
     * item listings if the nonprofit charity organization is registered with eBay Giving
     * Works. A standard eBay Giving Works logo is used in place of the charity organization's
     * logo if the Logo URL is not provided. This value is returned if set.
     * 
     *
     * @param java.lang.String
	 */
	public void setLogoURLSelling(String logoURLSelling) {
	    this.logoURLSelling = logoURLSelling;
	}
	/**
     * public getter
     *
     * 
     * <b>Deprecated.</b> This field will be removed from the schema
     * in a future release. Recommended to use IsFeaturedInSYI.
     * This boolean value should be set to true if an alternate logo URL should
     * be supplied by sellers using the eBay Sell Your Item flow. If this field
     * has not been set to true, it will return the default value of false.
     * 
     *
     * @returns java.lang.Boolean
	 */
	public Boolean getDisplayLogoSelling() {
	    return this.displayLogoSelling;
	}
	
	/**
	 * public setter
	 *
     * 
     * <b>Deprecated.</b> This field will be removed from the schema
     * in a future release. Recommended to use IsFeaturedInSYI.
     * This boolean value should be set to true if an alternate logo URL should
     * be supplied by sellers using the eBay Sell Your Item flow. If this field
     * has not been set to true, it will return the default value of false.
     * 
     *
     * @param java.lang.Boolean
	 */
	public void setDisplayLogoSelling(Boolean displayLogoSelling) {
	    this.displayLogoSelling = displayLogoSelling;
	}
	/**
     * public getter
     *
     * 
     * <b>Deprecated.</b> This field will be removed from the schema
     * in a future release. Recommended to use a combination of
     * IsFeaturedInXO/DisplayAtCheckout, based on the scenario.
     * Set this boolean value to true if the name of the nonprofit company should
     * be shown during checkout. If this field has not been set to true,
     * it will return the default value of false. If the user rolls their mouse
     * over the name of the nonprofit company, they will see the nonprofit company's
     * mission statement.
     * 
     *
     * @returns java.lang.Boolean
	 */
	public Boolean getDisplayNameInCheckout() {
	    return this.displayNameInCheckout;
	}
	
	/**
	 * public setter
	 *
     * 
     * <b>Deprecated.</b> This field will be removed from the schema
     * in a future release. Recommended to use a combination of
     * IsFeaturedInXO/DisplayAtCheckout, based on the scenario.
     * Set this boolean value to true if the name of the nonprofit company should
     * be shown during checkout. If this field has not been set to true,
     * it will return the default value of false. If the user rolls their mouse
     * over the name of the nonprofit company, they will see the nonprofit company's
     * mission statement.
     * 
     *
     * @param java.lang.Boolean
	 */
	public void setDisplayNameInCheckout(Boolean displayNameInCheckout) {
	    this.displayNameInCheckout = displayNameInCheckout;
	}
	/**
     * public getter
     *
     * 
     * This field provides a short description about the nonprofit charity organization's
     * primary purpose. "I want to support" will be added to the beginning of the contents of
     * this field. For example, if the description is "the fight against cancer", then on the
     * checkout page "I want to support the fight against cancer" will be displayed. The
     * description may contain a maximum of 115 charecters. This value is returned if set.
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
     * This field provides a short description about the nonprofit charity organization's
     * primary purpose. "I want to support" will be added to the beginning of the contents of
     * this field. For example, if the description is "the fight against cancer", then on the
     * checkout page "I want to support the fight against cancer" will be displayed. The
     * description may contain a maximum of 115 charecters. This value is returned if set.
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
     *   This field must be used with the DisplayNameInCheckout field to control the options that are visible
     *   to a buyer during checkout. If the
     *   DisplayNameInCheckout field is set to True, and the ShowMultipleDonationAmountInCheckout
     *   field is set to False, a checkbox with the one dollar option will be displayed during checkout.
     *   If the DisplayNameInCheckout field is set to False, and the ShowMultipleDonationAmountInCheckout
     *   field is set to False, no options will be displayed during checkout.
     *   <br><br>
     *   Reserved for future use. If the DisplayNameInCheckout field is set to True, and the
     *   ShowMultipleDonationAmountInCheckout field is set to True, a dropdown with multiple donation amounts
     *   will be displayed during checkout.  If the DisplayNameInCheckout field is set to False, and the
     *   ShowMultipleDonationAmountInCheckout field is set to True, no options will be displayed during checkout,
     *   but the multiple donation amount field will be set.
     * 
     *
     * @returns java.lang.Boolean
	 */
	public Boolean getShowMultipleDonationAmountInCheckout() {
	    return this.showMultipleDonationAmountInCheckout;
	}
	
	/**
	 * public setter
	 *
     * 
     *   This field must be used with the DisplayNameInCheckout field to control the options that are visible
     *   to a buyer during checkout. If the
     *   DisplayNameInCheckout field is set to True, and the ShowMultipleDonationAmountInCheckout
     *   field is set to False, a checkbox with the one dollar option will be displayed during checkout.
     *   If the DisplayNameInCheckout field is set to False, and the ShowMultipleDonationAmountInCheckout
     *   field is set to False, no options will be displayed during checkout.
     *   <br><br>
     *   Reserved for future use. If the DisplayNameInCheckout field is set to True, and the
     *   ShowMultipleDonationAmountInCheckout field is set to True, a dropdown with multiple donation amounts
     *   will be displayed during checkout.  If the DisplayNameInCheckout field is set to False, and the
     *   ShowMultipleDonationAmountInCheckout field is set to True, no options will be displayed during checkout,
     *   but the multiple donation amount field will be set.
     * 
     *
     * @param java.lang.Boolean
	 */
	public void setShowMultipleDonationAmountInCheckout(Boolean showMultipleDonationAmountInCheckout) {
	    this.showMultipleDonationAmountInCheckout = showMultipleDonationAmountInCheckout;
	}
	/**
     * public getter
     *
     * 
     * A unique identifier created and used by MissionFish to identify a registered nonprofit
     * charity organization. This field is only returned for charities that are registered with
     * MissionFish.
     * 
     *
     * @returns java.lang.String
	 */
	public String getExternalID() {
	    return this.externalID;
	}
	
	/**
	 * public setter
	 *
     * 
     * A unique identifier created and used by MissionFish to identify a registered nonprofit
     * charity organization. This field is only returned for charities that are registered with
     * MissionFish.
     * 
     *
     * @param java.lang.String
	 */
	public void setExternalID(String externalID) {
	    this.externalID = externalID;
	}
	/**
     * public getter
     *
     * 
     * An integer value that indicates a nonprofit charity organization's popularity rank in
     * comparison with other registered eBay Giving Works organizations. This value is
     * determined and managed by MissionFish and is based on various factors. This value is
     * always returned for nonprofit organizations registered with eBay Giving Works.
     * 
     *
     * @returns java.lang.Integer
	 */
	public Integer getPopularityIndex() {
	    return this.popularityIndex;
	}
	
	/**
	 * public setter
	 *
     * 
     * An integer value that indicates a nonprofit charity organization's popularity rank in
     * comparison with other registered eBay Giving Works organizations. This value is
     * determined and managed by MissionFish and is based on various factors. This value is
     * always returned for nonprofit organizations registered with eBay Giving Works.
     * 
     *
     * @param java.lang.Integer
	 */
	public void setPopularityIndex(Integer popularityIndex) {
	    this.popularityIndex = popularityIndex;
	}
	/**
     * public getter
     *
     * 
     * This value is the Employer Identification Number (EIN) of the nonprofit charity
     * organization. A nonprofit company's EIN is used for tax purposes by the Internal
     * Revenue Service. This value is returned if the nonprofit organization has an EIN and
     * it has been set.
     * 
     *
     * @returns java.lang.String
	 */
	public String getEin() {
	    return this.ein;
	}
	
	/**
	 * public setter
	 *
     * 
     * This value is the Employer Identification Number (EIN) of the nonprofit charity
     * organization. A nonprofit company's EIN is used for tax purposes by the Internal
     * Revenue Service. This value is returned if the nonprofit organization has an EIN and
     * it has been set.
     * 
     *
     * @param java.lang.String
	 */
	public void setEin(String ein) {
	    this.ein = ein;
	}
	/**
     * public getter
     *
     * 
     * An alternative name for the nonprofit charity organization. This value is used by
     * PayPal to search for nonprofit organizations. This value is returned if set.
     * 
     *
     * @returns java.lang.String
	 */
	public String getNonProfitSecondName() {
	    return this.nonProfitSecondName;
	}
	
	/**
	 * public setter
	 *
     * 
     * An alternative name for the nonprofit charity organization. This value is used by
     * PayPal to search for nonprofit organizations. This value is returned if set.
     * 
     *
     * @param java.lang.String
	 */
	public void setNonProfitSecondName(String nonProfitSecondName) {
	    this.nonProfitSecondName = nonProfitSecondName;
	}
	/**
     * public getter
     *
     * 
     * Container consisting of the address (including latitude and longitude) of a nonprofit
     * charity organization. This container is always returned if it is set.
     * 
     *
     * @returns java.util.List<ebay.apis.eblbasecomponents.NonProfitAddressType>
	 */
	public List<NonProfitAddressType> getNonProfitAddress() {
	    return this.nonProfitAddress;
	}
	
	/**
	 * public setter
	 *
     * 
     * Container consisting of the address (including latitude and longitude) of a nonprofit
     * charity organization. This container is always returned if it is set.
     * 
     *
     * @param java.util.List<ebay.apis.eblbasecomponents.NonProfitAddressType>
	 */
	public void setNonProfitAddress(List<NonProfitAddressType> nonProfitAddress) {
	    this.nonProfitAddress = nonProfitAddress;
	}
	/**
     * public getter
     *
     * 
     * Container consisting of the nonprofit charity organization's social networking site ID/handle.
     * A <b>NonProfitSocialAddress</b> container will exist for each social
     * networking site that the charity organization is asssociated with. Supported social
     * networking sites include Facebook, Twitter, LinkedIn, Google+, MySpace, and Orkut. One
     * or more of these containers are returned if set.
     * 
     *
     * @returns java.util.List<ebay.apis.eblbasecomponents.NonProfitSocialAddressType>
	 */
	public List<NonProfitSocialAddressType> getNonProfitSocialAddress() {
	    return this.nonProfitSocialAddress;
	}
	
	/**
	 * public setter
	 *
     * 
     * Container consisting of the nonprofit charity organization's social networking site ID/handle.
     * A <b>NonProfitSocialAddress</b> container will exist for each social
     * networking site that the charity organization is asssociated with. Supported social
     * networking sites include Facebook, Twitter, LinkedIn, Google+, MySpace, and Orkut. One
     * or more of these containers are returned if set.
     * 
     *
     * @param java.util.List<ebay.apis.eblbasecomponents.NonProfitSocialAddressType>
	 */
	public void setNonProfitSocialAddress(List<NonProfitSocialAddressType> nonProfitSocialAddress) {
	    this.nonProfitSocialAddress = nonProfitSocialAddress;
	}
	/**
	 * public getter
	 *
     * @returns java.lang.String
	 */
	public String getId() {
	    return this.id;
	}
	
	/**
	 * public setter
	 *
     * @param java.lang.String
	 */
	public void setId(String id) {
	    this.id = id;
	}

}