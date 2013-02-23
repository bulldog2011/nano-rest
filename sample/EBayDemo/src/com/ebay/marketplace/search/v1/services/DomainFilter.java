// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.ebay.marketplace.search.v1.services;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;
import java.util.List;

/**
 * 
 * Name of the domain to which search results will be restricted.
 * 
 */
public class DomainFilter implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element
	private List<String> domainName;
	
	@Element
	private String delimiter;
	
    
	/**
     * public getter
     *
     * 
     * Specify the name of the domain to which you want to restrict search
     * results. Only items listed within the specified domain will be returned
     * in the search results. Domain names can be retrieved from an aspect
     * histogram.
     * 
     *
     * @returns java.util.List<java.lang.String>
	 */
	public List<String> getDomainName() {
	    return this.domainName;
	}
	
	/**
	 * public setter
	 *
     * 
     * Specify the name of the domain to which you want to restrict search
     * results. Only items listed within the specified domain will be returned
     * in the search results. Domain names can be retrieved from an aspect
     * histogram.
     * 
     *
     * @param java.util.List<java.lang.String>
	 */
	public void setDomainName(List<String> domainName) {
	    this.domainName = domainName;
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