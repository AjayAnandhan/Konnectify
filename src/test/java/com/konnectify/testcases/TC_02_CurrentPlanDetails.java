package com.konnectify.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.konnectify.base.BaseClass;
import com.konnectify.pages.BillingPage;
import com.konnectify.pages.HomePage;
import com.konnectify.pages.KonnectorsPage;
import com.konnectify.pages.SettingsPage;

public class TC_02_CurrentPlanDetails extends BaseClass{

	@BeforeTest
	public void setup() {
		testName = "TC_02_CurrentPlanDetails";
		testDescription = "Verify the current plan detail are available in the pricing page";
		testCategory = "Regression";
		testAuthor = "Ajay A";
	}

	@Test(priority = 1)
	public void TC_02() throws Exception {
		HomePage hp = new HomePage();
		hp.login(readProperty("email"), readProperty("password"));
		KonnectorsPage kp = new KonnectorsPage();
		kp.settings();
		SettingsPage sp = new SettingsPage();
		sp.billing();
		BillingPage bp = new BillingPage();
		boolean plan = bp.isPlanDetailNameDisplayed();
		boolean addonCount = bp.isAddonDetailCountDisplayed();
		boolean subscriptionCycle = bp.isSubscriptionDetailCycleDisplayed();
		boolean taskCount = bp.isTaskCountDisplayed();
		if (plan) {
			reportStep("Plan detail is precent", "Pass", testName);
		} else {
			reportStep("Plan detail is precent", "Fail", testName);
		}
		if (addonCount) {
			reportStep("Add-ons detail is precent", "Pass", testName);
		} else {
			reportStep("Add-ons detail is not precent", "Fail", testName);
		}
		if (subscriptionCycle) {
			reportStep("Subscription detail is precent", "Pass", testName);
		} else {
			reportStep("Subscription detail is not precent", "Fail", testName);
		}
		if (taskCount) {
			reportStep("Task count is precent", "Pass", testName);
		} else {
			reportStep("Task count is not precent", "Fail", testName);
		}
	}
	
	
	
	
}
