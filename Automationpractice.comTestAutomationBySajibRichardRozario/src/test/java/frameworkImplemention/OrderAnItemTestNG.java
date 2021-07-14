package frameworkImplemention;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
//import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OrderAnItemTestNG {

	
	//create class variable
	private static WebDriver driver = null;
		
		
	//Before test function
	@BeforeTest
	public void setupFunction()
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}
		
	//test steps function first priority 
	@Test(priority = 1)
   	public void testStepsFunction1 () 
    
    {
	    //visiting the login url
	    driver.get("http://automationpractice.com/index.php");
			
	    	
	    //maximize browser window
	    driver.manage().window().maximize();
	     			
	    //capture the current url
	    System.out.println("Current url of the web page is: "+driver.getCurrentUrl());
	     			
	     			
	    //capture page title
	    System.out.println("Page title of the url is : "+driver.getTitle());
	    	
	    	    		
	}	
	
	//test steps function second priority 
	@Test(priority = 2)
   	public void testStepsFunction2 () throws InterruptedException, IOException 
    
    {
		
		
		//clicking on the t-shirt category product
	    OrderAnItemObject.category(driver).click();
	    
	    
	    WebElement hover = OrderAnItemObject.mousehover(driver);

	    //Creating object 
	    Actions action = new Actions(driver);

	    
	    //performing the mouse hover action on the target element.
	    action.moveToElement(hover).perform();
	    
	    //clicking on the add to cart button
	    OrderAnItemObject.product(driver).click();
	    
	    //pausing for 3 sec
	    Thread.sleep(3000);
	    
	    
	    //creating object
	    WebElement button=OrderAnItemObject.shoppingcart(driver);
	    
	    //using java script executor to perform click action
	    JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", button);
	   
		//pausing for 3 sec
	    Thread.sleep(3000);
	    
	    	  
	    //proceed to next page
	    OrderAnItemObject.billadrs(driver).click();
	    
	    //pausing for 3 sec
	    Thread.sleep(3000);
	    
	    
	    //inserting login email address action
	    LoginPageObject.loginemail(driver).sendKeys("xisyfyxy@boximail38.com");
	  		
	  		
	    //inserting login password action
	    LoginPageObject.loginpassword(driver).sendKeys("Sa@123");
	  	
	  	    
	    //clicking on login button action
	    LoginPageObject.loginbutton(driver).click();
	    
	    
	    //add a comment
	    OrderAnItemObject.comment(driver).sendKeys("My test order");
	    
	    
	    //clicking on the proceed to shipping button
	    OrderAnItemObject.shipping(driver).click();
	    
	    
	    //accepting terms and conditions
	    OrderAnItemObject.tnc(driver).click();
	    
	    
	    //clicking on the payment proceed button
	    OrderAnItemObject.pop(driver).click();
	    
	    
	    //selecting payment type
	    OrderAnItemObject.payment(driver).click();
	    
	    //confirming order
	    OrderAnItemObject.orderconfirmation(driver).click();   
	    
	    //capturing screenshot
	    File scrnshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scrnshot, new File(".//screenshot/order_complete.png"));
	    
		//pausing for 3 sec
	    Thread.sleep(3000);
	}	
	
	
	
	@AfterTest
     public void tearDownFunction () 
	    
	    {
		System.out.println("Please go to ViewOrderTestNG class to view next part of this automation process");
		
		//quit the browser
		driver.quit();
	    }
	
	
}

