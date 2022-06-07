package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * this class specifies on which day you need to do the plumbing
 * @author mrinm
 *
 */
public class RequirePlumbing {
	
	//declaration
	@FindBy(xpath="//div[text()='On a specific date']/ancestor::div[@class='styles__itemContainerV2___3T5rr styles__itemContainerBase___2bhyD']/descendant::div[@class='styles__iconContainer___1sNdo']")
	private WebElement radioButton;
	
	@FindBy(xpath="//button[text()='Next']")
	private WebElement nextButton;
	
	//initialization
	public RequirePlumbing(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	public WebElement getRadioButton() {
		return radioButton;
	}
	public WebElement getNextButton() {
		return nextButton;
	}
	
	//business logic
	/**
	 * this method is used to select that particular time on which date you need your problem to be repaired
	 */
	public void selectRadioButton() {
		radioButton.click();
		nextButton.click();
	}

}
