// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package ebay.apis.eblbasecomponents;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;

/**
 * 
 * Used for storing an optional reference ID to the binary attachment
 * 
 */
public class Base64BinaryType implements Serializable {

    private static final long serialVersionUID = -1L;

	@Value
	private byte[] value;
	
	@Attribute  
	private String contentType;
	
    
	/**
	 * public getter
	 *
     * @returns .byte[]
	 */
	public byte[] getValue() {
	    return this.value;
	}
	
	/**
	 * public setter
	 *
     * @param .byte[]
	 */
	public void setValue(byte[] value) {
	    this.value = value;
	}
	/**
	 * public getter
	 *
     * @returns java.lang.String
	 */
	public String getContentType() {
	    return this.contentType;
	}
	
	/**
	 * public setter
	 *
     * @param java.lang.String
	 */
	public void setContentType(String contentType) {
	    this.contentType = contentType;
	}

}