package test.stepdefinition;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import OrangeHRM.LoginClass;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Loginstepdefinition {
/*	static WebDriver driver;
	
	
	@Given("User open url and on login page login")
	public void user_open_url_and_on_login_page_login() {
	   driver = new ChromeDriver();
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	   driver.get("https://www.saucedemo.com/v1/");
	}

	//@When("User enters valid username and password")
	//public void user_enters_valid_username_and_password() {
	@When("User enters valid {string} and {string}")
	public void user_enters_valid_and(String username, String password) throws InterruptedException {
		
		driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys(username);
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys(password);
		Thread.sleep(1000);
		
	}

	@And("Clicks on login Button")
	public void clicks_on_login_button() {
	
		driver.findElement(By.xpath("//input[@id='login-button']")).click();
	}	

	@Then("User should navigate to home page")
	public void user_should_navigate_to_home_page() {
	
		Assert.assertTrue(driver.findElements(By.xpath("//div[@class='app_logo']")).size()>0,"user is navigated to Home page");
	}

	@And("Close the browser")
	public void close_the_browser() throws InterruptedException {
		Thread.sleep(2000);
		driver.quit();
	}

*/
}
