package com.OnboardApplication.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	WebDriver ldriver;
	
	public LoginPage(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver,this);
		
	}
	
	@FindBy(id="email")
	@CacheLookup
	WebElement txtUserEmail;
	
	@FindBy(id="password")
	@CacheLookup
	WebElement txtpassword;
	
	@FindBy(xpath="//*[@id=\"app\"]/div/div/div/div/div[2]/div[1]/form/div[4]/span/button")
	@CacheLookup
	WebElement btnSignin;
	
	
	public void setUserEmail(String email)
	{
	
		txtUserEmail.sendKeys(email);
	}
	
	public void setPassword(String pwd)
	{
		txtpassword.sendKeys(pwd);
	}
	
	public void clickSignin()
	{
		btnSignin.click();
	}

}
