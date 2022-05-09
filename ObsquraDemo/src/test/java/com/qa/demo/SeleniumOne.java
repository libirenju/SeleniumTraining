package com.qa.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumOne
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\renph\\eclipse-workspace\\ObsquraDemo\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://flipkart.com");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']")).sendKeys("8848925244");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("pearls10");
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2HKlqd _3AWRsL']")).click();
		Thread.sleep(3000);
		String text = driver.findElement(By.xpath("//a[@href='https://seller.flipkart.com/sell-online/?utm_source=fkwebsite&utm_medium=websitedirect']//child::span")).getText();
		Thread.sleep(3000);
		System.out.println(text);
		{
			if (text.equals("Become a Seller"))
				{
					System.out.println("TestCase is passed");
				}
			else
				{
					System.out.println("TestCase is failed");
				}
		}
		Thread.sleep(3000);
	}
}
