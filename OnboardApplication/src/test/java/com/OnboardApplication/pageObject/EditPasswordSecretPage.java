package com.OnboardApplication.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EditPasswordSecretPage
{
	WebDriver vdriver;
	public EditPasswordSecretPage(WebDriver pdriver)
	{
		vdriver=pdriver;
		PageFactory.initElements(pdriver, this);
		
	}
	
	//@FindBy(xpath="//*[@id=\"app\"]/div/div/nav/div/div/div/div[1]/div[2]/div/div[1]/span")
	// @CacheLookup
	 //WebElement ClickTeam;
	 
	 //@FindBy(linkText="Secrets")
	// @CacheLookup
	// WebElement ClickSecrets;
	 
	 @FindBy(id="search")
	 @CacheLookup
	 WebElement Search;
	 
	 @FindBy(xpath="//*[@id=\"app\"]/div/div/div[2]/main/div/div/div/div/div[2]/div/ul/li")
	 @CacheLookup
	 WebElement ClickSecret;
	 
	 @FindBy(xpath="//*[@id=\"app\"]/div/div/div[2]/main/div/div[2]/div[1]/div/div[1]/button")
	 @CacheLookup
	 WebElement Edit;
	 
	 @FindBy(xpath="//*[@id=\"app\"]/div/div/div[2]/div[2]/div/section/div/div/div/div/form/div[1]/div[2]/div/textarea")
	 @CacheLookup
	 WebElement Description;
	 
	 @FindBy(xpath="//*[@id=\"app\"]/div/div/div[2]/div[2]/div/section/div/div/div/div/form/div[1]/div[2]/div/textarea")
	 @CacheLookup
	 WebElement NewDescription;
	 
	 @FindBy(xpath="//*[@id=\"app\"]/div/div/div[2]/div[2]/div/section/div/div/div/div/form/div[2]/button")
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
	 
	 public void Editing()
	 {
		 Edit.click();
	 }
	 
	 public void Clearing()
	 {
		 Description.clear();
	 }
	 
	 public void EnterNewDescription(String text)
	 {
		 NewDescription.sendKeys(text);
	 }
	 
	 public void Saving()
	 {
		 Save.click();
	 }

}
