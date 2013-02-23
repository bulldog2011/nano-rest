// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package ebay.apis.eblbasecomponents;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;
import java.util.Date;

/**
 * 
 * Details about type of Carrier used to ship an item.
 * 
 */
public class ShippingCarrierDetailsType implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element(name = "ShippingCarrierID")
	private Integer shippingCarrierID;
	
	@Element(name = "Description")
	private String description;
	
	@Element(name = "ShippingCarrier")
	private ShippingCarrierCodeType shippingCarrier;
	
	@Element(name = "DetailVersion")
	private String detailVersion;
	
	@Element(name = "UpdateTime")
	private Date updateTime;
	
    
	/**
     * public getter
     *
     * 
     * Numeric identifier.
     * Some applications use this ID
     * to look up shipping Carriers more efficiently.
     * 
     *
     * @returns java.lang.Integer
	 */
	public Integer getShippingCarrierID() {
	    return this.shippingCarrierID;
	}
	
	/**
	 * public setter
	 *
     * 
     * Numeric identifier.
     * Some applications use this ID
     * to look up shipping Carriers more efficiently.
     * 
     *
     * @param java.lang.Integer
	 */
	public void setShippingCarrierID(Integer shippingCarrierID) {
	    this.shippingCarrierID = shippingCarrierID;
	}
	/**
     * public getter
     *
     * 
     * Display string that applications can use to present a list of shipping carriers in
     * a more user-friendly format (such as in a drop-down list).
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
     * Display string that applications can use to present a list of shipping carriers in
     * a more user-friendly format (such as in a drop-down list).
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
     * Value used for the shipping Carrier.
     * 
     *
     * @returns ebay.apis.eblbasecomponents.ShippingCarrierCodeType
	 */
	public ShippingCarrierCodeType getShippingCarrier() {
	    return this.shippingCarrier;
	}
	
	/**
	 * public setter
	 *
     * 
     * Value used for the shipping Carrier.
     * 
     *
     * @param ebay.apis.eblbasecomponents.ShippingCarrierCodeType
	 */
	public void setShippingCarrier(ShippingCarrierCodeType shippingCarrier) {
	    this.shippingCarrier = shippingCarrier;
	}
	/**
     * public getter
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