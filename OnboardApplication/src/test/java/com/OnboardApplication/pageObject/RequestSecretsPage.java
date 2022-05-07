package com.OnboardApplication.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RequestSecretsPage
{
	WebDriver pdriver;
	
	public RequestSecretsPage(WebDriver fdriver)
	
	{
		pdriver=fdriver;
		PageFactory.initElements(fdriver, this);
		
	}
	
	@FindBy(xpath="//*[@id=\"search\"]")
	@CacheLookup
	WebElement Search;
	
	@FindBy(xpath="//*[@id=\"app\"]/div/div/div[2]/main/div/div/div/div/div[2]/div/ul/li/div/div/div[2]/div/button")
	@CacheLookup
	WebElement Request;
	
	@FindBy(xpath="//*[@id=\"Note\"]")
	@CacheLookup
	WebElement Reason;
	
	@FindBy(xpath="//*[@id=\"app\"]/div/div/div[3]/div/section/div/div/div/div/div/div[2]/button")
	@CacheLookup
	WebElement SendRequest;
	
	
	public void SearchSecret(String name)
	{
		Search.sendKeys(name);
	}
	
	public void Requesting()
	{
		Request.click();
	}
	
	public void ReasonforRequest(String text)
	{
		Reason.sendKeys(text);
	}
	
	public void SendRequest()
	{
		SendRequest.click();
	}

}
