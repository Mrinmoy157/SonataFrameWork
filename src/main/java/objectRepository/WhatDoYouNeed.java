package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * this class is used to choose an option of what you should be doing with your current problem
 * @author mrinm
 *
 */
public class WhatDoYouNeed {
	
	//declaration
	@FindBy(xpath="//div[text()='Replace']/ancestor::label[@class='styles__itemV2___1Vo1Z styles__itemBase___rDyIf']/descendant::div[@class='styles__checkBox___33Oig styles__checkboxBase___1XXzt']")
	private WebElement checkBox;
	
	@FindBy(xpath="//button[text()='Next']")
	private WebElement nextButton;
	
	//initialization
	public WhatDoYouNeed(WebDriver driver) {
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
	 * this method is used to select what you need to do for the problem which is occurred
	 */
	public void selectWhatDoYouNeed() {
		checkBox.click();
		nextButton.click();
	}

}
