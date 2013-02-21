// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package ebay.apis.eblbasecomponents;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;
import java.util.Date;

/**
 * 
 * Details about feature availability for the site.
 * 
 */
public class ListingFeatureDetailsType implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element(name = "BoldTitle")
	private BoldTitleCodeType boldTitle;
	
	@Element(name = "Border")
	private BorderCodeType border;
	
	@Element(name = "Highlight")
	private HighlightCodeType highlight;
	
	@Element(name = "GiftIcon")
	private GiftIconCodeType giftIcon;
	
	@Element(name = "HomePageFeatured")
	private HomePageFeaturedCodeType homePageFeatured;
	
	@Element(name = "FeaturedFirst")
	private FeaturedFirstCodeType featuredFirst;
	
	@Element(name = "FeaturedPlus")
	private FeaturedPlusCodeType featuredPlus;
	
	@Element(name = "ProPack")
	private ProPackCodeType proPack;
	
	@Element(name = "DetailVersion")
	private String detailVersion;
	
	@Element(name = "UpdateTime")
	private Date updateTime;
	
    
	/**
     * public getter
     *
     * 
     * Defines the availability of the BoldTitle feature for the site.
     * 
     *
     * @returns ebay.apis.eblbasecomponents.BoldTitleCodeType
	 */
	public BoldTitleCodeType getBoldTitle() {
	    return this.boldTitle;
	}
	
	/**
	 * public setter
	 *
     * 
     * Defines the availability of the BoldTitle feature for the site.
     * 
     *
     * @param ebay.apis.eblbasecomponents.BoldTitleCodeType
	 */
	public void setBoldTitle(BoldTitleCodeType boldTitle) {
	    this.boldTitle = boldTitle;
	}
	/**
     * public getter
     *
     * 
     * Defines the availability of the Picture Border feature for the site.
     * <br>
     * <br>
     * <span class="tablenote"><b>Note:</b>
     * The Picture Border feature has been deprecated.
     * </span>
     * 
     *
     * @returns ebay.apis.eblbasecomponents.BorderCodeType
	 */
	public BorderCodeType getBorder() {
	    return this.border;
	}
	
	/**
	 * public setter
	 *
     * 
     * Defines the availability of the Picture Border feature for the site.
     * <br>
     * <br>
     * <span class="tablenote"><b>Note:</b>
     * The Picture Border feature has been deprecated.
     * </span>
     * 
     *
     * @param ebay.apis.eblbasecomponents.BorderCodeType
	 */
	public void setBorder(BorderCodeType border) {
	    this.border = border;
	}
	/**
     * public getter
     *
     * 
     * Defines the availability of the Highlight feature for the site.
     * 
     *
     * @returns ebay.apis.eblbasecomponents.HighlightCodeType
	 */
	public HighlightCodeType getHighlight() {
	    return this.highlight;
	}
	
	/**
	 * public setter
	 *
     * 
     * Defines the availability of the Highlight feature for the site.
     * 
     *
     * @param ebay.apis.eblbasecomponents.HighlightCodeType
	 */
	public void setHighlight(HighlightCodeType highlight) {
	    this.highlight = highlight;
	}
	/**
     * public getter
     *
     * 
     * Defines the availability of the Gift Icon feature for the site.
     * 
     *
     * @returns ebay.apis.eblbasecomponents.GiftIconCodeType
	 */
	public GiftIconCodeType getGiftIcon() {
	    return this.giftIcon;
	}
	
	/**
	 * public setter
	 *
     * 
     * Defines the availability of the Gift Icon feature for the site.
     * 
     *
     * @param ebay.apis.eblbasecomponents.GiftIconCodeType
	 */
	public void setGiftIcon(GiftIconCodeType giftIcon) {
	    this.giftIcon = giftIcon;
	}
	/**
     * public getter
     *
     * 
     * Defines the availability of the HomePageFeatured feature for the site.
     * 
     *
     * @returns ebay.apis.eblbasecomponents.HomePageFeaturedCodeType
	 */
	public HomePageFeaturedCodeType getHomePageFeatured() {
	    return this.homePageFeatured;
	}
	
	/**
	 * public setter
	 *
     * 
     * Defines the availability of the HomePageFeatured feature for the site.
     * 
     *
     * @param ebay.apis.eblbasecomponents.HomePageFeaturedCodeType
	 */
	public void setHomePageFeatured(HomePageFeaturedCodeType homePageFeatured) {
	    this.homePageFeatured = homePageFeatured;
	}
	/**
     * public getter
     *
     * 
     * Defines the availability of FeaturedFirst for the site.
     * If FeaturedFirst is available for a site, then this field also
     * is used to determine if FeaturedFirst is available only for
     * PowerSellers, or only for top-rated sellers.
     * If you make a GeteBayDetails call to site 100 (US eBay Motors),
     * the value returned only applies to the Parts and Accessories category.
     * 
     *
     * @returns ebay.apis.eblbasecomponents.FeaturedFirstCodeType
	 */
	public FeaturedFirstCodeType getFeaturedFirst() {
	    return this.featuredFirst;
	}
	
	/**
	 * public setter
	 *
     * 
     * Defines the availability of FeaturedFirst for the site.
     * If FeaturedFirst is available for a site, then this field also
     * is used to determine if FeaturedFirst is available only for
     * PowerSellers, or only for top-rated sellers.
     * If you make a GeteBayDetails call to site 100 (US eBay Motors),
     * the value returned only applies to the Parts and Accessories category.
     * 
     *
     * @param ebay.apis.eblbasecomponents.FeaturedFirstCodeType
	 */
	public void setFeaturedFirst(FeaturedFirstCodeType featuredFirst) {
	    this.featuredFirst = featuredFirst;
	}
	/**
     * public getter
     *
     * 
     * Defines the availability of FeaturedPlus for site, including whether it is only available for
     * certain seller groups such as PowerSeller or TopRatedSeller.
     * 
     *
     * @returns ebay.apis.eblbasecomponents.FeaturedPlusCodeType
	 */
	public FeaturedPlusCodeType getFeaturedPlus() {
	    return this.featuredPlus;
	}
	
	/**
	 * public setter
	 *
     * 
     * Defines the availability of FeaturedPlus for site, including whether it is only available for
     * certain seller groups such as PowerSeller or TopRatedSeller.
     * 
     *
     * @param ebay.apis.eblbasecomponents.FeaturedPlusCodeType
	 */
	public void setFeaturedPlus(FeaturedPlusCodeType featuredPlus) {
	    this.featuredPlus = featuredPlus;
	}
	/**
     * public getter
     *
     * 
     * Defines the availability of ProPack for the site.
     * If ProPack is available for a site, this field also is used to determine if ProPack is
     * available only for PowerSellers, or only for top-rated sellers.
     * If you make a GeteBayDetails call to site 100 (US eBay Motors),
     * the value returned only applies to the Parts and Accessories category.
     * 
     *
     * @returns ebay.apis.eblbasecomponents.ProPackCodeType
	 */
	public ProPackCodeType getProPack() {
	    return this.proPack;
	}
	
	/**
	 * public setter
	 *
     * 
     * Defines the availability of ProPack for the site.
     * If ProPack is available for a site, this field also is used to determine if ProPack is
     * available only for PowerSellers, or only for top-rated sellers.
     * If you make a GeteBayDetails call to site 100 (US eBay Motors),
     * the value returned only applies to the Parts and Accessories category.
     * 
     *
     * @param ebay.apis.eblbasecomponents.ProPackCodeType
	 */
	public void setProPack(ProPackCodeType proPack) {
	    this.proPack = proPack;
	}
	/**
     * public getter
     *
     * 
     * Returns the current version of details.
     * 
     *
     * @returns java.lang.String
	 */
	public String getDetailVersion() {
	    return this.detailVersion;
	}
	
	/**
	 * public setter
	 *
     * 
     * Returns the current version of details.
     * 
     *
     * @param java.lang.String
	 */
	public void setDetailVersion(String detailVersion) {
	    this.detailVersion = detailVersion;
	}
	/**
     * public getter
     *
     * 
     * Gives the time in GMT that the feature flags for the
     * details were last updated.
     * 
     *
     * @returns java.util.Date
	 */
	public Date getUpdateTime() {
	    return this.updateTime;
	}
	
	/**
	 * public setter
	 *
     * 
     * Gives the time in GMT that the feature flags for the
     * details were last updated.
     * 
     *
     * @param java.util.Date
	 */
	public void setUpdateTime(Date updateTime) {
	    this.updateTime = updateTime;
	}

}