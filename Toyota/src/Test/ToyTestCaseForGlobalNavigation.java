/**
 * 
 */
package Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Pages.ToyGlobalNavigation;

/**
 * @author rakeshku
 *
 */
public class ToyTestCaseForGlobalNavigation {
	
	WebDriver driver;

	
    @BeforeTest

    public void setup(){

		//String exePath = "D:\\ChromeDriver\\chromedriver.exe";
		String exePath = "D:\\ChromeDriverLatest\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", exePath);
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.toyota.com/");
        driver.manage().window().maximize();

    }
    @AfterTest
    public void close() throws InterruptedException
    
    {
    	Thread.sleep(10000);
    	driver.quit();
    }
    
    //TOY-15055:DEPRECATED- Utility Navigation_Location feature_CookieZipcode_1024px_768px
    
    @Test (priority=1)	
    public void zipCodeFetaures_15055() throws InterruptedException
    {
    	ToyGlobalNavigation GN = new ToyGlobalNavigation(driver);
    	
    	GN.clickSetLocation();
    	
    	GN.setZipCode();
    	
    	GN.submitting();
    	
    	
    }
    
    @Test (priority=2)	
    public void verifyClickFunctionalityOfCertifiedUsedVehicles()
    {
    	ToyGlobalNavigation Gan = new ToyGlobalNavigation(driver);
    	Gan.clickOnCertifiedUsedVehicles();
    	
    }

}
