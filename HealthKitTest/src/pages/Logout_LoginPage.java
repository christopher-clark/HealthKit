package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utils.Initialise;

public class Logout_LoginPage {

	public Logout_LoginPage() {
		PageFactory.initElements(Initialise.driver, this);
	}
	
	// Selectors
	@FindBy(id="form_email")
	WebElement email;
	
	@FindBy(id="form_password")
	WebElement password;
	
	@FindBy(xpath=("//button[contains(.,'Login')]"))
	WebElement loginButton;
	
	@FindBy(linkText="Forgot your password?")
	WebElement resetPassword;
	
	@FindBy(linkText="Create a new account")
	WebElement newAccount;
	
	public void clickLogin(){
		loginButton.click();
	}
	
	public void clickPasswordRest(){
		resetPassword.click();
	}
	
	public void createAccount(){
		newAccount.click();
	}
	
	public void setEmail(String userId){
		email.sendKeys(userId);
	}
	public void setPassword(String passwd){
		password.sendKeys(passwd);
	}
}
