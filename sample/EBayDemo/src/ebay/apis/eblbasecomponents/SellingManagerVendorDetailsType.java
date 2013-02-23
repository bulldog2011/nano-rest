// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package ebay.apis.eblbasecomponents;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;

/**
 * Describes vendor information.
 */
public class SellingManagerVendorDetailsType implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element(name = "VendorName")
	private String vendorName;
	
	@Element(name = "VendorContactInfo")
	private String vendorContactInfo;
	
    
	/**
     * public getter
     *
     * 
     * Primary vendor name. Vendor information is returned only if it has been set. 
     * 
     *
     * @returns java.lang.String
	 */
	public String getVendorName() {
	    return this.vendorName;
	}
	
	/**
	 * public setter
	 *
     * 
     * Primary vendor name. Vendor information is returned only if it has been set. 
     * 
     *
     * @param java.lang.String
	 */
	public void setVendorName(String vendorName) {
	    this.vendorName = vendorName;
	}
	/**
     * public getter
     *
     * 
     * Contact information of vendor. Vendor information is returned only if it has been set. 
     * 
     *
     * @returns java.lang.String
	 */
	public String getVendorContactInfo() {
	    return this.vendorContactInfo;
	}
	
	/**
	 * public setter
	 *
     * 
     * Contact information of vendor. Vendor information is returned only if it has been set. 
     * 
     *
     * @param java.lang.String
	 */
	public void setVendorContactInfo(String vendorContactInfo) {
	    this.vendorContactInfo = vendorContactInfo;
	}

}