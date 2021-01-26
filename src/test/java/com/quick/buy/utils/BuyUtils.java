
package com.quick.buy.utils;

import org.openqa.selenium.Keys;

import com.qmetry.qaf.automation.step.CommonStep;

public class BuyUtils {
	
	public static void login() throws InterruptedException
	{
		CommonStep.waitForEnabled("amazon.signin.click", 11);
		CommonStep.click("amazon.signin.click");
		
	}

}
