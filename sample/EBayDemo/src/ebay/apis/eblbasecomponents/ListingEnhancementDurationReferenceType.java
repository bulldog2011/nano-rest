// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package ebay.apis.eblbasecomponents;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;
import java.util.List;

/**
 * 
 * A container node for a set of durations that apply to a certain listing enhancements.
 * 
 */
public class ListingEnhancementDurationReferenceType implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element(name = "Duration")
	private List<String> duration;
	
    
	/**
     * public getter
     *
     * 
     * Specifies a length of time that a listing enhancement can be used for a listing.
     * The value Lifetime means the listing enhancment occurs for the lifetime of the listing.
     * Instances of durations other than Lifetime can be purchased multiple times
     * while the listing is active.
     * 
     *
     * @returns java.util.List<java.lang.String>
	 */
	public List<String> getDuration() {
	    return this.duration;
	}
	
	/**
	 * public setter
	 *
     * 
     * Specifies a length of time that a listing enhancement can be used for a listing.
     * The value Lifetime means the listing enhancment occurs for the lifetime of the listing.
     * Instances of durations other than Lifetime can be purchased multiple times
     * while the listing is active.
     * 
     *
     * @param java.util.List<java.lang.String>
	 */
	public void setDuration(List<String> duration) {
	    this.duration = duration;
	}

}