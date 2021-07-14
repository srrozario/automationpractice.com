package frameworkImplemention;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ViewOrderTestNG {
	
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
	public void testStepsFunction () throws IOException 
	    
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
	
	
	//clicking on the order history
	ViewOrderObejct.orderhistory(driver).click();
	
	
	File scrnshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(scrnshot, new File(".//screenshot/order_history.png"));
	
	}
	
		
	@AfterTest
	public void tearDownFunction () 
		    
	{
	System.out.println("Full workflow has been completed");
		    	
	//quit the browser
	driver.quit();
	
	}
		
	}


