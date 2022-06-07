package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * this class is used to select a particular problem which plumber can fix
 * @author mrinm
 *
 */
public class ProblemPage {
	
	//declaration
	@FindBy(xpath="//div[text()='Toilet']/ancestor::label[@class='styles__itemV2___1Vo1Z styles__itemBase___rDyIf']/descendant::div[@class='styles__checkBox___33Oig styles__checkboxBase___1XXzt']")
	private WebElement selectProblem;
	
	@FindBy(xpath="//button[text()='Next']")
	private WebElement nextButton;
	
	//initialization
	public ProblemPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	public WebElement getSelectProblem() {
		return selectProblem;
	}
	public WebElement getNextButton() {
		return nextButton;
	}
	
	//business logic
	/**
	 * this method is used to select that problem which is occurred and can be fixed by plumber
	 */
	public void selectProblemNeeded() {
		selectProblem.click();
		nextButton.click();
	}

}
