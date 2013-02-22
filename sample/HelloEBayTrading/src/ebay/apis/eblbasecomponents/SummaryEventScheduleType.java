// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package ebay.apis.eblbasecomponents;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;

/**
 * 
 * Details about a summary event schedule.
 * 
 */
public class SummaryEventScheduleType implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element(name = "EventType")
	private NotificationEventTypeCodeType eventType;
	
	@Element(name = "SummaryPeriod")
	private SummaryWindowPeriodCodeType summaryPeriod;
	
	@Element(name = "Frequency")
	private SummaryFrequencyCodeType frequency;
	
    
	/**
     * public getter
     *
     * 
     * The event type associated with this alert.
     * 
     *
     * @returns ebay.apis.eblbasecomponents.NotificationEventTypeCodeType
	 */
	public NotificationEventTypeCodeType getEventType() {
	    return this.eventType;
	}
	
	/**
	 * public setter
	 *
     * 
     * The event type associated with this alert.
     * 
     *
     * @param ebay.apis.eblbasecomponents.NotificationEventTypeCodeType
	 */
	public void setEventType(NotificationEventTypeCodeType eventType) {
	    this.eventType = eventType;
	}
	/**
     * public getter
     *
     * 
     * The period of time for which to create a summary.
     * 
     *
     * @returns ebay.apis.eblbasecomponents.SummaryWindowPeriodCodeType
	 */
	public SummaryWindowPeriodCodeType getSummaryPeriod() {
	    return this.summaryPeriod;
	}
	
	/**
	 * public setter
	 *
     * 
     * The period of time for which to create a summary.
     * 
     *
     * @param ebay.apis.eblbasecomponents.SummaryWindowPeriodCodeType
	 */
	public void setSummaryPeriod(SummaryWindowPeriodCodeType summaryPeriod) {
	    this.summaryPeriod = summaryPeriod;
	}
	/**
     * public getter
     *
     * 
     * How often the summary is to be delivered.
     * 
     *
     * @returns ebay.apis.eblbasecomponents.SummaryFrequencyCodeType
	 */
	public SummaryFrequencyCodeType getFrequency() {
	    return this.frequency;
	}
	
	/**
	 * public setter
	 *
     * 
     * How often the summary is to be delivered.
     * 
     *
     * @param ebay.apis.eblbasecomponents.SummaryFrequencyCodeType
	 */
	public void setFrequency(SummaryFrequencyCodeType frequency) {
	    this.frequency = frequency;
	}

}