package com.qa.demo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SeleniumDragDrop
{

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\renph\\eclipse-workspace\\ObsquraDemo\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebElement iframe=(driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']")));
		driver.switchTo().frame(iframe);
		driver.switchTo().defaultContent();
		Actions action = new Actions(driver);
		WebElement srcElement=driver.findElement(By.xpath("//img[@src='images/high_tatras_min.jpg']"));
		
		WebElement destElement=driver.findElement(By.id("trash"));
		action.dragAndDrop(srcElement, destElement);
		
	}

}
