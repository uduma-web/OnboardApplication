package com.OnboardApplication.TestCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.OnboardApplication.pageObject.DeleteKeyvalueApiSecretPage;
import com.OnboardApplication.pageObject.LoginPage;

public class TC_DeleteKeyValueOfApiSecret_016 extends BaseClass
{
	@Test
	public void DeletingKeyValue() throws InterruptedException, IOException
	{
		logger.info("URL is Entered");
		
		LoginPage lp=new LoginPage(driver);
		
		lp.setUserEmail(userEmail);
		
		logger.info("UserEmail has been Entered");
		
		
		
		lp.clickSignin();
		
		logger.info("Signin button Clicked");
		
		Thread.sleep(2000);
		
		DeleteKeyvalueApiSecretPage ApiSecret =new DeleteKeyvalueApiSecretPage(driver);
		
		//ApiSecret.ClickTeam();
		
		//logger.info("Team is Clicked");
		
		//Thread.sleep(3000);
		
		//ApiSecret.ClickSecrets();
		
		//logger.info("Secrets is clicked");
		
		//Thread.sleep(3000);
		
		ApiSecret.SearchSecret("NewApi");
		
		logger.info("Name of Api is Entered");
		
		Thread.sleep(2000);
		
		ApiSecret.OpenSecret();
		
		logger.info("Secret is Opened");
		
		Thread.sleep(6000);
		
		ApiSecret.ClickingEnv();
		logger.info("Env is clicked");
		Thread.sleep(3000);
		
		ApiSecret.DeleteKeyValue();
		
		logger.info("Delete icon is clicked");
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
			captureScreen(driver, "DeletingKeyValue");
			Assert.assertTrue(false);
			logger.info("Test Failed");
		}
		
	}

}
