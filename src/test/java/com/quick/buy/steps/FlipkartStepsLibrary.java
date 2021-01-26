package com.quick.buy.steps;

import static com.qmetry.qaf.automation.step.CommonStep.sendKeys;
import  com.quick.buy.utils.*;

import org.openqa.selenium.Keys;

import com.qmetry.qaf.automation.step.QAFTestStep;

public class FlipkartStepsLibrary {

	@QAFTestStep(description = "I login to Flipkart with username {0} and password {1}")
	public static void loginToFlipkart(String username, String passowrd) throws InterruptedException {
		FlipkartBuyUtils.login(username, passowrd);		
	}
}
