package com.PartnerTap.TestCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.PartnerTap.PageObjects.LoginPage;

public class TC_LoginInDemoUser_001 extends BaseClass {

	@Test
	public void loginTest() throws IOException {
		driver.get(baseURL);
		logger.info("URL IS Open Successfully");
	
		LoginPage lp = new LoginPage(driver);
		
		driver.manage().window().maximize();
	 	lp.clickoginInDemoUser();
		
		//Assert.assertEquals(driver.getTitle(), "PartnerTap");
		
		if(driver.getTitle().equals("PartnerTap")){
			captureScreen(driver, "loginTest");
			Assert.assertTrue(true);
			logger.info("loginTest Passed");
		}else {
			Assert.assertTrue(false);
			logger.info("loginTest Failed");
			
		}
		
		
	}		
	
}
