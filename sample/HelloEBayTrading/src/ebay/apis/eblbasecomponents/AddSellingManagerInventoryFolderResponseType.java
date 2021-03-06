// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package ebay.apis.eblbasecomponents;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;

/**
 * 
 * Returns the status of an add folder operation.
 * 
 */
@RootElement(name = "AddSellingManagerInventoryFolderResponse", namespace = "urn:ebay:apis:eBLBaseComponents")
public class AddSellingManagerInventoryFolderResponseType extends AbstractResponseType implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element(name = "FolderID")
	private Long folderID;
	
    
	/**
     * public getter
     *
     * 
     * New ID of the folder newly created in the user's Selling Manager account.
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
     * New ID of the folder newly created in the user's Selling Manager account.
     * 
     *
     * @param java.lang.Long
	 */
	public void setFolderID(Long folderID) {
	    this.folderID = folderID;
	}

}