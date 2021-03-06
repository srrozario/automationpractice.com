package frameworkImplemention;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginLogoutPageObject {

//create class variable
private static WebElement locator = null;
   

	
	//login email address
	public static WebElement loginemail(WebDriver driver)
	{
		locator = driver.findElement(By.id("email"));
		return locator;
	}
	
	
	//login password field
	public static WebElement loginpassword(WebDriver driver)
	{
		locator = driver.findElement(By.id("passwd"));
		return locator;
	}	
	
	
	//login button
	public static WebElement loginbutton(WebDriver driver)
	{
		locator = driver.findElement(By.xpath("//span[normalize-space()='Sign in']"));
		return locator;
	}	
	
	
	//logout button
	public static WebElement logoutbutton(WebDriver driver)
	{
		locator = driver.findElement(By.xpath("//a[@title='Log me out']"));
		return locator;
	}	
}
