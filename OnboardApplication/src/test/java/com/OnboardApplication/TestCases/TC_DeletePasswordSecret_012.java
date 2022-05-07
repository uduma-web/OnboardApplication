package com.OnboardApplication.TestCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.OnboardApplication.pageObject.DeletePasswordSecretPage;
import com.OnboardApplication.pageObject.LoginPage;

public class TC_DeletePasswordSecret_012 extends BaseClass
{
	@Test
	public void DeletingPasswordSecret() throws InterruptedException, IOException
	{
		logger.info("URL is Entered");
		
		LoginPage lp=new LoginPage(driver);
		
		lp.setUserEmail(userEmail);
		
		logger.info("UserEmail has been Entered");
		
		
		
		lp.clickSignin();
		
		logger.info("Signin button Clicked");
		
		Thread.sleep(5000);
		
		DeletePasswordSecretPage ApiSecret =new DeletePasswordSecretPage(driver);
		
		//ApiSecret.ClickTeam();
		
		//logger.info("Team is Clicked");
		
		//Thread.sleep(3000);
		
		//ApiSecret.ClickSecrets();
		
		//logger.info("Secrets is clicked");
		
		//Thread.sleep(3000);
		
		ApiSecret.SearchSecret("Nuclear");
		
		logger.info("Name of password secret is Entered");
		
		Thread.sleep(2000);
		
		ApiSecret.OpenSecret();
		
		logger.info("Secret is Opened");
		
		Thread.sleep(2000);
		
		ApiSecret.AboutDeleting();
		
		logger.info("we just about to delete it");
		
		Thread.sleep(2000);
		
		ApiSecret.Deleting();
		
		logger.info("Secret is abot to get deleted");
		
		Thread.sleep(2000);
		
		ApiSecret.ClickButton();
		
		Thread.sleep(3000);
		
		boolean res=driver.getPageSource().contains("Nuclear removed");
		
		if(res==true)
		{
			Assert.assertTrue(true);
			logger.info("Test passed");
			Thread.sleep(4000);
		}
		else
		{
			captureScreen(driver, "DeletingPasswordSecret");
			Assert.assertTrue(false);
			logger.info("Test Failed");
		}
		
	}

}
