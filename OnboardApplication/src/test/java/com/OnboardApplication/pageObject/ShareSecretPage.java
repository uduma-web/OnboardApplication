package com.OnboardApplication.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShareSecretPage
{
	WebDriver fdriver;
	public ShareSecretPage(WebDriver jdriver)
	{
		fdriver=jdriver;
		PageFactory.initElements(jdriver, this);
		
	}
	
	@FindBy(id="search")
	 @CacheLookup
	 WebElement Search;
	 
	 @FindBy(xpath="//*[@id=\"app\"]/div/div/div[2]/main/div/div/div/div/div[2]/div/ul/li")
	 @CacheLookup
	 WebElement ClickSecret;
	 
	 @FindBy(xpath="//*[@id=\"app\"]/div/div/div[2]/main/div/div[2]/div[2]/div/button")
	 @CacheLookup
	 WebElement OptionsIcon;
	 
	 @FindBy(xpath="//*[@id=\"app\"]/div/div/div[2]/main/div/div[2]/div[2]/div/div/div/button[1]")
	 @CacheLookup
	 WebElement Share;
	 
	 @FindBy(xpath="//*[@id=\"email\"]")
	 @CacheLookup
	 WebElement EnterEmail;
	 
	 @FindBy(xpath="//*[@id=\"app\"]/div/div/div[2]/div[2]/div/section/div/div/div/div/form/div[3]/button")
	 @CacheLookup
	 WebElement Send;
	 
	 
	 public void SearchSecret(String text)
	 {
		 Search.sendKeys(text);
	 }
	 
	 public void OpenSecret()
	 {
		 ClickSecret.click();
	 }
	 
	 public void ClickOptionsIcon()
	 {
		 OptionsIcon.click();
	 }
	 
	 public void ClickShare()
	 {
		 Share.click();
	 }
	 
	 public void EnteringEmail(String text)
	 {
		 EnterEmail.sendKeys(text);
	 }
	 
	 public void Sending()
	 {
		 Send.click();
	 }
	 
	

}
