package MyDemo_01.MyDemo_01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class MyDemo123 {
	public static WebDriver getDriver(String browser) {
		if (browser.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Driver\\Chrome Driver\\chromedriver.exe");
			return new ChromeDriver();
		}
		else if(browser.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", "C:\\Driver\\Chrome Driver\\geckodriver.exe");
			return new FirefoxDriver();
		}
		else if(browser.equals("ie")) {
			System.setProperty("webdriver.ie.driver", "C:\\Driver\\Chrome Driver\\IEDriverServer.exe");
			return new InternetExplorerDriver();
		}
		else {
		return null;
		
		}

	}
}
