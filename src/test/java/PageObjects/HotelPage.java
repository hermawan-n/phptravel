package PageObjects;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Driver.Driver;

public class HotelPage {
    WebDriver driver = Driver.getDriver();
    WebElement card_hotel;
    WebElement btn_chooseRoom;

    public void chooseHotel(String hotel) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement element = wait.until(ExpectedConditions
                .presenceOfElementLocated(By.xpath("//strong[text()='" + hotel + "']/../../../../div[1]/a")));
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].scrollIntoView(true);", element);
        element.click();
    }

    public void chooseRoom(String room) {
        btn_chooseRoom = driver.findElement(
                By.xpath("//strong[text()='" + room
                        + "']/../../div[@class='card-body']/div/div[2]/form/div/div[4]/div/div/button"));
        btn_chooseRoom.submit();
    }

    public void checkDisplay(String page) {
        WebElement element = driver
                .findElement(By.xpath("//a[@title='hotels']"));
        String fontWeight = element.getCssValue("font-weight");
        System.out.println(fontWeight);

        if (fontWeight.equals("bold") || Integer.parseInt(fontWeight) >= 700) {
            System.out.println("The text is displayed in bold.");
        } else {
            System.out.println("The text is not displayed in bold.");
            Assert.fail("The elements have different values. Test failed.");
        }
    }
}
