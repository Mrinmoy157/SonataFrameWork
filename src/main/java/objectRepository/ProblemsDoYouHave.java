package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * this class contains the problems which you have and should be fixed by the plumber
 * @author mrinm
 *
 */
public class ProblemsDoYouHave {
	
	//declaration
	@FindBy(xpath="//div[text()='Leak in a pipe']/ancestor::div[@class='styles__itemContainerV2___3T5rr styles__itemContainerBase___2bhyD']/descendant::div[@class='styles__checkBox___33Oig styles__checkboxBase___1XXzt']")
	private WebElement checkBox;
	
	@FindBy(xpath="//button[text()='Next']")
	private WebElement nextButton;
	
	//initialization
	public ProblemsDoYouHave(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	public WebElement getCheckBox() {
		return checkBox;
	}
	public WebElement getNextButton() {
		return nextButton;
	}
	
	//business logic
	/**
	 * this method is used to select that particular problem which you have
	 */
	public void selectProblemsYouHave() {
		checkBox.click();
		nextButton.click();
	}
}
