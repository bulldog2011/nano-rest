// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package ebay.apis.eblbasecomponents;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;
import java.util.Date;

/**
 * 
 * This type is deprecated; use 
 * <b>GetCategoryFeatures</b> with <b>PaymentMethods</b> as a 
 * <b>FeatureID</b> value in the request.
 * 
 *       
 *      
 */
public class PaymentOptionDetailsType implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element(name = "PaymentOption")
	private BuyerPaymentMethodCodeType paymentOption;
	
	@Element(name = "Description")
	private String description;
	
	@Element(name = "DetailVersion")
	private String detailVersion;
	
	@Element(name = "UpdateTime")
	private Date updateTime;
	
    
	/**
     * public getter
     *
     * 
     *         
     * A payment method value defined in the schema.
     * 
     *
     * @returns ebay.apis.eblbasecomponents.BuyerPaymentMethodCodeType
	 */
	public BuyerPaymentMethodCodeType getPaymentOption() {
	    return this.paymentOption;
	}
	
	/**
	 * public setter
	 *
     * 
     *         
     * A payment method value defined in the schema.
     * 
     *
     * @param ebay.apis.eblbasecomponents.BuyerPaymentMethodCodeType
	 */
	public void setPaymentOption(BuyerPaymentMethodCodeType paymentOption) {
	    this.paymentOption = paymentOption;
	}
	/**
     * public getter
     *
     * 
     *         
     * Full name of the payment method for display purposes.
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
     *         
     * Full name of the payment method for display purposes.
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
     *         
     * Returns the latest version number for this field. The version can be
     * used to determine if and when to refresh cached client data.
     * 
     *
     * @returns java.lang.String
	 */
	public String getDetailVersion() {
	    return this.detailVersion;
	}
	
	/**
	 * public setter
	 *
     * 
     *         
     * Returns the latest version number for this field. The version can be
     * used to determine if and when to refresh cached client data.
     * 
     *
     * @param java.lang.String
	 */
	public void setDetailVersion(String detailVersion) {
	    this.detailVersion = detailVersion;
	}
	/**
     * public getter
     *
     * 
     *         
     * Gives the time in GMT that the feature flags for the details were last
     * updated. This timestamp can be used to determine if and when to refresh
     * cached client data.
     * 
     *
     * @returns java.util.Date
	 */
	public Date getUpdateTime() {
	    return this.updateTime;
	}
	
	/**
	 * public setter
	 *
     * 
     *         
     * Gives the time in GMT that the feature flags for the details were last
     * updated. This timestamp can be used to determine if and when to refresh
     * cached client data.
     * 
     *
     * @param java.util.Date
	 */
	public void setUpdateTime(Date updateTime) {
	    this.updateTime = updateTime;
	}

}