// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.ebay.marketplace.search.v1.services;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;

/**
 * 
 * This is the base request container for all Finding Service operations.
 * 
 */
public abstract class BestMatchFindingServiceRequest extends BaseServiceRequest implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element
	private PaginationInput paginationInput;
	
	@Element
	private String buyerPostalCode;
	
	@Element
	private Affiliate affiliate;
	
    
	/**
     * public getter
     *
     * 
     * Controls the pagination of the result set. Child elements specify the
     * maximum number of item listings to return per call and the page of
     * data to return. Controls the number of listings returned in the
     * response, but does not specify the details to return for each
     * listing.
     * <br><br>
     * <span class="tablenote"><strong>Note:</strong>
     * No more than 10,000 items can be retrieved for a given search,
     * regardless of how many matches are found. This limit is enforced
     * by the maximum page number allowed (100) and the maximum entries per
     * page allowed (100). </span>
     * 
     *
     * @returns com.ebay.marketplace.search.v1.services.PaginationInput
	 */
	public PaginationInput getPaginationInput() {
	    return this.paginationInput;
	}
	
	/**
	 * public setter
	 *
     * 
     * Controls the pagination of the result set. Child elements specify the
     * maximum number of item listings to return per call and the page of
     * data to return. Controls the number of listings returned in the
     * response, but does not specify the details to return for each
     * listing.
     * <br><br>
     * <span class="tablenote"><strong>Note:</strong>
     * No more than 10,000 items can be retrieved for a given search,
     * regardless of how many matches are found. This limit is enforced
     * by the maximum page number allowed (100) and the maximum entries per
     * page allowed (100). </span>
     * 
     *
     * @param com.ebay.marketplace.search.v1.services.PaginationInput
	 */
	public void setPaginationInput(PaginationInput paginationInput) {
	    this.paginationInput = paginationInput;
	}
	/**
     * public getter
     *
     * 
     * The postal code of the buyer. This is used as the basis for proximity
     * searches as well as local searches.
     * <br><br>
     * A proximity search requires <b
     * class="con">buyerPostalCode</b> and a <b
     * class="con">MaxDistance</b> item filter.
     * A local search requires <b
     * class="con">buyerPostalCode</b> and item filters for <b
     * class="con">MaxDistance</b> and <b
     * class="con">LocalSearch</b>.
     * 
     *
     * @returns java.lang.String
	 */
	public String getBuyerPostalCode() {
	    return this.buyerPostalCode;
	}
	
	/**
	 * public setter
	 *
     * 
     * The postal code of the buyer. This is used as the basis for proximity
     * searches as well as local searches.
     * <br><br>
     * A proximity search requires <b
     * class="con">buyerPostalCode</b> and a <b
     * class="con">MaxDistance</b> item filter.
     * A local search requires <b
     * class="con">buyerPostalCode</b> and item filters for <b
     * class="con">MaxDistance</b> and <b
     * class="con">LocalSearch</b>.
     * 
     *
     * @param java.lang.String
	 */
	public void setBuyerPostalCode(String buyerPostalCode) {
	    this.buyerPostalCode = buyerPostalCode;
	}
	/**
     * public getter
     *
     * 
     * Container for affiliate details. eBay uses the specified affiliate
     * information to build a View Item URL and Product URL string with
     * correctly formatted affiliate tracking information, which it returns
     * in the response. You can publish these URLs, and if a user clicks
     * them to access eBay, the respective affiliate might get a commission,
     * depending on the user's actions.
     * 
     *
     * @returns com.ebay.marketplace.search.v1.services.Affiliate
	 */
	public Affiliate getAffiliate() {
	    return this.affiliate;
	}
	
	/**
	 * public setter
	 *
     * 
     * Container for affiliate details. eBay uses the specified affiliate
     * information to build a View Item URL and Product URL string with
     * correctly formatted affiliate tracking information, which it returns
     * in the response. You can publish these URLs, and if a user clicks
     * them to access eBay, the respective affiliate might get a commission,
     * depending on the user's actions.
     * 
     *
     * @param com.ebay.marketplace.search.v1.services.Affiliate
	 */
	public void setAffiliate(Affiliate affiliate) {
	    this.affiliate = affiliate;
	}

}