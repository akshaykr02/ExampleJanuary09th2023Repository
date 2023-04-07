package com.sgtesting.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ModifyUser {
	public static WebDriver oBrowser;
	public static void main(String[] args) {
		launchBrowser();
		navigateURL();
		login();
		minimizeFlyOutWindow();
		CreateUser();
		Modify();
		deleteUser();
		closeApplication();
	}
	private static void launchBrowser()
	{
		try
		{
			ChromeOptions options=new ChromeOptions();
			options.addArguments("--remote-allow-origins=*");
			oBrowser=new ChromeDriver(options);
		}catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void navigateURL()
	{
		try
		{
			oBrowser.navigate().to("http://localhost:81/login.do;jsessionid=1qmpu3lw1kqmd");
			Thread.sleep(1000);

		}catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void login()
	{
		try
		{
			oBrowser.findElement(By.id("username")).sendKeys("admin");
			oBrowser.findElement(By.name("pwd")).sendKeys("manager");
			oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			Thread.sleep(1000);
		}catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void minimizeFlyOutWindow()
	{
		try
		{
			oBrowser.findElement(By.id("gettingStartedShortcutsPanelId")).click();
			Thread.sleep(1000);
		}catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void CreateUser()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id=\"topnav\"]/tbody/tr[1]/td[5]/a/div[2]")).click();
			Thread.sleep(2000);

			oBrowser.findElement(By.xpath("//div[text()='Add User']")).click();
			Thread.sleep(2000);

			oBrowser.findElement(By.name("firstName")).sendKeys("user1");
			oBrowser.findElement(By.name("lastName")).sendKeys("Demo ");
			oBrowser.findElement(By.name("email")).sendKeys("user@gmail.com");
			oBrowser.findElement(By.name("username")).sendKeys("Demo");
			oBrowser.findElement(By.name("password")).sendKeys("wgdggd");
			oBrowser.findElement(By.name("passwordCopy")).sendKeys("wgdggd");
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//span[text()='Create User']")).click();
			Thread.sleep(2000);


		}catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	
	
	private static void Modify()
	{
		try
		{
			oBrowser.findElement(By.xpath("/html/body/div[1]/table/tbody/tr[4]/td/span[1]/table/tbody/tr[2]/td[1]")).click();
			Thread.sleep(2000);
			
			
			oBrowser.findElement(By.name("firstName")).clear();
			Thread.sleep(2000);
			oBrowser.findElement(By.name("firstName")).sendKeys("Tiger");
			Thread.sleep(2000);
			oBrowser.findElement(By.name("lastName")).clear();
			oBrowser.findElement(By.name("lastName")).sendKeys("Prabhakar");
			
			oBrowser.findElement(By.xpath("//*[@id=\"userDataLightBox_commitBtn\"]/div/span")).click();
			Thread.sleep(2000);

		}catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void deleteUser()
	{
		try
		{
			oBrowser.findElement(By.linkText("Logout")).click();
			Thread.sleep(2000);
			
		}catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void closeApplication()
	{
		try
		{
			oBrowser.quit();
			
		}catch (Exception e)
		{
			e.printStackTrace();
		}
	}
}
