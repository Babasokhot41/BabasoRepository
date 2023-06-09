package selectclass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectByIndexMethod {
	public static void main(String[] args) throws InterruptedException {
		  System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		    
	      WebDriver driver=new ChromeDriver();
	      driver.manage().window().maximize();
	      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	      
	      driver.get("file:///C:/Users/BABASO%20GANPATI%20KHOT/OneDrive/Desktop/html/Single%20Select%20Dropdown.html");
          WebElement dropdown = driver.findElement(By.name("menu"));
	      Select sel = new Select(dropdown);
	      Thread.sleep(3000);
	      sel.selectByIndex(4);
	      
	}

}
