package seleniumPackage1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class Browsers {

	public static void main(String[] args) {
		// firefox driver
		//System.setProperty("webdriver.gecko.driver","C:\\Users\\Bhargav\\Desktop\\geckodriver-v0.31.0-win64//geckodriver.exe");
	               // WebDriver driver =new FirefoxDriver();
	               // driver.get("https://www.facebook.com");
	                //driver.manage().window().maximize();
	                //driver.close();
		
	                //Edge Driver
		
		System.setProperty("webdriver.edge.driver","C:\\Users\\Bhargav\\Desktop\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.facebook.com");
		System.out.println(driver.getTitle());
		driver.manage().window().maximize();
	                
	                
	                
	                
	}
	
	

}
