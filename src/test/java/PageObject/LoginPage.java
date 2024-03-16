package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
WebDriver driver;
By txt_username = By.xpath("//input[@id='user-name']");
By txt_password = By.xpath("//input[@id='password']");
By btn_login = By.xpath("//input[@id='login-button']");
By lbl_logo = By.xpath("//div[@class='app_logo']");

public LoginPage(WebDriver driver) {
    this.driver = driver;
}


public void enterPassword(String password)
{
	driver.findElement(txt_password).sendKeys(password);
}
public void clickLogin()
{
	driver.findElement(btn_login).click();
}
public void isAppLogoDisplayed() {
	driver.findElement(lbl_logo).isDisplayed();
}
public void userLogin(String username, String password)
{
	driver.findElement(txt_username).sendKeys(username);
	driver.findElement(txt_password).sendKeys(password);
	driver.findElement(lbl_logo).click();

}
public void enterUsername(String username) {
	// TODO Auto-generated method stub
	driver.findElement(txt_username).sendKeys(username);
}

}
