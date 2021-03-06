// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package ebay.apis.eblbasecomponents;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;

/**
 * 
 * Type defining the <b>NonProfitSocialAddress</b> container, which identifies the
 * nonprofit organization's social networking site account ID. A <b>NonProfitSocialAddress</b>
 * container will exist for each social networking site that the charity organization is
 * asssociated with.
 * 
 */
public class NonProfitSocialAddressType implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element(name = "SocialAddressType")
	private SocialAddressTypeCodeType socialAddressType;
	
	@Element(name = "SocialAddressId")
	private String socialAddressId;
	
    
	/**
     * public getter
     *
     * 
     * Enumeration value that indicates the social networking site that the nonprofit charity
     * organization is associated with. This is a required field for each social networking
     * account associated with the nonprofit organzation.
     * 
     *
     * @returns ebay.apis.eblbasecomponents.SocialAddressTypeCodeType
	 */
	public SocialAddressTypeCodeType getSocialAddressType() {
	    return this.socialAddressType;
	}
	
	/**
	 * public setter
	 *
     * 
     * Enumeration value that indicates the social networking site that the nonprofit charity
     * organization is associated with. This is a required field for each social networking
     * account associated with the nonprofit organzation.
     * 
     *
     * @param ebay.apis.eblbasecomponents.SocialAddressTypeCodeType
	 */
	public void setSocialAddressType(SocialAddressTypeCodeType socialAddressType) {
	    this.socialAddressType = socialAddressType;
	}
	/**
     * public getter
     *
     * 
     * The account ID/handle associated with the nonprofit charity organization's social
     * networking site. This is a required field for each social networking account associated
     * with the nonprofit organzation.
     * 
     *
     * @returns java.lang.String
	 */
	public String getSocialAddressId() {
	    return this.socialAddressId;
	}
	
	/**
	 * public setter
	 *
     * 
     * The account ID/handle associated with the nonprofit charity organization's social
     * networking site. This is a required field for each social networking account associated
     * with the nonprofit organzation.
     * 
     *
     * @param java.lang.String
	 */
	public void setSocialAddressId(String socialAddressId) {
	    this.socialAddressId = socialAddressId;
	}

}