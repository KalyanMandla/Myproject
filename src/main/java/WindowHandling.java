import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandling {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MANDKALY\\eclipse-workspace\\Maven Project Selenium\\Selenium1905\\src\\main\\java\\Resoucres\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 
		 driver.get("https://rahulshettyacademy.com/loginpagePractise/#");
		 
		 driver.findElement(By.cssSelector(".blinking Text")).click();
		 Set<String> windows=driver.getWindowHandles();
		 
		 Iterator<String>it=windows.iterator();
		 String parentId=it.next();
		 String childId=it.next();
		 
		 driver.switchTo().window(childId);
	     System.out.println(driver.findElement(By.cssSelector(".im-para.red")).getText());		
			
	     driver.switchTo().window(parentId);
	     driver.findElement(By.id("username")).sendKeys("kalyanmandla2010@gmail.com");
         
		 driver.quit();
	    // driver.close();
	}

}
