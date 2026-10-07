package tests;

import org.testng.annotations.Test;

import actions.AccountActions2Login;

public class ProfileTest extends BaseTest {

	    @Test
	    public void testProfile() throws InterruptedException {

	        AccountActions2Login ac1 = new AccountActions2Login(driver);

	        ac1.openPage();
	        ac1.loginAndVerifyProfileIcon();
	        ac1.updateGeneralProfile();
	        ac1.profile();
	       // ac1.uploadProfilePhoto();
	           ac1.categoryDropdown();
	        
	    }
	
}
