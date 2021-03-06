// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package ebay.apis.eblbasecomponents;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;
import java.util.List;

/**
 * 
 * A container node for sets of durations, each set describing the durations allowed for
 * one listing type.
 * 
 */
public class ListingDurationDefinitionsType implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element(name = "ListingDuration")
	private List<ListingDurationDefinitionType> listingDuration;
	
	@Attribute(name = "Version")
	private Integer version;
	
    
	/**
     * public getter
     *
     * 
     * Contains the duration periods that apply to a certain listing type.
     * 
     *
     * @returns java.util.List<ebay.apis.eblbasecomponents.ListingDurationDefinitionType>
	 */
	public List<ListingDurationDefinitionType> getListingDuration() {
	    return this.listingDuration;
	}
	
	/**
	 * public setter
	 *
     * 
     * Contains the duration periods that apply to a certain listing type.
     * 
     *
     * @param java.util.List<ebay.apis.eblbasecomponents.ListingDurationDefinitionType>
	 */
	public void setListingDuration(List<ListingDurationDefinitionType> listingDuration) {
	    this.listingDuration = listingDuration;
	}
	/**
	 * public getter
	 *
     * @returns java.lang.Integer
	 */
	public Integer getVersion() {
	    return this.version;
	}
	
	/**
	 * public setter
	 *
     * @param java.lang.Integer
	 */
	public void setVersion(Integer version) {
	    this.version = version;
	}

}