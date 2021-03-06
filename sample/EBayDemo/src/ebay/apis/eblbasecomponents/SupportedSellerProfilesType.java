// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package ebay.apis.eblbasecomponents;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;
import java.util.List;

/**
 * 
 *   Type defining the <b>SupportedSellerProfiles</b> container for all payment,
 * return, and shipping policy profiles that a seller has defined for a site.
 * <br><br>
 * <span class="tablenote"><strong>Note:</strong>
 * Beginning with Version 763, the new Business Policies Management API and related Trading
 * API containers/fields become available for testing in the Sandbox environment. In May
 * 2012, Business Policies becomes fully functional and sellers can apply Business Policies 
 * profiles to live eBay listings.
 * </span>
 * 
 */
public class SupportedSellerProfilesType implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element(name = "SupportedSellerProfile")
	private List<SupportedSellerProfileType> supportedSellerProfile;
	
    
	/**
     * public getter
     *
     * 
     * Container consisting of information related to specific Business Policies payment, return,
     * and shipping policy profiles. The profile type is found in the
     * <b>ProfileType</b> field.
     * <br><br>
     * <span class="tablenote"><strong>Note:</strong>
     * Beginning with Version 763, the new Business Policies Management API and related Trading
     * API containers/fields become available for testing in the Sandbox environment. In May
     * 2012, Business Policies becomes fully functional and sellers can apply Business Policies 
     * profiles to live eBay listings.
     * </span>
     * 
     *
     * @returns java.util.List<ebay.apis.eblbasecomponents.SupportedSellerProfileType>
	 */
	public List<SupportedSellerProfileType> getSupportedSellerProfile() {
	    return this.supportedSellerProfile;
	}
	
	/**
	 * public setter
	 *
     * 
     * Container consisting of information related to specific Business Policies payment, return,
     * and shipping policy profiles. The profile type is found in the
     * <b>ProfileType</b> field.
     * <br><br>
     * <span class="tablenote"><strong>Note:</strong>
     * Beginning with Version 763, the new Business Policies Management API and related Trading
     * API containers/fields become available for testing in the Sandbox environment. In May
     * 2012, Business Policies becomes fully functional and sellers can apply Business Policies 
     * profiles to live eBay listings.
     * </span>
     * 
     *
     * @param java.util.List<ebay.apis.eblbasecomponents.SupportedSellerProfileType>
	 */
	public void setSupportedSellerProfile(List<SupportedSellerProfileType> supportedSellerProfile) {
	    this.supportedSellerProfile = supportedSellerProfile;
	}

}