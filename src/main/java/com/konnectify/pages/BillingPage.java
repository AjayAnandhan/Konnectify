package com.konnectify.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.konnectify.base.BaseClass;

public class BillingPage extends BaseClass{
	
	@FindBy(xpath = "(//div[contains(@class,'text-gray-700 text-3xl')])[1]")
	WebElement firstTitle;
	
	@FindBy(xpath = "(//div[contains(@class,'text-gray-700 text-3xl')])[2]")
	WebElement secondTitle;

	@FindBy(xpath = "//div[text()='Plan']/following-sibling::div/div")
	WebElement planDetailName;

	@FindBy(xpath = "//div[text()='Add-ons']/following-sibling::div/div")
	WebElement addonDetailCount;

	@FindBy(xpath = "//div[text()='Subscription cycle']/following-sibling::div/div")
	WebElement subscriptionDetailCycle;

	@FindBy(xpath = "(//div[contains(@class,'flex w-full')])[1]")
	WebElement taskCount;
	
	@FindBy(xpath = "(//div[@class='text-sm uppercase'])[1]")
	WebElement freePlanTitle;
	
	@FindBy(xpath = "(//div[@class='text-sm uppercase'])[2]")
	WebElement startupPlanTitle;
	
	@FindBy(xpath = "(//div[@class='text-sm uppercase'])[3]")
	WebElement growthPlanTitle;
	
	@FindBy(xpath = "(//div[@class='text-sm uppercase'])[4]")
	WebElement enterprisePlanTitle;
	
	@FindBy(xpath = "(//button[@role='radio'])[1]")
	WebElement monthlyTabButton;
	
	@FindBy(xpath = "(//button[@role='radio'])[2]")
	WebElement yearlyTabButton;
	//
//	@FindBy(xpath = "")
//	WebElement firstTitle;
	
	public BillingPage() {
		PageFactory.initElements(driver, this);
	}
	
	public boolean isPlanDetailNameDisplayed() {
		return planDetailName.isDisplayed();
	}
	
	public boolean isAddonDetailCountDisplayed() {
		return addonDetailCount.isDisplayed();
	}
	
	public boolean isSubscriptionDetailCycleDisplayed() {
		return subscriptionDetailCycle.isDisplayed();
	}
	
	public boolean isTaskCountDisplayed() {
		return taskCount.isDisplayed();
	}
	
	public String firstTitle() {
		return read(firstTitle);
	}
	
	public String secondTitle() {
		return read(secondTitle);
	}
	
	public String planDetailName() {
		return read(planDetailName);
	}
	
	public String addonDetailCount() {
		return read(addonDetailCount);
	}
	
	public String subscriptionDetailCycle() {
		return read(subscriptionDetailCycle);
	}
	
	public String monthlyFreePlanTitle() {
		return read(freePlanTitle);
	}
	
	public String monthlyStartupPlanTitle() {
		return read(startupPlanTitle);
	}
	
	public String monthlyGrowthPlanTitle() {
		return read(growthPlanTitle);
	}
	
	public String monthlyEnterprisePlanTitle() {
		return read(enterprisePlanTitle);
	}
	
	public void monthlyTab() {
		clickOn(monthlyTabButton);
	}
	
	public void yearlyTab() {
		clickOn(yearlyTabButton);
	}


}
