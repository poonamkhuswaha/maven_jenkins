package actions;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import pages.Login;
import pages.Profile;

import utils.Config;
import utils.TestDataforlogin;

public class AccountActions2Login {

    private WebDriver driver;
    private Login lg;
    private Profile p;

    public AccountActions2Login(WebDriver driver) {
        this.driver = driver;
        this.lg = new Login(driver);
        this.p = new Profile(driver);
    }

    // ✅ Step 1 - Open Page
    @Test(priority = 1)
    public void openPage() {
        driver.get(Config.Base_URL1);
    }

    // ✅ Step 2 - Login
    @Test(priority = 2)
    public void loginAndVerifyProfileIcon() {

        lg.getEmail().sendKeys(TestDataforlogin.EMAIL);
        lg.getPass().sendKeys(TestDataforlogin.PASSWORD);
        lg.getSignInButton().click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOf(p.getProfileIcon()));

        System.out.println("✅ Profile icon is displayed after login");

        Assert.assertTrue(p.getProfileIcon().isDisplayed(),
                "Profile icon should be visible after login");
    }

    // ✅ Step 3 - Update Profile
    @Test(priority = 3)
    public void updateGeneralProfile() throws InterruptedException {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.elementToBeClickable(p.getProfileIcon()));

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", p.getProfileIcon());

        System.out.println("✅ Profile icon clicked successfully");

        p.getAccount().click();
        p.getGeneral().click();

        WebElement UN = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder=\"Search Username\"]")));
        UN.sendKeys(Keys.chord(Keys.CONTROL, "a"));
        UN.sendKeys(Keys.BACK_SPACE);
        UN.sendKeys("Sonu1");

        WebElement Name = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder=\"Please enter your name\"]")));
        Name.sendKeys(Keys.chord(Keys.CONTROL, "a"));
        Name.sendKeys(Keys.BACK_SPACE);
        Name.sendKeys("Sonu");

        WebElement SN = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder=\"Please enter your stage name\"]")));
        SN.sendKeys(Keys.chord(Keys.CONTROL, "a"));
        SN.sendKeys(Keys.BACK_SPACE);
        SN.sendKeys("DJpoo");

        WebElement PRole = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder=\"Please enter primary role\"]")));
        PRole.sendKeys(Keys.chord(Keys.CONTROL, "a"));
        PRole.sendKeys(Keys.BACK_SPACE);
        PRole.sendKeys("Singer");

        JavascriptExecutor js1 = (JavascriptExecutor) driver;
        js1.executeScript("window.scrollBy(0,500)");
        Thread.sleep(2000);

        WebElement selectTypeDropdown = wait.until(
                ExpectedConditions.elementToBeClickable(
                        By.xpath("//label[text()='Select Type*']/following-sibling::div")));
        selectTypeDropdown.click();

        WebElement bandOption = wait.until(
                ExpectedConditions.elementToBeClickable(
                        By.xpath("//li[normalize-space()='Band']")));
        bandOption.click();

        WebElement Selectgender1 = wait.until(
                ExpectedConditions.elementToBeClickable(By.xpath("//*[@aria-labelledby=\"gender\"]")));
        Selectgender1.click();

        WebElement gen = wait.until(
                ExpectedConditions.elementToBeClickable(By.xpath("//li[@data-value=\"Female\"]")));
        gen.click();

        WebElement languageDropdown = driver.findElement(By.xpath("//input[@placeholder=\"Language\"]"));
        languageDropdown.click();

        WebElement lang = driver.findElement(By.xpath("//*[text()='Hindi']"));
        lang.click();

        WebElement about = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@placeholder=\"Please write about yourself\"]")));
        about.sendKeys(Keys.chord(Keys.CONTROL, "a"));
        about.sendKeys(Keys.BACK_SPACE);
        about.sendKeys("Testing data");

        WebElement Save = driver.findElement(By.xpath("//button[text()=\"Save\"]"));
        Save.click();
        Thread.sleep(3000);
        JavascriptExecutor js2 = (JavascriptExecutor) driver;
        js2.executeScript("window.scrollTo(0, 0);");
        Thread.sleep(3000);
       
    }

    // ✅ Step 4 - Go To Profile
    @Test(priority = 4)
    public void profile() {

        WebDriverWait wait21 = new WebDriverWait(driver, Duration.ofSeconds(10));
        JavascriptExecutor js2 = (JavascriptExecutor) driver;
       
        WebElement profile = wait21.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(@href,'collab')]")));
        js2.executeScript("arguments[0].scrollIntoView(true);",profile);
        profile.click();     
    } 

   // Step 5 - Upload Photo
//    @Test(priority = 5)
//    public void uploadProfilePhoto() {
//
//        p.getUploadPhoto().click();
//        p.getDeletPhoto().click();
//        p.getAddPhoto().sendKeys("C:\\Users\\Poonam\\Downloads\\photo.jpg");
//    }
    
    @Test(priority = 6)
    public void categoryDropdown() {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        // Wait and click Category dropdown
        WebElement category = wait.until(
                ExpectedConditions.elementToBeClickable(p.getcategory()));
        category.click();

        // Wait and select category option
        WebElement selectCategory = wait.until(
                ExpectedConditions.elementToBeClickable(p.getselectcategory()));
        selectCategory.click();

        System.out.println("Category selected successfully");
    }

}
