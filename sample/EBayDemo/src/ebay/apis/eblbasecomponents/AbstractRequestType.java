// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package ebay.apis.eblbasecomponents;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;
import java.util.List;

/**
 * 
 * Base type definition of the request payload, which can carry any type of payload
 * content plus optional versioning information and detail level requirements. All
 * concrete request types (e.g., AddItemRequestType) are derived from the abstract
 * request type. The naming convention we use for the concrete type names is the name
 * of the service (the verb or call name) followed by "RequestType":
 * VerbNameRequestType
 * 
 */
public abstract class AbstractRequestType implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element(name = "RequesterCredentials")
	private CustomSecurityHeaderType requesterCredentials;
	
	@Element(name = "DetailLevel")
	private List<DetailLevelCodeType> detailLevel;
	
	@Element(name = "ErrorLanguage")
	private String errorLanguage;
	
	@Element(name = "MessageID")
	private String messageID;
	
	@Element(name = "Version")
	private String version;
	
	@Element(name = "EndUserIP")
	private String endUserIP;
	
	@Element(name = "ErrorHandling")
	private ErrorHandlingCodeType errorHandling;
	
	@Element(name = "InvocationID")
	private String invocationID;
	
	@Element(name = "OutputSelector")
	private List<String> outputSelector;
	
	@Element(name = "WarningLevel")
	private WarningLevelCodeType warningLevel;
	
	@Element(name = "BotBlock")
	private BotBlockRequestType botBlock;
	
    
	/**
	 * public getter
	 *
     * @returns ebay.apis.eblbasecomponents.CustomSecurityHeaderType
	 */
	public CustomSecurityHeaderType getRequesterCredentials() {
	    return this.requesterCredentials;
	}
	
	/**
	 * public setter
	 *
     * @param ebay.apis.eblbasecomponents.CustomSecurityHeaderType
	 */
	public void setRequesterCredentials(CustomSecurityHeaderType requesterCredentials) {
	    this.requesterCredentials = requesterCredentials;
	}
	/**
     * public getter
     *
     * 
     * Detail levels are instructions that define standard subsets of
     * data to return for particular data components (e.g., each
     * Item, Transaction, or User) within the response payload.
     * For example, a particular detail level might cause the
     * response to include buyer-related data in every result
     * (e.g., for every Item), but no seller-related data.
     * Specifying a detail level is like using a
     * predefined attribute list in the SELECT clause of an SQL query.
     * Use the DetailLevel element to specify the required detail level
     * that the client application needs pertaining to the data components
     * that are applicable to the request.<br>
     * <br>
     * The DetailLevelCodeType defines the
     * global list of available detail levels for all request types.
     * Most request types support certain detail
     * levels or none at all. If you pass a detail level that exists
     * in the schema but that isn't valid for a particular request,
     * eBay ignores it processes the request without it.
     * For each request type, see the detail level tables in the
     * Input/Output Reference to determine which detail levels are
     * applicable and which elements are returned for each applicable
     * detail level. (Some detail level tables are still in the
     * eBay Web Services guide. They will be moved to the
     * Input/Output Reference in a future release.)<br>
     * <br>Note that DetailLevel is required input for
     * GetMyMessages. <br>
     * <br>
     * With GetSellerList and other calls that retrieve large data sets,
     * please avoid using ReturnAll when possible. For example, if you use
     * GetSellerList, use a GranularityLevel or use the
     * GetSellerEvents call instead. If you do use ReturnAll with
     * GetSellerList, use a small EntriesPerPage value and a short
     * EndTimeFrom/EndTimeTo range for better performance.
     * 
     *
     * @returns java.util.List<ebay.apis.eblbasecomponents.DetailLevelCodeType>
	 */
	public List<DetailLevelCodeType> getDetailLevel() {
	    return this.detailLevel;
	}
	
	/**
	 * public setter
	 *
     * 
     * Detail levels are instructions that define standard subsets of
     * data to return for particular data components (e.g., each
     * Item, Transaction, or User) within the response payload.
     * For example, a particular detail level might cause the
     * response to include buyer-related data in every result
     * (e.g., for every Item), but no seller-related data.
     * Specifying a detail level is like using a
     * predefined attribute list in the SELECT clause of an SQL query.
     * Use the DetailLevel element to specify the required detail level
     * that the client application needs pertaining to the data components
     * that are applicable to the request.<br>
     * <br>
     * The DetailLevelCodeType defines the
     * global list of available detail levels for all request types.
     * Most request types support certain detail
     * levels or none at all. If you pass a detail level that exists
     * in the schema but that isn't valid for a particular request,
     * eBay ignores it processes the request without it.
     * For each request type, see the detail level tables in the
     * Input/Output Reference to determine which detail levels are
     * applicable and which elements are returned for each applicable
     * detail level. (Some detail level tables are still in the
     * eBay Web Services guide. They will be moved to the
     * Input/Output Reference in a future release.)<br>
     * <br>Note that DetailLevel is required input for
     * GetMyMessages. <br>
     * <br>
     * With GetSellerList and other calls that retrieve large data sets,
     * please avoid using ReturnAll when possible. For example, if you use
     * GetSellerList, use a GranularityLevel or use the
     * GetSellerEvents call instead. If you do use ReturnAll with
     * GetSellerList, use a small EntriesPerPage value and a short
     * EndTimeFrom/EndTimeTo range for better performance.
     * 
     *
     * @param java.util.List<ebay.apis.eblbasecomponents.DetailLevelCodeType>
	 */
	public void setDetailLevel(List<DetailLevelCodeType> detailLevel) {
	    this.detailLevel = detailLevel;
	}
	/**
     * public getter
     *
     * 
     * Use ErrorLanguage to return error strings for the call in a different language
     * from the language commonly associated with the site that the requesting user
     * is registered with. Specify the standard RFC 3066 language identification tag
     * (e.g., en_US).
     * <br>
     * ID--- country<br>
     * ----- -----<br>
     * de_AT Austria<br>
     * de_CH Switzerland<br>
     * de_DE Germany <br>
     * en_AU Australia <br>
     * en_CA Canada <br>
     * en_GB United Kingdom<br>
     * en_SG Singapore<br>
     * en_US United States <br>
     * es_ES Spain <br>
     * fr_BE Belgium (French)<br>
     * fr_CA Canada (French) <br>
     * fr_FR France <br>
     * it_IT Italy <br>
     * nl_BE Belgium (Dutch)<br>
     * nl_NL Netherlands <br>
     * zh_CN China<br>
     * en_IN India<br>
     * en_IE Ireland<br>
     * zh_HK Hong Kong
     * 
     *
     * @returns java.lang.String
	 */
	public String getErrorLanguage() {
	    return this.errorLanguage;
	}
	
	/**
	 * public setter
	 *
     * 
     * Use ErrorLanguage to return error strings for the call in a different language
     * from the language commonly associated with the site that the requesting user
     * is registered with. Specify the standard RFC 3066 language identification tag
     * (e.g., en_US).
     * <br>
     * ID--- country<br>
     * ----- -----<br>
     * de_AT Austria<br>
     * de_CH Switzerland<br>
     * de_DE Germany <br>
     * en_AU Australia <br>
     * en_CA Canada <br>
     * en_GB United Kingdom<br>
     * en_SG Singapore<br>
     * en_US United States <br>
     * es_ES Spain <br>
     * fr_BE Belgium (French)<br>
     * fr_CA Canada (French) <br>
     * fr_FR France <br>
     * it_IT Italy <br>
     * nl_BE Belgium (Dutch)<br>
     * nl_NL Netherlands <br>
     * zh_CN China<br>
     * en_IN India<br>
     * en_IE Ireland<br>
     * zh_HK Hong Kong
     * 
     *
     * @param java.lang.String
	 */
	public void setErrorLanguage(String errorLanguage) {
	    this.errorLanguage = errorLanguage;
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
	public String getMessageID() {
	    return this.messageID;
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
	public void setMessageID(String messageID) {
	    this.messageID = messageID;
	}
	/**
     * public getter
     *
     * 
     * The version number of the API code that you are
     * programming against (e.g., 549).
     * The version you specify for a call has these basic effects:<br>
     * - It indicates the version of the code lists and other
     * data that eBay should use to process your request.<br>
     * - It indicates the schema version you are using.<br>
     * You need to use a version that is greater than or equal to the
     * lowest supported version.<br>
     * <br>
     * <b>For the SOAP API:</b> If you are using the SOAP API,
     * this field is required. Specify the version of the WSDL your
     * application is using.<br>
     * <br>
     * <b>For the XML API:</b> If you are using the XML API,
     * this field has no effect. Instead, specify the version in the
     * X-EBAY-API-COMPATIBILITY-LEVEL HTTP header.
     * (If you specify Version in the body of an XML API request and it
     * is different from the value in the HTTP header, eBay returns an
     * informational warning that the value in the HTTP header was used
     * instead.)
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
     * The version number of the API code that you are
     * programming against (e.g., 549).
     * The version you specify for a call has these basic effects:<br>
     * - It indicates the version of the code lists and other
     * data that eBay should use to process your request.<br>
     * - It indicates the schema version you are using.<br>
     * You need to use a version that is greater than or equal to the
     * lowest supported version.<br>
     * <br>
     * <b>For the SOAP API:</b> If you are using the SOAP API,
     * this field is required. Specify the version of the WSDL your
     * application is using.<br>
     * <br>
     * <b>For the XML API:</b> If you are using the XML API,
     * this field has no effect. Instead, specify the version in the
     * X-EBAY-API-COMPATIBILITY-LEVEL HTTP header.
     * (If you specify Version in the body of an XML API request and it
     * is different from the value in the HTTP header, eBay returns an
     * informational warning that the value in the HTTP header was used
     * instead.)
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
     * The public IP address of the machine from which the request is sent.
     * Your application captures that IP address and includes it in
     * a call request. eBay evaluates requests for safety (also see
     * the BotBlock container
     * in the request and response of this call).
     * 
     *
     * @returns java.lang.String
	 */
	public String getEndUserIP() {
	    return this.endUserIP;
	}
	
	/**
	 * public setter
	 *
     * 
     * The public IP address of the machine from which the request is sent.
     * Your application captures that IP address and includes it in
     * a call request. eBay evaluates requests for safety (also see
     * the BotBlock container
     * in the request and response of this call).
     * 
     *
     * @param java.lang.String
	 */
	public void setEndUserIP(String endUserIP) {
	    this.endUserIP = endUserIP;
	}
	/**
     * public getter
     *
     * 
     * Error tolerance level for the call. This is a preference
     * that specifies how eBay should handle requests that contain
     * invalid data or that could partially fail. This gives you some control
     * over whether eBay returns warnings or blocking errors
     * and how eBay processes the invalid data.<br>
     * <br>
     * This field is only applicable to AddItem and related calls, 
     * and only when the listing includes ProductListingDetails.
     * 
     *
     * @returns ebay.apis.eblbasecomponents.ErrorHandlingCodeType
	 */
	public ErrorHandlingCodeType getErrorHandling() {
	    return this.errorHandling;
	}
	
	/**
	 * public setter
	 *
     * 
     * Error tolerance level for the call. This is a preference
     * that specifies how eBay should handle requests that contain
     * invalid data or that could partially fail. This gives you some control
     * over whether eBay returns warnings or blocking errors
     * and how eBay processes the invalid data.<br>
     * <br>
     * This field is only applicable to AddItem and related calls, 
     * and only when the listing includes ProductListingDetails.
     * 
     *
     * @param ebay.apis.eblbasecomponents.ErrorHandlingCodeType
	 */
	public void setErrorHandling(ErrorHandlingCodeType errorHandling) {
	    this.errorHandling = errorHandling;
	}
	/**
     * public getter
     *
     * 
     * A unique identifer for a particular call. If the same InvocationID is passed
     * in after it has been passed in once on a call that succeeded for a particular
     * application and user, then an error will be returned. The identifier can
     * only contain digits from 0-9 and letters from A-F. The
     * identifier must be 32 characters long.  For example,
     * 1FB02B2-9D27-3acb-ABA2-9D539C374228.
     * 
     *
     * @returns java.lang.String
	 */
	public String getInvocationID() {
	    return this.invocationID;
	}
	
	/**
	 * public setter
	 *
     * 
     * A unique identifer for a particular call. If the same InvocationID is passed
     * in after it has been passed in once on a call that succeeded for a particular
     * application and user, then an error will be returned. The identifier can
     * only contain digits from 0-9 and letters from A-F. The
     * identifier must be 32 characters long.  For example,
     * 1FB02B2-9D27-3acb-ABA2-9D539C374228.
     * 
     *
     * @param java.lang.String
	 */
	public void setInvocationID(String invocationID) {
	    this.invocationID = invocationID;
	}
	/**
     * public getter
     *
     * 
     * You can use the OutputSelector field to restrict the data returned by this call.
     * When you make a call such as GetItem that retrieves data from eBay,
     * the OutputSelector field is useful for restricting the data returned.
     * This field makes the call response easier to use, especially when a large payload
     * would be returned. If you use the OutputSelector field, the output data
     * will include only the fields you specified in the request.
     * For example, if you are using GetItem and you want the item data
     * in the response to be restricted to the ViewItemURL
     * (the URL where a user can view the listing) and BuyItNowPrice, then
     * within the GetItem request, specify those output fields.
     * To use this field, see the information at the following link.
     * 
     *
     * @returns java.util.List<java.lang.String>
	 */
	public List<String> getOutputSelector() {
	    return this.outputSelector;
	}
	
	/**
	 * public setter
	 *
     * 
     * You can use the OutputSelector field to restrict the data returned by this call.
     * When you make a call such as GetItem that retrieves data from eBay,
     * the OutputSelector field is useful for restricting the data returned.
     * This field makes the call response easier to use, especially when a large payload
     * would be returned. If you use the OutputSelector field, the output data
     * will include only the fields you specified in the request.
     * For example, if you are using GetItem and you want the item data
     * in the response to be restricted to the ViewItemURL
     * (the URL where a user can view the listing) and BuyItNowPrice, then
     * within the GetItem request, specify those output fields.
     * To use this field, see the information at the following link.
     * 
     *
     * @param java.util.List<java.lang.String>
	 */
	public void setOutputSelector(List<String> outputSelector) {
	    this.outputSelector = outputSelector;
	}
	/**
     * public getter
     *
     * 
     * Controls whether or not to return warnings when the application passes
     * unrecognized or deprecated elements in a request.<br>
     * <br>
     * An unrecognized element is one that is not defined in any supported
     * version of the schema. Schema element names are case-sensitive,
     * so using WarningLevel can also help you remove any potential hidden
     * bugs within your application due to incorrect case or spelling in
     * field names before you put your application into the
     * Production environment.<br>
     * <br>
     * WarningLevel only validates elements; it doesn't validate
     * XML attributes. It also doesn't control warnings related to
     * user-entered strings or numbers, or warnings for
     * logical errors.<br>
     * <br>
     * We recommend that you only use this during development and debugging.
     * Do not use this in requests in your production code.
     * 
     *
     * @returns ebay.apis.eblbasecomponents.WarningLevelCodeType
	 */
	public WarningLevelCodeType getWarningLevel() {
	    return this.warningLevel;
	}
	
	/**
	 * public setter
	 *
     * 
     * Controls whether or not to return warnings when the application passes
     * unrecognized or deprecated elements in a request.<br>
     * <br>
     * An unrecognized element is one that is not defined in any supported
     * version of the schema. Schema element names are case-sensitive,
     * so using WarningLevel can also help you remove any potential hidden
     * bugs within your application due to incorrect case or spelling in
     * field names before you put your application into the
     * Production environment.<br>
     * <br>
     * WarningLevel only validates elements; it doesn't validate
     * XML attributes. It also doesn't control warnings related to
     * user-entered strings or numbers, or warnings for
     * logical errors.<br>
     * <br>
     * We recommend that you only use this during development and debugging.
     * Do not use this in requests in your production code.
     * 
     *
     * @param ebay.apis.eblbasecomponents.WarningLevelCodeType
	 */
	public void setWarningLevel(WarningLevelCodeType warningLevel) {
	    this.warningLevel = warningLevel;
	}
	/**
     * public getter
     *
     * 
     * Container for a token and for user input.
     * 
     *
     * @returns ebay.apis.eblbasecomponents.BotBlockRequestType
	 */
	public BotBlockRequestType getBotBlock() {
	    return this.botBlock;
	}
	
	/**
	 * public setter
	 *
     * 
     * Container for a token and for user input.
     * 
     *
     * @param ebay.apis.eblbasecomponents.BotBlockRequestType
	 */
	public void setBotBlock(BotBlockRequestType botBlock) {
	    this.botBlock = botBlock;
	}

}