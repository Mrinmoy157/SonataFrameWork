package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericUtility.WebDriverUtility;

/**
 * this class contains the time on which plumber should be available for fixing the problem
 * @author mrinm
 *
 */
public class TimeOfPlumber extends WebDriverUtility{
	
	//declaration
	@FindBy(xpath="//select[@class='select__selectBoxInput____HQJD select__select']")
	private WebElement selectDropdown;
	
	@FindBy(xpath="//button[text()='Next']")
	private WebElement nextButton;
	
	//initialization
	public TimeOfPlumber(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	public WebElement getSelectDropdown() {
		return selectDropdown;
	}
	public WebElement getNextButton() {
		return nextButton;
	}
	
	
	//business logic
	/**
	 * this method is used to select a particular time for fixing the problem
	 * @param dropdownValue
	 */
	public void selectParticularTime(String dropdownValue) {
		
		select(selectDropdown,dropdownValue);
		nextButton.click();
	}
}
