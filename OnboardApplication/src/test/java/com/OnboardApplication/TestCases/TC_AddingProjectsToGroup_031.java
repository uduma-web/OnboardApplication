package com.OnboardApplication.TestCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.OnboardApplication.pageObject.AddingProjectToGroupPage;
import com.OnboardApplication.pageObject.LoginPage;

public class TC_AddingProjectsToGroup_031 extends BaseClass
{
	@Test
	public void AddingProjectsToGroup() throws InterruptedException, IOException
	{
		logger.info("URL is Entered");
		
		LoginPage lp=new LoginPage(driver);
		
		lp.setUserEmail(userEmail);
		
		logger.info("UserEmail has been Entered");
		
		
		
		lp.clickSignin();
		
		logger.info("Signin button Clicked");
		Thread.sleep(8000);
		
		AddingProjectToGroupPage project=new AddingProjectToGroupPage(driver);
		
		project.ClickingUserProfile();
		logger.info("user profile is clicked");
		Thread.sleep(2000);
		
		project.ClickingTeam();
		logger.info("manage Team is clicked");
		Thread.sleep(2000);
		
		project.ClickGroups();
		logger.info("Groups is Clicked");
		Thread.sleep(2000);
		
		project.SearchingGroups("TESTING");
		logger.info("Group is searched out");
		Thread.sleep(2000);
		
		project.OpenningGroup();
		logger.info("Searched group is Clicked");
		Thread.sleep(2000);
		
		project.ClickingProject();
		logger.info("project is Clicked");
		Thread.sleep(2000);
		
		project.AddProject();
		logger.info("Add project is Clicked");
		Thread.sleep(2000);
		
		project.AddingFirstProject();
		logger.info("First project is added");
		Thread.sleep(2000);
		
		boolean res=driver.getPageSource().contains("Project added to group");
		
		if(res==true)
		{
			Assert.assertTrue(true);
			logger.info("Test passed");
			Thread.sleep(4000);
		}
		else
		{
			captureScreen(driver, "AddingProjectsToGroup");
			Assert.assertTrue(false);
			logger.info("Test Failed");
		}
		
	}

}
