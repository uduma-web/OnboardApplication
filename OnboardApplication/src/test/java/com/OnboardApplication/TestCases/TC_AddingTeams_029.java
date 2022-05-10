package com.OnboardApplication.TestCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.OnboardApplication.pageObject.AddingTeamPage;
import com.OnboardApplication.pageObject.LoginPage;

public class TC_AddingTeams_029 extends BaseClass
{
	@Test
	public void CreatingTeams() throws InterruptedException, IOException
	{
		logger.info("URL is Entered");
		
		LoginPage lp=new LoginPage(driver);
		
		lp.setUserEmail(userEmail);
		
		logger.info("UserEmail has been Entered");
		
		
		
		lp.clickSignin();
		
		logger.info("Signin button Clicked");
		Thread.sleep(6000);
		
		AddingTeamPage Team=new AddingTeamPage(driver);
		
		Team.ClickingUserProfile();
		logger.info("Clicking on user menu");
		Thread.sleep(2000);
		
		Team.ClickingOrganization();
		logger.info("Clicking on manage your Team");
		Thread.sleep(4000);
		
		Team.ClickingTeams();
		logger.info("Clicking on Groups");
		Thread.sleep(2000);
		
		Team.ClickingCreate();
		logger.info("Clicking on Create Group");
		Thread.sleep(2000);
		
		Team.EnteringTitle("TESTING");
		logger.info("Entering name of Group");
		Thread.sleep(2000);
		
		Team.AddingTeammate();
		logger.info("Adding a teammate");
		Thread.sleep(2000);
		
		Team.CreatingTeam();
		logger.info("Create button is clicked");
		Thread.sleep(2000);
		
		boolean res=driver.getPageSource().contains("Team created");
		
		if(res==true)
		{
			Assert.assertTrue(true);
			logger.info("Test passed");
			Thread.sleep(4000);
		}
		else
		{
			captureScreen(driver, "CreatingTeams");
			Assert.assertTrue(false);
			logger.info("Test Failed");
		}
		
	}

}
