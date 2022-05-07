package com.OnboardApplication.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddBusinessUseCasePage 
{
	WebDriver sdriver;
	
	public AddBusinessUseCasePage(WebDriver fdriver)
	{
		sdriver=fdriver;
		PageFactory.initElements(fdriver, this);
		
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
	 
	 @FindBy(xpath="/html/body/div[1]/div/div/div[2]/main/div/div[3]/div[2]/div/div/form/div[1]/div/div[1]/div/div/div/div[1]/div/div/div")
	 @CacheLookup
	 WebElement ClickIt;
	 
	 @FindBy(xpath="/html/body/div[1]/div/div/div[2]/main/div/div[3]/div[2]/div/div/form/div[1]/div/div[1]/div/div[2]/div/section/div/div/div/div/div/div[1]/div/div/div[1]/div/div/div")
	 @CacheLookup
	 WebElement Entertxt;
	 
	 @FindBy(xpath="//*[@id=\"app\"]/div/div/div[2]/main/div/div[3]/div[2]/div/div/form/div[1]/div/div[1]/div/div[2]/div/section/div/div/div/div/div/div[2]/button")
	 @CacheLookup
	 WebElement Savetxt;
	 
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
	 
	 public void ClickToShowEditor()
	 {
		 ClickIt.click();
	 }
	 
	 public void FillText(String name)
	 {
		 Entertxt.sendKeys(name);
	 }
	 
	 public void SaveText()
	 {
		 Savetxt.click();
	 }
	 
	 

}
