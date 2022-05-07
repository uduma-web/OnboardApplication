package com.OnboardApplication.TestCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.OnboardApplication.pageObject.LoginPage;
import com.OnboardApplication.pageObject.ShareSecretPage;

public class TC_ShareSecret_027 extends BaseClass
{
	@Test
	public void SharingSecret() throws InterruptedException, IOException
	{
		logger.info("URL is Entered");
		
		LoginPage lp=new LoginPage(driver);
		
		lp.setUserEmail(userEmail);
		
		logger.info("UserEmail has been Entered");
		
		
		
		lp.clickSignin();
		
		logger.info("Signin button Clicked");
		
		Thread.sleep(3000);
		
		ShareSecretPage share=new ShareSecretPage(driver);
		
		share.SearchSecret("Maryjane");
		logger.info("Secret is searched out");
		Thread.sleep(3000);
		
		share.OpenSecret();
		logger.info("Secret is clicked");
		Thread.sleep(2000);
		
		share.ClickOptionsIcon();
		logger.info("options icon is clicked");
		Thread.sleep(2000);
		
		share.ClickShare();
		logger.info("Share button is clicked");
		Thread.sleep(2000);
		
		share.EnteringEmail("viumee@gmail.com");
		logger.info("receiver's email is entered");
		Thread.sleep(2000);
		
		share.Sending();
		logger.info("share button is clicked");
		Thread.sleep(2000);
		
		boolean res=driver.getPageSource().contains("Secret shared");
		
		if(res==true)
		{
			Assert.assertTrue(true);
			logger.info("Test passed");
			Thread.sleep(4000);
		}
		else
		{
			captureScreen(driver, "SharingSecret");
			Assert.assertTrue(false);
			logger.info("Test Failed");
		}
		
	}

}
