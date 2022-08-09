package seleniumPackage1;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class LocatorsExample {

	public static  void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Bhargav\\Desktop\\chromedriver_win32\\chromedriver.exe");
        
		WebDriver driver =new ChromeDriver();
		driver.get("https://courses.letskodeit.com/practice");
		driver.manage().window().maximize();
		
		String username=ExcelRead.excelread("Sheet1",1,0);
		//Locator Id
		driver.findElement(By.id("benzcheck")).click();
	    //Based on Name
		driver.findElement(By.name("enter-name")).sendKeys(username);
		//Tag Name
		
		List<WebElement> alllinks=driver.findElements(By.tagName("a"));
		
		for(WebElement link :alllinks) 
		{
			System.out.println(link.getText());
		}
	
		 
		driver.findElement(By.linkText("ALL COURSES")).click();
		
		driver.findElement(By.name("course")).sendKeys("Java");
		
		
	}

}
