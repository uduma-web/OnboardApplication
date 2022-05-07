package com.OnboardApplication.TestCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.OnboardApplication.pageObject.AddBusinessUseCasePage;
import com.OnboardApplication.pageObject.LoginPage;

public class TC_AddBusinessUseCaseToTool_007 extends BaseClass
{
	@Test
	public void AddingBusinessUseCase() throws InterruptedException, IOException
	{
		logger.info("Url is Entered");
		
		LoginPage lp=new LoginPage(driver);
		
		lp.setUserEmail(userEmail);
		
		logger.info("UserEmail has been Entered");
		
		
		
		lp.clickSignin();
		
		logger.info("Signin button Clicked");
		
		Thread.sleep(2000);
		
		AddBusinessUseCasePage Abp= new AddBusinessUseCasePage(driver);
		
		Abp.ClickTeam();
		
		logger.info("Team is clicked");
		
		Thread.sleep(2000);
		
		Abp.ClickTool();
		
		logger.info("Tool is Clicked");
		
		Thread.sleep(2000);
		
		Abp.searchTool("Vercel");
		
		logger.info("Tool is searched");
		
		Thread.sleep(2000);
		
		Abp.ClickSelTool();
		
		logger.info("Searched tool is clicked");
		
		Thread.sleep(2000);
		
		Abp.ClickToShowEditor();
		
		logger.info("Clicked to show the Editor");
		
		Thread.sleep(2000);
		
		Abp.FillText("This is just to check if the business Use Case Editor Works");
		
		logger.info("Business Use Case is Filled");
		
		Thread.sleep(2000);
		
		Abp.SaveText();
		logger.info("Usecase about to be saved");
		Thread.sleep(2000);
		
		boolean res=driver.getPageSource().contains("Vercel Business Usecase updated");
		
		if(res==true)
		{
			Assert.assertTrue(true);
			logger.info("Test passed");
			Thread.sleep(3000);
		}
		else
		{
			captureScreen(driver, "AddingBusinessUseCase");
			Assert.assertTrue(false);
			logger.info("Test Failed");
		}
		
		
		
	}

}
