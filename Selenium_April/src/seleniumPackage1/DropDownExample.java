package seleniumPackage1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownExample {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Bhargav\\Desktop\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://courses.letskodeit.com/practice");
		driver.manage().window().maximize();
		
		Select select=new Select(driver.findElement(By.xpath("//select[@id='carselect']")));
		//select.selectByIndex(2);
		//select.selectByValue("benz");
		//select.selectByVisibleText("Honda");
		
	List<WebElement>drpvalues=select.getOptions();
		for(WebElement drp:drpvalues)
		{
			System.out.println(drp.getText());
			if(drp.getText().equals("Honda")) {
				System.out.println(drp.getText());
				drp.click();
			}

	
		}
}

}