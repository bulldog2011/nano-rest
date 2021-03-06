// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package ebay.apis.eblbasecomponents;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;
import java.util.List;
import java.util.Date;

/**
 * 
 * Type defining the <b>UnitOfMeasurementDetails</b> container, which consists 
 * of suggested and alternative ways of referring to units of measurement.
 * 
 */
public class UnitOfMeasurementDetailsType implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element(name = "UnitOfMeasurement")
	private List<UnitOfMeasurementType> unitOfMeasurement;
	
	@Element(name = "DetailVersion")
	private String detailVersion;
	
	@Element(name = "UpdateTime")
	private Date updateTime;
	
    
	/**
     * public getter
     *
     * 
     * Container consisting of suggested (<b>SuggestedText</b> values) and
     * alternative ways (<b>AlternateText</b> values) of referring to units of
     * measurement.
     * 
     *
     * @returns java.util.List<ebay.apis.eblbasecomponents.UnitOfMeasurementType>
	 */
	public List<UnitOfMeasurementType> getUnitOfMeasurement() {
	    return this.unitOfMeasurement;
	}
	
	/**
	 * public setter
	 *
     * 
     * Container consisting of suggested (<b>SuggestedText</b> values) and
     * alternative ways (<b>AlternateText</b> values) of referring to units of
     * measurement.
     * 
     *
     * @param java.util.List<ebay.apis.eblbasecomponents.UnitOfMeasurementType>
	 */
	public void setUnitOfMeasurement(List<UnitOfMeasurementType> unitOfMeasurement) {
	    this.unitOfMeasurement = unitOfMeasurement;
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