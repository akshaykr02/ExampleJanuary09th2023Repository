package com.sgtesting.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.sgtesting.tests.ChromeBrowser;

public class practice2 {
    public static WebDriver oBrowser=null;
	public static void main(String[] args) {
		launchbrowser();
		navigateURL();
		login();
		

	}
	private static void launchbrowser()
	{
		try
		{
			ChromeOptions options=new ChromeOptions();
			options.addArguments("--remote-allow-origins=*");
			oBrowser=new ChromeDriver(options);
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void navigateURL()
	{
		try
		{
			oBrowser.navigate().to("http://sgtestinginstitute.com/index.php");
			Thread.sleep(2000);
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void login()
	{
		try
		{
			oBrowser.findElement(By.xpath("/html/body/header/div/div[2]/ul/li[7]/a")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.id("email")).sendKeys("ramyatk997@gmail.com");
			Thread.sleep(2000);
			oBrowser.findElement(By.name("password")).sendKeys("Ramya@1998");
			Thread.sleep(2000);
			oBrowser.findElement(By.name("btn-login")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("/html/body/header/div/div[2]/ul/li[9]/a/span")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("/html/body/header/div/div[2]/ul/li[9]/ul/li[4]/a")).click();
			Thread.sleep(2000);
			
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

}
