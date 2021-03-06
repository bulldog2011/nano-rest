// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package ebay.apis.eblbasecomponents;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;
import java.util.List;

/**
 * 
 * Contains a list of up to 10 MessageID values.
 * 
 */
public class MyMessagesMessageIDArrayType implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element(name = "MessageID")
	private List<String> messageID;
	
    
	/**
     * public getter
     *
     * 
     * An ID that uniquely identifies a message for a given user.
     * 
     *
     * @returns java.util.List<java.lang.String>
	 */
	public List<String> getMessageID() {
	    return this.messageID;
	}
	
	/**
	 * public setter
	 *
     * 
     * An ID that uniquely identifies a message for a given user.
     * 
     *
     * @param java.util.List<java.lang.String>
	 */
	public void setMessageID(List<String> messageID) {
	    this.messageID = messageID;
	}

}