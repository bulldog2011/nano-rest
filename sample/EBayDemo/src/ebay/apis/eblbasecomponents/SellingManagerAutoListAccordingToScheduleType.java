// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package ebay.apis.eblbasecomponents;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;
import java.util.List;
import java.util.Date;

/**
 * Defines the options available for an Automated Listing Rule that 
 * keeps a fixed number of items on the site
 */
public class SellingManagerAutoListAccordingToScheduleType implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element(name = "DayOfWeek")
	private List<DayOfWeekCodeType> dayOfWeek;
	
	@Element(name = "ListingPeriodInWeeks")
	private Integer listingPeriodInWeeks;
	
	@Element(name = "ListAtSpecificTimeOfDay")
	private Date listAtSpecificTimeOfDay;
	
	@Element(name = "StartTime")
	private Date startTime;
	
	@Element(name = "EndTime")
	private Date endTime;
	
	@Element(name = "MaxActiveItemCount")
	private Integer maxActiveItemCount;
	
	@Element(name = "ListingHoldInventoryLevel")
	private Integer listingHoldInventoryLevel;
	
    
	/**
     * public getter
     *
     * 
     * The day of the week on which items should be listed.
     * 
     *
     * @returns java.util.List<ebay.apis.eblbasecomponents.DayOfWeekCodeType>
	 */
	public List<DayOfWeekCodeType> getDayOfWeek() {
	    return this.dayOfWeek;
	}
	
	/**
	 * public setter
	 *
     * 
     * The day of the week on which items should be listed.
     * 
     *
     * @param java.util.List<ebay.apis.eblbasecomponents.DayOfWeekCodeType>
	 */
	public void setDayOfWeek(List<DayOfWeekCodeType> dayOfWeek) {
	    this.dayOfWeek = dayOfWeek;
	}
	/**
     * public getter
     *
     * 
     * The number of weeks between rule executions.
     * 
     *
     * @returns java.lang.Integer
	 */
	public Integer getListingPeriodInWeeks() {
	    return this.listingPeriodInWeeks;
	}
	
	/**
	 * public setter
	 *
     * 
     * The number of weeks between rule executions.
     * 
     *
     * @param java.lang.Integer
	 */
	public void setListingPeriodInWeeks(Integer listingPeriodInWeeks) {
	    this.listingPeriodInWeeks = listingPeriodInWeeks;
	}
	/**
     * public getter
     *
     * 
     * The time at which items should be listed.
     * 
     *
     * @returns java.util.Date
	 */
	public Date getListAtSpecificTimeOfDay() {
	    return this.listAtSpecificTimeOfDay;
	}
	
	/**
	 * public setter
	 *
     * 
     * The time at which items should be listed.
     * 
     *
     * @param java.util.Date
	 */
	public void setListAtSpecificTimeOfDay(Date listAtSpecificTimeOfDay) {
	    this.listAtSpecificTimeOfDay = listAtSpecificTimeOfDay;
	}
	/**
     * public getter
     *
     * 
     * The date from which the rule is active.
     * 
     *
     * @returns java.util.Date
	 */
	public Date getStartTime() {
	    return this.startTime;
	}
	
	/**
	 * public setter
	 *
     * 
     * The date from which the rule is active.
     * 
     *
     * @param java.util.Date
	 */
	public void setStartTime(Date startTime) {
	    this.startTime = startTime;
	}
	/**
     * public getter
     *
     * 
     * The date after which the rule is disabled.
     * 
     *
     * @returns java.util.Date
	 */
	public Date getEndTime() {
	    return this.endTime;
	}
	
	/**
	 * public setter
	 *
     * 
     * The date after which the rule is disabled.
     * 
     *
     * @param java.util.Date
	 */
	public void setEndTime(Date endTime) {
	    this.endTime = endTime;
	}
	/**
     * public getter
     *
     * 
     * The number of current, listed items required for the rule to no longer be run. 
     * 
     *
     * @returns java.lang.Integer
	 */
	public Integer getMaxActiveItemCount() {
	    return this.maxActiveItemCount;
	}
	
	/**
	 * public setter
	 *
     * 
     * The number of current, listed items required for the rule to no longer be run. 
     * 
     *
     * @param java.lang.Integer
	 */
	public void setMaxActiveItemCount(Integer maxActiveItemCount) {
	    this.maxActiveItemCount = maxActiveItemCount;
	}
	/**
     * public getter
     *
     * 
     * Sets a minimum inventory level for listings of associated products 
     * to occur.
     * 
     *
     * @returns java.lang.Integer
	 */
	public Integer getListingHoldInventoryLevel() {
	    return this.listingHoldInventoryLevel;
	}
	
	/**
	 * public setter
	 *
     * 
     * Sets a minimum inventory level for listings of associated products 
     * to occur.
     * 
     *
     * @param java.lang.Integer
	 */
	public void setListingHoldInventoryLevel(Integer listingHoldInventoryLevel) {
	    this.listingHoldInventoryLevel = listingHoldInventoryLevel;
	}

}