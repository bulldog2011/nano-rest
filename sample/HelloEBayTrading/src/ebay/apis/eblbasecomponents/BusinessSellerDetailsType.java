// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package ebay.apis.eblbasecomponents;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;

/**
 * 
 *   Displays the seller's information (in a business card format) 
 *   as part of the data returned in the GetItem call if the seller's SellerBusinessCodeType is set to 'Commercial'. Note that this 
 *   option is only available for sites that have Business Seller 
 *   options enabled.
 * 
 */
public class BusinessSellerDetailsType implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element(name = "Address")
	private AddressType address;
	
	@Element(name = "Fax")
	private String fax;
	
	@Element(name = "Email")
	private String email;
	
	@Element(name = "AdditionalContactInformation")
	private String additionalContactInformation;
	
	@Element(name = "TradeRegistrationNumber")
	private String tradeRegistrationNumber;
	
	@Element(name = "LegalInvoice")
	private Boolean legalInvoice;
	
	@Element(name = "TermsAndConditions")
	private String termsAndConditions;
	
	@Element(name = "VATDetails")
	private VATDetailsType vatDetails;
	
    
	/**
     * public getter
     *
     * 
     * Displays the Address of the seller (in a business card 
     * format) as part of the data returned in the GetItem 
     * call if the seller's SellerBusinessCodeType is set 
     * to 'Commercial'.
     * 
     *
     * @returns ebay.apis.eblbasecomponents.AddressType
	 */
	public AddressType getAddress() {
	    return this.address;
	}
	
	/**
	 * public setter
	 *
     * 
     * Displays the Address of the seller (in a business card 
     * format) as part of the data returned in the GetItem 
     * call if the seller's SellerBusinessCodeType is set 
     * to 'Commercial'.
     * 
     *
     * @param ebay.apis.eblbasecomponents.AddressType
	 */
	public void setAddress(AddressType address) {
	    this.address = address;
	}
	/**
     * public getter
     *
     * 
     * Displays the fax number of the seller (in a business 
     * card format) as part of the data returned in the 
     * GetItem call if the seller's SellerBusinessCodeType 
     * is set to 'Commercial'.
     * 
     *
     * @returns java.lang.String
	 */
	public String getFax() {
	    return this.fax;
	}
	
	/**
	 * public setter
	 *
     * 
     * Displays the fax number of the seller (in a business 
     * card format) as part of the data returned in the 
     * GetItem call if the seller's SellerBusinessCodeType 
     * is set to 'Commercial'.
     * 
     *
     * @param java.lang.String
	 */
	public void setFax(String fax) {
	    this.fax = fax;
	}
	/**
     * public getter
     *
     * 
     * Displays the email address of the seller (in a business 
     * card format) as part of the data returned in the GetItem 
     * call if the seller's SellerBusinessCodeType is set to 
     * 'Commercial'.
     * 
     *
     * @returns java.lang.String
	 */
	public String getEmail() {
	    return this.email;
	}
	
	/**
	 * public setter
	 *
     * 
     * Displays the email address of the seller (in a business 
     * card format) as part of the data returned in the GetItem 
     * call if the seller's SellerBusinessCodeType is set to 
     * 'Commercial'.
     * 
     *
     * @param java.lang.String
	 */
	public void setEmail(String email) {
	    this.email = email;
	}
	/**
     * public getter
     *
     * 
     * Displays the AdditionalContactInformation of the seller 
     * (in a business card format) as part of the data returned 
     * in the GetItem call if the seller's SellerBusinessCodeType 
     * is set to 'Commercial'.
     * 
     *
     * @returns java.lang.String
	 */
	public String getAdditionalContactInformation() {
	    return this.additionalContactInformation;
	}
	
	/**
	 * public setter
	 *
     * 
     * Displays the AdditionalContactInformation of the seller 
     * (in a business card format) as part of the data returned 
     * in the GetItem call if the seller's SellerBusinessCodeType 
     * is set to 'Commercial'.
     * 
     *
     * @param java.lang.String
	 */
	public void setAdditionalContactInformation(String additionalContactInformation) {
	    this.additionalContactInformation = additionalContactInformation;
	}
	/**
     * public getter
     *
     * 
     * Displays the TradeRegistrationNumber of the seller (in a business 
     * card format) as part of the data returned in the GetItem call if 
     * the seller's SellerBusinessCodeType is set to 'Commercial'.
     * 
     *
     * @returns java.lang.String
	 */
	public String getTradeRegistrationNumber() {
	    return this.tradeRegistrationNumber;
	}
	
	/**
	 * public setter
	 *
     * 
     * Displays the TradeRegistrationNumber of the seller (in a business 
     * card format) as part of the data returned in the GetItem call if 
     * the seller's SellerBusinessCodeType is set to 'Commercial'.
     * 
     *
     * @param java.lang.String
	 */
	public void setTradeRegistrationNumber(String tradeRegistrationNumber) {
	    this.tradeRegistrationNumber = tradeRegistrationNumber;
	}
	/**
     * public getter
     *
     * 
     * Displays the LegalInvoice of the seller (in a business 
     * card format) as part of the data returned in the GetItem 
     * call if the seller's SellerBusinessCodeType is set to 
     * 'Commercial'.
     * 
     *
     * @returns java.lang.Boolean
	 */
	public Boolean getLegalInvoice() {
	    return this.legalInvoice;
	}
	
	/**
	 * public setter
	 *
     * 
     * Displays the LegalInvoice of the seller (in a business 
     * card format) as part of the data returned in the GetItem 
     * call if the seller's SellerBusinessCodeType is set to 
     * 'Commercial'.
     * 
     *
     * @param java.lang.Boolean
	 */
	public void setLegalInvoice(Boolean legalInvoice) {
	    this.legalInvoice = legalInvoice;
	}
	/**
     * public getter
     *
     * 
     * Displays the TermsAndConditions of the seller (in a business 
     * card format) as part of the data returned in the GetItem 
     * call if the seller's SellerBusinessCodeType is set to 
     * 'Commercial'.
     * 
     *
     * @returns java.lang.String
	 */
	public String getTermsAndConditions() {
	    return this.termsAndConditions;
	}
	
	/**
	 * public setter
	 *
     * 
     * Displays the TermsAndConditions of the seller (in a business 
     * card format) as part of the data returned in the GetItem 
     * call if the seller's SellerBusinessCodeType is set to 
     * 'Commercial'.
     * 
     *
     * @param java.lang.String
	 */
	public void setTermsAndConditions(String termsAndConditions) {
	    this.termsAndConditions = termsAndConditions;
	}
	/**
     * public getter
     *
     * 
     * Displays the VATDetails of the seller (in a business 
     * card format) as part of the data returned in the 
     * GetItem call if the seller's SellerBusinessCodeType 
     * is set to 'Commercial'.
     * 
     *
     * @returns ebay.apis.eblbasecomponents.VATDetailsType
	 */
	public VATDetailsType getVatDetails() {
	    return this.vatDetails;
	}
	
	/**
	 * public setter
	 *
     * 
     * Displays the VATDetails of the seller (in a business 
     * card format) as part of the data returned in the 
     * GetItem call if the seller's SellerBusinessCodeType 
     * is set to 'Commercial'.
     * 
     *
     * @param ebay.apis.eblbasecomponents.VATDetailsType
	 */
	public void setVatDetails(VATDetailsType vatDetails) {
	    this.vatDetails = vatDetails;
	}

}