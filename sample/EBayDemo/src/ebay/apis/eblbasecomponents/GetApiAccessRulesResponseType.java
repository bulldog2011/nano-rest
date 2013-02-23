// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package ebay.apis.eblbasecomponents;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;
import java.util.List;

/**
 * 
 * Responds to a call to GetApiAccessRules.
 * 
 */
@RootElement(name = "GetApiAccessRulesResponse", namespace = "urn:ebay:apis:eBLBaseComponents")
public class GetApiAccessRulesResponseType extends AbstractResponseType implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element(name = "ApiAccessRule")
	private List<ApiAccessRuleType> apiAccessRule;
	
    
	/**
     * public getter
     *
     * 
     * Contains the description of an API access rule, including the
     * call name, the application's current daily and hourly usage,
     * and other values.
     * 
     *
     * @returns java.util.List<ebay.apis.eblbasecomponents.ApiAccessRuleType>
	 */
	public List<ApiAccessRuleType> getApiAccessRule() {
	    return this.apiAccessRule;
	}
	
	/**
	 * public setter
	 *
     * 
     * Contains the description of an API access rule, including the
     * call name, the application's current daily and hourly usage,
     * and other values.
     * 
     *
     * @param java.util.List<ebay.apis.eblbasecomponents.ApiAccessRuleType>
	 */
	public void setApiAccessRule(List<ApiAccessRuleType> apiAccessRule) {
	    this.apiAccessRule = apiAccessRule;
	}

}