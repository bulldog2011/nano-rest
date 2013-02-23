// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package ebay.apis.eblbasecomponents;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;

/**
 * 
 * Searches for nonprofit charity organizations that meet the
 * criteria specified in the request.
 * It is recommended that you use at least one input filter, because this call
 * no longer returns all charities when made without filters.
 * 
 */
@RootElement(name = "GetCharitiesRequest", namespace = "urn:ebay:apis:eBLBaseComponents")
public class GetCharitiesRequestType extends AbstractRequestType implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element(name = "CharityID")
	private String charityID;
	
	@Element(name = "CharityName")
	private String charityName;
	
	@Element(name = "Query")
	private String query;
	
	@Element(name = "CharityRegion")
	private Integer charityRegion;
	
	@Element(name = "CharityDomain")
	private Integer charityDomain;
	
	@Element(name = "IncludeDescription")
	private Boolean includeDescription;
	
	@Element(name = "MatchType")
	private StringMatchCodeType matchType;
	
	@Element(name = "Featured")
	private Boolean featured;
	
	@Element(name = "CampaignID")
	private Long campaignID;
	
    
	/**
     * public getter
     *
     * 
     * A unique identification number assigned by eBay to registered nonprofit
     * charity organizations.
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
     * A unique identification number assigned by eBay to registered nonprofit
     * charity organizations.
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
     * A name assigned to a specified nonprofit
     * organization. Accepts full charity nonprofit name
     * or partial name as input. For example, enter a
     * CharityName of "heart" (case-insensitive) to
     * return all charity nonprofits that start with
     * "heart." Use with a MatchType value of "Contains"
     * to return all charity nonprofits that contain the
     * string "heart."
     * 
     *
     * @returns java.lang.String
	 */
	public String getCharityName() {
	    return this.charityName;
	}
	
	/**
	 * public setter
	 *
     * 
     * A name assigned to a specified nonprofit
     * organization. Accepts full charity nonprofit name
     * or partial name as input. For example, enter a
     * CharityName of "heart" (case-insensitive) to
     * return all charity nonprofits that start with
     * "heart." Use with a MatchType value of "Contains"
     * to return all charity nonprofits that contain the
     * string "heart."
     * 
     *
     * @param java.lang.String
	 */
	public void setCharityName(String charityName) {
	    this.charityName = charityName;
	}
	/**
     * public getter
     *
     * 
     * Accepts a case-insensitive string used to
     * find a nonprofit charity organization. Default
     * behavior is to search the CharityName field. Use
     * with an IncludeDescription value of true to
     * include the Mission field in the search.
     * 
     *
     * @returns java.lang.String
	 */
	public String getQuery() {
	    return this.query;
	}
	
	/**
	 * public setter
	 *
     * 
     * Accepts a case-insensitive string used to
     * find a nonprofit charity organization. Default
     * behavior is to search the CharityName field. Use
     * with an IncludeDescription value of true to
     * include the Mission field in the search.
     * 
     *
     * @param java.lang.String
	 */
	public void setQuery(String query) {
	    this.query = query;
	}
	/**
     * public getter
     *
     * 
     * Region that the nonprofit charity organization is associated
     * with. A specific nonprofit charity organization may be associated
     * with only one region. Meaning of input values differs depending on
     * the site. See GetCharities in the API Developer's Guide for the meaning
     * of each input/output value. CharityRegion input value must be
     * valid for that SiteID.
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
     * Region that the nonprofit charity organization is associated
     * with. A specific nonprofit charity organization may be associated
     * with only one region. Meaning of input values differs depending on
     * the site. See GetCharities in the API Developer's Guide for the meaning
     * of each input/output value. CharityRegion input value must be
     * valid for that SiteID.
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
     * Domain (mission area) that a nonprofit charity organization
     * belongs to. Nonprofit charity organizations may belong to multiple
     * mission areas. Meaning of input values differs depending on the
     * site. See GetCharities in the API Developer's Guide for the meaning
     * of each input/output value. CharityDomain input value must be valid for
     * that SiteID.
     * 
     *
     * @returns java.lang.Integer
	 */
	public Integer getCharityDomain() {
	    return this.charityDomain;
	}
	
	/**
	 * public setter
	 *
     * 
     * Domain (mission area) that a nonprofit charity organization
     * belongs to. Nonprofit charity organizations may belong to multiple
     * mission areas. Meaning of input values differs depending on the
     * site. See GetCharities in the API Developer's Guide for the meaning
     * of each input/output value. CharityDomain input value must be valid for
     * that SiteID.
     * 
     *
     * @param java.lang.Integer
	 */
	public void setCharityDomain(Integer charityDomain) {
	    this.charityDomain = charityDomain;
	}
	/**
     * public getter
     *
     * 
     * Used with Query to search for charity nonprofit
     * organizations. A value of true will search the Mission field as
     * well as the CharityName field for a string specified in Query.
     * 
     *
     * @returns java.lang.Boolean
	 */
	public Boolean getIncludeDescription() {
	    return this.includeDescription;
	}
	
	/**
	 * public setter
	 *
     * 
     * Used with Query to search for charity nonprofit
     * organizations. A value of true will search the Mission field as
     * well as the CharityName field for a string specified in Query.
     * 
     *
     * @param java.lang.Boolean
	 */
	public void setIncludeDescription(Boolean includeDescription) {
	    this.includeDescription = includeDescription;
	}
	/**
     * public getter
     *
     * 
     * Indicates the type of string matching to use when a value is submitted in
     * CharityName. If no value is specified, default behavior is "StartsWith."
     * Does not apply to Query.
     * 
     *
     * @returns ebay.apis.eblbasecomponents.StringMatchCodeType
	 */
	public StringMatchCodeType getMatchType() {
	    return this.matchType;
	}
	
	/**
	 * public setter
	 *
     * 
     * Indicates the type of string matching to use when a value is submitted in
     * CharityName. If no value is specified, default behavior is "StartsWith."
     * Does not apply to Query.
     * 
     *
     * @param ebay.apis.eblbasecomponents.StringMatchCodeType
	 */
	public void setMatchType(StringMatchCodeType matchType) {
	    this.matchType = matchType;
	}
	/**
     * public getter
     *
     * 
     * Used to decide if the search is only for featured charities.
     * A value of true will search for only featured charities.
     * 
     *
     * @returns java.lang.Boolean
	 */
	public Boolean getFeatured() {
	    return this.featured;
	}
	
	/**
	 * public setter
	 *
     * 
     * Used to decide if the search is only for featured charities.
     * A value of true will search for only featured charities.
     * 
     *
     * @param java.lang.Boolean
	 */
	public void setFeatured(Boolean featured) {
	    this.featured = featured;
	}
	/**
     * public getter
     *
     * 
     * Reserved for future use.
     * 
     *
     * @returns java.lang.Long
	 */
	public Long getCampaignID() {
	    return this.campaignID;
	}
	
	/**
	 * public setter
	 *
     * 
     * Reserved for future use.
     * 
     *
     * @param java.lang.Long
	 */
	public void setCampaignID(Long campaignID) {
	    this.campaignID = campaignID;
	}

}