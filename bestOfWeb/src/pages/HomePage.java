package pages;

import java.util.List;

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
	
	public void searchForResource(String criteria){
		high_level_search.sendKeys(criteria);
		searchButton.click();
	}
	
	public List<WebElement> getHeaderMenu(){
		return header_menu;
	}
	public void highlightTabs(){
		for(WebElement el : header_menu){
			
		}
	}
	
}
