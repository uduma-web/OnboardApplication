package com.OnboardApplication.TestCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.OnboardApplication.pageObject.AddToolPage;
import com.OnboardApplication.pageObject.LoginPage;

public class TC_AddTool_002 extends BaseClass
{
	@Test
	public void AddTool() throws InterruptedException, IOException
	{
		logger.info("Url is Opened");
		
		LoginPage Ap=new LoginPage(driver);
		
		Ap.setUserEmail(userEmail);
		
		logger.info("Email has been Enered");
		
		
		
		Ap.clickSignin();
		
		logger.info("Signin button is Clicked");
		
		Thread.sleep(3000);
		
		AddToolPage Tp=new AddToolPage(driver);
		
		Tp.ClickTeam();
		
		logger.info("Team is Clicked");
		
		Thread.sleep(2000);
		
		Tp.ClickTool();
		
		logger.info("Tool is Clicked");
		
		Thread.sleep(2000);
		
		Tp.ClickAddTools();
		
		logger.info("AddTool button is Clicked");
		
		Thread.sleep(2000);
		
		Tp.SearchTool("Vercel");
		
		logger.info("Name of Tool is Entered");
		
		Thread.sleep(2000);
		
		Tp.ClickSTool();
		
		logger.info("The searched Tool is Clicked");
		
		Thread.sleep(3000);
		
		Tp.Add();
		logger.info("Add button is clicked");
		Thread.sleep(3000);
		
		boolean res=driver.getPageSource().contains("Tool(s) added");
		
		if(res==true)
		{
			Assert.assertTrue(true);
			logger.info("Test passed");
			Thread.sleep(2000);
		}
		else
		{
			captureScreen(driver,"AddTool");
			Assert.assertTrue(false);
			logger.info("Test Failed");
		}
		
		
		
		
		
	}

}
