package com.OnboardApplication.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddingGroupsPage 
{
	WebDriver fdriver;
	public AddingGroupsPage(WebDriver jdriver)
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
	
	@FindBy(xpath="//*[@id=\"app\"]/div/div/div[2]/main/div/div[2]/div[2]/div[1]/div/div[3]/span/a")
	@CacheLookup
	WebElement CreateAGroup;
	
	@FindBy(xpath="//*[@id=\"title\"]")
	@CacheLookup
	WebElement Title;
	
	@FindBy(xpath="//*[@id=\"app\"]/div/div/div[2]/main/div/div[2]/div[2]/div[2]/form/div[1]/div/div[2]/div[2]/div[2]/ul/li[1]/div[3]/button")
	@CacheLookup
	WebElement AddTeammate;
	
	@FindBy(xpath="//*[@id=\"app\"]/div/div/div[2]/main/div/div[2]/div[2]/div[2]/form/div[2]/div/span/button")
	@CacheLookup
	WebElement Create;
	
	public void ClickingUserProfile()
	{
		UserProfile.click();
	}
	
	public void ClickingTeam()
	{
		ManageTeam.click();
	}
	
	public void ClickingGroups()
	{
		Groups.click();
	}
	
	public void ClickingCreate()
	{
		CreateAGroup.click();
	}
	
	public void EnteringTitle(String name)
	{
		Title.sendKeys(name);
	}
	
	public void AddingTeammate()
	{
		AddTeammate.click();
	}
	
	public void CreatingGroup()
	{
		Create.click();
	}

}
