package seleniumPackage1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumFirstProgaram {

	public static void main(String[] args) {
	
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Bhargav\\Desktop\\chromedriver_win32\\chromedriver.exe" );
	    //interface             //class
	   WebDriver driver =new ChromeDriver();
	    driver.get("https://www.facebook.com");
	    driver.manage().window().maximize();
	    driver.close();
	    
	    

	}
	
	
	

}
