package com.konnectify.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.konnectify.base.BaseClass;
import com.konnectify.pages.BillingPage;
import com.konnectify.pages.HomePage;
import com.konnectify.pages.KonnectorsPage;
import com.konnectify.pages.SettingsPage;

public class TC_01_VerifyPricingPage extends BaseClass {
	@BeforeTest
	public void setup() {
		testName = "TC_01_VerifyPricingPage";
		testDescription = "Verify the user is successfully logged in";
		testCategory = "Regression";
		testAuthor = "Ajay A";
	}

	@Test(priority = 1)
	public void TC_01() throws Exception {
		HomePage hp = new HomePage();
		hp.login(readProperty("email"), readProperty("password"));
		KonnectorsPage kp = new KonnectorsPage();
		kp.settings();
		SettingsPage sp = new SettingsPage();
		sp.billing();
		BillingPage bp = new BillingPage();
		String title1 = bp.firstTitle();
		String title2 = bp.secondTitle();
		if (assertCheck(title1, readProperty("pricePageTitle1"))
				&& assertCheck(title2, readProperty("pricePageTitle2"))) {
			reportStep("Price page is navigated", "Pass", testName);
		} else {
			reportStep("Failed navigate to price page", "Fail", testName);
		}
	}
}
