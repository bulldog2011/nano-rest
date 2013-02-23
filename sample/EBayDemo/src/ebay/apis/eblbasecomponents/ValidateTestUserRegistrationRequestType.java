// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package ebay.apis.eblbasecomponents;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;
import java.util.Date;

/**
 * 
 * Requests to enable a test user to sell items in the Sandbox environment.
 * 
 */
@RootElement(name = "ValidateTestUserRegistrationRequest", namespace = "urn:ebay:apis:eBLBaseComponents")
public class ValidateTestUserRegistrationRequestType extends AbstractRequestType implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element(name = "FeedbackScore")
	private Integer feedbackScore;
	
	@Element(name = "RegistrationDate")
	private Date registrationDate;
	
	@Element(name = "SubscribeSA")
	private Boolean subscribeSA;
	
	@Element(name = "SubscribeSAPro")
	private Boolean subscribeSAPro;
	
	@Element(name = "SubscribeSM")
	private Boolean subscribeSM;
	
	@Element(name = "SubscribeSMPro")
	private Boolean subscribeSMPro;
	
    
	/**
     * public getter
     *
     * 
     * Value for the feedback score of a user. If no value is passed in the request,
     * or if the value is zero, the feedback score is unchanged. This element is not intended
     * for regularly testing feedback because the feedback value can change after the request.
     * 
     *
     * @returns java.lang.Integer
	 */
	public Integer getFeedbackScore() {
	    return this.feedbackScore;
	}
	
	/**
	 * public setter
	 *
     * 
     * Value for the feedback score of a user. If no value is passed in the request,
     * or if the value is zero, the feedback score is unchanged. This element is not intended
     * for regularly testing feedback because the feedback value can change after the request.
     * 
     *
     * @param java.lang.Integer
	 */
	public void setFeedbackScore(Integer feedbackScore) {
	    this.feedbackScore = feedbackScore;
	}
	/**
     * public getter
     *
     * 
     * Value for the date and time that a user's registration begins.
     * 
     *
     * @returns java.util.Date
	 */
	public Date getRegistrationDate() {
	    return this.registrationDate;
	}
	
	/**
	 * public setter
	 *
     * 
     * Value for the date and time that a user's registration begins.
     * 
     *
     * @param java.util.Date
	 */
	public void setRegistrationDate(Date registrationDate) {
	    this.registrationDate = registrationDate;
	}
	/**
     * public getter
     *
     * 
     * Indicates if a user subscribes to Seller's Assistant. You cannot
     * request to subscribe a user to both Seller's Assistant and
     * Seller's Assistant Pro. You cannot request to unsubscribe a user.
     * 
     *
     * @returns java.lang.Boolean
	 */
	public Boolean getSubscribeSA() {
	    return this.subscribeSA;
	}
	
	/**
	 * public setter
	 *
     * 
     * Indicates if a user subscribes to Seller's Assistant. You cannot
     * request to subscribe a user to both Seller's Assistant and
     * Seller's Assistant Pro. You cannot request to unsubscribe a user.
     * 
     *
     * @param java.lang.Boolean
	 */
	public void setSubscribeSA(Boolean subscribeSA) {
	    this.subscribeSA = subscribeSA;
	}
	/**
     * public getter
     *
     * 
     * Indicates if a user subscribes to Seller's Assistant Pro. You cannot
     * request to subscribe a user to both Seller's Assistant and
     * Seller's Assistant Pro. You cannot request to unsubscribe a user.
     * 
     *
     * @returns java.lang.Boolean
	 */
	public Boolean getSubscribeSAPro() {
	    return this.subscribeSAPro;
	}
	
	/**
	 * public setter
	 *
     * 
     * Indicates if a user subscribes to Seller's Assistant Pro. You cannot
     * request to subscribe a user to both Seller's Assistant and
     * Seller's Assistant Pro. You cannot request to unsubscribe a user.
     * 
     *
     * @param java.lang.Boolean
	 */
	public void setSubscribeSAPro(Boolean subscribeSAPro) {
	    this.subscribeSAPro = subscribeSAPro;
	}
	/**
     * public getter
     *
     * 
     * Indicates if a user subscribes to Selling Manager. You cannot
     * request to subscribe a user to both Selling Manager and
     * Selling Manager Pro. You cannot request to unsubscribe a user.
     * 
     *
     * @returns java.lang.Boolean
	 */
	public Boolean getSubscribeSM() {
	    return this.subscribeSM;
	}
	
	/**
	 * public setter
	 *
     * 
     * Indicates if a user subscribes to Selling Manager. You cannot
     * request to subscribe a user to both Selling Manager and
     * Selling Manager Pro. You cannot request to unsubscribe a user.
     * 
     *
     * @param java.lang.Boolean
	 */
	public void setSubscribeSM(Boolean subscribeSM) {
	    this.subscribeSM = subscribeSM;
	}
	/**
     * public getter
     *
     * 
     * Indicates if a user subscribes to Selling Manager Pro. You cannot
     * request to subscribe a user to both Selling Manager and
     * Selling Manager Pro. You cannot request to unsubscribe a user.
     * 
     *
     * @returns java.lang.Boolean
	 */
	public Boolean getSubscribeSMPro() {
	    return this.subscribeSMPro;
	}
	
	/**
	 * public setter
	 *
     * 
     * Indicates if a user subscribes to Selling Manager Pro. You cannot
     * request to subscribe a user to both Selling Manager and
     * Selling Manager Pro. You cannot request to unsubscribe a user.
     * 
     *
     * @param java.lang.Boolean
	 */
	public void setSubscribeSMPro(Boolean subscribeSMPro) {
	    this.subscribeSMPro = subscribeSMPro;
	}

}