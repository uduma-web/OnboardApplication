package com.OnboardApplication.TestCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.OnboardApplication.pageObject.AddingSecretsToGroupPage;
import com.OnboardApplication.pageObject.LoginPage;

public class TC_AddingSecretsToGroup_030 extends BaseClass
{
	@Test
	public void AddingSecretsToGroup() throws InterruptedException, IOException
	{
		logger.info("URL is Entered");
		
		LoginPage lp=new LoginPage(driver);
		
		lp.setUserEmail(userEmail);
		
		logger.info("UserEmail has been Entered");
		
		
		
		lp.clickSignin();
		
		logger.info("Signin button Clicked");
		Thread.sleep(8000);
		
		AddingSecretsToGroupPage SP= new AddingSecretsToGroupPage(driver);
		
		SP.ClickingUserProfile();
		logger.info("user profile is clicked");
		Thread.sleep(2000);
		
		SP.ClickingTeam();
		logger.info("manage Team is clicked");
		Thread.sleep(2000);
		
		SP.ClickGroups();
		logger.info("Groups is Clicked");
		Thread.sleep(2000);
		
		SP.SearchingGroups("TESTING");
		logger.info("Group is searched out");
		Thread.sleep(2000);
		
		SP.OpenningGroup();
		logger.info("Searched group is Clicked");
		Thread.sleep(2000);
		
		SP.ClickingSecrets();
		logger.info("Secrets is Clicked");
		Thread.sleep(2000);
		
		SP.AddSecret();
		logger.info("Add secret is Clicked");
		Thread.sleep(2000);
		
		SP.AddingFirstSecret();
		logger.info("First secret is added");
		Thread.sleep(2000);
		
		boolean res=driver.getPageSource().contains("Harmony has been added to group");
		
		if(res==true)
		{
			Assert.assertTrue(true);
			logger.info("Test passed");
			Thread.sleep(4000);
		}
		else
		{
			captureScreen(driver, "AddingSecretsToGroup");
			Assert.assertTrue(false);
			logger.info("Test Failed");
		}
	
	}

}
