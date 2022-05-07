package com.OnboardApplication.TestCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.OnboardApplication.pageObject.GrantTeammateAccessToSecretPage;
import com.OnboardApplication.pageObject.LoginPage;

public class TC_GrantTeammatesAccessToSecret_020 extends BaseClass
{
	@Test
	public void GrantingTeammatesAccessToSecret() throws InterruptedException, IOException  
	{
		logger.info("Url is Opened");
		
		LoginPage Ap=new LoginPage(driver);
		
		Ap.setUserEmail(userEmail);
		
		logger.info("Email has been Enered");
		
		
		
		Ap.clickSignin();
		
		logger.info("Signin button is Clicked");
		
		Thread.sleep(6000);
		
		GrantTeammateAccessToSecretPage Secret =new GrantTeammateAccessToSecretPage(driver);
		
		//Secret.ClickTeam();
		
		//logger.info("Team is Clicked");
		
		//Thread.sleep(3000);
		
		//Secret.ClickSecrets();
		
		//logger.info("Secrets is clicked");
		
		//Thread.sleep(3000);
		
		Secret.SearchSecret("NewApi");
		
		logger.info("Name of Api is Entered");
		
		Thread.sleep(2000);
		
		Secret.OpenSecret();
		
		logger.info("Secret is Opened");
		
		Thread.sleep(5000);
		
		Secret.ClickingTeammates();
		logger.info("Teammates is clicked");
		Thread.sleep(2000);
		
		Secret.GrantingAccess();
		logger.info("Grant access button is clicked");
		Thread.sleep(2000);
		
		Secret.Searching("Robin");
		logger.info("Teammate is searched");
		Thread.sleep(2000);
		
		Secret.AddingTeammates();
		logger.info("Add button is clicked");
		Thread.sleep(5000);
		
		boolean res=driver.getPageSource().contains("Teammate added to secret");
		
		if(res==true)
		{
			Assert.assertTrue(true);
			logger.info("Test passed");
			Thread.sleep(4000);
		}
		else
		{
			captureScreen(driver, "GrantingTeammatesAccessToSecret");
			Assert.assertTrue(false);
			logger.info("Test Failed");
		}
		
		
	}

}
