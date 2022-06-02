package TrainingSelenium.Selenium1905;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IplTable {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MANDKALY\\eclipse-workspace\\Maven Project Selenium\\Selenium1905\\src\\main\\java\\Resoucres\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
        
		
	    driver.get("https://www.google.com/search?q=ipl+2022+points+table&rlz=1C1UEAD_enIN1001IN1001&oq=ipl+2022+&aqs=chrome.9.69i57j0i131i433i512l2j0i131i433j0i131i433i512j0i433i512j0i131i433i512j0i131i433j0i131i433i512l2.15049j0j7&sourceid=chrome&ie=UTF-8");
	    
	    
	}

}
