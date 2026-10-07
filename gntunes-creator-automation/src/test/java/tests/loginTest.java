package tests;

import org.testng.annotations.Test;
import actions.AccountActions2Login;

public class loginTest extends BaseTest {

    @Test
    public void testLogin() {

        AccountActions2Login ac1 = new AccountActions2Login(driver);

        ac1.openPage();
        ac1.loginAndVerifyProfileIcon();
    }
}
