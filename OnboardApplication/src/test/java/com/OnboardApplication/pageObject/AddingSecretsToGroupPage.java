package com.OnboardApplication.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddingSecretsToGroupPage
{
	WebDriver fdriver;
	public AddingSecretsToGroupPage(WebDriver jdriver)
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
	
	@FindBy(xpath="//*[@id=\"app\"]/div/div/div[2]/main/div/div[3]/div[1]/nav/a[2]")
	@CacheLookup
	WebElement Secrets;
	
	@FindBy(xpath="//*[@id=\"app\"]/div/div/div[2]/main/div/div[3]/div[2]/div/div/div/div[1]/div/div[3]/span/a")
	@CacheLookup
	WebElement AddSecrets;
	
	@FindBy(xpath="//*[@id=\"app\"]/div/div/div[2]/main/div/div[3]/div[2]/div/div/div/form/div/div/div/ul/li[1]/div/div/div[2]/span/button")
	@CacheLookup
	WebElement AddFirstSecrets;
	
	
	
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
	
	public void ClickingSecrets()
	{
		Secrets.click();
	}
	
	public void AddSecret()
	{
		AddSecrets.click();
	}
	
	public void AddingFirstSecret()
	{
		AddFirstSecrets.click();
	}
	
	
		

}
