// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package ebay.apis.eblbasecomponents;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;

/**
 * 
 * Contains the data for one additional account. An additional account is
 * created when the user has an active account and changes country of
 * registry (i.e., registers with the eBay site for the new country). A
 * new account is created and the old account becomes inactive as an
 * additional account. A user who never changes country of residency while
 * having an account will never have any additional accounts.
 * 
 */
public class AdditionalAccountType implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element(name = "Balance")
	private AmountType balance;
	
	@Element(name = "Currency")
	private CurrencyCodeType currency;
	
	@Element(name = "AccountCode")
	private String accountCode;
	
    
	/**
     * public getter
     *
     * 
     * Indicates the current balance of the additional account.
     * 
     *
     * @returns ebay.apis.eblbasecomponents.AmountType
	 */
	public AmountType getBalance() {
	    return this.balance;
	}
	
	/**
	 * public setter
	 *
     * 
     * Indicates the current balance of the additional account.
     * 
     *
     * @param ebay.apis.eblbasecomponents.AmountType
	 */
	public void setBalance(AmountType balance) {
	    this.balance = balance;
	}
	/**
     * public getter
     *
     * 
     * Indicates the currency in which monetary amounts for the additional account
     * are expressed.
     * 
     *
     * @returns ebay.apis.eblbasecomponents.CurrencyCodeType
	 */
	public CurrencyCodeType getCurrency() {
	    return this.currency;
	}
	
	/**
	 * public setter
	 *
     * 
     * Indicates the currency in which monetary amounts for the additional account
     * are expressed.
     * 
     *
     * @param ebay.apis.eblbasecomponents.CurrencyCodeType
	 */
	public void setCurrency(CurrencyCodeType currency) {
	    this.currency = currency;
	}
	/**
     * public getter
     *
     * 
     * Indicates the unique identifier for the additional account (the account ID).
     * 
     *
     * @returns java.lang.String
	 */
	public String getAccountCode() {
	    return this.accountCode;
	}
	
	/**
	 * public setter
	 *
     * 
     * Indicates the unique identifier for the additional account (the account ID).
     * 
     *
     * @param java.lang.String
	 */
	public void setAccountCode(String accountCode) {
	    this.accountCode = accountCode;
	}

}