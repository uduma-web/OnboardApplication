package com.OnboardApplication.TestCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.OnboardApplication.pageObject.LoginPage;
import com.OnboardApplication.pageObject.TrustedSourcesIPPage;

public class TC_TrustedSourcesIP_028 extends BaseClass
{
	@Test
	public void TrustedSources() throws InterruptedException, IOException
	{
		logger.info("URL is Entered");
		
		LoginPage lp=new LoginPage(driver);
		
		lp.setUserEmail(userEmail);
		
		logger.info("UserEmail has been Entered");
		
		
		lp.clickSignin();
		
		logger.info("Signin button Clicked");
		
		Thread.sleep(3000);
		
		TrustedSourcesIPPage Trust= new TrustedSourcesIPPage(driver);
		
		Trust.SearchSecret("Nuclear");
		logger.info("Secret is searched");
		Thread.sleep(3000);
		
		Trust.OpenSecret();
		logger.info("Secret is opened");
		Thread.sleep(2000);
		Trust.ClickOptionsIcon();
		logger.info("options icon is clicked");
		Thread.sleep(2000);
		
		Trust.ClickingTrustedSources();
		logger.info("Trusted sources is clicked");
		Thread.sleep(2000);
		
		Trust.Entering1stIp("212.214.41.140" +"\n"); 
		logger.info("IP address is entered");
		Thread.sleep(2000);
		
		Trust.AddNewIp();
		logger.info("Add new IP button is clicked");
		Thread.sleep(2000);
		
		Trust.Entering2ndIp("203.204.140.45" +"\n");
		logger.info("IP address is entered");
		Thread.sleep(2000);
		
		Trust.Updating();
		logger.info("Updating");
		Thread.sleep(2000);
		
		boolean res=driver.getPageSource().contains("IP addresses updated");
		
		if(res==true)
		{
			Assert.assertTrue(true);
			logger.info("Test passed");
			Thread.sleep(3000);
		}
		else
		{
			captureScreen(driver, "TrustedSources");
			Assert.assertTrue(false);
			logger.info("Test Failed");
		}
		
	}

}
