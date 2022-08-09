package seleniumPackage1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class FrameHandling {

	public static void main(String[] args) {
	

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Bhargav\\Desktop\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://courses.letskodeit.com/practice");
		driver.manage().window().maximize();
		
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='courses-iframe']")));
		
		driver.findElement(By.xpath("//input[@placeholder='Search Course']")).sendKeys("Java");
		driver.findElement(By.xpath("//button[@class='find-course search-course']")).click();
		
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//input[@id='hondacheck']")).click();

		
	}

	}	

			
				
				
				



	
