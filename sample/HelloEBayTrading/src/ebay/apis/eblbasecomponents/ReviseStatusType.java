// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package ebay.apis.eblbasecomponents;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;

/**
 * 
 * Contains data indicating whether an item has been revised since the
 * listing became active and, if so, which among a subset of properties
 * have been changed by the revision.
 * Output only.
 * 
 */
public class ReviseStatusType implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element(name = "ItemRevised")
	private boolean itemRevised;
	
	@Element(name = "BuyItNowAdded")
	private Boolean buyItNowAdded;
	
	@Element(name = "BuyItNowLowered")
	private Boolean buyItNowLowered;
	
	@Element(name = "ReserveLowered")
	private Boolean reserveLowered;
	
	@Element(name = "ReserveRemoved")
	private Boolean reserveRemoved;
	
    
	/**
     * public getter
     *
     * 
     * If true, indicates the item was revised since the listing became
     * active.
     * Output only.
     * 
     *
     * @returns .boolean
	 */
	public boolean getItemRevised() {
	    return this.itemRevised;
	}
	
	/**
	 * public setter
	 *
     * 
     * If true, indicates the item was revised since the listing became
     * active.
     * Output only.
     * 
     *
     * @param .boolean
	 */
	public void setItemRevised(boolean itemRevised) {
	    this.itemRevised = itemRevised;
	}
	/**
     * public getter
     *
     * 
     * If true, indicates that a Buy It Now Price was added for the item.
     * Only applicable to US eBay Motors items.
     * Output only.
     * 
     *
     * @returns java.lang.Boolean
	 */
	public Boolean getBuyItNowAdded() {
	    return this.buyItNowAdded;
	}
	
	/**
	 * public setter
	 *
     * 
     * If true, indicates that a Buy It Now Price was added for the item.
     * Only applicable to US eBay Motors items.
     * Output only.
     * 
     *
     * @param java.lang.Boolean
	 */
	public void setBuyItNowAdded(Boolean buyItNowAdded) {
	    this.buyItNowAdded = buyItNowAdded;
	}
	/**
     * public getter
     *
     * 
     * If true, indicates that the item's Buy It Now price was lowered.
     * Only applicable to US eBay Motors items.
     * Output only.
     * 
     *
     * @returns java.lang.Boolean
	 */
	public Boolean getBuyItNowLowered() {
	    return this.buyItNowLowered;
	}
	
	/**
	 * public setter
	 *
     * 
     * If true, indicates that the item's Buy It Now price was lowered.
     * Only applicable to US eBay Motors items.
     * Output only.
     * 
     *
     * @param java.lang.Boolean
	 */
	public void setBuyItNowLowered(Boolean buyItNowLowered) {
	    this.buyItNowLowered = buyItNowLowered;
	}
	/**
     * public getter
     *
     * 
     * If true, indicates that the reserve price was lowered for
     * the item. Only applicable to US eBay Motors items.
     * Output only.
     * 
     *
     * @returns java.lang.Boolean
	 */
	public Boolean getReserveLowered() {
	    return this.reserveLowered;
	}
	
	/**
	 * public setter
	 *
     * 
     * If true, indicates that the reserve price was lowered for
     * the item. Only applicable to US eBay Motors items.
     * Output only.
     * 
     *
     * @param java.lang.Boolean
	 */
	public void setReserveLowered(Boolean reserveLowered) {
	    this.reserveLowered = reserveLowered;
	}
	/**
     * public getter
     *
     * 
     * If true, indicates that the reserve price was removed
     * from the item. Only applicable to US eBay Motors items.
     * Output only.
     * 
     *
     * @returns java.lang.Boolean
	 */
	public Boolean getReserveRemoved() {
	    return this.reserveRemoved;
	}
	
	/**
	 * public setter
	 *
     * 
     * If true, indicates that the reserve price was removed
     * from the item. Only applicable to US eBay Motors items.
     * Output only.
     * 
     *
     * @param java.lang.Boolean
	 */
	public void setReserveRemoved(Boolean reserveRemoved) {
	    this.reserveRemoved = reserveRemoved;
	}

}