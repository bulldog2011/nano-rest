// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package ebay.apis.eblbasecomponents;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;
import java.util.List;

/**
 *  
 *       (out) Contains a list of tips on improving a listing's details, if any. 
 * 
 */
public class ListingTipArrayType implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element(name = "ListingTip")
	private List<ListingTipType> listingTip;
	
    
	/**
     * public getter
     *
     * 
     * An individual tip on improving a listing's details. 
     * 
     *
     * @returns java.util.List<ebay.apis.eblbasecomponents.ListingTipType>
	 */
	public List<ListingTipType> getListingTip() {
	    return this.listingTip;
	}
	
	/**
	 * public setter
	 *
     * 
     * An individual tip on improving a listing's details. 
     * 
     *
     * @param java.util.List<ebay.apis.eblbasecomponents.ListingTipType>
	 */
	public void setListingTip(List<ListingTipType> listingTip) {
	    this.listingTip = listingTip;
	}

}