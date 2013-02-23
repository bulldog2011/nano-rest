// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package ebay.apis.eblbasecomponents;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;

/**
 * 
 * Returns the store category structure update status, when a prior 
 * SetStoreCategories call was processed asynchronously. If a SetStoreCategories 
 * request affects many listings, then the category structure changes will be 
 * processed asynchronously. If not many listings are affected by category structure 
 * changes, the status is returned in the SetStoreCategories response.
 * 
 */
@RootElement(name = "GetStoreCategoryUpdateStatusResponse", namespace = "urn:ebay:apis:eBLBaseComponents")
public class GetStoreCategoryUpdateStatusResponseType extends AbstractResponseType implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element(name = "Status")
	private TaskStatusCodeType status;
	
    
	/**
     * public getter
     *
     * 
     * The status (Pending, InProgress, Complete, or Failed) of an update to the 
     * store category structure. 
     * 
     *
     * @returns ebay.apis.eblbasecomponents.TaskStatusCodeType
	 */
	public TaskStatusCodeType getStatus() {
	    return this.status;
	}
	
	/**
	 * public setter
	 *
     * 
     * The status (Pending, InProgress, Complete, or Failed) of an update to the 
     * store category structure. 
     * 
     *
     * @param ebay.apis.eblbasecomponents.TaskStatusCodeType
	 */
	public void setStatus(TaskStatusCodeType status) {
	    this.status = status;
	}

}