package com.OnboardApplication.TestCases;

import java.io.IOException;

import org.junit.Assert;
import org.testng.annotations.Test;

import com.OnboardApplication.pageObject.AddToolGuidePage;
import com.OnboardApplication.pageObject.LoginPage;


public class TC_AddGuides extends BaseClass
{
	@Test
	public void AddGuides() throws InterruptedException, IOException
	{
		logger.info("Url is Opened");
		
		LoginPage page=new LoginPage(driver);
		
		page.setUserEmail(userEmail);
		
		logger.info("UserEmail is Entered");
		
		
		
		Thread.sleep(3000);
		
		page.clickSignin();
		
		logger.info("Signin button is Clicked");
		
		Thread.sleep(7000);
		
		AddToolGuidePage add=new AddToolGuidePage(driver);
		
		add.ClickTeam();
		
		logger.info("Team is Clicked");
		
		Thread.sleep(3000);
		
		add.ClickTool();
		
		logger.info("Tool is Clicked");
		
		Thread.sleep(3000);
		
		add.searchTool("Trello");
		
		logger.info("Tool Name is Entered");
		
		Thread.sleep(3000);
		
		add.ClickSelTool();
		
		logger.info("The tool is clicked");
		
		Thread.sleep(3000);
		
		add.ClickGuide();
		
		logger.info("Guide is clicked");
		
		Thread.sleep(7000);
		
		add.EnterTitle("Title");
		
		logger.info("Title is Entered");
		
		Thread.sleep(3000);
		
		add.EnterLink("https://trello.com/b/m2mBMUYj/documentation");
		
		logger.info("Url is Entered");
		
		Thread.sleep(3000);
		
		add.AddNewGuide();
		
		logger.info("Add button is clicked");
		
		Thread.sleep(6000);
		
		add.ClickDocumentation();
		
		logger.info("Documentation is clicked");
		
		Thread.sleep(3000);
		
		add.AddNewDocsTitle("Title1");
		
		logger.info("Title is Entered");
		
		Thread.sleep(3000);
		
		add.AddNewDocsUrl("https://trello.com/b/m2mBMUYj/documentation");
		
		logger.info("Url is Entered");
		
		Thread.sleep(3000);
		
		add.Update();
		
		Thread.sleep(6000);
		
		boolean res=driver.getPageSource().contains("Tool guides updated");
		
		if(res==true)
		{
			Assert.assertTrue(true);
			
			logger.info("Test is passed");
			Thread.sleep(3000);
		}
		else
		{
			captureScreen(driver,"AddGuides");
			Assert.assertTrue(false);
			
			logger.info("Test is Failed");
		}
		
		
		
	}

}
