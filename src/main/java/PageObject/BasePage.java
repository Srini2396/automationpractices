package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasePage {
	public static WebDriver driver;
	public String browser = "chrome";
	
public BasePage()
{
	System.setProperty("webdriver.chrome.driver", "F:\\Selenium_drivers\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("http://automationpractice.com/index.php");
	driver.manage().window().maximize();
}

public String getTITLE() {
	return driver.getTitle();
}	

}

