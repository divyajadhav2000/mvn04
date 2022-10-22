package StepDefi;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.cucumber.java.en.Given;

public class globalvalidate {
	 WebDriver driver;
	
	@Given("^user navigate to globalsqa site$")
	public void user_navigate_to_site()throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\jadha\\Downloads\\chromedriver_3\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(3000));
		driver.get("https://www.globalsqa.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		driver.manage().window().maximize();
		
	}
	@Given("^user clicks on \"([^\"]*)\" button in \"([^\"]*)\" page$")
	public void user_clicks_on_locator(String element,String page) throws IOException, InterruptedException {
		
			File elefile = new File("C:\\Users\\jadha\\eclipse-workspace\\Maven\\MVNPractice1\\mvn04\\src\\main\\java\\StepDefi\\"+page+".properties");
			FileInputStream filein = new FileInputStream(elefile);
			Properties prop = new Properties();
			prop.load(filein);
			System.out.println("driver status is"+driver.toString());
		
			Actions ac = new Actions(driver);
			ac.moveToElement(driver.findElement(By.xpath(prop.getProperty(element)))).build().perform();
			//driver.findElement(By.xpath(prop.getProperty(element))).click();
			JavascriptExecutor js =((JavascriptExecutor)driver);
			js.executeScript("arguments[0].click()",driver.findElement(By.xpath(prop.getProperty(element))) );
	 
					  
	}
	
	@Given("^user validates \"([^\"]*)\" on \"([^\"]*)\" page$")
	public void user_validates_text(String element,String page) throws IOException, InterruptedException {
		
		if(driver.findElement(By.xpath("//*[contains(text(),'"+element+"')]")).isDisplayed())
		{
			System.out.println("text is validated");
			//for highlighting element
			for(int i=0;i<3;i++) {
				JavascriptExecutor jse =(JavascriptExecutor)driver;
				jse.executeScript("arguments[0].setAttribute('style','background: yellow; border: 2px solid red;');",driver.findElement(By.xpath("//*[contains(text(),'"+element+"')]")));
				Thread.sleep(1000);
				jse.executeScript("arguments[0].setAttribute('style','background: ; border: ');",driver.findElement(By.xpath("//*[contains(text(),'"+element+"')]")));			
				}
				Thread.sleep(1000);
				
		}else {
			System.out.println("unable to validate text");

		}	
	}
	@Given("^user validates text \"([^\"]*)\" on \"([^\"]*)\" page$")
	public void user_validate_text(String element,String page) throws IOException, InterruptedException {
		if(driver.findElement(By.xpath("//div[@class=\"single_tab_div resp-tab-content resp-tab-content-active\"]//td[text()='"+element+"']")).isDisplayed())
		{
			System.out.println("text is validated");
			//for highlighting element
			for(int i=0;i<3;i++) {
				JavascriptExecutor jse =(JavascriptExecutor)driver;
				jse.executeScript("arguments[0].setAttribute('style','background: yellow; border: 2px solid red;');",driver.findElement(By.xpath("//div[@class=\"single_tab_div resp-tab-content resp-tab-content-active\"]//td[text()='"+element+"']")));
				Thread.sleep(1000);
				jse.executeScript("arguments[0].setAttribute('style','background: ; border: ');",driver.findElement(By.xpath("//div[@class=\"single_tab_div resp-tab-content resp-tab-content-active\"]//td[text()='"+element+"']")));			
				}
				Thread.sleep(1000);
				
		}else {
			System.out.println("unable to validate text");

		}	
	}
	
	@Given("^user validates text \"([^\"]*)\" in element \"([^\"]*)\" on \"([^\"]*)\" page$")
	public void user_validate_element(String text,String element,String page) throws InterruptedException, IOException {
		File elefile1 = new File("C:\\Users\\jadha\\eclipse-workspace\\Maven\\MVNPractice1\\mvn04\\src\\main\\java\\StepDefi\\"+page+".properties");
		FileInputStream filein1 = new FileInputStream(elefile1);
		Properties prop1 = new Properties();
		prop1.load(filein1);
		if(driver.findElement(By.xpath(prop1.getProperty(element))).isDisplayed())
		{
			System.out.println("text is validated");
			//for highlighting element
			for(int i=0;i<3;i++) {
				JavascriptExecutor jse =(JavascriptExecutor)driver;
				jse.executeScript("arguments[0].setAttribute('style','background: yellow; border: 2px solid red;');",driver.findElement(By.xpath(prop1.getProperty(element))));
				Thread.sleep(1000);
				jse.executeScript("arguments[0].setAttribute('style','background: ; border: ');",driver.findElement(By.xpath(prop1.getProperty(element))));			
				}
				Thread.sleep(1000);
				
		}else {
			System.out.println("unable to validate text");
		}
	}
	
	@Given("^move towards element \"([^\"]*)\"in page \"([^\"]*)\"$")
	 public void move_towards_element(String element,String page) throws IOException, InterruptedException{
		File elefile2 = new File("C:\\Users\\jadha\\eclipse-workspace\\Maven\\MVNPractice1\\mvn04\\src\\main\\java\\StepDefi\\"+page+".properties");
		FileInputStream filein2 = new FileInputStream(elefile2);
		Properties prop2 = new Properties();
		prop2.load(filein2);
		Actions ac = new Actions(driver);
		ac.moveToElement(driver.findElement(By.xpath(prop2.getProperty(element)))).build().perform();
		Thread.sleep(3000);
	}


	@Given("^close broswer1$")
	public void close_broswer1(){
		driver.close();
		System.out.println("browser closed");
	}
	
	
}
