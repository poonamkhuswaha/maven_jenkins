package creatorapp;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Experience {	
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
	public void Experience1() throws InterruptedException
	{
		WebElement profileMenu = driver.findElement(By.xpath("//*[@class=\"MuiButtonBase-root MuiIconButton-root MuiIconButton-sizeSmall css-j678de-MuiButtonBase-root-MuiIconButton-root\"]//div//img"));
        profileMenu.click();
        
        driver.findElement(By.xpath("//*[text()='Account']")).click();
        Thread.sleep(2000);
        
        driver.findElement(By.xpath("//*[text()='Experience']")).click();
        Thread.sleep(1000);
      WebElement select1=  driver.findElement(By.xpath("//span[text()='EXPERIENCE']"));
      select1.click();
    driver.findElement(By.xpath("//label[text()='Select Type']/following-sibling::div")).click();
    Thread.sleep(1000);
    
    driver.findElement(By.xpath("//*[text()='Competition']")).click();
    WebElement com= driver.findElement(By.name("companyname"));
    com.click();
    com.sendKeys("THP");
    
    WebElement location= driver.findElement(By.name("Location"));
    location.click();
    location.sendKeys("Noida135");
    Thread.sleep(1000);
    
   WebElement conty= driver.findElement(By.xpath("//label[text()='Country']/following-sibling::div"));
  conty.click();
 
  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
  WebElement indiaOption = wait.until(
	        ExpectedConditions.elementToBeClickable(By.xpath("//*[text()='India']"))
	      
	);
  indiaOption.click();
  
    WebElement jobtitle=driver.findElement(By.name("Title"));
    jobtitle.click();
    Thread.sleep(1000);
    jobtitle.sendKeys("Tester");
    
    WebElement des= driver.findElement(By.id("description"));
    des.click();
    Thread.sleep(1000);
    des.sendKeys("i am new user");
    
    WebElement submitBtn = driver.findElement(By.xpath("//button[text()='Submit']"));
    Actions action= new Actions(driver);
    action.moveToElement(submitBtn).build().perform();
   
    driver.findElement(By.xpath("//label[text()='Start Date']/following-sibling::div//button")).click();
    WebElement  start16= driver.findElement(By.xpath("//button[text()='5']"));
    start16.click();
    driver.findElement(By.xpath("//label[text()='End Date']/following-sibling::div//button")).click();
     WebElement  enddate10= driver.findElement(By.xpath("//button[text()='10']"));
     enddate10.click();
    
     driver.findElement(By.xpath("//button[text()='Submit']")).click();
    
	}
}
