package com.OnboardApplication.TestCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.OnboardApplication.pageObject.AddingGroupsPage;
import com.OnboardApplication.pageObject.LoginPage;

public class TC_AddingGroups_029 extends BaseClass
{
	@Test
	public void CreatingGroup() throws InterruptedException, IOException
	{
		logger.info("URL is Entered");
		
		LoginPage lp=new LoginPage(driver);
		
		lp.setUserEmail(userEmail);
		
		logger.info("UserEmail has been Entered");
		
		
		
		lp.clickSignin();
		
		logger.info("Signin button Clicked");
		Thread.sleep(6000);
		
		AddingGroupsPage Group=new AddingGroupsPage(driver);
		
		Group.ClickingUserProfile();
		logger.info("Clicking on user menu");
		Thread.sleep(2000);
		
		Group.ClickingTeam();
		logger.info("Clicking on manage your Team");
		Thread.sleep(4000);
		
		Group.ClickingGroups();
		logger.info("Clicking on Groups");
		Thread.sleep(2000);
		
		Group.ClickingCreate();
		logger.info("Clicking on Create Group");
		Thread.sleep(2000);
		
		Group.EnteringTitle("TESTING");
		logger.info("Entering name of Group");
		Thread.sleep(2000);
		
		Group.AddingTeammate();
		logger.info("Adding a teammate");
		Thread.sleep(2000);
		
		Group.CreatingGroup();
		logger.info("Create button is clicked");
		Thread.sleep(2000);
		
		boolean res=driver.getPageSource().contains("Group created");
		
		if(res==true)
		{
			Assert.assertTrue(true);
			logger.info("Test passed");
			Thread.sleep(4000);
		}
		else
		{
			captureScreen(driver, "CreatingGroup");
			Assert.assertTrue(false);
			logger.info("Test Failed");
		}
		
	}

}
