package com.OnboardApplication.TestCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.OnboardApplication.pageObject.CreateValidAccountPage;


public class TC_CreateValidAccount_019 extends BaseClass
{
	@Test
	public void CreatingValidAccount() throws InterruptedException, IOException
	{
		logger.info("Url is Opened");
		
		CreateValidAccountPage create=new CreateValidAccountPage(driver);
		
		create.CreateAccount();
		logger.info("create account is clicked");
		
		
		String Name = randomestring()+" Ali";
		create.InputingName(Name);
		logger.info("Random name is entered");
		
		
		String Team = randomestring();
		create.InputingTeam(Team);
		logger.info("Random team is entered");
		
		
		String WorkEmail = randomestring()+"@gmail.com";
		create.InputingWorkEmail(WorkEmail);
		logger.info("Random workemail is entered");
		
		create.InputingPassword("epanutin2");
		logger.info("password is entered");
		Thread.sleep(2000);
		
		create.CreatingAccount();
		logger.info("create button is clicked");
		Thread.sleep(2000);
		
		boolean Account=driver.getPageSource().contains("Confirm your email to continue");
		
		if(Account==true)
		{
			Assert.assertTrue(true);
			logger.info("Test is passed");
			Thread.sleep(2000);
		}
		
		else
		{
			captureScreen(driver,"CreatingValidAccount");
			Assert.assertTrue(false);
			logger.info("Test Failed");
		}
		
		
	}

}
