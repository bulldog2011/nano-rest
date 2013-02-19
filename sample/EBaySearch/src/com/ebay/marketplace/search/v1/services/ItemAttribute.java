// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.ebay.marketplace.search.v1.services;

import com.leansoft.nano.annotation.*;

/**
 * 
 * This type contains the item attribute name and value.
 * 
 */
public class ItemAttribute   {

	@Element
	private String name;
    
	@Element
	private String value;
    
    
	/**
     * public getter
     *
     * 
     * The name of an item attribute.
     * 
     *
     * @returns java.lang.String
	 */
	public String getName() {
	    return this.name;
	}
	
	/**
	 * public setter
	 *
     * 
     * The name of an item attribute.
     * 
     *
     * @param java.lang.String
	 */
	public void setName(String name) {
	    this.name = name;
	}
	/**
     * public getter
     *
     * 
     * The value of the item attribute identified by the <strong>name</strong> field.
     * 
     *
     * @returns java.lang.String
	 */
	public String getValue() {
	    return this.value;
	}
	
	/**
	 * public setter
	 *
     * 
     * The value of the item attribute identified by the <strong>name</strong> field.
     * 
     *
     * @param java.lang.String
	 */
	public void setValue(String value) {
	    this.value = value;
	}

}