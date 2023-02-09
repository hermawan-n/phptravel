package Utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import Driver.Driver;

public class Utilities {
    WebDriver driver = Driver.getDriver();

    public WebElement findTxtByName(String name) {
        By txt_byName = By.name(name);
        WebElement txt = driver.findElement(txt_byName);

        return txt;
    }

    public Select findSelectwithName(String text) {
        WebElement dropdown = driver.findElement(By.name(text));
        Select select = new Select(dropdown);
        
        return select;
    }
}
