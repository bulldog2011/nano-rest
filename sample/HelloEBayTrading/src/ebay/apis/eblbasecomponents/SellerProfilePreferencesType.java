// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package ebay.apis.eblbasecomponents;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;

/**
 * 
 *   Type defining the <b>SellerProfilePreferences</b> container. This container
 * consists of a flag that indicates whether or not the seller has opted into Business
 * Policies, as well as a list of Business Policies profiles that have been set up for the 
 * seller's account.
 * <br><br>
 * <span class="tablenote"><strong>Note:</strong>
 * Business Policies are not yet available for use on the eBay platform. 
 * </span>
 * 
 */
public class SellerProfilePreferencesType implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element(name = "SellerProfileOptedIn")
	private Boolean sellerProfileOptedIn;
	
	@Element(name = "SupportedSellerProfiles")
	private SupportedSellerProfilesType supportedSellerProfiles;
	
    
	/**
     * public getter
     *
     * 
     *   Boolean flag indicating whether or not a seller has opted in to Business
     *  Policies. Sellers must opt in to Business Policies to create and manage payment, 
     *  return policy, and shipping profiles.
     *   <br><br>
     *   <span class="tablenote"><strong>Note:</strong>
     * Business Policies are not yet available for use on the eBay platform. 
     * </span>
     * 
     *
     * @returns java.lang.Boolean
	 */
	public Boolean getSellerProfileOptedIn() {
	    return this.sellerProfileOptedIn;
	}
	
	/**
	 * public setter
	 *
     * 
     *   Boolean flag indicating whether or not a seller has opted in to Business
     *  Policies. Sellers must opt in to Business Policies to create and manage payment, 
     *  return policy, and shipping profiles.
     *   <br><br>
     *   <span class="tablenote"><strong>Note:</strong>
     * Business Policies are not yet available for use on the eBay platform. 
     * </span>
     * 
     *
     * @param java.lang.Boolean
	 */
	public void setSellerProfileOptedIn(Boolean sellerProfileOptedIn) {
	    this.sellerProfileOptedIn = sellerProfileOptedIn;
	}
	/**
     * public getter
     *
     * 
     * Container consisting of one or more Business Policies profiles active for a
     * seller's account. This container is only returned if SellerProfileOptedIn=true 
     * and the seller has one or more Business Policies profiles active on the account.
     * <br><br>
     * <span class="tablenote"><strong>Note:</strong>
     * Business Policies are not yet available for use on the eBay platform. 
     * </span>
     * 
     *
     * @returns ebay.apis.eblbasecomponents.SupportedSellerProfilesType
	 */
	public SupportedSellerProfilesType getSupportedSellerProfiles() {
	    return this.supportedSellerProfiles;
	}
	
	/**
	 * public setter
	 *
     * 
     * Container consisting of one or more Business Policies profiles active for a
     * seller's account. This container is only returned if SellerProfileOptedIn=true 
     * and the seller has one or more Business Policies profiles active on the account.
     * <br><br>
     * <span class="tablenote"><strong>Note:</strong>
     * Business Policies are not yet available for use on the eBay platform. 
     * </span>
     * 
     *
     * @param ebay.apis.eblbasecomponents.SupportedSellerProfilesType
	 */
	public void setSupportedSellerProfiles(SupportedSellerProfilesType supportedSellerProfiles) {
	    this.supportedSellerProfiles = supportedSellerProfiles;
	}

}