package com.OnboardApplication.Utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {
	
Properties prop;
	
	public ReadConfig()
	{
		File src = new File("./Configurations/config.properties");

		try {
			FileInputStream fis = new FileInputStream(src);
			prop = new Properties();
			prop.load(fis);
		} catch (Exception e) {
			System.out.println("Exception is " + e.getMessage());
		}
		
	}
	
	public String getApplicationURL()
	{
		String url=prop.getProperty("baseURL");
		return url;
	}
	
	public String getUserEmail()
	{
	String userEmail=prop.getProperty("userEmail");
	return userEmail;
	}
	public String getport()
	{
		String port=prop.getProperty("gmail_port");
		return port;
	}
	
	public String getGmailUserEmail()
	{
		String  gmail_username=prop.getProperty("gmail_username");
		return  gmail_username;
	}
	public String getFromEmail()
	{
		String gmail_from=prop.getProperty("gmail_from");
		return gmail_from;
	}
	
	public String getPassword()
	{
	String gmail_password=prop.getProperty("gmail_password");
	return gmail_password;
	}
	
	public String getChromePath()
	{
	String chromepath=prop.getProperty("chromepath");
	return chromepath;
	}
	
	public String getIEPath()
	{
	String iepath=prop.getProperty("iepath");
	return iepath;
	}
	
	public String getFirefoxPath()
	{
	String firefoxpath=prop.getProperty("firefoxpath");
	return firefoxpath;
	}

}
