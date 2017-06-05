package pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import Utils.Initialise;

public class HealthKitPage {
	
	public HealthKitPage(WebDriver driver){
		PageFactory.initElements(Initialise.driver, this);
	}
	// Selectors
	@FindBy(tagName="h1")
	WebElement pageTitle;
	
	
	@FindBy(linkText="login/sign up")
	WebElement login_SignUp;
	
	@FindBy(linkText="Join now")
	WebElement join;
	
	@FindBy(linkText="find the right practitioner")
	WebElement findPractitioner;
	
	@FindBy(linkText="practice management software")
	WebElement practiceManagement;
	
	
	@FindBy(xpath="//*[@id='loginForm']//input[1]")
	WebElement loginEmail;
	
	@FindBy(xpath="//*[@id='loginForm']//input[2]")
	WebElement loginPassword;
	
	
	@FindBy(xpath="//input[@value='Login']")
	WebElement loginButton;
		
	@FindBy(id="form_title_chzn")
	WebElement formOfAddress;
	
	@FindBy(id="form_country_chzn")
	WebElement country;
	
	@FindBy(id="form_title")
	List<WebElement> salutation;
	
	@FindBy(xpath="//*[@id='form_title_chzn']//li")
	List<WebElement> dropDowns;
	
	@FindBy(xpath="//*[@id='form_title']")
	WebElement options;
	

	@FindBy(xpath="//*[@id='form_country_chzn']//li")
	List<WebElement> countries;

	@FindBy(id="form_forename")
	WebElement foreName;
		
	@FindBy(id="form_surname")
	WebElement surName;
	
	@FindBy(id="form_email_first")
	WebElement email1;

	@FindBy(id="form_email_second")
	WebElement email2;
	
	@FindBy(id="form_password_first")
	WebElement password1;
	
	@FindBy(id="form_password_second")
	WebElement password2;
	
	@FindBy(id="form_user_type_practitioner")
	WebElement practitioner;
		
	@FindBy(id="form_user_type_patient")
	WebElement patient;
	
	// Profession dropdown - only displayed if doctor/practitioner is checked
	@FindBy(id="form_profession_chzn")
	WebElement profession;
	
	@FindBy(xpath="//*[@id='form_profession_chzn']//li")
	List<WebElement> professions;
	
	@FindBy(xpath="//input[@name='form[passwordRaw][first]']")
	WebElement passwordOne;
	
			
	@FindBy(xpath="//input[@value='Create Account']")
	WebElement createAccount;
	
	public String getPageTitle(){
		return pageTitle.getText();
	}

	public void enterUserName(String userName){
		hilight(loginEmail);
		loginEmail.sendKeys(userName);
	}
	
	public void enterPassword(String passwd){
		hilight(loginPassword);
		loginPassword.sendKeys(passwd);
	}
	
	public void enterFirstName(String name){
		foreName.sendKeys(name);
	}
	
	public void enterSurName(String name){
		surName.sendKeys(name);
	}
	
	public void enterEmail1(String name){
		email1.sendKeys(name);
	}
	
	public void enterEmail2(String name){
		email2.sendKeys(name);
	}
	
	public void enterPassword1(String passwd){
		password1.sendKeys(passwd);
	}

	
	public void enterPassword2(String passwd){
		password2.sendKeys(passwd);
	}
	public void clickLogin_Join(){
		login_SignUp.click();
	}
			
	public PractitionerPage clickLoginButton(){
		hilight(loginButton);
		loginButton.click();
		return new PractitionerPage(Initialise.driver);
		
	}
	
	public void clickJoin(){
		join.click();
	}
	
	public void clickTitle(){
		formOfAddress.click();
	}
	
	public void clickCountry(){
		country.click();
	}
	public void clickProfession(){
		profession.click();
	}
	
	public void clickCreateAccount(){
		createAccount.click();
	}
	
	public void selectTitle(String option){
		
		for(WebElement element : dropDowns){
			if(element.getText().equalsIgnoreCase(option)){
				element.click();
				break;
			}
		}
	}
	
	public void selectCountry(String option){
		
		for(WebElement element : countries){
			if(element.getText().equalsIgnoreCase(option)){
				element.click();
				break;
			}
		}
	}
	
	public void selectProfession(String prof){
		
		for(WebElement el : professions){
			if(el.getText().equalsIgnoreCase(prof)){
				el.click();
				break;
			}
		}
	}
	public void practitionerSearch(){
		findPractitioner.click();
	}
	
	public void findSoftware(){
		practiceManagement.click();
	}
	
	public static void rest(){
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void doctor_practitioner(String Yes_No){
		
		if(Yes_No.equalsIgnoreCase("Yes")){
			practitioner.click();
		}
		if(Yes_No.equalsIgnoreCase("No")){
			patient.click();
		}
	}
	
	public void createAccount(String title, String foreName, String surname, String em1, String em2,
			String pass1, String pass2, String country, String doc_patient){
		clickTitle();
		selectTitle(title);
		enterFirstName(foreName);
		enterSurName(surname);
		enterEmail1(em1);
		enterEmail2(em2);
		enterPassword1(pass1);
		enterPassword2(pass2);
		clickCountry();
		selectCountry(country);
		doctor_practitioner(doc_patient);
		clickCreateAccount();
	}
		
		
	public void hilight(WebElement element){
		JavascriptExecutor elJS = (JavascriptExecutor) Initialise.driver;
		elJS.executeScript("arguments[0].style.border = '1px solid red'",element);
	}
}