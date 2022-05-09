package com.qa.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentThree 
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
						
		driver.findElement(By.xpath("//p[text()='Manage Users']")).click();
		driver.findElement(By.xpath("//a[text()=' Search']")).click();
		driver.findElement(By.cssSelector("input#un")).sendKeys("Nimalan");	//using id
		driver.findElement(By.cssSelector("input[placeholder=Email]")).sendKeys("nimalnapaulson000@gmail.com");	//using attribute
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.cssSelector("a.d-block")).click();	//using class
		Thread.sleep(3000);
				
		driver.close();
	}
}
