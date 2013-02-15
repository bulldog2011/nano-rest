// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.ebay.marketplace.search.v1.services;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;
import java.util.List;

/**
 * 
 * Container for URLs of thumbnail images for an item.
 * 
 */
public class GalleryInfoContainer implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element
	private List<GalleryURL> galleryURL;
	
    
	/**
     * public getter
     *
     * 
     * URL for a single item image thumbnail of a specific size.
     * 
     *
     * @returns java.util.List<com.ebay.marketplace.search.v1.services.GalleryURL>
	 */
	public List<GalleryURL> getGalleryURL() {
	    return this.galleryURL;
	}
	
	/**
	 * public setter
	 *
     * 
     * URL for a single item image thumbnail of a specific size.
     * 
     *
     * @param java.util.List<com.ebay.marketplace.search.v1.services.GalleryURL>
	 */
	public void setGalleryURL(List<GalleryURL> galleryURL) {
	    this.galleryURL = galleryURL;
	}

}