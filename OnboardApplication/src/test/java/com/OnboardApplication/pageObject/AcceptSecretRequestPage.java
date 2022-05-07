package com.OnboardApplication.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AcceptSecretRequestPage
{
	WebDriver hdriver;
	public AcceptSecretRequestPage(WebDriver jdriver)
	{
		hdriver=jdriver;
		PageFactory.initElements(jdriver, this);
		
	}
	
	@FindBy(xpath="//*[@id=\"search\"]")
	@CacheLookup
	WebElement Search;
	
	 @FindBy(xpath="//*[@id=\"app\"]/div/div/div[2]/main/div/div/div/div/div[2]/div/ul/li")
	 @CacheLookup
	 WebElement ClickSecret;
	 
	 @FindBy(xpath="//*[@id=\"app\"]/div/div/div[2]/main/div/div[3]/div[1]/nav/a[4]")
	 @CacheLookup
	 WebElement Request;
	 
	 @FindBy(xpath="//*[@id=\"app\"]/div/div/div[2]/main/div/div[3]/div[2]/div/div/div[2]/div/ul/li/div/div[2]/button")
	 @CacheLookup
	 WebElement ViewRequest;
	 
	 @FindBy(xpath="//*[@id=\"app\"]/div/div/div[3]/div/section/div/div/div/div/div/div[2]/button[1]")
	 @CacheLookup
	 WebElement Approve;
	
	public void SearchSecret(String name)
	{
		Search.sendKeys(name);
	}
	
	 public void OpenSecret()
	 {
		 ClickSecret.click();
	 }
	 
	 public void CheckRequest()
	 {
		 Request.click();
	 }
	 
	 public void ViewingRequest()
	 {
		 ViewRequest.click();
	 }
	 
	 public void Accepting()
	 {
		 Approve.click();
	 }


}
