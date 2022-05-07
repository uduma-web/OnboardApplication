package com.OnboardApplication.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddingSecretToProjectPage
{
	WebDriver fdriver;
	public AddingSecretToProjectPage(WebDriver jdriver)
	{
		fdriver=jdriver;
		PageFactory.initElements(jdriver, this);
		
	}
	
	@FindBy(xpath="//*[@id=\"app\"]/div/div/div[2]/main/div/div/div/div/div[1]/div/div[3]/a/span")
	@CacheLookup
	WebElement Folder;
	
	@FindBy(xpath="//*[@id=\"search\"]")
	@CacheLookup
	WebElement Search;
	
	@FindBy(xpath="//*[@id=\"app\"]/div/div/div[2]/main/div/div/div/div/div[2]/div/ul/li")
	@CacheLookup
	WebElement ClickProject;
	
	@FindBy(xpath="//*[@id=\"app\"]/div/div/div[2]/main/div/div[2]/div[1]/nav/a[2]")
	@CacheLookup
	WebElement Secret;
	
	@FindBy(xpath="//*[@id=\"app\"]/div/div/div[2]/main/div/div[2]/div[2]/div/div/div[1]/div/div[3]/span/a")
	@CacheLookup
	WebElement AddSecret;
	
	@FindBy(xpath="//*[@id=\"app\"]/div/div/div[2]/main/div/div[2]/div[2]/div/div/form/div/div/div/ul/li[1]/div/div/div[2]")
	@CacheLookup
	WebElement Select;
	
	
	public void Switching()
	{
		Folder.click();
	}
	
	public void Searching(String name)
	{
		Search.sendKeys(name);
	}
	
	public void ClickingProject()
	{
		ClickProject.click();
	}
	
	public void ClickingSecret()
	{
		Secret.click();
	}
	
	public void ClickAddSecret()
	{
		AddSecret.click();
	}
	
	public void Selecting()
	{
		Select.click();
	}

}
