// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package ebay.apis.eblbasecomponents;

import com.leansoft.nano.annotation.*;
import java.util.List;

/**
 * 
 * Container for a list of categories.
 * 
 */
public class CategoryArrayType   {

	@Element(name = "Category")
	private List<CategoryType> category;
    
    
	/**
     * public getter
     *
     * 
     * Contains details about a category.
     * 
     *
     * @returns java.util.List<ebay.apis.eblbasecomponents.CategoryType>
	 */
	public List<CategoryType> getCategory() {
	    return this.category;
	}
	
	/**
	 * public setter
	 *
     * 
     * Contains details about a category.
     * 
     *
     * @param java.util.List<ebay.apis.eblbasecomponents.CategoryType>
	 */
	public void setCategory(List<CategoryType> category) {
	    this.category = category;
	}

}