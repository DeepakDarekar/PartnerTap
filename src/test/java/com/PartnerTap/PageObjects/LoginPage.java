package com.PartnerTap.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver ldriver;

	public LoginPage(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}

	// Identify the Elements

	@FindBy(xpath = "//*[@id=\"app\"]/div/div/div[2]/div[11]/div/button/span[1]")
	@CacheLookup
	WebElement loginInDemoUser;

	// For this Elements we have to Write Action Methods

	public void clickoginInDemoUser() {
		loginInDemoUser.click();
	}
}
 