package seleniumPackage1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorDemo2 {

	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Bhargav\\Desktop\\chromedriver_win32\\chromedriver.exe");
	        
			WebDriver driver =new ChromeDriver();
			driver.get("http://automationpractice.com/index.php");
			driver.manage().window().maximize();
			// className
			
	int sliders=driver.findElements(By.className("homeslider-container")).size();
	System.out.println(sliders);
     
	//TagName
	
	 int links=driver.findElements(By.tagName("a")).size();
	System.out.println(links);
	 
	}

}
