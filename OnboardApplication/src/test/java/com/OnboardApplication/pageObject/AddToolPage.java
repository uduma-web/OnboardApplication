package com.OnboardApplication.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddToolPage {
	
	WebDriver Idriver;
	
	public AddToolPage(WebDriver rdriver)
	{
		Idriver=rdriver;
		PageFactory.initElements(rdriver,this);
		
	}
	
	 @FindBy(xpath="//*[@id=\"app\"]/div/div/nav/div/div/div/div[1]/div[2]/div/div[1]/span")
	 @CacheLookup
	 WebElement ClickTeam;
	 
	 @FindBy(xpath="//*[@id=\"app\"]/div/div/nav/div/div/div/div[1]/div[2]/div/div[1]/div/div/a[1]")
	 @CacheLookup
	 WebElement ClickTool;
	 
	 @FindBy(xpath="//*[@id=\"app\"]/div/div/div[2]/main/div/div/div/div[1]/div/div[3]/span/a")
	 @CacheLookup
	 WebElement ClickAddTools;
	 
	 @FindBy(xpath="//*[@id=\"search\"]")
	 @CacheLookup
	 WebElement txtSearch;
	 
	 @FindBy(xpath="//*[@id=\"app\"]/div/div/div[2]/main/div/div/div/div[2]/ul/li/div/div")
	 @CacheLookup
	 WebElement ClickSTool;
	 
	 @FindBy(xpath="//*[@id=\"app\"]/div/div/div[2]/main/div/div/div/div[1]/div/div[3]/span/button")
	 @CacheLookup
	 WebElement btnAdd;
	 
	 public void ClickTeam()
	 {
		 ClickTeam.click();
		 
	 }
	 
	 public void ClickTool()
	 {
		 ClickTool.click();
	 }
	 
	 public void ClickAddTools()
	 {
		 ClickAddTools.click();
	 }
	 
	 public void SearchTool(String name)
	 {
		 txtSearch.sendKeys(name);
	 }
	 
	 public void ClickSTool()
	 {
		 ClickSTool.click();
	 }
	 
	 public void Add()
	 {
		 btnAdd.click();
	 }
	 

}
