// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package ebay.apis.eblbasecomponents;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;

/**
 * 
 * Type defining the <b>SellerPaymentProfile</b> container, which is used in an 
 * Add/Revise/Relist Trading API call to reference a Business Policies payment profile.
 * <br/><br/>
 * <span class="tablenote"><b>Note:</b>
 * Business Policies are not yet available for use on the eBay platform. 
 * <span/>
 * 
 */
public class SellerPaymentProfileType implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element(name = "PaymentProfileID")
	private Long paymentProfileID;
	
	@Element(name = "PaymentProfileName")
	private String paymentProfileName;
	
    
	/**
     * public getter
     *
     * 
     * The unique identifier of a Business Policies payment profile. A <b>PaymentProfileID</b> 
     * and/or a <b>PaymentProfileName</b> value is used in the Add/Revise/Relist
     * call to reference and use the payment policy values of a Business Policies payment
     * profile. If both fields are provided and their values don't match, the <b>PaymentProfileID</b> 
     * takes precedence.
     * <br/><br/>
     * In the "Get" calls, the <b>PaymentProfileID</b> value will always be
     * returned if the listing is using a Business Policies payment profile, and the <b>PaymentProfileName</b> 
     * value will be returned if a name is assigned to the payment profile.
     * <br/><br/>
     * <span class="tablenote"><b>Note:</b>
     * Business Policies are not yet available for use on the eBay platform. 
     * <span/>
     * 
     *
     * @returns java.lang.Long
	 */
	public Long getPaymentProfileID() {
	    return this.paymentProfileID;
	}
	
	/**
	 * public setter
	 *
     * 
     * The unique identifier of a Business Policies payment profile. A <b>PaymentProfileID</b> 
     * and/or a <b>PaymentProfileName</b> value is used in the Add/Revise/Relist
     * call to reference and use the payment policy values of a Business Policies payment
     * profile. If both fields are provided and their values don't match, the <b>PaymentProfileID</b> 
     * takes precedence.
     * <br/><br/>
     * In the "Get" calls, the <b>PaymentProfileID</b> value will always be
     * returned if the listing is using a Business Policies payment profile, and the <b>PaymentProfileName</b> 
     * value will be returned if a name is assigned to the payment profile.
     * <br/><br/>
     * <span class="tablenote"><b>Note:</b>
     * Business Policies are not yet available for use on the eBay platform. 
     * <span/>
     * 
     *
     * @param java.lang.Long
	 */
	public void setPaymentProfileID(Long paymentProfileID) {
	    this.paymentProfileID = paymentProfileID;
	}
	/**
     * public getter
     *
     * 
     * The name of a Business Policies payment profile. A <b>PaymentProfileID</b> 
     * and/or a <b>PaymentProfileName</b> value is used in the Add/Revise/Relist
     * call to reference and use the payment policy values of a Business Policies payment
     * profile. If both fields are provided and their values don't match, the <b>PaymentProfileID</b> 
     * takes precedence.
     * <br/><br/>
     * In the "Get" calls, the <b>PaymentProfileID</b> value will always be
     * returned if the listing is using a Business Policies payment profile, and the <b>PaymentProfileName</b> 
     * value will be returned if a name is assigned to the payment profile.
     * <br/><br/>
     * <span class="tablenote"><b>Note:</b>
     * Business Policies are not yet available for use on the eBay platform. 
     * <span/>
     * 
     *
     * @returns java.lang.String
	 */
	public String getPaymentProfileName() {
	    return this.paymentProfileName;
	}
	
	/**
	 * public setter
	 *
     * 
     * The name of a Business Policies payment profile. A <b>PaymentProfileID</b> 
     * and/or a <b>PaymentProfileName</b> value is used in the Add/Revise/Relist
     * call to reference and use the payment policy values of a Business Policies payment
     * profile. If both fields are provided and their values don't match, the <b>PaymentProfileID</b> 
     * takes precedence.
     * <br/><br/>
     * In the "Get" calls, the <b>PaymentProfileID</b> value will always be
     * returned if the listing is using a Business Policies payment profile, and the <b>PaymentProfileName</b> 
     * value will be returned if a name is assigned to the payment profile.
     * <br/><br/>
     * <span class="tablenote"><b>Note:</b>
     * Business Policies are not yet available for use on the eBay platform. 
     * <span/>
     * 
     *
     * @param java.lang.String
	 */
	public void setPaymentProfileName(String paymentProfileName) {
	    this.paymentProfileName = paymentProfileName;
	}

}