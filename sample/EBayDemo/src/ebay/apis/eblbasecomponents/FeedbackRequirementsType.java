// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package ebay.apis.eblbasecomponents;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;

public class FeedbackRequirementsType implements Serializable {

    private static final long serialVersionUID = -1L;

	@Value
	private boolean value;
	
	@Attribute  
	private String minimum;
	
    
	/**
	 * public getter
	 *
     * @returns .boolean
	 */
	public boolean getValue() {
	    return this.value;
	}
	
	/**
	 * public setter
	 *
     * @param .boolean
	 */
	public void setValue(boolean value) {
	    this.value = value;
	}
	/**
	 * public getter
	 *
     * @returns java.lang.String
	 */
	public String getMinimum() {
	    return this.minimum;
	}
	
	/**
	 * public setter
	 *
     * @param java.lang.String
	 */
	public void setMinimum(String minimum) {
	    this.minimum = minimum;
	}

}