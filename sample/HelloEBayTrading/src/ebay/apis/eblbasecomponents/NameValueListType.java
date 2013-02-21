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
	
	@Element(name = "Source")
	private ItemSpecificSourceCodeType source;
	
    
	/**
     * public getter
     *
     * 
     * A name in a name/value pair.<br>
     * <br>
     * <b>For the AddItem and AddFixedPriceItem families of
     * calls:</b> In the Item.ItemSpecifics context, this can be any
     * name that the seller wants to use. However, to help buyers find
     * items more easily, it is a good idea to try to use a recommended
     * name when possible (see GetCategorySpecifics or
     * GetItemRecommendations).
     * You can't specify the same name twice within the same listing.<br>
     * <br>
     * <b>For the AddFixedPriceItem family of calls:</b>
     * In the VariationSpecifics context, this can be any name that
     * the seller wants to use, unless the VariationsEnabled flag
     * is false for the name in the GetCategorySpecifics response.
     * For example, for some categories eBay may recommend that you only
     * use "Brand" as a shared name at the Item level, not in variations.<br>
     * <br>
     * <b>For GetCategorySpecifics and GetItemRecommendations:</b>
     * This is a recommended (popular) name to use for items in the
     * specified category (e.g., "Brand" might be recommended,
     * not "Manufacturer").
     * </span>
     * <br>
     * <br>
     * <b>For PlaceOffer:</b> Required if the item being
     * purchased includes Item Variations.
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
     * A name in a name/value pair.<br>
     * <br>
     * <b>For the AddItem and AddFixedPriceItem families of
     * calls:</b> In the Item.ItemSpecifics context, this can be any
     * name that the seller wants to use. However, to help buyers find
     * items more easily, it is a good idea to try to use a recommended
     * name when possible (see GetCategorySpecifics or
     * GetItemRecommendations).
     * You can't specify the same name twice within the same listing.<br>
     * <br>
     * <b>For the AddFixedPriceItem family of calls:</b>
     * In the VariationSpecifics context, this can be any name that
     * the seller wants to use, unless the VariationsEnabled flag
     * is false for the name in the GetCategorySpecifics response.
     * For example, for some categories eBay may recommend that you only
     * use "Brand" as a shared name at the Item level, not in variations.<br>
     * <br>
     * <b>For GetCategorySpecifics and GetItemRecommendations:</b>
     * This is a recommended (popular) name to use for items in the
     * specified category (e.g., "Brand" might be recommended,
     * not "Manufacturer").
     * </span>
     * <br>
     * <br>
     * <b>For PlaceOffer:</b> Required if the item being
     * purchased includes Item Variations.
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
     * A value associated with the name.<br>
     * <br>
     * <b>For the AddItem family of calls:</b>
     * If you specify multiple values for Item Specifics,
     * eBay only stores the first one,
     * unless GetCategorySpecifics or GetItemRecommendations indicates
     * that the corresponding name supports multiple values.<br>
     * <br>
     * <b>For the AddFixedPriceItem family of calls:</b>
     * If you specify multiple values for Item Specifics or
     * Variation Specifics,
     * eBay only stores the first one,
     * unless GetCategorySpecifics or GetItemRecommendations indicates
     * that the corresponding name supports multiple values.<br>
     * <br>
     * In VariationSpecificSet, you typically specify multiple
     * Value fields for each name. For example, if Name=Size,
     * you would specify all size values that you wan to offer in the
     * listing.<br>
     * <br>
     * <b>For GetCategorySpecifics and GetItemRecommendations:</b> The most highly recommended values are returned first. For these calls,
     * Value is only returned when recommended values are available.<br>
     * <br>
     * <b>For PlaceOffer:</b> Required if the item being
     * purchased includes Item Variations.
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
     * A value associated with the name.<br>
     * <br>
     * <b>For the AddItem family of calls:</b>
     * If you specify multiple values for Item Specifics,
     * eBay only stores the first one,
     * unless GetCategorySpecifics or GetItemRecommendations indicates
     * that the corresponding name supports multiple values.<br>
     * <br>
     * <b>For the AddFixedPriceItem family of calls:</b>
     * If you specify multiple values for Item Specifics or
     * Variation Specifics,
     * eBay only stores the first one,
     * unless GetCategorySpecifics or GetItemRecommendations indicates
     * that the corresponding name supports multiple values.<br>
     * <br>
     * In VariationSpecificSet, you typically specify multiple
     * Value fields for each name. For example, if Name=Size,
     * you would specify all size values that you wan to offer in the
     * listing.<br>
     * <br>
     * <b>For GetCategorySpecifics and GetItemRecommendations:</b> The most highly recommended values are returned first. For these calls,
     * Value is only returned when recommended values are available.<br>
     * <br>
     * <b>For PlaceOffer:</b> Required if the item being
     * purchased includes Item Variations.
     * 
     *
     * @param java.util.List<java.lang.String>
	 */
	public void setValue(List<String> value) {
	    this.value = value;
	}
	/**
     * public getter
     *
     * 
     * The origin of this Item Specific. Only returned if the source is not
     * custom Item Specifics.
     * 
     *
     * @returns ebay.apis.eblbasecomponents.ItemSpecificSourceCodeType
	 */
	public ItemSpecificSourceCodeType getSource() {
	    return this.source;
	}
	
	/**
	 * public setter
	 *
     * 
     * The origin of this Item Specific. Only returned if the source is not
     * custom Item Specifics.
     * 
     *
     * @param ebay.apis.eblbasecomponents.ItemSpecificSourceCodeType
	 */
	public void setSource(ItemSpecificSourceCodeType source) {
	    this.source = source;
	}

}