// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.ebay.marketplace.search.v1.services;

import com.leansoft.nano.annotation.*;
import java.util.List;

/**
 * 
 * A container for error details.
 * 
 */
public class ErrorData   {

	@Element
	private long errorId;
    
	@Element
	private String domain;
    
	@Element
	private ErrorSeverity severity;
    
	@Element
	private ErrorCategory category;
    
	@Element
	private String message;
    
	@Element
	private String subdomain;
    
	@Element
	private String exceptionId;
    
	@Element
	private List<ErrorParameter> parameter;
    
    
	/**
     * public getter
     *
     * 
     * A unique code that identifies the particular error condition that
     * occurred. Your application can use error codes as identifiers in your
     * customized error-handling algorithms.
     * 
     *
     * @returns .long
	 */
	public long getErrorId() {
	    return this.errorId;
	}
	
	/**
	 * public setter
	 *
     * 
     * A unique code that identifies the particular error condition that
     * occurred. Your application can use error codes as identifiers in your
     * customized error-handling algorithms.
     * 
     *
     * @param .long
	 */
	public void setErrorId(long errorId) {
	    this.errorId = errorId;
	}
	/**
     * public getter
     *
     * 
     * Name of the domain in which the error occurred.
     * <dl>
     * <dt>
     * <strong>domain values:</strong>
     * </dt>
     * <dt>
     * Marketplace
     * </dt>
     * <dd>
     * A business or validation error occurred in the service.
     * </dd>
     * <dt>
     * SOA
     * </dt>
     * <dd>
     * An exception occurred in the Service Oriented Architecture (SOA)
     * framework.
     * </dd>
     * </dl>
     * 
     *
     * @returns java.lang.String
	 */
	public String getDomain() {
	    return this.domain;
	}
	
	/**
	 * public setter
	 *
     * 
     * Name of the domain in which the error occurred.
     * <dl>
     * <dt>
     * <strong>domain values:</strong>
     * </dt>
     * <dt>
     * Marketplace
     * </dt>
     * <dd>
     * A business or validation error occurred in the service.
     * </dd>
     * <dt>
     * SOA
     * </dt>
     * <dd>
     * An exception occurred in the Service Oriented Architecture (SOA)
     * framework.
     * </dd>
     * </dl>
     * 
     *
     * @param java.lang.String
	 */
	public void setDomain(String domain) {
	    this.domain = domain;
	}
	/**
     * public getter
     *
     * 
     * Indicates whether the reported problem is fatal (an error) or is less-
     * severe (a warning). Review the error message details for information on
     * the cause.
     * <br><br>
     * If the request fails and the application is the source of the error (for
     * example, a required element is missing), update the application before
     * you retry the request. If the problem is due to incorrect user data,
     * alert the end-user to the problem and provide the means for them to
     * correct the data. Once the problem in the application or data is
     * resolved, re-send the request to eBay.
     * <br><br>
     * If the source of the problem is on eBay's side, you can retry the request
     * a reasonable number of times (eBay recommends you try the request twice).
     * If the error persists, contact Developer Technical Support. Once the
     * problem has been resolved, you can resend the request in its original
     * form.
     * <br><br>
     * If a warning occurs, warning information is returned in addition to the
     * business data. Normally, you do not need to resend the request (as the
     * original request was successful). However, depending on the cause of the
     * warning, you might need to contact the end user, or eBay, to effect a
     * long term solution to the problem.
     * 
     *
     * @returns com.ebay.marketplace.search.v1.services.ErrorSeverity
	 */
	public ErrorSeverity getSeverity() {
	    return this.severity;
	}
	
