// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package ebay.apis.eblbasecomponents;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;

/**
 * 
 * Returns a seller's Ask Seller a Question (ASQ) subjects, each in
 * its own Subject node.
 * 
 */
@RootElement(name = "GetMessagePreferencesRequest", namespace = "urn:ebay:apis:eBLBaseComponents")
public class GetMessagePreferencesRequestType extends AbstractRequestType implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element(name = "SellerID")
	private String sellerID;
	
	@Element(name = "IncludeASQPreferences")
	private Boolean includeASQPreferences;
	
    
	/**
     * public getter
     *
     * 
     * The ID of the user to retrieve ASQ subjects for. This
     * value must be specified in the request, but does not
     * need to be the same user as the user making the
     * request.
     * 
     *
     * @returns java.lang.String
	 */
	public String getSellerID() {
	    return this.sellerID;
	}
	
	/**
	 * public setter
	 *
     * 
     * The ID of the user to retrieve ASQ subjects for. This
     * value must be specified in the request, but does not
     * need to be the same user as the user making the
     * request.
     * 
     *
     * @param java.lang.String
	 */
	public void setSellerID(String sellerID) {
	    this.sellerID = sellerID;
	}
	/**
     * public getter
     *
     * 
     * If true, indicates that the ASQ subjects for the
     * specified user should be returned.
     * 
     *
     * @returns java.lang.Boolean
	 */
	public Boolean getIncludeASQPreferences() {
	    return this.includeASQPreferences;
	}
	
	/**
	 * public setter
	 *
     * 
     * If true, indicates that the ASQ subjects for the
     * specified user should be returned.
     * 
     *
     * @param java.lang.Boolean
	 */
	public void setIncludeASQPreferences(Boolean includeASQPreferences) {
	    this.includeASQPreferences = includeASQPreferences;
	}

}