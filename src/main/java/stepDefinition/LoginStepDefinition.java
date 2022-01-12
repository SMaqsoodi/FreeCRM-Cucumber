package stepDefinition;

import org.junit.Assert;
import org.openqa.selenium.By;
//import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
//import junit.framework.Assert;


public class LoginStepDefinition {

	WebDriver driver;
	
	@Given("^user is already on login page$")
	public void user_is_already_on_login_page() {
		System.setProperty("webdriver.chrome.driver", "/home/saeed/Downloads/chromedriver_linux64/chromedriver");
		driver = new ChromeDriver();
		driver.get("https://classic.freecrm.com/index.html");
	}
	
	@When("^title of login page is Free CRM$")
	public void title_of_login_page_is_Free_CRM() {
		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertEquals("Free CRM - CRM software for customer relationship management, sales, and support.", title);
	}
	
	@Then("^user enters unsername and password$")
	public void user_enters_username_and_password() {
		driver.findElement(By.name("username")).sendKeys("SMaqsoodi");
		driver.findElement(By.name("password")).sendKeys("Sudn@1357");
	}
	
	@Then("^user clicks on login button$")
	public void user_clicks_on_login_button() {
		driver.findElement(By.xpath("//input[@type='submit']")).click();
	}
	
// in case click on login buttion method didn't work with click method we can use JavaScript executer alternatively
//	@Then("^user clicks on login button")
//	public void user_clicks_on_login_button() {
//		WebElement loginButton = driver.findElement(By.xpath("//input[@type='submit']"));
//		JavascriptExecutor js = (JavascriptExecutor)driver;
//		js.executeScript("arguments[0].click", loginButton);
//	}
	
	@Then("^user is on home page$")
	public void user_is_on_home_page() {
		String homePageTitle = driver.getTitle();
		System.out.println("home page title is: " + homePageTitle);
		Assert.assertEquals("CRMPRO123", homePageTitle);
	}
	
	@Then("^close the browser$")
	public void close_the_browser() {
		driver.quit();
	}
}
