package seleniumPackage1;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PropertyFileExample {

	public static void main(String[] args) throws IOException {
		
		//Read Prop file
		
		FileInputStream fis=new FileInputStream("C:\\Users\\Bhargav\\eclipse-workspace\\Selenium_April\\globalProp.properties");
		
		Properties pop=new Properties();
		
		pop.load(fis);
		
		String url=pop.getProperty("url");
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Bhargav\\Desktop\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();

	}

}
