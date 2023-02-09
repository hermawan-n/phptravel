package PageObjects;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Driver.Driver;

public class HomePage {
    WebDriver driver = Driver.getDriver();
    WebElement btn_account;
    WebElement btn_loginPage;
    WebElement btn_hotelPage;

    public void selectLogin() {
        btn_account = driver.findElement(By.id("ACCOUNT"));
        btn_loginPage = driver.findElement(By.xpath("//a[text()='Customer Login']"));
        btn_account.click();
        btn_loginPage.click();
    }

    public void goTo_Page(String page) {
        page = page.toLowerCase();
        btn_hotelPage = driver
                .findElement(By.xpath("//a[@title='" + page + "']"));
        btn_hotelPage.click();
    }

}
