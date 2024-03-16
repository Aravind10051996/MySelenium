package OrangeHRM;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginClass extends BaseClass {
	
	 protected WebDriver driver;

	    // Locators
	    private By usernameField = By.xpath("//input[@name='username']");
	    private By passwordField = By.xpath("//input[@name='password']");
	    public By loginButton = By.xpath("//button[@type='submit']");

	    public LoginClass(WebDriver driver) {
	    	this.driver = driver;
		}

	    
		public void login(String username, String password) {
			
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	    	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='username']")));

	        WebElement usernameInput = driver.findElement(usernameField);
	        WebElement passwordInput = driver.findElement(passwordField);
	        WebElement loginBtn = driver.findElement(loginButton);

	        usernameInput.sendKeys(username);
	        passwordInput.sendKeys(password);
	        loginBtn.click();
		}
	
}

