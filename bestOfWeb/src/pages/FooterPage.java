package pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FooterPage {
	
		private WebDriver driver;
		
		public FooterPage(WebDriver driver){
			PageFactory.initElements(driver, FooterPage.class);
		}
		
		// Footer Elements
		@FindBy(xpath="//*[@id='footer-bar']")
		List<WebElement> footer;
}
