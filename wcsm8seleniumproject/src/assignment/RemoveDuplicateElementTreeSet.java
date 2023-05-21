package assignment;

import java.time.Duration;
import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class RemoveDuplicateElementTreeSet {

	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		    
	      WebDriver driver=new ChromeDriver();
	      driver.manage().window().maximize();
	      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	      
	      driver.get("file:///C:/Users/BABASO%20GANPATI%20KHOT/OneDrive/Desktop/html/Multi%20Select%20Dropdown.html");
	      
	      WebElement dropdown = driver.findElement(By.name("menu"));
	      
	      Select sel = new Select(dropdown);
	      
	      List<WebElement> allOptions = sel.getOptions();
	      
	      
	     // to eliminate the duplicate and maintain the order of insertion
	      
	      TreeSet<String> ts = new TreeSet<String>();
	      
	      // to 
	      

	}

}
