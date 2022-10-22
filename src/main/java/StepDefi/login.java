package StepDefi;

import java.time.Duration;

import org.junit.AfterClass;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;

public class login {
	public WebDriver driver;
	
	@Given("^User navigate to php page$")
	public void User_navigate_to_php_page()throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\jadha\\Downloads\\chromedriver_win32 _2\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
		driver.get("https://phptravels.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(300));
		driver.manage().window().maximize();
		Thread.sleep(10000);
		System.out.println("php site navigate");
	}

		
	@Given("^go to demo page$")
	public void go_to_demo_page(){
			
			driver.findElement(By.xpath("//a[text()='Demo']")).click();
		
	}
	@Given("^user is on demo page$")
	 public void user_is_on_hopme_page(){
	 String title = driver.getTitle();
	 System.out.println("Demo Page title ::"+ title);
	 }
	
	@Given("^validate text	Instant Demo$")
	public void validate_Instant_Demo_text() throws InterruptedException {
			WebElement el =driver.findElement(By.xpath("//strong[text()='Instant Demo']"));
			if(driver.findElement(By.xpath("//strong[text()='Instant Demo']")).isDisplayed()) {
				System.out.println("Instant Demo text is validated");
				highlight(driver,el);
			}
			else{
				System.out.println("Instant Demo text is unable to validate");
			}
		}
	
	@Given("^user enters \"([^\"]*)\" in fname field$")
	 public void user_enters_firstname_in_fname(String fname) throws Exception{
		PassEncyDecry pd = new PassEncyDecry();
		fname = pd.decrypt(fname);
		System.out.println(fname +" decrypted fname");
		driver.findElement(By.xpath("//input[@name='first_name']")).sendKeys(fname);
	 }
	@Given("^user enters \"([^\"]*)\" in lname field$")
	 public void user_enters_firstname_in_lname(String lname) throws Exception{
		PassEncyDecry pd1 = new PassEncyDecry();
		lname = pd1.decrypt(lname);
		System.out.println(lname +" decrypted fname");
		driver.findElement(By.xpath("//input[@name='last_name']")).sendKeys(lname);
	 }
	@Given("^user enters \"([^\"]*)\" in Businessname field$")
	 public void user_enters_firstname_in_Businessname(String Bname){
		driver.findElement(By.xpath("//input[@name='business_name']")).sendKeys(Bname);
	 }
	@Given("^user enters \"([^\"]*)\" in email field$")
	 public void user_enters_firstname_in_email(String emailid) throws InterruptedException{
		driver.findElement(By.xpath("//input[@class='email input form-control form-group']")).sendKeys(emailid);
	Thread.sleep(3000); 
	}
	
	

	@Given("^This is a close broswer test$")
	public void this_is_a_close_broswer_test(){
		
		driver.close();
		System.out.println("browser closed");

	}
	
	
	
	public static void highlight(WebDriver driver,WebElement el) throws InterruptedException {
		for(int i=0;i<2;i++) {
		JavascriptExecutor jse =(JavascriptExecutor)driver;
		jse.executeScript("arguments[0].setAttribute('style','background: lime; border: 2px solid black;');",el );
		Thread.sleep(2000);
		jse.executeScript("arguments[0].setAttribute('style','background: ; border: ');",el );
		}
	}
}
