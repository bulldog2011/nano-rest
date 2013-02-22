// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package ebay.apis.eblbasecomponents;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;

/**
 * 
 * This type defines the <b>ProStoresDetails</b> container, which contains
 * details about the ProStore seller's store.
 * 
 */
public class ProStoresDetailsType implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element(name = "SellerThirdPartyUsername")
	private String sellerThirdPartyUsername;
	
	@Element(name = "StoreName")
	private String storeName;
	
	@Element(name = "Status")
	private EnableCodeType status;
	
    
	/**
     * public getter
     *
     * 
     * The user name associated with the seller's ProStore store. This field is always
     * returned with the <b>ProStoresDetails</b> container.
     * 
     *
     * @returns java.lang.String
	 */
	public String getSellerThirdPartyUsername() {
	    return this.sellerThirdPartyUsername;
	}
	
	/**
	 * public setter
	 *
     * 
     * The user name associated with the seller's ProStore store. This field is always
     * returned with the <b>ProStoresDetails</b> container.
     * 
     *
     * @param java.lang.String
	 */
	public void setSellerThirdPartyUsername(String sellerThirdPartyUsername) {
	    this.sellerThirdPartyUsername = sellerThirdPartyUsername;
	}
	/**
     * public getter
     *
     * 
     * The name of the seller's ProStore store. This field is always returned with the
     * <b>ProStoresDetails</b> container.
     * 
     *
     * @returns java.lang.String
	 */
	public String getStoreName() {
	    return this.storeName;
	}
	
	/**
	 * public setter
	 *
     * 
     * The name of the seller's ProStore store. This field is always returned with the
     * <b>ProStoresDetails</b> container.
     * 
     *
     * @param java.lang.String
	 */
	public void setStoreName(String storeName) {
	    this.storeName = storeName;
	}
	/**
     * public getter
     *
     * 
     * This value indicates if the seller's ProStore store is enabled or disabled. This field
     * is always returned with the <b>ProStoresDetails</b> container.
     * 
     *
     * @returns ebay.apis.eblbasecomponents.EnableCodeType
	 */
	public EnableCodeType getStatus() {
	    return this.status;
	}
	
	/**
	 * public setter
	 *
     * 
     * This value indicates if the seller's ProStore store is enabled or disabled. This field
     * is always returned with the <b>ProStoresDetails</b> container.
     * 
     *
     * @param ebay.apis.eblbasecomponents.EnableCodeType
	 */
	public void setStatus(EnableCodeType status) {
	    this.status = status;
	}

}