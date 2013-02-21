// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package ebay.apis.eblbasecomponents;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;

/**
 * 
 */
public class XMLRequesterCredentialsType implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element(name = "Username")
	private String username;
	
	@Element(name = "Password")
	private String password;
	
	@Element
	private String eBayAuthToken;
	
    
	/**
     * public getter
     *
     * 
     * eBay user ID (i.e., eBay.com Web site login name) for the user the application
     * is retrieving a token for. This is typically the application's end-user (not
     * the developer).
     * 
     *
     * @returns java.lang.String
	 */
	public String getUsername() {
	    return this.username;
	}
	
	/**
	 * public setter
	 *
     * 
     * eBay user ID (i.e., eBay.com Web site login name) for the user the application
     * is retrieving a token for. This is typically the application's end-user (not
     * the developer).
     * 
     *
     * @param java.lang.String
	 */
	public void setUsername(String username) {
	    this.username = username;
	}
	/**
     * public getter
     *
     * 
     * Password for the user specified in Username.
     * 
     *
     * @returns java.lang.String
	 */
	public String getPassword() {
	    return this.password;
	}
	
	/**
	 * public setter
	 *
     * 
     * Password for the user specified in Username.
     * 
     *
     * @param java.lang.String
	 */
	public void setPassword(String password) {
	    this.password = password;
	}
	/**
     * public getter
     *
     * 
     * Authentication token representing the user who is making the request. The
     * user's token must be retrieved from eBay. To determine a user's authentication
     * token, see the Authentication and Authorization information in the eBay Web
     * Services guide. For calls that list or retrieve item or transaction data, the
     * user usually needs to be the seller of the item in question or, in some cases,
     * the buyer. Similarly, calls that retrieve user or account data may be
     * restricted to the user whose data is being requested. The documentation for
     * each call includes information about such restrictions.
     * 
     *
     * @returns java.lang.String
	 */
	public String getEBayAuthToken() {
	    return this.eBayAuthToken;
	}
	
	/**
	 * public setter
	 *
     * 
     * Authentication token representing the user who is making the request. The
     * user's token must be retrieved from eBay. To determine a user's authentication
     * token, see the Authentication and Authorization information in the eBay Web
     * Services guide. For calls that list or retrieve item or transaction data, the
     * user usually needs to be the seller of the item in question or, in some cases,
     * the buyer. Similarly, calls that retrieve user or account data may be
     * restricted to the user whose data is being requested. The documentation for
     * each call includes information about such restrictions.
     * 
     *
     * @param java.lang.String
	 */
	public void setEBayAuthToken(String eBayAuthToken) {
	    this.eBayAuthToken = eBayAuthToken;
	}

}