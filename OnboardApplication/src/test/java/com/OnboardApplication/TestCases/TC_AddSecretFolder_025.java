package com.OnboardApplication.TestCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.OnboardApplication.pageObject.AddSecretFolderPage;
import com.OnboardApplication.pageObject.LoginPage;

public class TC_AddSecretFolder_025 extends BaseClass
{
	@Test
	public void AddingSecretFolder() throws InterruptedException, IOException
	{
		logger.info("URL is Entered");
		
		LoginPage lp=new LoginPage(driver);
		
		lp.setUserEmail(userEmail);
		
		logger.info("UserEmail has been Entered");
		
		
		
		lp.clickSignin();
		
		logger.info("Signin button Clicked");
		
		Thread.sleep(3000);
		
		AddSecretFolderPage Folder =new AddSecretFolderPage(driver);
		
		Folder.Switching();
		logger.info("we just switched from secrets list to project");
		Thread.sleep(2000);
		
		Folder.Adding();
		logger.info("Create a project button is clicked");
		Thread.sleep(2000);
		
		Folder.EnteringTitle("EMBRAYO");
		logger.info("title of the project is entered");
		Thread.sleep(2000);
		
		Folder.AddFirstSecret();
		logger.info("the first secret is added");
		
		Folder.AddSecondSecret();
		logger.info("second secret is added");
		Thread.sleep(4000);
		
		Folder.CreatingFolder();
		logger.info("create button is clicked");
		Thread.sleep(6000);
		
		boolean res=driver.getPageSource().contains("EMBRAYO project created");
		
		if(res==true)
		{
			Assert.assertTrue(true);
			logger.info("Test passed");
			Thread.sleep(3000);
		}
		else
		{
			captureScreen(driver, "AddingSecretFolder");
			Assert.assertTrue(false);
			logger.info("Test Failed");
		}
	}

}
