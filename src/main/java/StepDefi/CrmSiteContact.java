package StepDefi;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.cucumber.java.en.Given;

public class CrmSiteContact {
public WebDriver driver;
	utility u1 = new utility();

	@Given("^User login on CRM site$")
	public void User_login_on_CRM_site()throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\jadha\\Downloads\\chromedriver_win32 _2\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
		driver.get("https://ui.in.freecrm.com/calendar");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(300));
		driver.manage().window().maximize();
		Thread.sleep(10000);
		
		driver.findElement(By.xpath("//input[@name=\"email\"]")).sendKeys("jadhavdivya46568@gmail.com");
		driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys("Dj12345!");
		driver.findElement(By.xpath("//div[text()='Login']")).click();
	}

	@Given("^user enters \"([^\"]*)\" in \"([^\"]*)\" field in \"([^\"]*)\"$")
	 public void user_enters_firstname_in_fname(String value, String locator ,String page) throws IOException, InterruptedException{
		locator=u1.util(locator, page);

		//for highlighting element
		for(int i=0;i<3;i++) {
			JavascriptExecutor jse =(JavascriptExecutor)driver;
			jse.executeScript("arguments[0].setAttribute('style','background: yellow; border: 2px solid red;');",driver.findElement(By.xpath(locator)));
			Thread.sleep(2000);
			jse.executeScript("arguments[0].setAttribute('style','background: ; border: ');",driver.findElement(By.xpath(locator)));			
			}
			Thread.sleep(3000);
		
		driver.findElement(By.xpath(locator)).sendKeys(value);
	}
	
	
	@Given("^user clicks on \"([^\"]*)\" in \"([^\"]*)\"$")
	 public void user_click_on_locator(String locator,String page) throws IOException, InterruptedException{
		
		locator=u1.util(locator, page);
			
		//for highlighting element
		for(int i=0;i<3;i++) {
			JavascriptExecutor jse =(JavascriptExecutor)driver;
			jse.executeScript("arguments[0].setAttribute('style','background: yellow; border: 2px solid red;');",driver.findElement(By.xpath((locator))));
			Thread.sleep(2000);
			jse.executeScript("arguments[0].setAttribute('style','background: ; border: ');",driver.findElement(By.xpath(locator)));			
		}
		Thread.sleep(3000);
		//driver.findElement(By.xpath(prop.getProperty(locator))).click();
		JavascriptExecutor js =((JavascriptExecutor)driver);
		js.executeScript("arguments[0].click()",driver.findElement(By.xpath(locator)) );
	
	}
	
	
	@Given("^move towards \"([^\"]*)\" in \"([^\"]*)\"$")
	 public void move_towards_element(String locator,String page) throws IOException, InterruptedException{
		locator=u1.util(locator, page);

		Actions ac = new Actions(driver);
		ac.moveToElement(driver.findElement(By.xpath(locator))).build().perform();
		Thread.sleep(3000);
	}
	
	
/*	@Given("^highlight \"([^\"]*)\"$")
	public void highlight(String element) throws IOException, InterruptedException {
		File elefile = new File("C:\\Users\\jadha\\eclipse-workspace\\Maven\\MVNPractice1\\mvn04\\src\\main\\java\\locator.properties");
		FileInputStream filein = new FileInputStream(elefile);
		Properties prop = new Properties();
		prop.load(filein);
		for(int i=0;i<3;i++) {
			JavascriptExecutor jse =(JavascriptExecutor)driver;
			jse.executeScript("arguments[0].setAttribute('style','background: yellow; border: 2px solid red;');",driver.findElement(By.xpath(prop.getProperty(element))));
			Thread.sleep(2000);
			jse.executeScript("arguments[0].setAttribute('style','background: ; border: ');",	driver.findElement(By.xpath(prop.getProperty(element))));	
		}
	}
*/	
	
	@Given("^close broswer$")
	public void close_broswer(){
		driver.close();
		System.out.println("browser closed");
	}

}	
	
	
