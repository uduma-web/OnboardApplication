package com.OnboardApplication.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DeleteKeyvalueApiSecretPage
{
	WebDriver tdriver;
	public DeleteKeyvalueApiSecretPage(WebDriver gdriver)
	{
		tdriver=gdriver;
		PageFactory.initElements(gdriver, this);
		
	}
	
	 //@FindBy(xpath="//*[@id=\"app\"]/div/div/nav/div/div/div/div[1]/div[2]/div/div[1]/span")
	// @CacheLookup
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
	 
	 @FindBy(xpath="//*[@id=\"app\"]/div/div/div[2]/main/div/div[3]/div[1]/nav/a[2]")
	 @CacheLookup
	 WebElement Env;
	 
	 @FindBy(xpath="//*[@id=\"app\"]/div/div/div[2]/main/div/div[3]/div[2]/div/div/div[2]/form/div[1]/div/div[1]/div/div[2]/div[1]/span[3]")
	 @CacheLookup
	 WebElement RemoveKeyValue;
	 
	 @FindBy(xpath="//*[@id=\"app\"]/div/div/div[2]/main/div/div[3]/div[2]/div/div/div[2]/form/div[3]/div/span/button")
	 @CacheLookup
	 WebElement Save;
	 
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
	 
	 public void ClickingEnv()
	 {
		 Env.click();
	 }
	 
	 public void DeleteKeyValue()
	 {
		 RemoveKeyValue.click();
	 }
	 
	 public void Saving()
	 {
		 Save.click();
	 }

}
