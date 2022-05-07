package com.OnboardApplication.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddingTeammateToProjectPage 
{
	WebDriver fdriver;
	public AddingTeammateToProjectPage(WebDriver jdriver)
	{
		fdriver=jdriver;
		PageFactory.initElements(jdriver, this);
	}
	
	@FindBy(xpath="//*[@id=\"app\"]/div/div/div[2]/main/div/div/div/div/div[1]/div/div[3]/a/span")
	@CacheLookup
	WebElement Folder;
	
	@FindBy(xpath="//*[@id=\"search\"]")
	@CacheLookup
	WebElement Search;
	
	@FindBy(xpath="//*[@id=\"app\"]/div/div/div[2]/main/div/div/div/div/div[2]/div/ul/li")
	@CacheLookup
	WebElement ClickProject;
	
	@FindBy(xpath="//*[@id=\"app\"]/div/div/div[2]/main/div/div[2]/div[1]/nav/a[3]")
	@CacheLookup
	WebElement Teammate;
	
	@FindBy(xpath="//*[@id=\"app\"]/div/div/div[2]/main/div/div[2]/div[2]/div/div/div[1]/div/div[3]/span/a")
	@CacheLookup
	WebElement GrantAccess;
	
	@FindBy(xpath="//*[@id=\"app\"]/div/div/div[2]/main/div/div[2]/div[2]/div/div/form/div/div/ul/li[1]/div/div/div[2]/div")
	@CacheLookup
	WebElement Select;
	
	
	public void Switching()
	{
		Folder.click();
	}
	
	public void Searching(String name)
	{
		Search.sendKeys(name);
	}
	
	public void ClickingProject()
	{
		ClickProject.click();
	}
	
	public void ClickingTeammate()
	{
		Teammate.click();
	}
	
	public void ClickGrantAccess()
	{
		GrantAccess.click();
	}
	
	public void Selecting()
	{
		Select.click();
	}

}
