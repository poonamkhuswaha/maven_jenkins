package creatorapp;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Region {
	
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
		
		WebElement profileMenu = driver.findElement(By.xpath("//*[@class=\"MuiButtonBase-root MuiIconButton-root MuiIconButton-sizeSmall css-j678de-MuiButtonBase-root-MuiIconButton-root\"]//div//img"));
        profileMenu.click();
        
        driver.findElement(By.xpath("//*[text()='Account']")).click();
        Thread.sleep(2000);
        
        driver.findElement(By.xpath("//*[text()='Region']")).click();
        
        WebElement address= driver.findElement(By.name("address"));
        address.click();
        address.sendKeys(Keys.chord(Keys.CONTROL,"a"));
        Thread.sleep(2000);
        address.sendKeys(Keys.BACK_SPACE);
        address.sendKeys("noida 135");
        
        WebElement city= driver.findElement(By.name("cityId"));
        city.click();
        city.sendKeys(Keys.chord(Keys.CONTROL,"a"));
        Thread.sleep(1000);
        address.sendKeys(Keys.BACK_SPACE);
        city.sendKeys("new delhi");
        
        WebElement zipcode= driver.findElement(By.name("zipCode"));
        zipcode.click();
        zipcode.sendKeys(Keys.chord(Keys.CONTROL,"a"));
        Thread.sleep(1000);
        zipcode.sendKeys(Keys.BACK_SPACE);
        zipcode.sendKeys("121305");
        
        WebElement contry= driver.findElement(By.xpath("//label[text()='Country*']/following-sibling::div"));
        contry.click();
        driver.findElement(By.xpath("//li[text()='India']")).click();
         
        WebElement scroll= driver.findElement(By.xpath("//button[text()='Save']"));
       Actions act1= new Actions(driver);
       act1.moveToElement(scroll).build().perform();
        
        driver.findElement(By.xpath("//label[text()='State*']/following-sibling::div")).click();
        driver.findElement(By.xpath("//li[text()='UP']")).click();
        
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
        
        driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
	}
	
	
}
