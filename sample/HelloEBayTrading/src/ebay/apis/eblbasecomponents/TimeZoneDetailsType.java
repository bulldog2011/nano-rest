// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package ebay.apis.eblbasecomponents;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;
import java.util.Date;

/**
 * 
 * Time zone details about a region or location to which the seller is willing to
 * ship.
 * 
 */
public class TimeZoneDetailsType implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element(name = "TimeZoneID")
	private String timeZoneID;
	
	@Element(name = "StandardLabel")
	private String standardLabel;
	
	@Element(name = "StandardOffset")
	private String standardOffset;
	
	@Element(name = "DaylightSavingsLabel")
	private String daylightSavingsLabel;
	
	@Element(name = "DaylightSavingsOffset")
	private String daylightSavingsOffset;
	
	@Element(name = "DaylightSavingsInEffect")
	private Boolean daylightSavingsInEffect;
	
	@Element(name = "DetailVersion")
	private String detailVersion;
	
	@Element(name = "UpdateTime")
	private Date updateTime;
	
    
	/**
     * public getter
     *
     * 
     * A unique identifier for a given time zone. This ID does not change for a
     * given time zone, even if the time zone supports both standard and daylight
     * saving time variants. Valid values for TimeZoneID correspond to OLSON IDs.
     * These IDs provide not only the information as to the offset from GMT (UTC),
     * but also daylight saving time information. Thus, for example, America/Phoenix
     * is distinct from America/Denver because they have different daylight saving
     * time behavior. This value is not localized.
     * 
     *
     * @returns java.lang.String
	 */
	public String getTimeZoneID() {
	    return this.timeZoneID;
	}
	
	/**
	 * public setter
	 *
     * 
     * A unique identifier for a given time zone. This ID does not change for a
     * given time zone, even if the time zone supports both standard and daylight
     * saving time variants. Valid values for TimeZoneID correspond to OLSON IDs.
     * These IDs provide not only the information as to the offset from GMT (UTC),
     * but also daylight saving time information. Thus, for example, America/Phoenix
     * is distinct from America/Denver because they have different daylight saving
     * time behavior. This value is not localized.
     * 
     *
     * @param java.lang.String
	 */
	public void setTimeZoneID(String timeZoneID) {
	    this.timeZoneID = timeZoneID;
	}
	/**
     * public getter
     *
     * 
     * Display name of a time zone in its standard (non-daylight saving) time
     * representation. This value is localized and returned in the language for the
     * site specified in the request (i.e., the numeric site ID that you specify in
     * the request URL for the SOAP API or the X-EBAY-API-SITEID header for the XML
     * API).
     * 
     *
     * @returns java.lang.String
	 */
	public String getStandardLabel() {
	    return this.standardLabel;
	}
	
	/**
	 * public setter
	 *
     * 
     * Display name of a time zone in its standard (non-daylight saving) time
     * representation. This value is localized and returned in the language for the
     * site specified in the request (i.e., the numeric site ID that you specify in
     * the request URL for the SOAP API or the X-EBAY-API-SITEID header for the XML
     * API).
     * 
     *
     * @param java.lang.String
	 */
	public void setStandardLabel(String standardLabel) {
	    this.standardLabel = standardLabel;
	}
	/**
     * public getter
     *
     * 
     * The offset in hours from GMT for a time zone when it is not adjusted for
     * daylight saving time.
     * 
     *
     * @returns java.lang.String
	 */
	public String getStandardOffset() {
	    return this.standardOffset;
	}
	
	/**
	 * public setter
	 *
     * 
     * The offset in hours from GMT for a time zone when it is not adjusted for
     * daylight saving time.
     * 
     *
     * @param java.lang.String
	 */
	public void setStandardOffset(String standardOffset) {
	    this.standardOffset = standardOffset;
	}
	/**
     * public getter
     *
     * 
     * Display name of a time zone in its daylight saving time representation.
     * This element is emitted for time zones that support daylight saving time
     * only. The value is localized and returned in the language for the site
     * specified in the request.
     * 
     *
     * @returns java.lang.String
	 */
	public String getDaylightSavingsLabel() {
	    return this.daylightSavingsLabel;
	}
	
	/**
	 * public setter
	 *
     * 
     * Display name of a time zone in its daylight saving time representation.
     * This element is emitted for time zones that support daylight saving time
     * only. The value is localized and returned in the language for the site
     * specified in the request.
     * 
     *
     * @param java.lang.String
	 */
	public void setDaylightSavingsLabel(String daylightSavingsLabel) {
	    this.daylightSavingsLabel = daylightSavingsLabel;
	}
	/**
     * public getter
     *
     * 
     * The offset in hours from GMT for a time zone when it is on daylight saving
     * time. This element is emitted for time zones that support daylight
     * saving time only.
     * 
     *
     * @returns java.lang.String
	 */
	public String getDaylightSavingsOffset() {
	    return this.daylightSavingsOffset;
	}
	
	/**
	 * public setter
	 *
     * 
     * The offset in hours from GMT for a time zone when it is on daylight saving
     * time. This element is emitted for time zones that support daylight
     * saving time only.
     * 
     *
     * @param java.lang.String
	 */
	public void setDaylightSavingsOffset(String daylightSavingsOffset) {
	    this.daylightSavingsOffset = daylightSavingsOffset;
	}
	/**
     * public getter
     *
     * 
     * Indicates whether or not the time zone is currently on daylight saving time.
     * A value of true indicates that the time zone is on daylights savings time.
     * This element is emitted for time zones that support daylight saving time only.
     * 
     *
     * @returns java.lang.Boolean
	 */
	public Boolean getDaylightSavingsInEffect() {
	    return this.daylightSavingsInEffect;
	}
	
	/**
	 * public setter
	 *
     * 
     * Indicates whether or not the time zone is currently on daylight saving time.
     * A value of true indicates that the time zone is on daylights savings time.
     * This element is emitted for time zones that support daylight saving time only.
     * 
     *
     * @param java.lang.Boolean
	 */
	public void setDaylightSavingsInEffect(Boolean daylightSavingsInEffect) {
	    this.daylightSavingsInEffect = daylightSavingsInEffect;
	}
	/**
     * public getter
     *
     * 
     * Returns the latest version number for this field. The version can be
     * used to determine if and when to refresh cached client data.
     * 
     *
     * @returns java.lang.String
	 */
	public String getDetailVersion() {
	    return this.detailVersion;
	}
	
	/**
	 * public setter
	 *
     * 
     * Returns the latest version number for this field. The version can be
     * used to determine if and when to refresh cached client data.
     * 
     *
     * @param java.lang.String
	 */
	public void setDetailVersion(String detailVersion) {
	    this.detailVersion = detailVersion;
	}
	/**
     * public getter
     *
     * 
     * Gives the time in GMT that the feature flags for the details were last
     * updated. This timestamp can be used to determine if and when to refresh
     * cached client data.
     * 
     *
     * @returns java.util.Date
	 */
	public Date getUpdateTime() {
	    return this.updateTime;
	}
	
	/**
	 * public setter
	 *
     * 
     * Gives the time in GMT that the feature flags for the details were last
     * updated. This timestamp can be used to determine if and when to refresh
     * cached client data.
     * 
     *
     * @param java.util.Date
	 */
	public void setUpdateTime(Date updateTime) {
	    this.updateTime = updateTime;
	}

}