// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package ebay.apis.eblbasecomponents;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;
import java.util.List;

/**
 * 
 * Contains an array of categories that contain listings with
 * specified keywords in their titles or descriptions. The array
 * can contain up to 10 categories.
 * 
 */
public class SuggestedCategoryArrayType implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element(name = "SuggestedCategory")
	private List<SuggestedCategoryType> suggestedCategory;
	
    
	/**
     * public getter
     *
     * 
     * Describes a category that contains listings that match
     * specified keywords in the query. Returned if a category matches the query.
     * 
     *
     * @returns java.util.List<ebay.apis.eblbasecomponents.SuggestedCategoryType>
	 */
	public List<SuggestedCategoryType> getSuggestedCategory() {
	    return this.suggestedCategory;
	}
	
	/**
	 * public setter
	 *
     * 
     * Describes a category that contains listings that match
     * specified keywords in the query. Returned if a category matches the query.
     * 
     *
     * @param java.util.List<ebay.apis.eblbasecomponents.SuggestedCategoryType>
	 */
	public void setSuggestedCategory(List<SuggestedCategoryType> suggestedCategory) {
	    this.suggestedCategory = suggestedCategory;
	}

}