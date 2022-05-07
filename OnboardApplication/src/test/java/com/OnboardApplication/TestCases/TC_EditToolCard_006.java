package com.OnboardApplication.TestCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.OnboardApplication.pageObject.EditToolCardPage;
import com.OnboardApplication.pageObject.LoginPage;

public class TC_EditToolCard_006 extends BaseClass 
{
	@Test
	public void EditToolCard() throws InterruptedException, IOException
	{
		logger.info("Url is Entered");
		
		LoginPage lp=new LoginPage(driver);
		
		lp.setUserEmail(userEmail);
		
		logger.info("UserEmail has been Entered");
		
		
		
		lp.clickSignin();
		
		logger.info("Signin button Clicked");
		
		Thread.sleep(2000);
		
		EditToolCardPage Et=new EditToolCardPage(driver);
		
		Et.ClickTeam();
		
		logger.info("Team is clicked");
		
		Thread.sleep(2000);
		
		Et.ClickTool();
		
		logger.info("Tool is clicked");
		
		Thread.sleep(2000);
		
		Et.SearchTool("Vercel");
		
		logger.info("Tool inputed");
		
		Thread.sleep(2000);
		
		Et.ClickSelTool();
		
		logger.info("Selected tool is clicked");
		
		Thread.sleep(2000);
		
		Et.EditCard("Just Running an Automation Test on Vercel");
		
		Thread.sleep(2000);
		
		Et.SaveCard();
		
		Thread.sleep(2000);
		
		boolean res=driver.getPageSource().contains("Vercel updated");
		
		if(res==true)
		{
			Assert.assertTrue(true);
			logger.info("Test passed");
			Thread.sleep(2000);
		}
		else
		{
			captureScreen(driver, "EditToolCard");
			Assert.assertTrue(false);
			logger.info("Test Failed");
		}
		
	}

}
