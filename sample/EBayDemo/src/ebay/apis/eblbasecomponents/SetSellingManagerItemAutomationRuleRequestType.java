// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package ebay.apis.eblbasecomponents;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;

/**
 * 
 * Revises, or adds to, the set of Selling Manager automation
 * rules associated with an item.
 * <br>
 * <br>
 * This call is subject to change without notice; the
 * deprecation process is inapplicable to this call.
 * <br>
 * <br>
 * Using this call, you can add an autolist rule.
 * You also can add a second chance offer
 * rule (restricted to auction items and auction templates).
 * Note that autorelist rules can only be set on templates.
 * An autorelist rule for an item is inherited from a template.
 * <br>
 * <br>
 * This call also enables you to specify particular information about automation
 * rules.
 * <br>
 * <br>
 * If a node is not passed in the call, the setting for the corresponding
 * automation rule remains unchanged.
 * <br>
 * <br>
 * Although this call can revise (overwrite) an existing rule,
 * this call cannot delete an automation rule.
 * (Instead, use DeleteSellingManagerItemAutomationRule.)
 * 
 */
@RootElement(name = "SetSellingManagerItemAutomationRuleRequest", namespace = "urn:ebay:apis:eBLBaseComponents")
public class SetSellingManagerItemAutomationRuleRequestType extends AbstractRequestType implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element(name = "ItemID")
	private String itemID;
	
	@Element(name = "AutomatedRelistingRule")
	private SellingManagerAutoRelistType automatedRelistingRule;
	
	@Element(name = "AutomatedSecondChanceOfferRule")
	private SellingManagerAutoSecondChanceOfferType automatedSecondChanceOfferRule;
	
    
	/**
     * public getter
     *
     * 
     * The item ID whose automation rules you want to change.
     * 
     *
     * @returns java.lang.String
	 */
	public String getItemID() {
	    return this.itemID;
	}
	
	/**
	 * public setter
	 *
     * 
     * The item ID whose automation rules you want to change.
     * 
     *
     * @param java.lang.String
	 */
	public void setItemID(String itemID) {
	    this.itemID = itemID;
	}
	/**
     * public getter
     *
     * 
     * The information for the automated relisting rule to be associated with the item.
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
     * The information for the automated relisting rule to be associated with the item.
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
     * The information for the automated second chance offer rule to be associated with the item.
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
     * The information for the automated second chance offer rule to be associated with the item.
     * 
     *
     * @param ebay.apis.eblbasecomponents.SellingManagerAutoSecondChanceOfferType
	 */
	public void setAutomatedSecondChanceOfferRule(SellingManagerAutoSecondChanceOfferType automatedSecondChanceOfferRule) {
	    this.automatedSecondChanceOfferRule = automatedSecondChanceOfferRule;
	}

}