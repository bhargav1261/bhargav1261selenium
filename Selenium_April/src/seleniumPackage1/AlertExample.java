package seleniumPackage1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertExample {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Bhargav\\Desktop\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://courses.letskodeit.com/practice");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='confirmbtn']")).click();
		//Switch to Alert
		Alert alert=driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.accept();
		

	}

}
