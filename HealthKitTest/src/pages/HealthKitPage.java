package pages;

import java.util.ArrayList;
import java.util.List;

import javax.xml.xpath.XPath;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class HealthKitPage {
	
	@FindBy(tagName="h1")
	WebElement pageTitle;
	
	@FindBy(linkText="login/sign up")
	WebElement login;
	
	@FindBy(linkText="Join now")
	WebElement join;
	
	@FindBy(linkText="find the right practitioner")
	WebElement findPractitioner;
	
	@FindBy(linkText="practice management software")
	WebElement practiceManagement;
	
	@FindBy(id="form_title_chzn")
	WebElement title;
	
	@FindBy(xpath="//*[@id='form_title']")
	WebElement salutation;
	
	@FindBy(xpath="//*[@id='form_title']")
	WebElement options;
	
	@FindBy(xpath="//*[@id='form_title']/option")
	List<WebElement> dropDowns;

	@FindBy(xpath="//*[@id='form_forename']")
	WebElement foreName;
		
	@FindBy(xpath="//*[@id='form_surname']")
	WebElement surName;
	
	@FindBy(xpath="//*[@id='form_email_first']")
	WebElement email1;
	
	@FindBy(xpath="//*[@id='form_email_second']")
	WebElement email2;
	
	@FindBy(xpath="//*[@id='form_password_first']")
	WebElement password1;
	
	@FindBy(xpath="//*[@id='form_password_second']")
	WebElement password2;
	
	public String getPageTitle(){
		return pageTitle.getText();
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
	
	public void clickLogin(){
		login.click();
	}
		
	public void clickJoin(){
		join.click();
	}
	public void clickTitle(){
		title.click();
	}
	
	public void showOptions(){
			for(WebElement el : dropDowns){
			System.out.println("Drop is : " + el.getText());
		}
	}
	
	public void practitionerSearch(){
		findPractitioner.click();
	}
	
	public void findSoftware(){
		practiceManagement.click();
	}

}
