// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package ebay.apis.eblbasecomponents;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;

/**
 * 
 * This type is deprecated as the call is no longer available.
 * 
 */
public class ExtendedProductFinderIDType implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element(name = "ProductFinderID")
	private Integer productFinderID;
	
	@Element(name = "ProductFinderBuySide")
	private Boolean productFinderBuySide;
	
    
	/**
     * public getter
     *
     * 
     *         
     * A product finder ID. GetCategory2CS always (and only) returns this
     * when Category.ProductFinderIDs is returned. 
     * 
     *
     * @returns java.lang.Integer
	 */
	public Integer getProductFinderID() {
	    return this.productFinderID;
	}
	
	/**
	 * public setter
	 *
     * 
     *         
     * A product finder ID. GetCategory2CS always (and only) returns this
     * when Category.ProductFinderIDs is returned. 
     * 
     *
     * @param java.lang.Integer
	 */
	public void setProductFinderID(Integer productFinderID) {
	    this.productFinderID = productFinderID;
	}
	/**
     * public getter
     *
     * 
     *         
     * If false or not present, the product finder can be used as input to
     * GetProductSearchResults to search for catalog data (Pre-filled Item Information)
     * that a seller might want to include in a listing.
     * 
     *
     * @returns java.lang.Boolean
	 */
	public Boolean getProductFinderBuySide() {
	    return this.productFinderBuySide;
	}
	
	/**
	 * public setter
	 *
     * 
     *         
     * If false or not present, the product finder can be used as input to
     * GetProductSearchResults to search for catalog data (Pre-filled Item Information)
     * that a seller might want to include in a listing.
     * 
     *
     * @param java.lang.Boolean
	 */
	public void setProductFinderBuySide(Boolean productFinderBuySide) {
	    this.productFinderBuySide = productFinderBuySide;
	}

}