// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package ebay.apis.eblbasecomponents;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;

/**
 * 
 * This type is deprecated because attributes are deprecated.
 * 
 * 
 */
public class LookupAttributeType implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element(name = "Name")
	private String name;
	
	@Element(name = "Value")
	private String value;
	
    
	/**
     * public getter
     *
     * 
     * 
     * No longer applicable to any category.
     * 
     *
     * @returns java.lang.String
	 */
	public String getName() {
	    return this.name;
	}
	
	/**
	 * public setter
	 *
     * 
     * 
     * No longer applicable to any category.
     * 
     *
     * @param java.lang.String
	 */
	public void setName(String name) {
	    this.name = name;
	}
	/**
     * public getter
     *
     * 
     * 
     *   No longer applicable to any category.
     * 
     *
     * @returns java.lang.String
	 */
	public String getValue() {
	    return this.value;
	}
	
	/**
	 * public setter
	 *
     * 
     * 
     *   No longer applicable to any category.
     * 
     *
     * @param java.lang.String
	 */
	public void setValue(String value) {
	    this.value = value;
	}

}