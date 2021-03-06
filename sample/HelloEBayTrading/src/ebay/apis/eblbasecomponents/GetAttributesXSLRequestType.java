// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package ebay.apis.eblbasecomponents;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;

/**
 * 
 * This type is deprecated as the call is no longer available.
 * 
 * 
 */
@RootElement(name = "GetAttributesXSLRequest", namespace = "urn:ebay:apis:eBLBaseComponents")
public class GetAttributesXSLRequestType extends AbstractRequestType implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element(name = "FileName")
	private String fileName;
	
	@Element(name = "FileVersion")
	private String fileVersion;
	
    
	/**
     * public getter
     *
     * 
     * 
     * The name of the XSL file to retrieve. If not specified, the call
     * returns the latest versions of all available XSL files.
     * FileName is an optional input. Valid values<br>
     * <br>
     *                   syi_attributes.xsl
     * 
     *
     * @returns java.lang.String
	 */
	public String getFileName() {
	    return this.fileName;
	}
	
	/**
	 * public setter
	 *
     * 
     * 
     * The name of the XSL file to retrieve. If not specified, the call
     * returns the latest versions of all available XSL files.
     * FileName is an optional input. Valid values<br>
     * <br>
     *                   syi_attributes.xsl
     * 
     *
     * @param java.lang.String
	 */
	public void setFileName(String fileName) {
	    this.fileName = fileName;
	}
	/**
     * public getter
     *
     * 
     * 
     * The desired version of the XSL file. Required if FileName is specified.
     * If not specified, the call returns the latest version of the file.
     * (This is not a filter for retrieving changes to the XSL file.)
     * 
     *
     * @returns java.lang.String
	 */
	public String getFileVersion() {
	    return this.fileVersion;
	}
	
	/**
	 * public setter
	 *
     * 
     * 
     * The desired version of the XSL file. Required if FileName is specified.
     * If not specified, the call returns the latest version of the file.
     * (This is not a filter for retrieving changes to the XSL file.)
     * 
     *
     * @param java.lang.String
	 */
	public void setFileVersion(String fileVersion) {
	    this.fileVersion = fileVersion;
	}

}