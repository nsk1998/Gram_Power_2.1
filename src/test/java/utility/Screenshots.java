	package utility;

	import java.io.File;
	import java.io.IOException;

	import org.openqa.selenium.OutputType;
	import org.openqa.selenium.TakesScreenshot;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.io.FileHandler;

	public class Screenshots {
	
		public String captureScreenshot(WebDriver driver, String filename) throws IOException
		{
			TakesScreenshot ts = (TakesScreenshot)driver;
			
			File screenshot = ts.getScreenshotAs(OutputType.FILE);
			
			String path = System.getProperty("user.dir")+"/src/test/java/utility/Screenshots"+filename+".png";
			
			File destinationpath = new File(path);
			
			FileHandler.copy(screenshot, destinationpath);
			
			return path;
		}
		
		public static void main(String[] args) throws IOException {
			
			WebDriver driver = new ChromeDriver();
			
			
			driver.manage().window().maximize();
			
			driver.get("https://data.grampower.com/hes/");
			
			TakesScreenshot ts = (TakesScreenshot)driver;
			
			File screenshot = ts.getScreenshotAs(OutputType.FILE);
			
			String path = "C:\\Users\\Lenovo\\Desktop\\Gram_Power_2.O\\Gram_Power_2.O\\src\\test\\java\\utility\\Screenshots.java";
			
			//String path = System.getProperty("user.dir")+"\\screenshots\\"+filename+".png";
			
			File destinationpath = new File(path);
			
			FileHandler.copy(screenshot, destinationpath);
		}		
	}