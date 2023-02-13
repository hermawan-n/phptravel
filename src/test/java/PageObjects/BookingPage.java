package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import Driver.Driver;
import Utilities.Utilities;

public class BookingPage {
    WebDriver driver = Driver.getDriver();
    Utilities util = new Utilities();

    By btn_confirmBooking = By.id("booking");

    public void selectTitle(String title) {
        util.findSelectwithName("title_1").selectByVisibleText(title);
    }

    public void fillPersonalInformationTextBox(String txtBox, String keys) {
        WebElement txtBoxElement = driver
                .findElement(By.xpath("//div[@class='input-box']/div/input[@placeholder='" + txtBox + "']"));
        txtBoxElement.sendKeys(keys);
    }

    public void selectDropdownPersonalInformationxpath(String dropdownName, String option) {
        dropdownName = dropdownName.toLowerCase();
        WebElement dropdown = driver
                .findElement(By.xpath(
                        "//select[@class='form-select select_ " + dropdownName + " select2-hidden-accessible']"));
        Select select = new Select(dropdown);

        select.selectByVisibleText(option);
    }

    public void fillTravellerInformationTextBox(String traveller, String txtBox, String keys) {
        WebElement txtBoxElement = driver.findElement(By.xpath("//div[@class='card-header'][normalize-space(.)='"
                + traveller + "']/../div/div/div/input[@placeholder='" + txtBox + "']"));
        txtBoxElement.sendKeys(keys);
    }

    public void selectDropdownTravellerInformationDOB(String traveller, String dropdownName, String option) {
        if (dropdownName.equals("Month")) {
            dropdownName = "Date of Birth";
        }
        WebElement dropdown = driver
                .findElement(By.xpath("//div[@class='card-header'][normalize-space(.)='" + traveller
                        + "']/../div/div/div/div/div/label[text()='Date of Birth']/../../div/label[text()='"
                        + dropdownName + "']/../select"));
        Select select = new Select(dropdown);

        select.selectByVisibleText(option);
    }

    public void selectDropdownTravellerInformationPID(String traveller, String dropdownName, String option) {
        if (dropdownName.equals("Month")) {
            dropdownName = "Passport Issuance Date";
        }
        WebElement dropdown = driver
                .findElement(By.xpath("//div[@class='card-header'][normalize-space(.)='" + traveller
                        + "']/../div/div/div/div/div/label[text()='Passport Issuance Date']/../../div/label[text()='"
                        + dropdownName + "']/../select"));
        Select select = new Select(dropdown);

        select.selectByVisibleText(option);
    }

    public void selectDropdownTravellerInformationPED(String traveller, String dropdownName, String option) {
        if (dropdownName.equals("Month")) {
            dropdownName = "Passport Expiry Date";
        }
        WebElement dropdown = driver
                .findElement(By.xpath("//div[@class='card-header'][normalize-space(.)='" + traveller
                        + "']/../div/div/div/div/div/label[text()='Passport Expiry Date']/../../div/label[text()='"
                        + dropdownName + "']/../select"));
        Select select = new Select(dropdown);

        select.selectByVisibleText(option);
    }

    public void selectDropdownTravellerInformationTitleAndNationality(String traveller, String dropdownName,
            String option) {
        WebElement dropdown = driver
                .findElement(By.xpath("//div[@class='card-header'][normalize-space(.)='" + traveller
                        + "']/../div/div/div/label[text()='" + dropdownName + "']/../select"));
        Select select = new Select(dropdown);

        select.selectByVisibleText(option);
    }

    public void choosePaymentMethod(String paymentMethod) {
        paymentMethod = paymentMethod.toLowerCase();
        paymentMethod = paymentMethod.replace(" ", "-");

        WebElement radioPayment = driver
                .findElement(By.xpath("//input[@type='radio'][@value='" + paymentMethod +
                        "']"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].checked = true;", radioPayment);
    }

    public void agreeTnS() {
        WebElement comboBox = driver.findElement(By.id("agreechb"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].checked = true;", comboBox);
    }

    public void click_confirmBooking() {
        driver.findElement(btn_confirmBooking).submit();
    }
}
