// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package ebay.apis.eblbasecomponents;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;

/**
 * 
 * Store theme.
 * 
 */
public class StoreThemeType implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element(name = "ThemeID")
	private Integer themeID;
	
	@Element(name = "Name")
	private String name;
	
	@Element(name = "ColorScheme")
	private StoreColorSchemeType colorScheme;
	
    
	/**
     * public getter
     *
     * 
     * Store theme ID (use GetStoreOptions to get the list of valid theme
     * IDs).
     * 
     *
     * @returns java.lang.Integer
	 */
	public Integer getThemeID() {
	    return this.themeID;
	}
	
	/**
	 * public setter
	 *
     * 
     * Store theme ID (use GetStoreOptions to get the list of valid theme
     * IDs).
     * 
     *
     * @param java.lang.Integer
	 */
	public void setThemeID(Integer themeID) {
	    this.themeID = themeID;
	}
	/**
     * public getter
     *
     * 
     * Store theme name. Provides a user-friendly name for the theme.
     * 
     *
     * @returns java.lang.String
	 */
	public String getName() {
	    return this.name;
	}
	
	/**
	 * public setter
	 *
     * 
     * Store theme name. Provides a user-friendly name for the theme.
     * 
     *
     * @param java.lang.String
	 */
	public void setName(String name) {
	    this.name = name;
	}
	/**
     * public getter
     *
     * 
     * Theme color scheme.
     * 
     *
     * @returns ebay.apis.eblbasecomponents.StoreColorSchemeType
	 */
	public StoreColorSchemeType getColorScheme() {
	    return this.colorScheme;
	}
	
	/**
	 * public setter
	 *
     * 
     * Theme color scheme.
     * 
     *
     * @param ebay.apis.eblbasecomponents.StoreColorSchemeType
	 */
	public void setColorScheme(StoreColorSchemeType colorScheme) {
	    this.colorScheme = colorScheme;
	}

}