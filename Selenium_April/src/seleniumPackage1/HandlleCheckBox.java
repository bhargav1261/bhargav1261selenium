package seleniumPackage1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlleCheckBox {

	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Bhargav\\Desktop\\chromedriver_win32\\chromedriver.exe");
	        
			WebDriver driver =new ChromeDriver();
			driver.get("https://itera-qa.azurewebsites.net/home/automation");
			driver.manage().window().maximize();
			
			//select specific check box
			
			//driver.findElement(By.xpath("//input[@id='monday']")).click();//monday
			
			//select all chechk boxes
			
			List<WebElement>checkbox=driver.findElements(By.xpath("//input[@type='checkbox' and contains(@id,'day')]"));
	        System.out.println("Number of checkboxes are :"+checkbox.size());
	        
	        //using for loop
	        
			/*
			 * for( int i=0;i<checkbox.size();i++) { checkbox.get(i).click(); }
			 */
	     
	        //using for each
			/*
			 * for(WebElement chkbox :checkbox) 
			 * { chkbox.click(); 
			 * }
			 */
	
	      // select multiple check boxes
	        //Monday &sunday
	        
	        /*for(WebElement chkbox :checkbox)
	        {
	        String checkboxname=chkbox.getAttribute("id");
	        if(checkboxname.equals("monday")|| checkboxname.equals("sunday"))
	        {
	        	chkbox.click();
	        }*/
	        
	        	
	// select 2 check boxes
	        
	    //Total no of check boxes-no of check boxes want to select =starting index    
	        //7-2=5
	        
	        int totalcheckboxes=checkbox.size();
	        
			/*
			 * for(in,t i=totalcheckboxes-2;i<checkbox.size();i++) { checkbox.get(i).click();
			 * }
			 * 
			 */
	    // how to  select first two Check boxes
	        
	        for(int i=0;i<totalcheckboxes;i++)
	        {
	      if(i<2)
	      {
	    	  checkbox.get(i).click();
	      }
	
	}
	
	}

}