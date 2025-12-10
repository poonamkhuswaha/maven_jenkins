package creatorapp;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Dashboard extends Login {

   
    @Test(priority = 1)
    public void Dashboard1() throws InterruptedException {
        WebElement profileMenu = driver.findElement(By.xpath("//*[@class=\"MuiButtonBase-root MuiIconButton-root MuiIconButton-sizeSmall css-j678de-MuiButtonBase-root-MuiIconButton-root\"]//div//img"));
        profileMenu.click();
      //  System.out.println("Clicked on account menu");
        
        driver.findElement(By.xpath("//*[text()='Account']")).click();
                Thread.sleep(2000);
    }
    
                @Test(priority = 2)
                public void Dashboard2() throws InterruptedException {
                
        WebElement uploadprofileimage1= driver.findElement(By.id("imageUpload"));    
       String filepath="C:\\Users\\Poonam\\OneDrive - Higher Pitch Digital Consulting Pvt. Ltd\\Desktop\\images (4).jpg";

       uploadprofileimage1.sendKeys(filepath);
       
      WebElement crop= driver.findElement(By.xpath("//*[@class='gn-actionbtn']"));
           crop.click();  
           Thread.sleep(3000);

        WebElement username12 =  driver.findElement(By.name("userHandle"));        
    username12.click();
    username12.sendKeys(Keys.chord(Keys.CONTROL,"a"));
    Thread.sleep(2000);
    username12.sendKeys(Keys.BACK_SPACE);
    username12.sendKeys("Neev Kumar");
  
      
     WebElement name= driver.findElement(By.xpath("//*[@placeholder=\"Please enter your name\"]"));
     name.click();
     name.sendKeys(Keys.chord(Keys.CONTROL,"a"));
     Thread.sleep(2000);
     name.sendKeys(Keys.BACK_SPACE);
        name.sendKeys("sonu khuswaha");
        
        WebElement stagename= driver.findElement(By.xpath("//*[@placeholder=\"Please enter your stage name\"]"));
        stagename.click();
        stagename.sendKeys(Keys.chord(Keys.CONTROL,"a"));
        Thread.sleep(2000);
        stagename.sendKeys(Keys.BACK_SPACE);
        stagename.sendKeys("khusi");
        
        
        WebElement primaryname= driver.findElement(By.xpath("//*[@name='userPrimaryRoleName']"));
        primaryname.click();
        primaryname.sendKeys(Keys.chord(Keys.CONTROL,"a"));
        Thread.sleep(2000);
        primaryname.sendKeys(Keys.BACK_SPACE);
        primaryname.sendKeys("Artist");
        
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,500)");  // scroll 500px down
        Thread.sleep(2000);
        
        WebElement selecttype = driver.findElement(By.xpath("//label[text()='Select Type*']/following::div[contains(@class,'MuiSelect-select')][1]"));
        selecttype.click();
        Thread.sleep(1000);
        WebElement selecttype1= driver.findElement(By.xpath("//li[@data-value=\"3\"]"));
        selecttype1.click();
        
      
        WebElement gender= driver.findElement (By.xpath("//*[@aria-labelledby=\"gender\"]"));
        gender.click();
        Thread.sleep(1000);
        
       WebElement selectGender1 = driver.findElement(By.xpath("//li[@data-value=\"Female\"]"));
       selectGender1.click();
        
        WebElement language= driver.findElement(By.xpath("//*[@placeholder=\"Language\"]"));
       language.click();
       Thread.sleep(1000);
       WebElement select = driver.findElement(By.xpath("//*[text()='Hindi']"));
       select.click();
       
       WebElement about= driver.findElement(By.xpath("//*[@placeholder=\"Please write about yourself\"]"));
       about.sendKeys("i am poonam artist");
        
         driver.findElement(By.xpath("//button[@title=\"Save\"]")).click();
         
                }       
               
                }            
     


