package com.OnboardApplication.TestCases;


import java.io.IOException;

import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.OnboardApplication.pageObject.AcceptRecommendationPage;
import com.OnboardApplication.pageObject.LoginPage;

public class TC_AcceptRecommendation_021 extends BaseClass
{
	@Test
	public void AcceptingRecommendation() throws InterruptedException, IOException
	{
		logger.info("URL is Entered");
		
		LoginPage lp=new LoginPage(driver);
		
		lp.setUserEmail(userEmail);
		
		logger.info("UserEmail has been Entered");
		
		
		
		lp.clickSignin();
		
		logger.info("Signin button Clicked");
		
		Thread.sleep(3000);
		
		AcceptRecommendationPage Accept = new AcceptRecommendationPage(driver);
		
		Accept.SearchSecret("NewApi");
		logger.info("name of Api secret is searched");
		Thread.sleep(2000);
		
		Accept.OpenSecret();
		logger.info("secret is opened");
		Thread.sleep(5000);
		
		Accept.ClickingEnv();
		logger.info("Env is clicked");
		Thread.sleep(3000);
		
		Accept.Accepting();
		logger.info("Accept button is clicked");
		Thread.sleep(3000);
		
		boolean res=driver.getPageSource().contains("Secret Updated");
		
		if(res==true)
		{
			Assert.assertTrue(true);
			logger.info("Test passed");
			Thread.sleep(4000);
		}
		else
		{
			captureScreen(driver, "AcceptingRecommendation");
			Assert.assertTrue(false);
			logger.info("Test Failed");
		}
		
	}

}
