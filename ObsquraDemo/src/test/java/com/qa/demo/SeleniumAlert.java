package com.qa.demo;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumAlert 
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+ "\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://selenium.obsqurazone.com/javascript-alert.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.findElement(By.linkText("Javascript Alert")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@onclick='jsAlert()']"));
		driver.findElement(By.xpath("(//button[text()='Click me!'])[1]")).click();
		driver.switchTo().alert().accept(); // used to accept popup box
		
		driver.findElement(By.xpath("(//button[text()='Click me!'])[2]")).click();
		String alerttext=driver.switchTo().alert().getText(); //used to get text in popup box
		System.out.println(alerttext);
		driver.switchTo().alert().dismiss(); // used to cancel popup box
		//driver.switchTo().alert().sendKeys("");	// used to enter value in popup box
	}
}
