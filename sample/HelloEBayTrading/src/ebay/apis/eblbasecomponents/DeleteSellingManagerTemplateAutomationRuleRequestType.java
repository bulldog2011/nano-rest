// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package ebay.apis.eblbasecomponents;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;

/**
 * 
 * Removes the association of Selling Manager automation rules
 * to a template. Returns the remaining rules in the response.
 * This call is subject to change without notice; the
 * deprecation process is inapplicable to this call.
 * 
 */
@RootElement(name = "DeleteSellingManagerTemplateAutomationRuleRequest", namespace = "urn:ebay:apis:eBLBaseComponents")
public class DeleteSellingManagerTemplateAutomationRuleRequestType extends AbstractRequestType implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element(name = "SaleTemplateID")
	private Long saleTemplateID;
	
	@Element(name = "DeleteAutomatedListingRule")
	private Boolean deleteAutomatedListingRule;
	
	@Element(name = "DeleteAutomatedRelistingRule")
	private Boolean deleteAutomatedRelistingRule;
	
	@Element(name = "DeleteAutomatedSecondChanceOfferRule")
	private Boolean deleteAutomatedSecondChanceOfferRule;
	
    
	/**
     * public getter
     *
     * 
     * The ID of the template from which you want to remove automation rules.
     * You can obtain a SaleTemplateID by calling GetSellingManagerInventory.
     * 
     *
     * @returns java.lang.Long
	 */
	public Long getSaleTemplateID() {
	    return this.saleTemplateID;
	}
	
	/**
	 * public setter
	 *
     * 
     * The ID of the template from which you want to remove automation rules.
     * You can obtain a SaleTemplateID by calling GetSellingManagerInventory.
     * 
     *
     * @param java.lang.Long
	 */
	public void setSaleTemplateID(Long saleTemplateID) {
	    this.saleTemplateID = saleTemplateID;
	}
	/**
     * public getter
     *
     * 
     * If true, the automated listing rules are removed from the template.
     * 
     *
     * @returns java.lang.Boolean
	 */
	public Boolean getDeleteAutomatedListingRule() {
	    return this.deleteAutomatedListingRule;
	}
	
	/**
	 * public setter
	 *
     * 
     * If true, the automated listing rules are removed from the template.
     * 
     *
     * @param java.lang.Boolean
	 */
	public void setDeleteAutomatedListingRule(Boolean deleteAutomatedListingRule) {
	    this.deleteAutomatedListingRule = deleteAutomatedListingRule;
	}
	/**
     * public getter
     *
     * 
     * If true, the automated relisting rules are removed from the template.
     * 
     *
     * @returns java.lang.Boolean
	 */
	public Boolean getDeleteAutomatedRelistingRule() {
	    return this.deleteAutomatedRelistingRule;
	}
	
	/**
	 * public setter
	 *
     * 
     * If true, the automated relisting rules are removed from the template.
     * 
     *
     * @param java.lang.Boolean
	 */
	public void setDeleteAutomatedRelistingRule(Boolean deleteAutomatedRelistingRule) {
	    this.deleteAutomatedRelistingRule = deleteAutomatedRelistingRule;
	}
	/**
     * public getter
     *
     * 
     * If true, the automated second chance offer rule is removed from the template.
     * 
     *
     * @returns java.lang.Boolean
	 */
	public Boolean getDeleteAutomatedSecondChanceOfferRule() {
	    return this.deleteAutomatedSecondChanceOfferRule;
	}
	
	/**
	 * public setter
	 *
     * 
     * If true, the automated second chance offer rule is removed from the template.
     * 
     *
     * @param java.lang.Boolean
	 */
	public void setDeleteAutomatedSecondChanceOfferRule(Boolean deleteAutomatedSecondChanceOfferRule) {
	    this.deleteAutomatedSecondChanceOfferRule = deleteAutomatedSecondChanceOfferRule;
	}

}