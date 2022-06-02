package TrainingSelenium.Selenium1905;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CriBuzztable {

	public static void main(String[] args) {
	 
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MANDKALY\\eclipse-workspace\\Maven Project Selenium\\Selenium1905\\src\\main\\java\\Resoucres\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
        driver.get("https://www.cricbuzz.com/cricket-series/3472/indian-premier-league-2021/points-table");
     
        WebElement table=driver.findElement(By.xpath("//table[@class='table cb-srs-pnts']"));
        List<WebElement> rows=driver.findElements(By.xpath("//table[@class='table cb-srs-pnts']//tbody/tr"));
        
        for(int i=1;i<rows.size();i=i+2) {
        	String teamName=driver.findElement(By.xpath("//table[@class='table cb-srs-pnts']//tbody/tr["+i+"]/td[1]/a")).getText();
        	System.out.println("Team name is"+teamName);
        	
        }
	}

}
