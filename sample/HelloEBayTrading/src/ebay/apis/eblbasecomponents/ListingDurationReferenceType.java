// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package ebay.apis.eblbasecomponents;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;

/**
 * 
 * Identifies the type of listing as an attribute on the ListingDuration node.
 * 
 */
public class ListingDurationReferenceType implements Serializable {

    private static final long serialVersionUID = -1L;

	@Value
	private int value;
	
	@Attribute  
	private ListingTypeCodeType type;
	
    
	/**
	 * public getter
	 *
     * @returns .int
	 */
	public int getValue() {
	    return this.value;
	}
	
	/**
	 * public setter
	 *
     * @param .int
	 */
	public void setValue(int value) {
	    this.value = value;
	}
	/**
	 * public getter
	 *
     * @returns ebay.apis.eblbasecomponents.ListingTypeCodeType
	 */
	public ListingTypeCodeType getType() {
	    return this.type;
	}
	
	/**
	 * public setter
	 *
     * @param ebay.apis.eblbasecomponents.ListingTypeCodeType
	 */
	public void setType(ListingTypeCodeType type) {
	    this.type = type;
	}

}