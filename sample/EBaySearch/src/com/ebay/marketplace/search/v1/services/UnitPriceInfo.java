// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.ebay.marketplace.search.v1.services;

import com.leansoft.nano.annotation.*;

/**
 * 
 * This type provides information about the weight, volume or other quantity measurement of a
 * listed item. The European Union requires listings for certain types of products to include the
 * price per unit so buyers can accurately compare prices. eBay uses the
 * <strong>UnitType</strong> and <strong>UnitQuantity</strong> values and
 * the item's listed price to calculate and display the per-unit price on eBay EU sites.
 * 
 */
public class UnitPriceInfo   {

	@Element
	private String type;
    
	@Element
	private double quantity;
    
    
	/**
     * public getter
     *
     * 
     * Designation of size, weight, volume or count to be used to specify the unit quantity 
     * of the item. This value can be one of the following:
     * <br/><br/>
     * <pre> Kg  100g  10g  L  100ml  10ml  M  M2  M3  Unit </pre>
     * 
     *
     * @returns java.lang.String
	 */
	public String getType() {
	    return this.type;
	}
	
	/**
	 * public setter
	 *
     * 
     * Designation of size, weight, volume or count to be used to specify the unit quantity 
     * of the item. This value can be one of the following:
     * <br/><br/>
     * <pre> Kg  100g  10g  L  100ml  10ml  M  M2  M3  Unit </pre>
     * 
     *
     * @param java.lang.String
	 */
	public void setType(String type) {
	    this.type = type;
	}
	/**
     * public getter
     *
     * 
     *       Number of units of size, weight, volume or count of the specified unit type for the
     *       item. eBay divides the item price by this number to get the price per unit to be
     *       displayed in the item listing for comparison purposes.
     * 
     *
     * @returns .double
	 */
	public double getQuantity() {
	    return this.quantity;
	}
	
	/**
	 * public setter
	 *
     * 
     *       Number of units of size, weight, volume or count of the specified unit type for the
     *       item. eBay divides the item price by this number to get the price per unit to be
     *       displayed in the item listing for comparison purposes.
     * 
     *
     * @param .double
	 */
	public void setQuantity(double quantity) {
	    this.quantity = quantity;
	}

}