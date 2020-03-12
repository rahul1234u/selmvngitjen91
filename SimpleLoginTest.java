package SimpleLoginTestP;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SimpleLoginTest 

{
	WebDriver driver;
	
	@Test
	
	public void SimpleLoginTestMethod() 
	
	{
	
			
	//  WebDriver driver;
	//	System.setProperty("WebDriver.chrome.driver", "Z:\\SeedInfoAut\\Automation\\chromedriver_win32\\chromedriver.exe");
		
	//	System.setProperty("webdriver.chrome.driver", "Z://SeedInfoAut//Automation//chromedriver_win32 (2)//chromedriver.exe");
		
		//Set System properties
		System.setProperty("webdriver.chrome.driver", "D://SeedInfoAut//SeleniumSetup//chromedrivernew//chromedriver_win32//chromedriver.exe");
		
		
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
			
	//	String url= "https://opensource-demo.orangehrmlive.com/index.php/auth/validateCredentials";
	//	String	username="admin";
	//	String	password="admin123";
		
		
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/validateCredentials");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS );
		
	//	driver.get(url);
			
		driver.findElement(By.id("txtUsername")).sendKeys("admin");
			
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		
		driver.findElement(By.id("btnLogin")).click();
	
		driver.close();
	
	
	}
	
}
