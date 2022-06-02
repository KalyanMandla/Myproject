package TrainingSelenium.Selenium1905;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertEx {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MANDKALY\\eclipse-workspace\\Maven Project Selenium\\Selenium1905\\src\\main\\java\\Resoucres\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 
		 driver.manage().window().maximize();	
		 
		 String text="Kalyan Mandla";
		 
		 driver.get("https://rahulshettyacademy.com/AutomationPractice/"); 
		 Thread.sleep(2000);
		 
		 driver.findElement(By.id("name")).sendKeys(text);
		 
		 driver.findElement(By.cssSelector("[id='alertbtn']")).click();
		 
		 System.out.println(driver.switchTo().alert().getText());
		 
		 driver.switchTo().alert().accept();
		 
		 driver.findElement(By.id("confirmbtn")).click();
		 
		 System.out.println(driver.switchTo().alert().getText());
		 
		 driver.switchTo().alert().dismiss();
		 
		 driver.close();
		 
	}

}
