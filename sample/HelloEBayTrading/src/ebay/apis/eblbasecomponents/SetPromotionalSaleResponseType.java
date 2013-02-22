// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package ebay.apis.eblbasecomponents;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;

/**
 * 
 * Contains the ID and status of a promotional sale.
 * The Promotional Price Display feature enables sellers
 * to apply discounts and/or free shipping across many listings.  
 * 
 */
@RootElement(name = "SetPromotionalSaleResponse", namespace = "urn:ebay:apis:eBLBaseComponents")
public class SetPromotionalSaleResponseType extends AbstractResponseType implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element(name = "Status")
	private PromotionalSaleStatusCodeType status;
	
	@Element(name = "PromotionalSaleID")
	private Long promotionalSaleID;
	
    
	/**
     * public getter
     *
     * 
     * Contains the status of a promotional sale.
     * 
     *
     * @returns ebay.apis.eblbasecomponents.PromotionalSaleStatusCodeType
	 */
	public PromotionalSaleStatusCodeType getStatus() {
	    return this.status;
	}
	
	/**
	 * public setter
	 *
     * 
     * Contains the status of a promotional sale.
     * 
     *
     * @param ebay.apis.eblbasecomponents.PromotionalSaleStatusCodeType
	 */
	public void setStatus(PromotionalSaleStatusCodeType status) {
	    this.status = status;
	}
	/**
     * public getter
     *
     * 
     * Contains the ID of a promotional sale.
     * 
     *
     * @returns java.lang.Long
	 */
	public Long getPromotionalSaleID() {
	    return this.promotionalSaleID;
	}
	
	/**
	 * public setter
	 *
     * 
     * Contains the ID of a promotional sale.
     * 
     *
     * @param java.lang.Long
	 */
	public void setPromotionalSaleID(Long promotionalSaleID) {
	    this.promotionalSaleID = promotionalSaleID;
	}

}