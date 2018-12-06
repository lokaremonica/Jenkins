package com.Practice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class LightUser 
{
public static void main(String[] args) throws InterruptedException 
{
	System.setProperty("webdriver.chrome.driver", "D:\\Selenium_Software\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	//creating the user
	driver.get("https://wallethub.com/join/light");
	driver.findElement(By.name("em")).sendKeys("test_inscomp@evolutionfinance.com");
	driver.findElement(By.name("pw1")).sendKeys("Abcd123*");
	driver.findElement(By.name("pw2")).sendKeys("Abcd123*");
	driver.findElement(By.xpath("//button[@type='button']")).click();
	
	driver.get("https://wallethub.com/profile/test_insurance_company/");
	driver.manage().window().maximize();
	//same tab	
	WebElement xpo = driver.findElement(By.xpath("//span[@class='wh-rating rating_4_5']"));
	Actions Act = new Actions(driver);
	Act.moveToElement(xpo).perform();
	WebElement xp1 = driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[1]/div[2]/div[3]/div[1]/div[1]/a[4]"));
	Act.moveToElement(xp1);
	Act.build().perform();
	Thread.sleep(2000);
	WebElement xp2 = driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[1]/div[2]/div[3]/div[1]/div[1]/a[5]"));
	Act.moveToElement(xp2);
	Act.click().build().perform();
	//select the drop down
	 driver.findElement(By.xpath("//span[@class='drop-arrow']")).click();
	 driver.findElement(By.xpath("//a[contains(text(),'Health')]")).click();
	 Thread.sleep(2000);
	//After selecting health the review is erased so select again
	 driver.findElement(By.xpath("//span[@id='overallRating']//a[5]")).click();
	driver.findElement(By.id("review-content")).sendKeys("Despite initially performing poorly at the box office because of stiff competition at the time of its release, the film has become regarded as a classic and is a staple of Christmas television around the worldThe film is considered one of the most loved films in American cinema and has become traditional viewing during the Christmas season.");
	driver.findElement(By.xpath("//input[@value='Submit']")).click();
	Thread.sleep(2000);
   driver.get("https://wallethub.com/profile/test-insurance-company-13732055i/reviews/");
}
}

