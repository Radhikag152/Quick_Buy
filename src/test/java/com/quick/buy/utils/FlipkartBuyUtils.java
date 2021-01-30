package com.quick.buy.utils;
import com.qmetry.qaf.automation.ui.WebDriverTestBase;
import com.qmetry.qaf.automation.ui.webdriver.QAFExtendedWebElement;
import java.util.ArrayList;
import java.util.Set;

import com.qmetry.qaf.automation.core.TestBaseProvider;

import org.openqa.selenium.Keys;

import com.qmetry.qaf.automation.step.CommonStep;
import com.qmetry.qaf.automation.ui.WebDriverTestBase;

public class FlipkartBuyUtils {
	
	public static void login(String username, String passowrd) throws InterruptedException
	{
		CommonStep.waitForEnabled("flipkart.sigin.username", 11);
		CommonStep.sendKeys(username, "flipkart.sigin.username");
		CommonStep.sendKeys(passowrd, "flipkart.sigin.password");
		CommonStep.click("flipkart.sigin.button");
		CommonStep.waitForEnabled("flipkart.Account.label", 11);
	}
	
	public static void OrderProduct(String order) throws InterruptedException
	{
		CommonStep.waitForEnabled("flipkart.search.textbox", 11);
		CommonStep.sendKeys(order, "flipkart.search.textbox");
		CommonStep.click("flipkart.search.button");
		String productXpath = "//div[contains(text(),'"+order+"')]";
		String productHeadingXpath = "//span[contains(text(),'"+order+"')]";
		CommonStep.waitForEnabled(productXpath, 11);
		CommonStep.click(productXpath);
		Thread.sleep(1000);
		CommonStep.switchToWindow("1");
		Thread.sleep(1000);
		boolean isDisplayed = false;
		do {
			CommonStep.waitForEnabled(productHeadingXpath, 11);
			if(CommonStep.verifyVisible("flipkart.BuyNow.button"))
			{
				CommonStep.click("flipkart.BuyNow.button");
				isDisplayed = true;
			}
			else
			{
				new WebDriverTestBase().getDriver().navigate().refresh();
			}
			
		}while(isDisplayed==false);
		CommonStep.waitForEnabled("flipkart.DeliverHere.button", 11);
	}

}
