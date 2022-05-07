package com.OnboardApplication.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DeleteGuidePage 
{
	
	WebDriver gdriver;
	
	public DeleteGuidePage(WebDriver hdriver)
	{
		gdriver=hdriver;
		
		PageFactory.initElements(hdriver, this);
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
	 
	 @FindBy(xpath="//*[@id=\"app\"]/div/div/div[2]/main/div/div[3]/div[2]/div/div/form/div[1]/div[1]/div[3]/div[3]/button")
	 @CacheLookup
	 WebElement ClickDel1;
	 
	 @FindBy(xpath="//*[@id=\"app\"]/div/div/div[2]/main/div/div[3]/div[2]/div/div/form/div[1]/div[1]/div[3]/div[3]/button")
	 @CacheLookup
	 WebElement ClickDel2;
	 
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
	 
	 public void ClickDel1()
	 {
		 ClickDel1.click();
	 }
	 
	 public void ClickDel2()
	 {
		 ClickDel2.click();
	 }
	 
	 public void Updating()
	 {
		 Update.click();
	 }

}
