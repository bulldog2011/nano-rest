// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package ebay.apis.eblbasecomponents;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;

/**
 * 
 * Validates the user response to a <b class="con">GetChallengeToken</b>
 * botblock challenge.
 * 
 */
@RootElement(name = "ValidateChallengeInputRequest", namespace = "urn:ebay:apis:eBLBaseComponents")
public class ValidateChallengeInputRequestType extends AbstractRequestType implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element(name = "ChallengeToken")
	private String challengeToken;
	
	@Element(name = "UserInput")
	private String userInput;
	
	@Element(name = "KeepTokenValid")
	private Boolean keepTokenValid;
	
    
	/**
     * public getter
     *
     * 
     * Botblock token that was returned by GetChallengeToken.
     * 
     *
     * @returns java.lang.String
	 */
	public String getChallengeToken() {
	    return this.challengeToken;
	}
	
	/**
	 * public setter
	 *
     * 
     * Botblock token that was returned by GetChallengeToken.
     * 
     *
     * @param java.lang.String
	 */
	public void setChallengeToken(String challengeToken) {
	    this.challengeToken = challengeToken;
	}
	/**
     * public getter
     *
     * 
     * User response to a botblock challenge.
     * 
     *
     * @returns java.lang.String
	 */
	public String getUserInput() {
	    return this.userInput;
	}
	
	/**
	 * public setter
	 *
     * 
     * User response to a botblock challenge.
     * 
     *
     * @param java.lang.String
	 */
	public void setUserInput(String userInput) {
	    this.userInput = userInput;
	}
	/**
     * public getter
     *
     * 
     * Whether the challenge token should remain valid for up to two minutes.
     * 
     *
     * @returns java.lang.Boolean
	 */
	public Boolean getKeepTokenValid() {
	    return this.keepTokenValid;
	}
	
	/**
	 * public setter
	 *
     * 
     * Whether the challenge token should remain valid for up to two minutes.
     * 
     *
     * @param java.lang.Boolean
	 */
	public void setKeepTokenValid(Boolean keepTokenValid) {
	    this.keepTokenValid = keepTokenValid;
	}

}