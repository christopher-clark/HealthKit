package pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import src.Healthkit.com.tests.Initialise;

public class PractitionerPage {
	
	
	public PractitionerPage(WebDriver driver){
		PageFactory.initElements(Initialise.driver, this);
	}
	
	@FindBy(id="form_name_title")
	WebElement title;
	
	@FindBy(id="form_name_forename")
	WebElement forename;
	
	@FindBy(id="form_name_surname")
	WebElement surname;
	
	@FindBy(id="form_passwordRaw_first")
	WebElement password;
	
	@FindBy(id="form_passwordRaw_second")
	WebElement confirm_password;
	
	@FindBy(id="form_profession")
	List<WebElement> professions;
	
	@FindBy(id="form_registration")
	WebElement registration;
	
	@FindBy(id="form_country")
	List<WebElement> countries;
	
	
	@FindBy(xpath="//input[@name='signup']")
	WebElement signUp;
	
	public String getForeName(){
		return forename.getAttribute("Value");
	}
	
	public String getsurName(){
		return surname.getAttribute("Value");
	}
	public String getTitle(){
		return title.getAttribute("Value");
	}
	
	public void clickSignUp(){
		password.sendKeys("Hello");
	}
}
