package TrainingSelenium.Selenium1905;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutosuggestDropDown {

	public static  void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MANDKALY\\eclipse-workspace\\Maven Project Selenium\\Selenium1905\\src\\main\\java\\Resoucres\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 
		 driver.get("https://www.rahulshettyacademy.com/dropdownsPractise/"); 
		 
		  driver.findElement(By.id("autosuggest")).sendKeys("ind");
		  Thread.sleep(3000);
		  
		List<WebElement> options =driver.findElements(By.cssSelector("a[class='ui-corner-all']"));
		  
		  for(WebElement option :options)
		  {
			  if(option.getText().equalsIgnoreCase("India"))
			  {  
			      option.click();
			      break;
			  }  
		  }
		 
          driver.close();
	}

}
