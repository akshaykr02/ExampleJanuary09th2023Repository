package com.sgtesting.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Modify4progarm {
	
		public static WebDriver oBrowser=null;
		public static void main(String[] args) {
			launchBrowser();
			navigateURL();
			login();
			minimizeFlyOutWindow();
			//createuser();
			logout();
			loginuser1();
		//	createuser2();
			loginuser2();
			
		//	createuser3();
			loginuser3();
		    modifyuser3();
		    loginasuser3();
			modifyuser2();
			loginasuser2();
			modifyuser1();
			loginasuser1();
			//deleteuser3();
			//deleteuser2();
			//deleteuser1();
			//logout();
		//	closeApp();
			

		}
		private static void launchBrowser()
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
				oBrowser.navigate().to("http://localhost:81/login.do;jsessionid=1qmpu3lw1kqmd");
				Thread.sleep(2000);
			}catch (Exception e) {
				e.printStackTrace();
			}
		}
		private static void login()
		{
			try
			{
				oBrowser.findElement(By.id("username")).sendKeys("admin");
				oBrowser.findElement(By.name("pwd")).sendKeys("manager");
				oBrowser.findElement(By.xpath("//*[@id=\"loginButton\"]/div")).click();
				Thread.sleep(2000);
			}catch(Exception e)
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
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		private static void createuser()
		{
			try
			{
				oBrowser.findElement(By.xpath("//*[@id=\"topnav\"]/tbody/tr[1]/td[5]/a/div[2]")).click();
				Thread.sleep(2000);
				oBrowser.findElement(By.xpath("//*[@id=\"createUserDiv\"]/div/div[2]")).click();
				Thread.sleep(2000);
				oBrowser.findElement(By.name("firstName")).sendKeys("ramya");
				oBrowser.findElement(By.name("lastName")).sendKeys("gowda");
				oBrowser.findElement(By.name("email")).sendKeys("ramya123@gmail.com");
				oBrowser.findElement(By.name("username")).sendKeys("ramyagowda");
				oBrowser.findElement(By.name("password")).sendKeys("akshara");
				oBrowser.findElement(By.name("passwordCopy")).sendKeys("akshara");
				oBrowser.findElement(By.xpath("//*[@id=\"userDataLightBox_commitBtn\"]/div/span")).click();
				Thread.sleep(2000);

			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		private static void logout()
		{
			try
			{
				oBrowser.findElement(By.id("logoutLink")).click();
				Thread.sleep(2000);
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		private static void loginuser1()
		{
			try
			{
				oBrowser.findElement(By.id("username")).sendKeys("ramyagowda");
				oBrowser.findElement(By.name("pwd")).sendKeys("akshara");
				Thread.sleep(2000);

				oBrowser.findElement(By.xpath("//*[@id=\"loginButton\"]/div")).click();
				Thread.sleep(2000);
				oBrowser.findElement(By.xpath("//*[@id=\"welcomeScreenBoxId\"]/div[3]/div/span[1]")).click();
				Thread.sleep(2000);
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		private static void createuser2() 
		{
			try
			{
				oBrowser.findElement(By.xpath("//*[@id=\"topnav\"]/tbody/tr[1]/td[5]/a/div[2]")).click();
				Thread.sleep(2000);

				oBrowser.findElement(By.xpath("//*[@id=\"createUserDiv\"]/div/div[2]")).click();
				Thread.sleep(2000);
				oBrowser.findElement(By.name("firstName")).sendKeys("ramya2");
				oBrowser.findElement(By.name("lastName")).sendKeys("gowda2");
				oBrowser.findElement(By.name("email")).sendKeys("ramya12345@gmail.com");
				oBrowser.findElement(By.name("username")).sendKeys("ramyagowda2");
				oBrowser.findElement(By.name("password")).sendKeys("akshara");
				oBrowser.findElement(By.name("passwordCopy")).sendKeys("akshara");
				oBrowser.findElement(By.xpath("//*[@id=\"userDataLightBox_commitBtn\"]/div/span")).click();
				Thread.sleep(2000);
				logout();
				Thread.sleep(2000);

			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}

		private static void loginuser2()
		{
			try
			{
				oBrowser.findElement(By.id("username")).sendKeys("ramyagowda2");
				oBrowser.findElement(By.name("pwd")).sendKeys("akshara");
				Thread.sleep(2000);

				oBrowser.findElement(By.xpath("//*[@id=\"loginButton\"]/div")).click();
				Thread.sleep(2000);
				oBrowser.findElement(By.xpath("//*[@id=\"welcomeScreenBoxId\"]/div[3]/div/span[1]")).click();
				Thread.sleep(2000);
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		private static void createuser3()
		{
			try
			{
				oBrowser.findElement(By.xpath("//*[@id=\"topnav\"]/tbody/tr[1]/td[5]/a/div[2]")).click();
				Thread.sleep(2000);

				oBrowser.findElement(By.xpath("//*[@id=\"createUserDiv\"]/div/div[2]")).click();
				Thread.sleep(2000);
				oBrowser.findElement(By.name("firstName")).sendKeys("ramya3");
				oBrowser.findElement(By.name("lastName")).sendKeys("gowda3");
				oBrowser.findElement(By.name("email")).sendKeys("ramya1234567@gmail.com");
				oBrowser.findElement(By.name("username")).sendKeys("ramyagowda3");
				oBrowser.findElement(By.name("password")).sendKeys("akshara");
				oBrowser.findElement(By.name("passwordCopy")).sendKeys("akshara");
				oBrowser.findElement(By.xpath("//*[@id=\"userDataLightBox_commitBtn\"]/div/span")).click();
				Thread.sleep(2000);
				logout();
				Thread.sleep(2000);

			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		
		private static void loginuser3()
		{
			try
			{
				oBrowser.findElement(By.id("username")).sendKeys("ramyagowda3");
				oBrowser.findElement(By.name("pwd")).sendKeys("akshara");
				Thread.sleep(2000);

				oBrowser.findElement(By.xpath("//*[@id=\"loginButton\"]/div")).click();
				Thread.sleep(2000);
				oBrowser.findElement(By.xpath("//*[@id=\"welcomeScreenBoxId\"]/div[3]/div/span[1]")).click();
				Thread.sleep(2000);
				logout();
				Thread.sleep(2000);
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	    private static void modifyuser3()
	    {
	    	try
	    	{
	    	oBrowser.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a/div[2]")).click();
	    	Thread.sleep(2000);
	    	oBrowser.findElement(By.xpath("//*[@id=\"userListTableContainer\"]/table/tbody/tr[3]/td[1]/table/tbody/tr/td/div[1]/span[2]")).click();
	    	Thread.sleep(2000);
	    	
	    	oBrowser.findElement(By.name("password")).sendKeys("kiran");
	    	oBrowser.findElement(By.name("passwordCopy")).sendKeys("kiran");
	    	oBrowser.findElement(By.xpath("//*[@id=\"userDataLightBox_commitBtn\"]/div/span")).click();
	    	Thread.sleep(2000);
	    	logout();
	    	Thread.sleep(2000);
	    	
	    }catch(Exception e)
	    	{
	    	    e.printStackTrace();
	    	}
	    }
		private static void loginasuser3()
		{
			try
			{
				oBrowser.findElement(By.id("username")).sendKeys("ramyagowda3");
				oBrowser.findElement(By.name("pwd")).sendKeys("kiran");
				Thread.sleep(2000);

				oBrowser.findElement(By.xpath("//*[@id=\"loginButton\"]/div")).click();
				Thread.sleep(2000);
			
				Thread.sleep(2000);
				logout();
				Thread.sleep(2000);
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		private static void modifyuser2()
		{
			try
			{
				oBrowser.findElement(By.id("username")).sendKeys("admin");
				oBrowser.findElement(By.name("pwd")).sendKeys("manager");
				Thread.sleep(2000);
				oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
				Thread.sleep(2000);
				oBrowser.findElement(By.xpath("//*[@id=\"topnav\"]/tbody/tr[1]/td[5]/a/div[2]")).clear();
				Thread.sleep(2000);
				oBrowser.findElement(By.name("//*[@id=\"userListTableContainer\"]/table/tbody/tr[2]/td[1]/table/tbody/tr/td/div[1]/span[2]")).click();
				Thread.sleep(2000);
				
				oBrowser.findElement(By.name("password")).sendKeys("kiran");
				oBrowser.findElement(By.name("passwordCopy")).sendKeys("kiran");
				Thread.sleep(2000);
				oBrowser.findElement(By.xpath("//*[@id=\"userDataLightBox_commitBtn\"]/div/span")).click();
				Thread.sleep(2000);
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		private static void loginasuser2()
		{
			try
			{
				oBrowser.findElement(By.id("username")).sendKeys("ramyagowda2");
				oBrowser.findElement(By.name("pwd")).sendKeys("kiran");
				Thread.sleep(2000);

				oBrowser.findElement(By.xpath("//*[@id=\"loginButton\"]/div")).click();
				Thread.sleep(2000);
				oBrowser.findElement(By.xpath("//*[@id=\"welcomeScreenBoxId\"]/div[3]/div/span[1]")).click();
				Thread.sleep(2000);
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		private static void modifyuser1()
		{
			try
			{
				oBrowser.findElement(By.id("username")).sendKeys("admin");
				oBrowser.findElement(By.name("pwd")).sendKeys("manager");
				Thread.sleep(2000);
				oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
				Thread.sleep(2000);
				oBrowser.findElement(By.xpath("//*[@id=\"topnav\"]/tbody/tr[1]/td[5]/a/div[2]")).click();
				Thread.sleep(2000);
				oBrowser.findElement(By.name("password")).sendKeys("kiran");
				oBrowser.findElement(By.name("passwordCopy")).sendKeys("kiran");
				oBrowser.findElement(By.xpath("//*[@id=\"userDataLightBox_commitBtn\"]/div/span")).click();
				Thread.sleep(2000);
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		private static void loginasuser1()
		{
			try
			{
				oBrowser.findElement(By.id("username")).sendKeys("ramyagowda");
				oBrowser.findElement(By.name("pwd")).sendKeys("kiran");
				Thread.sleep(2000);

				oBrowser.findElement(By.xpath("//*[@id=\"loginButton\"]/div")).click();
				Thread.sleep(2000);
				oBrowser.findElement(By.xpath("//*[@id=\"welcomeScreenBoxId\"]/div[3]/div/span[1]")).click();
				Thread.sleep(2000);
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		private static void deleteuser3()
		{
			try
			{
				oBrowser.findElement(By.xpath("//*[@id=\"topnav\"]/tbody/tr[1]/td[5]/a/div[2]")).click();
				Thread.sleep(2000);
				oBrowser.findElement(By.xpath("//*[@id=\"userListTableContainer\"]/table/tbody/tr[3]/td[1]/table/tbody/tr/td/div[1]/span[2]")).click();
				Thread.sleep(2000);
				oBrowser.findElement(By.xpath("//*[@id=\"userDataLightBox_deleteBtn\"]")).click();
				Thread.sleep(2000);
				oBrowser.switchTo().alert().getText();
				oBrowser.switchTo().alert().accept();
				Thread.sleep(2000);
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		private static void deleteuser2()
		{
			try
			{
				oBrowser.findElement(By.xpath("//*[@id=\"topnav\"]/tbody/tr[1]/td[5]/a/div[2]")).click();
				Thread.sleep(2000);
				oBrowser.findElement(By.xpath("//*[@id=\"userListTableContainer\"]/table/tbody/tr[2]/td[1]/table/tbody/tr/td/div[1]/span[2]")).click();
				Thread.sleep(2000);
				oBrowser.findElement(By.xpath("//*[@id=\"userDataLightBox_deleteBtn\"]")).click();
				Thread.sleep(2000);
				oBrowser.switchTo().alert().getText();
				oBrowser.switchTo().alert().accept();
				Thread.sleep(2000);
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		private static void deleteuser1()
		{
			try
			{
				oBrowser.findElement(By.xpath("//*[@id=\"topnav\"]/tbody/tr[1]/td[5]/a/div[2]")).click();
				Thread.sleep(2000);
				oBrowser.findElement(By.xpath("//*[@id=\"userListTableContainer\"]/table/tbody/tr[1]/td[1]/div/table/tbody/tr/td/div[1]/span[2]")).click();
				Thread.sleep(2000);
				oBrowser.findElement(By.xpath("//*[@id=\"userDataLightBox_deleteBtn\"]")).click();
				Thread.sleep(2000);
				oBrowser.switchTo().alert().getText();
				oBrowser.switchTo().alert().accept();
				Thread.sleep(2000);
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		private static void closeApp()
		{
			try
			{
				oBrowser.quit();
				
			}catch(Exception e)
			{
				System.out.println(e.getMessage());
			}
		}

	}