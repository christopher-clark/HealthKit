package test;


import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import pages.LoginPage;
import utils.BrowserFactory;

public class LoginTest {

	private static final String BoW_Test = "http://resources.dev.acem.org.au";
	
	@Test
	public void validLogin(){
		// This will launch Browser
		System.out.println("just before Browser Factory");
		WebDriver driver = BrowserFactory.startBrowser("chrome", BoW_Test);
		System.out.println("just before  creating login Page");
		// Create PageObject & call method
		LoginPage login_page = PageFactory.initElements(driver, LoginPage.class);
		System.out.println("just  after  creating login Page");
	//	JavascriptExecutor buttonJS = (JavascriptExecutor) driver;
	//	buttonJS.executeScript("arguments[0].style.border = '1px solid red'",login_page.getButton());
		login_page.signIn("chris.clark","");
		//assert(driver.getPageSource().contains("Hello Chris Clark"));
		driver.close();
		
	}
	@Test
	public void inValidLogin(){
		// This will launch Browser
		WebDriver driver = BrowserFactory.startBrowser("chrome", BoW_Test);
		// Create PageObject & call method
		LoginPage login_page = PageFactory.initElements(driver, LoginPage.class);
		login_page.signIn("chris.clark","dummy");
		assert(driver.getPageSource().contains("Your login attempt was not successful"));
		driver.close();
	}
}
