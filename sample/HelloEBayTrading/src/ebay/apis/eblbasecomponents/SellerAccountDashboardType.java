// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package ebay.apis.eblbasecomponents;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;
import java.util.List;

/**
 * 
 * Type defining the <b>SellerAccount</b> container returned in the 
 * <b>GetSellerDashboard</b> response. 
 * 
 */
public class SellerAccountDashboardType implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element(name = "Status")
	private SellerAccountStatusCodeType status;
	
	@Element(name = "Alert")
	private List<SellerDashboardAlertType> alert;
	
    
	/**
     * public getter
     *
     * 
     * This field indicates the status of your seller's account. Specifically, you'll find out if your 
     * account is current and active, or if your account has a past due balance or is on 
     * hold. For more details about your account, you can go to your Seller Account page
     * on the eBay site (login to My eBay), or you can call <b>GetAccount</b>.
     * 
     *
     * @returns ebay.apis.eblbasecomponents.SellerAccountStatusCodeType
	 */
	public SellerAccountStatusCodeType getStatus() {
	    return this.status;
	}
	
	/**
	 * public setter
	 *
     * 
     * This field indicates the status of your seller's account. Specifically, you'll find out if your 
     * account is current and active, or if your account has a past due balance or is on 
     * hold. For more details about your account, you can go to your Seller Account page
     * on the eBay site (login to My eBay), or you can call <b>GetAccount</b>.
     * 
     *
     * @param ebay.apis.eblbasecomponents.SellerAccountStatusCodeType
	 */
	public void setStatus(SellerAccountStatusCodeType status) {
	    this.status = status;
	}
	/**
     * public getter
     *
     * 
     * The <b>SellerAccount.Alert</b> container is only returned if eBay has 
     * posted one or more informational or warning messages to the seller's account.
     * 
     *
     * @returns java.util.List<ebay.apis.eblbasecomponents.SellerDashboardAlertType>
	 */
	public List<SellerDashboardAlertType> getAlert() {
	    return this.alert;
	}
	
	/**
	 * public setter
	 *
     * 
     * The <b>SellerAccount.Alert</b> container is only returned if eBay has 
     * posted one or more informational or warning messages to the seller's account.
     * 
     *
     * @param java.util.List<ebay.apis.eblbasecomponents.SellerDashboardAlertType>
	 */
	public void setAlert(List<SellerDashboardAlertType> alert) {
	    this.alert = alert;
	}

}