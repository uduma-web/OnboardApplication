package com.OnboardApplication.TestCases;

import java.io.IOException;

import org.junit.Assert;
import org.testng.annotations.Test;

import com.OnboardApplication.pageObject.DeleteGuidePage;
import com.OnboardApplication.pageObject.LoginPage;

public class TC_DeleteGuides_005 extends BaseClass 
{
	@Test
	public void DeleteGuide() throws InterruptedException, IOException
	{
		logger.info("Url is Entered");
		
		LoginPage Delete= new LoginPage(driver);
		
		Delete.setUserEmail(userEmail);
		
		logger.info("UserEmail has been Entered");
		
		
		
		Delete.clickSignin();
		
		logger.info("Signin button Clicked");
		
		Thread.sleep(5000);
		
		DeleteGuidePage Dg=new DeleteGuidePage(driver);
		
		Dg.ClickTeam();
		
		logger.info("Team is Clicked");
		
		Thread.sleep(3000);
		
		Dg.ClickTool();
		
		logger.info("Tool is Clicked");
		
		Thread.sleep(3000);
		
		Dg.searchTool("Trello");
		
		logger.info("Name of Tool Entered in Search box");
		
		Thread.sleep(3000);
		
		Dg.ClickSelTool();
		
		logger.info("Selected Tool is Clicked");
		
		Thread.sleep(3000);
		
		Dg.ClickGuide();
		logger.info("Tool Guide is Clicked");
		
		Thread.sleep(3000);
		
		Dg.ClickDel1();
		
		logger.info("First guide is deleted");

		
		Dg.ClickDel2();
		
		logger.info("Second guide is deleted");
		
		Thread.sleep(3000);
		
		Dg.Updating();
		
		logger.info("Guide is being updated...");
		
		Thread.sleep(5000);
		
		boolean result=driver.getPageSource().contains("Tool guides updated");
		
		if(result==true)
		{
			Assert.assertTrue(true);
			Thread.sleep(3000);
			logger.info("Test is passed");
		}
		else
		{
			captureScreen(driver,"DeleteGuide");
			Assert.assertTrue(false);
			
			logger.info("Test is Failed");
		}
		
	}
	
	

}
