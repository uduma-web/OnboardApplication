package com.OnboardApplication.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SwitchAccountPage 
{
	WebDriver fdriver;
	public SwitchAccountPage(WebDriver jdriver)
	{
		fdriver=jdriver;
		PageFactory.initElements(jdriver, this);
	}
	
	@FindBy(xpath="//*[@id=\\\"user-menu\\\"]/img")
	@CacheLookup
	WebElement UserProfile;
	
	@FindBy(xpath="//*[@id=\"app\"]/div/div/nav/div/div/div/div[2]/div/div/div[2]/div/div/button[1]")
	@CacheLookup
	WebElement SwitchAccount;
	
	@FindBy(xpath="//*[@id=\"app\"]/div/div[2]/div/section/div/div/div/div/ul/li[2]/button")
	@CacheLookup
	WebElement Switching;
	
	public void ClickingProfile()
	{
		UserProfile.click();
	}
	
	public void ClickingSwitch()
	{
		SwitchAccount.click();
	}
	
	public void Switching()
	{
		Switching.click();
	}

}
