// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.ebay.marketplace.search.v1.services;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;
import java.math.BigInteger;

/**
 * 
 * Reserved for future use.
 * 
 */
public class ExtensionType implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element
	private BigInteger id;
	
	@Element
	private String version;
	
	@Element
	private String contentType;
	
	@Element
	private String value;
	
    
	/**
     * public getter
     *
     * 
     * Reserved for future use.
     * 
     *
     * @returns java.math.BigInteger
	 */
	public BigInteger getId() {
	    return this.id;
	}
	
	/**
	 * public setter
	 *
     * 
     * Reserved for future use.
     * 
     *
     * @param java.math.BigInteger
	 */
	public void setId(BigInteger id) {
	    this.id = id;
	}
	/**
     * public getter
     *
     * 
     * Reserved for future use.
     * 
     *
     * @returns java.lang.String
	 */
	public String getVersion() {
	    return this.version;
	}
	
	/**
	 * public setter
	 *
     * 
     * Reserved for future use.
     * 
     *
     * @param java.lang.String
	 */
	public void setVersion(String version) {
	    this.version = version;
	}
	/**
     * public getter
     *
     * 
     * Reserved for future use.
     * 
     *
     * @returns java.lang.String
	 */
	public String getContentType() {
	    return this.contentType;
	}
	
	/**
	 * public setter
	 *
     * 
     * Reserved for future use.
     * 
     *
     * @param java.lang.String
	 */
	public void setContentType(String contentType) {
	    this.contentType = contentType;
	}
	/**
     * public getter
     *
     * 
     * Reserved for future use.
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
     * Reserved for future use.
     * 
     *
     * @param java.lang.String
	 */
	public void setValue(String value) {
	    this.value = value;
	}

}