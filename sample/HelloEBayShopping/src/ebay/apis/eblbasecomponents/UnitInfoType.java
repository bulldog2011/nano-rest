// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package ebay.apis.eblbasecomponents;

import com.leansoft.nano.annotation.*;
import java.util.List;

/**
 * 
 * This type provides information about the weight, volume or other quantity measurement of a listed item so buyers can compare per-unit prices. The European Union requires listings for certain types of products to include the price per unit. eBay uses this information and the item's listed price to calculate and display the unit price on eBay EU sites. 
 * 
 */
public class UnitInfoType   {

	@Element(name = "UnitType")
	private String unitType;
    
	@Element(name = "UnitQuantity")
	private Double unitQuantity;
    
	private List<Object> any;
    
    
	/**
     * public getter
     *
     * 
     * Designation of size, weight, volume or count to be used to specify the unit quantity of the item. The value can be one of the following:
     * <br/><br/>
     * <code>Kg 100g 10g L 100ml 10ml M M2 M3 Unit</code>
     * 
     *
     * @returns java.lang.String
	 */
	public String getUnitType() {
	    return this.unitType;
	}
	
	/**
	 * public setter
	 *
     * 
     * Designation of size, weight, volume or count to be used to specify the unit quantity of the item. The value can be one of the following:
     * <br/><br/>
     * <code>Kg 100g 10g L 100ml 10ml M M2 M3 Unit</code>
     * 
     *
     * @param java.lang.String
	 */
	public void setUnitType(String unitType) {
	    this.unitType = unitType;
	}
	/**
     * public getter
     *
     * 
     * Number of units of size, weight, volume or count of the item in the specified unit type. eBay will divide the item price by this number to get the price per unit that will be displayed in the item listing for comparison purposes.
     * 
     *
     * @returns java.lang.Double
	 */
	public Double getUnitQuantity() {
	    return this.unitQuantity;
	}
	
	/**
	 * public setter
	 *
     * 
     * Number of units of size, weight, volume or count of the item in the specified unit type. eBay will divide the item price by this number to get the price per unit that will be displayed in the item listing for comparison purposes.
     * 
     *
     * @param java.lang.Double
	 */
	public void setUnitQuantity(Double unitQuantity) {
	    this.unitQuantity = unitQuantity;
	}
	/**
	 * public getter
	 *
     * @returns java.util.List<java.lang.Object>
	 */
	public List<Object> getAny() {
	    return this.any;
	}
	
	/**
	 * public setter
	 *
     * @param java.util.List<java.lang.Object>
	 */
	public void setAny(List<Object> any) {
	    this.any = any;
	}

}