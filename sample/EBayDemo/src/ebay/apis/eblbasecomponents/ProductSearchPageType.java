// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package ebay.apis.eblbasecomponents;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;
import java.util.List;

/**
 * 
 * This type is deprecated as <b>GetProduct*</b> calls were deprecated.
 * 
 * 
 */
public class ProductSearchPageType implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element(name = "SearchCharacteristicsSet")
	private CharacteristicsSetType searchCharacteristicsSet;
	
	@Element(name = "SearchType")
	private CharacteristicsSearchCodeType searchType;
	
	@Element(name = "SortCharacteristics")
	private List<CharacteristicType> sortCharacteristics;
	
	@Element(name = "DataElementSet")
	private List<DataElementSetType> dataElementSet;
	
    
	/**
     * public getter
     *
     * 
     * 
     * A list of attributes that describe the choice of search criteria
     * for the specified characteristic set. The order in which the criteria are returned
     * is not significant and may vary for different requests. See the eBay Web Services guide
     * for details about how to use this data as input to GetProductSearchResults.
     * 
     *
     * @returns ebay.apis.eblbasecomponents.CharacteristicsSetType
	 */
	public CharacteristicsSetType getSearchCharacteristicsSet() {
	    return this.searchCharacteristicsSet;
	}
	
	/**
	 * public setter
	 *
     * 
     * 
     * A list of attributes that describe the choice of search criteria
     * for the specified characteristic set. The order in which the criteria are returned
     * is not significant and may vary for different requests. See the eBay Web Services guide
     * for details about how to use this data as input to GetProductSearchResults.
     * 
     *
     * @param ebay.apis.eblbasecomponents.CharacteristicsSetType
	 */
	public void setSearchCharacteristicsSet(CharacteristicsSetType searchCharacteristicsSet) {
	    this.searchCharacteristicsSet = searchCharacteristicsSet;
	}
	/**
     * public getter
     *
     * 
     * 
     *  Ignore this field. GetProductSearchPage only retrieves criteria
     *  for single-attribute searches.
     *  Use GetProductFinder for valid multi-attribute search criteria.
     * 
     *
     * @returns ebay.apis.eblbasecomponents.CharacteristicsSearchCodeType
	 */
	public CharacteristicsSearchCodeType getSearchType() {
	    return this.searchType;
	}
	
	/**
	 * public setter
	 *
     * 
     * 
     *  Ignore this field. GetProductSearchPage only retrieves criteria
     *  for single-attribute searches.
     *  Use GetProductFinder for valid multi-attribute search criteria.
     * 
     *
     * @param ebay.apis.eblbasecomponents.CharacteristicsSearchCodeType
	 */
	public void setSearchType(CharacteristicsSearchCodeType searchType) {
	    this.searchType = searchType;
	}
	/**
     * public getter
     *
     * 
     * 
     * A product aspect or feature that can be used as a key for sorting catalog
     * search results. This does not necessarily match a searchable attribute. For
     * example, you might be able to search on a product's title but sort the results
     * by the release date or the manufacturer's suggested retail price (MSRP). At
     * least one sort attribute is always returned. Applications should ensure that
     * only one attribute is selected as a sort key from these results (before
     * calling GetProductSearchResults). The default sort key is the one with the
     * lowest DisplaySequence value. The order in which the SortCharacteristics nodes
     * are returned is not significant and may vary for different requests. See the
     * eBay Web Services guide for details about how to use this data as input to
     * GetProductSearchResults.
     * 
     *
     * @returns java.util.List<ebay.apis.eblbasecomponents.CharacteristicType>
	 */
	public List<CharacteristicType> getSortCharacteristics() {
	    return this.sortCharacteristics;
	}
	
	/**
	 * public setter
	 *
     * 
     * 
     * A product aspect or feature that can be used as a key for sorting catalog
     * search results. This does not necessarily match a searchable attribute. For
     * example, you might be able to search on a product's title but sort the results
     * by the release date or the manufacturer's suggested retail price (MSRP). At
     * least one sort attribute is always returned. Applications should ensure that
     * only one attribute is selected as a sort key from these results (before
     * calling GetProductSearchResults). The default sort key is the one with the
     * lowest DisplaySequence value. The order in which the SortCharacteristics nodes
     * are returned is not significant and may vary for different requests. See the
     * eBay Web Services guide for details about how to use this data as input to
     * GetProductSearchResults.
     * 
     *
     * @param java.util.List<ebay.apis.eblbasecomponents.CharacteristicType>
	 */
	public void setSortCharacteristics(List<CharacteristicType> sortCharacteristics) {
	    this.sortCharacteristics = sortCharacteristics;
	}
	/**
     * public getter
     *
     * 
     * 
     * Contains helpful hints for the user. Usage of this information is optional.
     * 
     *
     * @returns java.util.List<ebay.apis.eblbasecomponents.DataElementSetType>
	 */
	public List<DataElementSetType> getDataElementSet() {
	    return this.dataElementSet;
	}
	
	/**
	 * public setter
	 *
     * 
     * 
     * Contains helpful hints for the user. Usage of this information is optional.
     * 
     *
     * @param java.util.List<ebay.apis.eblbasecomponents.DataElementSetType>
	 */
	public void setDataElementSet(List<DataElementSetType> dataElementSet) {
	    this.dataElementSet = dataElementSet;
	}

}