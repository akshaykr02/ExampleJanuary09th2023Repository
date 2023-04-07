package com.sgtesting.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ModifyPassword {
	public static  WebDriver o;

	public static void main(String[] args) {
		launchBrowser();
		navigateURL();
		login();
		minimizeFlyoutwindow();
		createUser();
		logout();
		loginuser1();
		loginuser2();
		loginuser3();
		changepassword();
		loginasuser1();
		loginasuser2();
		loginasuser3();
		deleteuser();
		
	
	}
	private static void launchBrowser()
	{
		try
		{
			ChromeOptions options=new ChromeOptions();
			options.addArguments("--remote-allow-origins=*");
			o=new ChromeDriver(options);
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	private static void navigateURL()
	{
		try
		{
			o.navigate().to("http://localhost:81/login.do;jsessionid=1qmpu3lw1kqmd");
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	private static void login()
	{
		try
		{
			o.findElement(By.id("username")).sendKeys("admin");
			o.findElement(By.name("pwd")).sendKeys("manager");
			o.findElement(By.xpath("//*[@id=\"loginButton\"]/div")).click();
			Thread.sleep(2000);
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	private static void minimizeFlyoutwindow()
	{
		try
		{
			o.findElement(By.id("gettingStartedShortcutsPanelId")).click();
			Thread.sleep(2000);
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	private static void createUser()
	{
		try
		{
			o.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a/div[2]")).click();
			Thread.sleep(2000);
			o.findElement(By.xpath("//div[text()='Add User']")).click();
			Thread.sleep(2000);
			o.findElement(By.name("firstName")).sendKeys("Akshay");
			o.findElement(By.name("lastName")).sendKeys("kumar");
			o.findElement(By.name("email")).sendKeys("aksahy1@gmail.com");
			o.findElement(By.name("username")).sendKeys("akshay1");
			o.findElement(By.name("password")).sendKeys("akshay");
			o.findElement(By.name("passwordCopy")).sendKeys("akshay");
			Thread.sleep(2000);
			o.findElement(By.xpath("//span[text()='Create User']")).click();
			Thread.sleep(2000);
			
			o.findElement(By.xpath("//div[text()='Add User']")).click();
			Thread.sleep(2000);
			o.findElement(By.name("firstName")).sendKeys("Akshak");
			o.findElement(By.name("lastName")).sendKeys("kumah");
			o.findElement(By.name("email")).sendKeys("aksahy2@gmail.com");
			o.findElement(By.name("username")).sendKeys("akshay2");
			o.findElement(By.name("password")).sendKeys("akshay");
			o.findElement(By.name("passwordCopy")).sendKeys("akshay");
			Thread.sleep(2000);
			o.findElement(By.xpath("//span[text()='Create User']")).click();
			Thread.sleep(2000);
			
			o.findElement(By.xpath("//div[text()='Add User']")).click();
			Thread.sleep(2000);
			o.findElement(By.name("firstName")).sendKeys("Akshaykr");
			o.findElement(By.name("lastName")).sendKeys("kumarho");
			o.findElement(By.name("email")).sendKeys("akshay3@gmail.com");
			o.findElement(By.name("username")).sendKeys("akshay3");
			o.findElement(By.name("password")).sendKeys("akshay");
			o.findElement(By.name("passwordCopy")).sendKeys("akshay");
			Thread.sleep(2000);
			o.findElement(By.xpath("//span[text()='Create User']")).click();
			Thread.sleep(2000);
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	private static void logout()
	{
		try
		{
			o.findElement(By.linkText("Logout")).click();
			Thread.sleep(2000);
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
		
	}
	
	private static void loginuser1()
	{
		try
		{
		o.findElement(By.id("username")).sendKeys("akshay1");
		o.findElement(By.name("pwd")).sendKeys("akshay");
		o.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[1]/td/div/table/tbody/tr/td[2]/div/table/tbody/tr[5]/td/table[1]/tbody/tr[2]/td/table/tbody/tr/td[3]/a/div")).click();
		o.findElement(By.xpath("/html/body/div[3]/div[3]/div")).click();
		Thread.sleep(2000);
		logout();
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	private static void loginuser2()
	{
		try
		{
		o.findElement(By.id("username")).sendKeys("akshay2");
		o.findElement(By.name("pwd")).sendKeys("akshay");
		o.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[1]/td/div/table/tbody/tr/td[2]/div/table/tbody/tr[5]/td/table[1]/tbody/tr[2]/td/table/tbody/tr/td[3]/a/div")).click();
		o.findElement(By.xpath("/html/body/div[3]/div[3]/div")).click();
		Thread.sleep(2000);
		logout();
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	private static void loginuser3()
	{
		try
		{
		o.findElement(By.id("username")).sendKeys("akshay3");
		o.findElement(By.name("pwd")).sendKeys("akshay");
		o.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[1]/td/div/table/tbody/tr/td[2]/div/table/tbody/tr[5]/td/table[1]/tbody/tr[2]/td/table/tbody/tr/td[3]/a/div")).click();
		o.findElement(By.xpath("/html/body/div[3]/div[3]/div")).click();
		Thread.sleep(2000);
		logout();
		Thread.sleep(2000);
		
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
		
	}
	
	private static void changepassword()
	{
		try
		{
			login();
			o.findElement(By.xpath("/html/body/div[4]/table/tbody/tr[1]/td[5]/a")).click();
			Thread.sleep(2000);
			o.findElement(By.xpath("/html/body/div[1]/table/tbody/tr[4]/td/span[1]/table/tbody/tr[1]/td[1]")).click();
			Thread.sleep(2000);
			o.findElement(By.name("password")).sendKeys("akshay33");
			o.findElement(By.name("passwordCopy")).sendKeys("akshay33");
			o.findElement(By.xpath("//span[text()='Save Changes']")).click();
			Thread.sleep(2000);
			o.findElement(By.xpath("/html/body/div[1]/table/tbody/tr[4]/td/span[1]/table/tbody/tr[2]/td[1]")).click();
			Thread.sleep(2000);
			o.findElement(By.name("password")).sendKeys("akshay33");
			o.findElement(By.name("passwordCopy")).sendKeys("akshay33");
			o.findElement(By.xpath("//span[text()='Save Changes']")).click();
			Thread.sleep(2000);
			o.findElement(By.xpath("/html/body/div[1]/table/tbody/tr[4]/td/span[1]/table/tbody/tr[3]/td[1]")).click();
			Thread.sleep(2000);
			o.findElement(By.name("password")).sendKeys("akshay33");
			o.findElement(By.name("passwordCopy")).sendKeys("akshay33");
			o.findElement(By.xpath("//span[text()='Save Changes']")).click();
			Thread.sleep(2000);
			logout();
			
		}catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void loginasuser1()
	{
		try
		{
		o.findElement(By.id("username")).sendKeys("akshay1");
		o.findElement(By.name("pwd")).sendKeys("akshay33");
		o.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[1]/td/div/table/tbody/tr/td[2]/div/table/tbody/tr[5]/td/table[1]/tbody/tr[2]/td/table/tbody/tr/td[3]/a/div")).click();
		Thread.sleep(2000);
		logout();
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	private static void loginasuser2()
	{
		try
		{
			o.findElement(By.id("username")).sendKeys("akshay2");
			o.findElement(By.name("pwd")).sendKeys("akshay33");
			o.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[1]/td/div/table/tbody/tr/td[2]/div/table/tbody/tr[5]/td/table[1]/tbody/tr[2]/td/table/tbody/tr/td[3]/a/div")).click();
			Thread.sleep(2000);
			logout();
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	private static void loginasuser3()
	{
		try
		{
			o.findElement(By.id("username")).sendKeys("akshay3");
			o.findElement(By.name("pwd")).sendKeys("akshay33");
			o.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[1]/td/div/table/tbody/tr/td[2]/div/table/tbody/tr[5]/td/table[1]/tbody/tr[2]/td/table/tbody/tr/td[3]/a/div")).click();
			Thread.sleep(2000);
			logout();
		
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	private static void deleteuser()
	{
		try
		{
			login();
			Thread.sleep(2000);
			o.findElement(By.xpath("/html/body/div[4]/table/tbody/tr[1]/td[5]/a/div[2]")).click();
			
			Thread.sleep(2000);
			o.findElement(By.xpath("/html/body/div[1]/table/tbody/tr[4]/td/span[1]/table/tbody/tr[1]/td[1]")).click();
			Thread.sleep(2000);
			o.findElement(By.id("userDataLightBox_deleteBtn" )).click();
			o.switchTo().alert().accept();
			Thread.sleep(2000);
			
			o.findElement(By.xpath("/html/body/div[1]/table/tbody/tr[4]/td/span[1]/table/tbody/tr[2]/td[1]")).click();
			Thread.sleep(2000);
			o.findElement(By.id("userDataLightBox_deleteBtn" )).click();
			o.switchTo().alert().accept();
			Thread.sleep(2000);
			
			o.findElement(By.xpath("/html/body/div[1]/table/tbody/tr[4]/td/span[1]/table/tbody/tr[2]/td[1]")).click();
			Thread.sleep(2000);
			o.findElement(By.id("userDataLightBox_deleteBtn" )).click();
			o.switchTo().alert().accept();
			Thread.sleep(2000);
			logout();
		}catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void  closeApp()
	{
		try
		{
			o.quit();
		}catch (Exception e)
		{
			e.printStackTrace();
		}
	}
}