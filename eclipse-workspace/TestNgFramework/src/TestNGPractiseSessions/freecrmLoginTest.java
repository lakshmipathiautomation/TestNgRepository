package TestNGPractiseSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
public class freecrmLoginTest {
WebDriver driver;
@BeforeMethod
public void setup() {
	System.setProperty("webdriver.chrome.driver", "D://chromedriver_win32//chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	driver.get("https://ui.freecrm.com/");

}
@Test(invocationCount=3)
public void loginPageTest() throws InterruptedException {
	driver.findElement(By.xpath("//body/div[@id='ui']/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/input[1]")).sendKeys("lakshmipathimunna@gmail.com");
	driver.findElement(By.xpath("//body/div[@id='ui']/div[1]/div[1]/form[1]/div[1]/div[2]/div[1]/input[1]")).sendKeys("Munna@1995");
	driver.findElement(By.xpath("//body/div[@id='ui']/div[1]/div[1]/form[1]/div[1]/div[3]")).click();
	String title = driver.getTitle();
	System.out.println(title);
	boolean b = driver.findElement(By.xpath("//span[contains(text(),'lakshmipathi kantipalli')]")).isDisplayed();
	System.out.println(b);
	System.out.println(driver.findElement(By.xpath("//a[contains(text(),'kantipalli cogMento lakshmipathi')]")).isDisplayed());
	Actions actions = new Actions(driver);
	WebElement element = driver.findElement(By.xpath("//body/div[@id='ui']/div[1]/div[1]/div[3]/a[1]/i[1]"));
	Thread.sleep(5000);
	actions.moveToElement(element).build().perform();
	Thread.sleep(5000);
	driver.findElement(By.xpath("//body/div[@id='ui']/div[1]/div[1]/div[3]/button[1]/i[1]")).click();
	Thread.sleep(5000);
	driver.findElement(By.xpath("//div[@id='dashboard-toolbar']")).click();
	driver.findElement(By.name("first_name")).sendKeys("kantipalli");
	driver.findElement(By.name("last_name")).sendKeys("lakshmipathi");
	driver.findElement(By.name("middle_name")).sendKeys("cogMento");
	Thread.sleep(5000);
	driver.findElement(By.xpath("//body/div[@id='ui']/div[1]/div[2]/div[2]/div[1]/div[2]/form[1]/div[3]/div[1]/div[1]/div[1]/div[1]/button[1]")).click();
	Actions action1 = new Actions(driver);
	action1.click(driver.findElement(By.xpath("//body/div[@id='ui']/div[1]/div[2]/div[2]/div[1]/div[2]/form[1]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]")));
	action1.click(driver.findElement(By.xpath("//body/div[@id='ui']/div[1]/div[2]/div[2]/div[1]/div[2]/form[1]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/span[1]"))).click();
driver.findElement(By.xpath("//body/div[@id='ui']/div[1]/div[2]/div[2]/div[1]/div[2]/form[1]/div[5]/div[1]/div[1]/div[1]/i[1]")).click();
driver.findElement(By.xpath("//span[contains(text(),'On Hold')]")).click();
driver.findElement(By.xpath("//body/div[@id='ui']/div[1]/div[2]/div[2]/div[1]/div[2]/form[1]/div[8]/div[1]/div[1]/div[1]/input[1]")).sendKeys("Automation Test Engineer");
driver.findElement(By.xpath("//body/div[@id='ui']/div[1]/div[2]/div[2]/div[1]/div[2]/form[1]/div[8]/div[2]/div[1]/div[1]/input[1]")).sendKeys("QA automation");
driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/form[1]/div[11]/div[1]/div[1]/div[1]/label[1]")).click();
driver.findElement(By.name("day")).sendKeys("24");
driver.findElement(By.name("month")).click();
driver.findElement(By.xpath("//span[@class='text' and contains(text(),'April')]")).click();
driver.findElement(By.name("year")).sendKeys("1997");
Thread.sleep(4000);
driver.findElement(By.xpath("//body/div[@id='ui']/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/button[2]")).click();
Thread.sleep(10000);

}


@AfterMethod
public void closingBrowser() {
	driver.quit();
}
}
