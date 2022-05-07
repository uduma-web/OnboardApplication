package com.OnboardApplication.TestCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.OnboardApplication.pageObject.LoginPage;
import com.OnboardApplication.pageObject.SwitchAccountPage;

public class TC_SwitchingAccount_035 extends BaseClass
{
	@Test
	public void SwitchingAccount() throws InterruptedException, IOException
	{
		logger.info("URL is Entered");
		
		LoginPage lp=new LoginPage(driver);
		
		lp.setUserEmail(userEmail);
		
		logger.info("UserEmail has been Entered");
		
		lp.clickSignin();
		
		logger.info("Signin button Clicked");
		Thread.sleep(6000);
		
		SwitchAccountPage change=new SwitchAccountPage(driver);
		
		change.ClickingProfile();
		logger.info("user profile is clicked");
		Thread.sleep(3000);
		
		change.ClickingSwitch();
		logger.info("switch account is clicked");
		Thread.sleep(3000);
		
		change.Switching();
		logger.info("account to be switched to is clicked");
		Thread.sleep(3000);
		
		boolean res=driver.getPageSource().contains("Account switched! you'll be redirected shortly");
		
		if(res==true)
		{
			Assert.assertTrue(true);
			logger.info("Test passed");
			Thread.sleep(4000);
		}
		else
		{
			captureScreen(driver, "SwitchingAccount");
			Assert.assertTrue(false);
			logger.info("Test Failed");
		}
		
	}

}
