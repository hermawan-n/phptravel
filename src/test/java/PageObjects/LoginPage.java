package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class LoginPage {
    WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    By txt_email = By.name("email");
    By txt_password = By.name("password");
    By btn_login = RelativeLocator.with(By.tagName("button")).below(txt_password);

    public void login(String email, String password) {
        driver.findElement(txt_email).sendKeys(email);
        driver.findElement(txt_password).sendKeys(password + Keys.ENTER);
    }

    public void enter() {
        driver.findElement(btn_login).click();
    }
}
