package com.OnboardApplication.TestCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.OnboardApplication.pageObject.AcceptSecretRequestPage;
import com.OnboardApplication.pageObject.LoginPage;

public class TC_AcceptSecretRequest_024 extends BaseClass
{
	@Test
	public void AcceptingSecret() throws InterruptedException, IOException
	{
		logger.info("Url is Entered");
		
		LoginPage lp=new LoginPage(driver);
		
		lp.setUserEmail(userEmail);
		
		logger.info("UserEmail has been Entered");
		
		
		
		lp.clickSignin();
		
		logger.info("Signin button Clicked");
		
		Thread.sleep(2000);
		
		AcceptSecretRequestPage Accept=new AcceptSecretRequestPage(driver);
		
		Accept.SearchSecret("Nuclear");
		logger.info("Secret is searched");
		Thread.sleep(2000);
		
		Accept.OpenSecret();
		logger.info("secret is opened");
		Thread.sleep(2000);
		
		Accept.CheckRequest();
		logger.info("checking the request");
		Thread.sleep(2000);
		
		Accept.ViewingRequest();
		logger.info("viewing the request");
		Thread.sleep(2000);
		
		Accept.Accepting();
		logger.info("just clicked the approve button");
		Thread.sleep(2000);
		
		boolean res=driver.getPageSource().contains("Request accepted");
		
		if(res==true)
		{
			Assert.assertTrue(true);
			logger.info("Test passed");
			Thread.sleep(4000);
		}
		else
		{
			captureScreen(driver, "AcceptingSecret");
			Assert.assertTrue(false);
			logger.info("Test Failed");
		}
		
	}

}
