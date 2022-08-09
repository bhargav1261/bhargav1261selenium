package seleniumPackage1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseActions {

	public static void main(String[] args) throws Exception {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Bhargav\\Desktop\\chromedriver_win32\\chromedriver.exe");
        
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.myntra.com/");
		driver.manage().window().maximize();
		
		//Mouse over
		Actions action=new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("(//a[text()='Men'])[1]"))).build().perform();
		
		//click
		action.click(driver.findElement(By.xpath("//a[text()='Formal Shirts']"))).build().perform();
		//action.click(driver.findElement(By.xpath("(//img[@class='img-responsive'])[1]"))).build().perform();
		
		//double click
		action.doubleClick(driver.findElement(By.xpath("//a[@class='myntraweb-sprite desktop-logo sprites-headerLogo']"))).build().perform();
		
		//Right click
		Thread.sleep(5000);
		action.contextClick(driver.findElement(By.xpath("//input[@class='desktop-searchBar']"))).build().perform();
		
		//Drag and Drop
		driver.navigate().to("https://testautomationpractice.blogspot.com/");
		action.dragAndDrop(driver.findElement(By.xpath("//div[@id='draggable']")),driver.findElement(By.xpath("//div[@id='droppable']"))).build().perform();
		
	}
}
