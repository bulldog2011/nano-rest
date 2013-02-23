// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package ebay.apis.eblbasecomponents;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;
import java.util.List;

/**
 * 
 * Set of Store logos.
 * 
 */
public class StoreLogoArrayType implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element(name = "Logo")
	private List<StoreLogoType> logo;
	
    
	/**
     * public getter
     *
     * 
     * A Store logo.
     * 
     *
     * @returns java.util.List<ebay.apis.eblbasecomponents.StoreLogoType>
	 */
	public List<StoreLogoType> getLogo() {
	    return this.logo;
	}
	
	/**
	 * public setter
	 *
     * 
     * A Store logo.
     * 
     *
     * @param java.util.List<ebay.apis.eblbasecomponents.StoreLogoType>
	 */
	public void setLogo(List<StoreLogoType> logo) {
	    this.logo = logo;
	}

}