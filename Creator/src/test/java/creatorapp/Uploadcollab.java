package creatorapp;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Uploadcollab 
{
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
	
	@Test(priority = 1)
    public void Uploadcollab1() throws InterruptedException{  
		
		WebElement profileMenu = driver.findElement(By.xpath("//*[@class=\"MuiButtonBase-root MuiIconButton-root MuiIconButton-sizeSmall css-j678de-MuiButtonBase-root-MuiIconButton-root\"]//div//img"));
        profileMenu.click();
        
        driver.findElement(By.xpath("//*[text()='Account']")).click();
                Thread.sleep(2000);
    	
driver.findElement(By.xpath("//*[text()='Upload Collab Photo']")).click();
Thread.sleep(1000);
WebElement collab1= driver.findElement(By.xpath("//input[@type=\"file\"]"));
String filepath1= "C:\\Users\\Poonam\\Downloads\\thodi jasgha.jpg";
collab1.sendKeys(filepath1);


driver.findElement(By.xpath("//*[@data-rbd-drag-handle-draggable-id=\"1\"]")).click();
Thread.sleep(2000);
WebElement collab2= driver.findElement(By.xpath("//input[@type=\"file\"]"));
String filepath2= "C:\\Users\\Poonam\\Downloads\\Kesari_Chapter_2.jpg";
collab2.sendKeys(filepath2);

 driver.findElement(By.xpath("//*[@data-rbd-draggable-id=\"2\"]")).click();
Thread.sleep(1000);
WebElement collab3= driver.findElement(By.xpath("//input[@type=\"file\"]"));
String filepath3= "C:\\Users\\Poonam\\Downloads\\photo.jpg";
collab3.sendKeys(filepath3);

driver.findElement(By.xpath("//*[@data-rbd-draggable-id=\"3\"]")).click();
Thread.sleep(1000);
WebElement collab4= driver.findElement(By.xpath("//input[@type=\"file\"]"));
String filepath4= "C:\\Users\\Poonam\\Downloads\\maxresdefault (1).jpg";
collab4.sendKeys(filepath4);

 driver.findElement(By.xpath("//*[@data-rbd-draggable-id=\"4\"]")).click();
 Thread.sleep(1000);
 WebElement collab5= driver.findElement(By.xpath("//input[@type=\"file\"]"));
String filepath5= "C:\\Users\\Poonam\\Downloads\\hq720 (1).jpg";
collab5.sendKeys(filepath5);

    }
	
}





