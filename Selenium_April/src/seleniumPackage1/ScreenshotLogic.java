package seleniumPackage1;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenshotLogic {

	public static void main(String[] args) throws IOException {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\Bhargav\\Desktop\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://courses.letskodeit.com/practice");
		driver.manage().window().maximize();
		// FullPageScreen Shot
		/*
		 * TakesScreenshot ts=(TakesScreenshot)driver; File
		 * src=ts.getScreenshotAs(OutputType.FILE); File trg=new
		 * File("C:\\Users\\Bhargav\\Desktop\\SchreenShots\\fullpage.png");
		 * FileUtils.copyFile(src,trg);
		 * 
		 * //screen shot of section
		 * 
		 * WebElement section=driver.findElement(By.
		 * xpath("(//div[@class='block large-row-spacer yummy'])[2]"));
		 * 
		 * File src=section.getScreenshotAs(OutputType.FILE); File trg=new
		 * File("C:\\Users\\Bhargav\\Desktop\\SchreenShots\\section.png");
		 * FileUtils.copyFile(src,trg);
		 */
		// screen shot of element

		WebElement ele = driver.findElement(By.xpath("//button[text()='Open Window']"));

		File src = ele.getScreenshotAs(OutputType.FILE);
		File trg = new File("C:\\Users\\Bhargav\\Desktop\\SchreenShots\\Openwindow.png");
		FileUtils.copyFile(src, trg);

		driver.close();

	}

}