package com.OnboardApplication.TestCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.OnboardApplication.pageObject.AddNewKeyValueToApiSecretPage;
import com.OnboardApplication.pageObject.LoginPage;

public class TC_AddNewKeyValueToApiSecret_015 extends BaseClass
{
	@Test
	public void AddingNewKeyValue() throws InterruptedException, IOException
	{
		logger.info("URL is Entered");
		
		LoginPage lp=new LoginPage(driver);
		
		lp.setUserEmail(userEmail);
		
		logger.info("UserEmail has been Entered");
		
		
		
		lp.clickSignin();
		
		logger.info("Signin button Clicked");
		
		Thread.sleep(3000);
		
		AddNewKeyValueToApiSecretPage ApiSecret =new AddNewKeyValueToApiSecretPage(driver);
		
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
		
		Thread.sleep(6000);
		
		ApiSecret.ClickingEnv();
		logger.info("Env clicked");
		Thread.sleep(3000);
		
		ApiSecret.Add();
		logger.info("Add button is clicked");
		Thread.sleep(5000);
		
		ApiSecret.AddingKey("f56ht-7hfgf-hjf76-hgfdjd");
		logger.info("New key entered");
		Thread.sleep(5000);
		ApiSecret.AddingValue("adding");
		logger.info("new value entered");
		Thread.sleep(6000);
		ApiSecret.Saving();
		logger.info("Save button is clicked");
		Thread.sleep(2000);
		
		
		boolean res=driver.getPageSource().contains("Secret Updated");
		
		if(res==true)
		{
			Assert.assertTrue(true);
			logger.info("Test passed");
			Thread.sleep(4000);
		}
		else
		{
			captureScreen(driver, "AddingNewKeyValue");
			Assert.assertTrue(false);
			logger.info("Test Failed");
		}
		
	}

}
