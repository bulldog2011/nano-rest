// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package ebay.apis.eblbasecomponents;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;
import java.util.Date;

/**
 * 
 * Returns an array of notifications sent to a given application identified by the appID
 * (comes in the credentials). The result can be used by third-party developers troubleshoot
 * issues with notifications.
 * Zero, one or many notifications can be returned in the array. The set of notifications
 * returned is limited to those that were sent between the StartTime and EndTime specified
 * in the request. If StartTime or EndTime filters were not found in the request, then
 * the response will contain the data for only one day (Now-1day). By default, maximum
 * duration is limited to 3 days (Now-3days). These min (1day) and max(3days) applies
 * to Notifications,MarkDownMarkUpHistory and NotificationStatistics.
 * 
 * Notifications are sent only if the ItemID is included in the request. If there is no
 * ItemID, then only Statistics and MarkDownMarkUpHistory information is included.
 * 
 */
@RootElement(name = "GetNotificationsUsageResponse", namespace = "urn:ebay:apis:eBLBaseComponents")
public class GetNotificationsUsageResponseType extends AbstractResponseType implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element(name = "StartTime")
	private Date startTime;
	
	@Element(name = "EndTime")
	private Date endTime;
	
	@Element(name = "NotificationDetailsArray")
	private NotificationDetailsArrayType notificationDetailsArray;
	
	@Element(name = "MarkUpMarkDownHistory")
	private MarkUpMarkDownHistoryType markUpMarkDownHistory;
	
	@Element(name = "NotificationStatistics")
	private NotificationStatisticsType notificationStatistics;
	
    
	/**
     * public getter
     *
     * 
     * Returns the start date and time for the notification information that is
     * returned by this call. The oldest date allowed for this field is Now-3days.
     * Default is Now-1day.
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
     * Returns the start date and time for the notification information that is
     * returned by this call. The oldest date allowed for this field is Now-3days.
     * Default is Now-1day.
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
     * Returns the end date and time for the notification information that is
     * returned by this call. The default is Now.
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
     * Returns the end date and time for the notification information that is
     * returned by this call. The default is Now.
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
     * List of notification objects representing the notifications sent to an
     * application for the given time period. It will only be returned if ItemID
     * was specified in the input request.
     * 
     *
     * @returns ebay.apis.eblbasecomponents.NotificationDetailsArrayType
	 */
	public NotificationDetailsArrayType getNotificationDetailsArray() {
	    return this.notificationDetailsArray;
	}
	
	/**
	 * public setter
	 *
     * 
     * List of notification objects representing the notifications sent to an
     * application for the given time period. It will only be returned if ItemID
     * was specified in the input request.
     * 
     *
     * @param ebay.apis.eblbasecomponents.NotificationDetailsArrayType
	 */
	public void setNotificationDetailsArray(NotificationDetailsArrayType notificationDetailsArray) {
	    this.notificationDetailsArray = notificationDetailsArray;
	}
	/**
     * public getter
     *
     * 
     * List of objects representing MarkUp or MarkDown history for a given appID
     * and for given StartTime and EndTime. This node will always be returned.
     * 
     *
     * @returns ebay.apis.eblbasecomponents.MarkUpMarkDownHistoryType
	 */
	public MarkUpMarkDownHistoryType getMarkUpMarkDownHistory() {
	    return this.markUpMarkDownHistory;
	}
	
	/**
	 * public setter
	 *
     * 
     * List of objects representing MarkUp or MarkDown history for a given appID
     * and for given StartTime and EndTime. This node will always be returned.
     * 
     *
     * @param ebay.apis.eblbasecomponents.MarkUpMarkDownHistoryType
	 */
	public void setMarkUpMarkDownHistory(MarkUpMarkDownHistoryType markUpMarkDownHistory) {
	    this.markUpMarkDownHistory = markUpMarkDownHistory;
	}
	/**
     * public getter
     *
     * 
     * Summary information about number of notifications that were successfully
     * delivered, queued, failed, connection attempts made, connection timeouts,
     * http errors for the given appID and given time period. By default, statistics
     * for only one day (Now-1day) is included. Maximum time duration allowed is 3 days
     * (Now-3days).
     * 
     *
     * @returns ebay.apis.eblbasecomponents.NotificationStatisticsType
	 */
	public NotificationStatisticsType getNotificationStatistics() {
	    return this.notificationStatistics;
	}
	
	/**
	 * public setter
	 *
     * 
     * Summary information about number of notifications that were successfully
     * delivered, queued, failed, connection attempts made, connection timeouts,
     * http errors for the given appID and given time period. By default, statistics
     * for only one day (Now-1day) is included. Maximum time duration allowed is 3 days
     * (Now-3days).
     * 
     *
     * @param ebay.apis.eblbasecomponents.NotificationStatisticsType
	 */
	public void setNotificationStatistics(NotificationStatisticsType notificationStatistics) {
	    this.notificationStatistics = notificationStatistics;
	}

}