package com.OnboardApplication.TestCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.OnboardApplication.pageObject.DeleteProjectPage;
import com.OnboardApplication.pageObject.LoginPage;

public class TC_DeleteProject_026 extends BaseClass
{
	@Test
	public void DeleteProject() throws InterruptedException, IOException
	{
		logger.info("URL is Entered");
		
		LoginPage lp=new LoginPage(driver);
		
		lp.setUserEmail(userEmail);
		
		logger.info("UserEmail has been Entered");
		
		
		
		lp.clickSignin();
		
		logger.info("Signin button Clicked");
		
		Thread.sleep(3000);
		
		DeleteProjectPage Dp=new DeleteProjectPage(driver);
		
		Dp.Switching();
		logger.info("switching from secrets to projects");
		Thread.sleep(2000);
		
		Dp.Searching("EMBRAYO");
		logger.info("name of the project is searched out");
		Thread.sleep(2000);
		
		Dp.ClickingProject();
		logger.info("project is clicked");
		Thread.sleep(2000);
		
		Dp.ClickingDelIcon();
		logger.info("Delete icon is clicked");
		Thread.sleep(2000);
		
		Dp.Deleting();
		logger.info("Clicks on delete");
		Thread.sleep(2000);
		
		Dp.ConfirmDelete();
		logger.info("Clicks on delete confirmation button");
		Thread.sleep(2000);
		
		boolean res=driver.getPageSource().contains("EMBRAYO Deleted");
		
		if(res==true)
		{
			Assert.assertTrue(true);
			logger.info("Test passed");
			Thread.sleep(3000);
		}
		else 
		{
			captureScreen(driver, "DeleteProject");
			Assert.assertTrue(false);
			logger.info("Test Failed");
		}
		
	}

}
