package com.sgtesting.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Program4 {
	public static WebDriver oBrowser;
	public static void main(String[] args) {
		launchBrowser();
		navigateURL();
		login();
		minimizeFlyOutWindow();
		createUser1();
		logout();
		userlogin1();
		createUser2();
		userlogin2();
		createUser3();
		userlogin3();
		Modifyuser3();
		Userlogin3();
		Modifyuser2();
		Userlogin2();
		Modifyuser1();
		Userlogin1();
		deleteUser3();
		deleteUser2();
		deleteUser1();
		logout();
		closeApp();
		
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
			Thread.sleep(2000);
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
			Thread.sleep(2000);
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
			Thread.sleep(2000);
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	private static void createUser1()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a/div[2]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//div[text()='Add User']")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.name("firstName")).sendKeys("Akshay");
			oBrowser.findElement(By.name("lastName")).sendKeys("Hos");
			oBrowser.findElement(By.name("email")).sendKeys("akshay1@gmail.com");
			oBrowser.findElement(By.name("username")).sendKeys("akshay1");
			oBrowser.findElement(By.name("password")).sendKeys("akshay");
			oBrowser.findElement(By.name("passwordCopy")).sendKeys("akshay");
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//span[text()='Create User']")).click();
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
			oBrowser.findElement(By.linkText("Logout")).click();
			Thread.sleep(2000);
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
		
	}
	
	private static void userlogin1()
	{
		try
		{
			oBrowser.findElement(By.id("username")).sendKeys("akshay1");
			oBrowser.findElement(By.name("pwd")).sendKeys("akshay");
			oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//span[text()='Start exploring actiTIME']")).click();
			Thread.sleep(2000);
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	private static void createUser2()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a/div[2]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//div[text()='Add User']")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.name("firstName")).sendKeys("Akshayk");
			oBrowser.findElement(By.name("lastName")).sendKeys("Hosa");
			oBrowser.findElement(By.name("email")).sendKeys("akshay2@gmail.com");
			oBrowser.findElement(By.name("username")).sendKeys("akshay2");
			oBrowser.findElement(By.name("password")).sendKeys("akshay");
			oBrowser.findElement(By.name("passwordCopy")).sendKeys("akshay");
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//span[text()='Create User']")).click();
			Thread.sleep(2000);
			logout();
			Thread.sleep(2000);
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	private static void userlogin2()
	{
		try
		{
			oBrowser.findElement(By.id("username")).sendKeys("akshay2");
			oBrowser.findElement(By.name("pwd")).sendKeys("akshay");
			oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//span[text()='Start exploring actiTIME']")).click();
			Thread.sleep(2000);
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	private static void createUser3()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a/div[2]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//div[text()='Add User']")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.name("firstName")).sendKeys("Akshayke");
			oBrowser.findElement(By.name("lastName")).sendKeys("Hosam");
			oBrowser.findElement(By.name("email")).sendKeys("akshay3@gmail.com");
			oBrowser.findElement(By.name("username")).sendKeys("akshay3");
			oBrowser.findElement(By.name("password")).sendKeys("akshay");
			oBrowser.findElement(By.name("passwordCopy")).sendKeys("akshay");
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//span[text()='Create User']")).click();
			Thread.sleep(2000);
			logout();
			Thread.sleep(2000);
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	private static void userlogin3()
	{
		try
		{
			oBrowser.findElement(By.id("username")).sendKeys("akshay2");
			oBrowser.findElement(By.name("pwd")).sendKeys("akshay");
			oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//span[text()='Start exploring actiTIME']")).click();
			Thread.sleep(2000);
			logout();
			Thread.sleep(2000);
			
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	private static void Modifyuser3()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a/div[2]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//span[text()='User2, demo2']")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.name("password")).sendKeys("akshay33");
			oBrowser.findElement(By.name("passwordCopy")).sendKeys("akshay33");
			oBrowser.findElement(By.xpath("//span[text()='Save Changes']")).click();
			Thread.sleep(2000);
			logout();
			Thread.sleep(2000);
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	private static void Userlogin3()
	{
		try
		{
			oBrowser.findElement(By.id("username")).sendKeys("akshay3");
			oBrowser.findElement(By.name("pwd")).sendKeys("akshay33");
			oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			Thread.sleep(2000);
			logout();
			Thread.sleep(2000);
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	private static void Modifyuser2()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a/div[2]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//span[text()='User1, demo1']")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.name("password")).sendKeys("akshay33");
			oBrowser.findElement(By.name("passwordCopy")).sendKeys("akshay33");
			oBrowser.findElement(By.xpath("//span[text()='Save Changes']")).click();
			Thread.sleep(2000);
			logout();
			Thread.sleep(2000);
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	private static void Userlogin2()
	{
		try
		{
			oBrowser.findElement(By.id("username")).sendKeys("akshay2");
			oBrowser.findElement(By.name("pwd")).sendKeys("akshay33");
			oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			Thread.sleep(2000);
			logout();
			Thread.sleep(2000);
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	private static void Modifyuser1()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a/div[2]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//span[text()='User1, demo1']")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.name("password")).sendKeys("akshay33");
			oBrowser.findElement(By.name("passwordCopy")).sendKeys("akshay33");
			oBrowser.findElement(By.xpath("//span[text()='Save Changes']")).click();
			Thread.sleep(2000);
			logout();
			Thread.sleep(2000);
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	private static void Userlogin1()
	{
		try
		{
			oBrowser.findElement(By.id("username")).sendKeys("akshay1");
			oBrowser.findElement(By.name("pwd")).sendKeys("akshay33");
			oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			Thread.sleep(2000);
			logout();
			Thread.sleep(2000);
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	private static void deleteUser3()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a/div[2]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//span[text()='User3, demo3']")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.id("userDataLightBox_deleteBtn")).click();
			Thread.sleep(2000);
			oBrowser.switchTo().alert().getText();
			oBrowser.switchTo().alert().accept();
			Thread.sleep(2000);
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	private static void deleteUser2()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a/div[2]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//span[text()='User2, demo2']")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.id("userDataLightBox_deleteBtn")).click();
			Thread.sleep(2000);
			oBrowser.switchTo().alert().getText();
			oBrowser.switchTo().alert().accept();
			Thread.sleep(2000);
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	private static void deleteUser1()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a/div[2]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//span[text()='User1, demo1']")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.id("userDataLightBox_deleteBtn")).click();
			Thread.sleep(2000);
			oBrowser.switchTo().alert().getText();
			oBrowser.switchTo().alert().accept();
			Thread.sleep(2000);
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	private static void closeApp()
	{
		try
		{
			oBrowser.quit();
		}catch (Exception e) 
		{
			System.out.println(e.getMessage());
		}
	}
}