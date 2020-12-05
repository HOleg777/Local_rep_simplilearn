package locateElements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class LaunchBrowser {
	static WebDriver driver = null;
	public static void main(String[] args) {
		String browser = "chrome";		
		if(browser.equals("chrome"))
		{
			//Launching chrome browser
			//86 Chrome Browser  - Chrome Driver version 86.0.4240.22
			System.setProperty("webdriver.chrome.driver","./resources/chromedriver");
			driver = new ChromeDriver();
		}
		else if(browser.equals("firefox"))
		{
			//Firefox browser version - 82.0.2 (64-bit) Geckodriver Version - 0.28.0
			System.setProperty("webdriver.gecko.driver","./resources/geckodriver");
			driver = new FirefoxDriver();
		}
		else if(browser.equals("ie"))
		{
			System.setProperty("webdriver.ie.driver","./resources/IEDriverServer");
			driver = new InternetExplorerDriver();
			//zoom level must be set to 100%
			//protected mode for all the zones must be set to either all enabled or all disabled
		}
		driver.get("https://www.google.com/");
	}
}