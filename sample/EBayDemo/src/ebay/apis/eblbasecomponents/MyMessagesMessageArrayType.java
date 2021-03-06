// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package ebay.apis.eblbasecomponents;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;
import java.util.List;

/**
 * 
 * Contains a list of message data.
 * 
 */
public class MyMessagesMessageArrayType implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element(name = "Message")
	private List<MyMessagesMessageType> message;
	
    
	/**
     * public getter
     *
     * 
     * Contains the data for one message.
     * 
     *
     * @returns java.util.List<ebay.apis.eblbasecomponents.MyMessagesMessageType>
	 */
	public List<MyMessagesMessageType> getMessage() {
	    return this.message;
	}
	
	/**
	 * public setter
	 *
     * 
     * Contains the data for one message.
     * 
     *
     * @param java.util.List<ebay.apis.eblbasecomponents.MyMessagesMessageType>
	 */
	public void setMessage(List<MyMessagesMessageType> message) {
	    this.message = message;
	}

}