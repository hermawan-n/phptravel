package PageObjects;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FlightPage {
    WebDriver driver;

    public FlightPage(WebDriver driver) {
        this.driver = driver;
    }

    public void chooseAirlines(String airlines) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement cardAirlines = wait.until(ExpectedConditions
                .presenceOfElementLocated(By.xpath("//h6[text()='" + airlines +
                        "']/../../../..")));
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].scrollIntoView(true);", cardAirlines);
        executor.executeScript("arguments[0].click();", cardAirlines);
    }

    public void chooseFlightID(String flightID) {
        WebElement cardFlightID = driver.findElement(
                By.xpath("//strong[text()='" + flightID + "']/../../../../../../../../../../../div[2]/div/button"));
        cardFlightID.click();
    }

}
