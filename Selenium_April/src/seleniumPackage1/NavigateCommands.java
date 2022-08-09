package seleniumPackage1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateCommands {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Bhargav\\Desktop\\chromedriver_win32\\chromedriver.exe");
             WebDriver driver=new ChromeDriver();
             driver.get("https://www.facebook.com");
             driver.manage().window().maximize();
             
             driver.navigate().to("https://www.google.com");
             
             driver.navigate().back();
             driver.navigate().forward();
             driver.navigate().refresh();
	}

}
