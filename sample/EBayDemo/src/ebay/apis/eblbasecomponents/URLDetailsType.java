// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package ebay.apis.eblbasecomponents;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;
import java.util.Date;

/**
 * 
 * Details about a specific eBay URL.
 * 
 */
public class URLDetailsType implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element(name = "URLType")
	private URLTypeCodeType urlType;
	
	@Element(name = "URL")
	private String url;
	
	@Element(name = "DetailVersion")
	private String detailVersion;
	
	@Element(name = "UpdateTime")
	private Date updateTime;
	
    
	/**
     * public getter
     *
     * 
     * A compressed, representative title for the eBay URL.
     * 
     *
     * @returns ebay.apis.eblbasecomponents.URLTypeCodeType
	 */
	public URLTypeCodeType getUrlType() {
	    return this.urlType;
	}
	
	/**
	 * public setter
	 *
     * 
     * A compressed, representative title for the eBay URL.
     * 
     *
     * @param ebay.apis.eblbasecomponents.URLTypeCodeType
	 */
	public void setUrlType(URLTypeCodeType urlType) {
	    this.urlType = urlType;
	}
	/**
     * public getter
     *
     * 
     * A commonly used eBay URL. Applications use some of these URLs (such as the View Item URL)
     * to launch eBay Web site pages in a browser.<br><br>
     * Logo URLs are required to be used in certain types of applications.
     * See your API license agreement. Also see this page for logo usage rules:<br>
     * http://developer.ebay.com/join/licenses/apilogousage
     * 
     *
     * @returns java.lang.String
	 */
	public String getUrl() {
	    return this.url;
	}
	
	/**
	 * public setter
	 *
     * 
     * A commonly used eBay URL. Applications use some of these URLs (such as the View Item URL)
     * to launch eBay Web site pages in a browser.<br><br>
     * Logo URLs are required to be used in certain types of applications.
     * See your API license agreement. Also see this page for logo usage rules:<br>
     * http://developer.ebay.com/join/licenses/apilogousage
     * 
     *
     * @param java.lang.String
	 */
	public void setUrl(String url) {
	    this.url = url;
	}
	/**
     * public getter
     *
     * 
     * Returns the latest version number for this field. The version can be
     * used to determine if and when to refresh cached client data.
     * 
     *
     * @returns java.lang.String
	 */
	public String getDetailVersion() {
	    return this.detailVersion;
	}
	
	/**
	 * public setter
	 *
     * 
     * Returns the latest version number for this field. The version can be
     * used to determine if and when to refresh cached client data.
     * 
     *
     * @param java.lang.String
	 */
	public void setDetailVersion(String detailVersion) {
	    this.detailVersion = detailVersion;
	}
	/**
     * public getter
     *
     * 
     * Gives the time in GMT that the feature flags for the details were last
     * updated. This timestamp can be used to determine if and when to refresh
     * cached client data.
     * 
     *
     * @returns java.util.Date
	 */
	public Date getUpdateTime() {
	    return this.updateTime;
	}
	
	/**
	 * public setter
	 *
     * 
     * Gives the time in GMT that the feature flags for the details were last
     * updated. This timestamp can be used to determine if and when to refresh
     * cached client data.
     * 
     *
     * @param java.util.Date
	 */
	public void setUpdateTime(Date updateTime) {
	    this.updateTime = updateTime;
	}

}