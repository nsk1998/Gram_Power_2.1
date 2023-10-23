package testclass;

import java.io.IOException;
import org.testng.Assert;
import org.testng.annotations.Test;
import Pages.LoginPage;
import extentlisteners.TestNGListeners;
import utility.ConfigReader;


public class LoginTest extends TestNGListeners{
	
	@Test(priority = 1)
	public void LoginToGrampower() 
	{
		
		LoginPage login = new LoginPage(driver);
		
		login.Sendusername();
		
		//test.info("Entered Username");
		
		login.Sendpassword();

		//test.info("Entered Password");
		
		login.ClickOnLogin();
		
		test.info("Click on Login Button");
		
	}	
	

		

		
	
	
	
//	@Test(priority = 1)
//	public void validateTitle()
//	{
//		LoginPage login = new LoginPage(driver);
//		
//		String title = LoginPage.getTitleOfPage();
//		
//		test.info("Fetched the title of page");
//		
//		String expected = "Gram Power";
//		
//		boolean ispresent = title.contains(expected);
//		
//		Assert.assertEquals(ispresent, true);
//		
//		test.info("Title of page has been validated");
//		
//	}

//	
//	@Test(priority = 2)
//	public void navToSingleMalt()
//	{
//		homepage.clickOnSpirit();
//		
//		test.info("Clicked on single malt");
//		
//		homepage.navToProductPage();
//		
//		test.info("Navigated to product page");
//	}
 
}



