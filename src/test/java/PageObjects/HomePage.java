package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
    WebDriver driver;
    WebElement btn_account;
    WebElement btn_loginPage;

    public HomePage(WebDriver driver){
        this.driver = driver;
    }
    
    public void selectLogin() {
        btn_account = driver.findElement(By.id("ACCOUNT"));
        btn_loginPage = driver.findElement(By.xpath("//*[text()='Customer Login']"));
        btn_account.click();
        btn_loginPage.click();
    }
}
