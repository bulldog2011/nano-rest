// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package ebay.apis.eblbasecomponents;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;

/**
 * 
 * Type defining the <b>SellerShippingProfile</b> container, which is used in an 
 * Add/Revise/Relist Trading API call to reference a Business Policies shipping policy profile.
 * Business Policies shipping profiles contain detailed information on domestic and
 * international shipping, including shipping service options, handling time, package
 * handling costs, excluded ship-to locations, and shipping insurance information.
 * <br/><br/>
 * Business Policies shipping profiles are also returned in 
 * <b>GetItem</b>, <b>GetMyeBaySelling<b>, and other 
 * Trading calls that retrieve Item data.
 * <br/><br/>
 * <span class="tablenote"><b>Note:</b>
 * Business Policies are not yet available for use on the eBay platform. 
 * <span/>
 * 
 */
public class SellerShippingProfileType implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element(name = "ShippingProfileID")
	private Long shippingProfileID;
	
	@Element(name = "ShippingProfileName")
	private String shippingProfileName;
	
    
	/**
     * public getter
     *
     * 
     * The unique identifier of a Business Policies shipping policy profile. A <b>ShippingProfileID</b> 
     * and/or a <b>ShippingProfileName</b> value is used in the Add/Revise/Relist
     * call to reference and use the shipping policy values of a Business Policies shipping policy
     * profile. If both fields are provided and their values don't match, the <b>ShippingProfileID</b> 
     * takes precedence.
     * <br/><br/>
     * In the "Get" calls, the <b>ShippingProfileID</b> value will always be
     * returned if the listing is using a Business Policies shipping policy profile, and the <b>ShippingProfileName</b> 
     * value will be returned if a name is assigned to the shipping policy profile.
     * <br/><br/>
     * <span class="tablenote"><b>Note:</b>
     * Business Policies are not yet available for use on the eBay platform. 
     * <span/>
     * 
     *
     * @returns java.lang.Long
	 */
	public Long getShippingProfileID() {
	    return this.shippingProfileID;
	}
	
	/**
	 * public setter
	 *
     * 
     * The unique identifier of a Business Policies shipping policy profile. A <b>ShippingProfileID</b> 
     * and/or a <b>ShippingProfileName</b> value is used in the Add/Revise/Relist
     * call to reference and use the shipping policy values of a Business Policies shipping policy
     * profile. If both fields are provided and their values don't match, the <b>ShippingProfileID</b> 
     * takes precedence.
     * <br/><br/>
     * In the "Get" calls, the <b>ShippingProfileID</b> value will always be
     * returned if the listing is using a Business Policies shipping policy profile, and the <b>ShippingProfileName</b> 
     * value will be returned if a name is assigned to the shipping policy profile.
     * <br/><br/>
     * <span class="tablenote"><b>Note:</b>
     * Business Policies are not yet available for use on the eBay platform. 
     * <span/>
     * 
     *
     * @param java.lang.Long
	 */
	public void setShippingProfileID(Long shippingProfileID) {
	    this.shippingProfileID = shippingProfileID;
	}
	/**
     * public getter
     *
     * 
     * The name of a Business Policies shipping policy profile. A <b>ShippingProfileID</b> 
     * and/or a <b>ShippingProfileName</b> value is used in the Add/Revise/Relist
     * call to reference and use the shipping policy values of a Business Policies shipping policy
     * profile. If both fields are provided and their values don't match, the <b>ShippingProfileID</b> 
     * takes precedence.
     * <br/><br/>
     * In the "Get" calls, the <b>ShippingProfileID</b> value will always be
     * returned if the listing is using a Business Policies shipping policy profile, and the <b>ShippingProfileName</b> 
     * value will be returned if a name is assigned to the shipping policy profile.
     * <br/><br/>
     * <span class="tablenote"><b>Note:</b>
     * Business Policies are not yet available for use on the eBay platform. 
     * <span/>
     * 
     *
     * @returns java.lang.String
	 */
	public String getShippingProfileName() {
	    return this.shippingProfileName;
	}
	
	/**
	 * public setter
	 *
     * 
     * The name of a Business Policies shipping policy profile. A <b>ShippingProfileID</b> 
     * and/or a <b>ShippingProfileName</b> value is used in the Add/Revise/Relist
     * call to reference and use the shipping policy values of a Business Policies shipping policy
     * profile. If both fields are provided and their values don't match, the <b>ShippingProfileID</b> 
     * takes precedence.
     * <br/><br/>
     * In the "Get" calls, the <b>ShippingProfileID</b> value will always be
     * returned if the listing is using a Business Policies shipping policy profile, and the <b>ShippingProfileName</b> 
     * value will be returned if a name is assigned to the shipping policy profile.
     * <br/><br/>
     * <span class="tablenote"><b>Note:</b>
     * Business Policies are not yet available for use on the eBay platform. 
     * <span/>
     * 
     *
     * @param java.lang.String
	 */
	public void setShippingProfileName(String shippingProfileName) {
	    this.shippingProfileName = shippingProfileName;
	}

}