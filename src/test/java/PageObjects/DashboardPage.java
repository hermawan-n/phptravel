package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DashboardPage {
    WebDriver driver;

    public DashboardPage(WebDriver driver){
        this.driver = driver;
    }

    public void goTo_ProfilePage(){
        driver.findElement(By.linkText("My Profile")).click();
    }
}
