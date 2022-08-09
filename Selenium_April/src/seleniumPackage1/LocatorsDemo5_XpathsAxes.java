package seleniumPackage1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsDemo5_XpathsAxes {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Bhargav\\Desktop\\chromedriver_win32\\chromedriver.exe");
        
		WebDriver driver =new ChromeDriver();
		driver.get("https://money.rediff.com/gainers/bse/daily/groupa");
		driver.manage().window().maximize();
         
		//self- Select the current node.
		 String text=driver.findElement(By.xpath("//a[contains(text(),'Sharda Cropchem')]/self::a")).getText();
		 System.out.println(text); //Sharda Cropchem
		 
		 //parent -select the parent of the current node(always one)
		  text =driver.findElement(By.xpath("//a[contains(text(),'Sharda Cropchem')]/parent::td")).getText();
		  System.out.println(text); //Sharda Cropchem
		  
		  //child -selects all children of the current node(one or many)
		  List<WebElement> childs=driver.findElements(By.xpath("//a[contains(text(),'Sharda Cropchem')]/ancestor::tr/child::td"));
		  System.out.println("No of child elements are :"+childs.size()) ;
		  
		  //ancestor- select all ancestor(parent,grandparent,etc.)
		 text= driver.findElement(By.xpath("//a[contains(text(),'Sharda Cropchem')]/ancestor::tr")).getText();
		  System.out.println(text);
	     
	     //Descendant-selects all descendants(children,grandchildren.etc) of the current node.
		  
		 List<WebElement> descedant=driver.findElements(By.xpath("//a[contains(text(),'Sharda Cropchem')]/ancestor::tr/descendant::*"));
		 System.out.println("No of Descedant nodes:"+descedant.size());
	 
		 //Following- select everything in the document after the closing tag of the current node.
	
		 List<WebElement> following=driver.findElements(By.xpath("//a[contains(text(),'Sharda Cropchem')]/ancestor::tr/following::tr"));
	     System.out.println("No of Following nodes:"+following.size());
	 
	 //Following Siblings - selects all siblings after the current node
	   
	     List<WebElement> followingsibling=driver.findElements(By.xpath("//a[contains(text(),'Sharda Cropchem')]/ancestor::tr/following-sibling::tr"));
		 System.out.println("No of FollowingSiblings nodes:"+followingsibling.size());
		 
		 //Preceding - select all nodes appear before the current node in the document
		 
		 List<WebElement> preceding=driver.findElements(By.xpath("//a[contains(text(),'Sharda Cropchem')]/ancestor::tr/preceding::tr"));
		 System.out.println("No of preceding nodes:"+preceding.size());
		 
         //Preceding-Sibling - select all siblings before the current node 
		 List<WebElement> precedingsibling=driver.findElements(By.xpath("//a[contains(text(),'Sharda Cropchem')]/ancestor::tr/preceding-sibling::tr"));
		 System.out.println("No of preceding sibling nodes:"+precedingsibling.size());
		 
		 
		 
		 
		 //driver.close();
	}
	
	

}
