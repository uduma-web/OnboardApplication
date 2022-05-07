package com.OnboardApplication.TestCases;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.OnboardApplication.pageObject.LoginPage;
import com.OnboardApplication.pageObject.ProfileSettingsPage;

public class TC_ProfileSettings_018 extends BaseClass
{
	@Test
	public void ProfileSetting() throws InterruptedException, IOException
	{
		logger.info("Url is Opened");
		
		LoginPage Ap=new LoginPage(driver);
		
		Ap.setUserEmail(userEmail);
		
		logger.info("Email has been Enered");
		
	
		
		Ap.clickSignin();
		
		logger.info("Signin button is Clicked");
		
		Thread.sleep(8000);
		
		ProfileSettingsPage Profile = new ProfileSettingsPage(driver);
		
		Profile.HitMenu();
		logger.info("Menu is clicked");
		Thread.sleep(2000);
		
		Profile.HitAccount();
		logger.info("Account is clicked");
		Thread.sleep(2000);
		
		Profile.Clearing();
		logger.info("input field is cleared");
		Thread.sleep(2000);
		
		Profile.EntFullName("KELECHI IBE");
		logger.info("full name is entered");
		Thread.sleep(2000);
		
		Profile.ClearingLoc();
		logger.info("Location field is cleared");
		Thread.sleep(2000);
		
		String Location = randomestring()+" Estate Ajah, Lasos State, Nigeria";
		Profile.InputingLocation(Location);
		logger.info("new location is entered");
		Thread.sleep(2000);
		
		Profile.ClearingCountryCode();
		logger.info("input field for Country Code is cleared");
		Thread.sleep(2000);
		
		Profile.InputingCountryCode("+234");
		logger.info("country code is entered");
		Thread.sleep(2000);
		
		Profile.ClearingPhoneNumber();
		logger.info("input field for phone number is cleared");
		Thread.sleep(2000);
		
		String PhoneNumber= ("07")+randomeNum();
		Profile.InputingPhoneNumber(PhoneNumber);
		logger.info("random phone number is entered");
		Thread.sleep(2000);
		
		Profile.Saving();
		logger.info("save button is clicked");
		Thread.sleep(5000);
		
		boolean res=driver.getPageSource().contains("Profile Updated");
		
		if(res==true)
		{
			Assert.assertTrue(true);
			logger.info("Test passed");
		}
		else
		{
			captureScreen(driver,"ProfileSetting");
			Assert.assertTrue(false);
			logger.info("Test Failed");
		}
				
	}

}
