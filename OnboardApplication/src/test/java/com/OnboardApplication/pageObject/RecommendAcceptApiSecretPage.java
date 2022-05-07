package com.OnboardApplication.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RecommendAcceptApiSecretPage
{
	WebDriver fdriver;
	public RecommendAcceptApiSecretPage(WebDriver jdriver)
	{
		fdriver=jdriver;
		PageFactory.initElements(jdriver, this);
		
	}
	
	 //@FindBy(xpath="//*[@id=\"app\"]/div/div/nav/div/div/div/div[1]/div[2]/div/div[1]/span")
	// @CacheLookup
	// WebElement ClickTeam;
	 
	 //@FindBy(linkText="Secrets")
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
	 
	 @FindBy(xpath="//*[@id=\"app\"]/div/div/div[2]/main/div/div[3]/div[2]/div/div/div[2]/form/div[2]/div")
	 @CacheLookup
	 WebElement RecommendNew;
	 
	 @FindBy(xpath="/html/body/div/div/div/div[2]/main/div/div[3]/div[2]/div/div/div[2]/form/div[2]/div/div[2]/div/textarea")
	 @CacheLookup
	 WebElement Notes;
	 
	 @FindBy(xpath="/html/body/div/div/div/div[2]/main/div/div[3]/div[2]/div/div/div[2]/form/div[2]/div/div[3]/div/div/div[1]/div[2]/input")
	 @CacheLookup
	 WebElement Key;
	 
	 @FindBy(xpath="/html/body/div/div/div/div[2]/main/div/div[3]/div[2]/div/div/div[2]/form/div[2]/div/div[3]/div/div/div[1]/div[3]/textarea")
	 @CacheLookup
	 WebElement Value;
	 
	 @FindBy(xpath="//*[@id=\"app\"]/div/div/div[2]/main/div/div[3]/div[2]/div/div/div[2]/form/div[2]/div/div[4]/div/span[2]/button")
	 @CacheLookup
	 WebElement Recommend;
	 
	
	 
	 //public void ClickTeam()
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
	 
	 public void Recommending()
	 {
		 RecommendNew.click();
	 }
	 
	 public void AddingNotes(String text)
	 {
		 Notes.sendKeys(text);
	 }
	 
	 public void EnteringKey(String text)
	 {
		 Key.sendKeys(text);
	 }
	 
	 public void EnteringValue(String text)
	 {
		 Value.sendKeys(text);
	 }
	 
	 public void Recommend()
	 {
		 Recommend.click();
	 }
	 
	 

}
