package com.OnboardApplication.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class EditToolCardPage 
{
	WebDriver tdriver;
	
	public EditToolCardPage(WebDriver ydriver)
	
	{
		tdriver=ydriver;
		
		PageFactory.initElements(ydriver, this);
		
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
	 
	 @FindBy(xpath="/html/body/div[1]/div/div/div[2]/main/div/div[3]/div[2]/div/div/form/div[1]/div/div[2]/div/input")
	 @CacheLookup
	 WebElement txtEditCard;
	 
	 @FindBy(xpath="//*[@id=\"app\"]/div/div/div[2]/main/div/div[3]/div[2]/div/div/form/div[2]/div/span/button")
	 @CacheLookup
	 WebElement Save;
	 
	 public void ClickTeam()
	 {
		 ClickTeam.click();
		 
	 }
	 
	 public void ClickTool()
	 {
		 ClickTool.click();
	 }
	 
	 public void SearchTool(String name)
	 {
		 txtTool.sendKeys(name);
		 
	 }
	 
	 public void ClickSelTool()
	 {
		 ClickSelTool.click();
	 }
	 
	 public void EditCard(String name)
	 {
		 txtEditCard.sendKeys(name);
	 }
	 
	 public void SaveCard()
	 {
		 Save.click();
	 }

}
