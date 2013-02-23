// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package ebay.apis.eblbasecomponents;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;

/**
 * 
 * Returns a list of up to 10 categories that have the highest percentage of listings
 * whose titles or descriptions contain the keywords you specify.
 * 
 */
@RootElement(name = "GetSuggestedCategoriesRequest", namespace = "urn:ebay:apis:eBLBaseComponents")
public class GetSuggestedCategoriesRequestType extends AbstractRequestType implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element(name = "Query")
	private String query;
	
    
	/**
     * public getter
     *
     * 
     * Specifies the search string, consisting of one or
     * more words to search for in the listing title.
     * The words "and" and "or" are treated like any other
     * word.
     * 
     *
     * @returns java.lang.String
	 */
	public String getQuery() {
	    return this.query;
	}
	
	/**
	 * public setter
	 *
     * 
     * Specifies the search string, consisting of one or
     * more words to search for in the listing title.
     * The words "and" and "or" are treated like any other
     * word.
     * 
     *
     * @param java.lang.String
	 */
	public void setQuery(String query) {
	    this.query = query;
	}

}