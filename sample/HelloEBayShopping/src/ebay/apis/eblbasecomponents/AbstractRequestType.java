// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package ebay.apis.eblbasecomponents;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;

/**
 * 
 * Base type definition of the request payload, which can carry any type
 * of payload content plus optional versioning information and detail level requirements.
 * All concrete request types are derived from the abstract request type.
 * The naming convention we use for the concrete type names is the name of the service
 * (the verb or call name) followed by "RequestType": VerbNameRequestType
 * 
 */
public abstract class AbstractRequestType implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element(name = "MessageID")
	private String messageID;
	
    
	/**
     * public getter
     *
     * 
     * If you pass a value in MessageID in a request,
     * we'll return the same value in CorrelationID in the response.
     * If you're making a lot of calls, you can use this for tracking that a
     * response is returned for every request and to match
     * particular responses to particular requests. (In this case, specify
     * a different value for each request.) You can specify any value
     * that is useful to you.
     * 
     *
     * @returns java.lang.String
	 */
	public String getMessageID() {
	    return this.messageID;
	}
	
	/**
	 * public setter
	 *
     * 
     * If you pass a value in MessageID in a request,
     * we'll return the same value in CorrelationID in the response.
     * If you're making a lot of calls, you can use this for tracking that a
     * response is returned for every request and to match
     * particular responses to particular requests. (In this case, specify
     * a different value for each request.) You can specify any value
     * that is useful to you.
     * 
     *
     * @param java.lang.String
	 */
	public void setMessageID(String messageID) {
	    this.messageID = messageID;
	}

}