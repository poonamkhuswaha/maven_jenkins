package tests;

import org.testng.annotations.Test;

import actions.AccountActions;

public class SignUpTest extends BaseTest {
	
	
	@Test
	public void testSignUP()
	
	{
		
	AccountActions ac = new	AccountActions(driver);
	ac.openPage();
	ac.SignUpPage();
		
		
	}
	




}
