package test;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import pages.HomePage;
import pages.LoginPage;
import pages.AdminResourceEditorPage;
import pages.AdminPage;
import pages.AdminResourceEditorPage;
import utils.BrowserFactory;

public class AddResourceTest {
	
	private static final String BoW_Test = "http://lalitha.test.acem.org.au";
	
	@Test
	public void addResource(){
		// This will launch Browser
		WebDriver driver = BrowserFactory.startBrowser("chrome", BoW_Test);
		// Create PageObject & call method
		LoginPage login_page = PageFactory.initElements(driver, LoginPage.class);
		login_page.signIn("chris.clark","");
		System.out.println("Page Title = " + login_page.getTitle());
		HomePage homePage = PageFactory.initElements(driver, HomePage.class);
		System.out.println("Page Title = " + login_page.getTitle());
		
		homePage.selectHeaderMenuOption("Admin");
		System.out.println("Page Title = " + homePage.getTitle());
		
		AdminPage adminPage = PageFactory.initElements(driver, AdminPage.class);
		adminPage.addResource();
		AdminResourceEditorPage adminResourceEditorPage = PageFactory.initElements(driver, AdminResourceEditorPage.class);
		System.out.println("Page Title = " + adminResourceEditorPage.getTitle());
		adminResourceEditorPage.showOptions();
	//	adminResourceEditorPage.selectResourceType("Best of Web EM");
		adminResourceEditorPage.selectResourceType("Other");
		try{
			Thread.sleep(200);
		} catch(InterruptedException ie){
			ie.printStackTrace();
		}
		adminResourceEditorPage.clickAddResourceButton();
		
		try{
			Thread.sleep(2000);
		} catch(InterruptedException ie){
			ie.printStackTrace();
		}
		//driver.close();
	}
}
