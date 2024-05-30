package com.konnectify.testcases;

import org.testng.annotations.*;

import com.konnectify.base.BaseClass;
import com.konnectify.pages.BillingPage;
import com.konnectify.pages.HomePage;
import com.konnectify.pages.KonnectorsPage;
import com.konnectify.pages.SettingsPage;

public class TC_03_VerifyMonthlyPlans extends BaseClass {

	@BeforeTest
	public void setup() {
		testName = "TC_03_VerifyMonthlyPlans";
		testDescription = "Verify the current plan detail are available in the pricing page";
		testCategory = "Regression";
		testAuthor = "Ajay A";
	}

	@Test
	public void TC_03() throws Exception {
		HomePage hp = new HomePage();
		hp.login(readProperty("email"), readProperty("password"));
		KonnectorsPage kp = new KonnectorsPage();
		kp.settings();
		SettingsPage sp = new SettingsPage();
		sp.billing();
		BillingPage bp = new BillingPage();
		bp.monthlyTab();
		String freePlanText = bp.monthlyFreePlanTitle();
		String startPlanText = bp.monthlyStartupPlanTitle();
		String growthPlan = bp.monthlyGrowthPlanTitle();
		String eterprisePlan = bp.monthlyEnterprisePlanTitle();

		if (assertCheck(freePlanText, readProperty("freePlan")) && assertCheck(startPlanText, readProperty("startupPlan"))
				&& assertCheck(growthPlan, readProperty("growthPlan"))
				&& assertCheck(eterprisePlan, readProperty("enterprisePlan"))) {
			reportStep("Monthly free plan is verified successfully", "pass", testName);
		} else {
			reportStep("Failed to verify monthly free plan", "fail", testName);
		}

	}
}
