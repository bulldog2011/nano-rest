// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package ebay.apis.eblbasecomponents;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;

/**
 * 
 * This type is deprecated as <b>GetProduct*</b> calls were deprecated.
 * 
 * 
 */
public class ProductType implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element(name = "CharacteristicsSet")
	private CharacteristicsSetType characteristicsSet;
	
	@Element(name = "DetailsURL")
	private String detailsURL;
	
	@Element(name = "NumItems")
	private Integer numItems;
	
	@Element(name = "MinPrice")
	private AmountType minPrice;
	
	@Element(name = "MaxPrice")
	private AmountType maxPrice;
	
	@Element(name = "ProductReferenceID")
	private String productReferenceID;
	
	@Attribute  
	private String productID;
	
	@Attribute  
	private String stockPhotoURL;
	
	@Attribute  
	private String title;
	
    
	/**
     * public getter
     *
     * 
     * 
     * A set of characteristics that describe the product in a standardized way.
     * In responses, only the attributes and values that applicable for the
     * specified product are returned.
     * 
     *
     * @returns ebay.apis.eblbasecomponents.CharacteristicsSetType
	 */
	public CharacteristicsSetType getCharacteristicsSet() {
	    return this.characteristicsSet;
	}
	
	/**
	 * public setter
	 *
     * 
     * 
     * A set of characteristics that describe the product in a standardized way.
     * In responses, only the attributes and values that applicable for the
     * specified product are returned.
     * 
     *
     * @param ebay.apis.eblbasecomponents.CharacteristicsSetType
	 */
	public void setCharacteristicsSet(CharacteristicsSetType characteristicsSet) {
	    this.characteristicsSet = characteristicsSet;
	}
	/**
     * public getter
     *
     * 
     * 
     * Fully qualified URL for optional information about the product,
     * such as a movie's description or film credits. This information
     * is hosted through the eBay site and cannot be edited.
     * Applications can include this URL as a link in product search results
     * so that end users can view additional descriptive details about the product.
     * 
     *
     * @returns java.lang.String
	 */
	public String getDetailsURL() {
	    return this.detailsURL;
	}
	
	/**
	 * public setter
	 *
     * 
     * 
     * Fully qualified URL for optional information about the product,
     * such as a movie's description or film credits. This information
     * is hosted through the eBay site and cannot be edited.
     * Applications can include this URL as a link in product search results
     * so that end users can view additional descriptive details about the product.
     * 
     *
     * @param java.lang.String
	 */
	public void setDetailsURL(String detailsURL) {
	    this.detailsURL = detailsURL;
	}
	/**
     * public getter
     *
     * 
     * 
     * Total number of active listings on the specified eBay site
     * that were pre-filled based on this product.
     * 
     *
     * @returns java.lang.Integer
	 */
	public Integer getNumItems() {
	    return this.numItems;
	}
	
	/**
	 * public setter
	 *
     * 
     * 
     * Total number of active listings on the specified eBay site
     * that were pre-filled based on this product.
     * 
     *
     * @param java.lang.Integer
	 */
	public void setNumItems(Integer numItems) {
	    this.numItems = numItems;
	}
	/**
     * public getter
     *
     * 
     * 
     * Lowest current price of active and ended listings on the specified eBay site that were
     * pre-filled based on this product. The value is in the specified site's currency.
     * 
     *
     * @returns ebay.apis.eblbasecomponents.AmountType
	 */
	public AmountType getMinPrice() {
	    return this.minPrice;
	}
	
	/**
	 * public setter
	 *
     * 
     * 
     * Lowest current price of active and ended listings on the specified eBay site that were
     * pre-filled based on this product. The value is in the specified site's currency.
     * 
     *
     * @param ebay.apis.eblbasecomponents.AmountType
	 */
	public void setMinPrice(AmountType minPrice) {
	    this.minPrice = minPrice;
	}
	/**
     * public getter
     *
     * 
     * 
     * Highest current price of active and ended listings on the specified eBay site that were
     * pre-filled based on this product. The value is in the specified site's currency.
     * Round numbers (such as 15.0) may only show one zero after the decimal (as with any double in the schema).
     * 
     *
     * @returns ebay.apis.eblbasecomponents.AmountType
	 */
	public AmountType getMaxPrice() {
	    return this.maxPrice;
	}
	
	/**
	 * public setter
	 *
     * 
     * 
     * Highest current price of active and ended listings on the specified eBay site that were
     * pre-filled based on this product. The value is in the specified site's currency.
     * Round numbers (such as 15.0) may only show one zero after the decimal (as with any double in the schema).
     * 
     *
     * @param ebay.apis.eblbasecomponents.AmountType
	 */
	public void setMaxPrice(AmountType maxPrice) {
	    this.maxPrice = maxPrice;
	}
	/**
     * public getter
     *
     * 
     * 
     * eBay's global reference ID for a catalog product.
     * On the eBay Web site, this is known as the "ePID". A reference ID is
     * a fixed reference to a product (regardless of version).
     * One reference ID can be associated with multiple ProductID values.
     * The value should start with "EPID", for example "EPID30971438"
     * (without quotes).
     * You can find reference IDs for products by using FindProducts in the Shopping API. You can also find the ePID on eBay's Web site.
     * <br><br>
     * If the primary and secondary categories are both catalog-enabled,
     * this ID should correspond to the primary category
     * (not the secondary category).<br>
     * <br>
     * Some sites (such as eBay US, Germany, Austria, and Switzerland) are updating,
     * replacing, deleting, or merging some products (as a result of migrating from one
     * catalog data provider to another). If you specify one of these products in a request,
     * the call may return the product with a warning, or it may return an error if the
     * product has been deleted.
     * 
     *
     * @returns java.lang.String
	 */
	public String getProductReferenceID() {
	    return this.productReferenceID;
	}
	
	/**
	 * public setter
	 *
     * 
     * 
     * eBay's global reference ID for a catalog product.
     * On the eBay Web site, this is known as the "ePID". A reference ID is
     * a fixed reference to a product (regardless of version).
     * One reference ID can be associated with multiple ProductID values.
     * The value should start with "EPID", for example "EPID30971438"
     * (without quotes).
     * You can find reference IDs for products by using FindProducts in the Shopping API. You can also find the ePID on eBay's Web site.
     * <br><br>
     * If the primary and secondary categories are both catalog-enabled,
     * this ID should correspond to the primary category
     * (not the secondary category).<br>
     * <br>
     * Some sites (such as eBay US, Germany, Austria, and Switzerland) are updating,
     * replacing, deleting, or merging some products (as a result of migrating from one
     * catalog data provider to another). If you specify one of these products in a request,
     * the call may return the product with a warning, or it may return an error if the
     * product has been deleted.
     * 
     *
     * @param java.lang.String
	 */
	public void setProductReferenceID(String productReferenceID) {
	    this.productReferenceID = productReferenceID;
	}
	/**
	 * public getter
	 *
     * @returns java.lang.String
	 */
	public String getProductID() {
	    return this.productID;
	}
	
	/**
	 * public setter
	 *
     * @param java.lang.String
	 */
	public void setProductID(String productID) {
	    this.productID = productID;
	}
	/**
	 * public getter
	 *
     * @returns java.lang.String
	 */
	public String getStockPhotoURL() {
	    return this.stockPhotoURL;
	}
	
	/**
	 * public setter
	 *
     * @param java.lang.String
	 */
	public void setStockPhotoURL(String stockPhotoURL) {
	    this.stockPhotoURL = stockPhotoURL;
	}
	/**
	 * public getter
	 *
     * @returns java.lang.String
	 */
	public String getTitle() {
	    return this.title;
	}
	
	/**
	 * public setter
	 *
     * @param java.lang.String
	 */
	public void setTitle(String title) {
	    this.title = title;
	}

}