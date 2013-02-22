// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package ebay.apis.eblbasecomponents;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;

/**
 * 
 * (out) A template for an SMS notification message.
 * 
 */
@RootElement(name = "NotificationMessage", namespace = "urn:ebay:apis:eBLBaseComponents")
public class NotificationMessageType extends AbstractResponseType implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element(name = "MessageBody")
	private String messageBody;
	
	@Element(name = "EIAS")
	private String eias;
	
    
	/**
     * public getter
     *
     * 
     * (out) The SMS message.
     * 
     *
     * @returns java.lang.String
	 */
	public String getMessageBody() {
	    return this.messageBody;
	}
	
	/**
	 * public setter
	 *
     * 
     * (out) The SMS message.
     * 
     *
     * @param java.lang.String
	 */
	public void setMessageBody(String messageBody) {
	    this.messageBody = messageBody;
	}
	/**
     * public getter
     *
     * 
     * (out) The EIAS userId.
     * 
     *
     * @returns java.lang.String
	 */
	public String getEias() {
	    return this.eias;
	}
	
	/**
	 * public setter
	 *
     * 
     * (out) The EIAS userId.
     * 
     *
     * @param java.lang.String
	 */
	public void setEias(String eias) {
	    this.eias = eias;
	}

}