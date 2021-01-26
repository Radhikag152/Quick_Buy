package com.quick.buy.steps;

import static com.qmetry.qaf.automation.step.CommonStep.sendKeys;
import  com.quick.buy.utils.BuyUtils;

import org.openqa.selenium.Keys;

import com.qmetry.qaf.automation.step.QAFTestStep;

public class StepsLibrary {
	
	
	@QAFTestStep(description = "I login to amazon")
	public static void login() throws InterruptedException {
		BuyUtils.login();
		
	}
}
