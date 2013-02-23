// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package ebay.apis.eblbasecomponents;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;

/**
 * 
 * Contains the reason codes for all sites. 
 * 
 */
@RootElement(name = "GetVeROReasonCodeDetailsResponse", namespace = "urn:ebay:apis:eBLBaseComponents")
public class GetVeROReasonCodeDetailsResponseType extends AbstractResponseType implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element(name = "VeROReasonCodeDetails")
	private VeROReasonCodeDetailsType veROReasonCodeDetails;
	
    
	/**
     * public getter
     *
     * 
     * Contains the list of the status codes for a site.
     * 
     *
     * @returns ebay.apis.eblbasecomponents.VeROReasonCodeDetailsType
	 */
	public VeROReasonCodeDetailsType getVeROReasonCodeDetails() {
	    return this.veROReasonCodeDetails;
	}
	
	/**
	 * public setter
	 *
     * 
     * Contains the list of the status codes for a site.
     * 
     *
     * @param ebay.apis.eblbasecomponents.VeROReasonCodeDetailsType
	 */
	public void setVeROReasonCodeDetails(VeROReasonCodeDetailsType veROReasonCodeDetails) {
	    this.veROReasonCodeDetails = veROReasonCodeDetails;
	}

}