// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package ebay.apis.eblbasecomponents;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;

/**
 * 
 * This type is deprecated because the calls that use it are deprected.
 * 
 * 
 */
public class XSLFileType implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element(name = "FileName")
	private String fileName;
	
	@Element(name = "FileVersion")
	private String fileVersion;
	
	@Element(name = "FileContent")
	private String fileContent;
	
    
	/**
     * public getter
     *
     * 
     * 
     * The name of the XSL file. Store this information to use it
     * as input to the call in the future.
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
     * The name of the XSL file. Store this information to use it
     * as input to the call in the future.
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
     * The version number of the XSL file. Store this information to use it
     * as input to the call in the future. To get the current version value without
     * retrieving the XSL file, do not pass DetailLevel in the request.
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
     * The version number of the XSL file. Store this information to use it
     * as input to the call in the future. To get the current version value without
     * retrieving the XSL file, do not pass DetailLevel in the request.
     * 
     *
     * @param java.lang.String
	 */
	public void setFileVersion(String fileVersion) {
	    this.fileVersion = fileVersion;
	}
	/**
     * public getter
     *
     * 
     * 
     * Contains a MIME base-64-encoded representation of the XSL file.
     * See the eBay Web Services Guide for information on decoding
     * the XSL stylesheet file. If no XSL file is available (or if you passed no detail level),
     * this property is empty or not returned.
     * 
     *
     * @returns java.lang.String
	 */
	public String getFileContent() {
	    return this.fileContent;
	}
	
	/**
	 * public setter
	 *
     * 
     * 
     * Contains a MIME base-64-encoded representation of the XSL file.
     * See the eBay Web Services Guide for information on decoding
     * the XSL stylesheet file. If no XSL file is available (or if you passed no detail level),
     * this property is empty or not returned.
     * 
     *
     * @param java.lang.String
	 */
	public void setFileContent(String fileContent) {
	    this.fileContent = fileContent;
	}

}