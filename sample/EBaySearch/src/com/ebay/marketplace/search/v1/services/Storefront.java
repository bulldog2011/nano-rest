// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.ebay.marketplace.search.v1.services;

import com.leansoft.nano.annotation.*;
import java.util.List;

/**
 * 
 * Denotes whether the item is a storefront listing.
 * 
 */
public class Storefront   {

	@Element
	private String storeName;
    
	@Element
	private String storeURL;
    
	@Element
	private String delimiter;
    
	private List<Object> any;
    
    
	/**
     * public getter
     *
     * 
     * The name of the seller's eBay Store.
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
     * The name of the seller's eBay Store.
     * 
     *
     * @param java.lang.String
	 */
	public void setStoreName(String storeName) {
	    this.storeName = storeName;
	}
	/**
     * public getter
     *
     * 
     * The URL of the seller's eBay Store page.
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
     * The URL of the seller's eBay Store page.
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

}