package pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AdminPage extends HomePage {
	
	// WebElements
	
	@FindBy(xpath="//*[@id='ctl00_body_plcLeft_lt_zL_AdminResourceList_btnCreateResource']")
	WebElement addResourceButton;

	@FindBy(xpath="*//[id='ctl00_body_plcLeft_lt_zL_AdminResourceList_adminTabs']//li")
	List<WebElement> adminTabs;
	
	@FindBy(xpath="//*[id='ctl00_body_plcLeft_lt_zL_AdminResourceList_adminTabs']")
	WebElement exportToExcel;
	
	@FindBy(tagName="h1")
	WebElement title;
	
	public void addResource(){
		addResourceButton.click();
	}
	
	public void export(){
		exportToExcel.click();
	}
	
}
