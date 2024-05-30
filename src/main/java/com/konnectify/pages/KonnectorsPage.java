package com.konnectify.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.konnectify.base.BaseClass;

public class KonnectorsPage extends BaseClass{

	@FindBy(xpath = "(//a[contains(@class,'p-2 ')]/following-sibling::a)[3]")
	WebElement settingButton;
	
	@FindBy(xpath = "(//button[contains(@class,'flex cursor-default')])[2]")
	WebElement accountIcon;
	
	@FindBy(xpath = "//p[contains(@class,'text-sm font-medium')]")
	WebElement userName;
	
	public KonnectorsPage() {
		PageFactory.initElements(driver, this);
	}
	
	public String verifyName() {
		clickOn(accountIcon);
		String name = read(userName);
		return name;
	}
	
	public void settings() {
		clickOn(settingButton);
	}

}
