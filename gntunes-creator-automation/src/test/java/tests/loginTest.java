package tests;

import org.testng.annotations.Test;
import actions.AccountActions;

public class loginTest extends BaseTest {

    @Test
    public void testLogin() {

        AccountActions ac1 = new AccountActions(driver);

        ac1.openPage();
        ac1.LoginPage();
    }
}
