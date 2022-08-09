package seleniumPackage1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class GetTextExample {

	public static void main(String[] args) {
		
			 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Bhargav\\Desktop\\chromedriver_win32\\chromedriver.exe");
		        
				WebDriver driver =new ChromeDriver();
				driver.get("https://courses.letskodeit.com/practice");
				driver.manage().window().maximize();
				
				//GetText
			String	openwindowText=driver.findElement(By.xpath("//button[text()='Open Window']")).getText();
		     System.out.println(openwindowText);
		     
		     //GetAttribute value
		  String   placeholder=driver.findElement(By.xpath("//input[@name='enter-name']")).getAttribute("placeholder");
		  System.out.println(placeholder);
		  
		  //GetCssselector
		 String placehodermargin=driver.findElement(By.xpath("//input[@name='enter-name']")).getCssValue("margin-bottom");

		System.out.println( placehodermargin);
	}

}
