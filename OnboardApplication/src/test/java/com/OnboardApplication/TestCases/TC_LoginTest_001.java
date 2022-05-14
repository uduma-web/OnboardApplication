package com.OnboardApplication.TestCases;

import static org.testng.Assert.assertTrue;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;
import java.util.Properties;

import org.testng.Assert;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.OnboardApplication.pageObject.LoginPage;
import com.testing.framework.EmailUtils;

public class TC_LoginTest_001 extends BaseClass {

	@Test
	public void loginTest() throws Exception {
		String Link;

		// logger.info("URL is Opened");

		// LoginPage lp=new LoginPage(driver);
		// lp.setUserEmail(userEmail);
		// logger.info("Email has been Entered");

		// lp.clickSignin();
		// logger.info("Sign in Button Clicked");
		// Thread.sleep(3000);

		EmailUtils emailutils = new EmailUtils();
		Properties prop = new Properties();
		prop.load(new FileInputStream(
				"C:\\Users\\VIUMEE\\eclipse-victor's\\OnboardApplication\\Configurations\\config.properties"));
		List<String> emailText = emailutils.getUnreadMessageByFromEmail(emailutils.connectToGmail(prop), "Inbox","no-reply@onboardbase.com", "Onboardbase Login Verification");
//		String myString = 'https://app.onboardbase.com//confirm-email/';
//		Pattern p = Pattern.compile("");
//		Matcher m = p.matcher(myString);
//		System.out.println("number of content =========== :" + m.group(1));

		
		for (int x = 0; x < emailText.size(); x++) {
			System.out.println("number of content =========== :" + emailText.size());

			System.out.println("content of email text :" + emailText.get(x));
		}
		if (emailText.size() < 1)
			throw new Exception("NO EMAIL RECEIVED");
		else {

			String regex = "[^\\d\\w][a-z][0-9]+";
//			String emaillink = 
			String[] arrLink = emailText.get(0).split(regex);
			Link = arrLink[1];
			System.out.println("Link is" + Link);
		}
		// boolean res=driver.getPageSource().contains(" KELECHI IBE, ");

		// if(res==true)
		// {
		// Assert.assertTrue(true);
		// logger.info("Test passed");
		// Thread.sleep(2000);
		// }
		// else
		// {
		// captureScreen(driver,"loginTest");
		// Assert.assertTrue(false);
		// logger.info("Test Failed");
		// }

	}

}
