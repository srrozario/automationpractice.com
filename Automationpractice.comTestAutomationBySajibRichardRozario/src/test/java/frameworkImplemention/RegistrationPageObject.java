package frameworkImplemention;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class RegistrationPageObject {

	
   private static WebElement locator = null;
   

	
	//sign-in 
	public static WebElement signinbutton(WebDriver driver)
	{
		locator = driver.findElement(By.xpath("//a[contains(text(),'Sign in')]"));
		return locator;
	}
	
	
	//email address insertion function
	public static WebElement emailaddress(WebDriver driver)
	{
		locator = driver.findElement(By.id("email_create"));
		return locator;
	}
	
	
	//create an account 
	public static WebElement createaccount(WebDriver driver)
	{
		locator = driver.findElement(By.id("SubmitCreate"));
		return locator;
	}
	
	
	//gender selection
	public static WebElement gender(WebDriver driver)
	{
		locator = driver.findElement(By.id("id_gender1"));
		return locator;
	}
	
	
	//account first name
	public static WebElement firstname(WebDriver driver)
	{
		locator = driver.findElement(By.id("customer_firstname"));
		return locator;
	}
	
	
	//account last name
	public static WebElement lastname(WebDriver driver)
	{
		locator = driver.findElement(By.id("customer_lastname"));
		return locator;
	}
	
	
	//password
	public static WebElement password(WebDriver driver)
	{
		locator = driver.findElement(By.id("passwd"));
		return locator;
	}
	
	
	//day selection
	public static WebElement day(WebDriver driver)
	{
		locator = driver.findElement(By.id("days"));
		return locator;
	}
	
	
	//month selection
	public static WebElement month(WebDriver driver)
	{
		locator = driver.findElement(By.id("months"));
		return locator;
	}
	
	
	//year selection
	public static WebElement year(WebDriver driver)
	{
		locator = driver.findElement(By.id("years"));
		return locator;
	}
	
	
	//news letter
	public static WebElement newsletter(WebDriver driver)
	{
		locator = driver.findElement(By.id("newsletter"));
		return locator;
	}
	
	
	//special offer
	public static WebElement specialoffer(WebDriver driver)
	{
		locator = driver.findElement(By.id("uniform-optin"));
		return locator;
	}
	
	
	//address first name
	public static WebElement adrsfirstname(WebDriver driver)
	{
		locator = driver.findElement(By.id("firstname"));
		return locator;
	}
	
	
	//address last name
	public static WebElement adrslastname(WebDriver driver)
	{
		locator = driver.findElement(By.id("lastname"));
		return locator;
	}
	
	
	// company
	public static WebElement company(WebDriver driver)
	{
		locator = driver.findElement(By.id("company"));
		return locator;
	}
	
	
	//address line 1
	public static WebElement addressone(WebDriver driver)
	{	
	locator = driver.findElement(By.id("address1"));
	return locator;
	}
	
	
	//address line 2
	public static WebElement addresstwo(WebDriver driver)
	{
	locator = driver.findElement(By.id("address2"));
	return locator;
	}

	
	//city 
	public static WebElement city(WebDriver driver)
	{
	locator = driver.findElement(By.id("city"));
	return locator;
	}
	
	
	//state selection
	public static WebElement state(WebDriver driver)
	{
	locator = driver.findElement(By.id("id_state"));
	return locator;
	}
	
	
	//post code
	public static WebElement postcode(WebDriver driver)
	{
	locator = driver.findElement(By.id("postcode"));
	return locator;
	}
	
	
	//other info
	public static WebElement otherinfo(WebDriver driver)
	{
	locator = driver.findElement(By.id("other"));
	return locator;
	}
	
	
	//phone number
	public static WebElement phone(WebDriver driver)
	{
	locator = driver.findElement(By.id("phone"));
	return locator;
	}
	
	
	//mobile number
	public static WebElement mobile(WebDriver driver)
	{
	locator = driver.findElement(By.id("phone_mobile"));
	return locator;
	}
	
	
	//alias
	public static WebElement alias(WebDriver driver)
	{
	locator = driver.findElement(By.id("alias"));
	return locator;
	}
	
	
	//register button
	public static WebElement register(WebDriver driver)
	{
	locator = driver.findElement(By.xpath("//span[normalize-space()='Register']"));
	return locator;
	}
	
	
	}
