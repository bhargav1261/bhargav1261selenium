package seleniumPackage1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyBoardActions {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Bhargav\\Desktop\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://demoqa.com/text-box");
        driver.manage().window().maximize();
        
        Actions action=new Actions(driver);

        driver.findElement(By.xpath("//input[@id='userName']")).sendKeys("Bhargav");
		
		  driver.findElement(By.xpath("//input[@id='userEmail']")).sendKeys("bharagv1261@gmail.com");
		  driver.findElement(By.xpath("//textarea[@id='currentAddress']")).sendKeys("Gollapudi,Vijayawada");
		  
		  action.keyDown(Keys.CONTROL).sendKeys("A").keyUp(Keys.CONTROL).build().perform();
		  action.keyDown(Keys.CONTROL).sendKeys("C").keyUp(Keys.CONTROL).build().perform(); 
		  action.sendKeys(Keys.TAB);
		  action.keyDown(Keys.CONTROL).sendKeys("V").keyUp(Keys.CONTROL).build().perform();
		 

}
}
