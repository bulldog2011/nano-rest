// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package ebay.apis.eblbasecomponents;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;

/**
 * 
 * Store Preferences type.
 * 
 */
public class StorePreferencesType implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element(name = "VacationPreferences")
	private StoreVacationPreferencesType vacationPreferences;
	
    
	/**
     * public getter
     *
     * 
     * Store vacation hold preferences.
     * 
     *
     * @returns ebay.apis.eblbasecomponents.StoreVacationPreferencesType
	 */
	public StoreVacationPreferencesType getVacationPreferences() {
	    return this.vacationPreferences;
	}
	
	/**
	 * public setter
	 *
     * 
     * Store vacation hold preferences.
     * 
     *
     * @param ebay.apis.eblbasecomponents.StoreVacationPreferencesType
	 */
	public void setVacationPreferences(StoreVacationPreferencesType vacationPreferences) {
	    this.vacationPreferences = vacationPreferences;
	}

}