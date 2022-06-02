package TrainingSelenium.Selenium1905;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import graphql.Assert;

public class RadioButton {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MANDKALY\\eclipse-workspace\\Maven Project Selenium\\Selenium1905\\src\\main\\java\\Resoucres\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 
		 driver.get("https://www.rahulshettyacademy.com/dropdownsPractise/"); 
         Thread.sleep(3000);
         
		 Assert.assertFalse(driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_0")).isSelected());
		 
		 driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_0")).click();
		 
		 System.out.println(driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_0")).isSelected());
		 
		 Assert.assertTrue(driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_0")).isSelected());
		 
		 driver.close();
		 
		 
	}

}
