// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package ebay.apis.eblbasecomponents;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;
import java.util.List;
import java.util.Date;

/**
 * 
 * Base type definition of a response payload that can carry any
 * type of payload content with following optional elements:<br>
 * - timestamp of response message<br>
 * - application-level acknowledgement<br>
 * - application-level (business-level) errors and warnings
 * 
 */
public abstract class AbstractResponseType implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element(name = "Timestamp")
	private Date timestamp;
	
	@Element(name = "Ack")
	private AckCodeType ack;
	
	@Element(name = "CorrelationID")
	private String correlationID;
	
	@Element(name = "Errors")
	private List<ErrorType> errors;
	
	@Element(name = "Message")
	private String message;
	
	@Element(name = "Version")
	private String version;
	
	@Element(name = "Build")
	private String build;
	
	@Element(name = "NotificationEventName")
	private String notificationEventName;
	
	@Element(name = "DuplicateInvocationDetails")
	private DuplicateInvocationDetailsType duplicateInvocationDetails;
	
	@Element(name = "RecipientUserID")
	private String recipientUserID;
	
	@Element(name = "EIASToken")
	private String eiasToken;
	
	@Element(name = "NotificationSignature")
	private String notificationSignature;
	
	@Element(name = "HardExpirationWarning")
	private String hardExpirationWarning;
	
	@Element(name = "BotBlock")
	private BotBlockResponseType botBlock;
	
	@Element(name = "ExternalUserData")
	private String externalUserData;
	
    
	/**
     * public getter
     *
     * 
     * This value represents the date and time when eBay processed the
     * request. The time zone of this value is GMT and the format is the
     * ISO 8601 date and time format (YYYY-MM-DDTHH:MM:SS.SSSZ). See Time
     * Values in the eBay Web Services guide for information about this
     * time format and converting to and from the GMT time zone. <br>
     * <br>
     * <span class="tablenote"><b>Note:</b>
     * GetCategories, GetAttributesCS, GetCategory2CS, GetAttributesXSL,
     * GetProductFinder, GetProductFinderXSL, and GetProductSearchPage
     * are designed to retrieve very large sets of metadata
     * that change once a day or less often. To improve performance,
     * these calls return cached responses when you request all available data
     * (with no filters). When this occurs, this time value reflects the
     * time the cached response was created. Thus, this value is not
     * necessarily when the request was processed.
     * However, if you specify an input filter to reduce the amount of data
     * returned, the calls retrieve the latest data (not cached).
     * When this occurs, this time value does reflect when the request
     * was processed.</span>
     * 
     *
     * @returns java.util.Date
	 */
	public Date getTimestamp() {
	    return this.timestamp;
	}
	
	/**
	 * public setter
	 *
     * 
     * This value represents the date and time when eBay processed the
     * request. The time zone of this value is GMT and the format is the
     * ISO 8601 date and time format (YYYY-MM-DDTHH:MM:SS.SSSZ). See Time
     * Values in the eBay Web Services guide for information about this
     * time format and converting to and from the GMT time zone. <br>
     * <br>
     * <span class="tablenote"><b>Note:</b>
     * GetCategories, GetAttributesCS, GetCategory2CS, GetAttributesXSL,
     * GetProductFinder, GetProductFinderXSL, and GetProductSearchPage
     * are designed to retrieve very large sets of metadata
     * that change once a day or less often. To improve performance,
     * these calls return cached responses when you request all available data
     * (with no filters). When this occurs, this time value reflects the
     * time the cached response was created. Thus, this value is not
     * necessarily when the request was processed.
     * However, if you specify an input filter to reduce the amount of data
     * returned, the calls retrieve the latest data (not cached).
     * When this occurs, this time value does reflect when the request
     * was processed.</span>
     * 
     *
     * @param java.util.Date
	 */
	public void setTimestamp(Date timestamp) {
	    this.timestamp = timestamp;
	}
	/**
     * public getter
     *
     * 
     * A token representing the application-level acknowledgement code that indicates
     * the response status (e.g., success). The AckCodeType list specifies
     * the possible values for Ack.
     * 
     *
     * @returns ebay.apis.eblbasecomponents.AckCodeType
	 */
	public AckCodeType getAck() {
	    return this.ack;
	}
	
	/**
	 * public setter
	 *
     * 
     * A token representing the application-level acknowledgement code that indicates
     * the response status (e.g., success). The AckCodeType list specifies
     * the possible values for Ack.
     * 
     *
     * @param ebay.apis.eblbasecomponents.AckCodeType
	 */
	public void setAck(AckCodeType ack) {
	    this.ack = ack;
	}
	/**
     * public getter
     *
     * 
     * Most Trading API calls support a <b>MessageID</b> element in the request
     * and a <b>CorrelationID</b> element in the response. If you pass in a
     * <b>MessageID</b> in a request, the same value will be returned in the 
     * <b>CorrelationID</b> field in the response. Pairing these values can 
     * help you track and confirm that a response is returned for every request and to
     * match specific responses to specific requests.
     * If you do not pass a <b>MessageID</b> value in the request, 
     * <b>CorrelationID</b> is not returned.<br>
     * <br>
     * <span class="tablenote"><b>Note:</b>
     * <b>GetCategories</b> is designed to retrieve very large sets of metadata
     * that change once a day or less often. To improve performance, these calls return
     * cached responses when you request all available data (with no filters). When this
     * occurs, the <b>MessageID</b> and <b>CorrelationID</b> fields
     * aren't applicable. However, if you specify an input filter to reduce the amount of
     * data returned, the calls retrieve the latest data (not cached). When this occurs,
     * <b>MessageID</b> and <b>CorrelationID</b> are applicable.
     * </span>
     * 
     *
     * @returns java.lang.String
	 */
	public String getCorrelationID() {
	    return this.correlationID;
	}
	
	/**
	 * public setter
	 *
     * 
     * Most Trading API calls support a <b>MessageID</b> element in the request
     * and a <b>CorrelationID</b> element in the response. If you pass in a
     * <b>MessageID</b> in a request, the same value will be returned in the 
     * <b>CorrelationID</b> field in the response. Pairing these values can 
     * help you track and confirm that a response is returned for every request and to
     * match specific responses to specific requests.
     * If you do not pass a <b>MessageID</b> value in the request, 
     * <b>CorrelationID</b> is not returned.<br>
     * <br>
     * <span class="tablenote"><b>Note:</b>
     * <b>GetCategories</b> is designed to retrieve very large sets of metadata
     * that change once a day or less often. To improve performance, these calls return
     * cached responses when you request all available data (with no filters). When this
     * occurs, the <b>MessageID</b> and <b>CorrelationID</b> fields
     * aren't applicable. However, if you specify an input filter to reduce the amount of
     * data returned, the calls retrieve the latest data (not cached). When this occurs,
     * <b>MessageID</b> and <b>CorrelationID</b> are applicable.
     * </span>
     * 
     *
     * @param java.lang.String
	 */
	public void setCorrelationID(String correlationID) {
	    this.correlationID = correlationID;
	}
	/**
     * public getter
     *
     * 
     * A list of application-level errors (if any) that occurred when eBay
     * processed the request.
     * 
     *
     * @returns java.util.List<ebay.apis.eblbasecomponents.ErrorType>
	 */
	public List<ErrorType> getErrors() {
	    return this.errors;
	}
	
	/**
	 * public setter
	 *
     * 
     * A list of application-level errors (if any) that occurred when eBay
     * processed the request.
     * 
     *
     * @param java.util.List<ebay.apis.eblbasecomponents.ErrorType>
	 */
	public void setErrors(List<ErrorType> errors) {
	    this.errors = errors;
	}
	/**
     * public getter
     *
     * 
     * Supplemental information from eBay, if applicable. May elaborate on 
     * errors (such as how a listing violates eBay policies) or provide 
     * useful hints that may help a seller increase sales. This data can 
     * accompany the call's normal data result set or a result set that 
     * contains only errors. <br>
     * <br>
     * Applications must recognize when the Message field is returned and 
     * provide a means to display the listing hints and error message 
     * explanations to the user. <br>
     * <br>
     * The string can return HTML, including TABLE, IMG, and HREF elements. 
     * In this case, an HTML-based application should be able to include 
     * the HTML as-is in the HTML page that displays the results. 
     * A non-HTML application would need to parse the HTML
     * and convert the table elements and image references into UI elements
     * particular to the programming language used. 
     * As usual for string data types, the HTML markup elements are escaped 
     * with character entity references 
     * (e.g.,&lt;table&gt;&lt;tr&gt;...).
     * 
     *
     * @returns java.lang.String
	 */
	public String getMessage() {
	    return this.message;
	}
	
	/**
	 * public setter
	 *
     * 
     * Supplemental information from eBay, if applicable. May elaborate on 
     * errors (such as how a listing violates eBay policies) or provide 
     * useful hints that may help a seller increase sales. This data can 
     * accompany the call's normal data result set or a result set that 
     * contains only errors. <br>
     * <br>
     * Applications must recognize when the Message field is returned and 
     * provide a means to display the listing hints and error message 
     * explanations to the user. <br>
     * <br>
     * The string can return HTML, including TABLE, IMG, and HREF elements. 
     * In this case, an HTML-based application should be able to include 
     * the HTML as-is in the HTML page that displays the results. 
     * A non-HTML application would need to parse the HTML
     * and convert the table elements and image references into UI elements
     * particular to the programming language used. 
     * As usual for string data types, the HTML markup elements are escaped 
     * with character entity references 
     * (e.g.,&lt;table&gt;&lt;tr&gt;...).
     * 
     *
     * @param java.lang.String
	 */
	public void setMessage(String message) {
	    this.message = message;
	}
	/**
     * public getter
     *
     * 
     * The version of the response payload schema. Indicates the version of the
     * schema that eBay used to process the request.
     * See "Standard Data for All Calls" in the eBay Web Services Guide for information
     * on using the response version when troubleshooting "CustomCode" values that appear
     * in the response.
     * 
     *
     * @returns java.lang.String
	 */
	public String getVersion() {
	    return this.version;
	}
	
	/**
	 * public setter
	 *
     * 
     * The version of the response payload schema. Indicates the version of the
     * schema that eBay used to process the request.
     * See "Standard Data for All Calls" in the eBay Web Services Guide for information
     * on using the response version when troubleshooting "CustomCode" values that appear
     * in the response.
     * 
     *
     * @param java.lang.String
	 */
	public void setVersion(String version) {
	    this.version = version;
	}
	/**
     * public getter
     *
     * 
     * This refers to the specific software build that eBay used when processing the request
     * and generating the response. This includes the version number plus additional
     * information. eBay Developer Support may request the build information
     * when helping you resolve technical issues.
     * 
     *
     * @returns java.lang.String
	 */
	public String getBuild() {
	    return this.build;
	}
	
	/**
	 * public setter
	 *
     * 
     * This refers to the specific software build that eBay used when processing the request
     * and generating the response. This includes the version number plus additional
     * information. eBay Developer Support may request the build information
     * when helping you resolve technical issues.
     * 
     *
     * @param java.lang.String
	 */
	public void setBuild(String build) {
	    this.build = build;
	}
	/**
     * public getter
     *
     * 
     * Event name of the notification. Only returned by Platform Notifications.
     * 
     *
     * @returns java.lang.String
	 */
	public String getNotificationEventName() {
	    return this.notificationEventName;
	}
	
	/**
	 * public setter
	 *
     * 
     * Event name of the notification. Only returned by Platform Notifications.
     * 
     *
     * @param java.lang.String
	 */
	public void setNotificationEventName(String notificationEventName) {
	    this.notificationEventName = notificationEventName;
	}
	/**
     * public getter
     *
     * 
     * Information that explains a failure due to a duplicate InvocationID being
     * passed in.
     * 
     *
     * @returns ebay.apis.eblbasecomponents.DuplicateInvocationDetailsType
	 */
	public DuplicateInvocationDetailsType getDuplicateInvocationDetails() {
	    return this.duplicateInvocationDetails;
	}
	
	/**
	 * public setter
	 *
     * 
     * Information that explains a failure due to a duplicate InvocationID being
     * passed in.
     * 
     *
     * @param ebay.apis.eblbasecomponents.DuplicateInvocationDetailsType
	 */
	public void setDuplicateInvocationDetails(DuplicateInvocationDetailsType duplicateInvocationDetails) {
	    this.duplicateInvocationDetails = duplicateInvocationDetails;
	}
	/**
     * public getter
     *
     * 
     * Recipient user ID of the notification. Only returned by Platform Notifications.
     * 
     *
     * @returns java.lang.String
	 */
	public String getRecipientUserID() {
	    return this.recipientUserID;
	}
	
	/**
	 * public setter
	 *
     * 
     * Recipient user ID of the notification. Only returned by Platform Notifications.
     * 
     *
     * @param java.lang.String
	 */
	public void setRecipientUserID(String recipientUserID) {
	    this.recipientUserID = recipientUserID;
	}
	/**
     * public getter
     *
     * 
     * Unique Identifier of Recipient user ID of the notification. Only returned by
     * Platform Notifications (not for regular API call responses).
     * 
     *
     * @returns java.lang.String
	 */
	public String getEiasToken() {
	    return this.eiasToken;
	}
	
	/**
	 * public setter
	 *
     * 
     * Unique Identifier of Recipient user ID of the notification. Only returned by
     * Platform Notifications (not for regular API call responses).
     * 
     *
     * @param java.lang.String
	 */
	public void setEiasToken(String eiasToken) {
	    this.eiasToken = eiasToken;
	}
	/**
     * public getter
     *
     * 
     * A Base64-encoded MD5 hash that allows the recipient of a Platform
     * Notification to verify this is a valid Platform Notification sent by
     * eBay.
     * 
     *
     * @returns java.lang.String
	 */
	public String getNotificationSignature() {
	    return this.notificationSignature;
	}
	
	/**
	 * public setter
	 *
     * 
     * A Base64-encoded MD5 hash that allows the recipient of a Platform
     * Notification to verify this is a valid Platform Notification sent by
     * eBay.
     * 
     *
     * @param java.lang.String
	 */
	public void setNotificationSignature(String notificationSignature) {
	    this.notificationSignature = notificationSignature;
	}
	/**
     * public getter
     *
     * 
     * Expiration date of the user's authentication token. Only returned
     * within the 7-day period prior to a token's expiration. To ensure
     * that user authentication tokens are secure and to help avoid a
     * user's token being compromised, tokens have a limited life span. A
     * token is only valid for a period of time (set by eBay). After this
     * amount of time has passed, the token expires and must be replaced
     * with a new token.
     * 
     *
     * @returns java.lang.String
	 */
	public String getHardExpirationWarning() {
	    return this.hardExpirationWarning;
	}
	
	/**
	 * public setter
	 *
     * 
     * Expiration date of the user's authentication token. Only returned
     * within the 7-day period prior to a token's expiration. To ensure
     * that user authentication tokens are secure and to help avoid a
     * user's token being compromised, tokens have a limited life span. A
     * token is only valid for a period of time (set by eBay). After this
     * amount of time has passed, the token expires and must be replaced
     * with a new token.
     * 
     *
     * @param java.lang.String
	 */
	public void setHardExpirationWarning(String hardExpirationWarning) {
	    this.hardExpirationWarning = hardExpirationWarning;
	}
	/**
     * public getter
     *
     * 
     * Container of token, image URL and audio URL.
     * 
     *
     * @returns ebay.apis.eblbasecomponents.BotBlockResponseType
	 */
	public BotBlockResponseType getBotBlock() {
	    return this.botBlock;
	}
	
	/**
	 * public setter
	 *
     * 
     * Container of token, image URL and audio URL.
     * 
     *
     * @param ebay.apis.eblbasecomponents.BotBlockResponseType
	 */
	public void setBotBlock(BotBlockResponseType botBlock) {
	    this.botBlock = botBlock;
	}
	/**
     * public getter
     *
     * 
     * An application subscribing to notifications can include an XML-compliant
     * string, not to exceed 256 characters, which will be returned. The string can
     * identify a particular user. Any sensitive information should be passed with due
     * caution.
     * <br><br>
     * To subscribe to and receive eBay Buyer Protection notifications, this field is
     * required, and you must pass in 'eBP notification' as a string.
     * 
     *
     * @returns java.lang.String
	 */
	public String getExternalUserData() {
	    return this.externalUserData;
	}
	
	/**
	 * public setter
	 *
     * 
     * An application subscribing to notifications can include an XML-compliant
     * string, not to exceed 256 characters, which will be returned. The string can
     * identify a particular user. Any sensitive information should be passed with due
     * caution.
     * <br><br>
     * To subscribe to and receive eBay Buyer Protection notifications, this field is
     * required, and you must pass in 'eBP notification' as a string.
     * 
     *
     * @param java.lang.String
	 */
	public void setExternalUserData(String externalUserData) {
	    this.externalUserData = externalUserData;
	}

}