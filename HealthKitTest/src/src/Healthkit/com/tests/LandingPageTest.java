package src.Healthkit.com.tests;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import Utils.BrowserFactory;
import pages.HealthKitPage;
import pages.PractitionerPage;

public class LandingPageTest {

	
	@Before
	public void beforeTest(){
		System.out.println("Executed before each Test");
		Initialise.driver = BrowserFactory.startBrowser("chrome");
	}
	
	@Test
	public void createAccount(){
		Initialise.driver.navigate().to("https://www.healthkit.com/");
		//WebDriver driver = BrowserFactory.startBrowser("chrome");
		//driver.navigate().to("https://www.healthkit.com/");
		//HealthKitPage healthkitPage = PageFactory.initElements(driver, HealthKitPage.class);
		HealthKitPage healthkitPage = new HealthKitPage(Initialise.driver);
		healthkitPage.clickLogin();
		rest();
		healthkitPage.clickJoin();
		healthkitPage.clickTitle(); 
		healthkitPage.selectTitle("miss");
		healthkitPage.enterFirstName("Chris");
		healthkitPage.enterSurName("Clark");
		healthkitPage.enterEmail1("g.kanizaj.clark@gmail.co");
		healthkitPage.enterEmail2("g.kanizaj.clark@gmail.co");
	//	healthkitPage.enterPassword1("passwd");
	//	healthkitPage.enterPassword2("passwd");
		healthkitPage.clickCountry(); 
		healthkitPage.selectCountry("anGolA");
		healthkitPage.doctor_practitioner("yes");
		healthkitPage.clickProfession();
		healthkitPage.selectProfession("GP (General Practitioner)");
	//	healthkitPage.moveToPassword1();
		PractitionerPage pp = healthkitPage.clickCreateAccount();
		pp.clickSignUp();
		System.out.println("Name is : " + pp.getTitle() + " " + pp.getForeName() + " " + pp.getsurName());
	/*	healthkitPage.practitionerSearch();
		rest();
		healthkitPage.findSoftware();
		//driver.close(); */
	}

	public static void rest(){
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}

