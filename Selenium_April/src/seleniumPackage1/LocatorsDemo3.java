package seleniumPackage1;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsDemo3 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Bhargav\\Desktop\\chromedriver_win32\\chromedriver.exe");
        
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		
		  //CSS Selectors 
		  //Tag&Id Combination
		  
		  //driver.findElement(By.cssSelector("#email")).sendKeys("Bhargav");
		  //driver.findElement(By.cssSelector("input#email")).sendKeys("Bhargav");
		  
		  //Tag&ClassName
		  
		  //driver.findElement(By.cssSelector("input.inputtext")).sendKeys("Bhargav1261@gmail.com"); //
		  //driver.findElement(By.cssSelector(".inputtext")).sendKeys("Bhargav1261@gmail.com");
		   
		  //Tag&Attribute
		  
		 // driver.findElement(By.cssSelector("input[id=email]")).sendKeys("Bhargav1261@gmail.com");
		 // driver.findElement(By.cssSelector("input[name=email]")).sendKeys("Bhargav1261@gmail.com");
		  //driver.findElement(By.cssSelector("input[data-testid=royal_email]")).sendKeys("Bhargav1261@gmail.com");
		 // driver.findElement(By.cssSelector("[name=email]")).sendKeys("Bhargav1261@gmail.com");
		
	       //Tag,class&attribute
		 driver.findElement(By.cssSelector("input.inputtext[data-testid=royal_email]")).sendKeys("Bhargav1261@gmail.com");
		driver.findElement(By.cssSelector("input.inputtext[data-testid=royal_pass]")).sendKeys("navya");
		 
		 //Find the Sign-up button from the registration from present in the Facebook application
		 
		// driver.findElement(By.xpath("//div[@id='reg_form_box']/child::div[10]/button")).click();
	
	}
	
	
	
	
		 }
	


