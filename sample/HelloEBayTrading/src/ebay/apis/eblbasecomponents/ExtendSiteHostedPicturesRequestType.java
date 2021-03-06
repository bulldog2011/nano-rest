// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package ebay.apis.eblbasecomponents;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;
import java.util.List;

/**
 * 
 * Gives approved sellers the ability to extend the default and
 * ongoing lifetime of pictures uploaded to eBay.
 * 
 */
@RootElement(name = "ExtendSiteHostedPicturesRequest", namespace = "urn:ebay:apis:eBLBaseComponents")
public class ExtendSiteHostedPicturesRequestType extends AbstractRequestType implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element(name = "PictureURL")
	private List<String> pictureURL;
	
	@Element(name = "ExtensionInDays")
	private Integer extensionInDays;
	
    
	/**
     * public getter
     *
     * 
     * The URL of the image hosted by eBay Picture Services.
     * 
     *
     * @returns java.util.List<java.lang.String>
	 */
	public List<String> getPictureURL() {
	    return this.pictureURL;
	}
	
	/**
	 * public setter
	 *
     * 
     * The URL of the image hosted by eBay Picture Services.
     * 
     *
     * @param java.util.List<java.lang.String>
	 */
	public void setPictureURL(List<String> pictureURL) {
	    this.pictureURL = pictureURL;
	}
	/**
     * public getter
     *
     * 
     * The number of days by which to extend the expiration date for the
     * specified image.
     * 
     *
     * @returns java.lang.Integer
	 */
	public Integer getExtensionInDays() {
	    return this.extensionInDays;
	}
	
	/**
	 * public setter
	 *
     * 
     * The number of days by which to extend the expiration date for the
     * specified image.
     * 
     *
     * @param java.lang.Integer
	 */
	public void setExtensionInDays(Integer extensionInDays) {
	    this.extensionInDays = extensionInDays;
	}

}