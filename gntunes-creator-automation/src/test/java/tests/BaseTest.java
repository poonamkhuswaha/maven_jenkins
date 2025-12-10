package tests;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

public class BaseTest {
	
	
	public WebDriver driver;
	
	@Parameters("BROWSER")
	@BeforeClass
	public void setup(@Optional("chrome") String browser) { 
		
		  if (browser == null) {
	            browser = "chrome";
	        } 
		  System.out.println("Browser parameter received: " + browser);
		  
		  switch (browser.toLowerCase()) 
		  {
	case "firefox":
        driver = new FirefoxDriver();
        break;

    case "chrome":
        driver = new ChromeDriver();
        break;

    default:
        System.out.println("Invalid browser name. Launching Chrome by default.");
        driver = new ChromeDriver();
	}	
		
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		System.out.println("bro launched" + browser);
	
	
	}	
	
	@AfterClass
	
	public void teardown(){
		driver.quit();
		
		
	}

}
