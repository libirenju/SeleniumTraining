package com.qa.demo;

import java.time.Duration;
<<<<<<< HEAD
import java.util.NoSuchElementException;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
=======

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
>>>>>>> 687b4e30842e6e268604c370be418277cad9be89
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
<<<<<<< HEAD
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));	//implicit wait	(applicable to all)
=======
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));	//implicit wait	(applicable to all)
>>>>>>> 687b4e30842e6e268604c370be418277cad9be89
		
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("password")).sendKeys("admin");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
<<<<<<< HEAD
		/*WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));	//explicit wait..particularly for a link  -- initialization is done only once
=======
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));	//explicit wait..particularly for a link  -- initialization is done only once
>>>>>>> 687b4e30842e6e268604c370be418277cad9be89
		 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[text()='Manage Orders']//ancestor::a")));
		 driver.findElement(By.xpath("//p[text()='Manage Orders']//ancestor::a")).click();
		 driver.findElement(By.xpath("//a[text()=' Search']//ancestor::a")).click();
		 
		 WebDriverWait wait1 = new WebDriverWait(driver,Duration.ofSeconds(20));	//to change the wait time initiated 2nd time...if using same time we dont need to initiate again
		 wait1.until(ExpectedConditions.visibilityOfElementLocated(By.id("pt")));
		 Select paydrpdwn= new Select(driver.findElement(By.id("pt")));
			paydrpdwn.selectByVisibleText("COD");
			driver.findElement(By.xpath("//button[@name='Search']")).click();
<<<<<<< HEAD
			Thread.sleep(1000);*/
			
			FluentWait<WebDriver> fluentwait = new FluentWait<WebDriver>(driver)
				       .withTimeout(Duration.ofSeconds(10))
				       .pollingEvery(Duration.ofSeconds(10))
				       .ignoring(NoSuchElementException.class);
				 
				WebElement element1 = fluentwait.until(new Function<WebDriver, WebElement>() {
				public WebElement apply(WebDriver driver) {
				WebElement element = driver.findElement(By.xpath("//*[@id='softwareTestingMaterial']"));
				String getTextOnPage = element.getText();
				if(getTextOnPage.equals("Software Testing Material - DEMO PAGE")){
				System.out.println(getTextOnPage);
				return element;
				}else{
				System.out.println("FluentWait Failed");
				return null;
				}
				}
				});

=======
			Thread.sleep(1000);
>>>>>>> 687b4e30842e6e268604c370be418277cad9be89
	}

}
