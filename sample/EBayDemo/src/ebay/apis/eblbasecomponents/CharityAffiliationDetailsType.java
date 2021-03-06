// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package ebay.apis.eblbasecomponents;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;
import java.util.List;

/**
 * 
 * Lists the nonprofit charity organization affiliations for a specified user.
 * 
 */
public class CharityAffiliationDetailsType implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element(name = "CharityAffiliationDetail")
	private List<CharityAffiliationDetailType> charityAffiliationDetail;
	
    
	/**
     * public getter
     *
     * 
     * Indicates the affiliation status for nonprofit charity organizations
     * registered with the dedicated eBay Giving Works provider.
     * 
     *
     * @returns java.util.List<ebay.apis.eblbasecomponents.CharityAffiliationDetailType>
	 */
	public List<CharityAffiliationDetailType> getCharityAffiliationDetail() {
	    return this.charityAffiliationDetail;
	}
	
	/**
	 * public setter
	 *
     * 
     * Indicates the affiliation status for nonprofit charity organizations
     * registered with the dedicated eBay Giving Works provider.
     * 
     *
     * @param java.util.List<ebay.apis.eblbasecomponents.CharityAffiliationDetailType>
	 */
	public void setCharityAffiliationDetail(List<CharityAffiliationDetailType> charityAffiliationDetail) {
	    this.charityAffiliationDetail = charityAffiliationDetail;
	}

}