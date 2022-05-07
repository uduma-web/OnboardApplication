package com.OnboardApplication.TestCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.OnboardApplication.pageObject.DeleteApiSecretPage;
import com.OnboardApplication.pageObject.LoginPage;

public class TC_DeleteApiSecret_013 extends BaseClass
{
	@Test
	public void DeletingApiSecret() throws InterruptedException, IOException
	{
		logger.info("URL is Entered");
		
		LoginPage lp=new LoginPage(driver);
		
		lp.setUserEmail(userEmail);
		
		logger.info("UserEmail has been Entered");
		
		
		
		lp.clickSignin();
		
		logger.info("Signin button Clicked");
		
		Thread.sleep(3000);
		
		DeleteApiSecretPage ApiSecret =new DeleteApiSecretPage(driver);
		
		//ApiSecret.ClickTeam();
		
		//logger.info("Team is Clicked");
		
		//Thread.sleep(3000);
		
		//ApiSecret.ClickSecrets();
		
		//logger.info("Secrets is clicked");
		
		//Thread.sleep(3000);
		
		ApiSecret.SearchSecret("NewApi");
		
		logger.info("Name of Api is Entered");
		
		Thread.sleep(5000);
		
		ApiSecret.OpenSecret();
		
		logger.info("Secret is Opened");
		
		Thread.sleep(3000);
		
		ApiSecret.AboutDeleting();
		
		logger.info("we just about to delete it");
		
		Thread.sleep(3000);
		
		ApiSecret.Deleting();
		
		logger.info("Secret is about to get deleted");
		
		Thread.sleep(5000);
		
		ApiSecret.ClickButton();
		
		Thread.sleep(3000);
		
		boolean res=driver.getPageSource().contains("NewApi removed");
		
		if(res==true)
		{
			Assert.assertTrue(true);
			logger.info("Test passed");
			Thread.sleep(4000);
		}
		else
		{
			captureScreen(driver, "DeletingApiSecret");
			Assert.assertTrue(false);
			logger.info("Test Failed");
		}
		
	}

}
