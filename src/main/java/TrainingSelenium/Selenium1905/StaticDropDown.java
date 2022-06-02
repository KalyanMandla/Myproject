package TrainingSelenium.Selenium1905;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class StaticDropDown {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MANDKALY\\eclipse-workspace\\Maven Project Selenium\\Selenium1905\\src\\main\\java\\Resoucres\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 
		 String url="https://www.rahulshettyacademy.com/dropdownsPractise/"; 
		 
		 driver.get(url);
		 
		 driver.manage().window().maximize();
		 
		 WebElement StaticDropDown=driver.findElement(By.cssSelector("//*[id='ctl00_mainContent_DropDownListCurrency']"));
		 
		 Select dropdown=new Select(StaticDropDown);
		 dropdown.selectByIndex(3);
		 
		 WebElement selectedElement=dropdown.getFirstSelectedOption();
		 
		 System.out.println(selectedElement.getText());
		 dropdown.selectByVisibleText("AED");
		 
		 System.out.println(dropdown.getFirstSelectedOption().getText());
		 
		 dropdown.selectByValue("INR");
		 System.out.println(dropdown.getFirstSelectedOption().getText());
		 
		 driver.close();
		 
	}

}
