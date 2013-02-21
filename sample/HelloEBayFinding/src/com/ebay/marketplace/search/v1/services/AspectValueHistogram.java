// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.ebay.marketplace.search.v1.services;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;

/**
 * 
 * Container for details pertaining to individual aspect values, including their
 * histogram information (item counts).
 * 
 */
public class AspectValueHistogram implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element
	private long count;
	
	@Attribute  
	private String valueName;
	
    
	/**
     * public getter
     *
     * 
     * Number of items that share the characteristic the respective aspect
     * value.
     * 
     *
     * @returns .long
	 */
	public long getCount() {
	    return this.count;
	}
	
	/**
	 * public setter
	 *
     * 
     * Number of items that share the characteristic the respective aspect
     * value.
     * 
     *
     * @param .long
	 */
	public void setCount(long count) {
	    this.count = count;
	}
	/**
	 * public getter
	 *
     * @returns java.lang.String
	 */
	public String getValueName() {
	    return this.valueName;
	}
	
	/**
	 * public setter
	 *
     * @param java.lang.String
	 */
	public void setValueName(String valueName) {
	    this.valueName = valueName;
	}

}