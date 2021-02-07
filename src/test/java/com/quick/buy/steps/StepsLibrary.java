package com.quick.buy.steps;

import static com.qmetry.qaf.automation.step.CommonStep.sendKeys;
import  com.quick.buy.utils.BuyUtils;
import static com.qmetry.qaf.automation.step.CommonStep.*;
import org.openqa.selenium.Keys;

import com.qmetry.qaf.automation.step.CommonStep;
import com.qmetry.qaf.automation.step.QAFTestStep;

public class StepsLibrary {
	
	
	@QAFTestStep(description = "wait for {0}")
	public static void waitForMilliseconds(Integer milliseconds) throws InterruptedException {
		BuyUtils.waitForMilliseconds(milliseconds);
	}
	
	@QAFTestStep(description = "refresh page till buy button visibile")
	public static void refreshUntilVisible() throws InterruptedException
	{
		BuyUtils.refreshUntilVisible();
	}
	
		
}
