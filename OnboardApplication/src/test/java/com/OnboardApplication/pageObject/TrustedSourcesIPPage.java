package com.OnboardApplication.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TrustedSourcesIPPage
{
	WebDriver fdriver;
	public TrustedSourcesIPPage(WebDriver jdriver)
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
	 
	 @FindBy(xpath="//*[@id=\"app\"]/div/div/div[2]/main/div/div[2]/div[2]/div/div/div/button[2]")
	 @CacheLookup
	 WebElement TrustedSources;
	 
	 @FindBy(xpath="//*[@id=\"app\"]/div/div/div[2]/div[2]/div/section/div/div/div/div/div/div[1]/div/div/div/input")
	 @CacheLookup
	 WebElement EnterIPAddress;
	 
	 @FindBy(xpath="//*[@id=\"app\"]/div/div/div[2]/div[2]/div/section/div/div/div/div/div/div[1]/div/div/span/button")
	 @CacheLookup
	 WebElement Add;
	 
	 @FindBy(xpath="//*[@id=\"app\"]/div/div/div[2]/div[2]/div/section/div/div/div/div/div/div[1]/div/div/div/input")
	 @CacheLookup
	 WebElement EnterNewIPAddress;
	 
	 @FindBy(xpath="//*[@id=\"app\"]/div/div/div[2]/div[2]/div/section/div/div/div/div/div/div[2]/div/button")
	 @CacheLookup
	 WebElement Update;
	 
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
	 
	 public void ClickingTrustedSources()
	 {
		 TrustedSources.click();
	 }
	 
	 public void Entering1stIp(String name)
	 {
		 EnterIPAddress.sendKeys(name); 
	 }
	 
	 public void AddNewIp()
	 {
		 Add.click();
	 }
	 
	 public void Entering2ndIp(String name)
	 {
		 EnterNewIPAddress.sendKeys(name);
	 }
	 
	 public void Updating()
	 {
		 Update.click();
	 }

}
