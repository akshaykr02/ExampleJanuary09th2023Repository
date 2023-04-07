package com.sgtesting.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class practive5 {
	public static WebDriver oBrowser=null;
	public static void main(String[] args) {
		launchbrowser();
		navigateURL();
		clearhistory();
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
			oBrowser.navigate().to("https://www.youtube.com/");
			Thread.sleep(2000);
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
		private static void clearhistory()
		{
			try
			{
				oBrowser.findElement(By.xpath("//*[@id=\"endpoint\"]/span")).click();
				Thread.sleep(2000);
				oBrowser.findElement(By.xpath("//*[@id=\"contents\"]/ytd-button-renderer[1]/yt-button-shape/button/yt-touch-feedback-shape/div/div[2]")).click();
				Thread.sleep(2000);
			}catch (Exception e) {
				e.printStackTrace();
			}
		}

	}
