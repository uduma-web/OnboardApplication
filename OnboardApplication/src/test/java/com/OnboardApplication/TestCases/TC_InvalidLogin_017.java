package com.OnboardApplication.TestCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.OnboardApplication.pageObject.InvalidLoginPage;

public class TC_InvalidLogin_017 extends BaseClass
{
	@Test
	public void InvalidLogin() throws InterruptedException, IOException
	{
		logger.info("URL is Opened");
		
		InvalidLoginPage invalid=new InvalidLoginPage(driver);
		invalid.setUserEmail("udumavictor1990@gmail.com");
		logger.info("Email has been Entered");
		invalid.setPassword("epanutin");
		logger.info("password Entered");
		
		invalid.clickSignin();
		logger.info("Sign in Button Clicked");
		
		boolean res=driver.getPageSource().contains(" Sign in to your account ");
		
		if(res==true)
		{
			Assert.assertTrue(true);
			logger.info("Test passed");
			Thread.sleep(2000);
		}
		else
		{
			captureScreen(driver,"InvalidLogin");
			Assert.assertTrue(false);
			logger.info("Test Failed");
		}
		
	}

}
