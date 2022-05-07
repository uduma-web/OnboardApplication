package com.OnboardApplication.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateInvalidAccountPage 
{
	WebDriver fdriver;
	public CreateInvalidAccountPage(WebDriver jdriver)
	{
		fdriver=jdriver;
		PageFactory.initElements(jdriver, this);
	}
	
	@FindBy(xpath="//*[@id=\"app\"]/div/div/div/div/div[1]/p/a")
	@CacheLookup
	WebElement Create;
	
	@FindBy(id="full name")
	@CacheLookup
	WebElement EnterName;
	
	@FindBy(id="company name")
	@CacheLookup
	WebElement TeamName;
	
	@FindBy(xpath="/html/body/div/div/div/div/div/div[2]/div[1]/form/div[3]/div/input")
	@CacheLookup
	WebElement WorkEmail;
	
	@FindBy(id="password")
	@CacheLookup
	WebElement Password;
	
	@FindBy(xpath="//*[@id=\"app\"]/div/div/div/div/div[2]/div[1]/form/div[5]/span/button")
	@CacheLookup
	WebElement CreateButton;
	
	public void CreateAccount()
	{
		Create.click();
	}
	
	public void InputingName(String name)
	{
		EnterName.sendKeys(name);
	}
	
	public void InputingTeam(String name)
	{
		TeamName.sendKeys(name);
	}
	
	public void InputingWorkEmail(String name)
	{
		WorkEmail.sendKeys(name);
	}
	
	public void InputingPassword(String pwd)
	{
		Password.sendKeys(pwd);
	}
	
	public void CreatingAccount()
	{
		CreateButton.click();
	}

}
