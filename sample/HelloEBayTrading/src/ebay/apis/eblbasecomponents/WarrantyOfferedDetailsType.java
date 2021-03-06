// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package ebay.apis.eblbasecomponents;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;

public class WarrantyOfferedDetailsType implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element(name = "WarrantyOfferedOption")
	private String warrantyOfferedOption;
	
	@Element(name = "Description")
	private String description;
	
    
	/**
     * public getter
     *
     * 
     * Whether the item includes a warranty.
     * This value can be passed in the AddItem family of calls.
     * 
     *
     * @returns java.lang.String
	 */
	public String getWarrantyOfferedOption() {
	    return this.warrantyOfferedOption;
	}
	
	/**
	 * public setter
	 *
     * 
     * Whether the item includes a warranty.
     * This value can be passed in the AddItem family of calls.
     * 
     *
     * @param java.lang.String
	 */
	public void setWarrantyOfferedOption(String warrantyOfferedOption) {
	    this.warrantyOfferedOption = warrantyOfferedOption;
	}
	/**
     * public getter
     *
     * 
     * Display string that applications can use to present the "warranty offered" options in
     * a more user-friendly format (such as in a drop-down list).
     * Not applicable as input to the AddItem family of calls. (Use WarrantyOfferedOption instead.)
     * 
     *
     * @returns java.lang.String
	 */
	public String getDescription() {
	    return this.description;
	}
	
	/**
	 * public setter
	 *
     * 
     * Display string that applications can use to present the "warranty offered" options in
     * a more user-friendly format (such as in a drop-down list).
     * Not applicable as input to the AddItem family of calls. (Use WarrantyOfferedOption instead.)
     * 
     *
     * @param java.lang.String
	 */
	public void setDescription(String description) {
	    this.description = description;
	}

}