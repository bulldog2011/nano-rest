// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package ebay.apis.eblbasecomponents;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;

/**
 * 
 * Returns information about an eBay seller's own account.
 * 
 */
@RootElement(name = "GetAccountResponse", namespace = "urn:ebay:apis:eBLBaseComponents")
public class GetAccountResponseType extends AbstractResponseType implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element(name = "AccountID")
	private String accountID;
	
	@Element(name = "AccountSummary")
	private AccountSummaryType accountSummary;
	
	@Element(name = "Currency")
	private CurrencyCodeType currency;
	
	@Element(name = "AccountEntries")
	private AccountEntriesType accountEntries;
	
	@Element(name = "PaginationResult")
	private PaginationResultType paginationResult;
	
	@Element(name = "HasMoreEntries")
	private Boolean hasMoreEntries;
	
	@Element(name = "EntriesPerPage")
	private Integer entriesPerPage;
	
	@Element(name = "PageNumber")
	private Integer pageNumber;
	
    
	/**
     * public getter
     *
     * 
     * Specifies the seller's unique account number.
     * 
     *
     * @returns java.lang.String
	 */
	public String getAccountID() {
	    return this.accountID;
	}
	
	/**
	 * public setter
	 *
     * 
     * Specifies the seller's unique account number.
     * 
     *
     * @param java.lang.String
	 */
	public void setAccountID(String accountID) {
	    this.accountID = accountID;
	}
	/**
     * public getter
     *
     * 
     * Contains summary data for the seller's account, such as the overall
     * balance, bank account and credit card information, and amount and
     * date of any past due balances. Can also contain data for
     * one or more additional accounts, if the user has changed country
     * of residence.
     * 
     *
     * @returns ebay.apis.eblbasecomponents.AccountSummaryType
	 */
	public AccountSummaryType getAccountSummary() {
	    return this.accountSummary;
	}
	
	/**
	 * public setter
	 *
     * 
     * Contains summary data for the seller's account, such as the overall
     * balance, bank account and credit card information, and amount and
     * date of any past due balances. Can also contain data for
     * one or more additional accounts, if the user has changed country
     * of residence.
     * 
     *
     * @param ebay.apis.eblbasecomponents.AccountSummaryType
	 */
	public void setAccountSummary(AccountSummaryType accountSummary) {
	    this.accountSummary = accountSummary;
	}
	/**
     * public getter
     *
     * 
     * Indicates the currency used for monetary amounts in the report.
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
     * Indicates the currency used for monetary amounts in the report.
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
     * Contains individual account entries, according to the report's scope and date range.
     * Each account entry represents one credit, debit, or administrative account action.
     * 
     *
     * @returns ebay.apis.eblbasecomponents.AccountEntriesType
	 */
	public AccountEntriesType getAccountEntries() {
	    return this.accountEntries;
	}
	
	/**
	 * public setter
	 *
     * 
     * Contains individual account entries, according to the report's scope and date range.
     * Each account entry represents one credit, debit, or administrative account action.
     * 
     *
     * @param ebay.apis.eblbasecomponents.AccountEntriesType
	 */
	public void setAccountEntries(AccountEntriesType accountEntries) {
	    this.accountEntries = accountEntries;
	}
	/**
     * public getter
     *
     * 
     * Contains the total number of pages (TotalNumberOfPages) and the total
     * number of account entries (TotalNumberOfEntries) that can be returned
     * on repeated calls with the same format and report criteria.
     * 
     *
     * @returns ebay.apis.eblbasecomponents.PaginationResultType
	 */
	public PaginationResultType getPaginationResult() {
	    return this.paginationResult;
	}
	
	/**
	 * public setter
	 *
     * 
     * Contains the total number of pages (TotalNumberOfPages) and the total
     * number of account entries (TotalNumberOfEntries) that can be returned
     * on repeated calls with the same format and report criteria.
     * 
     *
     * @param ebay.apis.eblbasecomponents.PaginationResultType
	 */
	public void setPaginationResult(PaginationResultType paginationResult) {
	    this.paginationResult = paginationResult;
	}
	/**
     * public getter
     *
     * 
     * Indicates whether there are more items yet to be retrieved. Additional calls
     * must be made to retrieve those items.
     * 
     *
     * @returns java.lang.Boolean
	 */
	public Boolean getHasMoreEntries() {
	    return this.hasMoreEntries;
	}
	
	/**
	 * public setter
	 *
     * 
     * Indicates whether there are more items yet to be retrieved. Additional calls
     * must be made to retrieve those items.
     * 
     *
     * @param java.lang.Boolean
	 */
	public void setHasMoreEntries(Boolean hasMoreEntries) {
	    this.hasMoreEntries = hasMoreEntries;
	}
	/**
     * public getter
     *
     * 
     * Specifies the number of items that are being returned per virtual page of date.
     * Value is the same as that specified in Pagination.EntriesPerPage.
     * 
     *
     * @returns java.lang.Integer
	 */
	public Integer getEntriesPerPage() {
	    return this.entriesPerPage;
	}
	
	/**
	 * public setter
	 *
     * 
     * Specifies the number of items that are being returned per virtual page of date.
     * Value is the same as that specified in Pagination.EntriesPerPage.
     * 
     *
     * @param java.lang.Integer
	 */
	public void setEntriesPerPage(Integer entriesPerPage) {
	    this.entriesPerPage = entriesPerPage;
	}
	/**
     * public getter
     *
     * 
     * Indicates which page of data was just returned. Value is the same as the value
     * specified in Pagination.PageNumber. If PageNumber in the request is higher than
     * the total number of pages, the call fails with an error.)
     * 
     *
     * @returns java.lang.Integer
	 */
	public Integer getPageNumber() {
	    return this.pageNumber;
	}
	
	/**
	 * public setter
	 *
     * 
     * Indicates which page of data was just returned. Value is the same as the value
     * specified in Pagination.PageNumber. If PageNumber in the request is higher than
     * the total number of pages, the call fails with an error.)
     * 
     *
     * @param java.lang.Integer
	 */
	public void setPageNumber(Integer pageNumber) {
	    this.pageNumber = pageNumber;
	}

}