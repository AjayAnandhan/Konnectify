package com.konnectify.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.konnectify.base.BaseClass;

public class HomePage extends BaseClass{

	@FindBy(xpath = "//input[@placeholder='Enter the email']")
	WebElement userName;

	@FindBy(xpath = "//input[@placeholder='Enter the password']")
	WebElement password;
	
	@FindBy(xpath = "//button[@type='submit']")
	WebElement submitButton;
	
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	public void login(String email, String pass) {
		System.out.println(userName);
		type(userName, email);
		type(password, pass);
		clickOn(submitButton);
	}
}
