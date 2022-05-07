package com.OnboardApplication.TestCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.OnboardApplication.pageObject.DeleteGroupPage;
import com.OnboardApplication.pageObject.LoginPage;

public class TC_DeleteGroupPage_032 extends BaseClass
{
	@Test
	public void DeletingGroup() throws InterruptedException, IOException
	{
		logger.info("Url is Opened");
		
		LoginPage Ap=new LoginPage(driver);
		
		Ap.setUserEmail(userEmail);
		
		logger.info("Email has been Enered");
		
		
		
		Ap.clickSignin();
		
		logger.info("Signin button is Clicked");
		
		Thread.sleep(7000);
		
		DeleteGroupPage group =new DeleteGroupPage(driver);
		
		group.ClickingUserProfile();
		logger.info("user profile is clicked");
		Thread.sleep(2000);
		
		group.ClickingTeam();
		logger.info("manage team is clicked");
		Thread.sleep(2000);
		
		group.ClickGroups();
		logger.info("Groups is clicked");
		Thread.sleep(2000);
		
		group.SearchingGroups("TESTING");
		logger.info("Group is searched out");
		Thread.sleep(2000);
		
		group.OpenningGroup();
		logger.info("Group is opened");
		Thread.sleep(2000);
		
		group.ClickingOptions();
		logger.info("Options is clicked");
		Thread.sleep(2000);
		
		group.Delete();
		logger.info("Delete is clicked");
		Thread.sleep(2000);
		
		group.ConfirmingDelete();
		logger.info("Delete is confirmed");
		Thread.sleep(2000);
		
		boolean res=driver.getPageSource().contains("TESTING Deleted!");
		
		if(res==true)
		{
			Assert.assertTrue(true);
			logger.info("Test passed");
			Thread.sleep(4000);
		}
		else
		{
			captureScreen(driver, "DeletingGroup");
			Assert.assertTrue(false);
			logger.info("Test Failed");
		}
	}

}
