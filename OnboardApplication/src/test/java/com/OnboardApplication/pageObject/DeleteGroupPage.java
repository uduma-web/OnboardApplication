package com.OnboardApplication.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DeleteGroupPage 
{
	WebDriver fdriver;
	public DeleteGroupPage(WebDriver jdriver)
	{
		fdriver=jdriver;
		PageFactory.initElements(jdriver, this);
		
	}
	
	@FindBy(xpath="//*[@id=\"user-menu\"]/img")
	@CacheLookup
	WebElement UserProfile;
	
	@FindBy(xpath="//*[@id=\"app\"]/div/div/nav/div/div/div/div[2]/div/div/div[2]/div/div/div/a[2]/span")
	@CacheLookup
	WebElement ManageTeam;
	
	@FindBy(xpath="/html/body/div/div/div/div[2]/main/div/div[2]/div[1]/nav/a[4]")
	@CacheLookup
	WebElement Groups;
	
	@FindBy(xpath="//*[@id=\"search\"]")
	@CacheLookup
	WebElement Search;
	
	@FindBy(xpath="//*[@id=\"app\"]/div/div/div[2]/main/div/div[2]/div[2]/div[2]/ul/li/a")
	@CacheLookup
	WebElement OpenGroup;
	
	@FindBy(xpath="//*[@id=\"app\"]/div/div/div[2]/main/div/div[2]/div[2]/div/button")
	@CacheLookup
	WebElement OptionsIcon;
	
	@FindBy(xpath="//*[@id=\"app\"]/div/div/div[2]/main/div/div[2]/div[2]/div/div/div/button")
	@CacheLookup
	WebElement Delete;
	
	@FindBy(xpath="//*[@id=\"app\"]/div/div/div[2]/div[2]/div/div[2]/div[3]/button[1]")
	@CacheLookup
	WebElement Deleting;
	
	public void ClickingUserProfile()
	{
		UserProfile.click();
	}
	
	public void ClickingTeam()
	{
		ManageTeam.click();
	}
	
	public void ClickGroups()
	{
		Groups.click();
	}
	
	public void SearchingGroups(String name)
	{
		Search.sendKeys(name);
	}
	
	public void OpenningGroup()
	{
		OpenGroup.click();
	}
	
	public void ClickingOptions()
	{
		OptionsIcon.click();
	}
	
	public void Delete()
	{
		Delete.click();
	}
	
	public void ConfirmingDelete()
	{
		Deleting.click();
	}

}
