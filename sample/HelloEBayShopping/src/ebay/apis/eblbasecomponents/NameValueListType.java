// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package ebay.apis.eblbasecomponents;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;
import java.util.List;

/**
 * 
 * A name and corresponding value (a name/value pair).
 * 
 */
public class NameValueListType implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element(name = "Name")
	private String name;
	
	@Element(name = "Value")
	private List<String> value;
	
    
	/**
     * public getter
     *
     * 
     * The name of the item specific.
     * <br>
     * <br>
     * This field is returned only in responses if the seller included an item specific
     * Name in the listing. However, if the seller didn't also include a corresponding
     * value for the item specific, it is best to not display the name to name to avoid
     * confusing users.
     * <br>
     * <br>
     * For the item condition, this usually includes the word "Condition" for eBay US,
     * UK, Australia, and India listings; and "Artikelzustand" for eBay Germany, Austria,
     * and Switzerland listings.
     * <br>
     * <br>
     * <span class="tablenote"><b>Note:</b>
     * Ignore item specifics with SIFFTAS in the name. These are for internal use by
     * eBay and aren't meaningful to users.
     * </span>
     * 
     *
     * @returns java.lang.String
	 */
	public String getName() {
	    return this.name;
	}
	
	/**
	 * public setter
	 *
     * 
     * The name of the item specific.
     * <br>
     * <br>
     * This field is returned only in responses if the seller included an item specific
     * Name in the listing. However, if the seller didn't also include a corresponding
     * value for the item specific, it is best to not display the name to name to avoid
     * confusing users.
     * <br>
     * <br>
     * For the item condition, this usually includes the word "Condition" for eBay US,
     * UK, Australia, and India listings; and "Artikelzustand" for eBay Germany, Austria,
     * and Switzerland listings.
     * <br>
     * <br>
     * <span class="tablenote"><b>Note:</b>
     * Ignore item specifics with SIFFTAS in the name. These are for internal use by
     * eBay and aren't meaningful to users.
     * </span>
     * 
     *
     * @param java.lang.String
	 */
	public void setName(String name) {
	    this.name = name;
	}
	/**
     * public getter
     *
     * 
     * A value for the item specific.
     * <br>
     * <br>
     * This field is only returned in responses if the seller included a value
     * for an item specific. In the GetSingleItem response, this field is always
     * returned for each item specific that is returned (if any). However,
     * if the seller didn't select a value for the item specific,
     * this field may return empty, or it may return a value like "-",
     * "Not Selected", or "Unspecified" (or the equivalent in the language
     * of the site).
     * <br>
     * <br>
     * For the item condition, this usually includes the
     * word "New" or "Used" for eBay US, UK, Australia, and India listings;
     * and "Neu" or "Gebraucht" for eBay Germany, Austria, and Switzerland
     * listings.
     * 
     *
     * @returns java.util.List<java.lang.String>
	 */
	public List<String> getValue() {
	    return this.value;
	}
	
	/**
	 * public setter
	 *
     * 
     * A value for the item specific.
     * <br>
     * <br>
     * This field is only returned in responses if the seller included a value
     * for an item specific. In the GetSingleItem response, this field is always
     * returned for each item specific that is returned (if any). However,
     * if the seller didn't select a value for the item specific,
     * this field may return empty, or it may return a value like "-",
     * "Not Selected", or "Unspecified" (or the equivalent in the language
     * of the site).
     * <br>
     * <br>
     * For the item condition, this usually includes the
     * word "New" or "Used" for eBay US, UK, Australia, and India listings;
     * and "Neu" or "Gebraucht" for eBay Germany, Austria, and Switzerland
     * listings.
     * 
     *
     * @param java.util.List<java.lang.String>
	 */
	public void setValue(List<String> value) {
	    this.value = value;
	}

}