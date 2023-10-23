package utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
	
	
	
	public String readConfig(String valuetoread) throws IOException
	{
		
		String userDir = System.getProperty("user.dir");
		String filePath = userDir + "/src/test/resources/config.properties";


		 
		 FileInputStream fis = new FileInputStream(filePath); 
		 
		 Properties prop = new Properties();
		 
		 prop.load(fis);
		 
		 String value = prop.getProperty(valuetoread);
		 
		 System.out.println(value);
		 
		 return value;
	}
	
 public static void main(String[] args) throws IOException {
	
	 String userDir = System.getProperty("user.dir");
	 String filePath = userDir + "/src/test/resources/Confiq.properties";


	 
	 FileInputStream fis = new FileInputStream(filePath);
	 
	 Properties prop = new Properties();
	 
	 prop.load(fis);
	 
	 String value = prop.getProperty("testsiteurl");
	 
	 System.out.println(value);
	 	 

 
 	}
 }
