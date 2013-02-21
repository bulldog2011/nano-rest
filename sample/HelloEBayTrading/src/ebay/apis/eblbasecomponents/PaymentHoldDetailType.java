// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package ebay.apis.eblbasecomponents;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;
import java.util.Date;

/**
 * 
 * This type defines the <b>PaymentHoldDetails</b> container, which consists of 
 * information that can assist DE or AT sellers expedite the payout process for orders that 
 * are subject to the new eBay payment process.
 * 
 */
public class PaymentHoldDetailType implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element(name = "ExpectedReleaseDate")
	private Date expectedReleaseDate;
	
	@Element(name = "RequiredSellerActionArray")
	private RequiredSellerActionArrayType requiredSellerActionArray;
	
	@Element(name = "NumOfReqSellerActions")
	private Integer numOfReqSellerActions;
	
    
	/**
     * public getter
     *
     * 
     * Timestamp that indicates the expected date in which eBay will distribute the payout to 
     * the seller's account. This is not a firm date and is subject to change.
     * 
     *
     * @returns java.util.Date
	 */
	public Date getExpectedReleaseDate() {
	    return this.expectedReleaseDate;
	}
	
	/**
	 * public setter
	 *
     * 
     * Timestamp that indicates the expected date in which eBay will distribute the payout to 
     * the seller's account. This is not a firm date and is subject to change.
     * 
     *
     * @param java.util.Date
	 */
	public void setExpectedReleaseDate(Date expectedReleaseDate) {
	    this.expectedReleaseDate = expectedReleaseDate;
	}
	/**
     * public getter
     *
     * 
     * Container consisting of one or more <b>RequiredSellerAction</b> fields.
     * <b>RequiredSellerAction</b> fields provide possible actions that a seller can take to
     * expedite the seller payout process.
     * 
     *
     * @returns ebay.apis.eblbasecomponents.RequiredSellerActionArrayType
	 */
	public RequiredSellerActionArrayType getRequiredSellerActionArray() {
	    return this.requiredSellerActionArray;
	}
	
	/**
	 * public setter
	 *
     * 
     * Container consisting of one or more <b>RequiredSellerAction</b> fields.
     * <b>RequiredSellerAction</b> fields provide possible actions that a seller can take to
     * expedite the seller payout process.
     * 
     *
     * @param ebay.apis.eblbasecomponents.RequiredSellerActionArrayType
	 */
	public void setRequiredSellerActionArray(RequiredSellerActionArrayType requiredSellerActionArray) {
	    this.requiredSellerActionArray = requiredSellerActionArray;
	}
	/**
     * public getter
     *
     * 
     * Integer value that indicates the number of possible actions a seller can take to
     * possibly expedite the seller payout process. This value should equal the number of
     * <b>RequiredSellerAction</b> fields contained in the <b>RequiredSellerActionArray</b> container.
     * 
     *
     * @returns java.lang.Integer
	 */
	public Integer getNumOfReqSellerActions() {
	    return this.numOfReqSellerActions;
	}
	
	/**
	 * public setter
	 *
     * 
     * Integer value that indicates the number of possible actions a seller can take to
     * possibly expedite the seller payout process. This value should equal the number of
     * <b>RequiredSellerAction</b> fields contained in the <b>RequiredSellerActionArray</b> container.
     * 
     *
     * @param java.lang.Integer
	 */
	public void setNumOfReqSellerActions(Integer numOfReqSellerActions) {
	    this.numOfReqSellerActions = numOfReqSellerActions;
	}

}