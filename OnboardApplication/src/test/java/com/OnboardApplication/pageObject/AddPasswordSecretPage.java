package com.OnboardApplication.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddPasswordSecretPage
{
	WebDriver jdriver;
	public AddPasswordSecretPage(WebDriver kdriver)
	
	{
		jdriver=kdriver;
		PageFactory.initElements(kdriver, this);
	}
	
	 
	 
	 @FindBy(xpath="//*[@id=\"app\"]/div/div/div[2]/main/div/div/div/div/div[1]/div/div[4]/div/button")
	 @CacheLookup
	 WebElement CreateSecret;
	 
	 @FindBy(xpath="//*[@id=\"app\"]/div/div/div[3]/div/section/div/div/div/div/div/a[2]/div/div[2]")
	 @CacheLookup
	 WebElement ClickPasswordSecret;
	 
	 @FindBy(xpath="//*[@id=\"title\"]")
	 @CacheLookup
	 WebElement Title;
	 
	 @FindBy(id="description")
	 @CacheLookup
	 WebElement Description;
	 
	 @FindBy(id="username")
	 @CacheLookup
	 WebElement Username;
	 
	 @FindBy(id="password")
	 @CacheLookup
	 WebElement Password;
	 
	 @FindBy(xpath="//*[@id=\"app\"]/div/div/div[2]/main/div/div/div/div[2]/div/form/div/div/span/button")
	 @CacheLookup
	 WebElement Create;
	 
	 
	 
	 public void AddSecret()
	 {
		 CreateSecret.click();
	 }
	 
	 public void AddingPasswordSecret()
	 {
		 ClickPasswordSecret.click();
	 }
	 
	 public void AddTitle(String name)
	 {
		 Title.sendKeys(name);
	 }
	 
	 public void AddDescription(String text)
	 {
		 Description.sendKeys(text);
	 }
	 
	 public void AddUserName(String text)
	 {
		 Username.sendKeys(text);
	 }
	 
	 public void AddPassword(String name)
	 {
		 Password.sendKeys(name);
	 }
	 
	 public void Create()
	 {
		 Create.click();
	 }

}
