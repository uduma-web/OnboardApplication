package com.OnboardApplication.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AcceptRecommendationPage 
{
	WebDriver hdriver;
	public AcceptRecommendationPage(WebDriver jdriver) 
	{
		hdriver=jdriver;
		PageFactory.initElements(jdriver, this);	
	}
	
	 @FindBy(id="search")
	 @CacheLookup
	 WebElement Search;
	 
	 @FindBy(xpath="//*[@id=\"app\"]/div/div/div[2]/main/div/div/div/div/div[2]/div/ul/li")
	 @CacheLookup
	 WebElement ClickSecret;
	 
	 @FindBy(xpath="//*[@id=\"app\"]/div/div/div[2]/main/div/div[3]/div[1]/nav/a[2]")
	 @CacheLookup
	 WebElement Env;
	 
	 @FindBy(xpath="//*[@id=\"app\"]/div/div/div[2]/main/div/div[3]/div[2]/div/div/div[2]/form/div[1]/div/div[3]/ul/div/div[1]/div[1]")
	 @CacheLookup
	 WebElement Accept;
	 
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
	 
	 public void Accepting()
	 {
		 Accept.click();
	 }

}
