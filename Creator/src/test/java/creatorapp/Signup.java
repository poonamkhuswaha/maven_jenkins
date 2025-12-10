package creatorapp;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Signup {
	

	public static void main(String[] args) throws InterruptedException
	{
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://accountdev.gncreators.com/");
		
		WebElement email = driver.findElement(By.xpath("//*[@type=\"email\"]"));
		email.sendKeys("poonam@thehigherpitch.com");
		
		WebElement pass = driver.findElement(By.id("mui-2"));
		pass.sendKeys("Sonu@1111");
		
		WebElement confirpass = driver.findElement(By.id("mui-3"));
		confirpass.sendKeys("Sonu@1111");
		
		WebElement YourPrimaryRole  = driver.findElement(By.xpath("//*[text()='Solo Artist']"));
		YourPrimaryRole.click();
		
		WebElement createaccount = driver.findElement(By.xpath("//*[text()='Create Account']"));
		createaccount.click();
	  driver.quit();
		
	}
}
