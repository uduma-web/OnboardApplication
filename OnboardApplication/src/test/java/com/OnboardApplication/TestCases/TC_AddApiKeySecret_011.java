package com.OnboardApplication.TestCases;

import java.io.IOException;

import org.junit.Assert;
import org.testng.annotations.Test;

import com.OnboardApplication.pageObject.AddApiKeySecretPage;
import com.OnboardApplication.pageObject.LoginPage;

public class TC_AddApiKeySecret_011 extends BaseClass
{
	@Test
	public void AddingApiKeySecret() throws InterruptedException, IOException
	{
		logger.info("Url is Opened");
		
		LoginPage page=new LoginPage(driver);
		
		page.setUserEmail(userEmail);
		
		logger.info("UserEmail is Entered");
		
		
		
		Thread.sleep(3000);
		
		page.clickSignin();
		
		logger.info("Signin button is Clicked");
		
		Thread.sleep(5000);
		
		AddApiKeySecretPage Api= new AddApiKeySecretPage(driver);
		
		//Api.ClickTeam();
		
		//logger.info("Team is clicked");
		
		//Thread.sleep(4000);
		
		//Api.ClickSecrets();
		
		//logger.info("Secrets is Clicked");
		
		//Thread.sleep(7000);
		
		Api.AddSecret();
		
		logger.info("Add secret is clicked");
		
		Thread.sleep(2000);
		
		Api.ClickApiKeys();
		
		logger.info("Api keys is clicked");
		
		Thread.sleep(2000);
		
		Api.EnteringTitle("NewApi");
		
		logger.info("Title is entered");
		
		Thread.sleep(2000);
		
		Api.EnteringDescription("Testing out the Api keys automatically");
		
		logger.info("Description is entered");
		
		Thread.sleep(4000);
		
		Api.EnterKey("43gd3-hg56gd-435gdsf-gd65");
		
		logger.info("key is entered");
		
		Thread.sleep(4000);
		
		Api.EnterValue("testingout");
		
		logger.info("Value is entered");
		
		Thread.sleep(3000);
		
		Api.CreateApiKey();
		
		logger.info("Api key is about to be created");
		
		Thread.sleep(4000);
		
		boolean res=driver.getPageSource().contains("Secret Added");
		
		if(res==true)
		{
			Assert.assertTrue(true);
			logger.info("Test is passed");
			Thread.sleep(4000);
		}
		else
		{
			captureScreen(driver,"AddingApiKeySecret");
			Assert.assertTrue(false);
			
			logger.info("Test is Failed");
		}
		
	}

}
