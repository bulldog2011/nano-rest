// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package ebay.apis.eblbasecomponents;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;

/**
 *  
 *          Reserved for future use..
 * 
 */
public class SIFFTASRecommendationsType implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element(name = "AttributeSetArray")
	private AttributeSetArrayType attributeSetArray;
	
    
	/**
     * public getter
     *
     * 
     *             Reserved for future use.
     * 
     *
     * @returns ebay.apis.eblbasecomponents.AttributeSetArrayType
	 */
	public AttributeSetArrayType getAttributeSetArray() {
	    return this.attributeSetArray;
	}
	
	/**
	 * public setter
	 *
     * 
     *             Reserved for future use.
     * 
     *
     * @param ebay.apis.eblbasecomponents.AttributeSetArrayType
	 */
	public void setAttributeSetArray(AttributeSetArrayType attributeSetArray) {
	    this.attributeSetArray = attributeSetArray;
	}

}