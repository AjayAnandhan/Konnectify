package com.konnectify.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.konnectify.base.BaseClass;

public class SettingsPage extends BaseClass{

	@FindBy(xpath = "/html/body/div[1]/div/div[1]/div/div[3]/section/div/div/button[4]")
	WebElement billingButton;
	
	public SettingsPage() {
		PageFactory.initElements(driver, this);
	}
	
	public void billing() {
		clickOn(billingButton);
	}

}
