package com.leansoft.nanorest.sample;

import com.ebay.finding.FindingConfig;
import com.ebay.shopping.ShoppingConfig;
import com.ebay.trading.TradingConfig;

public class ConfigFactory {
	
	private static FindingConfig findingConfig;
	
	private static ShoppingConfig shoppingConfig;
	
	private static TradingConfig tradingConfig;
	
	// initialize your configuration here
	static {
		findingConfig = new FindingConfig();
//		findingConfig.setServerUrl(FindingConstants.SANDBOX_ENDPOINT);
		findingConfig.setAppName("YOUR_APPNAME_HERE");
		
		shoppingConfig = new ShoppingConfig();
//		shoppingConfig.setServerUrl(ShoppingConstants.SANDBOX_ENDPOINT);
		// same as AppName above
		shoppingConfig.setAppId("YOUR_APPID_HERE");
		
		tradingConfig = new TradingConfig();
//		tradingConfig.setServerUrl(TradingConstants.SANDBOX_ENDPOINT);
		tradingConfig.seteBayToken("YOUR_TOKEN_HERE");
	}
	
	public static FindingConfig getFindingConfig() {
		return findingConfig;
	}
	
	public static ShoppingConfig getShoppingConfig() {
		return shoppingConfig;
	}

	public static TradingConfig getTradingConfig() {
		return tradingConfig;
	}
	
}
