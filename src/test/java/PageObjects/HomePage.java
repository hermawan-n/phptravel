package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
    WebDriver driver;
    WebElement btn_account;
    WebElement btn_loginPage;
    WebElement btn_hotelPage;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void selectLogin() {
        btn_account = driver.findElement(By.id("ACCOUNT"));
        btn_loginPage = driver.findElement(By.xpath("//*[text()='Customer Login']"));
        btn_account.click();
        btn_loginPage.click();
    }

    public void goTo_HotelPage() {
        btn_hotelPage = driver
                .findElement(By.xpath("//a[text()='Hotels']"));
        btn_hotelPage.click();
    }
}
