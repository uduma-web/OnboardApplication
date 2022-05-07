package com.OnboardApplication.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GrantTeammateAccessToSecretPage
{
	WebDriver fdriver;
	public GrantTeammateAccessToSecretPage(WebDriver tdriver)
	{
		fdriver=tdriver;
		PageFactory.initElements(tdriver, this);	
	}
	
	 //@FindBy(xpath="//*[@id=\"app\"]/div/div/nav/div/div/div/div[1]/div[2]/div/div[1]/span")
	 //@CacheLookup
	 //WebElement ClickTeam;
	 
	// @FindBy(linkText="Secrets")
	// @CacheLookup
	// WebElement ClickSecrets;
	 
	 @FindBy(id="search")
	 @CacheLookup
	 WebElement Search;
	 
	 @FindBy(xpath="//*[@id=\"app\"]/div/div/div[2]/main/div/div/div/div/div[2]/div/ul/li")
	 @CacheLookup
	 WebElement ClickSecret;
	 
	 @FindBy(xpath="/html/body/div/div/div/div[2]/main/div/div[3]/div[1]/nav/a[3]")
	 @CacheLookup
	 WebElement ClickTeammates;
	 
	 @FindBy(xpath="//*[@id=\"app\"]/div/div/div[2]/main/div/div[3]/div[2]/div/div/div[1]/div/div[3]/span/a")
	 @CacheLookup
	 WebElement GrantAccess;
	 
	 @FindBy(xpath="//*[@id=\"search\"]")
	 @CacheLookup
	 WebElement Searchname;
	 
	 @FindBy(xpath="//*[@id=\"app\"]/div/div/div[2]/main/div/div[3]/div[2]/div/div/form/div/div/ul/li/div/div/div[2]/div/div/div/span/button")
	 @CacheLookup
	 WebElement Add;
	 
	// public void ClickTeam()
	// {
	//	 ClickTeam.click();
	 //}
	 
	// public void ClickSecrets()
	// {
	//	 ClickSecrets.click();
	// }
	 
	 public void SearchSecret(String text)
	 {
		 Search.sendKeys(text);
	 }
	 
	 public void OpenSecret()
	 {
		 ClickSecret.click();
	 }
	 
	 public void ClickingTeammates()
	 {
		 ClickTeammates.click();
	 }
	 
	 public void GrantingAccess()
	 {
		 GrantAccess.click();
	 }
	 
	 public void Searching(String name)
	 {
		 Searchname.sendKeys(name);
	 }
	 
	 public void AddingTeammates()
	 {
		 Add.click();
	 }

}
