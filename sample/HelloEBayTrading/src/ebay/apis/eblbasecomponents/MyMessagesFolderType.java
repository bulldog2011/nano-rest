// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package ebay.apis.eblbasecomponents;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;

/**
 * 
 * Details relating to a My Messages folder.
 * 
 */
public class MyMessagesFolderType implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element(name = "FolderID")
	private Long folderID;
	
	@Element(name = "FolderName")
	private String folderName;
	
    
	/**
     * public getter
     *
     * 
     * An ID that uniquely identifies a My Messages folder.
     * 
     *
     * @returns java.lang.Long
	 */
	public Long getFolderID() {
	    return this.folderID;
	}
	
	/**
	 * public setter
	 *
     * 
     * An ID that uniquely identifies a My Messages folder.
     * 
     *
     * @param java.lang.Long
	 */
	public void setFolderID(Long folderID) {
	    this.folderID = folderID;
	}
	/**
     * public getter
     *
     * 
     * The name of a specified My Messages folder.
     * 
     *
     * @returns java.lang.String
	 */
	public String getFolderName() {
	    return this.folderName;
	}
	
	/**
	 * public setter
	 *
     * 
     * The name of a specified My Messages folder.
     * 
     *
     * @param java.lang.String
	 */
	public void setFolderName(String folderName) {
	    this.folderName = folderName;
	}

}