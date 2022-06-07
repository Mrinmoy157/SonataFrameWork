package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * this class is used for entering email id in the application
 * @author mrinm
 *
 */
public class EnterEmailAddress {
	//declaration
	@FindBy(xpath="//input[@placeholder='Email address']")
	private WebElement emailAddress;
	
	@FindBy(xpath="//button[text()='Next']")
	private WebElement nextButton;
	
	//initialization
	public EnterEmailAddress(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	public WebElement getEmailAddress() {
		return emailAddress;
	}
	public WebElement getNextButton() {
		return nextButton;
	}
	
	//business logic
	/**
	 * this method is used to enter email id
	 * @param email
	 */
	public void selectEmailAddress(String email) {
		
		emailAddress.sendKeys(email);
		nextButton.click();
	}

}
