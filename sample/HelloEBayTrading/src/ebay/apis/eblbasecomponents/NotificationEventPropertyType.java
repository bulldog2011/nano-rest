// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package ebay.apis.eblbasecomponents;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;

/**
 * 
 * Defines properties associated with a particular event.
 * 
 */
public class NotificationEventPropertyType implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element(name = "EventType")
	private NotificationEventTypeCodeType eventType;
	
	@Element(name = "Name")
	private NotificationEventPropertyNameCodeType name;
	
	@Element(name = "Value")
	private String value;
	
    
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
     * Specify property name associated with an particular event.
     * 
     *
     * @returns ebay.apis.eblbasecomponents.NotificationEventPropertyNameCodeType
	 */
	public NotificationEventPropertyNameCodeType getName() {
	    return this.name;
	}
	
	/**
	 * public setter
	 *
     * 
     * Specify property name associated with an particular event.
     * 
     *
     * @param ebay.apis.eblbasecomponents.NotificationEventPropertyNameCodeType
	 */
	public void setName(NotificationEventPropertyNameCodeType name) {
	    this.name = name;
	}
	/**
     * public getter
     *
     * 
     * Specifies the value for the property.
     * 
     *
     * @returns java.lang.String
	 */
	public String getValue() {
	    return this.value;
	}
	
	/**
	 * public setter
	 *
     * 
     * Specifies the value for the property.
     * 
     *
     * @param java.lang.String
	 */
	public void setValue(String value) {
	    this.value = value;
	}

}