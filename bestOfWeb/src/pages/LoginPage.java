package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {

	
	@FindBy(xpath="//*[@id='ctl00_body_plcLeft_lt_zR_LogInForm_loginElem_UserName']")
	WebElement userName;
	
	@FindBy(xpath="//*[@id='ctl00_body_plcLeft_lt_zR_LogInForm_loginElem_Password']")
	WebElement passwd;
	
	@FindBy(xpath="//*[@id='btnLinkLogon']")
	WebElement loginButton;
	
	@FindBy(linkText="Forgotten password?")
	WebElement forgotten_password_link;
	
	public void signIn(String username, String password){
		userName.sendKeys(username);
		passwd.sendKeys(password);
		loginButton.click();
	}
	public WebElement getButton(){
		return loginButton;
	}
}
