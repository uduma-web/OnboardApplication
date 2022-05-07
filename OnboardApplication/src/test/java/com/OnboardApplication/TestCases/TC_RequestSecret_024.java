package com.OnboardApplication.TestCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.OnboardApplication.pageObject.LoginPage;
import com.OnboardApplication.pageObject.RequestSecretsPage;

public class TC_RequestSecret_024 extends BaseClass
{ 
	@Test
	public void RequestingSecret() throws InterruptedException, IOException
	{
		logger.info("Url is Entered");
		logger.info("Employee login to make a secret request");
		
		LoginPage lp=new LoginPage(driver);
		
		lp.setUserEmail("viumee+Robin@gmail.com");
		
		logger.info("UserEmail has been Entered");
		
		
		
		lp.clickSignin();
		
		logger.info("Signin button Clicked");
		
		Thread.sleep(2000);
		
		RequestSecretsPage Request =new RequestSecretsPage(driver);
		
		Request.SearchSecret("Nuclear");
		logger.info("Secret is searched");
		Thread.sleep(2000);
		
		Request.Requesting();
		logger.info("Request button is clicked");
		
		Request.ReasonforRequest("need access");
		logger.info("my reason for the request");
		Thread.sleep(2000);
		
		Request.SendRequest();
		logger.info("Request is sent");
		Thread.sleep(2000);
		
		boolean res=driver.getPageSource().contains("Secret request sent");
		
		if(res==true)
		{
			Assert.assertTrue(true);
			logger.info("Test passed");
			Thread.sleep(4000);
		}
		else
		{
			captureScreen(driver, "RequestingSecret");
			Assert.assertTrue(false);
			logger.info("Test Failed");
		}
		
	}

}
