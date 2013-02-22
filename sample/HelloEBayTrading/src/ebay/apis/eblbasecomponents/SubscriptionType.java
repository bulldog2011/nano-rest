// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package ebay.apis.eblbasecomponents;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;

public class SubscriptionType implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element(name = "EIASToken")
	private String eiasToken;
	
	@Element(name = "SiteID")
	private SiteCodeType siteID;
	
	@Element(name = "Active")
	private Boolean active;
	
    
	/**
	 * public getter
	 *
     * @returns java.lang.String
	 */
	public String getEiasToken() {
	    return this.eiasToken;
	}
	
	/**
	 * public setter
	 *
     * @param java.lang.String
	 */
	public void setEiasToken(String eiasToken) {
	    this.eiasToken = eiasToken;
	}
	/**
	 * public getter
	 *
     * @returns ebay.apis.eblbasecomponents.SiteCodeType
	 */
	public SiteCodeType getSiteID() {
	    return this.siteID;
	}
	
	/**
	 * public setter
	 *
     * @param ebay.apis.eblbasecomponents.SiteCodeType
	 */
	public void setSiteID(SiteCodeType siteID) {
	    this.siteID = siteID;
	}
	/**
	 * public getter
	 *
     * @returns java.lang.Boolean
	 */
	public Boolean getActive() {
	    return this.active;
	}
	
	/**
	 * public setter
	 *
     * @param java.lang.Boolean
	 */
	public void setActive(Boolean active) {
	    this.active = active;
	}

}