// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package ebay.apis.eblbasecomponents;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;
import java.util.List;

/**
 * 
 * This type is deprecated because <b>MyMessagesAlert*</b> are deprecated.
 * 
 * 
 */
public class MyMessagesAlertIDArrayType implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element(name = "AlertID")
	private List<String> alertID;
	
    
	/**
     * public getter
     *
     * 
     * 
     * This field will be deprecated in an upcoming release. This field formerly
     * was an ID that uniquely identified an alert for a given user.
     * 
     *
     * @returns java.util.List<java.lang.String>
	 */
	public List<String> getAlertID() {
	    return this.alertID;
	}
	
	/**
	 * public setter
	 *
     * 
     * 
     * This field will be deprecated in an upcoming release. This field formerly
     * was an ID that uniquely identified an alert for a given user.
     * 
     *
     * @param java.util.List<java.lang.String>
	 */
	public void setAlertID(List<String> alertID) {
	    this.alertID = alertID;
	}

}