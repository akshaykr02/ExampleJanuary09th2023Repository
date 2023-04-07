package com.sgtesting.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxBrowser {
	public static WebDriver oBrowser=null;
	public static void main(String[] args) {
		LaunchBrowser();
		navigateURL();
		closeApp();

	}
	
	private static void LaunchBrowser()
	{
		try
		{
			oBrowser=new FirefoxDriver();
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	private static void navigateURL()
	{
		try
		{
			oBrowser.get("http://localhost:81/login.do;jsessionid=1qmpu3lw1kqmd");
			Thread.sleep(5000);
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void closeApp()
	{
		try
		{
			oBrowser.close();
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
}

