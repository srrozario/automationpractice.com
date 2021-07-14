package frameworkImplemention;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginPageTestNG {
	

	//create class variable
	private static WebDriver driver = null;
	
	
	//Before test function
	@BeforeTest
	public void setupFunction()
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}
	
	
	//test step function
	@Test
	public void testStepsFunction () 
    
    {
    	//visiting the login url
    	driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
		
    	
    	//maximize browser window
     	driver.manage().window().maximize();
     			
     	//capture the current url
     	System.out.println("Current url of the web page is: "+driver.getCurrentUrl());
     			
     			
     	//capture page title
     	System.out.println("Page title of the url is : "+driver.getTitle());
    	
    	
    	//inserting login email address action
		LoginPageObject.loginemail(driver).sendKeys("xisyfyxy@boximail38.com");
		
		
		//inserting login password action
		LoginPageObject.loginpassword(driver).sendKeys("Sa@123");
	
	    
		//clicking on login button action
		LoginPageObject.loginbutton(driver).click();
	
}
	
	@AfterTest
     public void tearDownFunction () 
	    
	    {
	    	System.out.println("Please go to AddToCartItemsTestNG class to view next part of this automation process");
	    	
	    	//quit the browser
	    	driver.quit();
	    }
	
}