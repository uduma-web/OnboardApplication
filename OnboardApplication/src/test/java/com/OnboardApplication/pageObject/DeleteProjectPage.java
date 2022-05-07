package com.OnboardApplication.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DeleteProjectPage 
{
	WebDriver fdriver;
	public DeleteProjectPage(WebDriver jdriver)
	
	{
		fdriver=jdriver;
		PageFactory.initElements(fdriver, this);
		
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
	
	@FindBy(xpath="//*[@id=\"app\"]/div/div/div[2]/main/div/div[1]/div[2]/div/button")
	@CacheLookup
	WebElement DeleteIcon;
	
	@FindBy(xpath="//*[@id=\"app\"]/div/div/div[2]/main/div/div[1]/div[2]/div/div/div/button")
	@CacheLookup
	WebElement AskDelete;
	
	@FindBy(xpath="//*[@id=\"app\"]/div/div/div[2]/div[2]/div/div[2]/div[3]/button[1]")
	@CacheLookup
	WebElement Delete;
	
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
	
	public void ClickingDelIcon()
	{
		DeleteIcon.click();
	}
	
	public void Deleting()
	{
		AskDelete.click();
	}
	
	public void ConfirmDelete()
	{
		Delete.click();
	}

}
