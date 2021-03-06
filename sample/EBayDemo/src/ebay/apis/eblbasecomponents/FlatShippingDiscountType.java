// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package ebay.apis.eblbasecomponents;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;
import java.util.List;

/**
 * 
 * Details of an individual discount profile defined by the
 * user for flat rate shipping.
 * 
 */
public class FlatShippingDiscountType implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element(name = "DiscountName")
	private DiscountNameCodeType discountName;
	
	@Element(name = "DiscountProfile")
	private List<DiscountProfileType> discountProfile;
	
    
	/**
     * public getter
     *
     * 
     * The type of discount or "rule" that is being used by the profile.
     * The value corresponding to the selected rule is set in the same-named field
     * of FlatShippingDiscount.DiscountProfile. All are "variable" rules, as
     * defined in the documentation on shipping discount profiles.
     * 
     *
     * @returns ebay.apis.eblbasecomponents.DiscountNameCodeType
	 */
	public DiscountNameCodeType getDiscountName() {
	    return this.discountName;
	}
	
	/**
	 * public setter
	 *
     * 
     * The type of discount or "rule" that is being used by the profile.
     * The value corresponding to the selected rule is set in the same-named field
     * of FlatShippingDiscount.DiscountProfile. All are "variable" rules, as
     * defined in the documentation on shipping discount profiles.
     * 
     *
     * @param ebay.apis.eblbasecomponents.DiscountNameCodeType
	 */
	public void setDiscountName(DiscountNameCodeType discountName) {
	    this.discountName = discountName;
	}
	/**
     * public getter
     *
     * 
     * Details of this particular flat rate shipping discount profile. If
     * ModifyActionCode is Modify, all details of the new version of the profile must
     * be provided. If ModifyActionCode is Delete, DiscountProfileID is required,
     * MappingDiscountProfileID is optional, and all other fields of DiscountProfile
     * are ignored. Restrictions of how many profiles you can have for a given
     * discount rule are discussed in the documentation on shipping discount
     * profiles.
     * 
     *
     * @returns java.util.List<ebay.apis.eblbasecomponents.DiscountProfileType>
	 */
	public List<DiscountProfileType> getDiscountProfile() {
	    return this.discountProfile;
	}
	
	/**
	 * public setter
	 *
     * 
     * Details of this particular flat rate shipping discount profile. If
     * ModifyActionCode is Modify, all details of the new version of the profile must
     * be provided. If ModifyActionCode is Delete, DiscountProfileID is required,
     * MappingDiscountProfileID is optional, and all other fields of DiscountProfile
     * are ignored. Restrictions of how many profiles you can have for a given
     * discount rule are discussed in the documentation on shipping discount
     * profiles.
     * 
     *
     * @param java.util.List<ebay.apis.eblbasecomponents.DiscountProfileType>
	 */
	public void setDiscountProfile(List<DiscountProfileType> discountProfile) {
	    this.discountProfile = discountProfile;
	}

}