package creatorapp;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Social_platform {
	
	WebDriver driver;
	@BeforeTest
	public void Login() throws InterruptedException
	{
		ChromeOptions setting = new ChromeOptions();
        setting.addArguments("--disable-notifications");

        driver = new ChromeDriver(setting); // use class-level driver

	
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://accountdev.gncreators.com/login");
		
		WebElement email = driver.findElement(By.xpath("//*[@type=\"email\"]"));
		email.sendKeys("poonam@thehigherpitch.com");
		
		WebElement password = driver.findElement(By.xpath("//*[@type=\"password\"]"));
		password.sendKeys("Sonu@1111");
		
		Thread.sleep(2000);
		
		WebElement loginbutton=driver.findElement(By.xpath("//*[text()='Sign In']"));
		loginbutton.click();
	}
	
	@Test(priority=1)
		public void caterory1() throws InterruptedException
		{
		WebElement profileMenu = driver.findElement(By.xpath("//*[@class=\"MuiButtonBase-root MuiIconButton-root MuiIconButton-sizeSmall css-j678de-MuiButtonBase-root-MuiIconButton-root\"]//div//img"));
        profileMenu.click();
        
        driver.findElement(By.xpath("//*[text()='Account']")).click();
        Thread.sleep(2000);
        
		driver.findElement(By.xpath("//*[@href=\"/profile?user=socialPlatform\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='ADD PLATFORM']")).click();
		driver.findElement(By.xpath("//*[text()='Facebook']")).click();
		WebElement platform= driver.findElement(By.xpath("//*[@placeholder=\"Facebook Url\"]"));
		platform.click();
		
		platform.sendKeys("https://www.facebook.com");
		
		driver.findElement(By.xpath("//*[@class=\"MuiBox-root css-1adyj4e\"]")).click();
		
		
		}
	
}
