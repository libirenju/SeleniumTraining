package com.qa.demo;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTab
{
	public static void main(String[] args)
	{
		//System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+ "\\Drivers\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\renph\\eclipse-workspace\\ObsquraDemo\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.globalsqa.com/demo-site/frames-and-windows");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.linkText("Click Here")).click();	//on this click a new tab is opened
				
		Set<String> windowHandles = driver.getWindowHandles();	
        List<String> windowHandlesList = new ArrayList<>(windowHandles); //Set to List Conversion
        driver.switchTo().window(windowHandlesList.get(1));		//"1" will switch to new tab thats open 
        driver.findElement(By.linkText("Home")).click();	//click on that tabs element to check whether it got switched
        
        driver.close();
        
        driver.switchTo().window(windowHandlesList.get(0));	//"0" will switch back to first tab
        driver.findElement(By.linkText("Home")).click(); 
	}
}
