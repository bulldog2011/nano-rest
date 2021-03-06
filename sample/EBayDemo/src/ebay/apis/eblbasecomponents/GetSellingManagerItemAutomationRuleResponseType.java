// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package ebay.apis.eblbasecomponents;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;

/**
 * 
 * Contains the set of automation rules associated with the specified item.
 * 
 */
@RootElement(name = "GetSellingManagerItemAutomationRuleResponse", namespace = "urn:ebay:apis:eBLBaseComponents")
public class GetSellingManagerItemAutomationRuleResponseType extends AbstractResponseType implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element(name = "AutomatedListingRule")
	private SellingManagerAutoListType automatedListingRule;
	
	@Element(name = "AutomatedRelistingRule")
	private SellingManagerAutoRelistType automatedRelistingRule;
	
	@Element(name = "AutomatedSecondChanceOfferRule")
	private SellingManagerAutoSecondChanceOfferType automatedSecondChanceOfferRule;
	
	@Element(name = "Fees")
	private FeesType fees;
	
    
	/**
     * public getter
     *
     * 
     * The information for the automated listing rule associated with the item.
     * This field is only returned if the item was listed from a template. 
     * The value in this field refers to that template's automated listing rule.
     * 
     *
     * @returns ebay.apis.eblbasecomponents.SellingManagerAutoListType
	 */
	public SellingManagerAutoListType getAutomatedListingRule() {
	    return this.automatedListingRule;
	}
	
	/**
	 * public setter
	 *
     * 
     * The information for the automated listing rule associated with the item.
     * This field is only returned if the item was listed from a template. 
     * The value in this field refers to that template's automated listing rule.
     * 
     *
     * @param ebay.apis.eblbasecomponents.SellingManagerAutoListType
	 */
	public void setAutomatedListingRule(SellingManagerAutoListType automatedListingRule) {
	    this.automatedListingRule = automatedListingRule;
	}
	/**
     * public getter
     *
     * 
     * The information for the automated relisting rule associated with the item.
     * 
     *
     * @returns ebay.apis.eblbasecomponents.SellingManagerAutoRelistType
	 */
	public SellingManagerAutoRelistType getAutomatedRelistingRule() {
	    return this.automatedRelistingRule;
	}
	
	/**
	 * public setter
	 *
     * 
     * The information for the automated relisting rule associated with the item.
     * 
     *
     * @param ebay.apis.eblbasecomponents.SellingManagerAutoRelistType
	 */
	public void setAutomatedRelistingRule(SellingManagerAutoRelistType automatedRelistingRule) {
	    this.automatedRelistingRule = automatedRelistingRule;
	}
	/**
     * public getter
     *
     * 
     * The information for the automated second chance offer rule associated with the item.
     * 
     *
     * @returns ebay.apis.eblbasecomponents.SellingManagerAutoSecondChanceOfferType
	 */
	public SellingManagerAutoSecondChanceOfferType getAutomatedSecondChanceOfferRule() {
	    return this.automatedSecondChanceOfferRule;
	}
	
	/**
	 * public setter
	 *
     * 
     * The information for the automated second chance offer rule associated with the item.
     * 
     *
     * @param ebay.apis.eblbasecomponents.SellingManagerAutoSecondChanceOfferType
	 */
	public void setAutomatedSecondChanceOfferRule(SellingManagerAutoSecondChanceOfferType automatedSecondChanceOfferRule) {
	    this.automatedSecondChanceOfferRule = automatedSecondChanceOfferRule;
	}
	/**
     * public getter
     *
     * 
     * Contains fees that may be incurred when items are listed using the 
     * automation rule (e.g., a scheduled listing fee). Use of an automation rule 
     * does not in itself have a fee, but use can result in a fee.
     * 
     *
     * @returns ebay.apis.eblbasecomponents.FeesType
	 */
	public FeesType getFees() {
	    return this.fees;
	}
	
	/**
	 * public setter
	 *
     * 
     * Contains fees that may be incurred when items are listed using the 
     * automation rule (e.g., a scheduled listing fee). Use of an automation rule 
     * does not in itself have a fee, but use can result in a fee.
     * 
     *
     * @param ebay.apis.eblbasecomponents.FeesType
	 */
	public void setFees(FeesType fees) {
	    this.fees = fees;
	}

}