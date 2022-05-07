package com.OnboardApplication.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProfileSettingsPage
{
	WebDriver pdriver;
	public ProfileSettingsPage(WebDriver jdriver)
	{

		pdriver=jdriver;
		PageFactory.initElements(jdriver, this);
	}
	
	@FindBy(xpath="/html/body/div/div/div/nav/div/div/div/div[2]/div/div[2]/div[1]/button/img")
	@CacheLookup
	WebElement Menu;
	
	@FindBy(xpath="//*[@id=\"app\"]/div/div/nav/div/div/div/div[2]/div/div[2]/div[2]/div/div/div/a")
	@CacheLookup
	WebElement Account;
	
	@FindBy(xpath="//*[@id=\"first_name\"]")
	@CacheLookup
	WebElement Clear;
	
	@FindBy(xpath="//*[@id=\"first_name\"]")
	@CacheLookup
	WebElement Input;
	
	@FindBy(xpath="//*[@id=\"location\"]")
	@CacheLookup
	WebElement ClearLocation;
	
	@FindBy(xpath="//*[@id=\"location\"]")
	@CacheLookup
	WebElement InputLocation;
	
	@FindBy(xpath="/html/body/div/div/div/div[2]/main/div/div[2]/div[2]/form/div[1]/div/div[8]/div/input[1]")
	@CacheLookup
	WebElement ClearCountryCode;
	
	@FindBy(xpath="/html/body/div/div/div/div[2]/main/div/div[2]/div[2]/form/div[1]/div/div[8]/div/input[1]")
	@CacheLookup
	WebElement InputCountryCode;
	
	@FindBy(xpath="/html/body/div/div/div/div[2]/main/div/div[2]/div[2]/form/div[1]/div/div[8]/div/input[2]")
	@CacheLookup
	WebElement ClearPhoneNum;
	
	@FindBy(xpath="/html/body/div/div/div/div[2]/main/div/div[2]/div[2]/form/div[1]/div/div[8]/div/input[2]")
	@CacheLookup
	WebElement InputPhoneNum;
	
	@FindBy(xpath="//*[@id=\"app\"]/div/div/div[2]/main/div/div[2]/div[2]/form/div[2]/div[2]/span/button")
	@CacheLookup
	WebElement Save;
	
	public void HitMenu()
	{
		Menu.click();
	}
	
	public void HitAccount()
	{
		Account.click();
	}
	
	public void Clearing()
	{
		Clear.clear();
	}
	
	public void EntFullName(String name)
	{
		Input.sendKeys(name);
	}
	
	public void ClearingLoc()
	{
		ClearLocation.clear();
	}
	
	public void InputingLocation(String name)
	{
		InputLocation.sendKeys(name);
	}
	
	public void ClearingCountryCode()
	{
		ClearCountryCode.clear();
	}
	
	public void InputingCountryCode(String text)
	{
		InputCountryCode.sendKeys(text);
	}
	
	public void ClearingPhoneNumber()
	{
		ClearPhoneNum.clear();
	}
	
	public void InputingPhoneNumber(String text)
	{
		InputPhoneNum.sendKeys(text);
	}
	
	public void Saving()
	{
		Save.click();
	}



}
