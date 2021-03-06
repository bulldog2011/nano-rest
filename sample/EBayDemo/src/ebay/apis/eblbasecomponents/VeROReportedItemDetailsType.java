// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package ebay.apis.eblbasecomponents;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;
import java.util.List;

/**
 * 
 * Container for a list of reported items. Can contain zero, one, or multiple
 * VeROReportedItemType objects, each of which conveys the data for one item listing.
 * 
 */
public class VeROReportedItemDetailsType implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element(name = "ReportedItem")
	private List<VeROReportedItemType> reportedItem;
	
    
	/**
     * public getter
     *
     * 
     * Contains the data and status of a reported item.
     * 
     *
     * @returns java.util.List<ebay.apis.eblbasecomponents.VeROReportedItemType>
	 */
	public List<VeROReportedItemType> getReportedItem() {
	    return this.reportedItem;
	}
	
	/**
	 * public setter
	 *
     * 
     * Contains the data and status of a reported item.
     * 
     *
     * @param java.util.List<ebay.apis.eblbasecomponents.VeROReportedItemType>
	 */
	public void setReportedItem(List<VeROReportedItemType> reportedItem) {
	    this.reportedItem = reportedItem;
	}

}