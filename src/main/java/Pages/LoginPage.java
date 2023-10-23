package Pages;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



import java.time.Clock;

public class LoginPage {
	

	
	@FindBy(xpath = "//input[@name='username']")
	private WebElement username;
	
	@FindBy(xpath = "//input[@name='password']")
	private WebElement password;
	
	@FindBy(xpath = "//*[@value='LOG IN']")
	private WebElement login;
	
	private WebDriver driver;
	
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		
		this.driver = driver;
		
	}
	
	public void Sendusername() {
		
		username.click();
		
		username.sendKeys("automationuser");
		
		password.click();
		
	
		
	}
	
	public void Sendpassword() {
		
		password.click();
		
		password.sendKeys("grampower");
		
		password.click();
		
	}
	
	public void ClickOnLogin(){
		
		login.click();
		
		driver.navigate().refresh();
		
	}
	


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
	
	
	
//	
//		@FindBy(xpath = "//input[@name='username']")
//		private WebElement usernameInput;
//		
//		@FindBy(xpath = "//input[@name='password']")
//		private WebElement passwordInput;
//		
//		@FindBy(xpath = "//input[@value='LOG IN']")
//		private WebElement loginButton;
//		
//		@FindBy(xpath = "//*[text()='Later']")
//		private WebElement popupwindow;
//
//		
//		private WebDriver driver;
//		//private ConfigReader confiqreader;
//		
//		public LoginPage(WebDriver driver)
//		{
//			
//			PageFactory.initElements(driver, this);
//			
//			this.driver = driver;
//			
//		}
//		
//		public void Sendusername() {
//			
//			usernameInput.click();
//			
//			usernameInput.sendKeys("automationuser");
//			
//			usernameInput.click();
//			
//		
//			
//		}
//		
//		public void Sendpassword() {
//			
//			passwordInput.click();
//			
//			passwordInput.sendKeys("grampower");
//			
//			passwordInput.click();
//			
//		}
//		
//		public void waitForLoginButtonToBeVisible(){
//			
//			loginButton.click();
//			
//			
//		}
//		
//		public void HandlePopupWindow() {
//			
//		String textonalertpopup = driver.switchTo().alert().getText();
//			
//		System.out.println(textonalertpopup);
//		
//		driver.switchTo().alert().accept();
//		
//		}
//		
//		
//		
//		public String getTitleOfPage()
//		{
//			String titleofpage = driver.getTitle();
//			
//			return titleofpage;
//		}
//		
//	}
//
//
//
