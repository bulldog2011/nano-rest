// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package ebay.apis.eblbasecomponents;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;

@RootElement(name = "GetMemberMessagesResponse", namespace = "urn:ebay:apis:eBLBaseComponents")
public class GetMemberMessagesResponseType extends AbstractResponseType implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element(name = "MemberMessage")
	private MemberMessageExchangeArrayType memberMessage;
	
	@Element(name = "PaginationResult")
	private PaginationResultType paginationResult;
	
	@Element(name = "HasMoreItems")
	private Boolean hasMoreItems;
	
    
	/**
     * public getter
     *
     * 
     * The returned member messages. Returned if messages that meet the request criteria exist.
     * Note that GetMemberMessages does not return
     * messages when, in the request, the MailMessageType is AskSellerQuestion.
     * 
     *
     * @returns ebay.apis.eblbasecomponents.MemberMessageExchangeArrayType
	 */
	public MemberMessageExchangeArrayType getMemberMessage() {
	    return this.memberMessage;
	}
	
	/**
	 * public setter
	 *
     * 
     * The returned member messages. Returned if messages that meet the request criteria exist.
     * Note that GetMemberMessages does not return
     * messages when, in the request, the MailMessageType is AskSellerQuestion.
     * 
     *
     * @param ebay.apis.eblbasecomponents.MemberMessageExchangeArrayType
	 */
	public void setMemberMessage(MemberMessageExchangeArrayType memberMessage) {
	    this.memberMessage = memberMessage;
	}
	/**
     * public getter
     *
     * 
     * Shows the pagination of data returned by requests.
     * 
     *
     * @returns ebay.apis.eblbasecomponents.PaginationResultType
	 */
	public PaginationResultType getPaginationResult() {
	    return this.paginationResult;
	}
	
	/**
	 * public setter
	 *
     * 
     * Shows the pagination of data returned by requests.
     * 
     *
     * @param ebay.apis.eblbasecomponents.PaginationResultType
	 */
	public void setPaginationResult(PaginationResultType paginationResult) {
	    this.paginationResult = paginationResult;
	}
	/**
     * public getter
     *
     * 
     * Specifies whether the response has more items.
     * 
     *
     * @returns java.lang.Boolean
	 */
	public Boolean getHasMoreItems() {
	    return this.hasMoreItems;
	}
	
	/**
	 * public setter
	 *
     * 
     * Specifies whether the response has more items.
     * 
     *
     * @param java.lang.Boolean
	 */
	public void setHasMoreItems(Boolean hasMoreItems) {
	    this.hasMoreItems = hasMoreItems;
	}

}