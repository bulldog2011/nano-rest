// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package ebay.apis.eblbasecomponents;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;

/**
 * 
 * Shows the pagination of data returned by call requests.
 * Pagination of returned data is not needed nor
 * supported for every Trading API call. See the documentation for
 * individual calls to determine whether pagination is
 * supported, required, or desirable.
 * 
 */
public class PaginationResultType implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element(name = "TotalNumberOfPages")
	private Integer totalNumberOfPages;
	
	@Element(name = "TotalNumberOfEntries")
	private Integer totalNumberOfEntries;
	
    
	/**
     * public getter
     *
     * 
     * Indicates the total number of pages of data that could be returned by repeated
     * requests. Returned with a value of 0 if no pages are available.
     * 
     *
     * @returns java.lang.Integer
	 */
	public Integer getTotalNumberOfPages() {
	    return this.totalNumberOfPages;
	}
	
	/**
	 * public setter
	 *
     * 
     * Indicates the total number of pages of data that could be returned by repeated
     * requests. Returned with a value of 0 if no pages are available.
     * 
     *
     * @param java.lang.Integer
	 */
	public void setTotalNumberOfPages(Integer totalNumberOfPages) {
	    this.totalNumberOfPages = totalNumberOfPages;
	}
	/**
     * public getter
     *
     * 
     * Indicates the total number of entries that could be returned by repeated
     * call requests. Returned with a value of 0 if no entries are available.
     * 
     *
     * @returns java.lang.Integer
	 */
	public Integer getTotalNumberOfEntries() {
	    return this.totalNumberOfEntries;
	}
	
	/**
	 * public setter
	 *
     * 
     * Indicates the total number of entries that could be returned by repeated
     * call requests. Returned with a value of 0 if no entries are available.
     * 
     *
     * @param java.lang.Integer
	 */
	public void setTotalNumberOfEntries(Integer totalNumberOfEntries) {
	    this.totalNumberOfEntries = totalNumberOfEntries;
	}

}