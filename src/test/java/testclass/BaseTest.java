package testclass;


import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import com.aventstack.extentreports.ExtentReports;

import Pages.LoginPage;
import extentlisteners.TestNGListeners;
import extentlisteners.extentReportGen;
import utility.ConfigReader;
import Pages.DashboardPage;

public class BaseTest {

	public static WebDriver driver;
	public LoginPage loginpage;
	public static ConfigReader confiqreader;
	static ExtentReports extent;
	
	static ExtentReports extentReportGenerator;
	
	public DashboardPage dashboardpage;
	
	@BeforeSuite
	public void initBrowser() throws IOException
	{
		ConfigReader confiqreader = new ConfigReader();
		
		String browsername = confiqreader.readConfig("browser");
		if(browsername.equals("Chrome"))
		{
		driver = new ChromeDriver();
		}
		else if(browsername.equals("Firefox"))
		{
			driver = new FirefoxDriver();
		}
		else if(browsername.equals("Edge"))
		{
			driver = new EdgeDriver();
		}
		
		driver.manage().window().maximize();

		 String url = confiqreader.readConfig("testsiteurl");
		
		driver.get(url);
		
	}
	
	@BeforeClass
	public void createObject()
	{
		 loginpage = new LoginPage(driver);
		// dashboardpage = new DashboardPage(driver);
	}
	

	
//	@AfterSuite
//	public void tearDown()
//	{
//		driver.quit();
//	}

}


