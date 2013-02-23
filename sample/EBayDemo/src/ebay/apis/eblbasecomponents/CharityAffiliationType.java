// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package ebay.apis.eblbasecomponents;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;

/**
 * 
 *  Defines the affiliation status for a nonprofit charity organization registered with the dedicated eBay Giving Works provider.
 * 
 */
public class CharityAffiliationType implements Serializable {

    private static final long serialVersionUID = -1L;

	@Attribute  
	private String id;
	
	@Attribute  
	private CharityAffiliationTypeCodeType type;
	
    
	/**
	 * public getter
	 *
     * @returns java.lang.String
	 */
	public String getId() {
	    return this.id;
	}
	
	/**
	 * public setter
	 *
     * @param java.lang.String
	 */
	public void setId(String id) {
	    this.id = id;
	}
	/**
	 * public getter
	 *
     * @returns ebay.apis.eblbasecomponents.CharityAffiliationTypeCodeType
	 */
	public CharityAffiliationTypeCodeType getType() {
	    return this.type;
	}
	
	/**
	 * public setter
	 *
     * @param ebay.apis.eblbasecomponents.CharityAffiliationTypeCodeType
	 */
	public void setType(CharityAffiliationTypeCodeType type) {
	    this.type = type;
	}

}