package seleniumPackage1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectClass {

	public static void main(String[] args) {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Bhargav\\Desktop\\chromedriver_win32\\chromedriver.exe");
	    driver =new ChromeDriver();
	    driver.get("http://output.jsbin.com/osebed/2/");
	    driver.manage().window().maximize();
	    
	    Select fruits=new Select(driver.findElement(By.id("fruits")));
	    fruits.selectByVisibleText("Banana");
	    fruits.selectByIndex(1);

	}

}