	/**
	 * public setter
	 *
     * 
     * Indicates whether the reported problem is fatal (an error) or is less-
     * severe (a warning). Review the error message details for information on
     * the cause.
     * <br><br>
     * If the request fails and the application is the source of the error (for
     * example, a required element is missing), update the application before
     * you retry the request. If the problem is due to incorrect user data,
     * alert the end-user to the problem and provide the means for them to
     * correct the data. Once the problem in the application or data is
     * resolved, re-send the request to eBay.
     * <br><br>
     * If the source of the problem is on eBay's side, you can retry the request
     * a reasonable number of times (eBay recommends you try the request twice).
     * If the error persists, contact Developer Technical Support. Once the
     * problem has been resolved, you can resend the request in its original
     * form.
     * <br><br>
     * If a warning occurs, warning information is returned in addition to the
     * business data. Normally, you do not need to resend the request (as the
     * original request was successful). However, depending on the cause of the
     * warning, you might need to contact the end user, or eBay, to effect a
     * long term solution to the problem.
     * 
     *
     * @param com.ebay.marketplace.search.v1.services.ErrorSeverity
	 */
	public void setSeverity(ErrorSeverity severity) {
	    this.severity = severity;
	}
	/**
     * public getter
     *
     * 
     * There are three categories of errors: request errors, application
     * errors, and system errors.
     * 
     *
     * @returns com.ebay.marketplace.search.v1.services.ErrorCategory
	 */
	public ErrorCategory getCategory() {
	    return this.category;
	}
	
	/**
	 * public setter
	 *
     * 
     * There are three categories of errors: request errors, application
     * errors, and system errors.
     * 
     *
     * @param com.ebay.marketplace.search.v1.services.ErrorCategory
	 */
	public void setCategory(ErrorCategory category) {
	    this.category = category;
	}
	/**
     * public getter
     *
     * 
     * A detailed description of the condition that caused in the error.
     * 
     *
     * @returns java.lang.String
	 */
	public String getMessage() {
	    return this.message;
	}
	
	/**
	 * public setter
	 *
     * 
     * A detailed description of the condition that caused in the error.
     * 
     *
     * @param java.lang.String
	 */
	public void setMessage(String message) {
	    this.message = message;
	}
	/**
     * public getter
     *
     * 
     * Name of the subdomain in which the error occurred.
     * <dl>
     * <dt>
     * <strong>subdomain values:</strong>
     * </dt>
     * <dt>
     * Finding
     * </dt>
     * <dd>
     * The error is specific to the Finding service.
     * </dd>
     * <dt>
     * MarketplaceCommon
     * </dt>
     * <dd>
     * The error is common to all Marketplace services.
     * </dd>
     * </dl>
     * 
     *
     * @returns java.lang.String
	 */
	public String getSubdomain() {
	    return this.subdomain;
	}
	
	/**
	 * public setter
	 *
     * 
     * Name of the subdomain in which the error occurred.
     * <dl>
     * <dt>
     * <strong>subdomain values:</strong>
     * </dt>
     * <dt>
     * Finding
     * </dt>
     * <dd>
     * The error is specific to the Finding service.
     * </dd>
     * <dt>
     * MarketplaceCommon
     * </dt>
     * <dd>
     * The error is common to all Marketplace services.
     * </dd>
     * </dl>
     * 
     *
     * @param java.lang.String
	 */
	public void setSubdomain(String subdomain) {
	    this.subdomain = subdomain;
	}
	/**
     * public getter
     *
     * 
     * Unique identifier for an exception associated with an error.
     * 
     *
     * @returns java.lang.String
	 */
	public String getExceptionId() {
	    return this.exceptionId;
	}
	
	/**
	 * public setter
	 *
     * 
     * Unique identifier for an exception associated with an error.
     * 
     *
     * @param java.lang.String
	 */
	public void setExceptionId(String exceptionId) {
	    this.exceptionId = exceptionId;
	}
	/**
     * public getter
     *
     * 
     * Various warning and error messages return one or more variables that
     * contain contextual information about the error. This is often the
     * field or value that triggered the error.
     * 
     *
     * @returns java.util.List<com.ebay.marketplace.search.v1.services.ErrorParameter>
	 */
	public List<ErrorParameter> getParameter() {
	    return this.parameter;
	}
	
	/**
	 * public setter
	 *
     * 
     * Various warning and error messages return one or more variables that
     * contain contextual information about the error. This is often the
     * field or value that triggered the error.
     * 
     *
     * @param java.util.List<com.ebay.marketplace.search.v1.services.ErrorParameter>
	 */
	public void setParameter(List<ErrorParameter> parameter) {
	    this.parameter = parameter;
	}

}