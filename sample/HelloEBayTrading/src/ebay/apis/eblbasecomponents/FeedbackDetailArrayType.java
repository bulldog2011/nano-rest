// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package ebay.apis.eblbasecomponents;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;
import java.util.List;

/**
 * 
 * Contains multiple individual feedback detail entries.
 * 
 */
public class FeedbackDetailArrayType implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element(name = "FeedbackDetail")
	private List<FeedbackDetailType> feedbackDetail;
	
    
	/**
     * public getter
     *
     * 
     * Contains a single feedback detail entry. Output only.
     * 
     *
     * @returns java.util.List<ebay.apis.eblbasecomponents.FeedbackDetailType>
	 */
	public List<FeedbackDetailType> getFeedbackDetail() {
	    return this.feedbackDetail;
	}
	
	/**
	 * public setter
	 *
     * 
     * Contains a single feedback detail entry. Output only.
     * 
     *
     * @param java.util.List<ebay.apis.eblbasecomponents.FeedbackDetailType>
	 */
	public void setFeedbackDetail(List<FeedbackDetailType> feedbackDetail) {
	    this.feedbackDetail = feedbackDetail;
	}

}