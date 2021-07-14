package frameworkImplemention;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RegistrationPageTestNG {

	
		//create class variable
	   	private static WebDriver driver = null;
	   
		//Before test function
	    @BeforeTest
	    public void setupFunction () 
	    
	    {
	    	WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
	    }
	    
	    
	    // test steps function
	    @Test(priority = 1)
	   	public void testStepsFunction1 () throws InterruptedException 
	    
	    {
	    
		//visiting the url
     	driver.get("http://automationpractice.com/index.php");
 		
     	//maximize browser window
     	driver.manage().window().maximize();
     			
     	//capture the current url
     	System.out.println("Current url of the web page is: "+driver.getCurrentUrl());
     			
     			
     	//capture page title
     	System.out.println("Page title of the url is : "+driver.getTitle());
 		 		
     	
 		//sign-in button click action
 		RegistrationPageObject.signinbutton(driver).click();
 		
 		//email address insertion action 
 		RegistrationPageObject.emailaddress(driver).sendKeys("xisyfyxy@boximail38.com");
 		
 		
 		//submit email address action
 		RegistrationPageObject.createaccount(driver).click();
 		
 		//pausing for 5 sec
 		Thread.sleep(5000);
	    }
 	
 		@Test(priority = 2)
 		public void testStepsFunction2() 
 		{
 		
 		//gender selection action
 		RegistrationPageObject.gender(driver).click();
 	 		
 		
 		//inserting customer first name action
 		RegistrationPageObject.firstname(driver).sendKeys("Sajib");
 		
 		
 		//inserting customer last name action
 		RegistrationPageObject.lastname(driver).sendKeys("Rozario");
 		
 		
 		//inserting account password action
 		RegistrationPageObject.password(driver).sendKeys("Sa@123");
 		
 		
 		//selecting date from drop down
 		Select dropdownbox1=new Select(RegistrationPageObject.day(driver));
 		dropdownbox1.selectByValue("15");
 		
 		
 		//selecting month from drop down
 		Select dropdownbox2=new Select(RegistrationPageObject.month(driver));
 		dropdownbox2.selectByValue("8");
 		
 		
 		//selecting year from drop down
 		Select dropdownbox3=new Select(RegistrationPageObject.year(driver));
 		dropdownbox3.selectByValue("1993");
 		
 		
 		//news letter option checking action action
 		RegistrationPageObject.newsletter(driver).click();
 		
 		
 		//special offer option checking action action
 		RegistrationPageObject.specialoffer(driver).click();
 		
 		
 		//inserting address first name action
 		RegistrationPageObject.adrsfirstname(driver).sendKeys("Sajib");
 		
 		
 		//inserting address last name action
 		RegistrationPageObject.adrslastname(driver).sendKeys("Rozario");
 		
 		
 		//inserting company name action
 		RegistrationPageObject.company(driver).sendKeys("SR IT Ltd");
 		
 		
 		//inserting address line 1 action
 		RegistrationPageObject.addressone(driver).sendKeys("South Corner");
 		
 		//inserting address line 2 action
 		RegistrationPageObject.addresstwo(driver).sendKeys("Street");
 		
 		//inserting city name action
 		RegistrationPageObject.city(driver).sendKeys("Boise");

 		
 		//selecting state from drop down
 		Select dropdownbox4=new Select(RegistrationPageObject.state(driver));
 		dropdownbox4.selectByValue("23");
 		
 		
 		//inserting post code action
 		RegistrationPageObject.postcode(driver).sendKeys("00000");
 		
 		 		
 		//inserting other info action
 		RegistrationPageObject.otherinfo(driver).sendKeys("Automation by Sajib");
 		
 		
 		//inserting phone number action
 		RegistrationPageObject.phone(driver).sendKeys("2025550123");
 		
 		
 		//inserting mobile number action
 		RegistrationPageObject.mobile(driver).sendKeys("423432664");
 		
 		
 		//inserting alias action
 		RegistrationPageObject.alias(driver).sendKeys("Automated by sajib");

 		
 		//clicking on the register button action 
 		RegistrationPageObject.register(driver).click();
 		
 		
 		}
 		
 		  @AfterTest
 	       public void tearDownFunction () 
 		    
 		    {
 		    	System.out.println("Please go to LoginPageTestNG class to view next part of this automation process");
 		    	
 		    }
	    }
