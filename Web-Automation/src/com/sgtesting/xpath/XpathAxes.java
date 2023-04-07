package com.sgtesting.xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class XpathAxes {
	private static WebDriver o=null;
	public static void main(String[] args) {
		launchBrowser();
		navigateURL();
		EntertheSalaryforPersonSachinTendulkar();
		EntertheSalarythePersonWhoIsNextToSachinTendulkar();
		makeIndianFreedomFighterStatusAsActive();
		makeStatusAsActiveWhoisPreviousToRahul();
		makeStatusAsActiveBasedOnTheSalaryField();
		basedOnTableTagnameEnterTheSalaryFor4thRecord();
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
			o.navigate().to("file:///E:/HTML/WebTableHTML.html");
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	/**
	 * following-sibling
	 * case 1: Enter the salary for person  Sachin Tendulkar
	 * 
	 */
	
	private static void EntertheSalaryforPersonSachinTendulkar()
	{
		try
		{
			o.findElement(By.xpath("//td[text()='Sachin Tendulkar']/following-sibling::td[4]/input")).sendKeys("15000");

		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	/**
	 * following
	 * case 2: Enter the salary the person who is next to Sachin Tendulkar
	 * 
	 */
	private static void EntertheSalarythePersonWhoIsNextToSachinTendulkar()
	{
		try
		{
			o.findElement(By.xpath("//td[text()='Sachin Tendulkar']/following::tr[1]/td[6]/input")).sendKeys("20000");
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	/**
	 * preceding-sibling
	 * case 3: Make Indian Freedom Fighter Status As Active
	 * 
	 */
	private static void makeIndianFreedomFighterStatusAsActive()
	{
		try
		{
			o.findElement(By.xpath("//td[text()='Indian Freedom Fighter']/preceding-sibling::td[2]/input")).clear();
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	/**
	 * preceding
	 * case 4: Make The Status As Active Who is Previous To Rahul
	 * 
	 */
	private static void makeStatusAsActiveWhoisPreviousToRahul()
	{
		try
		{
			o.findElement(By.xpath("//td[text()='Rahul Dravid']/preceding::tr[1]/td[1]/input")).click();
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	/**
	 * Ancestor
	 * case 5:Make Status As Active Based On The Salary Field
	 * 
	 */
	private static void makeStatusAsActiveBasedOnTheSalaryField() 
	{
		try
		{
			o.findElement(By.xpath("//input[@id='edit2']/ancestor::tr[1]/td[1]/input")).click();
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	/**
	 * Descendant
	 * case 6:Based on Table tagName enter The Salary for Record 4
	 * 
	 */
	private static void basedOnTableTagnameEnterTheSalaryFor4thRecord()
	{
		try
		{
			o.findElement(By.xpath("//table[@id='tbl1']/descendant::tr[4]/td[6]/input")).sendKeys("30000");
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	
}
