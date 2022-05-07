package com.OnboardApplication.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DeleteToolPage 
{
	WebDriver Sdriver;
	
	public DeleteToolPage(WebDriver Fdriver)
	{
		Sdriver=Fdriver;
		PageFactory.initElements(Fdriver, this);
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
	 
	 @FindBy(xpath="//*[@id=\"app\"]/div/div/div[2]/main/div/div[2]/div[2]/div")
	 @CacheLookup
	 WebElement ViewDel;
	 
	 @FindBy(xpath="//*[@id=\"app\"]/div/div/div[2]/main/div/div[2]/div[2]/div/div/div/button")
	 @CacheLookup
	 WebElement ClickDel;
	 
	 @FindBy(id="full name")
	 @CacheLookup
	 WebElement txtNTool;
	 
	 @FindBy(xpath="//*[@id=\"app\"]/div/div/div[2]/div[2]/div/div[2]/div[4]/button[1]")
	 @CacheLookup
	 WebElement Delete;
	 
	 
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
	 
	 public void ViewDel()
	 {
		 ViewDel.click();
	 }
	 
	 public void ClickDel()
	 {
		 ClickDel.click();
	 }
	 
	 public void InputTool(String name)
	 {
		 txtNTool.sendKeys(name);
	 }
	 
	 public void DeleteTool()
	 {
		 Delete.click();
	 }

}
