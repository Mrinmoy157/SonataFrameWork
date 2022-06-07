package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * this class contains a particular date which you selected for plumbing
 * @author mrinm
 *
 */
public class SelectDate {
	
	//declaration
	@FindBy(xpath="//button[@aria-label='Thursday, June 23, 2022']")
	private WebElement selectTime;
	
	@FindBy(xpath="//button[text()='Next']")
	private WebElement nextButton;
	
	//initialization
	public SelectDate(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	public WebElement getSelectTime() {
		return selectTime;
	}
	public WebElement getNextButton() {
		return nextButton;
	}
	
	
	//business logic
	/**
	 * this method is used to select a particular date for plumbing
	 */
	public void selectParticularDate() {
		selectTime.click();
		nextButton.click();
	}

}
