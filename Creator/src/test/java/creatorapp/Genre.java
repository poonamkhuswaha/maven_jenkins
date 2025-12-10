package creatorapp;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Genre {
	
	WebDriver driver;
	@BeforeTest
	public void Login() throws InterruptedException {
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
	public void Genre1() throws InterruptedException
	
	{
		WebElement profileMenu = driver.findElement(By.xpath("//*[@class=\"MuiButtonBase-root MuiIconButton-root MuiIconButton-sizeSmall css-j678de-MuiButtonBase-root-MuiIconButton-root\"]//div//img"));
        profileMenu.click();
        
        driver.findElement(By.xpath("//*[text()='Account']")).click();
        Thread.sleep(2000);
        
        driver.findElement(By.xpath("//*[@href=\"/profile?user=genre\"]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[text()='Rock']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//span[text()='Disco']")).click();
        
	}

}
