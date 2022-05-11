package com.qa.demo;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumWindow
{
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\renph\\eclipse-workspace\\ObsquraDemo\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://selenium.obsqurazone.com/window-popup.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.findElement(By.xpath("//a[@title='Follow @obsqurazone on Facebook']")).click();
		
		Set<String> windowHandles = driver.getWindowHandles();	
        List<String> windowHandlesList = new ArrayList<>(windowHandles); //Set to List Conversion
        driver.switchTo().window(windowHandlesList.get(1));		
        driver.findElement(By.xpath("//span[text()='Create New Account']")).click();	
        
        driver.close();
        
        driver.switchTo().window(windowHandlesList.get(0));		
        driver.findElement(By.xpath("//span[text()='Create New Account']")).click();
	}
}
