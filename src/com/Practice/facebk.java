package com.Practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebk 
{
public static void main(String[] args) 
{
	System.setProperty("webdriver.chrome.driver", "D:\\Selenium_Software\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.get("https://en-gb.facebook.com/login/");
	 String un = "abcd@gmail.com";
	String pw = "Mypass#";
	driver.findElement(By.id("email")).sendKeys(un);
	driver.findElement(By.id("pass")).sendKeys(pw);
	driver.findElement(By.id("loginbutton")).click();
	System.out.println("Hello World");
	
	
}
}
