// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package ebay.apis.eblbasecomponents;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;

/**
 * 
 * A variable that contains specific information about the context of this error.
 * For example, if you pass in an attribute set ID that does not match
 * the specified category, the attribute set ID might be returned as an error parameter.
 * Use error parameters to flag fields that users need to correct.
 * Also use error parameters to distinguish between errors when multiple
 * errors are returned.
 * 
 */
public class ErrorParameterType implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element(name = "Value")
	private String value;
	
	@Attribute(name = "ParamID")
	private String paramID;
	
    
	/**
     * public getter
     *
     * 
     * The value of the variable (e.g., the attribute set ID)
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
     * The value of the variable (e.g., the attribute set ID)
     * 
     *
     * @param java.lang.String
	 */
	public void setValue(String value) {
	    this.value = value;
	}
	/**
	 * public getter
	 *
     * @returns java.lang.String
	 */
	public String getParamID() {
	    return this.paramID;
	}
	
	/**
	 * public setter
	 *
     * @param java.lang.String
	 */
	public void setParamID(String paramID) {
	    this.paramID = paramID;
	}

}