// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package ebay.apis.eblbasecomponents;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;
import java.util.List;

/**
 * 
 * A list of one or more ModifyName containers. Each ModifyName container has Name and NewName elements.
 * 
 */
public class ModifyNameArrayType implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element(name = "ModifyName")
	private List<ModifyNameType> modifyName;
	
    
	/**
     * public getter
     *
     * 
     * Container for the current and new name of a variation specific.
     * <br><br>
     * You cannot change the name of required item specifics. Call  GetCategoryFeatures to determine which names are required.
     * 
     *
     * @returns java.util.List<ebay.apis.eblbasecomponents.ModifyNameType>
	 */
	public List<ModifyNameType> getModifyName() {
	    return this.modifyName;
	}
	
	/**
	 * public setter
	 *
     * 
     * Container for the current and new name of a variation specific.
     * <br><br>
     * You cannot change the name of required item specifics. Call  GetCategoryFeatures to determine which names are required.
     * 
     *
     * @param java.util.List<ebay.apis.eblbasecomponents.ModifyNameType>
	 */
	public void setModifyName(List<ModifyNameType> modifyName) {
	    this.modifyName = modifyName;
	}

}