// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package ebay.apis.eblbasecomponents;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;
import java.util.Date;

/**
 * 
 * Retrieves Theme and Layout specifications for the display of an item's description.
 * 
 */
@RootElement(name = "GetDescriptionTemplatesRequest", namespace = "urn:ebay:apis:eBLBaseComponents")
public class GetDescriptionTemplatesRequestType extends AbstractRequestType implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element(name = "CategoryID")
	private String categoryID;
	
	@Element(name = "LastModifiedTime")
	private Date lastModifiedTime;
	
	@Element(name = "MotorVehicles")
	private Boolean motorVehicles;
	
    
	/**
     * public getter
     *
     * 
     * The category for which to retrieve templates. Enter any
     * category ID, including Motors vehicle categories. This
     * is ignored if you also send MotorVehicles.
     * 
     *
     * @returns java.lang.String
	 */
	public String getCategoryID() {
	    return this.categoryID;
	}
	
	/**
	 * public setter
	 *
     * 
     * The category for which to retrieve templates. Enter any
     * category ID, including Motors vehicle categories. This
     * is ignored if you also send MotorVehicles.
     * 
     *
     * @param java.lang.String
	 */
	public void setCategoryID(String categoryID) {
	    this.categoryID = categoryID;
	}
	/**
     * public getter
     *
     * 
     * If specified, only those templates modified on or after the
     * specified date are returned. If not specified, all templates are returned.
     * 
     *
     * @returns java.util.Date
	 */
	public Date getLastModifiedTime() {
	    return this.lastModifiedTime;
	}
	
	/**
	 * public setter
	 *
     * 
     * If specified, only those templates modified on or after the
     * specified date are returned. If not specified, all templates are returned.
     * 
     *
     * @param java.util.Date
	 */
	public void setLastModifiedTime(Date lastModifiedTime) {
	    this.lastModifiedTime = lastModifiedTime;
	}
	/**
     * public getter
     *
     * 
     * Indicates whether to retrieve templates for motor vehicle
     * categories for eBay Motors (site 100). If true, templates
     * are returned for motor vehicle categories. If false,
     * templates are returned for non-motor vehicle categories
     * such as Parts and Accessories. If included as an input field (whether true or false), this overrides any value provided for CategoryID.
     * 
     *
     * @returns java.lang.Boolean
	 */
	public Boolean getMotorVehicles() {
	    return this.motorVehicles;
	}
	
	/**
	 * public setter
	 *
     * 
     * Indicates whether to retrieve templates for motor vehicle
     * categories for eBay Motors (site 100). If true, templates
     * are returned for motor vehicle categories. If false,
     * templates are returned for non-motor vehicle categories
     * such as Parts and Accessories. If included as an input field (whether true or false), this overrides any value provided for CategoryID.
     * 
     *
     * @param java.lang.Boolean
	 */
	public void setMotorVehicles(Boolean motorVehicles) {
	    this.motorVehicles = motorVehicles;
	}

}