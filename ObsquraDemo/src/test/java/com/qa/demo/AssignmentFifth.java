package com.qa.demo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AssignmentFifth
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\renph\\eclipse-workspace\\ObsquraDemo\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		Actions action=new Actions(driver);
		action.doubleClick(driver.findElement(By.xpath("(//a[text()='Mobiles'])[2]"))).perform();
	    
		action.moveToElement(driver.findElement(By.id("nav-link-accountList"))).perform();
	    
	    action.contextClick(driver.findElement(By.xpath("//span[text()='Electronics']"))).perform();
	}
}
