package com.qa.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FirstTest 
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
		
		//String text = driver.findElement(By.xpath("(//li[@class='nav-item']//p)[27]")).getText();
		//System.out.println(text);
		//for loop for listing elements
		/*for(int i=0;i<27;i++)
		{
			Thread.sleep(1000);
			String text = driver.findElements(By.xpath("(//li[@class='nav-item']//p)")).get(i).getText();
			System.out.println("textname "+text);
		}*/
				
		//Thread.sleep(3000);
		/*String text = driver.findElement(By.xpath("//span[@class='brand-text font-weight-light']")).getText();
		System.out.println(text);
		if (text.equals("7rmart supermarket"))
		{
			System.out.println("TestCase is passed");
		}
		else
		{
			System.out.println("TestCase is failed");
		}*/
		
		/*boolean display=driver.findElement(By.xpath("//span[@class='brand-text font-weight-light']")).isDisplayed();
		System.out.println(display);
		if (display==true)
		{
			System.out.println("TestCase is passed");
		}
		else
		{
			System.out.println("TestCase is failed");
		}*/
		//String title = driver.getTitle();
		//System.out.println(title);
		//String url = driver.getCurrentUrl();
		//System.out.println(url);
		//String page = driver.getPageSource();
		//System.out.println(page);
		
		//xpath using contains
		//span[contains(text(),'7rmart')]	
		//xpath using start-with
		//span[starts-with(@class,'brand-text')]
		
		
		//driver.findElement(By.xpath("//button[text()='Sign In']")).click();
		/*driver.findElement(By.xpath("//p[text()='Manage Users']")).click();
		driver.findElement(By.xpath("//a[text()=' Search']")).click();
		driver.findElement(By.cssSelector("input#un")).sendKeys("Nimalan");
		//driver.findElement(By.id("un")).sendKeys("Nimalan");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		//p[text()='Dashboard']//parent::a			//xpath using parent tag
		//a[@href='https://groceryapp.uniqassosiates.com/admin/home']//child::p		//xpath using child tag
		//((//p[text()='Dashboard']//ancestor::li//following-sibling::li)[1]//p)[1]
		
		//driver.findElement(By.xpath("((//p[text()='Dashboard']//ancestor::li//following-sibling::li)[1]//p)[1]")).click();*/
		
		//p[text()='Manage Orders']
		
		Select paydrpdwn= new Select(driver.findElement(By.id("pt")));
		paydrpdwn.selectByVisibleText("COD");

		
		//driver.close();
		//driver.quit();
	}
}








