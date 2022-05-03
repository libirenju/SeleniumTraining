package com.qa.demo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumWait 
{

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\renph\\eclipse-workspace\\ObsquraDemo\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://groceryapp.uniqassosiates.com/admin");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));	//implicit wait	(applicable to all)
		
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("password")).sendKeys("admin");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));	//explicit wait..particularly for a link  -- initialization is done only once
		 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[text()='Manage Orders']//ancestor::a")));
		 driver.findElement(By.xpath("//p[text()='Manage Orders']//ancestor::a")).click();
		 driver.findElement(By.xpath("//a[text()=' Search']//ancestor::a")).click();
		 
		 WebDriverWait wait1 = new WebDriverWait(driver,Duration.ofSeconds(20));	//to change the wait time initiated 2nd time...if using same time we dont need to initiate again
		 wait1.until(ExpectedConditions.visibilityOfElementLocated(By.id("pt")));
		 Select paydrpdwn= new Select(driver.findElement(By.id("pt")));
			paydrpdwn.selectByVisibleText("COD");
			driver.findElement(By.xpath("//button[@name='Search']")).click();
			Thread.sleep(1000);


	}

}
