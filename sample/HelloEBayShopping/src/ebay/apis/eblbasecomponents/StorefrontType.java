// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package ebay.apis.eblbasecomponents;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;

/**
 * 
 * Contains information related to the item in the context of
 * a seller's eBay Store. Applicable for auction format, Basic Fixed Price,
 * and Store Inventory format items listed by eBay Stores sellers.
 *  
 */
public class StorefrontType implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element(name = "StoreURL")
	private String storeURL;
	
	@Element(name = "StoreName")
	private String storeName;
	
    
	/**
     * public getter
     *
     * 
     * The URL of the seller's eBay Store page. Not returned if the seller does not
     * have an eBay store.
     * <br><br>
     * FindProducts only returned a default URL at the time of this writing.
     * FindHalfProducts returns the URL of the seller's Half.com Shop page.
     * 
     *
     * @returns java.lang.String
	 */
	public String getStoreURL() {
	    return this.storeURL;
	}
	
	/**
	 * public setter
	 *
     * 
     * The URL of the seller's eBay Store page. Not returned if the seller does not
     * have an eBay store.
     * <br><br>
     * FindProducts only returned a default URL at the time of this writing.
     * FindHalfProducts returns the URL of the seller's Half.com Shop page.
     * 
     *
     * @param java.lang.String
	 */
	public void setStoreURL(String storeURL) {
	    this.storeURL = storeURL;
	}
	/**
     * public getter
     *
     * 
     * The name of the seller's eBay Store. Not returned if the seller does not
     * have an eBay store.
     * <br><br>
     * FindProducts returns an empty value for all items at the time of this writing.
     * FindHalfProducts returns the name of seller's Half.com Shop, which is the
     * SellerID.
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
     * The name of the seller's eBay Store. Not returned if the seller does not
     * have an eBay store.
     * <br><br>
     * FindProducts returns an empty value for all items at the time of this writing.
     * FindHalfProducts returns the name of seller's Half.com Shop, which is the
     * SellerID.
     * 
     *
     * @param java.lang.String
	 */
	public void setStoreName(String storeName) {
	    this.storeName = storeName;
	}

}