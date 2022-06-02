package TrainingSelenium.Selenium1905;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class SeleniumBasicScript {

	public static void main(String[] args) {

		//Invoking Browser
		// Chrome 
	    System.setProperty("webdriver.chrome.driver", "C:\\Users\\MANDKALY\\Documents\\Selenium Grid\\chromedriver.exe");  
	    WebDriver driver =new ChromeDriver();  
	   
	    
	     driver.get("https://rahulshettyacademy.com");
	     String title=driver.getTitle();
	     System.out.println(title);
	     driver.close();
	     //driver.quit();
         


	}

}
