package Utils;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BrowserFactory {
static WebDriver driver;
	
	public static WebDriver startBrowser(String browserName){
		
		switch(browserName){
			case "firefox" :
				System.setProperty("webdriver.gecko.driver", "C:\\Users\\Chris.Clark\\Browser Drivers\\Geckodriver.exe");
				driver = new FirefoxDriver();
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				driver.manage().window().maximize();
				return driver;
			case "chrome" :
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\Chris.Clark\\Browser Drivers\\chromedriver.exe");
				ChromeOptions options = new ChromeOptions();
				options.addArguments("test-type");
				options.addArguments("start-maximized");
				options.addArguments("--js-flags=--expose-gc");  
				options.addArguments("--enable-precise-memory-info"); 
				options.addArguments("--disable-popup-blocking");
				options.addArguments("--disable-default-apps");
				options.addArguments("test-type=browser");
				options.addArguments("disable-infobars");
				driver = new ChromeDriver(options);
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			//	driver.manage().window().maximize();
				return driver;
			case "IE" :
				System.setProperty("webdriver.ie.driver", "C:\\Users\\Chris.Clark\\Browser Drivers\\IEDriverServer.exe");
				WebDriver driverIE=new InternetExplorerDriver();
				driverIE.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				driverIE.manage().window().maximize();
				return driverIE;
			default :
				System.setProperty("webdriver.chrome.driver", "C:\\Chromedriver\\chromedriver.exe");
				driver = new ChromeDriver();
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				driver.manage().window().maximize();
				return driver;
		}
	}
}


