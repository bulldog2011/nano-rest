// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package ebay.apis.eblbasecomponents;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;
import java.util.List;

/**
 * 
 * Type defining the <b>PowerSellerStatus</b> container returned in the 
 * <b>GetSellerDashboard</b> response. The <b>PowerSellerStatus</b> 
 * container is only returned if the seller making the call is a Power Seller.
 * 
 */
public class PowerSellerDashboardType implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element(name = "Level")
	private SellerLevelCodeType level;
	
	@Element(name = "Alert")
	private List<SellerDashboardAlertType> alert;
	
    
	/**
     * public getter
     *
     * 
     * This field indicates the seller's eBay PowerSeller tier. PowerSellers are
     * distinguished in five tiers based on average monthly sales. Benefits and services vary
     * for each tier. eBay calculates eligibility for each tier on a monthly basis.
     * 
     *
     * @returns ebay.apis.eblbasecomponents.SellerLevelCodeType
	 */
	public SellerLevelCodeType getLevel() {
	    return this.level;
	}
	
	/**
	 * public setter
	 *
     * 
     * This field indicates the seller's eBay PowerSeller tier. PowerSellers are
     * distinguished in five tiers based on average monthly sales. Benefits and services vary
     * for each tier. eBay calculates eligibility for each tier on a monthly basis.
     * 
     *
     * @param ebay.apis.eblbasecomponents.SellerLevelCodeType
	 */
	public void setLevel(SellerLevelCodeType level) {
	    this.level = level;
	}
	/**
     * public getter
     *
     * 
     * The <b>PowerSellerStatus.Alert</b> container is only returned if eBay
     * has posted one or more informational or warning messages related to the seller's 
     * PowerSeller status.
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
     * The <b>PowerSellerStatus.Alert</b> container is only returned if eBay
     * has posted one or more informational or warning messages related to the seller's 
     * PowerSeller status.
     * 
     *
     * @param java.util.List<ebay.apis.eblbasecomponents.SellerDashboardAlertType>
	 */
	public void setAlert(List<SellerDashboardAlertType> alert) {
	    this.alert = alert;
	}

}