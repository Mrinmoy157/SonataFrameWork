package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * this class is used for clicking on skip button
 * @author mrinm
 *
 */
public class PlumberNeedsToKnow {
	
	//declaration
	@FindBy(xpath="//button[text()='Skip']")
	private WebElement skipButton;
	
	//initialization
	public PlumberNeedsToKnow(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	public WebElement getSkipButton() {
		return skipButton;
	}
	
	//business logic
	/**
	 * this method is used to skip the page and move on to next page
	 */
	public void writeDescription() {
		skipButton.click();
	}

}
