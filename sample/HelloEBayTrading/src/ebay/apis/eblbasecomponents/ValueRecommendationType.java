// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package ebay.apis.eblbasecomponents;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;

/**
 * 
 * Defines details about recommended values for custom Item Specifics.
 * 
 */
public class ValueRecommendationType implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element(name = "Value")
	private String value;
	
	@Element(name = "ValidationRules")
	private RecommendationValidationRulesType validationRules;
	
    
	/**
     * public getter
     *
     * 
     * A recommended value for the Item Specific. Only returned when 
     * a recommended value is available.
     * 
     *
     * @returns java.lang.String
	 */
	public String getValue() {
	    return this.value;
	}
	
	/**
	 * public setter
	 *
     * 
     * A recommended value for the Item Specific. Only returned when 
     * a recommended value is available.
     * 
     *
     * @param java.lang.String
	 */
	public void setValue(String value) {
	    this.value = value;
	}
	/**
     * public getter
     *
     * 
     * Constraints that eBay places on this Item Specific value.<br>
     * <br>
     * Only returned when you configure your request to include 
     * relationships and/or confidence, and a recommended value 
     * is available. 
     * (Not returned when ExcludeRelationships is true and 
     * IncludeConfidence is false.)
     * 
     *
     * @returns ebay.apis.eblbasecomponents.RecommendationValidationRulesType
	 */
	public RecommendationValidationRulesType getValidationRules() {
	    return this.validationRules;
	}
	
	/**
	 * public setter
	 *
     * 
     * Constraints that eBay places on this Item Specific value.<br>
     * <br>
     * Only returned when you configure your request to include 
     * relationships and/or confidence, and a recommended value 
     * is available. 
     * (Not returned when ExcludeRelationships is true and 
     * IncludeConfidence is false.)
     * 
     *
     * @param ebay.apis.eblbasecomponents.RecommendationValidationRulesType
	 */
	public void setValidationRules(RecommendationValidationRulesType validationRules) {
	    this.validationRules = validationRules;
	}

}