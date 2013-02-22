// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package ebay.apis.eblbasecomponents;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;

/**
 * 
 * A container for VeRO reason code details.
 * 
 */
public class ReasonCodeDetailType implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element(name = "BriefText")
	private String briefText;
	
	@Element(name = "DetailedText")
	private String detailedText;
	
	@Attribute  
	private Long codeID;
	
    
	/**
     * public getter
     *
     * 
     * The short description of the infringement associated with the reason code ID.
     * 
     *
     * @returns java.lang.String
	 */
	public String getBriefText() {
	    return this.briefText;
	}
	
	/**
	 * public setter
	 *
     * 
     * The short description of the infringement associated with the reason code ID.
     * 
     *
     * @param java.lang.String
	 */
	public void setBriefText(String briefText) {
	    this.briefText = briefText;
	}
	/**
     * public getter
     *
     * 
     * The long description of the infringement associated with the reason code ID.
     * 
     *
     * @returns java.lang.String
	 */
	public String getDetailedText() {
	    return this.detailedText;
	}
	
	/**
	 * public setter
	 *
     * 
     * The long description of the infringement associated with the reason code ID.
     * 
     *
     * @param java.lang.String
	 */
	public void setDetailedText(String detailedText) {
	    this.detailedText = detailedText;
	}
	/**
	 * public getter
	 *
     * @returns java.lang.Long
	 */
	public Long getCodeID() {
	    return this.codeID;
	}
	
	/**
	 * public setter
	 *
     * @param java.lang.Long
	 */
	public void setCodeID(Long codeID) {
	    this.codeID = codeID;
	}

}