// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package ebay.apis.eblbasecomponents;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;

/**
 * 
 * Contains data for controlling pagination in API requests.
 * Pagination of returned data is required for some calls and not
 * needed in or not supported for some calls. See the documentation
 * for individual calls to determine whether pagination is supported,
 * required, or desirable.
 * 
 */
public class PaginationType implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element(name = "EntriesPerPage")
	private Integer entriesPerPage;
	
	@Element(name = "PageNumber")
	private Integer pageNumber;
	
    
	/**
     * public getter
     *
     * 
     * This integer value is used to specify the maximum number of entries to return
     * in a single "page" of data. This value, along with the number of entries that
     * match the input criteria, will determine the total pages (see
     * PaginationResult.TotalNumberOfPages) in the result set. For most Trading API calls, the
     * maximum value is 200 and the default value is 25 entries per page.
     * <br><br>
     * For GetOrders, the maximum value is 100 and the default value is 25 orders per page.
     * <br><br>
     * For GetUserDisputes, this value is hard-coded at 200, and any pagination input is
     * ignored. 
     * <br><br>
     * For GetProducts, the maximum value is 20, and any higher values are
     * ignored. 
     * 
     *
     * @returns java.lang.Integer
	 */
	public Integer getEntriesPerPage() {
	    return this.entriesPerPage;
	}
	
	/**
	 * public setter
	 *
     * 
     * This integer value is used to specify the maximum number of entries to return
     * in a single "page" of data. This value, along with the number of entries that
     * match the input criteria, will determine the total pages (see
     * PaginationResult.TotalNumberOfPages) in the result set. For most Trading API calls, the
     * maximum value is 200 and the default value is 25 entries per page.
     * <br><br>
     * For GetOrders, the maximum value is 100 and the default value is 25 orders per page.
     * <br><br>
     * For GetUserDisputes, this value is hard-coded at 200, and any pagination input is
     * ignored. 
     * <br><br>
     * For GetProducts, the maximum value is 20, and any higher values are
     * ignored. 
     * 
     *
     * @param java.lang.Integer
	 */
	public void setEntriesPerPage(Integer entriesPerPage) {
	    this.entriesPerPage = entriesPerPage;
	}
	/**
     * public getter
     *
     * 
     * Specifies the number of the page of data to return in the current call.
     * Default is 1 for most calls. For some calls, the default is 0. Specify a
     * positive value equal to or lower than the number of pages available (which you
     * determine by examining the results of your initial request).
     * See the documentation for other individual calls to determine the correct
     * default value.
     * 
     *
     * @returns java.lang.Integer
	 */
	public Integer getPageNumber() {
	    return this.pageNumber;
	}
	
	/**
	 * public setter
	 *
     * 
     * Specifies the number of the page of data to return in the current call.
     * Default is 1 for most calls. For some calls, the default is 0. Specify a
     * positive value equal to or lower than the number of pages available (which you
     * determine by examining the results of your initial request).
     * See the documentation for other individual calls to determine the correct
     * default value.
     * 
     *
     * @param java.lang.Integer
	 */
	public void setPageNumber(Integer pageNumber) {
	    this.pageNumber = pageNumber;
	}

}