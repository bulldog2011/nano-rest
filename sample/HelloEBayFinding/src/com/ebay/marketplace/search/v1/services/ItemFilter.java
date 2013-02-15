// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.ebay.marketplace.search.v1.services;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;
import java.util.List;

/**
 * 
 * Contains the specifications for limiting the number of items returned by a find request. Use <b class="con">itemFilter</b> to specify name/value pairs. You can include multiple item filters in a single request.
 * 
 */
public class ItemFilter implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element
	private String paramName;
	
	@Element
	private String paramValue;
	
	@Element
	private ItemFilterType name;
	
	@Element
	private List<String> value;
	
	@Element
	private String delimiter;
	
    
	/**
     * public getter
     *
     * 
     * In addition to filter Name/Value pairs, some itemFilters use an
     * additional parameter Name/Value pair. Specifically, filters that use
     * currency values (MaxPrice and MinPrice) make use of addition parameters.
     * When you use these itemFilters, set paramName to Currency and provide the
     * currency ID in paramValue.
     * <br><br>
     * For example, if you use the MaxPrice itemFilter, you will need to specify
     * a parameter Name of Currency with a parameter Value that specifies the
     * type of currency desired.
     * <br><br>
     * Note that for MaxPrice and MinPrice itemFilters, the default value for
     * paramName is Currency.
     * 
     *
     * @returns java.lang.String
	 */
	public String getParamName() {
	    return this.paramName;
	}
	
	/**
	 * public setter
	 *
     * 
     * In addition to filter Name/Value pairs, some itemFilters use an
     * additional parameter Name/Value pair. Specifically, filters that use
     * currency values (MaxPrice and MinPrice) make use of addition parameters.
     * When you use these itemFilters, set paramName to Currency and provide the
     * currency ID in paramValue.
     * <br><br>
     * For example, if you use the MaxPrice itemFilter, you will need to specify
     * a parameter Name of Currency with a parameter Value that specifies the
     * type of currency desired.
     * <br><br>
     * Note that for MaxPrice and MinPrice itemFilters, the default value for
     * paramName is Currency.
     * 
     *
     * @param java.lang.String
	 */
	public void setParamName(String paramName) {
	    this.paramName = paramName;
	}
	/**
     * public getter
     *
     * 
     * The currency value associated with the respective itemFilter parameter
     * Name.
     * <br><br>
     * Usually paramName is set to Currency and paramValue is set to the
     * currency type in which the monetary transaction occurs.
     * <br><br>
     * Note that for MaxPrice and MinPrice itemFilters, the default value for
     * paramValue is USD.
     * 
     *
     * @returns java.lang.String
	 */
	public String getParamValue() {
	    return this.paramValue;
	}
	
	/**
	 * public setter
	 *
     * 
     * The currency value associated with the respective itemFilter parameter
     * Name.
     * <br><br>
     * Usually paramName is set to Currency and paramValue is set to the
     * currency type in which the monetary transaction occurs.
     * <br><br>
     * Note that for MaxPrice and MinPrice itemFilters, the default value for
     * paramValue is USD.
     * 
     *
     * @param java.lang.String
	 */
	public void setParamValue(String paramValue) {
	    this.paramValue = paramValue;
	}
	/**
     * public getter
     *
     * 
     * Specify the name of the item filter you want to use. The itemFilter name
     * must have a corresponding value. You can apply multiple itemFilter
     * Name/Value pairs in a single request.
     * 
     *
     * @returns com.ebay.marketplace.search.v1.services.ItemFilterType
	 */
	public ItemFilterType getName() {
	    return this.name;
	}
	
	/**
	 * public setter
	 *
     * 
     * Specify the name of the item filter you want to use. The itemFilter name
     * must have a corresponding value. You can apply multiple itemFilter
     * Name/Value pairs in a single request.
     * 
     *
     * @param com.ebay.marketplace.search.v1.services.ItemFilterType
	 */
	public void setName(ItemFilterType name) {
	    this.name = name;
	}
	/**
     * public getter
     *
     * 
     * The value associated with the respective item filter name. Allowed values
     * and datatypes vary for a given filter name.
     * 
     *
     * @returns java.util.List<java.lang.String>
	 */
	public List<String> getValue() {
	    return this.value;
	}
	
	/**
	 * public setter
	 *
     * 
     * The value associated with the respective item filter name. Allowed values
     * and datatypes vary for a given filter name.
     * 
     *
     * @param java.util.List<java.lang.String>
	 */
	public void setValue(List<String> value) {
	    this.value = value;
	}
	/**
	 * public getter
	 *
     * @returns java.lang.String
	 */
	public String getDelimiter() {
	    return this.delimiter;
	}
	
	/**
	 * public setter
	 *
     * @param java.lang.String
	 */
	public void setDelimiter(String delimiter) {
	    this.delimiter = delimiter;
	}

}