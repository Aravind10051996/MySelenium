package OrangeHRM;


import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;



public class BaseClass {

	public WebDriver driver;
	public LoginClass loginclass;
    public String baseUrl = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";

    
	@BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();     
    }
	
	@Test
	public void loginpage() throws InterruptedException {
		// Navigate to the OrangeHRM login page
		driver.get(baseUrl);
		
		//Create WebDriverWait instance with timeout of 10 seconds
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
        
        // Wait until the element with the specified XPath is visible
        //WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div/h5[text()='Login']")));
        
       // wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='username']")));
        Thread.sleep(5000);
        // Create a Page Object for the login page
        LoginClass loginclass = new LoginClass(driver);
        
        loginclass.login ("admin",  "admin123");
    }
	
	
	@AfterMethod
	 public void tearDown() {
	        // Close the browser
	        driver.quit();
	 }
	
   
}

