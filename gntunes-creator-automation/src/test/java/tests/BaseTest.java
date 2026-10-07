 package tests;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

public class BaseTest {

    public WebDriver driver;

    @Parameters("BROWSER")
    @BeforeClass
    public void setup(@Optional("chrome") String browser)
    {

    	System.out.println("Browser parameter received: " + browser); 

        switch (browser.toLowerCase())
    {

        case "firefox":
            driver = new FirefoxDriver();
            break;

        case "chrome":
            ChromeOptions options = new ChromeOptions();
            options.addArguments("--disable-notifications"); // ✅ block notification
            driver = new ChromeDriver(options);
            break;

        default:
            ChromeOptions defaultOptions = new ChromeOptions();
            defaultOptions.addArguments("--disable-notifications"); // ✅ block notification
            driver = new ChromeDriver(defaultOptions);
        }

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        System.out.println("Browser launched: " + browser);
    }
    
//    @AfterClass
//    public void tearDown() {
//    if (driver != null) {
//    driver.quit();   // closes all browser windows and ends session
//        }
   // }
}
