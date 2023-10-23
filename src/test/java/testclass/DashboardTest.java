package testclass;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.annotations.Test;

import Pages.DashboardPage;
import Pages.LoginPage;
import extentlisteners.TestNGListeners;
import utility.ConfigReader;

public class DashboardTest extends TestNGListeners{ 
	
	@Test(priority = 2)
	public void deshboardPoopup() 
	{
		
		
		DashboardPage dashboardpage = new DashboardPage(driver);
		
		dashboardpage.HandlePopupWindow();
		
		test.info("Handle Popup Window");
		
	}
	
	@Test(priority = 3)
	public void dashboardPageTotalCount() 
	{
		
		
		DashboardPage dashboardpagetotalcount = new DashboardPage(driver);
		
		dashboardpagetotalcount.totalCount();
		
		test.info("Verified Total Count");
		
	}
	
	@Test(priority = 4)
	public void dashBoardGetTitle() 
	{
		
		DashboardPage dashboardpagetitle = new DashboardPage(driver);
		
		dashboardpagetitle.HandlePopupWindow();
		
		test.info("Handle Popup Window");
		
	}

}
