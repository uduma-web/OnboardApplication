package com.OnboardApplication.TestCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.OnboardApplication.pageObject.LoginPage;
import com.OnboardApplication.pageObject.RecommedRejectApiSecretPage;


public class TC_RecommendRejectApiSecret_022 extends BaseClass
{
	@Test
	public void RecommendRejectApiSecret() throws InterruptedException, IOException
	{
		logger.info("Url is Entered");
		logger.info("Employee login to make a recommendation");
		
		LoginPage lp=new LoginPage(driver);
		
		lp.setUserEmail("viumee+Robin@gmail.com");
		
		logger.info("UserEmail has been Entered");
		
		
		
		lp.clickSignin();
		
		logger.info("Signin button Clicked");
		
		Thread.sleep(2000);
		
		RecommedRejectApiSecretPage Approve=new RecommedRejectApiSecretPage(driver);
		
		//Approve.ClickTeam();
		
		//logger.info("Team is Clicked");
		
		//Thread.sleep(3000);
		
		//Approve.ClickSecrets();
		
		//logger.info("Secrets is clicked");
		
		//Thread.sleep(3000);
		
		Approve.SearchSecret("NewApi");
		
		logger.info("Name of Api is Entered");
		
		Thread.sleep(2000);
		
		Approve.OpenSecret();
		logger.info("Secret is opened");
		Thread.sleep(6000);
		
		Approve.ClickingEnv();
		logger.info("Env is clicked");
		Thread.sleep(3000);
		
		Approve.Recommending();
		logger.info("Recommend an update is clicked");
		
		Approve.AddingNotes("Trying a Reject");
		logger.info("Note is inputed");
		
		Approve.EnteringKey("5rgd-hfgf7-heg56-kjjgeh");
		logger.info("key is entered");
		
		Approve.EnteringValue("dexter");
		logger.info("value is entered");
		Thread.sleep(5000);
		
		Approve.Recommend();
		logger.info("Recommend button is clicked");
		Thread.sleep(4000);
		
		boolean res=driver.getPageSource().contains("Recommendation submited");
		
		if(res==true)
		{
			Assert.assertTrue(true);
			logger.info("Test passed");
			Thread.sleep(4000);
		}
		else
		{
			captureScreen(driver, "RecommendRejectApiSecret");
			Assert.assertTrue(false);
			logger.info("Test Failed");
		}
		
	}

}
