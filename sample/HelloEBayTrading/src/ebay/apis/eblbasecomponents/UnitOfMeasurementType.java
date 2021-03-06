// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package ebay.apis.eblbasecomponents;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;
import java.util.List;

/**
 * 
 * Provides a mapping between suggested unit of measure strings and
 * other, less popular strings.
 * 
 */
public class UnitOfMeasurementType implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element(name = "AlternateText")
	private List<String> alternateText;
	
	@Element(name = "SuggestedText")
	private String suggestedText;
	
    
	/**
     * public getter
     *
     * 
     * A synonym for the unit of measure (such as a fully spelled out name
     * like "inches" instead of the standard abbreviation).
     * This can be used to help a seller map unit names they use in their
     * own catalog to unit names that are more popular on eBay.
     * 
     *
     * @returns java.util.List<java.lang.String>
	 */
	public List<String> getAlternateText() {
	    return this.alternateText;
	}
	
	/**
	 * public setter
	 *
     * 
     * A synonym for the unit of measure (such as a fully spelled out name
     * like "inches" instead of the standard abbreviation).
     * This can be used to help a seller map unit names they use in their
     * own catalog to unit names that are more popular on eBay.
     * 
     *
     * @param java.util.List<java.lang.String>
	 */
	public void setAlternateText(List<String> alternateText) {
	    this.alternateText = alternateText;
	}
	/**
     * public getter
     *
     * 
     * The preferred way to specify a given unit of measure name, such as
     * "in." (instead of "inches" or the " (double quote) symbol).
     * 
     *
     * @returns java.lang.String
	 */
	public String getSuggestedText() {
	    return this.suggestedText;
	}
	
	/**
	 * public setter
	 *
     * 
     * The preferred way to specify a given unit of measure name, such as
     * "in." (instead of "inches" or the " (double quote) symbol).
     * 
     *
     * @param java.lang.String
	 */
	public void setSuggestedText(String suggestedText) {
	    this.suggestedText = suggestedText;
	}

}