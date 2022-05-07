package com.OnboardApplication.TestCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.OnboardApplication.pageObject.EditPasswordSecretPage;
import com.OnboardApplication.pageObject.LoginPage;

public class TC_EditPasswordSecret_014 extends BaseClass
{
	@Test
	public void EditingpasswordSecret() throws InterruptedException, IOException
	{
		logger.info("URL is Entered");
		
		LoginPage lp=new LoginPage(driver);
		
		lp.setUserEmail(userEmail);
		
		logger.info("UserEmail has been Entered");
		
		
		
		lp.clickSignin();
		
		logger.info("Signin button Clicked");
		
		Thread.sleep(3000);
		
		EditPasswordSecretPage EditSecret =new EditPasswordSecretPage(driver);
		
		
		EditSecret.SearchSecret("Nuclear");
		
		logger.info("Name of password secret is Entered");
		
		Thread.sleep(2000);
		
		EditSecret.OpenSecret();
		
		logger.info("Secret is Opened");
		
		Thread.sleep(5000);
		
		EditSecret.Editing();
		logger.info("Edit button is clicked");
		
		Thread.sleep(3000);
		
		EditSecret.Clearing();
		
		logger.info("Clears previous description");
		
		Thread.sleep(2000);
		
		EditSecret.EnterNewDescription("Checking if the edit works");
		
		logger.info("Description has been edited");
		
		Thread.sleep(5000);
		
		EditSecret.Saving();
		logger.info("Save button is clicked");
		
		Thread.sleep(2000);
		
		boolean result=driver.getPageSource().contains("Secret updated");
		
		if(result==true)
		{
			Assert.assertTrue(true);
			logger.info("Test passed");
			Thread.sleep(4000);
		}
		else
		{
			captureScreen(driver, "EditingpasswordSecret");
			Assert.assertTrue(false);
			logger.info("Test Failed");
		}
	}

}
