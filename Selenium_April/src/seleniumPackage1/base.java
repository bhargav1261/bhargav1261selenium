package seleniumPackage1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class base {

	public static void main(String[] args) {
	    
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Bhargav\\Desktop\\chromedriver_win32\\chromedriver.exe");
	    driver =new ChromeDriver();
	    driver.get("http://automationpractice.com/index.php");
	    driver.manage().window().maximize();
	}
	

}