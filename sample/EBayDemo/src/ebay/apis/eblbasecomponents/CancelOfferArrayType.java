// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package ebay.apis.eblbasecomponents;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;
import java.util.List;

/**
 * 
 * Container for a list of offers. May contain zero, one, or multiple
 * OfferType objects, each of which represents one offer extended by
 * a user on a listing.
 * 
 */
public class CancelOfferArrayType implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element(name = "CancelOffer")
	private List<CancelOfferType> cancelOffer;
	
    
	/**
     * public getter
     *
     * 
     * Contains the data for one offer. This includes: data for the user making the
     * offer, the amount of the offer, the quantity of items being bought from the
     * listing, the type of offer being made, and more.
     * 
     *
     * @returns java.util.List<ebay.apis.eblbasecomponents.CancelOfferType>
	 */
	public List<CancelOfferType> getCancelOffer() {
	    return this.cancelOffer;
	}
	
	/**
	 * public setter
	 *
     * 
     * Contains the data for one offer. This includes: data for the user making the
     * offer, the amount of the offer, the quantity of items being bought from the
     * listing, the type of offer being made, and more.
     * 
     *
     * @param java.util.List<ebay.apis.eblbasecomponents.CancelOfferType>
	 */
	public void setCancelOffer(List<CancelOfferType> cancelOffer) {
	    this.cancelOffer = cancelOffer;
	}

}