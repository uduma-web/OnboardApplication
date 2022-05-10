package com.OnboardApplication.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddingTeamPage 
{
	WebDriver fdriver;
	public AddingTeamPage(WebDriver jdriver)
	{
		fdriver=jdriver;
		PageFactory.initElements(jdriver, this);
		
	}
	
	@FindBy(xpath="//*[@id=\"user-menu\"]/img")
	@CacheLookup
	WebElement UserProfile;
	
	@FindBy(xpath="//*[@id=\"app\"]/div/div/nav/div/div/div/div[2]/div/div/div[2]/div/div/div/a[2]/span")
	@CacheLookup
	WebElement ManageOrganization;
	
	@FindBy(xpath="//*[@id=\"app\"]/div/div/div[2]/main/div[1]/div[2]/div[2]/div[2]/nav/a[4]")
	@CacheLookup
	WebElement Teams;
	
	@FindBy(xpath="//*[@id=\"app\"]/div/div/div[2]/main/div[2]/div/div/div[1]/div/div[3]/span/a")
	@CacheLookup
	WebElement CreateATeam;
	
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
	
	public void ClickingOrganization()
	{
		ManageOrganization.click();
	}
	
	public void ClickingTeams()
	{
		Teams.click();
	}
	
	public void ClickingCreate()
	{
		CreateATeam.click();
	}
	
	public void EnteringTitle(String name)
	{
		Title.sendKeys(name);
	}
	
	public void AddingTeammate()
	{
		AddTeammate.click();
	}
	
	public void CreatingTeam()
	{
		Create.click();
	}

}
