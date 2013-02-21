// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.ebay.marketplace.search.v1.services;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;

/**
 * 
 * Information that describes an item's condition.
 * 
 */
public class Condition implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element
	private Integer conditionId;
	
	@Element
	private String conditionDisplayName;
	
	@Element
	private String delimiter;
	
    
	/**
     * public getter
     *
     * 
     * The numeric ID (e.g., 1000) for the item condition.<br>
     * <br>
     * In item results, this is only returned when the seller listed the
     * item with a condition ID.
     * Some categories don't support or require condition IDs
     * (e.g., most Antiques categories don't). Also, until spring 2011,
     * some GTC listings may define the item condition in item specifics
     * instead, so no ID is returned.<br>
     * <br>
     * If you specify Condition in itemFilter, the response returns items
     * with the correctly matching condition(s), even if conditionId is
     * not returned. For example, if you specify a value of "New"
     * or "1000" in the item filter, the response only returns new items.
     * 
     *
     * @returns java.lang.Integer
	 */
	public Integer getConditionId() {
	    return this.conditionId;
	}
	
	/**
	 * public setter
	 *
     * 
     * The numeric ID (e.g., 1000) for the item condition.<br>
     * <br>
     * In item results, this is only returned when the seller listed the
     * item with a condition ID.
     * Some categories don't support or require condition IDs
     * (e.g., most Antiques categories don't). Also, until spring 2011,
     * some GTC listings may define the item condition in item specifics
     * instead, so no ID is returned.<br>
     * <br>
     * If you specify Condition in itemFilter, the response returns items
     * with the correctly matching condition(s), even if conditionId is
     * not returned. For example, if you specify a value of "New"
     * or "1000" in the item filter, the response only returns new items.
     * 
     *
     * @param java.lang.Integer
	 */
	public void setConditionId(Integer conditionId) {
	    this.conditionId = conditionId;
	}
	/**
     * public getter
     *
     * 
     * The human-readable label for the item condition.
     * Display names are localized for the site on which they're listed
     * (not necessarily the site on which they're viewed).<br>
     * <br>
     * In item results, this is only returned when the seller specified the item's condition
     * using a structured format eBay recognizes (e.g., conditionId or an
     * older item specifics format).<br>
     * <br>
     * <b>When conditionId is also present:</b>
     * Most categories use the same display name for the same
     * condition ID. Some categories may override the display name based
     * on buyer expectations for items in the category.
     * For example, condition ID 1000 could be called "New"
     * in one category and "New with tags" in another.
     * If an item is listed in two categories, the primary category
     * controls the display name.<br>
     * <br>
     * Behind the scenes, eBay's search engine uses the ID (not the
     * display name) to determine whether items are new, used, or
     * refurbished. So, if you need to normalize the conditions
     * across categories (such as to group items by condition),
     * it may be easier to use the ID and then show the varying
     * display names for reference.<br>
     * <br>
     * <b>In condition histograms:</b> If you search against
     * a specific category and some items match based on their
     * secondary category, the histogram only shows the display name
     * if the secondary category supports the condition.
     * (Condition IDs and names are dependent on the primary category.)
     * However, the histogram shows the condition ID and item counts.
     * This should only occur in a very small percent of results.
     * Histograms may support display names in these cases later in 2011.
     * As a workaround, you can fill in the missing name based on the
     * "Item Condition IDs and Names" (link below) or based on
     * the condition from an applicable item in the results.<br>
     * <br>
     * For example, suppose a seller lists a concert T-shirt in a
     * clothing category with the condition "New without tags" (1500),
     * and also in a music accessories secondary category (where
     * "New without tags" isn't a recognized condition).
     * If you specify the music accessories category in your request,
     * the condition ID (1500) is shown in the histogram, but not the
     * display name. However, the display name is shown within the items.
     * 
     *
     * @returns java.lang.String
	 */
	public String getConditionDisplayName() {
	    return this.conditionDisplayName;
	}
	
	/**
	 * public setter
	 *
     * 
     * The human-readable label for the item condition.
     * Display names are localized for the site on which they're listed
     * (not necessarily the site on which they're viewed).<br>
     * <br>
     * In item results, this is only returned when the seller specified the item's condition
     * using a structured format eBay recognizes (e.g., conditionId or an
     * older item specifics format).<br>
     * <br>
     * <b>When conditionId is also present:</b>
     * Most categories use the same display name for the same
     * condition ID. Some categories may override the display name based
     * on buyer expectations for items in the category.
     * For example, condition ID 1000 could be called "New"
     * in one category and "New with tags" in another.
     * If an item is listed in two categories, the primary category
     * controls the display name.<br>
     * <br>
     * Behind the scenes, eBay's search engine uses the ID (not the
     * display name) to determine whether items are new, used, or
     * refurbished. So, if you need to normalize the conditions
     * across categories (such as to group items by condition),
     * it may be easier to use the ID and then show the varying
     * display names for reference.<br>
     * <br>
     * <b>In condition histograms:</b> If you search against
     * a specific category and some items match based on their
     * secondary category, the histogram only shows the display name
     * if the secondary category supports the condition.
     * (Condition IDs and names are dependent on the primary category.)
     * However, the histogram shows the condition ID and item counts.
     * This should only occur in a very small percent of results.
     * Histograms may support display names in these cases later in 2011.
     * As a workaround, you can fill in the missing name based on the
     * "Item Condition IDs and Names" (link below) or based on
     * the condition from an applicable item in the results.<br>
     * <br>
     * For example, suppose a seller lists a concert T-shirt in a
     * clothing category with the condition "New without tags" (1500),
     * and also in a music accessories secondary category (where
     * "New without tags" isn't a recognized condition).
     * If you specify the music accessories category in your request,
     * the condition ID (1500) is shown in the histogram, but not the
     * display name. However, the display name is shown within the items.
     * 
     *
     * @param java.lang.String
	 */
	public void setConditionDisplayName(String conditionDisplayName) {
	    this.conditionDisplayName = conditionDisplayName;
	}
	/**
	 * public getter
	 *
     * @returns java.lang.String
	 */
	public String getDelimiter() {
	    return this.delimiter;
	}
	
	/**
	 * public setter
	 *
     * @param java.lang.String
	 */
	public void setDelimiter(String delimiter) {
	    this.delimiter = delimiter;
	}

}