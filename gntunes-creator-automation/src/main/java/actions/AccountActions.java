package actions;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import pages.SignUp;
import pages.Login;        // <-- Make sure this path is correct
import utils.Config;
import utils.TestData;
import utils.TestDataforlogin;

public class AccountActions
{

    private WebDriver driver;
    private SignUp sp;
    private Login lg;

    // Constructor for SignUp actions
    public AccountActions(WebDriver driver) {
        this.driver = driver;
        this.sp = new SignUp(driver);
        this.lg= new Login(driver);
    }

    // Overloaded constructor for Login actions  
    public AccountActions(WebDriver driver, boolean isLogin) {
        this.driver = driver;
        this.lg = new Login(driver);
    }

    public void openPage() {
        driver.get(Config.Base_URL1);
    }

    public void SignUpPage() {

        sp.getEmail().sendKeys(TestData.EMAIL);
        sp.getPw().sendKeys(TestData.PASSWORD);
        sp.getCPw().sendKeys(TestData.ConfirmPASSWORD);
        sp.getYourPrimaryRole().click();

        // Scroll into view and click signup
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", sp.getSignupBtn());
        
        sp.getSignupBtn().click();
    }

    public void LoginPage() {

        lg.getEmail().sendKeys(TestDataforlogin.EMAIL);
        lg.getPass().sendKeys(TestDataforlogin.PASSWORD);
        lg.getButton().click();
    }

}
