package pages;

import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ByTagName;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utils.Initialise;
import pages.HealthKitBasePage;

public class PractitionerPage extends HealthKitBasePage {

	public PractitionerPage(WebDriver driver){
		super();
		PageFactory.initElements(Initialise.driver, this);
	}
	
	@FindBy(id="form_name_title")
	WebElement title;
	
	@FindBy(id="form_name_forename")
	WebElement forename;
	
	@FindBy(id="form_name_surname")
	WebElement surname;
	
	@FindBy(id="form_passwordRaw_first")
	WebElement password1;
	
	@FindBy(id="form_passwordRaw_second")
	WebElement password2;
	
	
	@FindBy(id="form_passwordRaw_second")
	WebElement confirm_password;
	
	@FindBy(className="submit")
	WebElement submitButton;
	
	
	@FindBy(xpath="//*[@id='form_profession_chosen']//ul")
	List<WebElement> professions;
	
	@FindBy(id="form_registration")
	WebElement registration;
	
	@FindBy(xpath="//*[@id='form_country']//ul")
	List<WebElement> countries;
	
	
	@FindBy(xpath="//button[contains(.,'Sign up')]")
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
		signUp.click();
	}
	
	public void setPassword1(String pwd1){
		password1.sendKeys(pwd1);
	}
	
	public void setConfirmPassword(String pwd2){
		confirm_password.sendKeys(pwd2);
	}
	public void selectCountry(String option){
		for(WebElement element : countries){
			if(element.getText().equalsIgnoreCase(option)){
				element.click();
				break;
			}
		}
	}
}
