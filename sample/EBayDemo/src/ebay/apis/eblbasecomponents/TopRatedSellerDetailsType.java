// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package ebay.apis.eblbasecomponents;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;
import java.util.List;

/**
 * 
 * Container for top-rated seller program information.
 * 
 */
public class TopRatedSellerDetailsType implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element(name = "TopRatedProgram")
	private List<TopRatedProgramCodeType> topRatedProgram;
	
    
	/**
     * public getter
     *
     * 
     * Top-rated seller program details for the seller. Returned when the seller is qualified as a top-rated seller.
     * 
     *
     * @returns java.util.List<ebay.apis.eblbasecomponents.TopRatedProgramCodeType>
	 */
	public List<TopRatedProgramCodeType> getTopRatedProgram() {
	    return this.topRatedProgram;
	}
	
	/**
	 * public setter
	 *
     * 
     * Top-rated seller program details for the seller. Returned when the seller is qualified as a top-rated seller.
     * 
     *
     * @param java.util.List<ebay.apis.eblbasecomponents.TopRatedProgramCodeType>
	 */
	public void setTopRatedProgram(List<TopRatedProgramCodeType> topRatedProgram) {
	    this.topRatedProgram = topRatedProgram;
	}

}