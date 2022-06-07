package genericUtility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * this class contains annotations which are used again and again in test scripts
 * @author mrinm
 *
 */
public class BaseClass {
	public WebDriver driver;
	public FileUtility futil = new FileUtility();
	@BeforeClass
	public void loggingInBrowser() throws Throwable {
		String browser=futil.getPropertyKeyValue("browser");
		if(browser.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver= new ChromeDriver();
		}else if(browser.equals("firefox")) {
			WebDriverManager.firefoxdriver().setup();
		}
		else
		{
			throw new Exception("Browser is not compatible");
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
	}
	
	@BeforeMethod
	public void loggingIntoApplication() throws Throwable {
		String url=futil.getPropertyKeyValue("url");
		driver.get(url);
	}

}
