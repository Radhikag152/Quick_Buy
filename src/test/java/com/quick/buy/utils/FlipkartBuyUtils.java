package com.quick.buy.utils;

import org.openqa.selenium.Keys;

import com.qmetry.qaf.automation.step.CommonStep;

public class FlipkartBuyUtils {
	
	public static void login(String username, String passowrd) throws InterruptedException
	{
		CommonStep.waitForEnabled("flipkart.sigin.username", 11);
		CommonStep.sendKeys(username, "flipkart.sigin.username");
		CommonStep.sendKeys(passowrd, "flipkart.sigin.password");
		CommonStep.click("flipkart.sigin.button");
		CommonStep.waitForEnabled("flipkart.Account.label", 11);
	}

}
