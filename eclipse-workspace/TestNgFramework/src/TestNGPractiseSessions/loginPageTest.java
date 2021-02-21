package TestNGPractiseSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class loginPageTest {
	//Pre-Conditions @Before
	@BeforeSuite
	public void setUpMethod() {
		System.out.println("Setup System Properties---->@BeforeSuite");
		System.setProperty("webdriver.chrome.driver", "D://chromedriver_win32//chromedriver.exe");
	}
	 @BeforeTest
	   public void loginMethod() {
	  	 System.out.println("Launching Chrome Browse------>@BeforeTest");
	  	WebDriver driver = new ChromeDriver();
	  	driver.get("https://ui.freecrm.com/");
	  	 }
   @BeforeClass
   public void launchBrowser() {
	  System.out.println("Enter The URL------->@BeforeClass"); 
	  
   }
  
   @BeforeMethod
   public void enterUrl() {
	   System.out.println("Login into Application-------->@BeforeMethod");
   }
 
   
   //Conditions or Test Region--@Test
 @Test
 public void verifyUsernameTest() {
	 System.out.println("Please Verify Username----->@Test");
 }
 
 //Post Conditions-@After
 
 @AfterMethod
 public void logOutFromApplication() {
	 System.out.println("Logout From the Application---->@AfterMethod");
	 
 }
 @AfterTest
 public void deleteAllCookies() {
	 System.out.println("Deleting All Cookies--->@AfterTest");
 }
 @AfterClass
 public void closeBrowser() {
	 System.out.println("Closing the Browser----->@AfterClass");
	 
 }
 @AfterSuite
 public void generateTestReports() {
	 System.out.println("Generating Test Reports--->@AfterSuite");
 }
}
