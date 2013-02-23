// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package ebay.apis.eblbasecomponents;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;
import java.util.List;

/**
 * 
 * Container for reason code details for a given site.
 * 
 */
public class VeROSiteDetailType implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element(name = "Site")
	private SiteCodeType site;
	
	@Element(name = "ReasonCodeDetail")
	private List<ReasonCodeDetailType> reasonCodeDetail;
	
    
	/**
     * public getter
     *
     * 
     * The site for which reason code details are returned.
     * 
     *
     * @returns ebay.apis.eblbasecomponents.SiteCodeType
	 */
	public SiteCodeType getSite() {
	    return this.site;
	}
	
	/**
	 * public setter
	 *
     * 
     * The site for which reason code details are returned.
     * 
     *
     * @param ebay.apis.eblbasecomponents.SiteCodeType
	 */
	public void setSite(SiteCodeType site) {
	    this.site = site;
	}
	/**
     * public getter
     *
     * 
     * Contains details for a given reason code.
     * 
     *
     * @returns java.util.List<ebay.apis.eblbasecomponents.ReasonCodeDetailType>
	 */
	public List<ReasonCodeDetailType> getReasonCodeDetail() {
	    return this.reasonCodeDetail;
	}
	
	/**
	 * public setter
	 *
     * 
     * Contains details for a given reason code.
     * 
     *
     * @param java.util.List<ebay.apis.eblbasecomponents.ReasonCodeDetailType>
	 */
	public void setReasonCodeDetail(List<ReasonCodeDetailType> reasonCodeDetail) {
	    this.reasonCodeDetail = reasonCodeDetail;
	}

}