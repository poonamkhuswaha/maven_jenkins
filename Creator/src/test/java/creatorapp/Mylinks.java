package creatorapp;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Mylinks {
	
	WebDriver driver;
	@BeforeTest
	public void Login() throws InterruptedException
	{
		ChromeOptions setting= new ChromeOptions();
		setting.addArguments("--disable-notifications");
		driver= new ChromeDriver(setting);
		
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
	public void region1() throws InterruptedException
	{
		
		driver.findElement(By.xpath("//*[@aria-label=\"My Links\"]")).click();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

		// Locate the hidden input field
		WebElement uploadInput = wait.until(ExpectedConditions.presenceOfElementLocated(
		    By.xpath("//input[@type='file' and @name='profile_pic']")
		));

		// Send file path directly to the input
		uploadInput.sendKeys("C:\\Users\\Poonam\\OneDrive - Higher Pitch Digital Consulting Pvt. Ltd\\Desktop\\3000.jpg");
				
		Thread.sleep(2000);
		WebElement title= driver.findElement(By.xpath("//*[@id='linkTitle_8' or text()='Title']"));
		title.click();
		
		WebElement titleInput = driver.findElement(By.xpath("//input[@name='title' or @placeholder='Title']"));

		// Enter text
	//	titleInput.clear();
		titleInput.sendKeys("Hum tere hai sanam");
		//title.sendKeys("hum tere hai sanam");
	
}
	

}
