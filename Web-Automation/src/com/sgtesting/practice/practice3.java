package com.sgtesting.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class practice3 {
	public static WebDriver oBrowser=null;
	public static void main(String[] args) {
		launchbrowser();
		navigateURL();
		dropaline();

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
	private static void dropaline()
	{
		try
		{
			oBrowser.findElement(By.xpath("/html/body/header/div/div[2]/ul/li[6]/a")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.id("fname")).sendKeys("ramya");
			Thread.sleep(2000);
			oBrowser.findElement(By.id("email")).sendKeys("ramyatk997@gmail.com");
			Thread.sleep(2000);
			oBrowser.findElement(By.id("phone")).sendKeys("123456789");
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\"message\"]")).sendKeys("Hi Uncle How r u");
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\"submitcontactform\"]")).click();
			Thread.sleep(2000);
			
			
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

}


