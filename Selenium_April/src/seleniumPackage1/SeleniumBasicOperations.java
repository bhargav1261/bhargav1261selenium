package seleniumPackage1;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumBasicOperations {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Bhargav\\Desktop\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://courses.letskodeit.com/practice");
		driver.manage().window().maximize();
		
		//Radio Button
	 driver.findElement(By.xpath("//input[@id='benzradio']")).click();
	//driver.findElement(By.xpath("//legend[text()='Radio Button Example']/following-sibling::label[2]/input[@id='benzradio']")).click();
	
	 // Check boxes
	 
	// driver.findElement(By.xpath("//input[@id='hondacheck']")).click();
	// driver.findElement(By.xpath("//input[@id='benzcheck']")).click();
	 
	//Buttons 
	// driver.findElement(By.xpath("//button[text()='Open Window']")).click();
	 // Text- boxes
	 driver.findElement(By.xpath("//input[@id='name' and @name='enter-name']")).sendKeys("Bhargav");
	 driver.findElement(By.xpath("//input[@id='name' and @name='enter-name']")).clear();
	 driver.findElement(By.xpath("//input[@id='name' and @name='enter-name']")).sendKeys("Navya");
	
	}	

}
