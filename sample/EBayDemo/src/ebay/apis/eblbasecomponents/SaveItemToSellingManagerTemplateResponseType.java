// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package ebay.apis.eblbasecomponents;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;

/**
 * 
 * Returns the status of save to template operation.
 * 
 */
@RootElement(name = "SaveItemToSellingManagerTemplateResponse", namespace = "urn:ebay:apis:eBLBaseComponents")
public class SaveItemToSellingManagerTemplateResponseType extends AbstractResponseType implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element(name = "TemplateID")
	private Long templateID;
	
    
	/**
     * public getter
     *
     * 
     * Template ID that is newly created.
     * 
     *
     * @returns java.lang.Long
	 */
	public Long getTemplateID() {
	    return this.templateID;
	}
	
	/**
	 * public setter
	 *
     * 
     * Template ID that is newly created.
     * 
     *
     * @param java.lang.Long
	 */
	public void setTemplateID(Long templateID) {
	    this.templateID = templateID;
	}

}