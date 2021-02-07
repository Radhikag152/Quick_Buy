
package com.quick.buy.utils;

import org.openqa.selenium.Keys;

import com.qmetry.qaf.automation.step.CommonStep;
import com.qmetry.qaf.automation.ui.WebDriverTestBase;

public class BuyUtils {
	
	public static void waitForMilliseconds(Integer milliseconds) throws InterruptedException
	{
		Thread.sleep(milliseconds);	
	}

	public static void refreshUntilVisible()throws InterruptedException
	{
			
			boolean isDisplayed = false;
			do {
				CommonStep.waitForEnabled("page.buynow.button", 11);
				if(CommonStep.verifyVisible("page.buynow.button"))
				{
					CommonStep.click("page.buynow.button");
					isDisplayed = true;
				}
				else
				{
					new WebDriverTestBase().getDriver().navigate().refresh();
				}

			}while(isDisplayed==false);
			CommonStep.waitForEnabled("page.buynow.button", 11);
			
	}
}
