// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package ebay.apis.eblbasecomponents;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;
import java.util.List;

/**
 * 
 * Uploads a picture for a listing and returns a URL for the picture.
 * 
 */
@RootElement(name = "UploadSiteHostedPicturesRequest", namespace = "urn:ebay:apis:eBLBaseComponents")
public class UploadSiteHostedPicturesRequestType extends AbstractRequestType implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element(name = "PictureName")
	private String pictureName;
	
	@Element(name = "PictureSystemVersion")
	private Integer pictureSystemVersion;
	
	@Element(name = "PictureSet")
	private PictureSetCodeType pictureSet;
	
	@Element(name = "PictureData")
	private Base64BinaryType pictureData;
	
	@Element(name = "PictureUploadPolicy")
	private PictureUploadPolicyCodeType pictureUploadPolicy;
	
	@Element(name = "ExternalPictureURL")
	private List<String> externalPictureURL;
	
	@Element(name = "PictureWatermark")
	private List<PictureWatermarkCodeType> pictureWatermark;
	
	@Element(name = "ExtensionInDays")
	private Integer extensionInDays;
	
    
	/**
     * public getter
     *
     * 
     * A name you provide for the picture.
     * Returned as SiteHostedPictureDetails.PictureName in the call response.
     * 
     *
     * @returns java.lang.String
	 */
	public String getPictureName() {
	    return this.pictureName;
	}
	
	/**
	 * public setter
	 *
     * 
     * A name you provide for the picture.
     * Returned as SiteHostedPictureDetails.PictureName in the call response.
     * 
     *
     * @param java.lang.String
	 */
	public void setPictureName(String pictureName) {
	    this.pictureName = pictureName;
	}
	/**
     * public getter
     *
     * 
     * Specifies the picture system version. Only version 2 is valid.
     * Available to support future changes in the picture system version.
     * 
     *
     * @returns java.lang.Integer
	 */
	public Integer getPictureSystemVersion() {
	    return this.pictureSystemVersion;
	}
	
	/**
	 * public setter
	 *
     * 
     * Specifies the picture system version. Only version 2 is valid.
     * Available to support future changes in the picture system version.
     * 
     *
     * @param java.lang.Integer
	 */
	public void setPictureSystemVersion(Integer pictureSystemVersion) {
	    this.pictureSystemVersion = pictureSystemVersion;
	}
	/**
     * public getter
     *
     * 
     * The image sizes that will be generated.
     * 
     *
     * @returns ebay.apis.eblbasecomponents.PictureSetCodeType
	 */
	public PictureSetCodeType getPictureSet() {
	    return this.pictureSet;
	}
	
	/**
	 * public setter
	 *
     * 
     * The image sizes that will be generated.
     * 
     *
     * @param ebay.apis.eblbasecomponents.PictureSetCodeType
	 */
	public void setPictureSet(PictureSetCodeType pictureSet) {
	    this.pictureSet = pictureSet;
	}
	/**
     * public getter
     *
     * 
     * An optional reference ID to the binary attachment.
     * The PictureData field does not contain the binary attachment.
     * The binary attachment is image data,
     * including headers, from a JPG, GIF, PNG, BMP, or TIF format image file.
     * The binary attachment must be sent as a MIME attachment,
     * in your POST request, after the XML input.
     * <br>
     *         <br>
     * <b>Note: Not applicable for eBay Large Merchant Services. Use the
     * ExternalPictureURL field instead.</b>
     * 
     *
     * @returns ebay.apis.eblbasecomponents.Base64BinaryType
	 */
	public Base64BinaryType getPictureData() {
	    return this.pictureData;
	}
	
	/**
	 * public setter
	 *
     * 
     * An optional reference ID to the binary attachment.
     * The PictureData field does not contain the binary attachment.
     * The binary attachment is image data,
     * including headers, from a JPG, GIF, PNG, BMP, or TIF format image file.
     * The binary attachment must be sent as a MIME attachment,
     * in your POST request, after the XML input.
     * <br>
     *         <br>
     * <b>Note: Not applicable for eBay Large Merchant Services. Use the
     * ExternalPictureURL field instead.</b>
     * 
     *
     * @param ebay.apis.eblbasecomponents.Base64BinaryType
	 */
	public void setPictureData(Base64BinaryType pictureData) {
	    this.pictureData = pictureData;
	}
	/**
     * public getter
     *
     * 
     * When the My Picture Uploads feature is available (see the Trading API Release Notes), applications
     * (including non-listing apps, such as photo-editors and digital-camera software) will be able to use
     * the PictureUploadPolicy field to specify that an uploaded picture is available to a seller on the eBay site. When you use PictureUploadPolicy, you are specifying that the picture you uploaded (and its URL) is stored for 48 hours on the eBay site. (If, within 48 hours, the picture is associated with an item,
     * then it persists on the eBay site for the same time length as other pictures uploaded using
     * the UploadSiteHostedPictures call).
     * As a result of the storage on the eBay site, the picture is available to the seller on
     * the My Picture Uploads tab within the Sell Your Item (SYI) pages.
     * A maximum of 25 URLs can be stored.
     * 
     *
     * @returns ebay.apis.eblbasecomponents.PictureUploadPolicyCodeType
	 */
	public PictureUploadPolicyCodeType getPictureUploadPolicy() {
	    return this.pictureUploadPolicy;
	}
	
	/**
	 * public setter
	 *
     * 
     * When the My Picture Uploads feature is available (see the Trading API Release Notes), applications
     * (including non-listing apps, such as photo-editors and digital-camera software) will be able to use
     * the PictureUploadPolicy field to specify that an uploaded picture is available to a seller on the eBay site. When you use PictureUploadPolicy, you are specifying that the picture you uploaded (and its URL) is stored for 48 hours on the eBay site. (If, within 48 hours, the picture is associated with an item,
     * then it persists on the eBay site for the same time length as other pictures uploaded using
     * the UploadSiteHostedPictures call).
     * As a result of the storage on the eBay site, the picture is available to the seller on
     * the My Picture Uploads tab within the Sell Your Item (SYI) pages.
     * A maximum of 25 URLs can be stored.
     * 
     *
     * @param ebay.apis.eblbasecomponents.PictureUploadPolicyCodeType
	 */
	public void setPictureUploadPolicy(PictureUploadPolicyCodeType pictureUploadPolicy) {
	    this.pictureUploadPolicy = pictureUploadPolicy;
	}
	/**
     * public getter
     *
     * 
     *   Include the URL for a picture that you want to include in your listing.
     *   You can only include one ExternalPictureURL field per call.
     * <br><br>
     * <span class="tablenote"><b>Note:</b>
     * If a URI contains spaces, replace them with <code>%20</code>. 
     * For example, <code>http://example.com/my image.jpg</code> must be submitted as <code>http://example.com/my%20image.jpg</code> 
     * to replace the space in the image file name.
     * </span>
     *   <br>
     *         <br>
     * This field allows the eBay server to retrieve a picture from a URL on an
     * external web server. Once retrieved, the picture will be copied to
     * eBay Picture Services (EPS), and retained for 90 days, plus the length of
     * your listing duration.
     * <br>
     *         <br>
     *         <b>Note: The ExternalPictureURL field is required
     * when using eBay Large Merchant Services.</b>
     * 
     *
     * @returns java.util.List<java.lang.String>
	 */
	public List<String> getExternalPictureURL() {
	    return this.externalPictureURL;
	}
	
	/**
	 * public setter
	 *
     * 
     *   Include the URL for a picture that you want to include in your listing.
     *   You can only include one ExternalPictureURL field per call.
     * <br><br>
     * <span class="tablenote"><b>Note:</b>
     * If a URI contains spaces, replace them with <code>%20</code>. 
     * For example, <code>http://example.com/my image.jpg</code> must be submitted as <code>http://example.com/my%20image.jpg</code> 
     * to replace the space in the image file name.
     * </span>
     *   <br>
     *         <br>
     * This field allows the eBay server to retrieve a picture from a URL on an
     * external web server. Once retrieved, the picture will be copied to
     * eBay Picture Services (EPS), and retained for 90 days, plus the length of
     * your listing duration.
     * <br>
     *         <br>
     *         <b>Note: The ExternalPictureURL field is required
     * when using eBay Large Merchant Services.</b>
     * 
     *
     * @param java.util.List<java.lang.String>
	 */
	public void setExternalPictureURL(List<String> externalPictureURL) {
	    this.externalPictureURL = externalPictureURL;
	}
	/**
     * public getter
     *
     * 
     * This is the type of watermark that should be applied to the pictures hosted
     * by the eBay Picture Services. Please note that watermarks are applied only
     * to pictures that are greater than an EPS configured size. The possible
     * values are: None, Both, Icon, or SellerId.
     * 
     *
     * @returns java.util.List<ebay.apis.eblbasecomponents.PictureWatermarkCodeType>
	 */
	public List<PictureWatermarkCodeType> getPictureWatermark() {
	    return this.pictureWatermark;
	}
	
	/**
	 * public setter
	 *
     * 
     * This is the type of watermark that should be applied to the pictures hosted
     * by the eBay Picture Services. Please note that watermarks are applied only
     * to pictures that are greater than an EPS configured size. The possible
     * values are: None, Both, Icon, or SellerId.
     * 
     *
     * @param java.util.List<ebay.apis.eblbasecomponents.PictureWatermarkCodeType>
	 */
	public void setPictureWatermark(List<PictureWatermarkCodeType> pictureWatermark) {
	    this.pictureWatermark = pictureWatermark;
	}
	/**
     * public getter
     *
     * 
     * The number of days to extend the expiration date for the
     * specified image, after a listing has ended. This call is restricted to
     * applications that have been granted permission to use it by eBay
     * Developer Technical Support.
     * <br><br>
     * This call is not needed for active listings - it is meant to be used only
     *  when a photo needs to be hosted longer than the normal listing
     * duration.
     * <br><br>
     * The maximum number of days allowed for this field is 30.
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
     * The number of days to extend the expiration date for the
     * specified image, after a listing has ended. This call is restricted to
     * applications that have been granted permission to use it by eBay
     * Developer Technical Support.
     * <br><br>
     * This call is not needed for active listings - it is meant to be used only
     *  when a photo needs to be hosted longer than the normal listing
     * duration.
     * <br><br>
     * The maximum number of days allowed for this field is 30.
     * 
     *
     * @param java.lang.Integer
	 */
	public void setExtensionInDays(Integer extensionInDays) {
	    this.extensionInDays = extensionInDays;
	}

}