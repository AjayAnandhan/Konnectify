package com.konnectify.pages;

import org.openqa.selenium.support.PageFactory;

import com.konnectify.base.BaseClass;

public class CheckoutPage extends BaseClass{

	public CheckoutPage() {
		PageFactory.initElements(driver, this);
	}

}
