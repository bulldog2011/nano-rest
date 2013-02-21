// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.ebay.marketplace.search.v1.services;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;
import java.util.Date;

/**
 * 
 * Base response container for all service operations. Contains error
 * information associated with the request.
 * 
 */
public abstract class BaseServiceResponse implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element
	private AckValue ack;
	
	@Element
	private ErrorMessage errorMessage;
	
	@Element
	private String version;
	
	@Element
	private Date timestamp;
	
    
	/**
     * public getter
     *
     * 
     * Indicates whether or not errors or warnings were generated during the
     * processing of the request.
     * 
     *
     * @returns com.ebay.marketplace.search.v1.services.AckValue
	 */
	public AckValue getAck() {
	    return this.ack;
	}
	
	/**
	 * public setter
	 *
     * 
     * Indicates whether or not errors or warnings were generated during the
     * processing of the request.
     * 
     *
     * @param com.ebay.marketplace.search.v1.services.AckValue
	 */
	public void setAck(AckValue ack) {
	    this.ack = ack;
	}
	/**
     * public getter
     *
     * 
     * Description of an error or warning that occurred when eBay processed the
     * request. Not returned if the ack value is Success.
     * 
     *
     * @returns com.ebay.marketplace.search.v1.services.ErrorMessage
	 */
	public ErrorMessage getErrorMessage() {
	    return this.errorMessage;
	}
	
	/**
	 * public setter
	 *
     * 
     * Description of an error or warning that occurred when eBay processed the
     * request. Not returned if the ack value is Success.
     * 
     *
     * @param com.ebay.marketplace.search.v1.services.ErrorMessage
	 */
	public void setErrorMessage(ErrorMessage errorMessage) {
	    this.errorMessage = errorMessage;
	}
	/**
     * public getter
     *
     * 
     * The release version that eBay used to process the request. Developer
     * Technical Support may ask you for the version value if you work with them
     * to troubleshoot issues.
     * <br><br>
     * <span class="tablenote"><strong>Note:</strong>
     * The version in use is normally the latest release version, as specified
     * in the release notes. Note that eBay releases the API to international
     * sites about a week after the API version is released to the US site.
     * </span>
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
     * The release version that eBay used to process the request. Developer
     * Technical Support may ask you for the version value if you work with them
     * to troubleshoot issues.
     * <br><br>
     * <span class="tablenote"><strong>Note:</strong>
     * The version in use is normally the latest release version, as specified
     * in the release notes. Note that eBay releases the API to international
     * sites about a week after the API version is released to the US site.
     * </span>
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
     * This value represents the date and time when eBay processed the request.
     * This value is returned in GMT, the ISO 8601 date and time format (YYYY-
     * MM- DDTHH:MM:SS.SSSZ). See the "dateTime" type for information about the
     * time format, and for details on converting to and from the GMT time zone.
     * 
     *
     * @returns java.util.Date
	 */
	public Date getTimestamp() {
	    return this.timestamp;
	}
	
	/**
	 * public setter
	 *
     * 
     * This value represents the date and time when eBay processed the request.
     * This value is returned in GMT, the ISO 8601 date and time format (YYYY-
     * MM- DDTHH:MM:SS.SSSZ). See the "dateTime" type for information about the
     * time format, and for details on converting to and from the GMT time zone.
     * 
     *
     * @param java.util.Date
	 */
	public void setTimestamp(Date timestamp) {
	    this.timestamp = timestamp;
	}

}