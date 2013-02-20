// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.ebay.marketplace.search.v1.services;

import com.leansoft.nano.annotation.*;

/**
 * 
 * Monetary amount.
 * 
 */
public class Amount   {

	@Value
	private double value;
    
	@Attribute  
	private String currencyId;
    
    
	/**
	 * public getter
	 *
     * @returns .double
	 */
	public double getValue() {
	    return this.value;
	}
	
	/**
	 * public setter
	 *
     * @param .double
	 */
	public void setValue(double value) {
	    this.value = value;
	}
	/**
	 * public getter
	 *
     * @returns java.lang.String
	 */
	public String getCurrencyId() {
	    return this.currencyId;
	}
	
	/**
	 * public setter
	 *
     * @param java.lang.String
	 */
	public void setCurrencyId(String currencyId) {
	    this.currencyId = currencyId;
	}

}