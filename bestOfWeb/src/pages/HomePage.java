package pages;

import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {
	
	// Header Elements
	@FindBy(xpath="//*[@id='acem-logo-container']")
	WebElement home;
	
	@FindBy(xpath="//*[@id='ctl00_lblUserName']")
	WebElement userName;
	
	@FindBy(xpath="//*[@id='ctl00_signOutButton_btnSignOutLink']")
	WebElement sign_out_link;
	
	@FindBy(linkText="Suggest a Resource")
	WebElement suggest_a_resource_link;
	
	@FindBy(xpath="//*[@id='tl00_txtTopSearch']")
	WebElement high_level_search;
	
	@FindBy(xpath="//*[@id='ctl00_ibTopSearch']")
	WebElement searchButton;
	
	// Navigation Links
	@FindBy(xpath="//*[@id='top-menu']//a")
	List<WebElement> header_menu;
	
	// Footer Elements
	@FindBy(xpath="//*[@id='footer-bar']")
	List<WebElement> footer;
	
	@FindBy(tagName="h1")
	WebElement title;
	
	public String getTitle(){
		return title.getText();
	}
	
	public void searchForResource(String criteria){
		high_level_search.sendKeys(criteria);
		searchButton.click();
	}
	
	public List<WebElement> getHeaderMenu(){
		return header_menu;
	}
	public void selectHeaderMenuOption(String option){
		for(WebElement el : header_menu){
			if(el.getText().equalsIgnoreCase(option)){
				System.out.println("Selecting - " + el.getText() );
				el.click();
				break;
			}
			
		}
	}
}
