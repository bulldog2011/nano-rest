// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package ebay.apis.eblbasecomponents;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;

/**
 * 
 * Specifies a notification event and whether the
 * notification is enabled or disabled.
 * 
 */
public class NotificationEnableType implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element(name = "EventType")
	private NotificationEventTypeCodeType eventType;
	
	@Element(name = "EventEnable")
	private EnableCodeType eventEnable;
	
    
	/**
     * public getter
     *
     * 
     * The name of the notification event.
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
     * The name of the notification event.
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
     * Whether the event is enabled or disabled.
     * 
     *
     * @returns ebay.apis.eblbasecomponents.EnableCodeType
	 */
	public EnableCodeType getEventEnable() {
	    return this.eventEnable;
	}
	
	/**
	 * public setter
	 *
     * 
     * Whether the event is enabled or disabled.
     * 
     *
     * @param ebay.apis.eblbasecomponents.EnableCodeType
	 */
	public void setEventEnable(EnableCodeType eventEnable) {
	    this.eventEnable = eventEnable;
	}

}