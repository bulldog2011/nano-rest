// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package ebay.apis.eblbasecomponents;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;
import java.util.List;

/**
 * 
 * Returns a brief summary of the requester's status as an eBay seller. The status
 * information can help an eBay seller monitor their selling performance and keep
 * their account in good standing.
 * 
 */
@RootElement(name = "GetSellerDashboardResponse", namespace = "urn:ebay:apis:eBLBaseComponents")
public class GetSellerDashboardResponseType extends AbstractResponseType implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element(name = "SearchStanding")
	private SearchStandingDashboardType searchStanding;
	
	@Element(name = "SellerFeeDiscount")
	private SellerFeeDiscountDashboardType sellerFeeDiscount;
	
	@Element(name = "PowerSellerStatus")
	private PowerSellerDashboardType powerSellerStatus;
	
	@Element(name = "PolicyCompliance")
	private PolicyComplianceDashboardType policyCompliance;
	
	@Element(name = "BuyerSatisfaction")
	private BuyerSatisfactionDashboardType buyerSatisfaction;
	
	@Element(name = "SellerAccount")
	private SellerAccountDashboardType sellerAccount;
	
	@Element(name = "Performance")
	private List<PerformanceDashboardType> performance;
	
    
	/**
     * public getter
     *
     * 
     * Provides information about the visibility level you have earned for your
     * listings. The higher your search standing rating, the higher your items
     * will be placed in search results sorted by Best Match. Because your search
     * standing rating is directly tied to your customer service record, this
     * rating is an important way that eBay rewards you as a good seller--it
     * encourages you to give buyers the best possible shopping experience.
     * <br><br>
     * This element is not returned for all sites. Beginning at the end of 2009, eBay
     * stopped returning it for sellers registered on several large sites, including
     * the US, German, and UK sites.
     * 
     *
     * @returns ebay.apis.eblbasecomponents.SearchStandingDashboardType
	 */
	public SearchStandingDashboardType getSearchStanding() {
	    return this.searchStanding;
	}
	
	/**
	 * public setter
	 *
     * 
     * Provides information about the visibility level you have earned for your
     * listings. The higher your search standing rating, the higher your items
     * will be placed in search results sorted by Best Match. Because your search
     * standing rating is directly tied to your customer service record, this
     * rating is an important way that eBay rewards you as a good seller--it
     * encourages you to give buyers the best possible shopping experience.
     * <br><br>
     * This element is not returned for all sites. Beginning at the end of 2009, eBay
     * stopped returning it for sellers registered on several large sites, including
     * the US, German, and UK sites.
     * 
     *
     * @param ebay.apis.eblbasecomponents.SearchStandingDashboardType
	 */
	public void setSearchStanding(SearchStandingDashboardType searchStanding) {
	    this.searchStanding = searchStanding;
	}
	/**
     * public getter
     *
     * 
     * Provides information about the PowerSeller discount level you have earned,
     * if any. As a PowerSeller, you can earn discounts on your monthly invoice
     * Final Value Fees based on how well you're rated as a seller. Only returned
     * for members of the eBay US or Canada PowerSeller program.
     * 
     *
     * @returns ebay.apis.eblbasecomponents.SellerFeeDiscountDashboardType
	 */
	public SellerFeeDiscountDashboardType getSellerFeeDiscount() {
	    return this.sellerFeeDiscount;
	}
	
	/**
	 * public setter
	 *
     * 
     * Provides information about the PowerSeller discount level you have earned,
     * if any. As a PowerSeller, you can earn discounts on your monthly invoice
     * Final Value Fees based on how well you're rated as a seller. Only returned
     * for members of the eBay US or Canada PowerSeller program.
     * 
     *
     * @param ebay.apis.eblbasecomponents.SellerFeeDiscountDashboardType
	 */
	public void setSellerFeeDiscount(SellerFeeDiscountDashboardType sellerFeeDiscount) {
	    this.sellerFeeDiscount = sellerFeeDiscount;
	}
	/**
     * public getter
     *
     * 
     * Provides information about your PowerSeller status, such as whether or not
     * you meet the PowerSeller requirements. Your PowerSeller status directly
     * affects your discount (SellerFeeDiscount).
     * <br><br>
     * For eBay Germany and France, you must be a registered business seller to
     * see your PowerSeller status.
     * 
     *
     * @returns ebay.apis.eblbasecomponents.PowerSellerDashboardType
	 */
	public PowerSellerDashboardType getPowerSellerStatus() {
	    return this.powerSellerStatus;
	}
	
	/**
	 * public setter
	 *
     * 
     * Provides information about your PowerSeller status, such as whether or not
     * you meet the PowerSeller requirements. Your PowerSeller status directly
     * affects your discount (SellerFeeDiscount).
     * <br><br>
     * For eBay Germany and France, you must be a registered business seller to
     * see your PowerSeller status.
     * 
     *
     * @param ebay.apis.eblbasecomponents.PowerSellerDashboardType
	 */
	public void setPowerSellerStatus(PowerSellerDashboardType powerSellerStatus) {
	    this.powerSellerStatus = powerSellerStatus;
	}
	/**
     * public getter
     *
     * 
     * Rating on how well you are following eBay rules and policies in your selling
     * practices, and alerts you if your account or listings have any policy
     * violations.
     * <br><br>
     * eBay's policies and rules are guidelines that help to create a safe, fair,
     * and enjoyable trading environment for all eBay members. If you violate
     * certain policies, your account can be restricted without notice. This is true
     * even if your status shows a good level of policy compliance. Because of this,
     * understanding and following eBay's policies can help you to avoid
     * restrictions on your account. Policy compliance directly affects your
     * PowerSeller status.
     * 
     *
     * @returns ebay.apis.eblbasecomponents.PolicyComplianceDashboardType
	 */
	public PolicyComplianceDashboardType getPolicyCompliance() {
	    return this.policyCompliance;
	}
	
	/**
	 * public setter
	 *
     * 
     * Rating on how well you are following eBay rules and policies in your selling
     * practices, and alerts you if your account or listings have any policy
     * violations.
     * <br><br>
     * eBay's policies and rules are guidelines that help to create a safe, fair,
     * and enjoyable trading environment for all eBay members. If you violate
     * certain policies, your account can be restricted without notice. This is true
     * even if your status shows a good level of policy compliance. Because of this,
     * understanding and following eBay's policies can help you to avoid
     * restrictions on your account. Policy compliance directly affects your
     * PowerSeller status.
     * 
     *
     * @param ebay.apis.eblbasecomponents.PolicyComplianceDashboardType
	 */
	public void setPolicyCompliance(PolicyComplianceDashboardType policyCompliance) {
	    this.policyCompliance = policyCompliance;
	}
	/**
     * public getter
     *
     * 
     * Rates your level of customer service. This information helps you to keep
     * track of how well you are providing members with positive buying
     * experiences.
     * <br><br>
     * This element is not returned for all sites. 
     * 
     *
     * @returns ebay.apis.eblbasecomponents.BuyerSatisfactionDashboardType
	 */
	public BuyerSatisfactionDashboardType getBuyerSatisfaction() {
	    return this.buyerSatisfaction;
	}
	
	/**
	 * public setter
	 *
     * 
     * Rates your level of customer service. This information helps you to keep
     * track of how well you are providing members with positive buying
     * experiences.
     * <br><br>
     * This element is not returned for all sites. 
     * 
     *
     * @param ebay.apis.eblbasecomponents.BuyerSatisfactionDashboardType
	 */
	public void setBuyerSatisfaction(BuyerSatisfactionDashboardType buyerSatisfaction) {
	    this.buyerSatisfaction = buyerSatisfaction;
	}
	/**
     * public getter
     *
     * 
     * The status of your latest eBay invoice. Includes any alerts issued to your
     * account to help you identify possible problems.
     * 
     *
     * @returns ebay.apis.eblbasecomponents.SellerAccountDashboardType
	 */
	public SellerAccountDashboardType getSellerAccount() {
	    return this.sellerAccount;
	}
	
	/**
	 * public setter
	 *
     * 
     * The status of your latest eBay invoice. Includes any alerts issued to your
     * account to help you identify possible problems.
     * 
     *
     * @param ebay.apis.eblbasecomponents.SellerAccountDashboardType
	 */
	public void setSellerAccount(SellerAccountDashboardType sellerAccount) {
	    this.sellerAccount = sellerAccount;
	}
	/**
     * public getter
     *
     * 
     * Provides information about the seller's performance within different eBay
     * regions. A seller's performance rating can be Top-Rated, Above Standard,
     * Standard, and Below Standard.
     * 
     *
     * @returns java.util.List<ebay.apis.eblbasecomponents.PerformanceDashboardType>
	 */
	public List<PerformanceDashboardType> getPerformance() {
	    return this.performance;
	}
	
	/**
	 * public setter
	 *
     * 
     * Provides information about the seller's performance within different eBay
     * regions. A seller's performance rating can be Top-Rated, Above Standard,
     * Standard, and Below Standard.
     * 
     *
     * @param java.util.List<ebay.apis.eblbasecomponents.PerformanceDashboardType>
	 */
	public void setPerformance(List<PerformanceDashboardType> performance) {
	    this.performance = performance;
	}

}