// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.ebay.marketplace.search.v1.services;

import com.leansoft.nano.annotation.*;
import java.util.List;

/**
 * 
 * Characteristic of an item in a domain. For example, "Shoes Size" or "Style"
 * might be aspects of the Men's Shoes domain, while "Genre" and "Album Type"
 * could be aspects of the Music CDs domain.
 * <br><br>
 * This container is not returned if there are no matching aspects for the
 * associated domain.
 * 
 */
public class Aspect   {

	@Element
	private List<AspectValueHistogram> valueHistogram;
    
	@Element
	private String delimiter;
    
	private List<Object> any;
    
	@Attribute  
	private String name;
    
    
	/**
     * public getter
     *
     * 
     * Container that returns the name of the respective aspect value and the
     * histogram (the number of available items) that share that item
     * characteristic.
     * <br><br>
     * This value is not returned if there are no matching aspects for the
     * associated domain.
     * 
     *
     * @returns java.util.List<com.ebay.marketplace.search.v1.services.AspectValueHistogram>
	 */
	public List<AspectValueHistogram> getValueHistogram() {
	    return this.valueHistogram;
	}
	
	/**
	 * public setter
	 *
     * 
     * Container that returns the name of the respective aspect value and the
     * histogram (the number of available items) that share that item
     * characteristic.
     * <br><br>
     * This value is not returned if there are no matching aspects for the
     * associated domain.
     * 
     *
     * @param java.util.List<com.ebay.marketplace.search.v1.services.AspectValueHistogram>
	 */
	public void setValueHistogram(List<AspectValueHistogram> valueHistogram) {
	    this.valueHistogram = valueHistogram;
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
	/**
	 * public getter
	 *
     * @returns java.util.List<java.lang.Object>
	 */
	public List<Object> getAny() {
	    return this.any;
	}
	
	/**
	 * public setter
	 *
     * @param java.util.List<java.lang.Object>
	 */
	public void setAny(List<Object> any) {
	    this.any = any;
	}
	/**
	 * public getter
	 *
     * @returns java.lang.String
	 */
	public String getName() {
	    return this.name;
	}
	
	/**
	 * public setter
	 *
     * @param java.lang.String
	 */
	public void setName(String name) {
	    this.name = name;
	}

}