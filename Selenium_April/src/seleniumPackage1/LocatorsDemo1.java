package seleniumPackage1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsDemo1 {

	public static void main(String[] args) {
     System.setProperty("webdriver.chrome.driver", "C:\\Users\\Bhargav\\Desktop\\chromedriver_win32\\chromedriver.exe");
        
		WebDriver driver =new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		
		//Id &Name Locators
		
	 WebElement	 searchbox=driver.findElement(By.id("search_query_top"));
	 
	 searchbox.sendKeys("T-shirts");
	 
	 driver.findElement(By.name("submit_search")).click();
	 
	 //LinkText
	 driver.findElement(By.linkText("Printed Chiffon Dress")).click();
	 //Partial link Text
	 //driver.findElement(By.partialLinkText("Chiffon Dress")).click();
		
	
	}
	
	

}
