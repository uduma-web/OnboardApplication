package com.OnboardApplication.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddSecretFolderPage 
{
	WebDriver pdriver;
	public AddSecretFolderPage(WebDriver jdriver)
	
	{
		pdriver=jdriver;
		PageFactory.initElements(jdriver, this);
		
	}
	
	@FindBy(xpath="//*[@id=\"app\"]/div/div/div[2]/main/div/div/div/div/div[1]/div/div[3]/a/span")
	@CacheLookup
	WebElement Folder;
	
	@FindBy(xpath="//*[@id=\"app\"]/div/div/div[2]/main/div/div/div/div/div[1]/div/div[4]/div/a")
	@CacheLookup
	WebElement CreateFolder;
	
	@FindBy(id="title")
	@CacheLookup
	WebElement Title;
	
	@FindBy(xpath="//*[@id=\"app\"]/div/div/div[2]/main/div/div/div/div[2]/div/form/form/div/div[2]/div[1]/div[2]/ul/li[1]/div/div[2]/button")
	@CacheLookup
	WebElement FirstSecret;
	
	@FindBy(xpath="//*[@id=\"app\"]/div/div/div[2]/main/div/div/div/div[2]/div/form/form/div/div[2]/div[1]/div[2]/ul/li[2]/div/div[2]/button")
	@CacheLookup
	WebElement SecondSecret;
	
	@FindBy(xpath="//*[@id=\"app\"]/div/div/div[2]/main/div/div/div/div[2]/div/form/form/div/div[2]/div[2]/div/span/button")
	@CacheLookup
	WebElement Create;
	
	public void Switching()
	{
		Folder.click();
	}
	
	public void Adding()
	{
		CreateFolder.click();
	}
	
	public void EnteringTitle(String name)
	{
		Title.sendKeys(name);
	}
	
	public void AddFirstSecret()
	{
		FirstSecret.click();
	}
	
	public void AddSecondSecret()
	{
		SecondSecret.click();
	}
	
	public void CreatingFolder()
	{
		Create.click();
	}

}
