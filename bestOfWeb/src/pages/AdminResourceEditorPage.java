package pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class AdminResourceEditorPage extends HomePage{
	
	@FindBy(xpath="//*[@id='ctl00_body_plcLeft_lt_zL_AdminResourceEditor_internalReview_ddlResourceType']")
	WebElement resourceType;
	
	@FindBy(xpath="//*[@id='ctl00_body_plcLeft_lt_zL_AdminResourceEditor_internalReview_ddlResourceType']//option")
	List<WebElement> options;
			
	@FindBy(xpath="//*[@id='ctl00_body_plcLeft_lt_zL_AdminResourceEditor_internalReview_btnAddContent']")
	WebElement addResourceButton;
	
	public void showOptions(){
		for(WebElement el : options){
			System.out.println(el.getText());
		}
	}
	public void selectResourceType(String option){
		resourceType.click();
		new Select(resourceType).selectByVisibleText(option);
	}
	
	public void clickAddResourceButton(){
		addResourceButton.click();
	}
}
