package com.OnboardApplication.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddApiKeySecretPage 
{
	WebDriver jdriver;
	public AddApiKeySecretPage (WebDriver kdriver)
	{
		jdriver=kdriver;
		PageFactory.initElements(kdriver, this);
	}
	
	 //@FindBy(xpath="//*[@id=\"app\"]/div/div/nav/div/div/div/div[1]/div[2]/div/div[1]/span")
	 //@CacheLookup
	// WebElement ClickTeam;
	 
	// @FindBy(linkText="Secrets")
	// @CacheLookup
	// WebElement ClickSecrets;
	 
	 @FindBy(xpath="//*[@id=\"app\"]/div/div/div[2]/main/div/div/div/div/div[1]/div/div[4]/div/button")
	 @CacheLookup
	 WebElement CreateSecret;
	 
	 @FindBy(xpath="//*[@id=\"app\"]/div/div/div[3]/div/section/div/div/div/div/div/a[1]/div/div[2]")
	 @CacheLookup
	 WebElement ApiKeys;
	 
	 @FindBy(id="apiTitle")
	 @CacheLookup
	 WebElement ApiTitle;
	 
	 @FindBy(id="apiDescription")
	 @CacheLookup
	 WebElement ApiDescription;
	 
	 @FindBy(xpath="//*[@id=\"key\"]")
	 @CacheLookup
	 WebElement EnterKey;
	 
	 @FindBy(xpath="/html/body/div/div/div/div[2]/main/div/div/div/div[2]/div/form/form/div/div[3]/div/div/div[3]/textarea")
	 @CacheLookup
	 WebElement EnterValue;
	 
	 @FindBy(xpath="/html/body/div/div/div/div[2]/main/div/div/div/div[2]/div/form/div/div/span/button")
	 @CacheLookup
	 WebElement CreateApiSecret;
	 
	// public void ClickTeam()
	 //{
	//	 ClickTeam.click();
	// }
	 
	// public void ClickSecrets()
	// {
	//	 ClickSecrets.click();
	// }
	 
	 public void AddSecret()
	 {
		 CreateSecret.click();
	 }
	 
	 public void ClickApiKeys()
	 {
		 ApiKeys.click();
	 }
	 
	 public void EnteringTitle(String text)
	 {
		 ApiTitle.sendKeys(text);
	 }
	 
	 public void EnteringDescription(String text)
	 {
		 ApiDescription.sendKeys(text);
	 }
	 
	 public void EnterKey(String text)
	 {
		 EnterKey.sendKeys(text);
	 }
	 
	 public void EnterValue(String text)
	 {
		 EnterValue.sendKeys(text);
	 }
	 
	 public void CreateApiKey()
	 {
		 CreateApiSecret.click();
	 }

}
