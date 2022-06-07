package genericUtility;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

/**
 * this class contains webdriver methods which are being used in test scripts
 * @author mrinm
 *
 */
public class WebDriverUtility {
	
	/**
	 * this method is used to select dropdown based on the values
	 * @param element
	 * @param text
	 */
	public void select(WebElement element,String text) {
		Select s=new Select(element);
		s.selectByVisibleText(text);
	}

}
