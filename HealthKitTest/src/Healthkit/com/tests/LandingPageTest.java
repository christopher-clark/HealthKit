package Healthkit.com.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import Utils.BrowserFactory;
import pages.HealthKitPage;

public class LandingPageTest {
	public static void main(String[] args){
	
		WebDriver driver = BrowserFactory.startBrowser("chrome");
		driver.navigate().to("https://www.healthkit.com/");
		HealthKitPage healthkitPage = PageFactory.initElements(driver, HealthKitPage.class);
		System.out.println(healthkitPage.getPageTitle());
		healthkitPage.clickLogin();
		rest();
		healthkitPage.clickJoin();
		healthkitPage.clickTitle(); 
		healthkitPage.showOptions();
	//	healthkitPage.enterFirstName("Chris");
	//	healthkitPage.enterSurName("Clark");
	//	healthkitPage.enterEmail1("g.kanizaj.clark@gmail.co");
	//	healthkitPage.enterEmail2("g.kanizaj.clark@gmail.co");
	//	healthkitPage.enterPassword1("passwd");
	//	healthkitPage.enterPassword2("passwd");
	
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
