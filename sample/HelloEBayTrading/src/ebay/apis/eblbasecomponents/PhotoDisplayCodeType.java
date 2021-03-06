// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package ebay.apis.eblbasecomponents;

/**
 * 
 * Specifies the type of image display used in a listing. Some options are
 * only available if images are hosted through eBay Picture Services (EPS).
 * Cannot be used with Listing Designer layouts (specified in Item.ListingDesigner).
 * 
 */
public enum PhotoDisplayCodeType {

    /**
     * 
   * No special image display options. Valid for US Motors listings.
   * 
     */
    NONE("None"),
  

    SLIDE_SHOW("SlideShow"),
  

    /**
     *    
   * Increase the size of each image and allow buyers to enlarge images
   * further. Only available for site-hosted (EPS) images. Not valid for US Motors
   * listings. For all sites that do not automatically upgrade SuperSize to
   * PicturePack (see note below), specifying no SuperSize-qualified images is now
   * accepted in the request.
   * <br><br>
   * <span class="tablenote"><b>Note:</b>
   * SuperSize is automatically upgraded to PicturePack for the same SuperSize
   * fee on the US Motors Parts & Accessories Category and US (site ID 0)
   * and CA (site ID 2) and CAFR (site ID 210). This upgrade applies
   * only to EPS images.
   * </span>
   * <br><br>
   * 
     */
    SUPER_SIZE("SuperSize"),
  

    /**
     * 
   * Increase the number of images displayed. This is only available for
   * images hosted with eBay. See GetCategoryFeatures and the 
   * online Help (on the eBay site) for additional information. 
   * <br><br>
   * Picture Pack applies to all sites
   * (including USMotors), except for NL (site ID 146). You can specify a minimum of 
   * one EPS picture, or no SuperSize-qualified EPS pictures in the request. For 
   * the NL site, PicturePack is replaced with SuperSize.
   * 
     */
    PICTURE_PACK("PicturePack"),
  

    SITE_HOSTED_PICTURE_SHOW("SiteHostedPictureShow"),
  

    VENDOR_HOSTED_PICTURE_SHOW("VendorHostedPictureShow"),
  

    /**
     * 
   * This is valid for US Motors listing only. For other listings, use SuperSize.
   * 
     */
    SUPER_SIZE_PICTURE_SHOW("SuperSizePictureShow"),
  

    /**
     * 
   * Reserved for internal or future use.
   * 
     */
    CUSTOM_CODE("CustomCode");
  
  
    private final String value;
  
    PhotoDisplayCodeType(String v) {
        value = v;
    }
    
    public String value() {
        return value;
    }
    
    public static PhotoDisplayCodeType fromValue(String v) {
        if (v != null) {
            for (PhotoDisplayCodeType c: PhotoDisplayCodeType.values()) {
                if (c.value.equals(v)) {
                    return c;
                }
            }
        }
        throw new IllegalArgumentException(v);
    }
}