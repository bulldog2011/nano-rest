// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package ebay.apis.eblbasecomponents;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;
import java.util.List;

/**
 * 
 * Data for one theme group. Returned for GetDescriptionTemplates
 * if theme groups are requested.
 * 
 */
public class ThemeGroupType implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element(name = "GroupID")
	private Integer groupID;
	
	@Element(name = "GroupName")
	private String groupName;
	
	@Element(name = "ThemeID")
	private List<Integer> themeID;
	
	@Element(name = "ThemeTotal")
	private Integer themeTotal;
	
    
	/**
     * public getter
     *
     * 
     * Unique identifier for this theme group.
     * 
     *
     * @returns java.lang.Integer
	 */
	public Integer getGroupID() {
	    return this.groupID;
	}
	
	/**
	 * public setter
	 *
     * 
     * Unique identifier for this theme group.
     * 
     *
     * @param java.lang.Integer
	 */
	public void setGroupID(Integer groupID) {
	    this.groupID = groupID;
	}
	/**
     * public getter
     *
     * 
     * Name of this theme group (localized to the language associated 
     * with the eBay site).
     * 
     *
     * @returns java.lang.String
	 */
	public String getGroupName() {
	    return this.groupName;
	}
	
	/**
	 * public setter
	 *
     * 
     * Name of this theme group (localized to the language associated 
     * with the eBay site).
     * 
     *
     * @param java.lang.String
	 */
	public void setGroupName(String groupName) {
	    this.groupName = groupName;
	}
	/**
     * public getter
     *
     * 
     * Unique identifier for each theme in this group. There
     * is at least one theme in a theme group.
     * 
     *
     * @returns java.util.List<java.lang.Integer>
	 */
	public List<Integer> getThemeID() {
	    return this.themeID;
	}
	
	/**
	 * public setter
	 *
     * 
     * Unique identifier for each theme in this group. There
     * is at least one theme in a theme group.
     * 
     *
     * @param java.util.List<java.lang.Integer>
	 */
	public void setThemeID(List<Integer> themeID) {
	    this.themeID = themeID;
	}
	/**
     * public getter
     *
     * 
     * The number of ThemeID elements in this group.
     * 
     *
     * @returns java.lang.Integer
	 */
	public Integer getThemeTotal() {
	    return this.themeTotal;
	}
	
	/**
	 * public setter
	 *
     * 
     * The number of ThemeID elements in this group.
     * 
     *
     * @param java.lang.Integer
	 */
	public void setThemeTotal(Integer themeTotal) {
	    this.themeTotal = themeTotal;
	}

}