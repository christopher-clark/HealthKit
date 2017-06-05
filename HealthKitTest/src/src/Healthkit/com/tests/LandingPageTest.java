package src.Healthkit.com.tests;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import Utils.BrowserFactory;
import Utils.Initialise;
import pages.HealthKitPage;
import pages.PractitionerPage;

public class LandingPageTest {


	
	@Before
	public void init(){
		Initialise.driver = BrowserFactory.startBrowser("chrome");
		Initialise.driver.navigate().to("https://www.healthkit.com/");
	}
	
	@After
	public void exit(){
		Initialise.driver.close();
	}
		
	@Test
	public void join(){
		
		HealthKitPage healthkitPage = new HealthKitPage(Initialise.driver);
		healthkitPage.clickLogin_Join();
		healthkitPage.clickJoin();
		healthkitPage.createAccount("Miss", "Alice", "Walker", "aw@hotmail.co", "aw@hotmail.co", "secret", "secret", "Angola", "No");
	}

	public static void rest(long time){
		try {
			Thread.sleep(time);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Test
	public void signIn(){
		HealthKitPage healthkitPage = new HealthKitPage(Initialise.driver);
		healthkitPage.clickLogin_Join();
		healthkitPage.enterUserName("g.kanizaj.clark@gmail.com");
		healthkitPage.enterPassword("1Ev0st0r!");
		healthkitPage.clickLoginButton();
	}
	
	@Test
	public void practionerPageTest(){
		HealthKitPage healthkitPage = new HealthKitPage(Initialise.driver);
		healthkitPage.clickLogin_Join();
		healthkitPage.enterUserName("g.kanizaj.clark@gmail.com");
		healthkitPage.enterPassword("1Ev0st0r!");
		PractitionerPage pp = healthkitPage.clickLoginButton();
		//pp.listMenu();
		pp.selectMenuOption("finances", "Fees");
		pp.rest(2000);
		pp.clickLogo();
	}
}

