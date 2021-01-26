package com.quick.buy.test;

import static com.qmetry.qaf.automation.step.CommonStep.get;
import static com.qmetry.qaf.automation.step.CommonStep.verifyLinkWithPartialTextPresent;
import static com.quick.buy.steps.StepsLibrary.searchFor;

import org.testng.annotations.Test;

import com.qmetry.qaf.automation.ui.WebDriverTestCase;

public class SampleTest extends WebDriverTestCase {

	@Test
	public void testGoogleSearch() {
		get("/");
		searchFor("qaf github infostretch");
		verifyLinkWithPartialTextPresent("qaf");
	}
}
