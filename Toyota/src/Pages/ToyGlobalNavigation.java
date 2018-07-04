/**
 * 
 */
package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * @author rakeshku
 *
 * This class will store all the locators and Method of Global Navigation page. 
 *
 */
public class ToyGlobalNavigation {
	
	WebDriver driver;
	
	By clickOnSetLocation = By.xpath("//span[text()='Set Location']");
	By enterZipCode = By.xpath("//input[@type ='tel']");
	By clickOnSubmit = By.xpath("//a[@class='tcom-submit active']");
	
	
	By CertifiedUsedVehiclesClick=By.xpath("//span[text()='Certified Used Vehicles']");
	By OwnersClick=By.xpath("//span[text()='Owners']");
	By EspanolClick= By.xpath("//span[text()='Español']");
	By SearchClick=By.xpath("//span[text()='Search']");
	
	
	
	public ToyGlobalNavigation(WebDriver driver)
	{
		this.driver=driver;
	}
	
	
	public void clickSetLocation()
	{
		driver.findElement(clickOnSetLocation).click();
	}
	public void setZipCode() throws InterruptedException
	{
	
		Thread.sleep(10000);
		driver.findElement(enterZipCode).sendKeys("12345");
		
	}
	
	public void submitting() throws InterruptedException
	{
		Thread.sleep(10000);
		driver.findElement(clickOnSubmit).click();
	}
	
	public void clickOnCertifiedUsedVehicles()
	{
		driver.findElement(CertifiedUsedVehiclesClick).click();
	}

}
