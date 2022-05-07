package com.OnboardApplication.TestCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.OnboardApplication.pageObject.AddingTeammateToProjectPage;
import com.OnboardApplication.pageObject.LoginPage;

public class TC_AddingTeammateToProject_034 extends BaseClass
{
	@Test
	public void AddingTeammateToProject() throws InterruptedException, IOException
	{
		logger.info("URL is Entered");
		
		LoginPage lp=new LoginPage(driver);
		
		lp.setUserEmail(userEmail);
		
		logger.info("UserEmail has been Entered");
		
		
		
		lp.clickSignin();
		
		logger.info("Signin button Clicked");
		
		Thread.sleep(3000);
		
		AddingTeammateToProjectPage Add= new AddingTeammateToProjectPage(driver);
		
		Add.Switching();
		logger.info("Switched to project");
		Thread.sleep(3000);
		
		Add.Searching("EMBRAYO");
		logger.info("project is searched out");
		Thread.sleep(3000);
		
		Add.ClickingProject();
		logger.info("Project is clicked");
		Thread.sleep(3000);
		
		Add.ClickingTeammate();
		logger.info("Teammate is clicked");
		Thread.sleep(3000);
		
		Add.ClickGrantAccess();
		logger.info("Grant access button is clicked");
		Thread.sleep(3000);
		
		Add.Selecting();
		logger.info("Teammate is being added to project");
		Thread.sleep(3000);
		
		boolean res=driver.getPageSource().contains("Teammate added to project");
		
		if(res==true)
		{
			Assert.assertTrue(true);
			logger.info("Test passed");
			Thread.sleep(3000);
		}
		else
		{
			captureScreen(driver, "AddingTeammateToProject");
			Assert.assertTrue(false);
			logger.info("Test Failed");
		}
		
	}

}
