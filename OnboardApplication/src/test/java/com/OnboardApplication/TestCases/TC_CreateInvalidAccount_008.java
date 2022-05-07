package com.OnboardApplication.TestCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.OnboardApplication.pageObject.CreateInvalidAccountPage;


public class TC_CreateInvalidAccount_008 extends BaseClass
{
	@Test
	public void CreatingInvalidAccount() throws InterruptedException, IOException
	{
		logger.info("Url is Opened");
		
		CreateInvalidAccountPage create=new CreateInvalidAccountPage(driver);
		
		create.CreateAccount();
		logger.info("create account is clicked");
		
		
		String Name = randomestring()+" Ali";
		create.InputingName(Name);
		logger.info("Random name is entered");
		
		
		String Team = randomestring();
		create.InputingTeam(Team);
		logger.info("Random team is entered");
		
		
		create.InputingWorkEmail("gozieuchendu992@gmail.com");
		logger.info("Random workemail is entered");
		
		create.InputingPassword("epanutin2");
		logger.info("password is entered");
		Thread.sleep(2000);
		
		create.CreatingAccount();
		logger.info("create button is clicked");
		Thread.sleep(2000);
		
		boolean Account=driver.getPageSource().contains("A User with that email already exists");
		
		if(Account==true)
		{
			Assert.assertTrue(true);
			logger.info("Test is passed");
			Thread.sleep(2000);
		}
		
		else
		{
			captureScreen(driver,"CreatingInvalidAccount");
			Assert.assertTrue(false);
			logger.info("Test Failed");
		}
		
	}

}
