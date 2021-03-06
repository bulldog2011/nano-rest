// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package ebay.apis.eblbasecomponents;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;

/**
 * 
 * This type is deprecated as <b>GetProduct*</b> calls were deprecated.
 * 
 * 
 */
public class ProductFinderConstraintType implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element(name = "DisplayName")
	private String displayName;
	
	@Element(name = "DisplayValue")
	private String displayValue;
	
    
	/**
     * public getter
     *
     * 
     * 
     * The search attribute name (e.g., Manufacturer).
     * 
     *
     * @returns java.lang.String
	 */
	public String getDisplayName() {
	    return this.displayName;
	}
	
	/**
	 * public setter
	 *
     * 
     * 
     * The search attribute name (e.g., Manufacturer).
     * 
     *
     * @param java.lang.String
	 */
	public void setDisplayName(String displayName) {
	    this.displayName = displayName;
	}
	/**
     * public getter
     *
     * 
     * 
     * The search attribute value the user specified in the query
     * (e.g., the actual name the user chose for the manufacturer).
     * 
     *
     * @returns java.lang.String
	 */
	public String getDisplayValue() {
	    return this.displayValue;
	}
	
	/**
	 * public setter
	 *
     * 
     * 
     * The search attribute value the user specified in the query
     * (e.g., the actual name the user chose for the manufacturer).
     * 
     *
     * @param java.lang.String
	 */
	public void setDisplayValue(String displayValue) {
	    this.displayValue = displayValue;
	}

}