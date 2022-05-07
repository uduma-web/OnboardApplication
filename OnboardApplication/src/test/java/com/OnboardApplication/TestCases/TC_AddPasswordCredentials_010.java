package com.OnboardApplication.TestCases;

import java.io.IOException;

import org.junit.Assert;
import org.testng.annotations.Test;

import com.OnboardApplication.pageObject.AddPasswordSecretPage;
import com.OnboardApplication.pageObject.LoginPage;

public class TC_AddPasswordCredentials_010 extends BaseClass
{
	@Test
	public void AddingPasswordSecrets() throws InterruptedException, IOException
	{
		
		logger.info("Url is Opened");
		
		LoginPage page=new LoginPage(driver);
		
		page.setUserEmail(userEmail);
		
		logger.info("UserEmail is Entered");
		
		
		
		Thread.sleep(2000);
		
		page.clickSignin();
		
		logger.info("Signin button is Clicked");
		
		Thread.sleep(2000);
		
		AddPasswordSecretPage Aps= new AddPasswordSecretPage(driver);
		
		Aps.AddSecret();
		
		logger.info("Add secret is clicked");
		
		Thread.sleep(4000);
		
		Aps.AddingPasswordSecret();
		
		logger.info("password credentials is clicked");
		
		Thread.sleep(1000);
		
		Aps.AddTitle("Nuclear");
		
		logger.info("Title is entered");
		
		Thread.sleep(1000);
		
		Aps.AddDescription("Nuclear Bomb");
		
		logger.info("Description is entered");
		
		Thread.sleep(1000);
		
		Aps.AddUserName("Electrons");
		
		logger.info("username is entered");
		
		Thread.sleep(1000);
		
		Aps.AddPassword("epanutin");
		
		logger.info("Password is entered");
		
		Thread.sleep(5000);
		
		Aps.Create();
		
		logger.info("A password Credential is created");
		
		Thread.sleep(2000);
		
		boolean res=driver.getPageSource().contains("Secret Added");
		
		if(res==true)
		{
			Assert.assertTrue(true);
			
			logger.info("Test is passed");
			Thread.sleep(4000);
		}
		else
		{
			captureScreen(driver,"AddingPasswordSecrets");
			Assert.assertTrue(false);
			
			logger.info("Test is Failed");
		}
		
	}

}
