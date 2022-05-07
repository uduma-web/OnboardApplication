package com.OnboardApplication.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddToolGuidePage
{
	WebDriver tdriver;
	
	public AddToolGuidePage(WebDriver pdriver)
	{
		tdriver=pdriver;
		PageFactory.initElements(pdriver, this);
		
	}
	
	 @FindBy(xpath="//*[@id=\"app\"]/div/div/nav/div/div/div/div[1]/div[2]/div/div[1]/span")
	 @CacheLookup
	 WebElement ClickTeam;
	 
	 @FindBy(xpath="//*[@id=\"app\"]/div/div/nav/div/div/div/div[1]/div[2]/div/div[1]/div/div/a[1]")
	 @CacheLookup
	 WebElement ClickTool;
	 
	 @FindBy(xpath="//*[@id=\"search\"]")
	 @CacheLookup
	 WebElement txtTool;
	 
	 @FindBy(xpath="//*[@id=\"app\"]/div/div/div[2]/main/div/div/div/div[2]/ul/li/a/div")
	 @CacheLookup
	 WebElement ClickSelTool;
	 
	 @FindBy(xpath="//*[@id=\"app\"]/div/div/div[2]/main/div/div[3]/div[1]/nav/a[3]/span")
	 @CacheLookup
	 WebElement ClickGuide;
	 
	 @FindBy(xpath="/html/body/div[1]/div/div/div[2]/main/div/div[3]/div[2]/div/div/form/div[1]/div[1]/div[3]/div[1]/div/input")
	 @CacheLookup
	 WebElement EntDocsTitle;
	 
	 @FindBy(xpath="/html/body/div[1]/div/div/div[2]/main/div/div[3]/div[2]/div/div/form/div[1]/div[1]/div[3]/div[2]/div/input")
	 @CacheLookup
	 WebElement EntDocsUrl;
	 
	 @FindBy(xpath="//*[@id=\"app\"]/div/div/div[2]/main/div/div[3]/div[2]/div/div/div/div/div[2]/button")
	 @CacheLookup
	 WebElement AddNewGuide;
	 
	 @FindBy(xpath="//*[@id=\"app\"]/div/div/div[2]/main/div/div[3]/div[2]/div/div/div/div/div[2]/div/div/button[1]")
	 @CacheLookup
	 WebElement ClickDocumentation;
	 
	 @FindBy(xpath="/html/body/div[1]/div/div/div[2]/main/div/div[3]/div[2]/div/div/form/div[1]/div[1]/div[4]/div[1]/div/input")
	 @CacheLookup
	 WebElement EntNewDocsTitle;
	 
	 @FindBy(xpath="/html/body/div[1]/div/div/div[2]/main/div/div[3]/div[2]/div/div/form/div[1]/div[1]/div[4]/div[2]/div/input")
	 @CacheLookup
	 WebElement EntNewDocsUrl;
	 
	 @FindBy(xpath="//*[@id=\"app\"]/div/div/div[2]/main/div/div[3]/div[2]/div/div/form/div[2]/div/span/button")
	 @CacheLookup
	 WebElement Update;
	 
	 
	 public void ClickTeam()
	 {
		 ClickTeam.click();
	 }
	 
	 public void ClickTool()
	 {
		 ClickTool.click();
	 }
	 
	 public void searchTool(String name)
	 {
		 txtTool.sendKeys(name);
		 
	 }
	 
	 public void ClickSelTool()
	 {
		 ClickSelTool.click();
		 
	 }
	 
	 public void ClickGuide()
	 {
		 ClickGuide.click();
	 }
	 
	 public void EnterTitle(String name)
	 {
		EntDocsTitle.sendKeys(name); 
	 }
	 
	 public void EnterLink(String name)
	 {
		EntDocsUrl.sendKeys(name); 
	 }
	 
	 public void AddNewGuide()
	 {
		 AddNewGuide.click();
	 }
	 
	 public void ClickDocumentation()
	 {
		 ClickDocumentation.click();
	 }
	 
	 public void AddNewDocsTitle(String name)
	 {
		 EntNewDocsTitle.sendKeys(name);
	 }
	 
	 public void AddNewDocsUrl(String name)
	 {
		 EntNewDocsUrl.sendKeys(name);
		 
	 }
	 
	 public void Update()
	 {
		 Update.click();
	 }
	 
	 
	 

}
