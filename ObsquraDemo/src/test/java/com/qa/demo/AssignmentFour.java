package com.qa.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentFour 
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\renph\\eclipse-workspace\\ObsquraDemo\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://groceryapp.uniqassosiates.com/admin");
		driver.manage().window().maximize();
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("password")).sendKeys("admin");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//p[text()='Manage Orders']")).click();
		driver.findElement(By.xpath("//a[text()=' Search']")).click();	
		
		driver.findElement(By.xpath("//input[@placeholder='Order Id' and @id='od']")).sendKeys("587");
		driver.findElement(By.xpath("//input[@placeholder='User ID' or @id='um']")).sendKeys("");
		driver.findElement(By.cssSelector("button[name^=Searc]")).click();	//prefix string
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("button[name$=set]")).click();		//suffix string
		Thread.sleep(3000);
		driver.close();
	}
}
