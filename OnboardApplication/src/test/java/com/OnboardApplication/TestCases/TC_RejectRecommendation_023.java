package com.OnboardApplication.TestCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.OnboardApplication.pageObject.LoginPage;
import com.OnboardApplication.pageObject.RejectRecommendationPage;

public class TC_RejectRecommendation_023 extends BaseClass
{
	@Test
	public void RejectingRecommendation() throws InterruptedException, IOException
	{
		logger.info("URL is Entered");
		
		LoginPage lp=new LoginPage(driver);
		
		lp.setUserEmail(userEmail);
		
		logger.info("UserEmail has been Entered");
		
		
		
		lp.clickSignin();
		
		logger.info("Signin button Clicked");
		
		Thread.sleep(3000);
		
		RejectRecommendationPage Reject = new RejectRecommendationPage(driver);
		
		Reject.SearchSecret("NewApi");
		logger.info("name of Api secret is searched");
		Thread.sleep(2000);
		
		Reject.OpenSecret();
		logger.info("secret is opened");
		Thread.sleep(5000);
		
		Reject.ClickingEnv();
		logger.info("Env is clicked");
		Thread.sleep(3000);
		
		Reject.Rejecting();
		logger.info("Accept button is clicked");
		Thread.sleep(3000);
		
		boolean res=driver.getPageSource().contains("Recommendation removed");
		
		if(res==true)
		{
			Assert.assertTrue(true);
			logger.info("Test passed");
			Thread.sleep(4000);
		}
		else
		{
			captureScreen(driver, "RejectingRecommendation");
			Assert.assertTrue(false);
			logger.info("Test Failed");
		}
		
	}

}
