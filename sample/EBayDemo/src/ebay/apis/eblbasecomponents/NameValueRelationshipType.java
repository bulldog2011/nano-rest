// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package ebay.apis.eblbasecomponents;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;

/**
 * 
 * Information about a parent name-value pair. Currently used to indicate
 * relationships betweenItem Specifics.
 * 
 */
public class NameValueRelationshipType implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element(name = "ParentName")
	private String parentName;
	
	@Element(name = "ParentValue")
	private String parentValue;
	
    
	/**
     * public getter
     *
     * 
     * The name of another Item Specific that the current value depends on.
     * For example, in a clothing category, "Size Type" could be recommended 
     * as a parent of Size.
     * 
     *
     * @returns java.lang.String
	 */
	public String getParentName() {
	    return this.parentName;
	}
	
	/**
	 * public setter
	 *
     * 
     * The name of another Item Specific that the current value depends on.
     * For example, in a clothing category, "Size Type" could be recommended 
     * as a parent of Size.
     * 
     *
     * @param java.lang.String
	 */
	public void setParentName(String parentName) {
	    this.parentName = parentName;
	}
	/**
     * public getter
     *
     * 
     * The value of another Item Specific that the current value depends on.
     * For example, in a clothing category, if "Size Type" is the ParentName,
     * then "Petite" could be recommended as a parent value for Size=Medium.
     * 
     *
     * @returns java.lang.String
	 */
	public String getParentValue() {
	    return this.parentValue;
	}
	
	/**
	 * public setter
	 *
     * 
     * The value of another Item Specific that the current value depends on.
     * For example, in a clothing category, if "Size Type" is the ParentName,
     * then "Petite" could be recommended as a parent value for Size=Medium.
     * 
     *
     * @param java.lang.String
	 */
	public void setParentValue(String parentValue) {
	    this.parentValue = parentValue;
	}

}