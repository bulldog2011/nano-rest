// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package ebay.apis.eblbasecomponents;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;
import java.util.List;

/**
 * 
 * Container for a list of search result items. Can contain zero, one, or multiple
 * WantItNowPostType objects, each of which contains data for a single Want It Now
 * post found by the search.
 * 
 */
public class WantItNowPostArrayType implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element(name = "WantItNowPost")
	private List<WantItNowPostType> wantItNowPost;
	
    
	/**
     * public getter
     *
     * 
     * Contains data for a Want It Now post found by a search.
     * 
     *
     * @returns java.util.List<ebay.apis.eblbasecomponents.WantItNowPostType>
	 */
	public List<WantItNowPostType> getWantItNowPost() {
	    return this.wantItNowPost;
	}
	
	/**
	 * public setter
	 *
     * 
     * Contains data for a Want It Now post found by a search.
     * 
     *
     * @param java.util.List<ebay.apis.eblbasecomponents.WantItNowPostType>
	 */
	public void setWantItNowPost(List<WantItNowPostType> wantItNowPost) {
	    this.wantItNowPost = wantItNowPost;
	}

}