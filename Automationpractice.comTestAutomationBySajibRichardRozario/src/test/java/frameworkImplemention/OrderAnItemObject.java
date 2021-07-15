package frameworkImplemention;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class OrderAnItemObject {
	
		//create class variable
		private static WebElement locator = null;
	   

		
		//product category selection
		public static WebElement category(WebDriver driver)
		{
			locator = driver.findElement(By.linkText("T-SHIRTS"));
			return locator;
		}
		
		
		
		
		//product category selection
		public static WebElement sign(WebDriver driver)
		{
			locator = driver.findElement(By.xpath("//a[normalize-space()='Sign in']"));
			return locator;
		}
		
		//product selection
		public static WebElement product(WebDriver driver)
		{
			locator = driver.findElement(By.xpath("//span[normalize-space()='Add to cart']"));
			return locator;
		}
		
		//mouse hover action
		public static WebElement mousehover(WebDriver driver)
		{
			locator = driver.findElement(By.xpath("//li[@class='ajax_block_product col-xs-12 col-sm-6 col-md-4 first-in-line last-line first-item-of-tablet-line first-item-of-mobile-line last-mobile-line']"));
			return locator;
		}		
		
		
		//proceed to checkout to shopping cart summary
		public static WebElement shoppingcart(WebDriver driver)
		{
			locator = driver.findElement(By.xpath("//span[normalize-space()='Proceed to checkout']"));
			return locator;
		}
		
				
		//proceed to checkout to shopping cart summary
		public static WebElement billadrs(WebDriver driver)
		{
			locator = driver.findElement(By.xpath("//a[@class='button btn btn-default standard-checkout button-medium']//span[contains(text(),'Proceed to checkout')]"));
			return locator;
		}
		
		
		
		
		
		//comment box
		public static WebElement comment(WebDriver driver)
		{
			locator = driver.findElement(By.xpath("//textarea[@name='message']"));
			return locator;
		}		
		
		
		//proceed to checkout to shipping
		public static WebElement shipping(WebDriver driver)
		{
			locator = driver.findElement(By.xpath("//button[@name='processAddress']//span[contains(text(),'Proceed to checkout')]"));
			return locator;
		}			
		
		
		//tick on terms and condition
		public static WebElement tnc(WebDriver driver)
		{
			locator = driver.findElement(By.id("cgv"));
			return locator;
		}	
		
		
		//proceed to checkout to payment
		public static WebElement pop(WebDriver driver)
		{
			locator = driver.findElement(By.xpath("//button[@name='processCarrier']//span[contains(text(),'Proceed to checkout')]"));
			return locator;
		}	
		
		
		//Payment type selection
		public static WebElement payment(WebDriver driver)
		{
			locator = driver.findElement(By.xpath("//a[@title='Pay by bank wire']"));
			return locator;
		}	
		
		
		//Order confirmation
		public static WebElement orderconfirmation(WebDriver driver)
		{
			locator = driver.findElement(By.xpath("//span[normalize-space()='I confirm my order']"));
			return locator;
		}	

 }



