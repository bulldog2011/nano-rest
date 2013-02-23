// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package ebay.apis.eblbasecomponents;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;

/**
 * 
 * Enables a seller to specify the definition of a new item and submit the definition to eBay without creating a listing.&nbsp;<b>Also for Half.com</b>.
 * <br><br>
 * Sellers who engage in cross-border trade on sites that require a recoupment agreement, must agree to the
 * recoupment terms before adding or verifying items. This agreement allows eBay to reimburse
 * a buyer during a dispute and then recoup the cost from the seller. The US site is a recoupment site, and
 *         the agreement is located <a href="https://scgi.ebay.com/ws/eBayISAPI.dll?CBTRecoupAgreement">here</a>.
 *         The list of the sites where a user has agreed to the recoupment terms is returned by the GetUser response.
 * 
 */
@RootElement(name = "VerifyAddItemRequest", namespace = "urn:ebay:apis:eBLBaseComponents")
public class VerifyAddItemRequestType extends AbstractRequestType implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element(name = "Item")
	private ItemType item;
	
	@Element(name = "IncludeExpressRequirements")
	private Boolean includeExpressRequirements;
	
	@Element(name = "ExternalProductID")
	private ExternalProductIDType externalProductID;
	
    
	/**
     * public getter
     *
     * 
     * Root container holding all values that define a new
     * listing.
     * 
     *
     * @returns ebay.apis.eblbasecomponents.ItemType
	 */
	public ItemType getItem() {
	    return this.item;
	}
	
	/**
	 * public setter
	 *
     * 
     * Root container holding all values that define a new
     * listing.
     * 
     *
     * @param ebay.apis.eblbasecomponents.ItemType
	 */
	public void setItem(ItemType item) {
	    this.item = item;
	}
	/**
     * public getter
     *
     * 
     * Indicates if the response should include detailed data relating to
     * whether an item would qualify as an Express listing. For
     * information about the Express-related data that can be returned
     * when IncludeExpressRequirements is set to true,
     * see the response of VerifyAddItem and see the
     * eBay Web Services Guide.
     * 
     *
     * @returns java.lang.Boolean
	 */
	public Boolean getIncludeExpressRequirements() {
	    return this.includeExpressRequirements;
	}
	
	/**
	 * public setter
	 *
     * 
     * Indicates if the response should include detailed data relating to
     * whether an item would qualify as an Express listing. For
     * information about the Express-related data that can be returned
     * when IncludeExpressRequirements is set to true,
     * see the response of VerifyAddItem and see the
     * eBay Web Services Guide.
     * 
     *
     * @param java.lang.Boolean
	 */
	public void setIncludeExpressRequirements(Boolean includeExpressRequirements) {
	    this.includeExpressRequirements = includeExpressRequirements;
	}
	/**
     * public getter
     *
     * 
     * <b>Deprecated.</b> This field will be removed from the schema
     * in a future release. Recommended usage as of release 439 varies for
     * eBay.com listings and Half.com listings.
     * <br><br>
     * For eBay.com listings:
     * As of release 439, this field can still be passed in, but we recommend
     * that you update your applications to use the ExternalProductID field
     * defined on the item instead (i.e., Item.ExternalProductID). If you
     * specify both Item.ExternalProductID and this field in the same request,
     * eBay uses the value in Item.ExternalProductID and ignores the value in
     * this field. See Item.ExternalProductID for information on using an
     * external ID for eBay.com listings.
     * <br><br>
     * For Half.com listings:
     * As of release 439, this field is required for Half.com listings.
     * Causes Half.com to list the item with Pre-filled Item Information based on
     * an ISBN value or other supported external ID, plus other meta-data that
     * you specify. See the eBay Web Services guide for information about
     * listing to Half.com.
     * 
     *
     * @returns ebay.apis.eblbasecomponents.ExternalProductIDType
	 */
	public ExternalProductIDType getExternalProductID() {
	    return this.externalProductID;
	}
	
	/**
	 * public setter
	 *
     * 
     * <b>Deprecated.</b> This field will be removed from the schema
     * in a future release. Recommended usage as of release 439 varies for
     * eBay.com listings and Half.com listings.
     * <br><br>
     * For eBay.com listings:
     * As of release 439, this field can still be passed in, but we recommend
     * that you update your applications to use the ExternalProductID field
     * defined on the item instead (i.e., Item.ExternalProductID). If you
     * specify both Item.ExternalProductID and this field in the same request,
     * eBay uses the value in Item.ExternalProductID and ignores the value in
     * this field. See Item.ExternalProductID for information on using an
     * external ID for eBay.com listings.
     * <br><br>
     * For Half.com listings:
     * As of release 439, this field is required for Half.com listings.
     * Causes Half.com to list the item with Pre-filled Item Information based on
     * an ISBN value or other supported external ID, plus other meta-data that
     * you specify. See the eBay Web Services guide for information about
     * listing to Half.com.
     * 
     *
     * @param ebay.apis.eblbasecomponents.ExternalProductIDType
	 */
	public void setExternalProductID(ExternalProductIDType externalProductID) {
	    this.externalProductID = externalProductID;
	}

}