package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Driver.Driver;

public class DashboardPage {
    WebDriver driver = Driver.getDriver();

    public void goTo_ProfilePage() {
        driver.findElement(By.partialLinkText("Profile")).click();
    }
}
