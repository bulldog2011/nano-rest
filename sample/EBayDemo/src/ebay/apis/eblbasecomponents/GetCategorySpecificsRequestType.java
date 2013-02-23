// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package ebay.apis.eblbasecomponents;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;
import java.util.List;
import java.util.Date;

/**
 * 
 * Returns the most popular custom Item Specific names and values for each
 * leaf category you request.
 * 
 */
@RootElement(name = "GetCategorySpecificsRequest", namespace = "urn:ebay:apis:eBLBaseComponents")
public class GetCategorySpecificsRequestType extends AbstractRequestType implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element(name = "CategoryID")
	private List<String> categoryID;
	
	@Element(name = "LastUpdateTime")
	private Date lastUpdateTime;
	
	@Element(name = "MaxNames")
	private Integer maxNames;
	
	@Element(name = "MaxValuesPerName")
	private Integer maxValuesPerName;
	
	@Element(name = "Name")
	private String name;
	
	@Element(name = "CategorySpecific")
	private List<CategoryItemSpecificsType> categorySpecific;
	
	@Element(name = "ExcludeRelationships")
	private Boolean excludeRelationships;
	
	@Element(name = "IncludeConfidence")
	private Boolean includeConfidence;
	
	@Element(name = "CategorySpecificsFileInfo")
	private Boolean categorySpecificsFileInfo;
	
    
	/**
     * public getter
     *
     * 
     * A leaf-level eBay category ID. This call retrieves recommended
     * Item Specifics (if any) for each leaf category you specify.
     * (The call returns no results for a parent category.)
     * To determine which leaf categories support listing with custom
     * Item Specifics, use GetCategoryFeatures.
     * <br><br>
     * <span class="tablenote"><b>Note:</b>
     * This call may return recommendations for categories that don't
     * support listing with custom Item Specifics. That is, the
     * presence of recommendations for a category does not necessarily
     * mean that AddItem supports custom Item Specifics for that
     * category and site.
     * </span>
     * <br><br>
     * The request requires either CategoryID, CategorySpecfics.CategoryID, or
     * CategorySpecificsFileInfo (or the call returns an error). CategoryID and
     * CategorySpecific.CategoryID can both be used in the same request.
     * (CategorySpecific offers more options to control the response.)
     * Some input fields, such as IncludeConfidence, only work when 
     * CategoryID or CategorySpecfics.CategoryID is specified.
     * <br><br>
     * You can specify multiple leaf categories, but more categories can result in
     * longer response times. If your request times out, specify fewer IDs. If you
     * specify the same ID twice, we use the first instance.
     * 
     *
     * @returns java.util.List<java.lang.String>
	 */
	public List<String> getCategoryID() {
	    return this.categoryID;
	}
	
	/**
	 * public setter
	 *
     * 
     * A leaf-level eBay category ID. This call retrieves recommended
     * Item Specifics (if any) for each leaf category you specify.
     * (The call returns no results for a parent category.)
     * To determine which leaf categories support listing with custom
     * Item Specifics, use GetCategoryFeatures.
     * <br><br>
     * <span class="tablenote"><b>Note:</b>
     * This call may return recommendations for categories that don't
     * support listing with custom Item Specifics. That is, the
     * presence of recommendations for a category does not necessarily
     * mean that AddItem supports custom Item Specifics for that
     * category and site.
     * </span>
     * <br><br>
     * The request requires either CategoryID, CategorySpecfics.CategoryID, or
     * CategorySpecificsFileInfo (or the call returns an error). CategoryID and
     * CategorySpecific.CategoryID can both be used in the same request.
     * (CategorySpecific offers more options to control the response.)
     * Some input fields, such as IncludeConfidence, only work when 
     * CategoryID or CategorySpecfics.CategoryID is specified.
     * <br><br>
     * You can specify multiple leaf categories, but more categories can result in
     * longer response times. If your request times out, specify fewer IDs. If you
     * specify the same ID twice, we use the first instance.
     * 
     *
     * @param java.util.List<java.lang.String>
	 */
	public void setCategoryID(List<String> categoryID) {
	    this.categoryID = categoryID;
	}
	/**
     * public getter
     *
     * 
     * Causes the recommendation engine to check whether the list of
     * popular Item Specifics for each specified category has changed
     * since this date and time. If specified, this call returns no
     * Item Specifics; it only returns whether the data has changed
     * for any of the requested categories.<br>
     * <br>
     * Typically, you pass in the Timestamp that was
     * returned the last time you refreshed the list of names and values
     * for the same categories. If the Updated flag returns true for any
     * categories in the response, call GetCategorySpecifics again
     * for those categories to get the latest names and values.
     * (As downloading all the data may affect your application's
     * performance, it may help to only download Item Specifics
     * for a category if they have changed since you last checked.)
     * 
     *
     * @returns java.util.Date
	 */
	public Date getLastUpdateTime() {
	    return this.lastUpdateTime;
	}
	
	/**
	 * public setter
	 *
     * 
     * Causes the recommendation engine to check whether the list of
     * popular Item Specifics for each specified category has changed
     * since this date and time. If specified, this call returns no
     * Item Specifics; it only returns whether the data has changed
     * for any of the requested categories.<br>
     * <br>
     * Typically, you pass in the Timestamp that was
     * returned the last time you refreshed the list of names and values
     * for the same categories. If the Updated flag returns true for any
     * categories in the response, call GetCategorySpecifics again
     * for those categories to get the latest names and values.
     * (As downloading all the data may affect your application's
     * performance, it may help to only download Item Specifics
     * for a category if they have changed since you last checked.)
     * 
     *
     * @param java.util.Date
	 */
	public void setLastUpdateTime(Date lastUpdateTime) {
	    this.lastUpdateTime = lastUpdateTime;
	}
	/**
     * public getter
     *
     * 
     * Maximum number of Item Specifics to return
     * per category (where each Item Specific is identified
     * by a unique name within the category).
     * Use this to retrieve fewer results per category.
     * For example, if you only want up to 2 per category
     * (the top 2 most popular names), specify 2.
     * 
     *
     * @returns java.lang.Integer
	 */
	public Integer getMaxNames() {
	    return this.maxNames;
	}
	
	/**
	 * public setter
	 *
     * 
     * Maximum number of Item Specifics to return
     * per category (where each Item Specific is identified
     * by a unique name within the category).
     * Use this to retrieve fewer results per category.
     * For example, if you only want up to 2 per category
     * (the top 2 most popular names), specify 2.
     * 
     *
     * @param java.lang.Integer
	 */
	public void setMaxNames(Integer maxNames) {
	    this.maxNames = maxNames;
	}
	/**
     * public getter
     *
     * 
     * Maximum number of values to retrieve per item specific. 
     * The best practice for using this field depends on your use case.
     * For example, if you want all possible values (such as all brands 
     * and sizes in a clothing category), then specify a very large 
     * number. (This is recommended in most cases.) If you only want the most popular value (like the most popular color), then specify a small number.
     * 
     *
     * @returns java.lang.Integer
	 */
	public Integer getMaxValuesPerName() {
	    return this.maxValuesPerName;
	}
	
	/**
	 * public setter
	 *
     * 
     * Maximum number of values to retrieve per item specific. 
     * The best practice for using this field depends on your use case.
     * For example, if you want all possible values (such as all brands 
     * and sizes in a clothing category), then specify a very large 
     * number. (This is recommended in most cases.) If you only want the most popular value (like the most popular color), then specify a small number.
     * 
     *
     * @param java.lang.Integer
	 */
	public void setMaxValuesPerName(Integer maxValuesPerName) {
	    this.maxValuesPerName = maxValuesPerName;
	}
	/**
     * public getter
     *
     * 
     * The name of one Item Specific name to find values for.
     * Use this if you want to find out whether a name
     * that the seller provided has recommended values.
     * If you specify multiple leaf categories in the request,
     * the recommendation engine returns all matching
     * names and values it finds for each of those categories.
     * At the time of this writing, this value is case-sensitive.
     * (Wildcards are not supported.)<br>
     * <br>
     * Name and CategorySpecific.ItemSpecific can be used in the
     * request. (If you plan to only use one or the other in your application,
     * you should use ItemSpecific, as it may offer more options in the future.)
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
     * The name of one Item Specific name to find values for.
     * Use this if you want to find out whether a name
     * that the seller provided has recommended values.
     * If you specify multiple leaf categories in the request,
     * the recommendation engine returns all matching
     * names and values it finds for each of those categories.
     * At the time of this writing, this value is case-sensitive.
     * (Wildcards are not supported.)<br>
     * <br>
     * Name and CategorySpecific.ItemSpecific can be used in the
     * request. (If you plan to only use one or the other in your application,
     * you should use ItemSpecific, as it may offer more options in the future.)
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
     * Applicable with request version 609 and higher. (This
     * does not retrieve data at all if your request version is lower
     * than 609.)
     * Contains a leaf category for which you want recommended
     * Item Specifics, and (optionally) names and values to help
     * you refine the recommendations.
     * You can specify multiple categories (but more categories
     * can result in longer response times). If you specify the same
     * category twice, we use the first instance.<br>
     * <br>
     * Depending on how many recommendations are found, your request
     * may time out if you specify too many categories.
     * (Typically, you can download recommendations for about 275
     * categories at a time.)<br>
     * <br>
     * CategoryID and CategorySpecific.CategoryID can be used
     * in the request. (If you plan to only use one or the other in
     * your application, you should use CategorySpecific,
     * as it may offer more options in the future.)
     * 
     *
     * @returns java.util.List<ebay.apis.eblbasecomponents.CategoryItemSpecificsType>
	 */
	public List<CategoryItemSpecificsType> getCategorySpecific() {
	    return this.categorySpecific;
	}
	
	/**
	 * public setter
	 *
     * 
     * Applicable with request version 609 and higher. (This
     * does not retrieve data at all if your request version is lower
     * than 609.)
     * Contains a leaf category for which you want recommended
     * Item Specifics, and (optionally) names and values to help
     * you refine the recommendations.
     * You can specify multiple categories (but more categories
     * can result in longer response times). If you specify the same
     * category twice, we use the first instance.<br>
     * <br>
     * Depending on how many recommendations are found, your request
     * may time out if you specify too many categories.
     * (Typically, you can download recommendations for about 275
     * categories at a time.)<br>
     * <br>
     * CategoryID and CategorySpecific.CategoryID can be used
     * in the request. (If you plan to only use one or the other in
     * your application, you should use CategorySpecific,
     * as it may offer more options in the future.)
     * 
     *
     * @param java.util.List<ebay.apis.eblbasecomponents.CategoryItemSpecificsType>
	 */
	public void setCategorySpecific(List<CategoryItemSpecificsType> categorySpecific) {
	    this.categorySpecific = categorySpecific;
	}
	/**
     * public getter
     *
     * 
     * If true, the Relationship node is not returned for any
     * recommendations. Relationship recommendations tell you whether
     * an Item Specific value has a logical dependency another
     * Item Specific.<br>
     * <br>
     * For example, in a clothing category, Size Type could be
     * recommended as a parent of Size, because Size=Small would
     * mean something different to buyers depending on whether
     * Size Type=Petite or Size Type=Plus.<br>
     * <br>
     * In general, it is a good idea to retrieve and use relationship
     * recommendations, as this data can help buyers find the items
     * they want more easily.
     * 
     *
     * @returns java.lang.Boolean
	 */
	public Boolean getExcludeRelationships() {
	    return this.excludeRelationships;
	}
	
	/**
	 * public setter
	 *
     * 
     * If true, the Relationship node is not returned for any
     * recommendations. Relationship recommendations tell you whether
     * an Item Specific value has a logical dependency another
     * Item Specific.<br>
     * <br>
     * For example, in a clothing category, Size Type could be
     * recommended as a parent of Size, because Size=Small would
     * mean something different to buyers depending on whether
     * Size Type=Petite or Size Type=Plus.<br>
     * <br>
     * In general, it is a good idea to retrieve and use relationship
     * recommendations, as this data can help buyers find the items
     * they want more easily.
     * 
     *
     * @param java.lang.Boolean
	 */
	public void setExcludeRelationships(Boolean excludeRelationships) {
	    this.excludeRelationships = excludeRelationships;
	}
	/**
     * public getter
     *
     * 
     * If true, returns eBay's level of confidence in the popularity of
     * each name and value for the specified category. 
     * Some sellers may find this useful when
     * choosing whether to use eBay's recommendation or their own
     * name or value.<br>
     * <br>
     * Requires CategoryID to also be passed in.<br>
     * <br>
     * If you try to use this with CategorySpecificsFileInfo 
     * but withoutCategoryID, the request fails and no 
     * TaskReferenceID or FileReferenceID is returned.
     * 
     *
     * @returns java.lang.Boolean
	 */
	public Boolean getIncludeConfidence() {
	    return this.includeConfidence;
	}
	
	/**
	 * public setter
	 *
     * 
     * If true, returns eBay's level of confidence in the popularity of
     * each name and value for the specified category. 
     * Some sellers may find this useful when
     * choosing whether to use eBay's recommendation or their own
     * name or value.<br>
     * <br>
     * Requires CategoryID to also be passed in.<br>
     * <br>
     * If you try to use this with CategorySpecificsFileInfo 
     * but withoutCategoryID, the request fails and no 
     * TaskReferenceID or FileReferenceID is returned.
     * 
     *
     * @param java.lang.Boolean
	 */
	public void setIncludeConfidence(Boolean includeConfidence) {
	    this.includeConfidence = includeConfidence;
	}
	/**
     * public getter
     *
     * 
     * If true, the response includes FileReferenceID and
     * TaskReferenceID. Use these IDs as inputs to the downloadFile
     * call in the eBay File Transfer API. That API lets you retrieve
     * a single (bulk) GetCategorySpecifics response with all the Item
     * Specifics recommendations available for the requested site ID.
     * (The downloadFile call downloads a .zip file as an
     * attachment.)<br>
     * <br>
     * Either CategorySpecificsFileInfo or a CategoryID is required
     * (or you can specify both). <br>
     * <br>
     * <span class="tablenote"><b>Note:</b>
     * You can use the File Transfer API without using or learning
     * about the Bulk Data Exchange API or other
     * Large Merchant Services APIs.
     * </span>
     * <br>
     * 
     *
     * @returns java.lang.Boolean
	 */
	public Boolean getCategorySpecificsFileInfo() {
	    return this.categorySpecificsFileInfo;
	}
	
	/**
	 * public setter
	 *
     * 
     * If true, the response includes FileReferenceID and
     * TaskReferenceID. Use these IDs as inputs to the downloadFile
     * call in the eBay File Transfer API. That API lets you retrieve
     * a single (bulk) GetCategorySpecifics response with all the Item
     * Specifics recommendations available for the requested site ID.
     * (The downloadFile call downloads a .zip file as an
     * attachment.)<br>
     * <br>
     * Either CategorySpecificsFileInfo or a CategoryID is required
     * (or you can specify both). <br>
     * <br>
     * <span class="tablenote"><b>Note:</b>
     * You can use the File Transfer API without using or learning
     * about the Bulk Data Exchange API or other
     * Large Merchant Services APIs.
     * </span>
     * <br>
     * 
     *
     * @param java.lang.Boolean
	 */
	public void setCategorySpecificsFileInfo(Boolean categorySpecificsFileInfo) {
	    this.categorySpecificsFileInfo = categorySpecificsFileInfo;
	}

}