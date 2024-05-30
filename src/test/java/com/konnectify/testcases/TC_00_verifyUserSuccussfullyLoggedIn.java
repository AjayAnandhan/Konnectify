package com.konnectify.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.konnectify.base.BaseClass;
import com.konnectify.pages.HomePage;
import com.konnectify.pages.KonnectorsPage;

public class TC_00_verifyUserSuccussfullyLoggedIn extends BaseClass {

	@BeforeTest
	public void setup() {
		testName = "TC_00_VerifyUserLogin";
		testDescription = "Verify the user is successfully logged in";
		testCategory = "Regression";
		testAuthor = "Ajay A";
	}

	@Test(priority = 1)
	public void TC_00_ValidateTitle() throws Exception {
		HomePage hp = new HomePage();
		hp.login(readProperty("email"), readProperty("password"));
		KonnectorsPage kp = new KonnectorsPage();
		String name = kp.verifyName();
		if(assertCheck(name, readProperty("name"))) {
			reportStep("User logged in successfully", "Pass", testName);
		}else {
			reportStep("Log in failed", "Fail", testName);
		}
	}
}
