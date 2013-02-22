// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package ebay.apis.eblbasecomponents;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;

/**
 * 
 * For searches of Selling Manager listings, specifies search type, such as ProductID or BuyerUserID,
 * and search value.
 * 
 */
public class SellingManagerSearchType implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element(name = "SearchType")
	private SellingManagerSearchTypeCodeType searchType;
	
	@Element(name = "SearchValue")
	private String searchValue;
	
    
	/**
     * public getter
     *
     * 
     * Specifies the type of value, such as ProductID or BuyerUserID, for the search.
     * 
     *
     * @returns ebay.apis.eblbasecomponents.SellingManagerSearchTypeCodeType
	 */
	public SellingManagerSearchTypeCodeType getSearchType() {
	    return this.searchType;
	}
	
	/**
	 * public setter
	 *
     * 
     * Specifies the type of value, such as ProductID or BuyerUserID, for the search.
     * 
     *
     * @param ebay.apis.eblbasecomponents.SellingManagerSearchTypeCodeType
	 */
	public void setSearchType(SellingManagerSearchTypeCodeType searchType) {
	    this.searchType = searchType;
	}
	/**
     * public getter
     *
     * 
     * String identifying the value, matching the SearchType, that the search should return listings
     * for. For example, when ProductID is specified as the SearchType, SearchValue must be a valid
     * ProductID.
     * 
     *
     * @returns java.lang.String
	 */
	public String getSearchValue() {
	    return this.searchValue;
	}
	
	/**
	 * public setter
	 *
     * 
     * String identifying the value, matching the SearchType, that the search should return listings
     * for. For example, when ProductID is specified as the SearchType, SearchValue must be a valid
     * ProductID.
     * 
     *
     * @param java.lang.String
	 */
	public void setSearchValue(String searchValue) {
	    this.searchValue = searchValue;
	}

}