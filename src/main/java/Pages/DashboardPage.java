package Pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DashboardPage {

	
	@FindBy(xpath = "//*[text()='Later']")
	private WebElement alert_button;
	
	private WebDriver driver;
	
	public DashboardPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		
		this.driver = driver;
		
	}
	
	public void HandlePopupWindow() {
		
	driver.findElement(By.id("onesignal-slidedown-cancel-button")).click();
		
	driver.navigate().refresh();
	
	alert_button.click();
	
	Alert alert = driver.switchTo().alert();
	
	String alertText = alert.getText();
    System.out.println("Alert text: " + alertText);
    
    alert.accept(); 
    	
	}
	
	public void totalCount()
	{
        WebElement countElement = driver.findElement(By.partialLinkText("114"));

        // Get the count text from the element
        String countText = countElement.getText();

        // Convert the count text to an integer
        int actualCount = Integer.parseInt(countText);

        // Define the expected count
        int expectedCount = 114; // Replace with your expected count

        // Use assert to verify the count
        assert actualCount == expectedCount : "Count doesn't match the expected value.";
	}
	
	public String getTitleOfPage()
	{
		String titleofpage = driver.getTitle();
		
		return titleofpage;
	}
	
	
	
	
	

}
