package src.Healthkit.com.tests;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import Utils.BrowserFactory;
import Utils.Initialise;
import pages.HealthKitPage;
import pages.PractitionerPage;

public class PractitionerPageTest {
	
	private String[] topLevelMenus = {"Patients", "Schedule", "Finances", "Contacts", "Profile"};
	private String[] patientOptions = {"Patient List", "Add Patient"};
	private String[] scheduleOptions = {"Calendar", "Appointment List"};
	private String[] financesOptions = {"Expenses", "Invoices", "Fees", "Reports"};
	private String[] contactsOptions = {"Organisations", "Specialists"};
	private String[] profileOptions = {"Personal", "Locations", "Settings", "Payments", "Reminders", "Users"};
	
	private String topLevelMenu;
	
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
	public void practionerPageTest(){
		HealthKitPage healthkitPage = new HealthKitPage(Initialise.driver);
		healthkitPage.clickLogin_Join();
		healthkitPage.enterUserName("g.kanizaj.clark@gmail.com");
		healthkitPage.enterPassword("1Ev0st0r!");
		PractitionerPage pp = healthkitPage.clickLoginButton();
		
		for(int i = 0;i < 19;i++){
			pp.selectMenuOption(getRandommenuOption(),getRandomDropdown());
		//	pp.rest(2000);
			pp.clickLogo();
		}
	}
	
	public String getRandommenuOption(){
		topLevelMenu = topLevelMenus[(int) (Math.random() * topLevelMenus.length)];
		return topLevelMenu;
	}
	
	public String getRandomDropdown(){
		
		String option = "";

		System.out.println(topLevelMenu + " TopLevelMenus");
		switch(topLevelMenu){
		
			case "Patients":
				option =  patientOptions[(int) (Math.random() * patientOptions.length)];
				System.out.println(option + " Option" + "\n");
				break;
			case "Schedule":
				option = scheduleOptions[(int) (Math.random() * scheduleOptions.length)];
				System.out.println(option + " Option" + "\n");
				break;
			case "Finances":
				option = financesOptions[(int) (Math.random() * financesOptions.length)];
				System.out.println(option + " Option" + "\n");
				break;
			case "Contacts":
				option = contactsOptions[(int) (Math.random() * contactsOptions.length)];
				System.out.println(option + " Option" + "\n");
				break;
			case "Profile":
				option = profileOptions[(int) (Math.random() * profileOptions.length)];
				System.out.println(option + " Option" + "\n");
				break;
			default:
				break;
		}
		return option;
		
	}
}
