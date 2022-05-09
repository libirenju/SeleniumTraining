import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SeleniumDropdown
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\renph\\eclipse-workspace\\ObsquraDemo\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://groceryapp.uniqassosiates.com/admin");
		driver.manage().window().maximize();
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("password")).sendKeys("admin");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		driver.findElement(By.xpath("//p[text()='Manage Orders']//ancestor::a")).click();
		driver.findElement(By.xpath("//a[text()=' Search']//ancestor::a")).click();
		
		Select paydrpdwn= new Select(driver.findElement(By.id("pt")));
		//paydrpdwn.selectByVisibleText("COD");
		//paydrpdwn.selectByValue("Cash on Delivery");
		paydrpdwn.selectByIndex(1);
		//paydrpdwn.deselectAll();
		driver.findElement(By.xpath("//button[@name='Search']")).click();
		
		driver.findElement(By.xpath("//p[text()='Manage Product']")).click();
		driver.findElement(By.xpath("//a[@href='https://groceryapp.uniqassosiates.com/admin/Product/edit?edit=826&page_ad=1&un=&ct=&sb=&Search=sr']")).click();
		
		boolean UnlimitedStockIsSelected=driver.findElement(By.name("unlimitw[]")).isSelected();
		if(driver.findElement(By.name("unlimitw[]")).isSelected())
		{
			System.out.println(UnlimitedStockIsSelected);
			//driver.findElement(By.name("unlimitw[]")).click();
		}
		else
		{
		driver.findElement(By.name("unlimitw[]")).click();
		}
		
		
		

	}

}
