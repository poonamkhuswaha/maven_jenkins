package creatorapp;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

@Test

public class Login {
	   public WebDriver driver;
	
	@BeforeClass
	public void openBrowser ()
	
	{
	        ChromeOptions setting = new ChromeOptions();
	        setting.addArguments("--disable-notifications");
	        driver = new ChromeDriver(setting); // use class-level driver

	        driver.manage().window().maximize();
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	        driver.get("https://accountdev.gncreators.com/login");
	}
	@BeforeMethod
	public void devLogin()
	{
			
			WebElement email = driver.findElement(By.xpath("//*[@type=\"email\"]"));
			email.clear();
			email.sendKeys("poonam@thehigherpitch.com");
	
			
			WebElement password = driver.findElement(By.xpath("//*[@type=\"password\"]"));
			email.clear();
			password.sendKeys("Sonu@1111");
	}
	
	
	public void Signinbutton()
	{
			WebElement loginbutton=driver.findElement(By.xpath("//*[text()='Sign In']"));
			loginbutton.click();
	
		
		}
	 @AfterClass
	public void closeBroswer()
	{
		driver.quit();
	}
	}
