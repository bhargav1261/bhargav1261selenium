package seleniumPackage1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorDemo4_Xpaths {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Bhargav\\Desktop\\chromedriver_win32\\chromedriver.exe");
        
		WebDriver driver =new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		// AbsoluteXpath
		//driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/header[1]/div[3]/div[1]/div[1]/div[2]/form[1]/input[4]")).sendKeys("T-shirts");
		//driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/header[1]/div[3]/div[1]/div[1]/div[2]/form[1]/button[1]")).click();	
      
		//RelativeXpath
		//driver.findElement(By.xpath("//input[@id='search_query_top']")).sendKeys("T-shirts");
		//driver.findElement(By.xpath("//button[@name='submit_search']")).click();
		
		//Xpath With 'or'
		
		//driver.findElement(By.xpath("//input[@id='search_query_top' or @name='search_query1']")).sendKeys("T-shirts");
		//driver.findElement(By.xpath("//button[@name='submit_searchX' or @class='btn btn-default button-search']")).click();
		
		//Xpath With 'AND'
		
		// driver.findElement(By.xpath("//input[@id='search_query_top' and  @name='search_query']")).sendKeys("T-shirts");
		// driver.findElement(By.xpath("//button[@name='submit_search' and @class='btn btn-default button-search']")).click();
		
		 //Xpath With Contains
		 
		// driver.findElement(By.xpath("//input[contains(@id,'search_query')]")).sendKeys("T-Shirts"); //id="search_query_top"
		// driver.findElement(By.xpath("//button[contains(@name,'search')]")).click(); //name="submit_search"
		
		//Xpath With starts_with
		 
		// driver.findElement(By.xpath("//input[starts-with(@id,'search_query')]")).sendKeys("T-shirts");
		// driver.findElement(By.xpath("//button[starts-with(@name,'submit_')]")).click();
		   
		//Xpath With Text()
		 driver.findElement(By.xpath("//a[text()='Women']")).click(); //Women Tab
		 
		 //chained Xpath
		 // driver.findElement(By.xpath("//form[@id='searchbox']//input[4]")).sendKeys("T-shirts");
		 //driver.findElement(By.xpath("//form[@id='searchbox']//button")).click();
		 
		 driver.findElement(By.xpath("//form[@id='searchbox']//input[@id='search_query_top']")).sendKeys("T-shirts");
		 driver.findElement(By.xpath("//form[@id='searchbox']//button[@name='submit_search']")).click();
		 
		 
		
	} 
	
	}

