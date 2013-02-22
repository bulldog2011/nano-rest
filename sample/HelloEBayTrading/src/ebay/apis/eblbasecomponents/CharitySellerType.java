// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package ebay.apis.eblbasecomponents;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;
import java.util.List;

/**
 * 
 * Contains information about one seller with a eBay Giving Works provider
 * charity seller account.
 * 
 */
public class CharitySellerType implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element(name = "CharitySellerStatus")
	private CharitySellerStatusCodeType charitySellerStatus;
	
	@Element(name = "CharityAffiliation")
	private List<CharityAffiliationType> charityAffiliation;
	
	@Element(name = "TermsAndConditionsAccepted")
	private Boolean termsAndConditionsAccepted;
	
    
	/**
     * public getter
     *
     * 
     * Indicates the status of the seller's charity seller account.
     * 
     *
     * @returns ebay.apis.eblbasecomponents.CharitySellerStatusCodeType
	 */
	public CharitySellerStatusCodeType getCharitySellerStatus() {
	    return this.charitySellerStatus;
	}
	
	/**
	 * public setter
	 *
     * 
     * Indicates the status of the seller's charity seller account.
     * 
     *
     * @param ebay.apis.eblbasecomponents.CharitySellerStatusCodeType
	 */
	public void setCharitySellerStatus(CharitySellerStatusCodeType charitySellerStatus) {
	    this.charitySellerStatus = charitySellerStatus;
	}
	/**
     * public getter
     *
     * 
     * Indicates the affiliation status for nonprofit charity organizations registered with the dedicated eBay Giving Works provider.
     * 
     *
     * @returns java.util.List<ebay.apis.eblbasecomponents.CharityAffiliationType>
	 */
	public List<CharityAffiliationType> getCharityAffiliation() {
	    return this.charityAffiliation;
	}
	
	/**
	 * public setter
	 *
     * 
     * Indicates the affiliation status for nonprofit charity organizations registered with the dedicated eBay Giving Works provider.
     * 
     *
     * @param java.util.List<ebay.apis.eblbasecomponents.CharityAffiliationType>
	 */
	public void setCharityAffiliation(List<CharityAffiliationType> charityAffiliation) {
	    this.charityAffiliation = charityAffiliation;
	}
	/**
     * public getter
     *
     * 
     * Indicates if the seller has accepted eBay GivingWorks Terms and Conditions.
     * 
     *
     * @returns java.lang.Boolean
	 */
	public Boolean getTermsAndConditionsAccepted() {
	    return this.termsAndConditionsAccepted;
	}
	
	/**
	 * public setter
	 *
     * 
     * Indicates if the seller has accepted eBay GivingWorks Terms and Conditions.
     * 
     *
     * @param java.lang.Boolean
	 */
	public void setTermsAndConditionsAccepted(Boolean termsAndConditionsAccepted) {
	    this.termsAndConditionsAccepted = termsAndConditionsAccepted;
	}

}