package com.OnboardApplication.TestCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.OnboardApplication.pageObject.DeleteToolPage;
import com.OnboardApplication.pageObject.LoginPage;

public class TC_DeleteTool_003 extends BaseClass
{
	@Test
	public void DeleteTool() throws InterruptedException, IOException
	{
		logger.info("URL is Entered");
		
		LoginPage lp=new LoginPage(driver);
		
		lp.setUserEmail(userEmail);
		
		logger.info("UserEmail has been Entered");
		
		
		
		lp.clickSignin();
		
		logger.info("Signin button Clicked");
		
		Thread.sleep(2000);
		
		DeleteToolPage Dt=new DeleteToolPage(driver);
		
		Dt.ClickTeam();
		
		logger.info("Team is clicked");
		
		Thread.sleep(2000);
		
		Dt.ClickTool();
		
		logger.info("Tool is clicked");
		
		Thread.sleep(2000);
		
		Dt.SearchTool("Vercel");
		
		logger.info("Tool inputed");
		
		Thread.sleep(2000);
		
		Dt.ClickSelTool();
		
		logger.info("Selected tool is clicked");
		
		Thread.sleep(2000);
		
		Dt.ViewDel();
		
		logger.info("clicked to show delete button");
		
		Dt.ClickDel();
		
		logger.info("Delete is Clicked");
		
		Thread.sleep(2000);
		
		Dt.InputTool("Vercel");
		
		logger.info("Name of tool Entered");
		
		Dt.DeleteTool();
		
		logger.info("Waiting for tool to be deleted");
		
		Thread.sleep(2000);
		
		boolean res=driver.getPageSource().contains("Tool deleted!");
		
		if(res==true)
		{
			Assert.assertTrue(true);
			logger.info("Test passed");
			Thread.sleep(3000);
		}
		else
		{
			captureScreen(driver, "DeleteTool");
			Assert.assertTrue(false);
			logger.info("Test Failed");
		}
		
		
	}

}
