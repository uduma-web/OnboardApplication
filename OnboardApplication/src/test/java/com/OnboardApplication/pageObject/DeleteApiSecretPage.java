package com.OnboardApplication.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DeleteApiSecretPage
{
	WebDriver fdriver;
	public DeleteApiSecretPage(WebDriver pdriver)
	{
		fdriver=pdriver;
		PageFactory.initElements(pdriver, this);
		
	}
	
	// @FindBy(xpath="//*[@id=\"app\"]/div/div/nav/div/div/div/div[1]/div[2]/div/div[1]/span")
	// @CacheLookup
	// WebElement ClickTeam;
	 
	 //@FindBy(linkText="Secrets")
	 //@CacheLookup
	// WebElement ClickSecrets;
	 
	 @FindBy(id="search")
	 @CacheLookup
	 WebElement Search;
	 
	 @FindBy(xpath="//*[@id=\"app\"]/div/div/div[2]/main/div/div/div/div/div[2]/div/ul/li")
	 @CacheLookup
	 WebElement ClickSecret;
	 
	 @FindBy(xpath="//*[@id=\"app\"]/div/div/div[2]/main/div/div[2]/div[2]/div/button")
	 @CacheLookup
	 WebElement PopDelete;
	 
	 @FindBy(xpath="//*[@id=\"app\"]/div/div/div[2]/main/div/div[2]/div[2]/div/div/div/button[4]")
	 @CacheLookup
	 WebElement Delete;
	 
	 @FindBy(xpath="//*[@id=\"app\"]/div/div/div[2]/div[2]/div/div[2]/div[3]/button[1]")
	 @CacheLookup
	 WebElement Button;
	 
	// public void ClickTeam()
	// {
	//	 ClickTeam.click();
	// }
	 
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
	 
	 public void AboutDeleting()
	 {
		 PopDelete.click();
	 }
	 
	 public void Deleting()
	 {
		 Delete.click();
	 }
	 
	 public void ClickButton()
	 {
		 Button.click();
	 }

}
