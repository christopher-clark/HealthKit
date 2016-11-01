package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.JavascriptExecutor;

import pages.HomePage;
import pages.LoginPage;
import utils.BrowserFactory;

import java.util.List;

import org.junit.Test;

public class HomePageHeaderTest {

	private static final String BoW_Test = "http://lalitha.test.acem.org.au";

	@Test
	public void validLogin(){
		// This will launch Browser
		WebDriver driver = BrowserFactory.startBrowser("chrome", BoW_Test);
		// Create PageObject & call method
		LoginPage login_page = PageFactory.initElements(driver, LoginPage.class);
	//	JavascriptExecutor buttonJS = (JavascriptExecutor) driver;
	//	buttonJS.executeScript("arguments[0].style.border = '1px solid red'",login_page.getButton());
		login_page.signIn("chris.clark","");
		//assert(driver.getPageSource().contains("Hello Chris Clark"));

		HomePage homePage = PageFactory.initElements(driver, HomePage.class);
		List<WebElement> tabs = homePage.getHeaderMenu();
		
		for(WebElement el : tabs){
			JavascriptExecutor tabsJS = (JavascriptExecutor) driver;
			System.out.println("El = " + el.getText());
			tabsJS.executeScript("arguments[0].style.border = '1px solid red'",el);
			try{
				Thread.sleep(500);
			} catch(InterruptedException ie){
				ie.printStackTrace();
			}
		}
	}
	
//	public void checkHeaderNavigation(){
//		driver
//	}
}
