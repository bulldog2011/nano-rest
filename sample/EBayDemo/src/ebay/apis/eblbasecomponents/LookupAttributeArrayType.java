// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package ebay.apis.eblbasecomponents;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;
import java.util.List;

/**
 * 
 * This type is deprecated because attributes are deprecated.
 * 
 * 
 */
public class LookupAttributeArrayType implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element(name = "LookupAttribute")
	private List<LookupAttributeType> lookupAttribute;
	
    
	/**
     * public getter
     *
     * 
     * 
     * No longer applicable to any category.
     * 
     *
     * @returns java.util.List<ebay.apis.eblbasecomponents.LookupAttributeType>
	 */
	public List<LookupAttributeType> getLookupAttribute() {
	    return this.lookupAttribute;
	}
	
	/**
	 * public setter
	 *
     * 
     * 
     * No longer applicable to any category.
     * 
     *
     * @param java.util.List<ebay.apis.eblbasecomponents.LookupAttributeType>
	 */
	public void setLookupAttribute(List<LookupAttributeType> lookupAttribute) {
	    this.lookupAttribute = lookupAttribute;
	}

}