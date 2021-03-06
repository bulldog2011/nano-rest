// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package ebay.apis.eblbasecomponents;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;

/**
 * 
 * Store color scheme.
 * 
 */
public class StoreColorSchemeType implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element(name = "ColorSchemeID")
	private Integer colorSchemeID;
	
	@Element(name = "Name")
	private String name;
	
	@Element(name = "Color")
	private StoreColorType color;
	
	@Element(name = "Font")
	private StoreFontType font;
	
    
	/**
     * public getter
     *
     * 
     * Store color scheme ID. (use GetStoreOptions to get the list of
     * valid theme color scheme IDs).
     * 
     *
     * @returns java.lang.Integer
	 */
	public Integer getColorSchemeID() {
	    return this.colorSchemeID;
	}
	
	/**
	 * public setter
	 *
     * 
     * Store color scheme ID. (use GetStoreOptions to get the list of
     * valid theme color scheme IDs).
     * 
     *
     * @param java.lang.Integer
	 */
	public void setColorSchemeID(Integer colorSchemeID) {
	    this.colorSchemeID = colorSchemeID;
	}
	/**
     * public getter
     *
     * 
     * Store color scheme name. Provides a user-friendly name for the
     * color scheme.
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
     * Store color scheme name. Provides a user-friendly name for the
     * color scheme.
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
     * Store color set.
     * 
     *
     * @returns ebay.apis.eblbasecomponents.StoreColorType
	 */
	public StoreColorType getColor() {
	    return this.color;
	}
	
	/**
	 * public setter
	 *
     * 
     * Store color set.
     * 
     *
     * @param ebay.apis.eblbasecomponents.StoreColorType
	 */
	public void setColor(StoreColorType color) {
	    this.color = color;
	}
	/**
     * public getter
     *
     * 
     * Container consisting of the Store's font properties. This container is not returned if an eBay predefined store theme is
     * used 'as is'. Use the <b>GetStoreOptions</b> 
     * call to retrieve the complete set of data for the list of predefined eBay Stores options, including the themes and color
     * schemes.
     * 
     *
     * @returns ebay.apis.eblbasecomponents.StoreFontType
	 */
	public StoreFontType getFont() {
	    return this.font;
	}
	
	/**
	 * public setter
	 *
     * 
     * Container consisting of the Store's font properties. This container is not returned if an eBay predefined store theme is
     * used 'as is'. Use the <b>GetStoreOptions</b> 
     * call to retrieve the complete set of data for the list of predefined eBay Stores options, including the themes and color
     * schemes.
     * 
     *
     * @param ebay.apis.eblbasecomponents.StoreFontType
	 */
	public void setFont(StoreFontType font) {
	    this.font = font;
	}

}