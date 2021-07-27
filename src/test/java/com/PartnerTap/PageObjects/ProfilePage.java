package com.PartnerTap.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProfilePage {
	WebDriver ldriver;

	public ProfilePage(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}

	// Identify the Elements

	@FindBy(xpath = "//*[@id=\"pagingTableScroll\"]/table/tbody/tr[1]/td[1]/div/div")
	@CacheLookup
	WebElement demoUserProfile;

	// For this Elements we have to Write Action Methods

	public void clickoginInDemoUser() {
		demoUserProfile.click();
	}
}
 