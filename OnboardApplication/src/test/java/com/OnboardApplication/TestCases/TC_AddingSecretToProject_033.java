package com.OnboardApplication.TestCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.OnboardApplication.pageObject.AddingSecretToProjectPage;
import com.OnboardApplication.pageObject.LoginPage;

public class TC_AddingSecretToProject_033 extends BaseClass
{
	@Test
	public void AddingSecretToProject() throws InterruptedException, IOException
	{
		logger.info("URL is Entered");
		
		LoginPage lp=new LoginPage(driver);
		
		lp.setUserEmail(userEmail);
		
		logger.info("UserEmail has been Entered");
		
		
		
		lp.clickSignin();
		
		logger.info("Signin button Clicked");
		
		Thread.sleep(3000);
		
		AddingSecretToProjectPage Add= new AddingSecretToProjectPage(driver);
		
		Add.Switching();
		logger.info("Switched to project");
		Thread.sleep(3000);
		
		Add.Searching("EMBRAYO");
		logger.info("project is searched out");
		Thread.sleep(3000);
		
		Add.ClickingProject();
		logger.info("Project is clicked");
		Thread.sleep(3000);
		
		Add.ClickingSecret();
		logger.info("Secret is clicked");
		Thread.sleep(3000);
		
		Add.ClickAddSecret();
		logger.info("AddSecret button is clicked");
		Thread.sleep(3000);
		
		Add.Selecting();
		logger.info("secret is being added to project");
		Thread.sleep(3000);
		
		boolean res=driver.getPageSource().contains("Harmony has been added to folder");
		
		if(res==true)
		{
			Assert.assertTrue(true);
			logger.info("Test passed");
			Thread.sleep(3000);
		}
		else
		{
			captureScreen(driver, "AddingSecretToProject");
			Assert.assertTrue(false);
			logger.info("Test Failed");
		}
	}


}
