package frameworkImplemention;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ViewOrderObejct {
	
	//create class variable
	private static WebElement locator = null;
		   

			
	//product category selection
	public static WebElement orderhistory(WebDriver driver)
	{
		locator = driver.findElement(By.xpath("//span[normalize-space()='Order history and details']"));
		return locator;
	}
	
	
}
